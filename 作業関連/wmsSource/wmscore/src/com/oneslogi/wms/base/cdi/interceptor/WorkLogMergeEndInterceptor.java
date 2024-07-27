package com.oneslogi.wms.base.cdi.interceptor;

import javax.enterprise.inject.spi.CDI;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.core.logic.common.WorkLogLogic;

/**
 * 作業実績ログ出力制御用のInterceptorクラス。
 *
 * @author ko-yamamoto
 *
 */
@WorkLogMergeEnd("")
@Interceptor
public class WorkLogMergeEndInterceptor extends WorkLogBaseInterceptor {

	/**
	 * 作業実績ログ出力制御を行う割り込み処理。
	 *
	 * @param ic
	 * @return
	 * @throws Exception
	 */
	@AroundInvoke
	public Object execute(final InvocationContext ic) throws Exception {
		try {
			Object obj = super.proceed(ic);

			// エラーがある場合は何もしない
			AbstractBase base = (AbstractBase) ic.getTarget();
			if (base.getErrorManager().size() > 0) {
				return obj;
			}

			// 数量が未設定の場合は何もしない
			if (WorkLogLocal.get().getWorkQty() == null) {
				return obj;
			}

			// DBへの処理は、CDIコンテナ経由で初期化したLogicを経由させる
			WorkLogLogic logic = CDI.current().select(WorkLogLogic.class).get();

			if (WorkLogLocal.get().isSkipWorkLogEnd()) {
				// 終了はスキップ => 作業中データ更新

				if (WorkLogLocal.get().isModifiedWorkData()) {
					logic.updateWorkData(WorkLogLocal.get());
				}
			} else {
				// 終了処理

				logic.mergeEnd(WorkLogLocal.get());
			}

			return obj;

		} finally {
			WorkLogLocal.clear();
		}
	}

}