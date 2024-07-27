package com.oneslogi.wms.jasperreports.inventory;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

public class StockDiffList extends JRDefaultScriptlet {

	private int count = 1;
	
	private boolean isChangePage = false;
	private boolean isOneGroup = false;
	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
		isChangePage = false;
		isOneGroup = true;
		super.beforeGroupInit(groupName); 
	}

	@Override
	public void beforeDetailEval() throws JRScriptletException {
		if(isChangePage && isOneGroup) {
			count++;
			this.variablesMap.get("countNo").setValue(count);
			isChangePage = false;
		}else if(isOneGroup) {
			count++;
			this.variablesMap.get("countNo").setValue(count);
			isOneGroup = false;
		}
		super.beforeDetailEval();
	}

	@Override
	public void beforePageInit() throws JRScriptletException {
		isChangePage = true;
		count = 1;
		this.variablesMap.get("countNo").setValue(count);
		super.beforePageInit();
	}
}
