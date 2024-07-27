package com.oneslogi.wms.base.cdi.interceptor;

import javax.enterprise.inject.spi.CDI;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.wms.base.cdi.annotation.WorkLogData;
import com.oneslogi.wms.core.logic.common.WorkLogLogic;

/**
 * 作業実績ログ出力制御用のInterceptorクラス。
 *
 */
@WorkLogData("")
@Interceptor
public class WorkLogDataInterceptor extends WorkLogBaseInterceptor {

	/**
	 * 作業実績ログ出力制御を行う割り込み処理。
	 *
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	@AroundInvoke
	public Object execute(final InvocationContext ic) throws Exception {

		Object obj = super.proceed(ic);

		// エラーがある場合は何もしない
		AbstractBase base = (AbstractBase) ic.getTarget();
		if (base.getErrorManager().size() > 0) {
			return obj;
		}

		if (!WorkLogLocal.get().isModifiedWorkData()) {
			// 変更不要
			return obj;
		}

		// DBへの処理は、CDIコンテナ経由で初期化したLogicを経由させる
		WorkLogLogic logic = CDI.current().select(WorkLogLogic.class).get();
		logic.updateWorkData(WorkLogLocal.get());

		return obj;
	}

}