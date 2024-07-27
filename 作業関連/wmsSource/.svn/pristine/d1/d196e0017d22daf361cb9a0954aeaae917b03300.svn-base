package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.BClassDtlDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dto.PagingDto;

public class CustomerMasterListDto extends PagingDto {

	public static MCustomerDto chaseMCustomerDto() {
		return chaseMCustomerDto(new MCustomerDto());
	}

	public static MCustomerDto chaseMCustomerDto(MCustomerDto dto) {
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		if(dto.getBClassDtlByDeliveryFlg()==null){

			dto.setBClassDtlByDeliveryFlg(new BClassDtlDto());
		}
		if(dto.getVendorFlg()==null){

			dto.setBClassDtlByVendorFlg(new BClassDtlDto());
		}

		if(dto.getOnetimeFlg()==null){

			dto.setBClassDtlByOnetimeFlg(new BClassDtlDto());
		}

		if(dto.getDepositFlg()==null){

			dto.setBClassDtlByDepositFlg(new BClassDtlDto());
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		return dto;
	}

	public static class MStopListData implements Serializable {
		public MCustomerDto head = chaseMCustomerDto();
		public List<MCustomerDto> body = new ArrayList<MCustomerDto>();
	};

	public MStopListData data = new MStopListData();

}
