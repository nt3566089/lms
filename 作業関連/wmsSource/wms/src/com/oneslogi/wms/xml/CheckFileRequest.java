//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.07.27 at 11:53:32 AM JST
//

package com.oneslogi.wms.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"customerAuth",
		"printRequestIdList"
})
@XmlRootElement(name = "checkFileRequest")
public class CheckFileRequest {

	@XmlElement(required = true)
	protected CustomerAuth customerAuth;
	@XmlElement(required = true)
	protected PrintRequestIdList printRequestIdList;

	public CustomerAuth getCustomerAuth() {
		return customerAuth;
	}

	public void setCustomerAuth(CustomerAuth customerAuth) {
		this.customerAuth = customerAuth;
	}

	public PrintRequestIdList getPrintRequestIdList() {
		return printRequestIdList;
	}

	public void setPrintRequestIdList(PrintRequestIdList printRequestIdList) {
		this.printRequestIdList = printRequestIdList;
	}
}
