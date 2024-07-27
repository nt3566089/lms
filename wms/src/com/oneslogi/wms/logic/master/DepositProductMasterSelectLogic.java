package com.oneslogi.wms.logic.master;

import java.util.Optional;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MCustomerCB;
import com.oneslogi.base.dbflute.cbean.MDepositProductCB;
import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MSalesOrgCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MCustomerBhv;
import com.oneslogi.base.dbflute.exbhv.MDepositProductBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MSalesOrgBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDepositProduct;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSalesOrg;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 預り商品マスタメンテナンス取得ロジッククラス
 */
public class DepositProductMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MDepositProductBhv mDepositProductBhv;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	@Inject
	private MSalesOrgBhv mSalesOrgBhv;
	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private MCustomerBhv mCustomerBhv;
	

	/**
	 * <h2>預り商品マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param head 預り商品マスタ：センタCD・販売組織CD・得意先CD・商品CD・預りJANCD・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MDepositProduct> 預り商品マスタリスト
	 */
	public PagingResultBean<MDepositProduct> selectByConditions(MDepositProduct head, PagingData paging, ErrorStatus errSts) {

		//センタCd取得
		String centerCd = head.getCenterCd();
		//販売組織CD
		String salesOrgCd = head.getMSalesOrg().getSalesOrgCd();
		//得意先cd
		String accountCd = head.getAccountCd();
		//商品CD
		String productCd = head.getMProduct().getProductCd();
		//預りJANCD
		String depositJanCd = head.getDepositJanCd();
		//削除フラグ
		String delFlg = head.getDelFlg();
		
		//センタCD
		//センタ名称
		//センタID
		MCenterCB centerCb = mCenterBhv.newConditionBean();
		centerCb.specify().columnCenterCd();
		centerCb.specify().columnCenterNm();
		centerCb.specify().columnCenterId();
		centerCb.query().setCenterCd_Equal(centerCd);
		MCenter center = mCenterBhv.selectEntity(centerCb);
		
		// ===== 一覧データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MDepositProductCB cb = mDepositProductBhv.newMyConditionBean();

		cb.setupSelect_MSalesOrg();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MProduct();
		//販売組織CD取得
		cb.specify().specifyMSalesOrg().columnSalesOrgCd();
		//販売組織名称取得
		cb.specify().specifyMSalesOrg().columnTenhanshaNm1();
		//得意先CD取得
		cb.specify().columnAccountCd();
		//得意先名称取得
		cb.specify().specifyMCustomer().columnCustomerNm();
		//商品CD取得
		cb.specify().specifyMProduct().columnProductCd();
		//商品名称取得
		cb.specify().specifyMProduct().columnProductNm();
		//預りJANCD取得
		cb.specify().columnDepositJanCd();
		//個体管理区分CD取得
		cb.specify().columnIdManagTypeCd();
		//削除フラグCD取得
		cb.specify().columnDelFlg();
		//預り商品ID取得
		cb.specify().columnDepositProductId();
		
		// 販売組織CDの設定
		cb.query().queryMSalesOrg().setSalesOrgCd_PrefixSearch(salesOrgCd);
		// 得意先Cdの設定
		cb.query().setAccountCd_Equal(accountCd);
		// 商品CDの設定
		cb.query().queryMProduct().setProductCd_PrefixSearch(productCd);
		// 預りJANCDの設定
		cb.query().setDepositJanCd_PrefixSearch(depositJanCd);
		// 削除フラグの設定
		cb.query().setDelFlg_Equal(delFlg);
		// センタIDの設定
		cb.query().queryMCustomer().setCenterId_Equal(center.getCenterId());
		// ソート順の設定
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();

		// ===== センタマスタ検索実行 =====
		PagingResultBean<MDepositProduct> selectList = selectPage(mDepositProductBhv, cb, paging);

		selectList.forEach(entity -> {
			entity.setCenterCd(center == null ? "" : center.getCenterCd());
			entity.setCenterNm(center == null ? "" : center.getCenterNm());
			//個体管理区分名称初期化
			entity.setIdManagTypeNm("");
			if(entity.getIdManagTypeCd() != null && !entity.getIdManagTypeCd().isEmpty()) {
				//個体管理区分名称取得
				BClassDtlCB classCb = bClassDtlBhv.newConditionBean();
				classCb.setupSelect_BClass();
				classCb.setupSelect_VDict(getCultureId());

				classCb.specify().columnClassDtlCd();
				classCb.specify().specifyVDict().columnDictNm();

				classCb.query().queryBClass().setClassCd_Equal("ID_MANAG_TYPE");//IT_MANAG_TYPE
				classCb.query().setClassDtlCd_Equal(entity.getIdManagTypeCd());
				Optional.ofNullable(bClassDtlBhv.selectEntity(classCb)).ifPresent(o -> entity.setIdManagTypeNm(o.getVDict().getDictNm()));
			}
			//削除フラグ名称初期化
			entity.setDelFlgNm("");
			if(entity.getDelFlg() != null && !entity.getDelFlg().isEmpty()) {
				//削除フラグ名称取得
				BClassDtlCB classCb = bClassDtlBhv.newConditionBean();
				classCb.setupSelect_BClass();
				classCb.setupSelect_VDict(getCultureId());

				classCb.specify().columnClassDtlCd();
				classCb.specify().specifyVDict().columnDictNm();

				classCb.query().queryBClass().setClassCd_Equal("DEL_FLG");
				classCb.query().setClassDtlCd_Equal(entity.getDelFlg());
				Optional.ofNullable(bClassDtlBhv.selectEntity(classCb)).ifPresent(o -> entity.setDelFlgNm(o.getVDict().getDictNm()));
			}
		});
		
		
		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		
		// ===== ０件チェック =====
		if (selectList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return selectList;
	}

	/**
	 * <h2>預り商品マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param id 預り商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MDepositProduct 預り商品マスタ
	 */

	public MDepositProduct selectById(Long id, ErrorStatus errStatus) {
		// ===== 一覧データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MDepositProductCB cb = mDepositProductBhv.newMyConditionBean();

		cb.setupSelect_MSalesOrg();
		cb.setupSelect_MCustomer();
		cb.setupSelect_MProduct();
		// 預り商品IDの設定
		cb.query().setDepositProductId_Equal(id);

		// ===== センタマスタ検索実行 =====
		MDepositProduct depositProduct = mDepositProductBhv.selectEntity(cb);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (depositProduct == null) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return depositProduct;
	}

	/**
	 * <h2>販売組織マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件に販売組織マスタ情報を取得する。
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param depositProduct 預り商品マスタ:販売組織CD
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MSalesOrg 販売組織マスタ
	 */

	public MSalesOrg selectBySalesOrgCd(MDepositProduct depositProduct, ErrorStatus errStatus) {
		String salesOrgCd = depositProduct.getMSalesOrg().getSalesOrgCd();
		MSalesOrgCB cb = mSalesOrgBhv.newConditionBean();
		cb.specify().columnSalesOrgId();
		cb.query().setSalesOrgCd_Equal(salesOrgCd);
		MSalesOrg selectEntity = mSalesOrgBhv.selectEntity(cb);
		// ===== ０件チェック =====
		if (selectEntity == null) {
			this.getErrorManager().add(errStatus, WmsMessageConst.SALES_ORG_CD_NOT_FOUND_IN_MASTER_ERROR);
		}
		return selectEntity;
	}
	
	/**
	 * <h2>商品マスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param depositProduct 預り商品マスタ:商品CD,荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MProduct 商品マスタ
	 */

	public MProduct selectByProductCd(MDepositProduct depositProduct, ErrorStatus errStatus) {
		String productCd = depositProduct.getMProduct().getProductCd();
		MProductCB cb = mProductBhv.newConditionBean();
		cb.specify().columnProductId();
		cb.query().setProductCd_Equal(productCd);
		cb.query().setClientId_Equal(depositProduct.getClientId());
		MProduct selectEntity = mProductBhv.selectEntity(cb);
		// ===== ０件チェック =====
		if (selectEntity == null) {
			this.getErrorManager().add(errStatus, WmsMessageConst.PRODUCT_CD_NOT_FOUND_ERROR);
		}
		return selectEntity;
	}
	
	/**
	 * <h2>得意先IDを取得する。</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param salesOrgId 販売組織ID
	 * @param depositProduct 預り商品マスタ:商品CD,荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MCustomer 取引先マスタ
	 */
	public MCustomer selectAccount(Long salesOrgId, MDepositProduct depositProduct, ErrorStatus errStatus) {
		MCenterCB centerCb = mCenterBhv.newConditionBean();
		centerCb.specify().columnCenterId();
		centerCb.query().setCenterCd_Equal(depositProduct.getCenterCd());
		MCenter center = mCenterBhv.selectEntity(centerCb);
		String accountCd = depositProduct.getAccountCd();
		MCustomerCB cb = mCustomerBhv.newConditionBean();
		cb.specify().columnCustomerId();
		cb.query().setCustomerCd_Equal(accountCd);
		cb.query().setSalesOrgId_Equal(salesOrgId);
		cb.query().setCenterId_Equal(center.getCenterId());
		cb.query().setClientId_Equal(depositProduct.getClientId());
		MCustomer customer = mCustomerBhv.selectEntity(cb);
		// ===== ０件チェック =====
		if (customer == null) {
			this.getErrorManager().add(errStatus, WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
		}
		return customer;
	}
	
	/**
	 * <h2>重複チェック</h2>
	 * <pre>
	 * 引数を検索条件に預り商品マスタ情報を取得する。
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param salesOrgId 販売組織ID
	 * @param productId 商品ID
	 * @param depositProduct 預り商品マスタ
	 * @param errSts エラー時に設定するエラーステータス
	 */

	public void selectDuplicateCheck(Long salesOrgId, Long productId, MDepositProduct depositProduct, boolean isUpdate, ErrorStatus errStatus) {
		
		MCenterCB centerCb = mCenterBhv.newConditionBean();
		centerCb.specify().columnCenterId();
		centerCb.query().setCenterCd_Equal(depositProduct.getCenterCd());
		MCenter center = mCenterBhv.selectEntity(centerCb);
		// 検索条件の設定
		MDepositProductCB cb = mDepositProductBhv.newMyConditionBean();
		cb.specify().columnDepositProductId();
		cb.query().queryMSalesOrg().setSalesOrgId_Equal(salesOrgId);
		cb.query().queryMProduct().setProductId_Equal(productId);
		cb.query().setAccountCd_Equal(depositProduct.getAccountCd());
		cb.query().queryMCustomer().setCenterId_Equal(center.getCenterId());
		cb.query().queryMCustomer().setClientId_Equal(depositProduct.getClientId());
		ListResultBean<MDepositProduct> selectList = mDepositProductBhv.selectList(cb);
		//更新の場合自分を排除
		if(selectList.size() == 1 && isUpdate) {
			MDepositProduct mDepositProduct = selectList.get(0);
			Long depositProductId = mDepositProduct.getDepositProductId();
			if(depositProductId.equals(depositProduct.getDepositProductId())) {
				selectList.remove(0);
			}
		}
		// ===== ０件チェック =====
		if (selectList.size() > 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
		}
	}
}