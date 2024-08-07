package com.oneslogi.ht.wms.dto.receive;

import javax.ws.rs.QueryParam;

import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 入荷検品格納(JAN入力)画面の情報を保持します。
 *
 */
public class ReceiveInspecStoreJanDto extends HandyBaseDto {

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja Start					

	/** J/商 */
	@QueryParam("productCd")
	public String productCd;

	// [#575] ValidateチェックのHT国際化 2017.02.10 sja End					

	/**
	 * @return productCd
	 */
	public String getProductCd() {
		return productCd;
	}

	/**
	 * @param productCd セットする productCd
	 */
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

}