package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.PagingDto;

public class LocationMasterEditDto extends PagingDto {

	// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana Start
	public static MLocationDto chaseMLocationDto() {
		return chaseMLocationDto(null);
	}

	public static MLocationDto chaseMLocationDto(MLocationDto dto) {
		if (dto == null) {
			dto = new MLocationDto();
		}
		// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana End
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMZone() == null) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getMWarehouse() == null) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		if (dto.getMProduct().getMClient() == null) {
			dto.getMProduct().setMClient(new MClientDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana Start
		if (dto.getMStockType() == null) {
			dto.setMStockType(new MStockTypeDto());
		}
		if (dto.getMCustomer() == null) {
			dto.setMCustomer(new MCustomerDto());
		}
		if (dto.getMProductShapeByReplenishPProductShapeId() == null) {
			dto.setMProductShapeByReplenishPProductShapeId(new MProductShapeDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		if (dto.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl() == null) {
			dto.getMProductShapeByReplenishPProductShapeId().setMShapeGrpDtl(new MShapeGrpDtlDto());
		}
		if (dto.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().getMShape() == null) {
			dto.getMProductShapeByReplenishPProductShapeId().getMShapeGrpDtl().setMShape(new MShapeDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		if (dto.getMProductShapeByMaxStoreProductShapeId() == null) {
			dto.setMProductShapeByMaxStoreProductShapeId(new MProductShapeDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		if (dto.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl() == null) {
			dto.getMProductShapeByMaxStoreProductShapeId().setMShapeGrpDtl(new MShapeGrpDtlDto());
		}
		if (dto.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().getMShape() == null) {
			dto.getMProductShapeByMaxStoreProductShapeId().getMShapeGrpDtl().setMShape(new MShapeDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End

		// [Ver3.0] unit of measure対応 2017.12.12 han Del
		// [ON推-品向-1138] 画面で使用しているDTOの作成を追加 2016.04.25 kawana End
		return dto;
	}

	public static class MLocationData implements Serializable {
		public MLocationDto head = chaseMLocationDto();
	};

	public MLocationData data = new MLocationData();
}
