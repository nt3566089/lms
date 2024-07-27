package com.oneslogi.ht.base.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.dbflute.cbean.MMatchingCB;
import com.oneslogi.base.dbflute.dto.BItemValidDto;
import com.oneslogi.base.dbflute.exbhv.MMatchingBhv;
import com.oneslogi.base.dbflute.exentity.MMatching;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;

/**
 * HT画面関連の共通処理クラス
 */
public class HandyScreenUtil extends AbstractBase {

	// ===== 使用テーブル =====

	@Inject
	private MMatchingBhv mMatcinghBhv;

	// ===== 使用ロジック =====

	@Inject
	HandyScreenDataManager screenManager;

	// ===== クラス変数 =====

	/**
	 * 入力制限<=>char属性 変換マップ
	 */
	private static Map<String, String> charMap = null;

	/**
	 * バーコード設定マップ
	 */
	private static ResourceBundle barcodeProp = null;

	/**
	 * 日付項目 入力可能文字数
	 */
	private static final int inputDateLength;

	static {

		// ===== HT設定ファイル =====

		ResourceBundle handyBundle = null;

		try {

			handyBundle = ResourceBundle.getBundle("handy");
		} catch (MissingResourceException e) {
			// 見つからない場合は何もしない
		}

		if (handyBundle != null) {
			// HT設定ファイルが存在

			if (handyBundle.containsKey("inputDateLength")) {

				inputDateLength = Integer.valueOf(handyBundle.getString("inputDateLength"));
			} else {

				inputDateLength = 0;
			}
		} else {

			inputDateLength = 0;
		}

		// ===== バーコード設定ファイル =====

		try {

			barcodeProp = ResourceBundle.getBundle("handyBarcode");
		} catch (MissingResourceException e) {
			// 見つからない場合は何もしない
		}
	}

	/**
	 * セッション破棄状態において画面名を返す為のメソッド
	 * ※毎回、コネクションを接続・切断する為、利用は限定的に行う事
	 * @param screenCd 画面CD
	 * @return 画面名(辞書名)
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public String connectAndGetScreenNm(String screenCd) {
		return screenNm(screenCd);
	}

	/**
	 * <h2>画面名の取得.</h2>
	 * <pre>
	 * 画面マスタに定義されている画面名(辞書名)を取得する。
	 * </pre>
	 * @param screenCd 画面CD
	 * @return 画面名(辞書名)
	 */
	public String screenNm(String screenCd) {

		return screenManager.getScreenNm(screenCd);
	}

	/**
	 * <h2>項目名の取得.</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と
	 * 引数の項目Cdから項目マスタの項目名(辞書名)を取得する。
	 * </pre>
	 * @param itemCd 項目CD
	 * @return 項目名(辞書名)
	 */
	public String itemNm(String itemCd) {

		HttpServletRequest req = getHttpServletRequest();
		String screenCd = (String) req.getAttribute("screenCd");

		return itemNm(screenCd, itemCd);
	}

	/**
	 * セッション破棄状態において項目名を返す為のメソッド
	 * ※毎回、コネクションを接続・切断する為、利用は限定的に行う事
	 * @param screenCd 項目CD
	 * @param itemCd 項目CD
	 * @return 項目名(辞書名)
	 */
	@Transaction(Mode.BEGIN_TRANSACTION)
	public String connectAndGetItemNm(String screenCd, String itemCd) {
		return itemNm(screenCd, itemCd);
	}

