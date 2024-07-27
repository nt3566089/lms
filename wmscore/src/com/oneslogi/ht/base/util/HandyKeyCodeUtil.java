package com.oneslogi.ht.base.util;

import java.util.ResourceBundle;

import com.oneslogi.base.AbstractBase;

/**
 * HTキー設定の共通クラス
 */
public class HandyKeyCodeUtil extends AbstractBase {

	/**
	 * 設定ファイル名
	 */
	private static final String KEY_CODE_PROPERTIES = "handyKeyCode";

	/**
	 * <h2>キーコードの取得.</h2>
	 * @param keyType キー種別
	 * @return キーコード
	 */
	public String getKeyCode(String keyType) {

		return ResourceBundle.getBundle(KEY_CODE_PROPERTIES).getString(keyType + ".keyCode");
	}

	/**
	 * <h2>キーラベルの取得.</h2>
	 *
	 * @param keyType キー種別
	 * @return キーラベル
	 */
	public String getKeyLabel(String keyType) {

		return ResourceBundle.getBundle(KEY_CODE_PROPERTIES).getString(keyType + ".keyLabel");
	}

	/**
	 * <h2>キーラベルの取得.</h2>
	 *
	 * @param keyType キー種別
	 * @return キーラベル
	 */
	public String getKeyLabelWithText(String keyType, String text) {

		return ResourceBundle.getBundle(KEY_CODE_PROPERTIES).getString(keyType + ".keyLabel") + text;
	}
}
