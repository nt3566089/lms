//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.07.27 at 11:15:55 AM JST
//

package com.oneslogi.wms.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"resultCode",
		"printRequestId",
		"errorShippingNumberList"
})
@XmlRootElement(name = "retryPrintResponse")
public class RetryPrintResponse {

	@XmlElement(required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String resultCode;
	protected String printRequestId;
	protected ErrorShippingNumberList errorShippingNumberList;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getPrintRequestId() {
		return printRequestId;
	}

	public void setPrintRequestId(String printRequestId) {
		this.printRequestId = printRequestId;
	}

	public ErrorShippingNumberList getErrorShippingNumberList() {
		if (errorShippingNumberList == null) {
			return new ErrorShippingNumberList();
		}

		return errorShippingNumberList;
	}

	public void setErrorShippingNumberList(ErrorShippingNumberList errorShippingNumberList) {
		this.errorShippingNumberList = errorShippingNumberList;
	}

}
