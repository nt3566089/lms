package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MBoxDto;
import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class BoxMasterDto extends PagingDto {
	public static MBoxDto chaseMBoxDto() {
		return chaseMBoxDto(new MBoxDto());
	}

	public static MBoxDto chaseMBoxDto(MBoxDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		return dto;
	}

	public static class BoxMasterData implements Serializable {
		public MBoxDto head = chaseMBoxDto();
		public List<MBoxDto> list = new ArrayList<MBoxDto>();
		public MBoxDto blankRow = chaseMBoxDto();
	};

	public BoxMasterData data = new BoxMasterData();
}
