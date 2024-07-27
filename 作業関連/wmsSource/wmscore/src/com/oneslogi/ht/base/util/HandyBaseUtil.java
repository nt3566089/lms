package com.oneslogi.ht.base.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.BMessageCB;
import com.oneslogi.base.dbflute.exbhv.BMessageBhv;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.resources.AuthenticationBaseResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.AbstractWmsHtBase;
import com.oneslogi.ht.base.cdi.annotation.HandyUtil;
import com.oneslogi.ht.base.dto.HandyCommonDialogDto;
import com.oneslogi.ht.base.dto.HandyFooterButtonDto;
import com.oneslogi.ht.base.dto.HandyFooterdDto;
import com.oneslogi.ht.base.dto.HandyHeaderDto;
import com.oneslogi.ht.base.dto.HandyTagHintDto;
import com.oneslogi.ht.base.dto.HandyViewTemplateDto;
import com.oneslogi.ht.base.dto.HywayDefaultParamDto;

@HandyUtil
public class HandyBaseUtil extends AbstractWmsHtBase {

	// ===== 定数 =====

	private static final String HALF_SPACE = " ";

	// 表示領域定義用
	private static final String AREA_NAME_LEFT = "areaLeft";
	private static final String AREA_NAME_RIGHT = "areaRight";
	private static final String AREA_NAME_OPTION1 = "areaOption1";
	private static final String AREA_NAME_OPTION2 = "areaOption2";
	private static final String AREA_NAME_HIDE = "areaHide";

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana Start
	private static final String VIEW_TEMPLETE_PROPERTIES = "handyViewTemplate";
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana End

	private static final String KEY_SEND_ERROR_DIALOG_FLG = "sendErrorDialogFlg";
	private static final String KEY_BACKUP_NEXT_VIEW_TEMPLATE_FORCE_SETTING = "backupNextViewTemplateForceSetting";

	private static int lineMaxLength = 20;
	private static boolean autoLineFeed = true;
	private static boolean paddingTitleSpace = true;
	private static boolean titleCentering = true;

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana Start
	private static String defaultTextColor = "#555555";
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana End

	// ===== 使用テーブル =====

	@Inject
	private BMessageBhv messageBhv;

	// ===== ローカル変数 =====

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana Start

	/** メッセージ(キャッシュ)マップ */
	private static Map<MessageKey, String> messageNmMap = new HashMap<MessageKey, String>();

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana End

