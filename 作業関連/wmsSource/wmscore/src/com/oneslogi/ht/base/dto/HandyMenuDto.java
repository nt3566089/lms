package com.oneslogi.ht.base.dto;

/**
 * メニューまたはメニューグループ用DTO
 */
public class HandyMenuDto {

	/** メニューグループ名 */
	private String menuGrpNm;
	/** メニューグループCD */
	private String menuGrpCd;
	/** メニュー名 */
	private String menuNm;
	/** URLパス(メニューグループの場合は設定しない) */
	private String url;

	public String getMenuGrpNm() {
		return menuGrpNm;
	}
	public String getMenuGrpCd() {
		return menuGrpCd;
	}
	public String getMenuNm() {
		return menuNm;
	}
	public String getUrl() {
		return url;
	}
	public void setMenuGrpNm(String menuGrpNm) {
		this.menuGrpNm = menuGrpNm;
	}
	public void setMenuGrpCd(String menuGrpCd) {
		this.menuGrpCd = menuGrpCd;
	}
	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
