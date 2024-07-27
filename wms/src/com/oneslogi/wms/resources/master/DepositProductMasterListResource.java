package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MDepositProductDto;
import com.oneslogi.base.dbflute.dtomapper.MDepositProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MDepositProduct;
import com.oneslogi.wms.dto.master.DepositProductMasterListDto;
import com.oneslogi.wms.logic.master.DepositProductMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 預り商品マスタメンテナンス(一覧)のリソースクラス
 */
@Path("/master/depositProductMasterList")
public class DepositProductMasterListResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DepositProductMasterSelectLogic depositProductMasterLSelectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return DepositProductMasterListDto 預り商品マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public DepositProductMasterListDto init() {

		// 画面用DTO作成
		DepositProductMasterListDto depositProductMasterListDto = new DepositProductMasterListDto();

		return depositProductMasterListDto;
	}

	/**
	 * <h2>預り商品マスタメンテナンス(一覧)検索データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、データベースに預り商品マスタメンテナンス(一覧)データを取得する
	 * </pre>
	 * @param  depositProductMasterListDto 預り商品マスタメンテナンス(一覧)検索画面用DTO
	 * @return DepositProductMasterListDto 預り商品マスタメンテナンス(一覧)検索画面用DTO
	 */
	@GET
	@Path("/selectByConditions")
	public DepositProductMasterListDto selectByConditions(DepositProductMasterListDto depositProductMasterListDto) {

		// エンティティ編集
		MDepositProductDtoMapper mapper = new MDepositProductDtoMapper();
		MDepositProduct mDepositProduct = mapper.mappingToEntity(depositProductMasterListDto.data.head);
		// センタマスタメンテナンス(一覧)検索データ取得.検索データ取得メソッドを呼出し
		PagingResultBean<MDepositProduct> entityList = depositProductMasterLSelectLogic.selectByConditions(mDepositProduct, depositProductMasterListDto.paging, errRetSts(StatusCode.SEARCH_DATA_ERROR));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MDepositProductDto> dtoList = mapper.mappingToDtoList(entityList);
		//Dto変換処理
		depositProductMasterListDto.data.body = dtoList;

		return depositProductMasterListDto;
	}
}
