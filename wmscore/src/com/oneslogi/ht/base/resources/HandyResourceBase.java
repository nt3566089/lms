package com.oneslogi.ht.base.resources;

import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Produces;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cdi.annotation.Access;
import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.cdi.annotation.DBFluteAccessContext;
import com.oneslogi.base.cdi.annotation.Trace;
import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.AuthenticationHandy;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorControl;
import com.oneslogi.ht.base.cdi.annotation.HandyUtil;
import com.oneslogi.ht.base.cdi.annotation.ValidateHandy;
import com.oneslogi.ht.base.dto.HandyCommonDialogDto;
import com.oneslogi.ht.base.dto.HandyViewTemplateDto;
import com.oneslogi.ht.base.dto.HywayDefaultParamDto;
import com.oneslogi.ht.base.util.HandyBaseUtil;
import com.oneslogi.ht.base.util.HandyKeyCodeUtil;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.wms.base.cdi.interceptor.WorkLogLocal;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.common.WorkLogCheckLogic;

// [#575] ValidateチェックのHT国際化(@ValidateHandyアノテーション追加) 2017.01.13 kawana

/**
 * ハンディ用Resourceモジュールの基底クラスです。
 * @author hi.watanabe.mp
 *
 */
@AuthenticationHandy
@DBFluteAccessContext
@Access
@HandyErrorControl
@Trace
@Transaction(Mode.BEGIN_TRANSACTION)
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add Start
@CheckBase(CheckMode.TYPE_CHECK)
//[#1079][Ver2.2.1] 日次処理中のHT使用不可 2017.09.20 honma Add End
@ValidateHandy
@Produces("application/xml;charset=UTF-8")
public abstract class HandyResourceBase extends AbstractBase {

	/**
	 * JSPファイルの配置場所
	 */
	public static final String HT_URI_BASE = "/WEB-INF/view/hyway";

	// ===== ボタン押下時の動作種別 =====

	/**
	 * ボタン押下時、指定URLに移動しますがデータは送信しません。
	 */
	public static final String BUTTON_URL_JUMP_NO_DATA = "1";
	/**
	 * ボタン押下時、指定URLに移動すると共にデータを送信します。
	 */
	public static final String BUTTON_URL_JUMP_WITH_DATA = "2";
	/**
	 * ボタン押下時、ブラウザを終了します。
	 */
	public static final String BUTTON_EXIT_BROWSER = "3";
	/**
	 * ボタン押下時、入力フォーカスを1つ前に移動します。
	 */
	public static final String BUTTON_BACK_FIELD = "5";
	/**
	 * 最後の入力フィールドが確定されるとデータをすべて所定のURLに渡します。
	 */
	public static final String BUTTON_SEND_DATA_FINAL_FIELD_INPUT = "6";
	/**
	 * ボタン押下時、ラジオボタン/チェックボックスにチェックをつけます。<BR>
	 * もしくは、コンボボックスのリストを開きます。
	 */
	public static final String BUTTON_RADIO_CHECK = "7";
	/**
	 * 特定の文字列を一括入力するショートカットキーを定義します。
	 */
	public static final String BUTTON_MULTI_STRING_INPUT = "23";
	/**
	 * ボタン押下時、imageタグで指定した画像を表示します。
	 */
	public static final String BUTTON_IMAGE_SHOW = "30";
	/**
	 * ボタン押下時、ブラウザの設定画面を表示します。。
	 */
	public static final String BUTTON_SETTING = "97";
	/**
	 * ボタン押下時、ブラウザのバージョン情報を表示します。。
	 */
	public static final String BUTTON_BROWSER_VERSION = "100";

	// ===== ボタン種別 =====

	/** 戻るボタン */
	public static final String KEY_TYPE_RETURN = "keyReturn";
	/** 送信ボタン */
	public static final String KEY_TYPE_SEND = "keySend";
	/** オプションボタン１ */
	public static final String KEY_TYPE_OPTION1 = "keyOption1";
	/** オプションボタン２ */
	public static final String KEY_TYPE_OPTION2 = "keyOption2";
	/** エンターキー */
	public static final String KEY_TYPE_ENTER = "keyEnter";
	/** １キー */
	public static final String KEY_TYPE_NUM1 = "keyNum1";
	/** ２キー */
	public static final String KEY_TYPE_NUM2 = "keyNum2";
	/** ３キー */
	public static final String KEY_TYPE_NUM3 = "keyNum3";

