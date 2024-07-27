package com.oneslogi.ht.base.dto;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * 画面ヘッダ部の情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyHeaderDto implements Serializable {

	private String headerText;
	private String headerColor;
	/* 2015/06/16 INOUE ADD START エラー時文字色指定 */
	private String headerTextColor;
	/* 2015/06/16 INOUE END */
	
	public String getHeaderText() {
		return headerText;
	}
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}
	public String getHeaderColor() {
		return headerColor;
	}
	public void setHeaderColor(String headerColor) {
		this.headerColor = headerColor;
	}

	/* 2015/06/16 INOUE ADD START エラー時文字色指定 */
	public String getHeaderTextColor() {
		return headerTextColor;
	}
	public void setHeaderTextColor(String headerTextColor) {
		this.headerTextColor = headerTextColor;
	}
	/* 2015/06/16 INOUE END */
	
	/* 2015/06/11 INOUE ADD START 色・音の適用 */
	public void copyAttributes(HandyHeaderDto from) {
		if (StringUtils.isNotEmpty(from.getHeaderText())) {
			headerText = from.getHeaderText();
		}
		
		if (StringUtils.isNotEmpty(from.getHeaderColor())) {
			headerColor = from.getHeaderColor();
		}
		
		/* 2015/06/16 INOUE ADD START エラー時文字色指定 */
		if (StringUtils.isNotEmpty(from.getHeaderTextColor())) {
			headerTextColor = from.getHeaderTextColor();
		}
		/* 2015/06/16 INOUE END */
	}
	/* 2015/06/11 INOUE ADD END */
}
