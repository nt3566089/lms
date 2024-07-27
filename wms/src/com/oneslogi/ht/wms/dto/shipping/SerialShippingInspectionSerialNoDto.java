package com.oneslogi.ht.wms.dto.shipping;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(ｼﾘｱﾙ)画面情報を保持します
 *
 */
public class SerialShippingInspectionSerialNoDto extends HandyBaseDto {

	/** ｼﾘｱﾙNo. */
	@QueryParam("serialNo")
	private String serialNo;

	/**
	 * @return the serialNo
	 */
	public String getSerialNo() {
		return serialNo;
	}

	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End