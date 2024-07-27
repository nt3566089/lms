package com.oneslogi.ht.base.cdi.interceptor;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cdi.interceptor.AuthenticationBaseInterceptor;
import com.oneslogi.base.cookie.SessionDataImpl;
import com.oneslogi.base.resources.AuthenticationSsoResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.AuthenticationHandy;
import com.oneslogi.ht.base.cdi.annotation.HandyUtil;
import com.oneslogi.ht.base.dto.HandyCommonDialogDto;
import com.oneslogi.ht.base.dto.HandyLoginUserInfoBase;
import com.oneslogi.ht.base.enums.HtLoginMode;
import com.oneslogi.ht.base.resources.HandyLoginResourceBase;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.base.util.HandyBaseUtil;
import com.oneslogi.ht.base.util.HandyKeyCodeUtil;
import com.oneslogi.ht.base.util.HandyScreenUtil;
import com.oneslogi.wms.core.WmsCoreMessageConst;

/**
 * Handy用認証処理Interceptorクラス。
 * @author at.inoue.hx
 *
 */
@AuthenticationHandy
@Interceptor
public class AuthenticationHandyInterceptor extends AuthenticationBaseInterceptor {

	@Inject
	@HandyUtil
	private HandyBaseUtil logic;
	// [#2734][#2899] HT国際化対応 2017.11.28 kawana Start
	@Inject
	private HandyScreenUtil screenUtil;
	@Inject
	private HandyKeyCodeUtil keyCodeUtil;
	@Inject
	private JspForwardLogic jspForwardLogic;
	// [#2734][#2899] HT国際化対応 2017.11.28 kawana End

	@AroundInvoke
	public Object execute(final InvocationContext ic) throws Exception {

		// 前提条件チェック
		checkExtendBase(ic);

		// ネスト実行チェック
		if (isEnclosingMethodInvoke(ic)) {
			return ic.proceed();
		}

		return super.proceed(ic);
	}

	/**
	 * Cookie利用有無の判定
	 * @param ic
	 * @return
	 */
	@Override
	protected boolean checkUseCookie(final InvocationContext ic) {
		return false;
	}

	/**
	 * SSO利用有無の判定
	 * @param
	 * @return
	 */
	@Override
	protected boolean checkUseSso(final InvocationContext ic) {
		// Handy用の処理の場合、さらにログインモードを判定する。
		if (CU.equals(HtLoginMode.MAC.toString(), HandyLoginResourceBase.htLoginMode)) {
			// UserID & MacAddressによるHT独自認証の場合、SSOは使用しない。
			return false;
		} else {
			// 上記以外の場合、基底クラスの設定値に従う。
			return super.checkUseSso(ic);
		}
	}

	/**
	 * TokenCheck利用有無の判定
	 * @param ic
	 * @return
	 */
	@Override
	protected boolean checkUseTokenCheck(final InvocationContext ic) {
		return AuthenticationSsoResource.tokenCheck;
	}

	/**
	 * セッションデータを作成する。
	 * @param base
	 * @return
	 */
	@Override
	protected SessionDataImpl setSessionData(AbstractBase base) {
		HttpServletRequest req = base.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfoBase loginInfo = (HandyLoginUserInfoBase) ses.getAttribute("loginInfo");
		if (loginInfo == null) {
			return null;
		}

		return (SessionDataImpl) loginInfo.getSessionData();
	}

	/**
	 * トークンチェックエラー処理（未認証時/トークン異常時）
	 * @param ic
	 * @param request
	 * @param base
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Override
	protected Object tokenErrorProcess(final InvocationContext ic, HttpServletRequest request, AbstractBase base) throws Exception {

		// [#2969] HT国際化対応 2017.11.30 kawana Start

		// Tomcat再起動によりDB接続エラーでアプリケーションエラーと表示されてしまうためエラー画面に遷移する。
		try {

			// [#2969] HT国際化対応 2017.11.30 kawana End

			HttpSession ses = request.getSession();
			String message = logic.connectAndGetMessage(WmsCoreMessageConst.HANDY_SESSION_TIMEOUT);

			HandyCommonDialogDto dto = new HandyCommonDialogDto();
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start
			logic.setCommonDialogMessage(dto, message);
			// [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End
			ses.setAttribute("dialogDto", dto);

			logic.clearNextViewTemplateForceSetting(request);

			// [#2734][#2899][#2969] HT国際化対応 2017.11.30 kawana Start

			String errorDialogScreenCd = "CommonErrorDialogHT";
			logic.loadViewTemplate(HandyResourceBase.VIEW_TEMPLATE_ERROR, screenUtil.connectAndGetScreenNm(errorDialogScreenCd));

			logic.clearFooterButton(ses);
			String retURL = "initLogin";

			logic.setFooterRightButton(ses,
					HandyResourceBase.BUTTON_SEND_DATA_FINAL_FIELD_INPUT,
					keyCodeUtil.getKeyCode(HandyResourceBase.KEY_TYPE_ENTER),
					retURL,
					keyCodeUtil.getKeyLabelWithText(HandyResourceBase.KEY_TYPE_ENTER, screenUtil.connectAndGetItemNm(errorDialogScreenCd, "end")));

			jspForwardLogic.forward(HandyResourceBase.HT_URI_BASE + "/base/CommonDialog.jsp", request, base.getHttpServletResponse());

		} catch (Exception e) {
			logger.warn("An unexpected error has occurred.", e);
			jspForwardLogic.forward(HandyResourceBase.HT_URI_BASE + "/base/FatalError.jsp", request, base.getHttpServletResponse());
		}

		// [#2734][#2899][#2969] HT国際化対応 2017.11.30 kawana End

		return null;
	}

}
