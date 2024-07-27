package com.oneslogi.ht.base.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * テンプレート管理DTOです。
 * @author at.inoue.hx
 *
 */
public class HandyViewTemplateDto implements Serializable {
	private HandyHeaderDto header = null;

	private List<HandyTagHintDto> tagHintList = null;

	public HandyViewTemplateDto() {
		this.header = new HandyHeaderDto();
		this.tagHintList = new ArrayList<HandyTagHintDto>();
	}

	/**
	 * ヒントタグを追加します。
	 * ヒントタグはリストで保持しています。
	 * このメソッドで追加を行うと、リストの最後に追加されます。
	 * @param tagHintDto
	 */
	public void addTagHint(HandyTagHintDto tagHintDto) {
		tagHintList.add(tagHintDto);
	}

	public HandyHeaderDto getHeader() {
		return header;
	}

	public void setHeader(HandyHeaderDto header) {
		this.header = header;
	}

	public List<HandyTagHintDto> getTagHintList() {
		return tagHintList;
	}

	/**
	 * 名前を指定してヒントタグ定義を取得します。
	 * @param name
	 */
	public HandyTagHintDto getTagHintByName(String name) {
		HandyTagHintDto dto = null;

		for (HandyTagHintDto tmp : tagHintList) {
			if (tmp.getName().equals(name)) {
				dto = tmp;
			}
		}

		/* 2015/06/09 INOUE DELETE START 色・音の適用 */
		// 以下があると設定が適用されないため、削除（不具合）
//		if (dto==null) {
//			dto =  new HandyTagHintDto(name);
//			addTagHint(dto);
//		}
		/* 2015/06/09 INOUE DELETE END */

		return dto;
	}

	/**
	 * ヒントタグの追加/更新を行います。
	 * 既にnameに該当するヒントタグが存在していた場合は、
	 * 追加を行わずに当該のタグを更新します。
	 * @param name
	 * @param vibrator
	 * @param greenLed
	 * @param redLed
	 * @param buzzer
	 * @param time
	 * @param delay
	 * @param count
	 */
	public void setTagHint(
			String name,
			boolean vibrator,
			boolean greenLed,
			boolean redLed,
			boolean buzzer,
			int time,
			int delay,
			int count) {

		HandyTagHintDto hint = getTagHintByName(name);
		if (hint==null) {
			hint = new HandyTagHintDto(name);
			tagHintList.add(hint);
		}

		hint.setVibrator(vibrator);

		hint.setGreenLed(greenLed);

		hint.setRedLed(redLed);

		hint.setBuzzer(buzzer);

		hint.setTime(time);

		hint.setDelay(delay);

		hint.setCount(count);
	}

	/* 2015/06/11 INOUE ADD START 色・音の適用 */
	public void copyAttributes(HandyViewTemplateDto from) {
		header.copyAttributes(from.getHeader());

		// 先頭に差し込む。
		// nullは想定しない。戻り値は無視。
		tagHintList.clear();
		tagHintList.addAll(from.getTagHintList());
	}
	/* 2015/06/11 INOUE ADD END */
}
