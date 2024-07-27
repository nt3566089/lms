package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MLocationDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class LocationMasterDto extends PagingDto {

	public static MLocationDto chaseMLocationDto() {
		return chaseMLocationDto(new MLocationDto());
	}

	public static MLocationDto chaseMLocationDto(MLocationDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMZone() == null ) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getMWarehouse() == null ) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}

		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa Start
		if (dto.getMProduct() == null ) {
			dto.setMProduct(new MProductDto());
		}
		// [1.1.4-CT-061] 検索条件に補充商品CDと補充商品未設定を追加 2016.06.03 ichikawa End
		return dto;
	}

	public static MLocationDto chaseMLocationBodyDto() {
		return chaseMLocationBodyDto(new MLocationDto());
	}

	public static MLocationDto chaseMLocationBodyDto(MLocationDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMZone() == null ) {
			dto.setMZone(new MZoneDto());
		}
		if (dto.getMZone().getMWarehouse() == null ) {
			dto.getMZone().setMWarehouse(new MWarehouseDto());
		}
		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja Start
		if (dto.getMProduct() == null) {
			dto.setMProduct(new MProductDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana Start
		if (dto.getMProduct().getMClient() == null) {
			dto.getMProduct().setMClient(new MClientDto());
		}
		// [#3484] 荷主のドロップダウンを追加 2018.02.27 kawana End
		if (dto.getMProductShapeByMaxStoreProductShapeId()== null) {
			dto.setMProductShapeByMaxStoreProductShapeId(new MProductShapeDto());
		}
		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		if (dto.getMProductShapeByReplenishPProductShapeId()== null) {
			dto.setMProductShapeByReplenishPProductShapeId(new MProductShapeDto());
		}

		// [Ver3.0] unit of measure対応 2017.12.12 han Del

		//[エンハンス PH2.0] ロケーションマスタメンテナンスの補充情報を追加 2015.11.20 sja End
		return dto;
	}

	public static class LocationMasterData implements Serializable {
		//検索条件
		public MLocationDto head = chaseMLocationDto();
		//検索結果
		public List<MLocationDto> body = new ArrayList<MLocationDto>();
		//空行
		public MLocationDto blankRow = chaseMLocationBodyDto();
	};

	public LocationMasterData data = new LocationMasterData();
}
