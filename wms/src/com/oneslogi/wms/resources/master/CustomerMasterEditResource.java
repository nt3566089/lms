package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterCustomerDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CustomerMasterEditDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.TransactionDataCheckLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.CustomerMasterInsertLogic;
import com.oneslogi.wms.logic.master.CustomerMasterSelectLogic;
import com.oneslogi.wms.logic.master.CustomerMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 取引先マスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/customerMasterEdit")
public class CustomerMasterEditResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int INSERT_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int UPDATE_PROCESS_NORMAL_END_INFORMATION = 0;
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 取引先コードで重複異常
		 */
		protected static final int CUSTOMER_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 配送コースコードで未存在異常
		 */
		protected static final int DELIVERY_COURSE_CODE_NOT_FOUND_ERROR = 3;
		/**
		 * 取引先登録異常
		 */
		protected static final int CUSTOMER_MASTER_INSERT_FAILED = 4;
		/**
		 * 取引先更新異常
		 */
		protected static final int CUSTOMER_MASTER_UPDATE_FAILED = 5;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 6;
		/**
		 * 郵便番号コードで存在異常
		 */
		protected static final int ZIP_CODE_NOT_FOUND_ERROR = 7;
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		/**
		 * 在庫データで存在エラー
		 */
		protected static final int STOCK_DATA_FOUND_ERROR = 8;
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
		protected static final int CENTER_MASTER_NOT_FOUND_ERR = 9;
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		/**
		 * トランザクションデータ存在エラー
		 */
		protected static final int TRAN_DATA_FOUND_ERROR = 10;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

	// ===== 使用ロジッククラス =====

	@Inject
	private CustomerMasterInsertLogic customerMasterInsertLogic;
	@Inject
	private CustomerMasterUpdateLogic customerMasterUpdateLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private CustomerMasterSelectLogic customerMasterSelectLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ZipLogic zipLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupRegisterData {
		ALL_OK,
		CUSTOMER_DUPLICATE_ERR,
		ZIP_CODE_NOT_FOUND,
		DELIVERY_COURSE_NOT_FOUND,
		// [横並-031] チェックの確認 2014.11.26 taoys Start
		CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION,
		CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION,
		CENTER_AND_CLIENT,
		// [横並-031] チェックの確認 2014.11.26 taoys End
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		STOCK_DATA_FOUND_ERROR,
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		TRAN_DATA_FOUND_ERROR,
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
		CENTER_MASTER_NOT_FOUND_ERR
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CustomerMasterEditDto 取引先マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CustomerMasterEditDto initNew() {
		CustomerMasterEditDto customerMasterEditDto = new CustomerMasterEditDto();
		List<MCenterCustomer> mCenterCustomerlist = new ArrayList<MCenterCustomer>();
		List<MCustomer> mCustomerList = new ArrayList<MCustomer>();
		MCustomer customer = new MCustomer();
		customer.setMCenterCustomerList(mCenterCustomerlist);
		mCustomerList.add(customer);

		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		List<MCustomerDto> mCustomerDtoList = mapper.mappingToDtoList(mCustomerList);

		customerMasterEditDto.data.body = mCustomerDtoList;

		return customerMasterEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return MStopListDto 取引先マスタメンテナンス(編集)画面用DTO
	 * @param mCustomerId  取引先ID
	 */
	@GET
	@Path("/initUpdate")
	public CustomerMasterEditDto initUpdate(@QueryParam("customerId") Long mCustomerId) {

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		CustomerMasterEditDto customerMasterEditDto = new CustomerMasterEditDto();

		// 取引先IDを条件に設定して検索実行
		MCustomer condition = new MCustomer();
		condition.setCustomerId(mCustomerId);
		MCustomer customer = customerMasterSelectLogic.selectById(condition, errRetSts(StatusCode.CUSTOMER_CODE_DUPLICATE_ERROR));

		if (getErrorManager().size() > 0) {
			// エラーあり
			return customerMasterEditDto;
		}

		// 社内入荷センタCD設定
		if (customer.getMClientCenterList().size() > 0) {
			customer.setCenterCd(customer.getMClientCenterList().get(0).getMCenter().getCenterCd());
		}

		// 荷主取引先CDの設定
		if (customer.getMClientList().size() > 0) {
			customer.setClientCustomerCd(customer.getMClientList().get(0).getClientCd());
		}

		// ===== 画面用DTO作成 =====

		MCustomerDtoMapper mapper = new MCustomerDtoMapper();
		MCustomerDto customerDto = mapper.mappingToDto(customer);

		List<MCustomerDto> customerList = new ArrayList<MCustomerDto>();
		customerList.add(customerDto);

		customerMasterEditDto.data.head = customerDto;
		customerMasterEditDto.data.body = customerList;

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		return customerMasterEditDto;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・配送コースCD存在チェック
	 * ・取引先CD重複チェック
	 * </pre>
	 * @param mDeliveryCourseList 取引先マスタ画面List
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupRegisterData checkProcess(MCustomer mCustomer, List<MDeliveryCourse> mDeliveryCourseList, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isNullDeliverCourse = false;
		boolean isDuplicateCustomerCenter = false;
		boolean isNullZip = false;
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
		boolean isCenterNotFoundErr = false;
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		boolean isStock = false;
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
		// [横並-031] チェックの確認 2014.11.26 taoys Start
		boolean isCenterCustomer = false;
		boolean isClientCustomer = false;;
		// [横並-031] チェックの確認 2014.11.26 taoys End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		boolean existTran = false;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

		// ===== 取引先CD重複チェック =====

		// [ON推-品向-943] チェック不正を修正(不要な処理を削除) 2015.09.17 kawana

		if (mCustomer.getCustomerId() == null) {
			// 新規登録
			isDuplicateCustomerCenter = customerLogic.checkCustomerCdInsert(mCustomer, errRetSts(StatusCode.CUSTOMER_CODE_DUPLICATE_ERROR));
		} else {
			// 更新登録
			isDuplicateCustomerCenter = customerLogic.checkCustomerCdUpdate(mCustomer, errRetSts(StatusCode.CUSTOMER_CODE_DUPLICATE_ERROR));
		}

		// ===== 郵便番号CD存在チェック =====

		if (mCustomer.getZipCd() != null) {

			MZip condition = new MZip();
			condition.setZipCd(mCustomer.getZipCd());

			if (mCustomer.getCustomerId() == null) {

				isNullZip = zipLogic.checkZipCd(condition, errRetSts(StatusCode.ZIP_CODE_NOT_FOUND_ERROR));

			} else {

				isNullZip = zipLogic.checkZipCd(condition, errRetSts(StatusCode.ZIP_CODE_NOT_FOUND_ERROR));
			}
		}

		int rowIndex=-1;

		// ===== 配送コースCD存在チェック =====
		for (MDeliveryCourse deliveryCourse : mDeliveryCourseList) {
			rowIndex++;

			if (deliveryCourse != null) {
				if (deliveryCourse.getDeliveryCourseCd() != null) {
					deliveryCourse = deliveryCourseLogic.getUkEntity(deliveryCourse, errRetSts(errSts,StatusCode.DELIVERY_COURSE_CODE_NOT_FOUND_ERROR, rowIndex));
					if (deliveryCourse == null) {
						isNullDeliverCourse = true;
					}
				}
			}
		}

		// [横並-031] チェックの確認 2014.11.26 taoys Start

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// ===== 社内入荷センタ既登録チェック =====
		if (!CU.isNullOrEmpty(mCustomer.getCenterCd())) {
			// センタ検索
			MCenter centerCondition = new MCenter();
			centerCondition.setCenterCd(mCustomer.getCenterCd());
			MCenter center = centerLogic.getUkEntity(centerCondition, errRetSts(errSts, StatusCode.CENTER_MASTER_NOT_FOUND_ERR));
			if (center == null) {
				// マスタ取得エラー
				isCenterNotFoundErr = true;
			} else {

				// 荷主センタ検索
				MClientCenter clientCenterCondition = new MClientCenter();
				clientCenterCondition.setCenterId(center.getCenterId());
				clientCenterCondition.setClientId(mCustomer.getClientId());
				MClientCenter clientCenter = clientCenterLogic.getUkEntity(clientCenterCondition, errRetSts(errSts, StatusCode.CENTER_MASTER_NOT_FOUND_ERR));
				if (clientCenter == null) {
					// マスタ取得エラー
					isCenterNotFoundErr = true;
				} else {

					Long clientCenterCustomerId = clientCenter.getCustomerId();
					if (clientCenterCustomerId != null) {
						// 既に取引先の登録あり

						if (!CU.isNotNullAndEquals(clientCenterCustomerId, mCustomer.getCustomerId())) {
							// 自分のIDとは違うため既登録あり
							isCenterCustomer = true;
						}
					}
				}
			}
		}

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		// ===== 荷主取引先 既登録チェック =====
		MClient mClient = new MClient();
		mClient.setClientCd(mCustomer.getClientCustomerCd());
		mClient = clientLogic.getUkEntity(mClient);
		if(mClient!= null){
			if(mClient.getCustomerId()!=null){
				if(mCustomer.getCustomerId()==null){
					isClientCustomer = true;
				}else{
					if(!(mClient.getCustomerId().equals(mCustomer.getCustomerId()))){
						isClientCustomer = true;
					}
				}
			}
		}

		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana Start

		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		// ===== 在庫存在チェック ====
		if (mCustomer.getDelFlg() == "1"){
			// 削除する場合は在庫存在チェック
			isStock = customerLogic.existStock(mCustomer);
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
			// トランザクション存在チェック
			existTran = transactionDataCheckLogic.existTran(mCustomer);
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		}
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End


		// [横並-031] チェックの確認 2014.11.26 taoys End

		// ===== 結果の設定 =====
		ResultSetupRegisterData resultStatus;

		// ===== エラーレベル =====
		if (isNullDeliverCourse) {
			resultStatus = ResultSetupRegisterData.DELIVERY_COURSE_NOT_FOUND;
		} else if (isDuplicateCustomerCenter) {
			resultStatus = ResultSetupRegisterData.CUSTOMER_DUPLICATE_ERR;
		} else if (isNullZip) {
			resultStatus = ResultSetupRegisterData.ZIP_CODE_NOT_FOUND;
			// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		} else if (isStock) {
			resultStatus = ResultSetupRegisterData.STOCK_DATA_FOUND_ERROR;
			// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
			// [横並-031] チェックの確認 2014.11.26 taoys Start
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		} else if (existTran) {
			resultStatus = ResultSetupRegisterData.TRAN_DATA_FOUND_ERROR;
			// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		} else if (isCenterNotFoundErr) {
			resultStatus = ResultSetupRegisterData.CENTER_MASTER_NOT_FOUND_ERR;
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		// ===== 警告レベル =====
		} else if (isCenterCustomer && isClientCustomer) {
			resultStatus = ResultSetupRegisterData.CENTER_AND_CLIENT;
		} else if (isCenterCustomer) {
			resultStatus = ResultSetupRegisterData.CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION;
		} else if (isClientCustomer) {
			resultStatus = ResultSetupRegisterData.CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION;
			// [横並-031] チェックの確認 2014.11.26 taoys End

		// ===== 情報レベル =====
		} else {
			resultStatus = ResultSetupRegisterData.ALL_OK;
		}

		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana End

		return resultStatus;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・取引先コードで重複異常チェックエラー用メッセージ
	 * ・配送コースコードで未存在異常チェックエラー用メッセージ
	 *
	 * </pre>
	 * @param customerMasterEditDto 取引先マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CustomerMasterEditDto customerMasterEditDto, ErrorStatus errSts) {

		// Entity変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();

		// 取引先マスタ
		MCustomer mCustomer = mapper.mappingToEntity(customerMasterEditDto.data.head);

		// 配送コースリスト取得

		MCenterCustomerDtoMapper bodyMapper = new MCenterCustomerDtoMapper();

		List<MCenterCustomer> mCenterCustomerList = bodyMapper.mappingToEntityList(customerMasterEditDto.data.body.get(0).getMCenterCustomerList());

		List<MDeliveryCourse> deliveryCourseList = new ArrayList<MDeliveryCourse>();

		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI Start

		MClient client = new MClient();

		// 荷主マスタ
		client.setClientCd(mCustomer.getMClient().getClientCd());
		client = clientLogic.getUkEntity(client);
		if (client != null) {
			client.setCustomerId(mCustomer.getCustomerId());
			mCustomer.setClientId(client.getClientId());
		}

		// [ON推-品向-269] データ存在しいない場合、1行空欄で表示する。 2014.11.27 KI End
		for (MCenterCustomer mCenterCustomer : mCenterCustomerList) {

			MCenter center = new MCenter();
			center.setCenterCd(mCenterCustomer.getMCenter().getCenterCd());
			center = centerLogic.getUkEntity(center);

			MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
			mDeliveryCourse.setDeliveryCourseCd(mCenterCustomer.getMDeliveryCourse().getDeliveryCourseCd());
			mDeliveryCourse.setCenterId(center.getCenterId());
			deliveryCourseList.add(mDeliveryCourse);

		}
		ResultSetupRegisterData resultStatus = checkProcess(mCustomer, deliveryCourseList, errRetSts(StatusCode.INPUT_CHECK));
		switch (resultStatus) {
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		// [横並-031] チェックの確認 2014.11.26 taoys Start
		case CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION:
			//取引先CD存在チェックの確認メッセージを設定（センタの場合）
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION);
			break;
		case CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION:
			//取引先CD存在チェックの確認メッセージを設定（荷主の場合）
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION);
			break;
		case CENTER_AND_CLIENT:
			//取引先CD存在チェックの確認メッセージを設定（センタと荷主の場合）
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), "Both");
			break;
		// [横並-031] チェックの確認 2014.11.26 taoys End
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI Start
		case STOCK_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.STOCK_DATA_FOUND_ERROR), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			break;
		// [ON推-品向-396] 在庫チェック追加。 2014.12.04 KI End
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			break;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start
		case CENTER_MASTER_NOT_FOUND_ERR:
		case CUSTOMER_DUPLICATE_ERR:
		case DELIVERY_COURSE_NOT_FOUND:
		case ZIP_CODE_NOT_FOUND:
			return null;
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		}

		return null;
	}

	/**
	 * <h2>取引先マスタ登録。</h2>
	 * <pre>
	 * データの登録処理。
	 * エラーがない場合は、データベースに取引先マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param customerMasterEditDto 取引先マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CustomerMasterEditDto customerMasterEditDto, ErrorStatus errSts) {

		// Entity変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();

		List<MCustomer> bodyList = mapper.mappingToEntityList(customerMasterEditDto.data.body);

		MCustomer customer = mapper.mappingToEntity(customerMasterEditDto.data.head);

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// 荷主ID設定
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(customer.getMClient().getClientCd());
		MClient client = clientLogic.getUkEntity(clientCondition);
		if (client != null) {
			customer.setClientId(client.getClientId());
		}

		// 配送コースリスト、センタ取引先リスト作成
		List<MDeliveryCourse> deliveryCourseList = new ArrayList<MDeliveryCourse>();
		List<MCenterCustomer> centerCustomerList = new ArrayList<MCenterCustomer>();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		for (MCenterCustomer centerCustomer : bodyList.get(0).getMCenterCustomerList()) {
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCustomer.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);

			MDeliveryCourse mDeliveryCourse = centerCustomer.getMDeliveryCourse();

			mDeliveryCourse.setCenterId(mCenter.getCenterId());
			mDeliveryCourse = deliveryCourseLogic.getUkEntityWithDeletedCheck(mDeliveryCourse);
			deliveryCourseList.add(mDeliveryCourse);

			centerCustomer.setCenterId(mCenter.getCenterId());

			if (mDeliveryCourse != null && mDeliveryCourse.getDeliveryCourseId() != null) {

				centerCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
			} else {
				// [#18766] コピー時に配送コース情報を消しても登録がされるのを修正 2022.04.14 takahashi Start
				centerCustomer.setDeliveryCourseId(null);
				// [#18766] コピー時に配送コース情報を消しても登録がされるのを修正 2022.04.14 takahashi End
			}

			centerCustomerList.add(centerCustomer);
		}

		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana Start
		// 入力チェック
		ResultSetupRegisterData resultStatus = checkProcess(customer, deliveryCourseList, errRetSts(StatusCode.INPUT_CHECK));
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		switch (resultStatus) {
		case STOCK_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.STOCK_DATA_FOUND_ERROR), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			return null;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			return null;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		case CENTER_MASTER_NOT_FOUND_ERR:
		case CUSTOMER_DUPLICATE_ERR:
		case DELIVERY_COURSE_NOT_FOUND:
		case ZIP_CODE_NOT_FOUND:
			return null;
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		default:
			break;
		}
		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// 荷主取引先
		MClient clientCustomer = null;
		if (customer.getClientCustomerCd() != null) {

			MClient clientCustomerCondition = new MClient();
			clientCustomerCondition.setClientCd(customer.getClientCustomerCd());
			clientCustomer = clientLogic.getUkEntity(clientCustomerCondition);
		}

		// 社内入荷センタ
		MClientCenter clientCenter = null;
		if (customer.getCenterCd() != null) {

			// センタ検索
			MCenter centerCondition = new MCenter();
			centerCondition.setCenterCd(customer.getCenterCd());
			MCenter center = centerLogic.getUkEntity(centerCondition);

			// 荷主センタ検索
			MClientCenter clientCenterCondition = new MClientCenter();
			clientCenterCondition.setCenterId(center.getCenterId());
			clientCenterCondition.setClientId(customer.getClientId());
			clientCenter = clientCenterLogic.getUkEntity(clientCenterCondition, errRetSts(errSts, StatusCode.CENTER_MASTER_NOT_FOUND_ERR));
		}

		// 登録実行
		customerMasterInsertLogic.insert(customer, clientCustomer, clientCenter, centerCustomerList, errRetSts(StatusCode.CUSTOMER_MASTER_INSERT_FAILED));

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>取引先マスタ登録(更新)。</h2>
	 * <pre>
	 * データの登録処理。
	 * エラーがない場合は、データベースに取引先マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param customerMasterEditDto 取引先マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(CustomerMasterEditDto customerMasterEditDto, ErrorStatus errSts) {
		// Entity変換
		MCustomerDtoMapper mapper = new MCustomerDtoMapper();

		MCustomer customer = mapper.mappingToEntity(customerMasterEditDto.data.head);

		List<MCustomer> bodyList = mapper.mappingToEntityList(customerMasterEditDto.data.body);

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// 荷主ID設定
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(customer.getMClient().getClientCd());
		MClient client = clientLogic.getUkEntity(clientCondition);
		if (client != null) {
			customer.setClientId(client.getClientId());
		}

		// 配送コースリスト、センタ取引先リスト作成
		List<MDeliveryCourse> deliveryCourseList = new ArrayList<MDeliveryCourse>();
		List<MCenterCustomer> centerCustomerList = new ArrayList<MCenterCustomer>();
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		for (MCenterCustomer centerCustomer : bodyList.get(0).getMCenterCustomerList()) {
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCustomer.getMCenter().getCenterCd());
			mCenter = centerLogic.getUkEntity(mCenter);

			MDeliveryCourse mDeliveryCourse = centerCustomer.getMDeliveryCourse();

			mDeliveryCourse.setCenterId(mCenter.getCenterId());
			mDeliveryCourse = deliveryCourseLogic.getUkEntityWithDeletedCheck(mDeliveryCourse);
			deliveryCourseList.add(mDeliveryCourse);

			centerCustomer.setCenterId(mCenter.getCenterId());

			if(mDeliveryCourse != null && mDeliveryCourse.getDeliveryCourseId() != null){

				centerCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());

			}

			centerCustomerList.add(centerCustomer);
		}

		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana Start
		// 入力チェック
		ResultSetupRegisterData resultStatus = checkProcess(customer, deliveryCourseList, errRetSts(StatusCode.INPUT_CHECK));
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		switch (resultStatus) {
		case STOCK_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.STOCK_DATA_FOUND_ERROR), WmsMessageConst.STOCK_DATA_FOUND_ERROR);
			return null;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		case TRAN_DATA_FOUND_ERROR:
			getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			return null;
		// [#5705][v3.1] 入荷・出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		case CENTER_MASTER_NOT_FOUND_ERR:
		case CUSTOMER_DUPLICATE_ERR:
		case DELIVERY_COURSE_NOT_FOUND:
		case ZIP_CODE_NOT_FOUND:
			return null;
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End
		default:
			break;
		}
		// [ON推-品向-943] チェック不正を修正 2015.09.17 kawana End

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana Start

		// 荷主取引先
		MClient clientCustomer = null;
		if (customer.getClientCustomerCd() != null) {

			MClient clientCustomerCondition = new MClient();
			clientCustomerCondition.setClientCd(customer.getClientCustomerCd());
			clientCustomer = clientLogic.getUkEntity(clientCustomerCondition);
		}

		// 社内入荷センタ
		MClientCenter clientCenter = null;
		if (customer.getCenterCd() != null) {

			// センタ検索
			MCenter centerCondition = new MCenter();
			centerCondition.setCenterCd(customer.getCenterCd());
			MCenter center = centerLogic.getUkEntity(centerCondition);

			// 荷主センタ検索
			MClientCenter clientCenterCondition = new MClientCenter();
			clientCenterCondition.setCenterId(center.getCenterId());
			clientCenterCondition.setClientId(customer.getClientId());
			clientCenter = clientCenterLogic.getUkEntity(clientCenterCondition, errRetSts(errSts, StatusCode.CENTER_MASTER_NOT_FOUND_ERR));
		}

		// 更新実行
		customerMasterUpdateLogic.update(customer, clientCustomer, clientCenter, centerCustomerList, errRetSts(StatusCode.CUSTOMER_MASTER_INSERT_FAILED));

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.17 kawana End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.UPDATE_PROCESS_NORMAL_END_INFORMATION), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

}
