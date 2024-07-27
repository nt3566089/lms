package com.oneslogi.wms.core.logic.stockupdate;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TStoreNoCB;
import com.oneslogi.base.dbflute.exbhv.TStoreNoBhv;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 入庫ラベルNo採番ロジック
 */
public class StoreLabelNoNumberingLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStoreNoBhv tStoreNoBhv;

	// ===== 使用ロジック =====
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>入庫ラベルNoの採番.</h2>
	 * <pre>
	 * {@link NumberingCenterLogic#getNumbering(String) 採番ロジック.採番処理}を使用し、新しい入庫ラベルNoを採番・取得する。
	 * 採番した入庫ラベルNoが既にデータベース(入庫Noテーブル)に登録されている場合は再度、採番を行う。
	 *
	 * 【検索テーブル】
	 * ・入庫No
	 *
	 * 【使用ロジック】
	 * ・{@link NumberingCenterLogic#getNumbering(String) 採番ロジック.採番処理}
	 * <pre>
	 * @return 採番した入庫ラベルNo
	 */
	public String numbering() {

		String newNo;
		int count;

		do {
			newNo = numberingLogic.getNumbering(WmsCoreNumberingConst.STORE_LABEL_NO);
			// 既に使用されているか検索
			TStoreNoCB storeNoCb = tStoreNoBhv.newMyConditionBean();
			storeNoCb.query().setStoreLabelNo_Equal(newNo);
			count = tStoreNoBhv.selectCount(storeNoCb);

		} while (0 < count);

		return newNo;
	}
}
