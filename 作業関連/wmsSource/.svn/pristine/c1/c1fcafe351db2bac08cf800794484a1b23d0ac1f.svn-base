package com.oneslogi.ht.base.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.dbflute.hook.AccessContext;

import com.oneslogi.base.dbflute.exbhv.BCultureBhv;
import com.oneslogi.base.dbflute.exbhv.BUserBhv;
import com.oneslogi.base.enums.AuthMode;
import com.oneslogi.base.logic.login.LiteLoginLogic;
import com.oneslogi.base.resources.AuthenticationBaseResource;
import com.oneslogi.base.resources.AuthenticationSsoResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.validator.CommonValidator;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.cdi.annotation.HandyUtil;
import com.oneslogi.ht.base.dto.HandyLoginDto;
import com.oneslogi.ht.base.dto.HandyLoginPasswordDto;
import com.oneslogi.ht.base.enums.HtLoginMode;
import com.oneslogi.ht.base.util.HandyBaseUtil;
import com.oneslogi.wms.core.WmsCoreMessageConst;

/**
 * ハンディ用Resourceモジュールの基底クラスです。
 * @author hi.watanabe.mp
 *
 */
public abstract class HandyLoginResourceBase extends HandyResourceBase {

	public static final String TOKEN_KEY = "token.id";

	// HTログインモード
	public static String htLoginMode;

