package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.wms.logic.shipping.TagLabelPrintLogic.TagLabelCls;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class TagLabelPrintParamDto extends PrintParamDto {

	public static class TagLabelPrintParamData implements Serializable {

		public Long centerId = null;
		public Long clientId = null;
		public String targetNo = null;
		public boolean isShippingPackingNo = false;
		public int tagLabelCls = TagLabelCls.TAG_PIECE.code();
		public List<Long> listReportId = new ArrayList<Long>();
		
		// ミドリ安全様向けカスタマイズ対応 dto項目追加 2024.7.15 張 Add [S]
		//public Integer tagLabelPrintFlg = null; 
		// ミドリ安全様向けカスタマイズ対応 dto項目追加 2024.7.15 張 Add [E]
	};

	public TagLabelPrintParamData data = new TagLabelPrintParamData();
}
