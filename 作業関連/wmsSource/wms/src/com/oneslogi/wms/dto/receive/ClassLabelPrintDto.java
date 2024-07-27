package com.oneslogi.wms.dto.receive;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MWarehouseDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dto.TStoreRecordHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ClassLabelPrintDto extends PrintParamDto {

	public static TStoreRecordBDto chaseTStoreRecordBDto() {
		return chaseTStoreRecordBDto(new TStoreRecordBDto());
	}

	public static TStoreRecordBDto chaseTStoreRecordBDto(TStoreRecordBDto dto) {

		dto.setTStoreRecordH(new TStoreRecordHDto());

		dto.setTReceivePlanB(new TReceivePlanBDto());

		if (dto.getTStoreRecordH().getMCenter() == null) {
			dto.getTStoreRecordH().setMCenter(new MCenterDto());
		}
		if (dto.getTStoreRecordH().getMClient() == null) {
			dto.getTStoreRecordH().setMClient(new MClientDto());
		}
		if (dto.getTReceivePlanB().getMWarehouse() == null) {
			dto.getTReceivePlanB().setMWarehouse(new MWarehouseDto());
		}

		return dto;
	}

	public static class TStoreRecordBListData implements Serializable {

		//検索条件を入れるDTO
		public TStoreRecordBDto search = chaseTStoreRecordBDto();
	};

	public TStoreRecordBListData data = new TStoreRecordBListData();

	//入庫ラベルNo.
	private String storeLabelNo;

	public String getStoreLabelNo() {
		return storeLabelNo;
	}

	public void setStoreLabelNo(String storeLabelNo) {
		this.storeLabelNo = storeLabelNo;
	}

}