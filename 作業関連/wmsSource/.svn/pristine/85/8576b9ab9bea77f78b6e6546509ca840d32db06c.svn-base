package com.oneslogi.wms.core;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import net.arnx.jsonic.JSON;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.base.cdi.interceptor.WorkLogLocal;
import com.oneslogi.wms.core.logic.common.WorkLogCheckLogic;

/**
 * ベースとなるクラスです。
 *
 * @author user
 *
 */
public abstract class AbstractWmsBase extends AbstractBase {

	public static final String ONESLOGI_WMS_CLIENT_ID_KEY_NAME = "ONEsLOGI_WMS_ClientId";
	public static final String ONESLOGI_WMS_CLIENT_CD_KEY_NAME = "ONEsLOGI_WMS_ClientCd";
	public static final String ONESLOGI_WMS_CLIENT_NM_KEY_NAME = "ONEsLOGI_WMS_ClientNm";
	public static final String ONESLOGI_WMS_USER_CLIENT_ID_KEY_NAME = "ONEsLOGI_WMS_UserClientId";
	public static final String ONESLOGI_WMS_CENTER_ID_KEY_NAME = "ONEsLOGI_WMS_CenterId";
	public static final String ONESLOGI_WMS_CENTER_CD_KEY_NAME = "ONEsLOGI_WMS_CenterCd";
	public static final String ONESLOGI_WMS_CENTER_NM_KEY_NAME = "ONEsLOGI_WMS_CenterNm";
	public static final String ONESLOGI_WMS_USER_CENTER_ID_KEY_NAME = "ONEsLOGI_WMS_UserCenterId";

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start

	// ===== 使用ロジッククラス =====

	@Inject
	WorkLogCheckLogic workLogCheckLogic;

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End

	/**
	 * ログインユーザが現在作業している荷主の荷主IDを取得
	 * @return 作業中の荷主ID
	 */
	public Long getClientId() {
		return Long.valueOf(this.getUserData().get(ONESLOGI_WMS_CLIENT_ID_KEY_NAME));
	}

	/**
	 * ログインユーザが現在作業している荷主の荷主CDを取得
	 * @return 作業中の荷主CD
	 */
	public String getClientCd() {
		return this.getUserData().get(ONESLOGI_WMS_CLIENT_CD_KEY_NAME);
	}

	/**
	 * ログインユーザが現在作業している荷主の荷主名称を取得
	 * @return 作業中の荷主名称
	 */
	public String getClientNm() {
		return this.getUserData().get(ONESLOGI_WMS_CLIENT_NM_KEY_NAME);
	}

	/**
	 * ログインユーザが扱うことの出来る荷主のリストを取得
	 * @return 荷主IDのリスト
	 */
	public List<Long> getUserClientIdList() {
		return JSON.decode(this.getUserData().get(ONESLOGI_WMS_USER_CLIENT_ID_KEY_NAME));
	}

	/**
	 * ログインユーザが現在作業しているセンタのセンタIDを取得
	 * @return 作業中のセンタID
	 */
	public Long getCenterId() {
		return Long.valueOf(this.getUserData().get(ONESLOGI_WMS_CENTER_ID_KEY_NAME));
	}

	/**
	 * ログインユーザが現在作業しているセンタのセンタIDを取得
	 * @return 作業中のセンタCD
	 */
	public String getCenterCd() {
		return this.getUserData().get(ONESLOGI_WMS_CENTER_CD_KEY_NAME);
	}

	/**
	 * ログインユーザが現在作業しているセンタのセンタ名称を取得
	 * @return 作業中のセンタ名称
	 */
	public String getCenterNm() {
		return this.getUserData().get(ONESLOGI_WMS_CENTER_NM_KEY_NAME);
	}

	/**
	 * ログインユーザが扱うことの出来るセンタのリストを取得
	 * @return センタIDのリスト
	 */
	public List<Long> getUserCenterIdList() {
		return JSON.decode(this.getUserData().get(ONESLOGI_WMS_USER_CENTER_ID_KEY_NAME));
	}

	/**
	 * 作業実績ログに出力する作業CDの末尾に指定された文字列を追加で設定
	 * @param workCd 作業CD（末尾追加分）
	 */
	public void appendWorkLogWorkCd(String workCd) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setWorkCd(CU.nullToStr(WorkLogLocal.get().getWorkCd()) + workCd);
	}

	/**
	 * 作業実績ログに出力する荷主CDを設定
	 * @param clientCd 荷主CD
	 */
	public void setWorkLogClientCd(String clientCd) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setClientCd(clientCd);
	}

	/**
	 * 作業実績ログに出力するセンタCDを設定
	 * @param centerCd センタCD
	 */
	public void setWorkLogCenterCd(String centerCd) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setCenterCd(centerCd);
	}

	// [#3274] WAS連携対応 2018.01.12 kawana Start

	/**
	 * 作業実績ログに出力するユーザCDを設定
	 * @param userCd ユーザCD
	 */
	public void setWorkLogUserCd(String userCd) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setUserCd(userCd);
	}

	// [#3274] WAS連携対応 2018.01.12 kawana End

	/**
	 * 作業実績ログに出力するトレース項目を設定
	 * @param traceItem トレース項目
	 */
	public void setWorkLogTraceItem(String traceItem) {
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana Start
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.08 kawana End
		WorkLogLocal.get().setTraceItem(traceItem);
	}

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana Start

	/**
	 * 作業中数量を取得
	 */
	public BigDecimal getWorkLogQty() {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		return CU.nullToZero(WorkLogLocal.get().getWorkQty());
	}

	/**
	 * 作業中数量を加算
	 * @param workQty 作業数量
	 */
	public void addWorkLogQty(Object workQty) {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setWorkQty(WCC.add(getWorkLogQty(), workQty));
		WorkLogLocal.get().setModifiedWorkData(true);
	}

	/**
	 * 作業実績ログに出力する作業数量を設定
	 * @param workQty 作業数量
	 */
	public void setWorkLogQty(Object workQty) {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setWorkQty(WCC.toBigDecimal(workQty));
		WorkLogLocal.get().setModifiedWorkData(true);
	}

	/**
	 * 作業完了をスキップする
	 */
	public void skipWorkLogEnd() {
		// アノテーションチェック
		workLogCheckLogic.checkAnnotation();
		WorkLogLocal.get().setSkipWorkLogEnd(true);
	}

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana End

	// [#5395][v3.1] 帳票最大桁の確認用モードの追加 2018.10.30 kawana Start

	/**
	 * <h2>帳票最大桁数確認モードかの判定.<h2>
	 * <pre>
	 * プロパティマスタの値が帳票最大桁数確認モードの場合はtrueを返却
	 * </pre>
	 * @return true:帳票最大桁数テストモード false:通常モード
	 */
	public boolean isReportMaxTest() {

		String testMode = getPropertyValue(WmsCorePropertyConst.REPORT_MAX_TEST_MODE);

		if ("test".equals(testMode)) {
			return true;
		}

		return false;
	}

	// [#5395][v3.1] 帳票最大桁の確認用モードの追加 2018.10.30 kawana End
}
