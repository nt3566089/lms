package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.wms.dto.master.CustomerMasterListDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CustomerMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取引先マスタメンテナンス(一覧)画面のリソースクラス。
 */
@Path("/master/customerMasterList")
public class CustomerMasterListResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private  ClientLogic clientLogic;

	@Inject
	private CustomerMasterSelectLogic customerMasterSelectLogic;
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CustomerMasterListDto 取引先マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public CustomerMasterListDto init() {

		return new CustomerMasterListDto();
	}

	/**
	 * <h2>取引先マスタメンテナンス(一覧)データ取得</h2>
	 * <pre>
	 * データベースに取引先マスタメンテナンス(一覧)データを取得する
	 * </pre>
	 *@return CustomerMasterListDto 取引先マスタメンテナンス(一覧)画面用DTO
	 *@param dto 取引先マスタメンテナンス(一覧)画面用DTO
	 */
	 @GET
	 @Path("/selectByConditions")
	 public CustomerMasterListDto selectByConditions(CustomerMasterListDto dto){

		 //荷主id取得
		 MClient clientCondition = new MClient();
		 clientCondition.setClientCd(dto.data.head.getMClient().getClientCd());
		 long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();

		// Entity変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		MCustomer customer = mapper.mappingToEntity(dto.data.head);
		customer.setClientId(clientId);

		PagingResultBean<MCustomer> customerList = customerMasterSelectLogic.selectByConditions(customer, dto.paging, errRetSts(StatusCode.SEARCH_DATA_ERROR));

		// エラー有りの場合は終了
		if(getErrorManager().size()>0){

			return null;
		}

		//Entity-Dto変換処理
		List<MCustomerDto> list = mapper.mappingToDtoList(customerList);

		// [C-CWMS-0039] センタ間移動機能を追加(不要になったセンタ、荷主設定処理を削除) 2015.09.18 kawana

		dto.data.body = list;

		return dto;
	 }

}
