//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.07.27 at 11:09:51 AM JST
//

package com.oneslogi.wms.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"itemCode",
		"itemPickingCode",
		"itemKosu",
		"itemName",
		"itemPrice",
		"subTotalPrice"
})
@XmlRootElement(name = "itemDetail")
public class ItemDetail {

	protected String itemCode;

	protected String itemPickingCode;

	protected Integer itemKosu;

	protected String itemName;

	protected Integer itemPrice;

	protected Integer subTotalPrice;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemPickingCode() {
		return itemPickingCode;
	}

	public void setItemPickingCode(String itemPickingCode) {
		this.itemPickingCode = itemPickingCode;
	}

	public Integer getItemKosu() {
		return itemKosu;
	}

	public void setItemKosu(Integer itemKosu) {
		this.itemKosu = itemKosu;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getSubTotalPrice() {
		return subTotalPrice;
	}

	public void setSubTotalPrice(Integer subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
	}

}