	// [#2898] HTメニューマスタ連携 2017.10.31 kawana Start

	// ===== メニューグループCD =====

	public static final String MENU_GROUP_CD_MAIN = "HT_MAINMENU";

	public static final String MENU_GROUP_CD_RECEIVE = "HT_RECEIVE";
	public static final String MENU_GROUP_CD_SHIPPING = "HT_SHIPPING";
	public static final String MENU_GROUP_CD_STOCK = "HT_STOCK";
	public static final String MENU_GROUP_CD_INVENTORY = "HT_INVENTORY";
	// [ONEsLOGI 労務管理][#5210] 運用メニューの追加 2018.11.01 shimizu Start
	public static final String MENU_GROUP_CD_OPERATION = "HT_OPERATION";
	// [ONEsLOGI 労務管理][#5210] 運用メニューの追加 2018.11.01 shimizu End
	// 「HTプリンタ選択」対応 2016.09.30 nayzaw Start
	public static final String MENU_GROUP_CD_SYSTEM = "HT_SYSTEM";
	// 「HTプリンタ選択」対応 2016.09.30 nayzaw End

	// [#2898] HTメニューマスタ連携 2017.10.31 kawana End

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.22 kawana Start

	// ===== テンプレート名 =====

	public static final String VIEW_TEMPLATE_NORMAL = "common.normal";
	public static final String VIEW_TEMPLATE_ERROR = "common.error";
	public static final String VIEW_TEMPLATE_WARN = "common.warn";
	public static final String VIEW_TEMPLATE_FATAL = "common.fatal";

	public static final String VIEW_TEMPLATE_CONFIRM = "common.confirm";
	public static final String VIEW_TEMPLATE_INTERRUPT = "common.interrupt";
	public static final String VIEW_TEMPLATE_CANCEL = "common.cancel";
	public static final String VIEW_TEMPLATE_END = "common.end";
	public static final String VIEW_TEMPLATE_DELETE = "common.delete";

	public static final String VIEW_TEMPLATE_COMPLETE = "common.complete";
	public static final String VIEW_TEMPLATE_OPERATION_END = "common.operation_end";

	public static final String VIEW_TEMPLATE_RESUME = "common.resume";

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.22 kawana End

	// ===== 使用ロジック =====

	@Inject
	@HandyUtil
	private HandyBaseUtil logic;
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.13 kawana Start
	@Inject
	private HandyScreenUtil screenUtil;
	@Inject
	private HandyKeyCodeUtil keyCodeUtil;
	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.13 kawana End
	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
	@Inject
	WorkLogCheckLogic workLogCheckLogic;
	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End

	/**
	 * セッションに存在するHywayBrowserのデフォルトパラメータを取得します。
	 * @return HywayDefaultParamDto デフォルトパラメータ保持するDTO
	 */
	protected HywayDefaultParamDto getDefParam() {
		HttpSession ses = getHttpServletRequest().getSession();
		if (ses.getAttribute("defDto") != null) {
			return (HywayDefaultParamDto) ses.getAttribute("defDto");
		} else {
			return null;
		}
	}

	// [#2734][#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

