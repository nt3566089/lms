package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MDepositProductDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MSalesOrgDto;
import com.oneslogi.base.dto.PagingDto;

public class DepositProductMasterListDto extends PagingDto {

	public static MDepositProductDto chaseMDepositProduct() {
		return chaseMDepositProduct(new MDepositProductDto());
	}

	public static MDepositProductDto chaseMDepositProduct(MDepositProductDto dto) {
		dto.setMProduct(new MProductDto());
		dto.setMSalesOrg(new MSalesOrgDto());
		return dto;
	}

	public static class DepositProductListData implements Serializable {

		public MDepositProductDto head = chaseMDepositProduct();

		public List<MDepositProductDto> body = new ArrayList<MDepositProductDto>();
		
		public Long centerId = null;

	}

	public DepositProductListData data = new DepositProductListData();
}
