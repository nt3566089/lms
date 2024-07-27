package com.oneslogi.wms.base.cdi.interceptor;

import javax.enterprise.inject.spi.CDI;
import javax.interceptor.InvocationContext;
import javax.servlet.http.HttpSession;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.cdi.interceptor.AbstractInterceptor;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.dto.HywayDefaultParamDto;
import com.oneslogi.wms.base.cdi.annotation.WorkLogData;
import com.oneslogi.wms.base.cdi.annotation.WorkLogEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStartEnd;
import com.oneslogi.wms.core.AbstractWmsBase;
import com.oneslogi.wms.core.logic.common.WorkLogLogic;

/**
 * 作業実績ログ出力制御用のInterceptorクラス。
 */
public abstract class WorkLogBaseInterceptor extends AbstractInterceptor {

	/**
	 * 主処理開始。
	 *
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	protected Object proceed(final InvocationContext ic) throws Exception {

		// ===== 前処理 =====

		// 前提条件チェック
		checkExtendBase(ic);

		// ネスト実行チェック
		if (isEnclosingMethodInvoke(ic)) {
			return ic.proceed();
		}

		//メイン処理
		AbstractBase base = (AbstractBase) ic.getTarget();

		WorkLogLocal.clear();

		// 対象クラスのアノテーションを抽出
		boolean findClass = false;
		if (ic.getTarget().getClass().isAnnotationPresent(WorkLogData.class)) {
			// クラスのアノテーションは重複のチェックはしない
			findClass = setWorkCd(ic.getTarget().getClass().getAnnotation(WorkLogData.class).value(), findClass);
		}

		String workCdClass = null;
		if (findClass) {
			workCdClass = WorkLogLocal.get().getWorkCd();
		}

		// 作業中データ更新の実行制御
		boolean doUpdateWorkData = true;
		// 対象メソッドのアノテーションを抽出
		boolean findMethod = false;
		// 作業開始アノテーション
		boolean isWorkStart = false;
		// 作業終了アノテーション
		boolean isWorkEnd = false;

		if (ic.getMethod().getAnnotation(WorkLogStart.class) != null) {
			findMethod = setWorkCd(ic.getMethod().getAnnotation(WorkLogStart.class).value(), findMethod);
			doUpdateWorkData = false;
			isWorkStart = true;
		}

		if (ic.getMethod().getAnnotation(WorkLogStartEnd.class) != null) {
			findMethod = setWorkCd(ic.getMethod().getAnnotation(WorkLogStartEnd.class).value(), findMethod);
			doUpdateWorkData = false;
			isWorkStart = true;
		}

		if (ic.getMethod().getAnnotation(WorkLogMergeEnd.class) != null) {
			findMethod = setWorkCd(ic.getMethod().getAnnotation(WorkLogMergeEnd.class).value(), findMethod);
			doUpdateWorkData = false;
			isWorkEnd = true;
		}

		if (ic.getMethod().getAnnotation(WorkLogEnd.class) != null) {
			findMethod = setWorkCd(ic.getMethod().getAnnotation(WorkLogEnd.class).value(), findMethod);
			doUpdateWorkData = false;
			isWorkEnd = true;
		}

		if (ic.getMethod().isAnnotationPresent(WorkLogData.class)) {
			findMethod = setWorkCd(ic.getMethod().getAnnotation(WorkLogData.class).value(), findMethod);
		}

		if (CU.isNullOrEmpty(WorkLogLocal.get().getWorkCd())) {
			throw new RuntimeException("The value of annotation related to [WorkLog] is empty.");
		}

		String workCdMethod = null;
		if (findMethod) {
			workCdMethod = WorkLogLocal.get().getWorkCd();
		}

		if (!CU.isNullOrEmpty(workCdClass) && !CU.isNullOrEmpty(workCdMethod)) {
			// クラスの作業CD、メソッドの作業CDともに設定

			if (!workCdClass.equals(workCdMethod)) {
				// 作業CD不正
				throw new RuntimeException("Annotation related to [WorkLog] is invalid.");
			}
		}

		WorkLogLocal.get().setClientCd(base.getUserData().get(AbstractWmsBase.ONESLOGI_WMS_CLIENT_CD_KEY_NAME));
		WorkLogLocal.get().setCenterCd(base.getUserData().get(AbstractWmsBase.ONESLOGI_WMS_CENTER_CD_KEY_NAME));
		WorkLogLocal.get().setUserCd(base.getUserCd());

		HttpSession ses = base.getHttpServletRequest().getSession(false);
		if (ses != null) {
			Object obj = ses.getAttribute("defDto");

			if (obj != null && obj instanceof HywayDefaultParamDto) {
				HywayDefaultParamDto retDto = (HywayDefaultParamDto) obj;
				WorkLogLocal.get().setMacAddress(retDto.getHtUniqueId());
			}
		}

		if (!isWorkStart) {
			// 作業開始の場合は作業中数の設定はしない

			// 作業中数の取得
			WorkLogLogic logic = CDI.current().select(WorkLogLogic.class).get();
			WorkLogLocal.get().setWorkQty(logic.selectQty(WorkLogLocal.get()));
		}

		// ===== 処理実行 =====

		Object obj = ic.proceed();

		// ===== 後処理 =====

		if (!doUpdateWorkData) {
			// 作業実績の登録・更新がある場合

			if (!(isWorkEnd && WorkLogLocal.get().isSkipWorkLogEnd())) {
				// 作業終了タグがあるけど処理スキップの場合「以外」

				// 作業中データの更新不要 ⇒ 変更フラグをfalseに設定
				WorkLogLocal.get().setModifiedWorkData(false);
			}
		}

		return obj;
	}

	private boolean setWorkCd(String workCd, boolean find) {
		if (workCd != null) {
			if (find) {

				throw new RuntimeException("Annotation related to [WorkLog] is invalid.");
			}
			WorkLogLocal.get().setWorkCd(workCd);
			return true;
		}
		return find;
	}

}