	/**
	 * エラー画面に遷移します。
	 * @param message1 エラーメッセージコード1
	 * @param message2 エラーメッセージコード2
	 * @param URI 戻るボタン押下後の遷移先画面Path
	 * @throws Exception
	 */
	public void sendErrorScreen(String message1, String message2, String URI) {

		logic.setOnSendErrorDialogFlg();

		// テンプレート強制設定はリクエストスコープで有効なので、エラー画面に適用されてしまう可能性がある。
		// そのため、このタイミングでクリアしておく。
		clearNextViewTemplateForceSetting();

		// 画面初期化
		initScreen("CommonErrorDialogHT", VIEW_TEMPLATE_ERROR);

		// 右ボタン設定
		setFooterRightButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_ENTER).url(URI).itemCd("return").build());

		//ダイアログ共通画面の仕組みを用いてエラー画面表示
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, message1, message2);
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #525]件対応 「終了」、「継続」ボタンがあるエラー画面作成 2016.12.26 nayzaw Start

	/**
	 * エラー画面に遷移します。
	 * @param message1 エラーメッセージコード1
	 * @param message2 エラーメッセージコード2
	 * @param returnUrl 終了時のURL
	 * @param sendUrl 継続時のURL
	 * @throws Exception
	 */
	public void sendErrorScreenWithButtons(String message1, String message2, String returnUrl, String sendUrl) {

		logic.setOnSendErrorDialogFlg();

		// テンプレート強制設定はリクエストスコープで有効なので、エラー画面に適用されてしまう可能性がある。
		// そのため、このタイミングでクリアしておく。
		clearNextViewTemplateForceSetting();

		// 画面初期化
		initScreen("CommonErrorDialogHT", VIEW_TEMPLATE_ERROR);

		// 左ボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(returnUrl).itemCd("end").build());
		// 右ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(sendUrl).itemCd("continue").build());

		//ダイアログ共通画面の仕組みを用いてエラー画面表示
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, message1, message2);
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #525]件対応 「終了」、「継続」ボタンがあるエラー画面作成 2016.12.26 nayzaw End

	// [#5233][v3.1] 戻るボタンのみの警告ダイアログを追加 2018.10.11 kawana Start

	/**
	 * 警告画面に遷移します。
	 * @param message1 エラーメッセージコード1
	 * @param message2 エラーメッセージコード2
	 * @param returnUrl 終了時のURL
	 * @param sendUrl 継続時のURL
	 * @throws Exception
	 */
	public void sendWarnScreen(String message1, String message2, String URI) {

		logic.setOnSendErrorDialogFlg();

		// テンプレート強制設定はリクエストスコープで有効なので、エラー画面に適用されてしまう可能性がある。
		// そのため、このタイミングでクリアしておく。
		clearNextViewTemplateForceSetting();

		// 画面初期化
		initScreen("CommonErrorDialogHT", VIEW_TEMPLATE_WARN);

		// 右ボタン設定
		setFooterRightButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).keyType(KEY_TYPE_ENTER).url(URI).itemCd("return").build());

		//ダイアログ共通画面の仕組みを用いてエラー画面表示
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		dto.setText2(message1);
		dto.setText3(message2);

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	// [#5233][v3.1] 戻るボタンのみの警告ダイアログを追加 2018.10.11 kawana End

	// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add Start
	/**
	 * 警告画面に遷移します。
	 * @param message1 エラーメッセージコード1
	 * @param message2 エラーメッセージコード2
	 * @param returnUrl 終了時のURL
	 * @param sendUrl 継続時のURL
	 * @throws Exception
	 */
	public void sendWarnScreenWithButtons(String message1, String message2, String returnUrl, String sendUrl) {

		logic.setOnSendErrorDialogFlg();

		// テンプレート強制設定はリクエストスコープで有効なので、エラー画面に適用されてしまう可能性がある。
		// そのため、このタイミングでクリアしておく。
		clearNextViewTemplateForceSetting();

		// 画面初期化
		initScreen("CommonWarnDialogHT", VIEW_TEMPLATE_WARN);

		// 左ボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(returnUrl).itemCd("end").build());
		// 右ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(sendUrl).itemCd("continue").build());

		//メッセージコードからエラーメッセージを取得
		//ダイアログ共通画面の仕組みを用いてエラー画面表示
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, message1, message2);
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}
	// [#3626][Ver3.0] HT出荷検品 - 梱包計算無しで梱包数を複数にすると荷札出力のメッセージ 2018.02.15 honma Add End

	/**
	 * 画面の初期化
	 * @param screenCd 画面CD(画面マスタで定義したCD)
	 */
	public void initScreen(String screenCd) {

		initScreen(screenCd, VIEW_TEMPLATE_NORMAL);
	}

	/**
	 * 画面の初期化
	 * @param screenCd 画面CD(画面マスタで定義したCD)
	 * @param templateName テンプレート名(テンプレートファイルに定義したもの)
	 */
	public void initScreen(String screenCd, String templateName) {

		// リクエスト、セッションの取得
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.clearFooterButton(ses);

		String screenNm = screenUtil.screenNm(screenCd);

		req.setAttribute("screenCd", screenCd);
		req.setAttribute("screen", screenUtil);

		loadViewTemplate(templateName, screenNm);
	}

	public void setSendButton(ButtonInfo info) {

		if (info.getType() == null) {
			info.setType(BUTTON_URL_JUMP_WITH_DATA);
		}

		if (info.getKeyType() == null) {
			info.setKeyType(KEY_TYPE_SEND);
		}

		setFooterRightButton(info);
	}

	public void setFooterRightButton(ButtonInfo info) {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterRightButton(
				ses,
				info.getType(),
				getPropValueKeyCode(ses, info.getKeyType()),
				info.getURI(),
				getPropValueKeyLabel(ses, info.getKeyType()) + screenUtil.itemNm(info.getItemCd())
				);
	}

	public void setReturnButton(ButtonInfo info) {

		if (info.getType() == null) {
			info.setType(BUTTON_URL_JUMP_WITH_DATA);
		}

		if (info.getKeyType() == null) {
			info.setKeyType(KEY_TYPE_RETURN);
		}

		setFooterLeftButton(info);
	}

	public void setFooterLeftButton(ButtonInfo info) {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterLeftButton(
				ses,
				info.getType(),
				getPropValueKeyCode(ses, info.getKeyType()),
				info.getURI(),
				getPropValueKeyLabel(ses, info.getKeyType()) + screenUtil.itemNm(info.getItemCd())
				);
	}

	/**
	 * フッタ部の左上ボタンを設定します。
	 * setScreenCdにて画面CDの指定がされている前提で、キー割り当てはkeyOption1固定とします。
	 * @param url        遷移先画面Path
	 */
	public void setOptionButton1(ButtonInfo info) {

		if (info.getType() == null) {
			info.setType(BUTTON_URL_JUMP_WITH_DATA);
		}

		if (info.getKeyType() == null) {
			info.setKeyType(KEY_TYPE_OPTION1);
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterOptionButton1(
				ses,
				info.getType(),
				getPropValueKeyCode(ses, info.getKeyType()),
				info.getURI(),
				getPropValueKeyLabel(ses, info.getKeyType()) + screenUtil.itemNm(info.getItemCd())
				);
	}

	/**
	 * フッタ部の右上ボタンを設定します。
	 * setScreenCdにて画面CDの指定がされている前提で、キー割り当てはkeyOption2固定とします。
	 * @param url        遷移先画面Path
	 * @param keyType キー種別
	 */
	public void setOptionButton2(ButtonInfo info) {

		if (info.getType() == null) {
			info.setType(BUTTON_URL_JUMP_WITH_DATA);
		}

		if (info.getKeyType() == null) {
			info.setKeyType(KEY_TYPE_OPTION2);
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterOptionButton2(
				ses,
				info.getType(),
				getPropValueKeyCode(ses, info.getKeyType()),
				info.getURI(),
				getPropValueKeyLabel(ses, info.getKeyType()) + screenUtil.itemNm(info.getItemCd())
				);
	}

	/**
	 * フッタ部のページ切替ボタンを設定します。
	 * @param forwardUrl        前ボタン 遷移先画面Path
	 * @param forwardButtonType 前ボタン ボタン種別
	 * @param backUrl           次ボタン 遷移先画面Path
	 * @param backButtonType    次ボタン ボタン種別
	 */
	public void setPageButton(ButtonInfo prevInfo, ButtonInfo nextInfo) {

		if (prevInfo.getType() == null) {
			prevInfo.setType(BUTTON_URL_JUMP_NO_DATA);
		}

		if (prevInfo.getKeyType() == null) {
			prevInfo.setKeyType(KEY_TYPE_NUM1);
		}

		if (nextInfo.getType() == null) {
			nextInfo.setType(BUTTON_URL_JUMP_NO_DATA);
		}

		if (nextInfo.getKeyType() == null) {
			nextInfo.setKeyType(KEY_TYPE_NUM3);
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterPageButton(ses,
				getPropValueKeyCode(ses, prevInfo.getKeyType()), prevInfo.getType(), prevInfo.getURI(), getPropValueKeyLabel(ses, prevInfo.getKeyType()) + screenUtil.itemNm(prevInfo.getItemCd()),
				getPropValueKeyCode(ses, nextInfo.getKeyType()), nextInfo.getType(), nextInfo.getURI(), getPropValueKeyLabel(ses, nextInfo.getKeyType()) + screenUtil.itemNm(nextInfo.getItemCd()));
	}

	/**
	 * フッタ部の非表示ボタンを設定します。
	 * setScreenCdにて画面CDの指定がされている前提で、キー割り当てはkeyEnter固定とします。
	 * @param url        遷移先画面Path
	 */
	public void setHideButton(ButtonInfo info) {

		if (info.getType() == null) {
			info.setType(BUTTON_URL_JUMP_WITH_DATA);
		}

		// [#4002][v3.0] func=6の場合はkey設定しない (非表示ボタンのkey設定を削除) 2018.05.10 kawana Delete

		if (info.getFunc() == null) {
			info.setFunc(BUTTON_SEND_DATA_FINAL_FIELD_INPUT);
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		logic.setFooterHideButton(ses, info.getType(), getPropValueKeyCode(ses, info.getKeyType()), info.getURI(), info.getFunc());
	}

	/**
	 * <h2>共通ダイアログ表示.</h2>
	 * <pre>
	 * 共通ダイアログを表示する。
	 * 引数の画面CDと項目CD(text または text1～4)から
	 * 画面表示文字列を設定した後、
	 * 共通ダイアログに遷移する
	 *
	 * ※※※ 注意 ※※※
	 * 本メソッドでは下記は行わないため、
	 * 呼出す前にされていることが前提となる。
	 * ・画面タイトルの設定
	 * ・ボタンの設定
	 *
	 * </pre>
	 * @param screenCd 画面CD
	 */
	public void displayCommonDialog(String screenCd) {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		String text = screenUtil.itemNm(screenCd, "text");
		String text1 = screenUtil.itemNm(screenCd, "text1");
		String text2 = screenUtil.itemNm(screenCd, "text2");
		String text3 = screenUtil.itemNm(screenCd, "text3");
		String text4 = screenUtil.itemNm(screenCd, "text4");

		// text1～4が優先

		if (!CU.isNullOrEmpty(text1) ||
				!CU.isNullOrEmpty(text2) ||
				!CU.isNullOrEmpty(text3) ||
				!CU.isNullOrEmpty(text4)) {

			dto.setText1(text1);
			dto.setText2(text2);
			dto.setText3(text3);
			dto.setText4(text4);
		} else {
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, text);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		}

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>共通ダイアログ表示(表示文字指定).</h2>
	 * <pre>
	 * 共通ダイアログを表示する。
	 * 引数の文字列を画面に設定した後、
	 * 共通ダイアログに遷移する。
	 *
	 * ※※※ 注意 ※※※
	 * 本メソッドでは下記は行わないため、
	 * 呼出す前にされていることが前提となる。
	 * ・画面タイトルの設定
	 * ・ボタンの設定
	 *
	 * </pre>
	 * @param messageText 画面に表示する文字列
	 */
	public void displayCommonDialogMessage(String messageText) {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, messageText);
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param screenCd 画面CD
	 * @param returnUrl 終了時のURL
	 * @param sendUrl 継続時のURL
	 */
	public void displayEndDialog(String screenCd, String returnUrl, String sendUrl) {

		final String commonDialogScreenCd = "CommonEndDialogHT";

		// 画面初期化
		initScreen(commonDialogScreenCd, VIEW_TEMPLATE_END);

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(returnUrl).itemCd("end").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(sendUrl).itemCd("continue").build());

		// 画面表示文字設定 (共通ダイアログ使用)
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		String programName = screenUtil.itemNm(suffixHT(screenCd), "programName");
		String interruptText = screenUtil.itemNm(commonDialogScreenCd, "text");
		if (!CU.isNullOrEmpty(programName)) {
			// 機能名表示あり

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, programName, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		} else {
			// 機能名なし

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		}

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>完了確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param screenCd 画面CD
	 * @param returnUrl 終了時のURL
	 * @param sendUrl 継続時のURL
	 * @throws Exception
	 */
	public void displayOperationEndDialog(String screenCd, String returnUrl, String sendUrl) throws Exception {

		final String commonDialogScreenCd = "CommonEndDialogHT";

		// 画面初期化
		initScreen(commonDialogScreenCd, VIEW_TEMPLATE_OPERATION_END);

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(returnUrl).itemCd("end").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(sendUrl).itemCd("continue").build());

		// 画面表示文字設定 (共通ダイアログ使用)
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		String programName = screenUtil.itemNm(suffixHT(screenCd), "programName");
		String interruptText = screenUtil.itemNm(commonDialogScreenCd, "text");
		if (!CU.isNullOrEmpty(programName)) {
			// 機能名表示あり

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, programName, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		} else {
			// 機能名なし

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		}

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>中断確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param screenCd 画面CD
	 * @param endUrl 終了時のURL
	 * @param continueUrl 継続時のURL
	 * @throws Exception
	 */
	public void displayCancelDialog(String screenCd, String endUrl, String continueUrl) throws Exception {

		final String commonDialogScreenCd = "CommonCancelDialogHT";

		// 画面初期化
		initScreen(commonDialogScreenCd, VIEW_TEMPLATE_CANCEL);

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(endUrl).itemCd("no").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(continueUrl).itemCd("yes").build());

		// 画面表示文字設定 (共通ダイアログ使用)
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		String programName = screenUtil.itemNm(suffixHT(screenCd), "programName");
		String interruptText = screenUtil.itemNm(commonDialogScreenCd, "text");
		if (!CU.isNullOrEmpty(programName)) {
			// 機能名表示あり

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, programName, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		} else {
			// 機能名なし

			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, interruptText);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
		}

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>削除確認画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param screenCd 画面CD
	 * @param noUrl NO時のURL
	 * @param yesUrl YES時のURL
	 * @throws Exception
	 */
	public void displayDeleteDialog(String noUrl, String yesUrl) throws Exception {

		final String commonDialogScreenCd = "CommonDeleteDialogHT";

		// 画面初期化
		initScreen(commonDialogScreenCd, VIEW_TEMPLATE_DELETE);

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(noUrl).itemCd("no").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().type(BUTTON_URL_JUMP_NO_DATA).url(yesUrl).itemCd("yes").build());

		// 画面表示文字設定 (共通ダイアログ使用)
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, screenUtil.itemNm(commonDialogScreenCd, "text"));
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * <h2>再開画面を表示</h2>
	 * <pre>
	 * </pre>
	 * @param programNm 再開する機能名
	 * @param url 再開url
	 */
	public void displayResumeDialog(String programNm, String url) {

		final String commonDialogScreenCd = "CommonResumeDialogHT";

		// 画面初期化
		initScreen(commonDialogScreenCd, VIEW_TEMPLATE_RESUME);

		// 再開ボタン設定
		setSendButton(ButtonInfo.builder().url(url).itemCd("resume").build());

		// 画面表示文字設定 (共通ダイアログ使用)
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyCommonDialogDto dto = new HandyCommonDialogDto();

		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
		logic.setCommonDialogMessage(dto, programNm, screenUtil.itemNm(commonDialogScreenCd, "text3"));
		// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

		ses.setAttribute("dialogDto", dto);

		logic.setTransURL(HT_URI_BASE + "/base/CommonDialog.jsp", ses);
	}

	/**
	 * 指定されたkeyTypeに該当するkeyCode(割り当てキー)の値を返却します。
	 * @param ses
	 * @param keyType
	 */
	public String getPropValueKeyCode(HttpSession ses, String keyType) {
		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana Start
		if (CU.isNullOrEmpty(keyType)) {
			return "";
		}
		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana End
		return keyCodeUtil.getKeyCode(keyType);
	}

	/**
	 * 指定されたkeyTypeに該当するkeyLabel(ラベルに表示する割り当てキー名)の値を返却します。
	 * @param ses
	 * @param keyType
	 */
	public String getPropValueKeyLabel(HttpSession ses, String keyType) {
		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana Start
		if (CU.isNullOrEmpty(keyType)) {
			return "";
		}
		// [#4002][v3.0] func=6の場合はkey設定しない 2018.05.10 kawana End
		return keyCodeUtil.getKeyLabel(keyType);
	}

	// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End

	/**
	 * テンプレート管理DTOを返却します
	 * @return
	 */
	public HandyViewTemplateDto getViewTemplate() {
		return logic.getViewTemplate();
	}

	public void loadViewTemplate(String templateName, String headText) {
		logic.loadViewTemplate(templateName, headText);
	}

	public void setHeaderText(String text) {
		logic.setHeaderText(text);
	}

	public void setHeaderColor(String color) {
		logic.setHeaderColor(color);
	}

	public void loadViewTemplate() {
		logic.loadViewTemplate();
	}

	public void setNextViewTemplateForceSetting(String templateName) {
		logic.setNextViewTemplateForceSetting(templateName, "");
	}

	public void clearNextViewTemplateForceSetting() {
		logic.clearNextViewTemplateForceSetting();
	}

	public boolean existsNextViewTemplateForceSetting() {
		return logic.existsNextViewTemplateForceSetting();
	}

	public HandyViewTemplateDto getNextViewTemplateForceSetting() {
		return logic.getNextViewTemplateForceSetting();
	}

	public void loadViewTemplateHintsOnly(String templateName) {
		logic.loadViewTemplateHintsOnly(templateName);
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.13 kawana Start

	/**
	 * <h2>文字列の末尾に「HT」を付加.</h2>
	 * <pre>
	 * 引数の文字列の末尾に「HT」をつけて返却する。
	 * 既に「HT」がついてる場合は何もしない。
	 * </pre>
	 * @param str 対象文字列
	 * @return 末尾にHTをつけた文字列
	 */
	public String suffixHT(String str) {

		if (str.endsWith("HT")) {
			return str;
		}

		return str + "HT";
	}

	/**
	 * ボタン設定情報
	 */
	public static final class ButtonInfo {

		// ※ HTのマニュアル上、ボタンにtype属性は必要なさそうだが、
		//    [#2734]国際化対応としては既存の動作を保障するために残しておく

		private String uri;
		private String type;
		private String keyType;
		private String itemCd;
		private String func;

		private ButtonInfo() {
		}

		private ButtonInfo(Builder builder) {
			this.type = builder.type;
			this.keyType = builder.keyType;
			this.uri = builder.uri;
			this.itemCd = builder.itemCd;
			this.func = builder.func;
		}

		public static Builder builder() {
			return new Builder();
		}

		public static class Builder {

			private String uri;
			private String type;
			private String keyType;
			private String itemCd;
			private String func;

			public Builder url(String url) {
				this.uri = url;
				return this;
			}

			public Builder itemCd(String itemCd) {
				this.itemCd = itemCd;
				return this;
			}

			public Builder keyType(String keyType) {
				this.keyType = keyType;
				return this;
			}

			public Builder type(String type) {
				this.type = type;
				return this;
			}

			public Builder func(String func) {
				this.func = func;
				return this;
			}

			public ButtonInfo build() {
				return new ButtonInfo(this);
			}
		}

		public String getType() {
			return type;
		}

		public String getFunc() {
			return func;
		}

		public String getKeyType() {
			return keyType;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public void setFunc(String func) {
			this.func = func;
		}

		public String getURI() {
			return uri;
		}

		public String getItemCd() {
			return itemCd;
		}
	}

	// [#2734] HT国際化対応(画面マスタ連携) 2017.10.13 kawana End

	/**
	 * 作業実績ログに出力するトレース項目を設定
	 * @param traceItem トレース項目
	 */
	public void setWorkLogTraceItem(String traceItem) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setTraceItem(traceItem);
	}

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana Start

	/**
	 * 作業中数量を取得
	 */
	public BigDecimal getWorkLogQty() {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		return CU.nullToZero(WorkLogLocal.get().getWorkQty());
	}

	/**
	 * 作業中数量を加算
	 * @param workQty 作業数量
	 */
	public void addWorkLogQty(Object workQty) {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setWorkQty(WCC.add(getWorkLogQty(), workQty));
		WorkLogLocal.get().setModifiedWorkData(true);
	}

	/**
	 * 作業実績ログに出力する作業数量を設定
	 * @param workQty 作業数量
	 */
	public void setWorkLogQty(Object workQty) {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setWorkQty(WCC.toBigDecimal(workQty));
		WorkLogLocal.get().setModifiedWorkData(true);
	}

	/**
	 * 作業完了をスキップする
	 */
	public void skipWorkLogEnd() {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setSkipWorkLogEnd(true);
	}

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana End

}
