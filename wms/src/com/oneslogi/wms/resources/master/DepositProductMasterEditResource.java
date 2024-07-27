package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dtomapper.MDepositProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDepositProduct;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSalesOrg;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.DepositProductMasterListDto;
import com.oneslogi.wms.logic.master.DepositProductMasterInsertLogic;
import com.oneslogi.wms.logic.master.DepositProductMasterSelectLogic;
import com.oneslogi.wms.logic.master.DepositProductMasterUpdateLogic;

/**
 * 預り商品マスタメンテナンス(編集)のリソースクラス
 */
@Path("/master/depositProductMasterEdit")
public class DepositProductMasterEditResource extends AbstractResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 預り商品マスタメンテナンス(編集)データ取得異常
		 */
		protected static final int GET_DATA_ERROR = 2;
		/**
		 * 販売組織CD存在しない異常
		 */
		protected static final int NO_SALES_ORG_ERROR = 3;
		/**
		 * 重複チェック異常
		 */
		protected static final int DUPLICATE_ERROR = 4;
		/**
		 * 商品CD存在しない異常
		 */
		protected static final int NO_PRODUCT_ERROR = 5;
		/**
		 * 取引先が存在しない異常
		 */
		protected static final int NO_CUSTOMER_ERROR = 6;
		/**
		 * 新規登録異常
		 */
		protected static final int CREATE_DATA_ERROR = 7;
		/**
		 * 更新異常
		 */
		protected static final int UPDATE_DATA_ERROR = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DepositProductMasterSelectLogic depositProductMasterLSelectLogic;
	@Inject
	private DepositProductMasterInsertLogic depositProductMasterInsertLogic;
	@Inject
	private DepositProductMasterUpdateLogic depositProductMasterUpdateLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 *
	 * </pre>
	 * @return DepositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public DepositProductMasterListDto initNew() {
		DepositProductMasterListDto depositProductMasterListDto = new DepositProductMasterListDto();
	
		// 画面用DTO作成
     	return depositProductMasterListDto;
	}

	/**
	 * <h2>初期処理（更新）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・預り商品マスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @param  depositProductId 預り商品ID
	 * @return DepositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public DepositProductMasterListDto initUpdate(@QueryParam("depositProductId") Long depositProductId) {

		// エンティティ編集
		DepositProductMasterListDto depositProductMasterListDto = new DepositProductMasterListDto();

		MDepositProductDtoMapper mapperClass = new MDepositProductDtoMapper();

		// 預り商品マスタメンテナンス(編集)クラスデータ取得.預り商品マスタマスタデータ取得メソッドを呼出し
		MDepositProduct depositProduct = depositProductMasterLSelectLogic.selectById(depositProductId, errRetSts(StatusCode.GET_DATA_ERROR));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		depositProductMasterListDto.data.head = mapperClass.mappingToDto(depositProduct);
		return depositProductMasterListDto;

	}

	/**
	 * <h2>入力チェック新規。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param depositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/createCheck")
	public StatusDto createCheck(DepositProductMasterListDto depositProductMasterListDto) {
		// エンティティ変換
		MDepositProductDtoMapper mapper = new MDepositProductDtoMapper();
		MDepositProduct mDepositProduct = mapper.mappingToEntity(depositProductMasterListDto.data.head);
		// 入力チェック処理
		MSalesOrg salsorg = depositProductMasterLSelectLogic.selectBySalesOrgCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		MProduct product = depositProductMasterLSelectLogic.selectByProductCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		
		if(mDepositProduct.getAccountCd() != null && !mDepositProduct.getAccountCd().isEmpty()) {
			depositProductMasterLSelectLogic.selectDuplicateCheck(salsorg.getSalesOrgId(), product.getProductId(), mDepositProduct, false, errRetSts(StatusCode.DUPLICATE_ERROR));
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
			depositProductMasterLSelectLogic.selectAccount(salsorg.getSalesOrgId(), mDepositProduct, errRetSts(StatusCode.NO_CUSTOMER_ERROR));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}
		
		// ===== 確認メッセージの設定 =====
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>入力チェック更新。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param depositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/updateCheck")
	public StatusDto updateCheck(DepositProductMasterListDto depositProductMasterListDto) {
		// エンティティ変換
		MDepositProductDtoMapper mapper = new MDepositProductDtoMapper();
		MDepositProduct mDepositProduct = mapper.mappingToEntity(depositProductMasterListDto.data.head);
		// 入力チェック処理
		MSalesOrg salsorg = depositProductMasterLSelectLogic.selectBySalesOrgCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		MProduct product = depositProductMasterLSelectLogic.selectByProductCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		if(mDepositProduct.getAccountCd() != null && !mDepositProduct.getAccountCd().isEmpty()) {
			depositProductMasterLSelectLogic.selectDuplicateCheck(salsorg.getSalesOrgId(), product.getProductId(), mDepositProduct, true, errRetSts(StatusCode.DUPLICATE_ERROR));
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
			depositProductMasterLSelectLogic.selectAccount(salsorg.getSalesOrgId(), mDepositProduct, errRetSts(StatusCode.NO_CUSTOMER_ERROR));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
		}
		// ===== 確認メッセージの設定 =====
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>預り商品マスタマスタ登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに預り商品マスタマスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param depositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(DepositProductMasterListDto depositProductMasterListDto) {
		// エンティティ変換
		MDepositProductDtoMapper mapper = new MDepositProductDtoMapper();
		MDepositProduct mDepositProduct = mapper.mappingToEntity(depositProductMasterListDto.data.head);

		// 入力チェック処理
		MSalesOrg salsorg = depositProductMasterLSelectLogic.selectBySalesOrgCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		MProduct product = depositProductMasterLSelectLogic.selectByProductCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		
		Long accountId = null;
		if(mDepositProduct.getAccountCd() != null && !mDepositProduct.getAccountCd().isEmpty()) {
			depositProductMasterLSelectLogic.selectDuplicateCheck(salsorg.getSalesOrgId(), product.getProductId(), mDepositProduct, false, errRetSts(StatusCode.DUPLICATE_ERROR));
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
			MCustomer account = depositProductMasterLSelectLogic.selectAccount(salsorg.getSalesOrgId(), mDepositProduct, errRetSts(StatusCode.NO_CUSTOMER_ERROR));
			// 結果判定
			if (0 < getErrorManager().size()) {
				return null;
			}
			accountId = account.getCustomerId();
		}
		
		// 預り商品マスタマスタ登録
		depositProductMasterInsertLogic.create(salsorg.getSalesOrgId(), product.getProductId(), accountId, mDepositProduct, depositProductMasterListDto.data.centerId ,errRetSts(StatusCode.CREATE_DATA_ERROR));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>預り商品マスタマスタ更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースに預り商品マスタマスタを更新し。
	 * 預り商品マスタ明細マスタを更新または削除または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param depositProductMasterListDto 預り商品マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(DepositProductMasterListDto depositProductMasterListDto) {

		// エンティティ変換
		MDepositProductDtoMapper mapper = new MDepositProductDtoMapper();
		MDepositProduct mDepositProduct = mapper.mappingToEntity(depositProductMasterListDto.data.head);

		// 入力チェック処理
		MSalesOrg salsorg = depositProductMasterLSelectLogic.selectBySalesOrgCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		MProduct product = depositProductMasterLSelectLogic.selectByProductCd(mDepositProduct, errRetSts(StatusCode.NO_SALES_ORG_ERROR));
		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}
		Long accountId = null;
		if(mDepositProduct.getAccountCd() != null && !mDepositProduct.getAccountCd().isEmpty()) {
			depositProductMasterLSelectLogic.selectDuplicateCheck(salsorg.getSalesOrgId(), product.getProductId(), mDepositProduct, true, errRetSts(StatusCode.DUPLICATE_ERROR));
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
			MCustomer account = depositProductMasterLSelectLogic.selectAccount(salsorg.getSalesOrgId(), mDepositProduct, errRetSts(StatusCode.NO_CUSTOMER_ERROR));
			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
			accountId = account.getCustomerId();
		}

		// 預り商品マスタマスタ更新
		depositProductMasterUpdateLogic.update(salsorg.getSalesOrgId(), product.getProductId(), accountId, mDepositProduct, errRetSts(StatusCode.UPDATE_DATA_ERROR));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
	
}