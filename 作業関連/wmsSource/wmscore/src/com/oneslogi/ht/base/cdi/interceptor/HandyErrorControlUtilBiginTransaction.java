package com.oneslogi.ht.base.cdi.interceptor;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyUtil;
import com.oneslogi.ht.base.dto.HandyCommonDialogDto;
import com.oneslogi.ht.base.util.HandyBaseUtil;
import com.oneslogi.ht.base.util.HandyKeyCodeUtil;
import com.oneslogi.ht.base.util.HandyScreenUtil;

/**
 * HandyErrorControlInterceptorでDBアクセスするためにトランザクションを開始して
 * 各Utilクラスを使用する
 */
@Transaction(Mode.BEGIN_TRANSACTION)
public class HandyErrorControlUtilBiginTransaction extends AbstractBase {

	@Inject
	@HandyUtil
	private HandyBaseUtil handyBaseUtil;
	@Inject
	private HandyScreenUtil screenUtil;
	@Inject
	private JspForwardLogic jspForwardLogic;
	@Inject
	private HandyKeyCodeUtil keyCodeUtil;

	public void loadViewTemplate() {
		handyBaseUtil.loadViewTemplate();
	}

	public void loadViewTemplate(String templateName, String headText) {
		handyBaseUtil.loadViewTemplate(templateName, headText);
	}

	public void loadViewTemplate(HttpServletRequest req, String templateName, String headText) {
		handyBaseUtil.loadViewTemplate(req, templateName, headText);
	}

	public void clearNextViewTemplateForceSetting() {
		handyBaseUtil.clearNextViewTemplateForceSetting();
	}

	public void clearNextViewTemplateForceSetting(HttpServletRequest req) {
		handyBaseUtil.clearNextViewTemplateForceSetting(req);
	}

	public void backupNextViewTemplateForceSettingIfNeed() {
		handyBaseUtil.backupNextViewTemplateForceSettingIfNeed();
	}

	public void restoreNextViewTemplateForceSettingIfNeed() {
		handyBaseUtil.restoreNextViewTemplateForceSettingIfNeed();
	}

	public void setOnSendErrorDialogFlg() {
		handyBaseUtil.setOnSendErrorDialogFlg();
	}

	public void setFooterRightButton(HttpSession ses, String type, String key, String url, String text) {
		handyBaseUtil.setFooterRightButton(ses, type, key, url, text);
	}

	public void clearFooterButton(HttpSession ses) {
		handyBaseUtil.clearFooterButton(ses);
	}

	public String getTransURL(HttpSession ses) {
		return handyBaseUtil.getTransURL(ses);
	}

	public String getMessage(String messageCd) {
		return handyBaseUtil.getMessage(messageCd);
	}

	public String getMessage(ErrorManager errorManager) {
		return handyBaseUtil.getMessage(errorManager);
	}

	public String splitText(String orgText) {
		return handyBaseUtil.splitText(orgText);
	}

	public String splitText(String orgText, int len) {
		return handyBaseUtil.splitText(orgText, len);
	}

	public void setCommonDialogMessage(HandyCommonDialogDto commonDialogDto, String... messages) {
		handyBaseUtil.setCommonDialogMessage(commonDialogDto, messages);
	}

	public String screenNm(String screenCd) {
		return screenUtil.screenNm(screenCd);
	}

	public String itemNm(String itemCd) {
		return screenUtil.itemNm(itemCd);
	}

	public String itemNm(String screenCd, String itemCd) {
		return screenUtil.itemNm(screenCd, itemCd);
	}

	protected void forward(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		jspForwardLogic.forward(url, request, response);
	}

	public String getKeyCode(String keyType) {
		return keyCodeUtil.getKeyCode(keyType);
	}

	public String getKeyLabelWithText(String keyType, String text) {
		return keyCodeUtil.getKeyLabelWithText(keyType, text);
	}
}
