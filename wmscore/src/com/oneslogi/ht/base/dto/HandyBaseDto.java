package com.oneslogi.ht.base.dto;

public class HandyBaseDto {

	/** ページインデックス */
	private int pageIndex = 0;

	/** 戻るURL */
	private String backUrl = "";

	// [#575] ValidateチェックのHT国際化 2017.01.17 kawana Start

	/** validateチェック結果 */
	private boolean isValidateErr = false;

	// [#575] ValidateチェックのHT国際化 2017.01.17 kawana End

	/**
	 * @return pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex セットする pageIndex
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return backUrl
	 */
	public String getBackUrl() {
		return backUrl;
	}

	/**
	 * @param backUrl セットする backUrl
	 */
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	/**
	 * @return isValidateErr
	 */
	public boolean isValidateErr() {
		return isValidateErr;
	}

	/**
	 * @param isValidateErr セットする isValidateErr
	 */
	public void setValidateErr(boolean isValidateErr) {
		this.isValidateErr = isValidateErr;
	}

}
