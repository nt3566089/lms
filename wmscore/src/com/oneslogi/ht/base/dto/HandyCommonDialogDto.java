package com.oneslogi.ht.base.dto;

/**
 * 共通ダイアログ画面に表示する情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyCommonDialogDto {

	private String text1;
	private String text2;
	private String text3;
	private String text4;
	// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
	private String extText1;
	private String extText2;
	private String extText3;
	private String extText4;
	private String extText5;
	private String extText6;
	private String extText7;
	private String extText8;
	private String extText9;
	private String extText10;
	// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End

	/**
	 * 表示文字列１を取得します。
	 * @return 表示文字列１
	 */
	public String getText1() {
		return text1;
	}

	/**
	 * 表示文字列１を設定します。
	 * @param text1 表示文字列１
	 */
	public void setText1(String text1) {
		this.text1 = text1;
	}

	/**
	 * 表示文字列２を取得します。
	 * @return 表示文字列２
	 */
	public String getText2() {
		return text2;
	}

	/**
	 * 表示文字列２を設定します。
	 * @param text2 表示文字列２
	 */
	public void setText2(String text2) {
		this.text2 = text2;
	}

	/**
	 * 表示文字列３を取得します。
	 * @return 表示文字列３
	 */
	public String getText3() {
		return text3;
	}

	/**
	 * 表示文字列３を設定します。
	 * @param text3 表示文字列３
	 */
	public void setText3(String text3) {
		this.text3 = text3;
	}

	/**
	 * 表示文字列４を取得します。
	 * @return 表示文字列４
	 */
	public String getText4() {
		return text4;
	}

	/**
	 * 表示文字列４を設定します。
	 * @param text4 表示文字列４
	 */
	public void setText4(String text4) {
		this.text4 = text4;
	}

	public String getExtText1() {
		return extText1;
	}

	public void setExtText1(String extText1) {
		this.extText1 = extText1;
	}

	public String getExtText2() {
		return extText2;
	}

	public void setExtText2(String extText2) {
		this.extText2 = extText2;
	}

	public String getExtText3() {
		return extText3;
	}

	public void setExtText3(String extText3) {
		this.extText3 = extText3;
	}

	public String getExtText4() {
		return extText4;
	}

	public void setExtText4(String extText4) {
		this.extText4 = extText4;
	}

	public String getExtText5() {
		return extText5;
	}

	public void setExtText5(String extText5) {
		this.extText5 = extText5;
	}

	public String getExtText6() {
		return extText6;
	}

	public void setExtText6(String extText6) {
		this.extText6 = extText6;
	}

	public String getExtText7() {
		return extText7;
	}

	public void setExtText7(String extText7) {
		this.extText7 = extText7;
	}

	public String getExtText8() {
		return extText8;
	}

	public void setExtText8(String extText8) {
		this.extText8 = extText8;
	}

	public String getExtText9() {
		return extText9;
	}

	public void setExtText9(String extText9) {
		this.extText9 = extText9;
	}

	public String getExtText10() {
		return extText10;
	}

	public void setExtText10(String extText10) {
		this.extText10 = extText10;
	}
}