	/**
	 * <h2>項目名の取得.</h2>
	 * <pre>
	 * 引数の画面CDと項目CDから項目マスタの項目名(辞書名)を取得する。
	 * </pre>
	 * @param screenCd 項目CD
	 * @param itemCd 項目CD
	 * @return 項目名(辞書名)
	 */
	public String itemNm(String screenCd, String itemCd) {

		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana Start

		if (itemCd.equals("inputAuxiliary")) {
			// 入力補助ボタンと判定

			HttpServletRequest req = getHttpServletRequest();
			Boolean inputAuxiliaryVisible = (Boolean) req.getAttribute("inputAuxiliaryVisible");
			if (inputAuxiliaryVisible != null && !inputAuxiliaryVisible) {
				// 非表示(false)に設定されている (未設定の場合は表示する)

				return "";
			}
		}

		// [#4543] 入力補助ボタンの非表示対応 2018.05.11 kawana End

		return screenManager.getItemNm(screenCd, itemCd);
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(文字入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・len  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @return jspに記述するための属性文字列
	 */
	public String inputTextAttr(String itemCd) {

		return inputTextAttr(itemCd, false);
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(文字入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・len  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @param isOcr OCR使用フラグ
	 * @return jspに記述するための属性文字列
	 */
	public String inputTextAttr(String itemCd, boolean isOcr) {
		HttpServletRequest req = getHttpServletRequest();
		String screenCd = (String) req.getAttribute("screenCd");

		StringBuilder sb = new StringBuilder();

		BItemValidDto itemValid = screenManager.getItemValid(screenCd, itemCd);

		if (itemValid != null) {

			String charStr = getChar(itemValid.getInputLimit());

			appendCharAttr(sb, charStr);

			int inputLength = CU.nullToZero(itemValid.getMaxChars()).intValue();

			appendLengthAttr(sb, inputLength);
		} else {
			appendCharAttr(sb, "2");
		}

		appendBarcodeAttr(sb, screenCd, itemCd, isOcr);

		// TODO テスト
		//appendBgColor(sb, "1");

		return sb.toString();
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(数値入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (1固定)
	 * ・len  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @return jspに記述するための属性文字列
	 */
	public String inputNumberAttr(String itemCd) {

		return inputNumberAttr(itemCd, false);
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(数値入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (1固定)
	 * ・len  (辞書検証マスタまたは項目検証マスタの内容から設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @param isOcr OCR使用フラグ
	 * @return jspに記述するための属性文字列
	 */
	public String inputNumberAttr(String itemCd, boolean isOcr) {
		HttpServletRequest req = getHttpServletRequest();
		String screenCd = (String) req.getAttribute("screenCd");

		StringBuilder sb = new StringBuilder();

		appendCharAttr(sb, "1");

		BItemValidDto itemValid = screenManager.getItemValid(screenCd, itemCd);

		if (itemValid != null) {
			int integerLength = CU.nullToZero(itemValid.getIntegerLength()).intValue();
			int decimalLength = CU.nullToZero(itemValid.getDecimalLength()).intValue();

			int inputLength = integerLength + decimalLength;

			if (decimalLength != 0) {
				// 小数点があるので +1

				inputLength = inputLength + 1;
			}

			appendLengthAttr(sb, inputLength);
		}

		appendBarcodeAttr(sb, screenCd, itemCd, isOcr);

		// TODO テスト
		//appendBgColor(sb, "1");

		return sb.toString();
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(日付入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (1固定)
	 * ・len  (handy.propertiesから設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @return jspに記述するための属性文字列
	 */
	public String inputDateAttr(String itemCd) {

		return inputDateAttr(itemCd, false);
	}

	/**
	 * <h2>jsp内のinputタグ属性を取得(日付入力).</h2>
	 * <pre>
	 * HttpServletRequest内の画面CD(属性key:screenCd)と引数の項目CDから
	 * 項目に設定する以下の属性を返す。
	 * ・char  (1固定)
	 * ・len  (handy.propertiesから設定)
	 * ・method  (handyBarcode.propertiesから設定)
	 * ・property  (handyBarcode.propertiesから設定)
	 *
	 * [返却例]
	 *  char="2" method="2" property="312319" len="10"
	 *
	 * </pre>
	 * @param itemCd 項目CD
	 * @param isOcr OCR使用フラグ
	 * @return jspに記述するための属性文字列
	 */
	public String inputDateAttr(String itemCd, boolean isOcr) {
		HttpServletRequest req = getHttpServletRequest();
		String screenCd = (String) req.getAttribute("screenCd");

		StringBuilder sb = new StringBuilder();

		appendCharAttr(sb, "1");
		appendLengthAttr(sb, inputDateLength);
		appendBarcodeAttr(sb, screenCd, itemCd, isOcr);

		// TODO テスト
		//appendBgColor(sb, "1");

		return sb.toString();
	}

	/**
	 * <h2>有効文字列の取得.</h2>
	 * <pre>引数の文字列のうち、最初の有効(空以外)文字列を返却</pre>
	 *
	 * @param strs 対象の文字列の配列
	 * @return 最初の有効(空以外)文字列
	 */
	public String coalesce(String... strs) {
		return CU.coalesce(strs);
	}

	/**
	 * 末尾の0を削除(Stringで返却)
	 * @param str 対象の値
	 * @return 末尾の0を削除したString
	 */
	public String stripTrailingZeros(String str) {

		if (CU.isNullOrEmpty(str)) {
			return "";
		}

		BigDecimal value = null;

		try {
			value = WCC.toBigDecimal(str);
		} catch (NumberFormatException e) {
			return "";
		}

		return WCC.stripTrailingZeros(value);
	}

	// TODO テスト

	/**
	 * 引数の文字列に背景色の属性(bgcolor)を追加
	 */
	private void appendBgColor(StringBuilder sb, String necessary) {

		if (!CU.isNullOrEmpty(necessary)) {
			if (necessary.equals("1")) {
				sb.append(" bgcolor=\"");
				sb.append("#E0FFFF");
				sb.append("\"");
			}
		}
	}

	// TODO テスト

	/**
	 * 引数の文字列に入力文字種の属性(char)を追加
	 */
	private void appendCharAttr(StringBuilder sb, String charStr) {

		if (!CU.isNullOrEmpty(charStr)) {
			sb.append(" char=\"");
			sb.append(charStr);
			sb.append("\"");
		}
	}

	/**
	 * 引数の文字列に入力可能文字数の属性(len)を追加
	 */
	private void appendLengthAttr(StringBuilder sb, int length) {

		if (0 < length) {
			sb.append(" len=\"");
			sb.append(length);
			sb.append("\"");
		}
	}

	/**
	 * 引数の文字列にバーコード設定用の属性(method、property)を追加
	 */
	private void appendBarcodeAttr(StringBuilder sb, String screenCd, String itemCd, boolean isOcr) {

		String method = getBarcodeMethod(screenCd, itemCd, isOcr);

		if (!CU.isNullOrEmpty(method)) {
			sb.append(" method=\"");
			sb.append(method);
			sb.append("\"");
		}

		String property = getBarcodeProperty(screenCd, itemCd, isOcr);

		if (!CU.isNullOrEmpty(property)) {
			sb.append(" property=\"");
			sb.append(property);
			sb.append("\"");
		}
	}

	/**
	 * 入力制限から「char」値を取得
	 * (マッチングマスタを使用して変換)
	 */
	private String getChar(String inputLimit) {

		if (CU.isNullOrEmpty(inputLimit)) {
			return null;
		}

		if (charMap == null) {

			// マッチングマスタを検索
			MMatchingCB cb = mMatcinghBhv.newMyConditionBean();
			cb.query().setMatchingType_Equal("INPUT_LIMIT_TO_HT_CHAR");
			List<MMatching> matchingList = mMatcinghBhv.selectList(cb);

			charMap = new HashMap<String, String>();

			for (MMatching matching : matchingList) {
				charMap.put(matching.getMatchingKeyword(), matching.getTransformCd());
			}
		}

		String charStr = charMap.get(inputLimit);

		if (charStr == null) {
			// 変換なし

			charStr = inputLimit;
		}

		return charStr;
	}

	/**
	 * バーコード設定ファイルから「method」値の取得
	 */
	private String getBarcodeMethod(String screenCd, String itemCd, boolean isOcr) {

		StringBuilder keySb = createBarcodeKeySb(screenCd, itemCd, isOcr).append(".method");

		return getBarcodeValue(keySb.toString());
	}

	/**
	 * バーコード設定ファイルから「property」値の取得
	 */
	private String getBarcodeProperty(String screenCd, String itemCd, boolean isOcr) {

		StringBuilder keySb = createBarcodeKeySb(screenCd, itemCd, isOcr).append(".property");
		String propertyValue = getBarcodeValue(keySb.toString());

		if (CU.isNullOrEmpty(propertyValue)) {
			return propertyValue;
		}

		if (propertyValue.equals("lotProperty")) {
			// HTロット入力方式を設定(セッションから取得)

			HttpServletRequest req = getHttpServletRequest();
			HttpSession ses = req.getSession();

			propertyValue = CU.nullToStr((String) ses.getAttribute("lotProperty"));
		} else if (propertyValue.equals("serialProperty")) {
			// HTシリアル入力方式を設定(セッションから取得)

			HttpServletRequest req = getHttpServletRequest();
			HttpSession ses = req.getSession();

			propertyValue = CU.nullToStr((String) ses.getAttribute("serialProperty"));
		}

		return propertyValue;
	}

	/**
	 * バーコード設定ファイル用のキー作成
	 */
	private StringBuilder createBarcodeKeySb(String screenCd, String itemCd, boolean isOcr) {
		StringBuilder keySb = new StringBuilder()
				.append(screenCd)
				.append(".")
				.append(itemCd);

		if (isOcr) {
			keySb.append(".ocr");
		}

		return keySb;
	}

	/**
	 * バーコード設定ファイルから値の取得
	 */
	private String getBarcodeValue(String key) {

		if (barcodeProp == null) {
			return "";
		}

		try {
			return barcodeProp.getString(key);
		} catch (MissingResourceException e) {
			return "";
		}
	}
}