	static {
		Properties properties = new Properties();
		InputStream is = AuthenticationBaseResource.class.getClassLoader().getResourceAsStream("login.properties");

		try {
			properties.load(is);
			is.close();

			htLoginMode = properties.getProperty("htLoginMode", "1");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Inject
	private BCultureBhv bCultureBhv;
	@Inject
	private BUserBhv bUserBhv;

	@Inject
	@HandyUtil
	private HandyBaseUtil util;

	@Inject
	private LiteLoginLogic liteLoginLogic;

	/**
	 * 初期表示
	 * @throws Exception
	 */
	public void splash() {

		// HT国際化対応(メッセージマスタ連携) 2017.11.27 kawana
		//
		// 現在ログインする度に本メソッドが呼ばれるため、
		// 各マスタのキャッシュクリア (HandyMenuDataManager.splashなど)の
		// メソッドは呼出しない (該当コードを削除)
		//
		// マスタデータが変わった場合はシステム再起動が必要になるが、
		// 通常は変わらないため、動作速度を重視した方がよいと判断

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		util.setTransURL(HT_URI_BASE + "/base/splash.jsp", ses);
	}

	/**
	 * ログイン画面初期処理
	 * @throws Exception
	 */
	public void initLogin() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

		// 画面初期設定
		initScreen("LoginHT");

		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().url("login").itemCd("send").build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End

		//隠しボタン設定
		setHideButton(ButtonInfo.builder().url("login").build());

		util.setTransURL(HT_URI_BASE + "/base/HandyLogin.jsp", ses);

		// 画面側の表示制御のために、パスワード入力要否を渡す。
		req.setAttribute("NEED_PASSWORD_INPUT", checkNeedPasswordInput());
	}

	/**
	 * ログイン処理
	 * @param bean
	 * @throws Exception
	 */
	public void login(@BeanParam HandyLoginDto bean) throws Exception {
		// HTログインモードにより、認証方法を決める。
		if (CU.equals(HtLoginMode.MAC.toString(), htLoginMode)) {
			// ユーザID+MACアドレス認証
			authWithUserIdAndMacAddress(bean);
		} else {
			// 以外のモードの場合はこちら。
			if (CU.equals(AuthMode.SSO.toString(), AuthenticationBaseResource.authMode)) {
				// SSO認証
				authWithSSO(bean);
			} else {
				// ユーザID+MACアドレス認証
				authWithUserIdAndMacAddress(bean);
			}
		}
	}

	/**
	 * ログイン処理（SSO認証）
	 * @param bean ログイン画面情報保持DTO
	 * @throws Exception
	 */
	protected void authWithSSO(HandyLoginDto bean) throws Exception {
		String authTrustUrl = AuthenticationSsoResource.getAuthUrl();
		String authWithUser = authTrustUrl + "identity/authenticate?";

		// [#575] ValidateチェックのHT国際化 2017.01.18 kawana Start
		// 入力チェック結果確認
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.01.18 kawana End

		//入力されたユーザー・パスワードで認証(OpenAM)
		String loginUser = bean.getUser();
		String pass = bean.getPass();

		String realm = AuthenticationSsoResource.getRealm(this.getHttpServletRequest());
		String authReqUrl = authWithUser + "username=" + loginUser + "&password=" + pass + "&uri=realm=" + realm;

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(authReqUrl);
		Response response = target.request().get();
		String value = response.readEntity(String.class);

		// 属性チェック
		if (CU.isNullOrEmpty(value)) {
			throw new RuntimeException("Attributes can not be found.");
		}

		//Tokenを取得
		String[] list = value.split("\r\n|[\n\r]");
		String token = null;

		for (int i = 0; i < list.length; i++) {
			if (!CU.isNullOrEmpty(list[i]) && list[i].split("=").length > 1) {
				if (CU.equals(TOKEN_KEY, list[i].split("=")[0])) {
					token = list[i].split("=")[1];
					break;
				}
			}
		}

		// 認証エラー（ユーザ・パスワード不一致エラーなど）
		if (token == null || token.trim().length() <= 0) {
			String msg = util.getMessage("handyLoginAuthError");
			sendErrorScreen(msg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}

		// 認証情報取得
		String userCd = AuthenticationSsoResource.createOrReplaceUserData(bUserBhv, bCultureBhv, token, false);

		// ログイン処理（共通）
		authCommon(userCd);
	}

	/**
	 * ログイン処理（ユーザIDとMACアドレスによる認証）
	 * @param bean
	 * @throws Exception
	 */
	protected void authWithUserIdAndMacAddress(HandyLoginDto bean) throws Exception {

		// [#575] ValidateチェックのHT国際化(不要な変数削除) 2017.01.18 kawana

		if (bean.getHandyLoginPasswordDto() == null) {
			// パスワードがNULLならば、新しいオブジェクトを追加。
			bean.setHandyLoginPasswordDto(new HandyLoginPasswordDto(null));
		}

		// パスワードの入力要否を設定する。
		bean.getHandyLoginPasswordDto().setNeedInput(checkNeedPasswordInput());

		// [#575] ValidateチェックのHT国際化 2017.01.18 kawana Start
		// 入力チェック結果確認
		if (bean.isValidateErr()) {
			return;
		}

		// パスワードの必須チェック
		if (checkNeedPasswordInput()) {

			if (!CommonValidator.checkNecessary(bean.getPass(), "1")) {
				String msg = util.getMessage(WmsCoreMessageConst.HANDY_LOGIN_AUTH_ERROR);
				sendErrorScreen(msg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
				return;
			}

			//Entity共通項目設定メソッド登録
			// この処理は未認証で動く関係で、DBFluteAccessContextInterceptorではユーザCDが取れない。
			// そこで、最初はダミーを登録しておき(getUserCdがダミー値を返すように実装)、この段階で上書きする。
			// ※NULLの状態だと、インタセプターでエラーになる。
			if (CU.isNullOrEmpty(super.getUserCd())) {
				if (AccessContext.isExistAccessContextOnThread()) {
					AccessContext context = AccessContext.getAccessContextOnThread();
					context.setAccessUser(bean.getUser());
				}
			}

			// ユーザ認証
			LiteLoginLogic.UserAuthResult userAuthResult = liteLoginLogic.userAuth(bean.getUser(), bean.getPass());

			switch (userAuthResult) {
			case SUCCESS:
				// 成功。※エラー時は例外がスローされてメソッドから抜ける。
				break;

			default:
				// エラーとする。
				String msg = util.getMessage(WmsCoreMessageConst.HANDY_LOGIN_AUTH_ERROR);
				sendErrorScreen(msg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
				return;
			}

		}
		// [#575] ValidateチェックのHT国際化 2017.01.18 kawana End

		// ログイン処理（共通）
		authCommon(bean.getUser());
	}

	/**
	 * パスワードの入力要否を判定する。
	 * @param htLoginModeId
	 * @return
	 */
	protected static boolean checkNeedPasswordInput() {
		// HTログインモードにより、認証方法を決める。
		if (CU.equals(HtLoginMode.MAC.toString(), htLoginMode)) {
			// ユーザID+MACアドレス認証
			return false;
		} else {
			// 以外のモードの場合はこちら。
			if (CU.equals(AuthMode.SSO.toString(), AuthenticationBaseResource.authMode)) {
				// SSO認証
				return true;
			} else {
				// ユーザID+パスワード認証
				return true;
			}
		}
	}

	/**
	 * ログイン処理（共通）
	 * @param userCd
	 * @throws Exception
	 */
	protected abstract void authCommon(String userCd) throws Exception;

}
