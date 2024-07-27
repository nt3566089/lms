package com.oneslogi.wms.logic.master;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MDepositProductBhv;
import com.oneslogi.base.dbflute.exentity.MDepositProduct;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 預り商品マスタメンテナンス取得ロジッククラス
 */
public class DepositProductMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MDepositProductBhv mDepositProductBhv;
	
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>預り商品マスタ新規登録</h2>
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
	public void create(Long salesOrgId, Long productId, Long customerId, MDepositProduct depositProduct, Long centerId, ErrorStatus errStatus) {
		//預りJANCD 登録の場合に自動採番される
		String dJanCd = numberingCenterLogic.getNumberingCenter(centerId, "DEPOSIT_JAN_CD");
		
		
		// 新規登録
		MDepositProduct entity = new MDepositProduct();
		if(customerId != null) {
			//得意先CD
			entity.setAccountCd(depositProduct.getAccountCd());
		}
		//得意先ID
		entity.setAccountId(customerId);
		//商品ID
		entity.setProductId(productId);
		//販売組織ID
		entity.setSalesOrgId(salesOrgId);
		//預りJANCD
		entity.setDepositJanCd(dJanCd);
		//個体管理区分
		entity.setIdManagTypeCd(depositProduct.getIdManagTypeCd());
		mDepositProductBhv.insert(entity);
	}
}