	static {
		Properties properties = new Properties();
		InputStream is = AuthenticationBaseResource.class.getClassLoader().getResourceAsStream("handy.properties");

		try {
			properties.load(is);
			is.close();

			lineMaxLength = Integer.parseInt(properties.getProperty("lineMaxLength", "20"));
			autoLineFeed = Boolean.parseBoolean(properties.getProperty("autoLineFeed", "true"));
			paddingTitleSpace = Boolean.parseBoolean(properties.getProperty("paddingTitleSpace", "true"));
			titleCentering = Boolean.parseBoolean(properties.getProperty("titleCentering", "true"));
			// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana Start
			defaultTextColor = properties.getProperty("fgcolor", "#555555");
			// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana End

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana Start

	/**
	 * キャッシュのクリア
	 */
	public static void splash() {
		messageNmMap = new HashMap<MessageKey, String>();
	}

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana End

	/**
	 * ブラウザからのデフォルトパラメータを取得します。
	 * @return HywayDefaultParamDto デフォルトパラメータを格納するDTO
	 */
	public HywayDefaultParamDto getHywayParam() {
		HywayDefaultParamDto retDto = new HywayDefaultParamDto();
		retDto.setUniquePacketId(getHttpServletRequest().getParameter("_ri"));
		retDto.setHtLocalId(getHttpServletRequest().getParameter("_ui"));
		retDto.setHtUniqueId(getHttpServletRequest().getParameter("_si"));
		retDto.setGroupId(getHttpServletRequest().getParameter("_gi"));
		retDto.setBrowserVersion(getHttpServletRequest().getParameter("_cv"));
		retDto.setPrintResult(getHttpServletRequest().getParameter("_pr"));
		retDto.setHtLang(getHttpServletRequest().getParameter("_cp"));
		return retDto;
	}

	/**
	 * ブラウザからのデフォルトパラメータを取得します。
	 * @param ses HttpSessionオブジェクト
	 * @return HywayDefaultParamDto デフォルトパラメータを格納するDTO
	 */
	public HywayDefaultParamDto getHywayParam(HttpSession ses) {
		HywayDefaultParamDto retDto = (HywayDefaultParamDto) ses.getAttribute("defDto");
		return retDto;
	}

	/**
	 * ブラウザからのデフォルトパラメータから、HT端末のMacアドレスを取得します。
	 * @param ses HttpSessionオブジェクト
	 * @return String MACアドレス
	 */
	public String getMacAddress(HttpSession ses) {
		HywayDefaultParamDto defDto = getHywayParam(ses);
		if (defDto == null || defDto.getHtUniqueId() == null || defDto.getHtUniqueId().trim().length() < 1) {
			defDto = getHywayParam();
		}
		return defDto.getHtUniqueId();

	}

	/**
	 * ヘッダー部のテキストおよび背景色を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param text ヘッダに設定する文字列
	 * @param color ヘッダの背景色
	 */
	public void setHeaderTextAndColor(HttpSession ses, String text, String color) {
		HandyHeaderDto headerDto = (HandyHeaderDto) ses.getAttribute("handyHeader");
		if (headerDto == null) {
			headerDto = new HandyHeaderDto();
		}
		headerDto.setHeaderColor(color);
		headerDto.setHeaderTextColor(defaultTextColor);
		headerDto.setHeaderText(fillString(text));
		ses.setAttribute("handyHeader", headerDto);
	}

	/**
	 * ヘッダー部のテキストおよび背景色を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param text ヘッダに設定する文字列
	 * @param color ヘッダの背景色
	 */
	public void setHeaderTextAndColor(HttpSession ses, String text, String textColor, String color) {
		HandyHeaderDto headerDto = (HandyHeaderDto) ses.getAttribute("handyHeader");
		if (headerDto == null) {
			headerDto = new HandyHeaderDto();
		}
		headerDto.setHeaderColor(color);
		headerDto.setHeaderTextColor(textColor);
		headerDto.setHeaderText(fillString(text));
		ses.setAttribute("handyHeader", headerDto);
	}

	/**
	 * フッタ部のボタンをクリアします。
	 * @param ses HttpSessionオブジェクト
	 */
	public void clearFooterButton(HttpSession ses) {
		ses.setAttribute("footer", null);
	}

	/**
	 * ヘッダテキスト位置調整用文字列生成
	 * @param text ヘッダテキスト
	 * @return 編集後ヘッダテキスト
	 */
	private String fillString(String text) {

		if (!paddingTitleSpace) {
			return text;
		}

		int orgLen = getHeaderStringLength(text);

		if (orgLen >= lineMaxLength) {
			return text;

		} else {
			String retText = text;
			int i = 0;

			while (orgLen + i < lineMaxLength) {

				if (orgLen + i + 1 == lineMaxLength) {
					// 残り1桁の場合は後ろに追加
					retText = retText + HALF_SPACE;
				} else if (titleCentering) {
					// センタリング
					retText = HALF_SPACE + retText + HALF_SPACE;
				} else {
					// 左寄せ
					retText = retText + HALF_SPACE + HALF_SPACE;
				}

				i = i + 2;
			}

			return retText;
		}

	}

	/**
	 * ヘッダテキストの文字数（半角換算）を導出する
	 */
	private int getHeaderStringLength(String text) {
		int retLen = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if ((c <= '\u007e') || (c == '\u00a5') || (c == '\u203e') || (c >= '\uff61' && c <= '\uff9f')) {
				//半角
				retLen = retLen + 1;
			} else {
				//全角
				retLen = retLen + 2;
			}
		}
		return retLen;
	}

	/**
	 * 文字列を設定ファイルに指定されたバイト長で改行します。
	 * @param orgText 分割したい文字列
	 * @return 改行コードを埋め込んだ文字列
	 */
	public String splitText(String orgText) {
		if (autoLineFeed) {
			return splitText(orgText, lineMaxLength);
		}
		return orgText;
	}

	/**
	 * 文字列を指定されたバイト長で改行します。
	 * @param orgText 分割したい文字列
	 * @param len バイト長
	 * @return 改行コードを埋め込んだ文字列
	 */
	public String splitText(String orgText, int len) {

		// [#3353] 致命的エラー発生時にアプリケーション例外発生 2018.01.19 kawana Start
		if (CU.isNullOrEmpty(orgText)) {
			return orgText;
		}
		// [#3353] 致命的エラー発生時にアプリケーション例外発生 2018.01.19 kawana End

		String retStr = orgText;
		StringBuffer buf = new StringBuffer();

		int count = 0;

		for (int i = 0; i < retStr.length(); i++) {

			String tmpStr = retStr.substring(i, i + 1);

			if (tmpStr.equals("\r") || tmpStr.equals("\n")) {
				//改行コード反映
				buf.append(tmpStr);

				count = 0;

			} else if (count + getHeaderStringLength(tmpStr) > len) {
				//改行コード挿入
				buf.append("\n");
				buf.append(tmpStr);

				count = getHeaderStringLength(tmpStr);

			} else {
				buf.append(tmpStr);

				count += getHeaderStringLength(tmpStr);
			}

		}

		return buf.toString();
	}

	/**
	 * <h2>ログイン関連情報以外のセッション情報をクリア</h2>
	 * <pre>
	 * </pre>
	 * @param ses セッション
	 */
	public void clearSession(HttpSession ses) {
		//ログイン関連情報以外のセッション情報をクリア
		Enumeration<String> sessionNames = ses.getAttributeNames();
		while (sessionNames.hasMoreElements()) {
			String tmpSesName = sessionNames.nextElement();
			if (!tmpSesName.contains("org.jboss.weld") &&
					!tmpSesName.equals(AuthenticationBaseResource.TOKEN_QUERY_STRING_KEY) &&
					!tmpSesName.equals("lastTokenCheckDate") &&
					!tmpSesName.equals("loginInfo") &&
					!tmpSesName.equals("loginUserCd") &&
					!tmpSesName.equals("defDto") &&
					!tmpSesName.equals("footer") &&
					!tmpSesName.equals("handyHeader") &&
					!tmpSesName.equals("handyMessage") &&
					!tmpSesName.equals("handyScreen") &&
					//[ON推]HT OCR文字認識の対応 2016.07.04 chou Add Start
					!tmpSesName.equals("isOcrFlg") &&
					!tmpSesName.equals("lotProperty") &&
					//[ON推]HT OCR文字認識の対応 2016.07.04 chou Add End
					// [#1839] HTシリアル入力方式 OCR文字認識の対応 2017.6.2 nayzaw Add Start
					!tmpSesName.equals("serialProperty") &&
					// [#1839] HTシリアル入力方式 OCR文字認識の対応 2017.6.2 nayzaw Add End
					!tmpSesName.equals("lstHandyMenuDto") &&
					!tmpSesName.equals("lstHandyGrpMenuDto")) {
				ses.removeAttribute(tmpSesName);
			}
		}
	}

	public String getTransURL(HttpSession ses) {
		return (String) ses.getAttribute("transURL");
	}

	public void setTransURL(String transURL, HttpSession ses) {
		ses.setAttribute("transURL", transURL);
	}

	/**
	 * 非公開メソッド
	 * フッター部のボタンの設定DTOの新しいオブジェクトを生成し、プロパティファイルから取得できる
	 * 値を設定したうえで返却します。
	 * 画面CDの設定があった場合、キーの最上位レベルを画面CDとみなして値の取得を行い、キーがなければ共通項目の値を取得します。
	 * @param areaName フッタのボタン表示領域を特定する文字列(rightButton,leftButton,optionButton1,optionButton2)
	 */
	private HandyFooterButtonDto getNewFooterButtonDtoDefault(String areaName) {

		HandyFooterButtonDto buttonDto = new HandyFooterButtonDto();

		if (areaName.equals(AREA_NAME_HIDE)) {
			buttonDto.setFunc("6");
		}

		return buttonDto;
	}

	/**
	 * フッター部のボタン(左側)を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param type ボタンタイプ
	 * @param key ハードキー
	 * @param url 遷移先Path
	 * @param text ボタンに表示する文字列
	 * @param 画面CD
	 */
	public void setFooterLeftButton(HttpSession ses, String type, String key, String url, String text) {
		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		HandyFooterButtonDto leftButton = getNewFooterButtonDtoDefault(AREA_NAME_LEFT);
		leftButton.setKey(key);
		leftButton.setType(type);
		leftButton.setUrl(url);
		leftButton.setValue(text);
		footerDto.setLeftButton(leftButton);
		ses.setAttribute("footer", footerDto);
	}

	/**
	 * フッター部のボタン(右側)を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param type ボタンタイプ
	 * @param key ハードキー
	 * @param url 遷移先Path
	 * @param text ボタンに表示する文字列
	 */
	public void setFooterRightButton(HttpSession ses, String type, String key, String url, String text) {
		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		List<HandyFooterButtonDto> rightButton = new ArrayList<HandyFooterButtonDto>();
		HandyFooterButtonDto tmpButton = getNewFooterButtonDtoDefault(AREA_NAME_RIGHT);
		tmpButton.setKey(key);
		tmpButton.setType(type);
		tmpButton.setUrl(url);
		tmpButton.setValue(text);
		rightButton.add(tmpButton);
		footerDto.setRightButton(rightButton);
		ses.setAttribute("footer", footerDto);
	}

	/**
	 * フッター部のボタン(左上)を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param type ボタンタイプ
	 * @param key ハードキー
	 * @param url 遷移先Path
	 * @param text ボタンに表示する文字列
	 * @param 画面CD
	 */
	public void setFooterOptionButton1(HttpSession ses, String type, String key, String url, String text) {
		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		HandyFooterButtonDto optionButton1 = getNewFooterButtonDtoDefault(AREA_NAME_OPTION1);
		optionButton1.setKey(key);
		optionButton1.setType(type);
		optionButton1.setUrl(url);
		optionButton1.setValue(text);
		footerDto.setOptionButton1(optionButton1);
		ses.setAttribute("footer", footerDto);
	}

	/**
	 * フッター部のボタン(右上)を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param type ボタンタイプ
	 * @param key ハードキー
	 * @param url 遷移先Path
	 * @param text ボタンに表示する文字列
	 * @param 画面CD
	 */
	public void setFooterOptionButton2(HttpSession ses, String type, String key, String url, String text) {
		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		HandyFooterButtonDto optionButton2 = getNewFooterButtonDtoDefault(AREA_NAME_OPTION2);
		optionButton2.setKey(key);
		optionButton2.setType(type);
		optionButton2.setUrl(url);
		optionButton2.setValue(text);
		footerDto.setOptionButton2(optionButton2);
		ses.setAttribute("footer", footerDto);
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.16 kawana Start

	/**
	 * フッター部のボタン(非表示)を設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param type ボタンタイプ
	 * @param key ハードキー
	 * @param url 遷移先Path
	 * @param 画面CD
	 * @param text ボタンに表示する文字列
	 */
	public void setFooterHideButton(HttpSession ses, String type, String key, String url, String func) {
		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		HandyFooterButtonDto hideButton = getNewFooterButtonDtoDefault(AREA_NAME_HIDE);

		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana Start

		if (func != null) {
			hideButton.setFunc(func);
		}

		if (!CU.nullToStr(hideButton.getFunc()).equals("6")) {
			hideButton.setKey(key);
		}

		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana End

		hideButton.setType(type);
		hideButton.setUrl(url);

		footerDto.setHideButton(hideButton);

		ses.setAttribute("footer", footerDto);
	}

	/**
	 * フッタ部のページボタンを設定します。
	 * @param ses HttpSessionオブジェクト
	 * @param forwardKey  前ページハードキー
	 * @param forwardType 前ページボタンタイプ
	 * @param forwardUrl  前ページ遷移先Path
	 * @param forwardText 前ページ表示文字列
	 * @param backKey     次ページハードキー
	 * @param backType    次ページボタンタイプ
	 * @param backRul     次ページ遷移先Path
	 * @param backText    次ページ表示文字列
	 */
	public void setFooterPageButton(HttpSession ses,
			String forwardKey, String forwardType, String forwardUrl, String forwardText,
			String backKey, String backType,  String backRul, String backText) {

		HandyFooterdDto footerDto = (HandyFooterdDto) ses.getAttribute("footer");
		if (footerDto == null) {
			footerDto = new HandyFooterdDto();
		}

		List<HandyFooterButtonDto> rightButton = new ArrayList<HandyFooterButtonDto>();
		//「前」ボタン設定
		HandyFooterButtonDto backButton = new HandyFooterButtonDto();
		backButton.setKey(forwardKey);
		backButton.setType(forwardType);
		backButton.setUrl(forwardUrl);
		backButton.setValue(forwardText);
		rightButton.add(backButton);
		//「次」ボタン設定
		HandyFooterButtonDto forwardButton = new HandyFooterButtonDto();
		forwardButton.setKey(backKey);
		forwardButton.setType(backType);
		forwardButton.setUrl(backRul);
		forwardButton.setValue(backText);
		rightButton.add(forwardButton);

		footerDto.setRightButton(rightButton);
		ses.setAttribute("footer", footerDto);
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.16 kawana End

	// [#4002][v3.0] 未使用の下記メソッドを削除 2018.05.10 kawana Delete
	// ・getNewFooterRightButtonDto
	// ・getNewFooterLeftButtonDto
	// ・getNewFooterHideButtonDto
	// ・getNewFooterOptionButton1Dto
	// ・getNewFooterOptionButton2Dto

	/**
	 * テンプレート管理DTOを返却します
	 * @return
	 */
	public HandyViewTemplateDto getViewTemplate() {
		return getViewTemplate(getHttpServletRequest());
	}

	/**
	 * テンプレート管理DTOを返却します
	 * @param req リクエスト
	 * @return
	 */
	public HandyViewTemplateDto getViewTemplate(HttpServletRequest req) {

		if (req.getAttribute("viewTemplate") == null) {
			// DTOを生成して、リクエストスコープに保存する。
			req.setAttribute("viewTemplate", new HandyViewTemplateDto());
		}

		HttpSession ses = req.getSession();
		if (ses.getAttribute("handyHeader") != null) {
			((HandyViewTemplateDto) req.getAttribute("viewTemplate")).setHeader((HandyHeaderDto) ses.getAttribute("handyHeader"));
		}

		return (HandyViewTemplateDto) req.getAttribute("viewTemplate");
	}

	public boolean existsViewTemplate() {
		HttpServletRequest req = getHttpServletRequest();
		if (req.getAttribute("viewTemplate") == null) {
			return false;
		}
		return true;
	}

	/**
	 * VIEWテンプレートの読み込みを行います。
	 * @param templateName テンプレート名称
	 * @param headText ヘッダに表示する文字列
	 */
	public void loadViewTemplate(String templateName, String headText) {
		loadViewTemplate(getHttpServletRequest(), templateName, headText);
	}

	/**
	 * VIEWテンプレートの読み込みを行います。
	 * @param req リクエスト
	 * @param templateName テンプレート名称
	 * @param headText ヘッダに表示する文字列
	 */
	public void loadViewTemplate(HttpServletRequest req, String templateName, String headText) {

		HttpSession ses = req.getSession();

		// このメソッドでは、dtoのインスタンスはgetViewTemplateから取得する。
		HandyViewTemplateDto dto = getViewTemplate(req);

		// プロパティから読み込んだ値をdtoにセット。
		fillAttributeHandyViewTemplateDto(
				dto,
				templateName,
				headText);

		// 前画面で設定された自画面向けのテンプレートの有無
		if (existsNextViewTemplateForceSetting(req)) {
			// 設定があれば、自画面向けのDTOにコピーする。
			HandyViewTemplateDto prvSettingDto = getNextViewTemplateForceSetting(req);
			dto.copyAttributes(prvSettingDto);
		}

		// ヘッダ情報関連をsessionにセット
		ses.setAttribute("handyHeader", dto.getHeader());

		setHeaderTextAndColor(
				ses,
				dto.getHeader().getHeaderText(),
				dto.getHeader().getHeaderTextColor(),
				dto.getHeader().getHeaderColor());
	}

	/**
	 * VIEWテンプレートの読み込みを行います。
	 * 自画面にはテンプレートはないが、前の画面で次画面向けとして指定があった場合を想定しています。
	 */
	public void loadViewTemplate() {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		// このメソッドでは、dtoのインスタンスはgetViewTemplateから取得する。
		HandyViewTemplateDto dto = getViewTemplate();

		// 前画面で設定された自画面向けのテンプレートの有無を判定
		if (existsNextViewTemplateForceSetting()) {
			// 設定があれば、自画面向けのDTOにコピーする。
			HandyViewTemplateDto prvSettingDto = getNextViewTemplateForceSetting();
			dto.copyAttributes(prvSettingDto);

			// ヘッダ情報関連をsessionにセット
			ses.setAttribute("handyHeader", dto.getHeader());
			setHeaderTextAndColor(
					ses,
					dto.getHeader().getHeaderText(),
					dto.getHeader().getHeaderTextColor(),
					dto.getHeader().getHeaderColor());
		}
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana Start

	/**
	 * VIEWテンプレートの読み込みを行います。
	 * @param req
	 * @param dto
	 * @param templateName
	 * @param headText
	 */
	private void fillAttributeHandyViewTemplateDto(HandyViewTemplateDto dto, String templateName, String headText) {

		dto.getHeader().setHeaderText(headText);

		// ヘッダの色
		if (containKeyTemplate(templateName + ".head.color")) {
			dto.getHeader().setHeaderColor(getTemplateValue(templateName + ".head.color"));
		}

		// ヘッダの文字色
		if (containKeyTemplate(templateName + ".head.text.color")) {
			dto.getHeader().setHeaderTextColor(getTemplateValue(templateName + ".head.text.color"));
		} else {
			dto.getHeader().setHeaderTextColor(defaultTextColor);
		}

		// hint.namesが存在していれば処理を続ける
		if (!containKeyTemplate(templateName + ".hint.names")) {
			return;
		}

		addHints(dto, templateName);
	}

	/**
	 * ヒントの読み込みのみを行います。
	 * @param dto
	 * @param templateName
	 */
	private void addHints(HandyViewTemplateDto dto, String templateName) {

		String hintNamesOrig = getTemplateValue(templateName + ".hint.names");
		String[] hintNames = hintNamesOrig.split(",");

		for (String hintName : hintNames) {
			// 同名のタグがすでにない場合のみ、処理を続ける
			if (dto.getTagHintByName(hintName) == null) {
				String preFix = templateName + ".hint." + hintName;

				HandyTagHintDto tagHintDto = new HandyTagHintDto(hintName);
				dto.addTagHint(tagHintDto);

				if (containKeyTemplate(preFix + ".vibrator")) {
					if (getTemplateValue(preFix + ".vibrator").equalsIgnoreCase("on")) {
						tagHintDto.setVibratorOn();
					} else {
						tagHintDto.setVibratorOff();
					}
				}

				if (containKeyTemplate(preFix + ".greenLed")) {
					if (getTemplateValue(preFix + ".greenLed").equalsIgnoreCase("on")) {
						tagHintDto.setGreenLedOn();
					} else {
						tagHintDto.setGreenLedOff();
					}
				}

				if (containKeyTemplate(preFix + ".redLed")) {
					if (getTemplateValue(preFix + ".redLed").equalsIgnoreCase("on")) {
						tagHintDto.setRedLedOn();
					} else {
						tagHintDto.setRedLedOff();
					}
				}

				if (containKeyTemplate(preFix + ".buzzer")) {
					if (getTemplateValue(preFix + ".buzzer").equalsIgnoreCase("on")) {
						tagHintDto.setBuzzerOn();
					} else {
						tagHintDto.setBuzzerOff();
					}
				}

				if (containKeyTemplate(preFix + ".time")) {
					tagHintDto.setTime(Integer.parseInt(getTemplateValue(preFix + ".time")));
				}

				if (containKeyTemplate(preFix + ".delay")) {
					tagHintDto.setDelay(Integer.parseInt(getTemplateValue(preFix + ".delay")));
				}

				if (containKeyTemplate(preFix + ".count")) {
					tagHintDto.setCount(Integer.parseInt(getTemplateValue(preFix + ".count")));
				}
			}
		}
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana End

	/**
	 * テンプレートの読み込みを行う。
	 * ただし、ヒント関連のみ。
	 * @param templateName
	 */
	public void loadViewTemplateHintsOnly(String templateName) {
		loadViewTemplateHintsOnly(getHttpServletRequest(), templateName);
	}

	/**
	 * テンプレートの読み込みを行う。
	 * ただし、ヒント関連のみ。
	 * @param templateName
	 */
	public void loadViewTemplateHintsOnly(HttpServletRequest req, String templateName) {
		addHints(getViewTemplate(), templateName);
	}

	/**
	 * 次の画面に強制適用させるテンプレートを設定します。
	 * @param templateName テンプレート名称
	 */
	public void setNextViewTemplateForceSetting(String templateName, String headText) {
		HttpServletRequest req = getHttpServletRequest();

		// このメソッドでは、dtoのインスタンスは自前で生成する。
		HandyViewTemplateDto dto = new HandyViewTemplateDto();
		// プロパティから読み込んだ値をdtoにセット。
		fillAttributeHandyViewTemplateDto(
				dto,
				templateName,
				headText);

		// requestにdtoを保存する。
		req.setAttribute("nextViewTemplate", dto);
	}

	/**
	 * 次の画面に強制適用させるテンプレートが設定されていたら、クリアします。
	 */
	public void clearNextViewTemplateForceSetting() {
		clearNextViewTemplateForceSetting(getHttpServletRequest());
	}

	/**
	 * 次の画面に強制適用させるテンプレートが設定されていたら、クリアします。
	 * @param req リクエスト
	 */
	public void clearNextViewTemplateForceSetting(HttpServletRequest req) {
		if (existsNextViewTemplateForceSetting(req)) {
			req.removeAttribute("nextViewTemplate");
		}
	}

	/**
	 * 次の画面に強制適用させるテンプレートの設定の有無を返却します。
	 * @return
	 */
	public boolean existsNextViewTemplateForceSetting() {
		return existsNextViewTemplateForceSetting(getHttpServletRequest());
	}

	/**
	 * 次の画面に強制適用させるテンプレートの設定の有無を返却します。
	 * @param リクエスト
	 * @return
	 */
	public boolean existsNextViewTemplateForceSetting(HttpServletRequest req) {
		if (req.getAttribute("nextViewTemplate") == null) {
			return false;
		}
		return true;
	}

	/**
	 * 次の画面に強制適用させるテンプレートの設定情報を返却します。
	 * @return
	 */
	public HandyViewTemplateDto getNextViewTemplateForceSetting() {
		return getNextViewTemplateForceSetting(getHttpServletRequest());
	}

	/**
	 * 次の画面に強制適用させるテンプレートの設定情報を返却します。
	 * @param req リクエスト
	 * @return
	 */
	public HandyViewTemplateDto getNextViewTemplateForceSetting(HttpServletRequest req) {
		if (existsNextViewTemplateForceSetting()) {
			return (HandyViewTemplateDto) req.getAttribute("nextViewTemplate");
		} else {
			return null;
		}
	}

	/**
	 * ヘッダー部のテキストを設定します。
	 * 設定した文字列はセンタリングされるように調整されます。
	 * HandyHeaderDto#setHeaderTextで設定した場合はセンタリングはされません。
	 * @param text ヘッダに設定する文字列
	 */
	public void setHeaderText(String text) {
		getViewTemplate().getHeader().setHeaderText(fillString(text));
	}

	/**
	 * ヘッダー部の背景色を設定します。
	 * @param color ヘッダの背景色
	 */
	public void setHeaderColor(String color) {
		getViewTemplate().getHeader().setHeaderColor(color);
	}

	/**
	 * 次の画面に強制適用させるテンプレートを設定します。
	 * @param HandyViewTemplateDto テンプレートDTO
	 */
	public void setNextViewTemplateForceSettingDto(HandyViewTemplateDto dto) {
		HttpServletRequest req = getHttpServletRequest();

		// requestにdtoを保存する。
		req.setAttribute("nextViewTemplate", dto);
	}

	/**
	 * エラーダイアログの表示が行われたことを示すフラグをオンにする
	 */
	public void setOnSendErrorDialogFlg() {
		HttpSession ses = getHttpServletRequest().getSession();
		ses.setAttribute(KEY_SEND_ERROR_DIALOG_FLG, "1");
	}

	/**
	 * 次画面テンプレート強制設定をバックアップする。
	 */
	public void backupNextViewTemplateForceSettingIfNeed() {
		HttpSession ses = getHttpServletRequest().getSession();
		if (existsNextViewTemplateForceSetting()) {
			ses.setAttribute(KEY_BACKUP_NEXT_VIEW_TEMPLATE_FORCE_SETTING, getNextViewTemplateForceSetting());
		}
	}

	/**
	 * 次画面テンプレート強制設定の設定を再設定する。
	 */
	public void restoreNextViewTemplateForceSettingIfNeed() {
		HttpSession ses = getHttpServletRequest().getSession();
		if (ses.getAttribute(KEY_BACKUP_NEXT_VIEW_TEMPLATE_FORCE_SETTING) != null && ses.getAttribute(KEY_SEND_ERROR_DIALOG_FLG) != null) {
			setNextViewTemplateForceSettingDto((HandyViewTemplateDto) ses.getAttribute(KEY_BACKUP_NEXT_VIEW_TEMPLATE_FORCE_SETTING));
			ses.removeAttribute(KEY_SEND_ERROR_DIALOG_FLG);
		}
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana Start

	/**
	 * 画面テンプレート設定ファイルに対象キーの定義があるか
	 */
	private boolean containKeyTemplate(String key) {

		return ResourceBundle.getBundle(VIEW_TEMPLETE_PROPERTIES).containsKey(key);
	}

	/**
	 * 画面テンプレート設定ファイルから値の取得
	 */
	private String getTemplateValue(String key) {

		return ResourceBundle.getBundle(VIEW_TEMPLETE_PROPERTIES).getString(key);
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.18 kawana End

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana Start

	// [#575] ValidateチェックのHT国際化 2017.01.13 kawana Start

	/**
	 * セッション破棄状態においてメッセージを返す為のメソッド
	 * ※毎回、コネクションを接続・切断する為、利用は限定的に行う事
	 * @param messageCd
	 * @return 該当メッセージ
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public String connectAndGetMessage(String messageCd) {
		return getMessage(messageCd);
	}

	/**
	 * <h2>メッセージ取得.</h2>
	 * <pre>
	 * 引数のメッセージCDに対応したメッセージをメッセージマスタから取得して
	 * 返却する。下記の優先順位でマスタから取得する。
	 *
	 * 1.HTメッセージマスタ
	 * 2.メッセージマスタ
	 *
	 * どちらのマスタにも対応するメッセージが登録されていない場合は
	 * メッセージCDを返却する。
	 *
	 * 取得したメッセージはキャッシュされ、同じメッセージCDの場合は、
	 * マスタから取得せずにキャッシュから返却される。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @return 取得したメッセージ
	 */
	public String getMessage(String messageCd) {
		return getMessage(messageCd, new ArrayList<String>(), true);
	}

	/**
	 * <h2>メッセージ取得.</h2>
	 * <pre>
	 * 引数のメッセージCDに対応したメッセージをメッセージマスタから取得して
	 * 返却する。下記の優先順位でマスタから取得する。
	 *
	 * 1.HTメッセージマスタ
	 * 2.メッセージマスタ
	 *
	 * どちらのマスタにも対応するメッセージが登録されていない場合は
	 * メッセージCDを返却する。
	 *
	 * 取得したメッセージはキャッシュされ、同じメッセージCDの場合は、
	 * マスタから取得せずにキャッシュから返却される。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValue 置換文字列 (メッセージ内の[0]、[1]を置換)
	 * @return 取得したメッセージ
	 */
	public String getMessage(String messageCd, String... replaceValue) {
		return getMessage(messageCd, Arrays.asList(replaceValue), true);
	}

	/**
	 * <h2>メッセージ取得.</h2>
	 * <pre>
	 * 引数のメッセージCDに対応したメッセージをメッセージマスタから取得して
	 * 返却する。下記の優先順位でマスタから取得する。
	 *
	 * 1.HTメッセージマスタ
	 * 2.メッセージマスタ
	 *
	 * どちらのマスタにも対応するメッセージが登録されていない場合は
	 * メッセージCDを返却する。
	 *
	 * 取得したメッセージはキャッシュされ、同じメッセージCDの場合は、
	 * マスタから取得せずにキャッシュから返却される。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValues 置換文字列 (メッセージ内の[0]、[1]を置換)
	 * @return 取得したメッセージ
	 */
	public String getMessage(String messageCd, Collection<String> replaceValues) {
		return getMessage(messageCd, replaceValues, true);
	}

	/**
	 * <h2>メッセージ取得.</h2>
	 * <pre>
	 * 引数のメッセージ管理クラスに登録されている1件目のメッセージを
	 * メッセージマスタから取得して返却する。下記の優先順位でマスタから取得する。
	 *
	 * 1.HTメッセージマスタ
	 * 2.メッセージマスタ
	 *
	 * どちらのマスタにも対応するメッセージが登録されていない場合は
	 * メッセージCDを返却する。
	 *
	 * 取得したメッセージはキャッシュされ、同じメッセージCDの場合は、
	 * マスタから取得せずにキャッシュから返却される。
	 * </pre>
	 * @param ErrorManager エラーが登録されているメッセージ管理クラス
	 * @return 取得したメッセージ
	 */
	public String getMessage(ErrorManager errorManager) {
		return getMessage(getMessageKey(errorManager), getMessageReplaceValue(errorManager), true);
	}

	/**
	 * <h2>メッセージ取得.</h2>
	 * <pre>
	 * 引数のメッセージCDに対応したメッセージをメッセージマスタから取得して
	 * 返却する。下記の優先順位でマスタから取得する。
	 *
	 * 1.HTメッセージマスタ
	 * 2.メッセージマスタ
	 *
	 * どちらのマスタにも対応するメッセージが登録されていない場合は
	 * メッセージCDを返却する。
	 *
	 * 取得したメッセージはキャッシュされ、同じメッセージCDの場合は、
	 * マスタから取得せずにキャッシュから返却される。
	 * </pre>
	 * @param messageCd メッセージCD
	 * @param replaceValues 置換文字列 (メッセージ内の[0]、[1]を置換)
	 * @param split メッセージを改行で分割するかの設定 (trueの場合分割)
	 * @return 取得したメッセージ
	 */
	private String getMessage(String messageCd, Collection<String> replaceValues, boolean split) {

		long cultureId = getCultureId();
		MessageKey key = MessageKey.builder().messageCd(messageCd).cultureId(cultureId).build();

		String messageNm;
		if (messageNmMap.containsKey(key)) {
			// 既に検索済の場合はキャッシュから取得

			messageNm = messageNmMap.get(key);
		} else {

			// ===== メッセージ検索 =====

			BMessageCB cb = messageBhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.setupSelect_MHtMessageAsOne();
			cb.query().setMessageCd_Equal(messageCd);
			cb.query().setCultureId_Equal(getCultureId());

			BMessage message = messageBhv.selectEntity(cb);

			if (message == null) {
				return messageCd;
			}

			// HTメッセージを優先する
			messageNm = CU.coalesce(message.chaseMHtMessageAsOne().getMessageNm(), message.getMessageNm());

			messageNmMap.put(key, messageNm);
		}

		// ===== メッセージの置換 =====

		// 改行[/]を置換
		messageNm = messageNm.replaceAll("\\[/\\]", "\n");

		if (replaceValues != null && 0 < replaceValues.size()) {

			int index = 0;
			for (String replaceValue : replaceValues) {

				if (replaceValue != null) {

					// 置き換え文字列[0]、[1]を置換
					messageNm = messageNm.replaceAll(new StringBuilder().append("\\[").append(index).append("\\]").toString(), replaceValue);
				}
				index++;
			}
		}

		// ===== メッセージの分割 =====

		if (split) {
			return splitText(messageNm);
		} else {
			return messageNm;
		}
	}

	/**
	 * エラー管理クラスからエラーのメッセージキー(メッセージCD)を取得します。
	 * @param ses HttpSessionオブジェクト
	 * @param errorManager エラーが登録されたエラー管理クラス
	 * @return 1件目のメッセージキー(メッセージCD)
	 */
	private String getMessageKey(ErrorManager errorManager) {
		if (errorManager.size() == 0) {
			return "";
		}
		return errorManager.get().values().toArray(new CommonException[0])[0].getMessageCd();
	}

	/**
	 * エラー管理クラスからエラーの置換文字列を取得します。
	 * @param ses HttpSessionオブジェクト
	 * @param errorManager エラーが登録されたエラー管理クラス
	 * @return 1件目の置換文字列
	 */
	private Collection<String> getMessageReplaceValue(ErrorManager errorManager) {
		if (errorManager.size() == 0) {
			return null;
		}
		return errorManager.get().values().toArray(new CommonException[0])[0].getReplaceValue();
	}

	// [#575] ValidateチェックのHT国際化 2017.01.13 kawana End

	// [#575] ValidateチェックのHT国際化(既存のチェックロジックを削除) 2017.04.17 kawana

	/**
	 * 画面のキークラス
	 */
	private static final class MessageKey {

		private String messageCd;
		private long cultureId;

		private MessageKey() {
		}

		private MessageKey(Builder builder) {
			this.messageCd = builder.messageCd;
			this.cultureId = builder.cultureId;
		}

		public static Builder builder() {
			return new Builder();
		}

		public static class Builder {

			private String messageCd;
			public long cultureId;

			public Builder messageCd(String messageCd) {
				this.messageCd = messageCd;
				return this;
			}

			public Builder cultureId(long cultureId) {
				this.cultureId = cultureId;
				return this;
			}

			public MessageKey build() {
				return new MessageKey(this);
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (cultureId ^ (cultureId >>> 32));
			result = prime * result + ((messageCd == null) ? 0 : messageCd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MessageKey other = (MessageKey) obj;
			if (cultureId != other.cultureId)
				return false;
			if (messageCd == null) {
				if (other.messageCd != null)
					return false;
			} else if (!messageCd.equals(other.messageCd))
				return false;
			return true;
		}
	}

	// [#2900] HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana End

	// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
	/**
	 * <h2>共通ダイアログのメッセージ設定.</h2>
	 * <pre>
	 * メッセージに改行コードがある場合、
	 * 拡張用フィールド(extText)を使用する。
	 * </pre>
	 * @param commonDialogDto
	 * @param messages
	 */
	public void setCommonDialogMessage(HandyCommonDialogDto commonDialogDto, String... messages) {

		StringBuilder messageSb = new StringBuilder();
		boolean isFirst = true;
		boolean useExtText = false;
		for (String message : messages) {

			message = CU.nullToStr(message);

			if (message.contains("\n")) {
				useExtText = true;
			}

			if (isFirst) {
				isFirst = false;
			} else {
				messageSb.append("\n");
			}
			messageSb.append(message);
		}

		if (!useExtText && messages.length <= 4) {
			// 拡張テキストフィールド未使用

			String[] tmpMessage = { "", "", "", "" };
			for (int i = 0; i < messages.length; i++) {
				tmpMessage[i] = messages[i];
			}

			if (messages.length <= 3) {

				commonDialogDto.setText2(tmpMessage[0]);
				commonDialogDto.setText3(tmpMessage[1]);
				commonDialogDto.setText4(tmpMessage[2]);
			} else {

				commonDialogDto.setText1(tmpMessage[0]);
				commonDialogDto.setText2(tmpMessage[1]);
				commonDialogDto.setText3(tmpMessage[2]);
				commonDialogDto.setText4(tmpMessage[3]);
			}
		} else {
			// 拡張テキストフィールド使用

			String[] splitMessage = messageSb.toString().split("\\n");

			String[] tmpMessage = { "", "", "", "", "", "", "", "", "", "" };

			int lastIndex = 0;
			for (int i = 0; i < splitMessage.length; i++) {

				if (9 < i) {
					break;
				}

				tmpMessage[i] = splitMessage[i];

				if (!CU.isNullOrEmpty(splitMessage[i])) {
					lastIndex = i;
				}
			}

			if (lastIndex <= 8) {

				commonDialogDto.setExtText2(tmpMessage[0]);
				commonDialogDto.setExtText3(tmpMessage[1]);
				commonDialogDto.setExtText4(tmpMessage[2]);
				commonDialogDto.setExtText5(tmpMessage[3]);
				commonDialogDto.setExtText6(tmpMessage[4]);
				commonDialogDto.setExtText7(tmpMessage[5]);
				commonDialogDto.setExtText8(tmpMessage[6]);
				commonDialogDto.setExtText9(tmpMessage[7]);
				commonDialogDto.setExtText10(tmpMessage[8]);
			} else {

				commonDialogDto.setExtText1(tmpMessage[0]);
				commonDialogDto.setExtText2(tmpMessage[1]);
				commonDialogDto.setExtText3(tmpMessage[2]);
				commonDialogDto.setExtText4(tmpMessage[3]);
				commonDialogDto.setExtText5(tmpMessage[4]);
				commonDialogDto.setExtText6(tmpMessage[5]);
				commonDialogDto.setExtText7(tmpMessage[6]);
				commonDialogDto.setExtText8(tmpMessage[7]);
				commonDialogDto.setExtText9(tmpMessage[8]);
				commonDialogDto.setExtText10(tmpMessage[9]);
			}
		}
	}
	// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
}
