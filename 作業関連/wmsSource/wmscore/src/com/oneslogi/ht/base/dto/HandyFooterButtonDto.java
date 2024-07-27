package com.oneslogi.ht.base.dto;


/**
 * 画面フッタ部のボタン要素を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyFooterButtonDto {

	private String type;
	private String key;
	private String url;
	private String value;
	
	/* 2015/05/11 INOUE ADD START 多機種対応 */
	/**
	 * ボタンキャプションの表示位置です。
	 * 左からの桁位置を指定します。 
	 */
	private String positionX;
	/**
	 * ボタンキャプションの表示位置です。
	 * 左からの桁位置を指定します。 
	 */
	private String positionY;
	/**
 	 * 文字のフォントサイズです。
 	 * 　1 – 10　： 縦横に1.5倍角(50%)ずつ拡大されます。
 	 * 　11 – 20　： 横に2倍角(100%)ずつ拡大されます。
 	 * 　21 – 30　： 縦に2倍角(100%)ずつ拡大されます。
	 */
	private String size;
	/**
	 * 
	 * BUTTONタグの水平方向への座標調整です。
	 * 　1/10xの幅ずつ移動するようになります
	 * 　1～9：右へ移動します。
	 * 　129～137：左へ移動します。
	 */
	private String adjusty;
	/**
	 * BUTTONタグの幅です。
	 */
	private String height;
	/**
	 * BUTTONタグの高さです。
	 */
	private String width;

	private String func;
	/* 2015/05/11 INOUE UPDATE END */
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	/* 2015/05/11 INOUE ADD START 多機種対応 */
	public String getPositionX() {
		return positionX;
	}
	public void setPositionX(String positionX) {
		this.positionX = positionX;
	}
	public String getPositionY() {
		return positionY;
	}
	public void setPositionY(String positionY) {
		this.positionY = positionY;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAdjusty() {
		return adjusty;
	}
	public void setAdjusty(String adjusty) {
		this.adjusty = adjusty;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getFunc() {
		return func;
	}
	public void setFunc(String func) {
		this.func = func;
	}
	/* 2015/05/11 INOUE UPDATE END */
}
