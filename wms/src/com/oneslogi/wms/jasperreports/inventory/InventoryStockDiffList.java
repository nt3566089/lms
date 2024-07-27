package com.oneslogi.wms.jasperreports.inventory;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

public class InventoryStockDiffList extends JRDefaultScriptlet {

	private int count = 1;
	private boolean isOneGroup = false;
	private int countinitpage = 0;
	private String location ="";
	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
	
		if(isOneGroup) {
			if(countinitpage == 1) {
				count  = 0;
				countinitpage ++;
			}
			this.variablesMap.get("countNo").setValue(++count);
			isOneGroup = false;
		}
		super.beforeGroupInit(groupName); 
	}

	@Override
	public void beforeDetailEval() throws JRScriptletException {
		isOneGroup = true;
		if(!this.fieldsMap.get("noScanReceiveLabelNo").getValue().toString().isEmpty()) {
			if(this.parametersMap.get("pLabel").getValue().toString().isEmpty()) {
				this.parametersMap.get("pLabel").setValue(this.fieldsMap.get("noScanReceiveLabelNo").getValue().toString());
			}else {
				this.parametersMap.get("pLabel").setValue(this.parametersMap.get("pLabel").getValue().toString() + "," +  this.fieldsMap.get("noScanReceiveLabelNo").getValue().toString());
			}
		}
		super.beforeDetailEval();
	}

	@Override
	public void beforePageInit() throws JRScriptletException {
		if(!location.equals(this.fieldsMap.get("locationCd").getValue().toString())) {
			count = 1;
			this.variablesMap.get("countNo").setValue(count);
		}
		location = this.fieldsMap.get("locationCd").getValue().toString();
		countinitpage++;
		isOneGroup = true;
		this.parametersMap.get("pLabel").setValue("");
		super.beforePageInit();
	}
}
