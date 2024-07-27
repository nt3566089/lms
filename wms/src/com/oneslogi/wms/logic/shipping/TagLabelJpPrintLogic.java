package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTShippingInstH;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷札JP発行ロジック
 */
public class TagLabelJpPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;


	/**
	 * <h2>荷札JPの発行(全件).</h2>
	 * <pre>
	 * 荷札JPNo.を発行する。
	 * 印刷後に荷札JPNo.発行フラグを発行済に更新する。
	 * 既に発行済の荷札JPも発行される。
	 *
	 * </pre>
	 *
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<TShippingInstH> printAll(Long controlNo, ErrorStatus errSts) {
		List<TShippingInstH> result = null;
		// 帳票出力データ取得処理
		TShippingInstHCB tShippingInstHCB = tShippingInstHBhv.newMyConditionBean();
		tShippingInstHCB.setupSelect_MDeliveryCourse();
		tShippingInstHCB.setupSelect_MCenter();
		tShippingInstHCB.setupSelect_TAllocInstH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH();
		tShippingInstHCB.setupSelect_TAllocInstH().withTPickingH().withTPickingRAsOne();
		// 検索条件の設定
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().queryTPickingRAsOne().setControlNo_Equal(controlNo);

		// ソート条件
		tShippingInstHCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		tShippingInstHCB.query().addOrderBy_ShippingDt_Asc();
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_DaihyoNizoroeNo2_Asc();
		tShippingInstHCB.query().queryTAllocInstH().queryTPickingH().addOrderBy_NizoroeNo2_Asc();

		result = tShippingInstHBhv.selectList(tShippingInstHCB);

		if (result.size() == 0) {
			this.getErrorManager().add(errSts,WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 出荷指示ボディを検索
		tShippingInstHBhv.loadTShippingInstBList(result, new ConditionBeanSetupper<TShippingInstBCB>() {
			public void setup(TShippingInstBCB subCB) {
				subCB.query().addOrderBy_WarehouseCd_Asc();
			}
		});

		tShippingInstHBhv.load(result, new ReferrerLoaderHandler<LoaderOfTShippingInstH>() {
			public void handle(LoaderOfTShippingInstH loader) {
				loader.pulloutTAllocInstH().loadTPackingHList(new ConditionBeanSetupper<TPackingHCB>() {
					// 梱包ヘッダを検索
					public void setup(TPackingHCB subCB) {
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().addOrderBy_ShippingPackingNo_Asc();
					}
				});
			}
		});

		return result;
	}
}
