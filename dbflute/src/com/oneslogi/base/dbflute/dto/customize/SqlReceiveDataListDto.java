package com.oneslogi.base.dbflute.dto.customize;

import com.oneslogi.base.dbflute.dto.bs.customize.BsSqlReceiveDataListDto;

/**
 * The entity of SqlReceiveDataList.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class SqlReceiveDataListDto extends BsSqlReceiveDataListDto {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	/** 入荷期限日 */
	private String maxLimitDt;
	/** 入荷期限日超過フラグ */
	private String limitDtNgFlg;

	// ===== 以下、自動生成のゲッタ、セッタ

	public String getMaxLimitDt() {
		return maxLimitDt;
	}

	public void setMaxLimitDt(String maxLimitDt) {
		this.maxLimitDt = maxLimitDt;
	}

	public String getLimitDtNgFlg() {
		return limitDtNgFlg;
	}

	public void setLimitDtNgFlg(String limitDtNgFlg) {
		this.limitDtNgFlg = limitDtNgFlg;
	}
}