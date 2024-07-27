package com.oneslogi.ht.base.dto;

import java.util.List;

/**
 * 画面フッタ部の情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyFooterdDto {

	private HandyFooterButtonDto leftButton;
	private List<HandyFooterButtonDto> rightButton;

	/* 2015/04/28 KAI ADD START 多機種対応 フッター上段のボタンも設定可能に */
	//フッター左上ボタン
	private HandyFooterButtonDto optionButton1;
	//フッター右上ボタン
	private HandyFooterButtonDto optionButton2;
	//フッター非表示ボタン
	private HandyFooterButtonDto hideButton;
	/* 2015/04/28 KAI ADD END */

	public HandyFooterButtonDto getLeftButton() {
		return leftButton;
	}
	public void setLeftButton(HandyFooterButtonDto leftButton) {
		this.leftButton = leftButton;
	}
	public List<HandyFooterButtonDto> getRightButton() {
		return rightButton;
	}
	public void setRightButton(List<HandyFooterButtonDto> rightButton) {
		this.rightButton = rightButton;
	}
	public HandyFooterButtonDto getOptionButton1() {
		return optionButton1;
	}
	public void setOptionButton1(HandyFooterButtonDto optionButton1) {
		this.optionButton1 = optionButton1;
	}
	public HandyFooterButtonDto getOptionButton2() {
		return optionButton2;
	}
	public void setOptionButton2(HandyFooterButtonDto optionButton2) {
		this.optionButton2 = optionButton2;
	}
	public HandyFooterButtonDto getHideButton() {
		return hideButton;
	}
	public void setHideButton(HandyFooterButtonDto hideButton) {
		this.hideButton = hideButton;
	}


}
