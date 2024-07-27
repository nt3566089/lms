package com.oneslogi.wms.dto.inventory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MParamDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dto.TInventoryBDto;
import com.oneslogi.base.dbflute.dto.TInventoryHDto;
import com.oneslogi.base.dbflute.dto.TInventoryInstDto;
import com.oneslogi.base.dbflute.dto.TStoreNoDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryCreateDto extends PagingDto {

	public static TInventoryHDto chaseInventoryHDto() {
		return chaseInventoryHDto(new TInventoryHDto());
	}

	public static TInventoryHDto chaseInventoryHDto(TInventoryHDto dto) {

		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}

		return dto;
	}

	public static TInventoryBDto chaseInventoryBDto() {
		return chaseInventoryBDto(new TInventoryBDto());
	}

	public static TInventoryBDto chaseInventoryBDto(TInventoryBDto dto) {
		if (dto.getTInventoryH() == null) {
			dto.setTInventoryH(new TInventoryHDto());
		}
		if (dto.getTInventoryH().getMClient() == null) {
			dto.getTInventoryH().setMClient(new MClientDto());
		}
		if (dto.getTInventoryH().getMCenter() == null) {
			dto.getTInventoryH().setMCenter(new MCenterDto());
		}
		if (dto.getMWarehouse() == null) {
			dto.setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		if (dto.getMCustomerByDepositId()== null) {
			dto.setMCustomerByDepositId(new MCustomerDto());
		}
		if (dto.getMCustomerBySupplierId()== null) {
			dto.setMCustomerBySupplierId(new MCustomerDto());
		}
		if (dto.getMLocation() == null) {
			dto.setMLocation(new MLocationDto());
		}
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMStockType().getVDict() == null) {
			dto.getMStockType().setVDict(new VDictDto());
		}
		if (dto.getTStoreNo() == null) {
			dto.setTStoreNo(new TStoreNoDto());
		}
		if (dto.getTStoreNo().getMCustomer() == null) {
			dto.getTStoreNo().setMCustomer(new MCustomerDto());
		}
		return dto;
	}

	public static TInventoryInstDto chaseTInventoryInstDto() {
		return chaseTInventoryInstDto(new TInventoryInstDto());
	}

	public static TInventoryInstDto chaseTInventoryInstDto(TInventoryInstDto dto) {
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if (dto.getMZone() == null) {
			dto.setMZone(new MZoneDto());
		}
		return dto;
	}

	public static class InventoryCreateData implements Serializable {
		public TInventoryHDto head = chaseInventoryHDto();
		public TInventoryBDto body = chaseInventoryBDto();
		public TInventoryInstDto Inst = chaseTInventoryInstDto();
		public List<TInventoryBDto> bodyList = new ArrayList<TInventoryBDto>();
		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana Start
		public MParamDto param = new MParamDto();
		// [#4705][v3.0] 入庫日管理フラグに沿った重複チェックに修正 2018.06.12 kawana End

		public TInventoryBDto blankRow = chaseInventoryBDto();
		// [#1076] 行追加で既登録エラー発生(商品CDが前方一致で検索されるため) 2017.03.07 kawana Start
		public boolean isAddRow = false;
		// [#1076] 行追加で既登録エラー発生(商品CDが前方一致で検索されるため) 2017.03.07 kawana End
	};


	public InventoryCreateData data = new InventoryCreateData();

}
