package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MDepositProductBhv;
import com.oneslogi.base.dbflute.exentity.MDepositProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 預り商品マスタメンテナンス取得ロジッククラス
 */
public class DepositProductMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MDepositProductBhv mDepositProductBhv;

	/**
	 * <h2>預り商品マスタ更新</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param salesOrgId 販売組織ID
	 * @param productId 商品ID
	 * @param productId 得意先ID
	 * @param depositProduct 預り商品マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(Long salesOrgId, Long productId, Long customerId, MDepositProduct depositProduct, ErrorStatus errStatus) {
		//得意先ID
		depositProduct.setAccountId(customerId);
		//得意先CD
		depositProduct.setAccountCd(depositProduct.getAccountCd());
		//商品ID
		depositProduct.setProductId(productId);
		//販売組織ID
		depositProduct.setSalesOrgId(salesOrgId);
		// 預り商品ID
		mDepositProductBhv.update(depositProduct);
	}
}