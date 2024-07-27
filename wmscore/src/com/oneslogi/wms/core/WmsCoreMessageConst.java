package com.oneslogi.wms.core;

import com.oneslogi.base.BaseMessageConst;

public class WmsCoreMessageConst extends BaseMessageConst {

	/** 住所１は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS1_CHECK_INPUT_MAX_ERROR = "address1CheckInputMaxError";
	/** 住所２は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS2_CHECK_INPUT_MAX_ERROR = "address2CheckInputMaxError";
	/** 住所３は最大50文字以下を入力して下さい。 */
	public static final String ADDRESS3_CHECK_INPUT_MAX_ERROR = "address3CheckInputMaxError";
	/** 選択した行を追加しますか？ */
	public static final String ADD_ROW_CONFIRMATION = "addRowConfirmation";
	/** 複数行選択しています。選択した行を追加しますか？ */
	public static final String ADD_ROW_MULTIPLE_CONFIRMATION = "addRowMultipleConfirmation";
	/** 移動先が移動元と同じです。 */
	public static final String AFTER_LOCATION_CANNOT_INPUT_SAME_BEFORE_LOCATION_ERROR = "afterLocationCannotInputSameBeforeLocationError";
	/** 引当禁止フラグが存在しません。 */
	public static final String ALLC_NG_FLG_NOT_FOUND_ERROR = "allcNgFlgNotFoundError";
	/** 引当区分が「00:引当（標準）」「01:帳簿引当（欠品案分）」の場合、「00：マージしない」以外を選択できません。 */
	public static final String ALLOCATE_CLASS_CANNOT_SELECT_ERROR = "allocateClassCannotSelectError";
	/** 引当禁止区分が存在しません。 */
	public static final String ALLOCATE_STOP_CLASS_NOT_FOUND_ERROR = "allocateStopClassNotFoundError";
	/** 出荷実績訂正の在庫データに存在しません。 */
	public static final String ALLOC_CHARGE_NUM_NOT_FOUND_ERROR = "allocChargeNumNotFoundError";
	/** 荷札情報 */
	public static final String ALLOC_INFORMATION = "allocInformation";
	/** 引当禁止フラグを入力して下さい。 */
	public static final String ALLOC_NG_FLG_NOT_INPUT_ERROR = "allocNgFlgNotInputError";
	/** 引当順序に小数は入力できません。 */
	public static final String ALLOC_ORDER_CHECK_INPUT_DECIMAL_ERROR = "allocOrderCheckInputDecimalError";
	/** 引当順序は整数5桁以内を入力して下さい。 */
	public static final String ALLOC_ORDER_CHECK_INPUT_INTEGER_ERROR = "allocOrderCheckInputIntegerError";
	/** 引当順序 数値のみ */
	public static final String ALLOC_ORDER_CHECK_NUMERIC_ONLY_ERROR = "allocOrderCheckNumericOnlyError";
	/** 引当順序は最小0以上を入力して下さい。 */
	public static final String ALLOC_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "allocOrderInputRequestMinIsZeroError";
	/** 引当順序を入力して下さい。 */
	public static final String ALLOC_ORDER_NOT_INPUT_ERROR = "allocOrderNotInputError";
	/** 入荷日、伝票区分または預託在庫区分が変更されました。全行選択して更新して下さい。 */
	public static final String ALL_RECIVE_PLAN_NOT_SELECT_ERROR = "allRecivePlanNotSelectError";
	/** 全欠品データが含まれています。 */
	public static final String ALL_STOCK_OUT_DATA_FOUND_ERROR = "allStockOutDataFoundError";
	/** すべての構成品が削除済の為、登録できません。 */
	public static final String ALL_STRUCTURE_CANNOT_DELETE_ERROR = "allStructureCannotDeleteError";
	/** 構成セットにこの構成品があるの為、行削除は行えません。 */
	public static final String ALREADY_EXISTS_STRUCTURE_CANNOT_DELETE_ERROR = "alreadyExistsStructureCannotDeleteError";
	/** 登録済データの為、分割解除は行えません。 */
	public static final String ALREADY_REGISTERED_CANNOT_SPLIT_CANCEL_ERROR = "alreadyRegisteredCannotSplitCancelError";
	/** 登録後はメインメニューに遷移します。 */
	public static final String ANNOUNCE_CHANGE_CENTER_CLIENT = "announceChangeCenterClient";
	/** 仕分コードを入力して下さい。 */
	public static final String ARRIVAL_STORE_CD_NOT_INPUT_ERROR = "arrivalStoreCdNotInputError";
	/** バーコード　英数字と記号のみ */
	public static final String BARCODE_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "barcodeCheckAlphabetAndNumericAndSymbolOnlyError";
	/** バーコードを入力して下さい。 */
	public static final String BARCODE_NOT_INPUT_ERROR = "barcodeNotInputError";
	/** ボール入数はケース以下を入力して下さい。 */
	public static final String BOWL_UNIT_NUM_CHECK_INPUT_MAX_ERROR = "bowlUnitNumCheckInputMaxError";
	/** 荷材グループに登録されている荷材([0])は削除できません。 */
	public static final String BOX_CANNOT_DELETE_USE_BOX_GRP_ERROR = "boxCannotDeleteUseBoxGrpError";
	/** 基準荷材CDが荷材CDで未存在。 */
	public static final String BOX_CD_CANNOT_INPUT_ANOTHER_BOX_CD_ERROR = "boxCdCannotInputAnotherBoxCdError";
	/** 荷材CDが重複しています。 */
	public static final String BOX_CODE_DUPLICATE_ERROR = "boxCodeDuplicateError";
	/** 梱包荷材グループに設定されているため削除できません。 */
	public static final String BOX_GRP_CANNOT_DELETE_USE_PARAMETER_MASTER_ERROR = "boxGrpCannotDeleteUseParameterMasterError";
	/** 荷材グループCDが既に登録済です。 */
	public static final String BOX_GRP_CD_CODE_DUPLICATE_ERROR = "boxGrpCdCodeDuplicateError";
	/** 新規荷材 */
	public static final String BOX_NEW_INFORMATION = "boxNewInformation";
	/** 荷材マスタに存在しません。 */
	public static final String BOX_NOT_FOUND_ERROR = "boxNotFoundError";
	/** 同一の箱種・荷姿は指定できません。 */
	public static final String BOX_TYPE_AND_SHAPE_CLASS_CANNOT_SELECT_SAME_ERROR = "boxTypeAndShapeClassCannotSelectSameError";
	/** 検品中データが存在しないため、箱登録できません。 */
	public static final String BOX_TYPE_CANNOT_REGISTER_INSPECTING_DATA_NOT_FOUND_ERROR = "boxTypeCannotRegisterInspectingDataNotFoundError";
	/** 箱種が選択されていません。 */
	public static final String BOX_TYPE_NOT_SELECT_ERROR = "boxTypeNotSelectError";
	/** エラー件数：[0]件 , 正常件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION = "bulkInputExecuteErrorCheckInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_INFORMATION = "bulkInputExecuteRegisterInformation";
	/** エラーチェック */
	public static final String BULK_INPUT_SECTION_NAME_ERROR_CHECK_INFORMATION = "bulkInputSectionNameErrorCheckInformation";
	/** データ登録 */
	public static final String BULK_INPUT_SECTION_NAME_REGISTER_INFORMATION = "bulkInputSectionNameRegisterInformation";
	/** 中断しました。 */
	public static final String CANCEL_CHANGE_CENTER_CLIENT = "cancelChangeCenterClient";
	/** 元の入荷予定日以前の日付には変更できません。 */
	public static final String CANNOT_CHANGE_BEFORE_RECEIVE_PLAN_DATE_ERROR = "cannotChangeBeforeReceivePlanDateError";
	/** 指示済以外のデータは修正できません。 */
	public static final String CANNOT_CHANGE_ERROR = "cannotChangeError";
	/** 入荷予定取込で作成されたデータのため修正は出来ません。 */
	public static final String CANNOT_CHANGE_RECEIVE_PLAN_FROM_EDI_ERROR = "cannotChangeReceivePlanFromEdiError";
	/** 入荷中のため処理できません。 */
	public static final String CANNOT_CHANGE_RECEIVING_ERROR = "cannotChangeReceivingError";
	/** 出荷指示取込で作成されたデータのため修正は出来ません。 */
	public static final String CANNOT_CHANGE_SHIP_ORDER_FROM_RECEIVED_ERROR = "cannotChangeShipOrderFromReceivedError";
	/** キャンセルのデータが含まれています。 */
	public static final String CANNOT_EXECUTE_CANCEL_DATA_INCLUDED_ERROR = "cannotExecuteCancelDataIncludedError";
	/** 出荷指示数は1以上で入力して下さい。 */
	public static final String CANNOT_INPUT_ERROR = "cannotInputError";
	/** 履歴データが選択されています。 */
	public static final String CANNOT_INPUT_HISTORY_DATA_ERROR = "cannotInputHistoryDataError";
	/** 数量をオーバーしています。 */
	public static final String CANNOT_INPUT_MORE_THAN_QTY_ERROR = "cannotInputMoreThanQtyError";
	/** 出荷商品明細画面で明細を登録して下さい。 */
	public static final String CANNOT_REGISTER_ERROR = "cannotRegisterError";
	/** 打切りのデータが含まれています。 */
	public static final String CANNOT_SELECT_CLOSED_RECEIVE_ERROR = "cannotSelectClosedReceiveError";
	/** 送り状データ出力済のデータが含まれています。 */
	public static final String CANNOT_SELECT_DELIVERY_NOTE_DATA_CLEATED_ERROR = "cannotSelectDeliveryNoteDataCleatedError";
	/** 異なる出荷先が選択されているため、更新できません。 */
	public static final String CANNOT_SELECT_DIFFERENT_SHIP_TO_ERROR = "cannotSelectDifferentShipToError";
	/** 行追加されたデータではないため、行削除できません。 */
	public static final String CANNOT_SELECT_EXCEPT_ADDED_DATA_ERROR = "cannotSelectExceptAddedDataError";
	/** 出庫指示済以外は発行できません。 */
	public static final String CANNOT_SELECT_EXCEPT_SHIP_INSTRUCTED_ERROR = "cannotSelectExceptShipInstructedError";
	/** 出荷停止中の納品先です。 */
	public static final String CANNOT_SELECT_STOPPED_SHIP_TO_ERROR = "cannotSelectStoppedShipToError";
	/** 仮登録の納品先は指定出来ません。 */
	public static final String CANNOT_SELECT_TEMPORARY_SHIP_TO_ERROR = "cannotSelectTemporaryShipToError";
	/** 運送業者CDが重複しています。 */
	public static final String CARRIER_CODE_DUPLICATE_ERROR = "carrierCodeDuplicateError";
	/** 運送業者マスタに存在しません。 */
	public static final String CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR = "carrierCodeNotFoundInCarrierMasterError";
	/** 配送コースマスタに運送業者CDが登録されていません。 */
	public static final String CARRIER_CODE_NOT_FOUND_IN_COURSE_MASTER_ERROR = "carrierCodeNotFoundInCourseMasterError";
	/** 運送業者を入力して下さい。 */
	public static final String CARRIER_CODE_NOT_INPUT_ERROR = "carrierCodeNotInputError";
	/** 納品先運送リードタイムを入力して下さい。 */
	public static final String CARRIER_READ_TIME_NOT_INPUT_ERROR = "carrierReadTimeNotInputError";
	/** 該当データの配送コースには送り状データ種別が登録されていません。 */
	public static final String CARRIER_SLIP_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR = "carrierSlipNotFoundInDeliveryCourseMasterError";
	/** ピース検品中です。箱登録後、ケース検品を行なって下さい。 */
	public static final String CASE_INSPECT_CANNOT_SELECT_PIECE_INSPECTING_ERROR = "caseInspectCannotSelectPieceInspectingError";
	/** ケース数またはバラ数は1以上で入力して下さい。 */
	public static final String CASE_OR_PIECE_QTY_INPUT_ERROR = "caseOrPieceQtyInputError";
	/** ケース数またはバラ数を入力して下さい。 */
	public static final String CASE_OR_PIECE_QTY_NOT_INPUT_ERROR = "caseOrPieceQtyNotInputError";
	/** センタCDが取引先マスタに存在しません。 */
	public static final String CENTAR_CODE_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "centarCodeNotFoundInPartnerMasterError";
	/** センタCDが重複しています。 */
	public static final String CENTER_CODE_DUPLICATE_ERROR = "centerCodeDuplicateError";
	/** センタ列CDが重複しています。 */
	public static final String CENTER_COL_CODE_DUPLICATE_ERROR = "centerColCodeDuplicateError";
	/** センタ列マスタに存在しません。 */
	public static final String CENTER_COL_NOT_FOUND_ERROR = "centerColNotFoundError";
	/** センタ項目CDが重複しています。 */
	public static final String CENTER_ITEM_CODE_DUPLICATE_ERROR = "centerItemCodeDuplicateError";
	/** センタ項目マスタに存在しません。 */
	public static final String CENTER_ITEM_NOT_FOUND_ERROR = "centerItemNotFoundError";
	/** センタマスタに存在しません。 */
	public static final String CENTER_NOT_FOUND_ERROR = "centerNotFoundError";
	/** センタ画面CDが重複しています。 */
	public static final String CENTER_SCREEN_CODE_DUPLICATE_ERROR = "centerScreenCodeDuplicateError";
	/** センタ画面マスタに存在しません。 */
	public static final String CENTER_SCREEN_NOT_FOUND_ERROR = "centerScreenNotFoundError";
	/** センタ */
	public static final String CENTER_TITLE = "centerTitle";
	/** ログイン情報を変更したため、メインメニューに遷移します。続行しますか？ */
	public static final String CHANGE_CENTER_CLIENT_CONFIRM = "changeCenterClientConfirm";
	/** 同一顧客入荷指示番号と仕入先CDのデータが既に存在します。 */
	public static final String CLIENT_AND_SUPPLIER_DUPLICATE_ERROR = "clientAndSupplierDuplicateError";
	/** 荷主センタマスタに存在しません。 */
	public static final String CLIENT_CENTER_NOT_FOUND_ERROR = "clientCenterNotFoundError";
	/** 切替 */
	public static final String CLIENT_CENTER_SELECT = "clientCenterSelect";
	/** 荷主CDが重複しています。 */
	public static final String CLIENT_CODE_DUPLICATE_ERROR = "clientCodeDuplicateError";
	/** 荷主列CDが重複しています。 */
	public static final String CLIENT_COL_CODE_DUPLICATE_ERROR = "clientColCodeDuplicateError";
	/** 荷主列マスタに存在しません。 */
	public static final String CLIENT_COL_NOT_FOUND_ERROR = "clientColNotFoundError";
	/** 荷主項目CDが重複しています。 */
	public static final String CLIENT_ITEM_CODE_DUPLICATE_ERROR = "clientItemCodeDuplicateError";
	/** 荷主項目マスタに存在しません。 */
	public static final String CLIENT_ITEM_NOT_FOUND_ERROR = "clientItemNotFoundError";
	/** 荷主マスタに存在しません。 */
	public static final String CLIENT_NOT_FOUND_ERROR = "clientNotFoundError";
	/** 同一の顧客入荷指示No.の伝票が既に登録済です。 */
	public static final String CLIENT_RECEIVE_NO_DATA_DUPLICATE_ERROR = "clientReceiveNoDataDuplicateError";
	/** 荷主画面CDが重複しています。 */
	public static final String CLIENT_SCREEN_CODE_DUPLICATE_ERROR = "clientScreenCodeDuplicateError";
	/** 荷主画面マスタに存在しません。 */
	public static final String CLIENT_SCREEN_NOT_FOUND_ERROR = "clientScreenNotFoundError";
	/** 顧客出荷指示No 英数字と-のみ */
	public static final String CLIENT_SHIPPING_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "clientShippingNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 顧客出荷指示Noは最大30文字以下を入力して下さい。 */
	public static final String CLIENT_SHIPPING_NO_CHECK_INPUT_MAX_ERROR = "clientShippingNoCheckInputMaxError";
	/** 同一の顧客出荷指示No.の伝票が既に登録済です。 */
	public static final String CLIENT_SHIPPING_NO_DATA_DUPLICATE_ERROR = "clientShippingNoDataDuplicateError";
	/** 顧客出荷指示Noを入力して下さい。 */
	public static final String CLIENT_SHIPPING_NO_NOT_INPUT_ERROR = "clientShippingNoNotInputError";
	/** 荷主 */
	public static final String CLIENT_TITLE = "clientTitle";
	/** 共通運送業者マスタに存在しません。 */
	public static final String COMMON_CARRIER_CODE_NOT_FOUND_IN_COMMON_CARRIER_MASTER_ERROR = "commonCarrierCodeNotFoundInCommonCarrierMasterError";
	/** 大口事業所フラグを入力して下さい。 */
	public static final String COMPANY_FLG_NAME_NOT_INPUT_ERROR = "companyFlgNameNotInputError";
	/** 明細行がありません。データを削除しますか？ */
	public static final String CONFIRM_UPDATE_DATA_NON_BODY = "confirmUpdateDataNonBody";
	/** カルチャマスタ存在しません。 */
	public static final String CULTURE_ID_NOT_FOUND_IN_CULTURE_MASTER_ERROR = "cultureIdNotFoundInCultureMasterError";
	/** 取引先略称は最大15文字以下を入力して下さい。 */
	public static final String CUSTOMER_ABBR_CHECK_INPUT_MAX_ERROR = "customerAbbrCheckInputMaxError";
	/** 取引先略称を入力して下さい。 */
	public static final String CUSTOMER_ABBR_NOT_INPUT_ERROR = "customerAbbrNotInputError";
	/** 既に登録されているセンタ、取引先があります。 */
	public static final String CUSTOMER_CD_DUPLICATE_ERROR = "customerCdDuplicateError";
	/** 取引先CDを入力して下さい。 */
	public static final String CUSTOMER_CD_NOT_INPUT_ERROR = "customerCdNotInputError";
	/** 既に登録されているセンタ、取引先があります。更新しますか？ */
	public static final String CUSTOMER_CD_REGISTER_CONFIRMATION = "customerCdRegisterConfirmation";
	/** 取引先CD 英数字と-のみ */
	public static final String CUSTOMER_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "customerCodeCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 取引先CDは最大10文字以下を入力して下さい。 */
	public static final String CUSTOMER_CODE_CHECK_INPUT_MAX_ERROR = "customerCodeCheckInputMaxError";
	/** 取引先CDが重複しています。 */
	public static final String CUSTOMER_CODE_DUPLICATE_ERROR = "customerCodeDuplicateError";
	/** 取引先マスタに存在しない取引先が含まれています。（取引先CD：[0]） */
	public static final String CUSTOMER_CODE_FOUND_DELETED_WITH_CD_ERROR = "customerCodeFoundDeletedWithCdError";
	/** 取引先マスタ取込（ワーク取込） */
	public static final String CUSTOMER_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "customerInputProgramNameInputWorkInformation";
	/** 取引先マスタ取込（データ移行） */
	public static final String CUSTOMER_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "customerInputProgramNameRegisterInformation";
	/** 取引先マスタ一括登録 */
	public static final String CUSTOMER_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "customerMasterBulkInputProgramNameInformation";
	/** 取引先名称は最大50文字以下を入力して下さい。 */
	public static final String CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "customerNmCheckInputMaxError";
	/** 取引先名称を入力して下さい。 */
	public static final String CUSTOMER_NM_NOT_INPUT_ERROR = "customerNmNotInputError";
	/** センタ間移動の取引先が登録されていません。出荷元のセンタ、納品先のセンタの取引先を登録してください。 */
	public static final String CUSTOMER_NOT_FOUND_CENTER_TRANSIT_ERROR = "customerNotFoundCenterTransitError";
	/** 取引先マスタに存在しません。 */
	public static final String CUSTOMER_NOT_FOUND_ERROR = "customerNotFoundError";
	/** 他の取引先に荷主取引先として登録されている取引先ですが、変更してもよろしいですか？ */
	public static final String CUSTOMER_REGISTER_USING_CLIENT_CUSTOMER_ANOTHER_CONFIRMATION = "customerRegisterUsingClientCustomerAnotherConfirmation";
	/** 他の取引先に社内入荷センタとして登録されているセンタですが、変更してもよろしいですか？ */
	public static final String CUSTOMER_REGISTER_USING_OWNED_CENTER_ANOTHER_CONFIRMATION = "customerRegisterUsingOwnedCenterAnotherConfirmation";
	/** 日次締処理をキューに登録しました。キューNo.([0]) */
	public static final String DAILY_BATCH_REGISTER_INFORMATION = "dailyBatchRegisterInformation";
	/** 日次処理実行中です。 */
	public static final String DAILY_CHECK_ERROR = "dailyCheckError";
	/** EC受注データの保持期間が作業データの保持期間より長く設定されています。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_ORDER_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalOrderKeepingDaysError";
	/** 前回の日次締処理より前の日付のため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_BEFORE_LAST_BUT_ONE_ERROR = "dailyProcessCannotInputBeforeLastButOneError";
	/** 在庫受払が存在しているため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_CONTAINED_STOCK_IN_OUT_ERROR = "dailyProcessCannotInputContainedStockInOutError";
	/** システム管理日付（翌稼働日）に現在のシステム管理日付と同じ日付は入力できません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_EQUAL_DATE_ERROR = "dailyProcessCannotInputEqualDateError";
	/** 日次締処理が一度も実行されていないため、システム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_INPUT_NOT_BEFORE_SYSTEM_DT_ERROR = "dailyProcessCannotInputNotBeforeSystemDtError";
	/** 日次処理中のため、操作できません。 */
	public static final String DAILY_PROCESS_CANNOT_OPERATION_RUNNING_ERROR = "dailyProcessCannotOperationRunningError";
	/** 日次処理中の荷主は選択できません。 */
	public static final String DAILY_PROCESS_CANNOT_SELECT_BATCH_PROGRESS_ERROR = "dailyProcessCannotSelectBatchProgressError";
	/** 在庫情報が未存在のためシステム管理日付を戻せません。 */
	public static final String DAILY_PROCESS_CANNOT_UPDATE_STOCK_REPORT_NOT_FOUND_ERROR = "dailyProcessCannotUpdateStockReportNotFoundError";
	/** 在庫が未存在のため復元できませんでした。(入庫ラベルNo.：[0]) */
	public static final String DAILY_PROCESS_CANNOT_UPDATE_STOCK_REPORT_NOT_FOUND_INFORMATION = "dailyProcessCannotUpdateStockReportNotFoundInformation";
	/** 日次処理中です！操作には十分注意して下さい。 */
	public static final String DAILY_PROCESS_CAUTIONS_OPERATION_RUNNING_INFORMATION = "dailyProcessCautionsOperationRunningInformation";
	/** 選択した荷主の日次締め処理を実行しますか？ */
	public static final String DAILY_PROCESS_EXECUTE_CONFIRMATION = "dailyProcessExecuteConfirmation";
	/** 前回システム管理日付：[0] */
	public static final String DAILY_PROCESS_PARAMETER_DAILY_DATE_UPDATE_INFORMATION = "dailyProcessParameterDailyDateUpdateInformation";
	/** 取込み種別CD：[0] , システム管理日付：[1] , 受注保持期間：[2] */
	public static final String DAILY_PROCESS_PARAMETER_EC_DATA_DELETE_INFORMATION = "dailyProcessParameterEcDataDeleteInformation";
	/** システム管理日付：[0] , 履歴データ保持期間：[1] */
	public static final String DAILY_PROCESS_PARAMETER_HISTORY_DATA_DELETE_INFORMATION = "dailyProcessParameterHistoryDataDeleteInformation";
	/** システム管理日付：[0] , トランザクション保持期間：[1] */
	public static final String DAILY_PROCESS_PARAMETER_HISTORY_DATA_MOVE_INFORMATION = "dailyProcessParameterHistoryDataMoveInformation";
	/** センタCD：[0] , 荷主CD：[1] , 前回システム管理日付：[2] , システム管理日付：[3] , システム管理日付（翌稼働日）：[4] */
	public static final String DAILY_PROCESS_PARAMETER_INFORMATION = "dailyProcessParameterInformation";
	/** システム管理日付：[0] , システム管理日付（翌稼働日）：[1] */
	public static final String DAILY_PROCESS_PARAMETER_STOCK_DAILY_INFORMATION = "dailyProcessParameterStockDailyInformation";
	/** システム管理日付：[0] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DATE_UPDATE_INFORMATION = "dailyProcessParameterSystemDateUpdateInformation";
	/** システム管理日付：[0] , 未処理データ保持期間：[1] */
	public static final String DAILY_PROCESS_PARAMETER_UNPROCESS_DATA_DELETE_INFORMATION = "dailyProcessParameterUnprocessDataDeleteInformation";
	/** 日次処理 */
	public static final String DAILY_PROCESS_PROGRAM_NAME_INFORMATION = "dailyProcessProgramNameInformation";
	/** 日次処理実行中のため、メインメニューに戻ります。 */
	public static final String DAILY_PROCESS_RUNNING_CONFIRM = "dailyProcessRunningConfirm";
	/** 前回システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_DAILY_DATE_UPDATE_INFORMATION = "dailyProcessSectionNameDailyDateUpdateInformation";
	/** EC受注データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EC_DATA_DELETE_INFORMATION = "dailyProcessSectionNameEcDataDeleteInformation";
	/** EDIデータ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EDI_DATA_DELETE_INFORMATION = "dailyProcessSectionNameEdiDataDeleteInformation";
	/** 履歴データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_DELETE_INFORMATION = "dailyProcessSectionNameHistoryDataDeleteInformation";
	/** 履歴データ移動 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_MOVE_INFORMATION = "dailyProcessSectionNameHistoryDataMoveInformation";
	/** 在庫繰越 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_DAILY_INFORMATION = "dailyProcessSectionNameStockDailyInformation";
	/** 在庫日報復元 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_REPORT_RECOVERY_INFORMATION = "dailyProcessSectionNameStockReportRecoveryInformation";
	/** システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_SYSTEM_DATE_UPDATE_INFORMATION = "dailyProcessSectionNameSystemDateUpdateInformation";
	/** 未処理データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_UNPROCESS_DATA_DELETE_INFORMATION = "dailyProcessSectionNameUnprocessDataDeleteInformation";
	/** 削除フラグは「0」か「1」を設定して下さい。 */
	public static final String DALETE_FLAG_INPUT_EXCEPT_ZERO_OR_ONE_ERROR = "daleteFlagInputExceptZeroOrOneError";
	/** 使用中のデータが含まれている可能性があります。内容を確認して下さい。 */
	public static final String DATA_CANNNOT_DELETE_SQL_EXCEPTION_ERROR = "dataCannnotDeleteSqlExceptionError";
	/** 緊急補充は取消できません。 */
	public static final String DATA_CANNOT_CANCEL_EMERGENCY_REPLENISHMENT_DATA_ERROR = "dataCannotCancelEmergencyReplenishmentDataError";
	/** 未登録データです。 */
	public static final String DATA_CANNOT_INPUT_NOT_REGISTERED_ERROR = "dataCannotInputNotRegisteredError";
	/** WMS入荷伝票No.が同じ行を選択して下さい。 */
	public static final String DATA_CANNOT_REGISTER_ERROR = "dataCannotRegisterError";
	/** 未完了データは登録できません。 */
	public static final String DATA_CANNOT_REGISTER_UNFINISHED_ERROR = "dataCannotRegisterUnfinishedError";
	/** 緊急補充以外のデータを選択して下さい。 */
	public static final String DATA_CANNOT_SELECT_EMERGENCY_REPLENISHMENT_DATA_ERROR = "dataCannotSelectEmergencyReplenishmentDataError";
	/** 同一顧客出荷指示No.、納品先CDの明細データの処理区分、納品予定日、作業日、出荷日、配送コースCD、納品指定日、納品時間帯、緊急フラグ、届先、出庫作業メッセージが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_ERROR = "dataCheckClientShippingNoError";
	/** 完納のデータが含まれています。 */
	public static final String DATA_COMPLETED_CANNOT_SELECT_ERROR = "dataCompletedCannotSelectError";
	/** [0]データ 削除 件数：[1]件 */
	public static final String DATA_DELETE_DAILY_PROCESS_INFORMATION = "dataDeleteDailyProcessInformation";
	/** 重複データが含まれています。 */
	public static final String DATA_DUPLICATE_ERROR = "dataDuplicateError";
	/** 総件数：[0]件 正常件数：[1]件 エラー件数：[2]件 */
	public static final String DATA_INPUT_REGISTER_INFORMATION = "dataInputRegisterInformation";
	/** 初期データ取込種別マスタに存在しません。 */
	public static final String DATA_INPUT_TYPE_NOT_FOUND_ERROR = "dataInputTypeNotFoundError";
	/** 該当データが複数存在しています、処理できません。 */
	public static final String DATA_PLURAL_FOUND_ERROR = "dataPluralFoundError";
	/** [0]データ 追加 件数：[1]件 */
	public static final String DATA_REGISTER_DAILY_PROCESS_INFORMATION = "dataRegisterDailyProcessInformation";
	/** [0]データ 更新 件数：[1]件 */
	public static final String DATA_UPDATE_DAILY_PROCESS_INFORMATION = "dataUpdateDailyProcessInformation";
	/** 前日以前の日付には変更できません。 */
	public static final String DATE_BEFORE_CANNOT_CHANGE_ERROR = "dateBeforeCannotChangeError";
	/** 日付は伝票番号単位で変更して下さい。(運送業者もしくは、商品CDを検索条件から外して下さい。) */
	public static final String DATE_CANNOT_CHANGE_SAME_DOCUMENT_NUMBER_ERROR = "dateCannotChangeSameDocumentNumberError";
	/** 前日以前の日付を入力する事は出来ません。 */
	public static final String DATE_CANNOT_INPUT_BEFORE_DATE_ERROR = "dateCannotInputBeforeDateError";
	/** 入力した日付が不正です。 */
	public static final String DATE_INPUT_ERROR = "dateInputError";
	/** 日付一括変更 */
	public static final String DATE_UPDATE_CONDITION = "dateUpdateCondition";
	/** 削除済の為、修正出来ません。 */
	public static final String DELETED_CANNOT_CHANGE_ERROR = "deletedCannotChangeError";
	/** 削除済の為、削除出来ません。 */
	public static final String DELETED_CANNOT_DELETE_ERROR = "deletedCannotDeleteError";
	/** 削除済の為、処理できません。 */
	public static final String DELETED_CANNOT_EXECUTE_ERROR = "deletedCannotExecuteError";
	/** 削除済のデータが含まれている為、発行はできません。 */
	public static final String DELETED_DATA_CANNOT_OUTPUT_ERROR = "deletedDataCannotOutputError";
	/** 削除フラグが存在しません。 */
	public static final String DEL_FLG_NOT_FOUND_ERROR = "delFlgNotFoundError";
	/** 削除フラグを入力して下さい。 */
	public static final String DEL_FLG_NOT_INPUT_ERROR = "delFlgNotInputError";
	/** 届先住所1は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS1_CHECK_INPUT_MAX_ERROR = "delivAddress1CheckInputMaxError";
	/** 届先住所2は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS2_CHECK_INPUT_MAX_ERROR = "delivAddress2CheckInputMaxError";
	/** 届先住所3は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS3_CHECK_INPUT_MAX_ERROR = "delivAddress3CheckInputMaxError";
	/** 届先住所を入力して下さい。 */
	public static final String DELIV_ADDRESS_NO_INPUT_ERROR = "delivAddressNoInputError";
	/** 届先住所補足は最大50文字以下を入力して下さい。 */
	public static final String DELIV_ADDRESS_SUPPLY_CHECK_INPUT_MAX_ERROR = "delivAddressSupplyCheckInputMaxError";
	/** 届先CD 英数字と-のみ */
	public static final String DELIV_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "delivCustomerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 届先CDは最大10文字以下を入力して下さい。 */
	public static final String DELIV_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR = "delivCustomerCdCheckInputMaxError";
	/** 届先CDは取引先マスタに存在しません。 */
	public static final String DELIV_CUSTOMER_CD_NOT_FOUND_ERROR = "delivCustomerCdNotFoundError";
	/** 届先CDを入力して下さい。 */
	public static final String DELIV_CUSTOMER_CD_NOT_INPUT_ERROR = "delivCustomerCdNotInputError";
	/** 届先名称は最大50文字以下を入力して下さい。 */
	public static final String DELIV_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "delivCustomerNmCheckInputMaxError";
	/** 納品指定日は出荷日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR = "delivDateCannotChangeBeforeShipDateError";
	/** 納品指定日は作業日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "delivDateCannotChangeBeforeWorkDateError";
	/** 納品指定日が日付不正(形式:yyyy/MM/dd) */
	public static final String DELIV_DT_DATE_ERROR = "delivDtDateError";
	/** 出荷状況が複数存在しています。出庫指示一覧にて処理を進めて下さい。 */
	public static final String DELIVERY_COURSE_CANNOT_SELECT_DIFFERENT_SHIP_STATUS_ERROR = "deliveryCourseCannotSelectDifferentShipStatusError";
	/** 配送コースCD 英数字と-のみ */
	public static final String DELIVERY_COURSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "deliveryCourseCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 配送コースCDは最大5文字以下を入力して下さい。 */
	public static final String DELIVERY_COURSE_CD_CHECK_INPUT_MAX_ERROR = "deliveryCourseCdCheckInputMaxError";
	/** 配送コースCDが配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_CD_NOT_FOUND_ERROR = "deliveryCourseCdNotFoundError";
	/** 配送コースCDを入力して下さい。 */
	public static final String DELIVERY_COURSE_CD_NOT_INPUT_ERROR = "deliveryCourseCdNotInputError";
	/** 未出荷またはエラー以外の出荷指示に対して、配送コースは変更できません。 */
	public static final String DELIVERY_COURSE_CHANGE_START_ERROR = "deliveryCourseChangeStartError";
	/** 配送コースCDが重複しています。 */
	public static final String DELIVERY_COURSE_CODE_DUPLICATE_ERROR = "deliveryCourseCodeDuplicateError";
	/** 配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_NOT_FOUND_ERROR = "deliveryCourseNotFoundError";
	/** 入力された配送コースが配送コースマスタに存在しません。 */
	public static final String DELIVERY_COURSE_NOT_FOUND_IN_COURSE_MASTER_ERROR = "deliveryCourseNotFoundInCourseMasterError";
	/** 配送コース一括変更 */
	public static final String DELIVERY_COURSE_UPDATE_CONDITION = "deliveryCourseUpdateCondition";
	/** 納品先フラグが存在しません。 */
	public static final String DELIVERY_FLG_NOT_FOUND_ERROR = "deliveryFlgNotFoundError";
	/** 納品先フラグを入力して下さい。 */
	public static final String DELIVERY_FLG_NOT_INPUT_ERROR = "deliveryFlgNotInputError";
	/** 配送順に小数は入力できません。 */
	public static final String DELIVERY_ORDER_CHECK_INPUT_DECIMAL_ERROR = "deliveryOrderCheckInputDecimalError";
	/** 配送順は整数5桁以内を入力して下さい。 */
	public static final String DELIVERY_ORDER_CHECK_INPUT_INTEGER_ERROR = "deliveryOrderCheckInputIntegerError";
	/** 配送順 数値のみ */
	public static final String DELIVERY_ORDER_CHECK_NUMERIC_ONLY_ERROR = "deliveryOrderCheckNumericOnlyError";
	/** 配送順は最小1以上を入力して下さい。 */
	public static final String DELIVERY_ORDER_INPUT_REQUEST_MIN_IS_ONE_ERROR = "deliveryOrderInputRequestMinIsOneError";
	/** 配送リードタイムに小数は入力できません。 */
	public static final String DELIVERY_READTIME_CHECK_INPUT_DECIMAL_ERROR = "deliveryReadtimeCheckInputDecimalError";
	/** 配送リードタイムは整数5桁以内を入力して下さい。 */
	public static final String DELIVERY_READTIME_CHECK_INPUT_INTEGER_ERROR = "deliveryReadtimeCheckInputIntegerError";
	/** 配送リードタイム 数値のみ */
	public static final String DELIVERY_READTIME_CHECK_NUMERIC_ONLY_ERROR = "deliveryReadtimeCheckNumericOnlyError";
	/** 配送リードタイムは最小1以上を入力して下さい。 */
	public static final String DELIVERY_READ_TIME_INPUT_REQUEST_MIN_IS_ONE_ERROR = "deliveryReadTimeInputRequestMinIsOneError";
	/** センタ納品フラグが存在しません。 */
	public static final String DELIVERY_TO_CENTER_FLAG_NOT_FOUND_ERROR = "deliveryToCenterFlagNotFoundError";
	/** 納品予定日は出荷日より前の日付に変更できません。 */
	public static final String DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR = "delivPlanDateCannotChangeBeforeShipDateError";
	/** 納品予定日は作業日より前の日付に変更できません。 */
	public static final String DELIV_PLAN_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "delivPlanDateCannotChangeBeforeWorkDateError";
	/** 納品予定日が日付不正(形式:yyyy/MM/dd) */
	public static final String DELIV_PLAN_DT_DATE_ERROR = "delivPlanDtDateError";
	/** 届先電話番号は最大15文字以下を入力して下さい。 */
	public static final String DELIV_TEL_NO_CHECK_INPUT_MAX_ERROR = "delivTelNoCheckInputMaxError";
	/** 届先電話番号 数字と-のみ */
	public static final String DELIV_TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR = "delivTelNoCheckNumericAndHyphenOnlyError";
	/** 納品時間帯CDが存在しません。 */
	public static final String DELIV_TZ_NOT_FOUND_ERROR = "delivTzNotFoundError";
	/** 届先郵便番号は最大7文字以下を入力して下さい。 */
	public static final String DELIV_ZIP_CD_CHECK_INPUT_MAX_ERROR = "delivZipCdCheckInputMaxError";
	/** 届先郵便番号 数値のみ */
	public static final String DELIV_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "delivZipCdCheckNumericOnlyError";
	/** 親商品と構成品には同じ預託・在庫区分を指示してください。 */
	public static final String DEPOSIT_AND_LOCATION_CANNOT_EXECUTE_DIFFERENCE_ERROR = "depositAndLocationCannotExecuteDifferenceError";
	/** 預託CDは取引先マスタに存在しません。 */
	public static final String DEPOSIT_CD_NOT_FOUND_ERROR = "depositCdNotFoundError";
	/** 預託先フラグが存在しません。 */
	public static final String DEPOSIT_FLG_NOT_FOUND_ERROR = "depositFlgNotFoundError";
	/** 預託先フラグを入力して下さい。 */
	public static final String DEPOSIT_FLG_NOT_INPUT_ERROR = "depositFlgNotInputError";
	/** 取引先マスタに預託が存在しません。 */
	public static final String DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR = "depositStockClassNotFoundError";
	/** 同一伝票の明細データの預託在庫区分が不一致です。 */
	public static final String DEPOSIT_STOCK_CLASS_UNMATCH_ERROR = "depositStockClassUnmatchError";
	/** 取引先区分(預託先)が存在しません。 */
	public static final String DEPOSIT_STOCK_FLAG_NOT_FOUND_ERROR = "depositStockFlagNotFoundError";
	/** 同一の顧客入荷指示No、仕入先内で預託が不一致です。 */
	public static final String DEPOSIT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "depositUnmatchInClientReceiveNoOnBulkError";
	/** 配送指定時間が存在しません。 */
	public static final String DESIGNATED_DELIVERY_TIME_NOT_FOUND_ERROR = "designatedDeliveryTimeNotFoundError";
	/** 明細行はすべて対象外ですが、除外を確認して下さい。 */
	public static final String DETAIL_LINE_CANNOT_SELECT_EXCEPTION_ERROR = "detailLineCannotSelectExceptionError";
	/** 明細にエラーがあります。 */
	public static final String DETAIL_LINE_FOUND_ERROR = "detailLineFoundError";
	/** 明細行を入力して下さい。 */
	public static final String DETAIL_LINE_NOT_INPUT_ERROR = "detailLineNotInputError";
	/** 伝票区分が存在しません。 */
	public static final String DOCUMENT_CLASS_NOT_FOUND_ERROR = "documentClassNotFoundError";
	/** 処理は正常終了しましたが、エラーデータが含まれています。[/]WMS入荷伝票No.：[0]で登録しました。商品内容が異なるため新しい入庫ラベルNo.で登録された商品があります。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_AND_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "documentNumberConfirmationErrorIncludedAndNewCauseStoreLabelUsedInformation";
	/** 処理は正常終了しましたが、エラーデータが含まれています。[/]WMS入荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_ERROR_INCLUDED_INFORMATION = "documentNumberConfirmationErrorIncludedInformation";
	/** WMS入荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_INFORMATION = "documentNumberConfirmationInformation";
	/** WMS入荷伝票No.：[0]で登録しました。商品内容が異なるため新しい入庫ラベルNo.で登録された商品があります。 */
	public static final String DOCUMENT_NUMBER_CONFIRMATION_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "documentNumberConfirmationNewCauseStoreLabelUsedInformation";
	/** 伝票番号が重複しています。 */
	public static final String DOCUMENT_NUMBER_DUPLICATE_ERROR = "documentNumberDuplicateError";
	/** 伝票番号が既に存在します。 */
	public static final String DOCUMENT_NUMBER_FOUND_ERROR = "documentNumberFoundError";
	/** WMS出荷伝票No.：[0]で登録しました。 */
	public static final String DOCUMENT_SHIPPING_SLIP_NO_INFORMATION = "documentShippingSlipNoInformation";
	/** 住所が変更されていますが、宜しいですか？ */
	public static final String EC_DELIV_ADDRESS_MODIFY_UPDATE_CONFIRMATION = "ecDelivAddressModifyUpdateConfirmation";
	/** 送付先住所を入力して下さい。 */
	public static final String EC_DELIV_ADDRESS_NO_INPUT_ERROR = "ecDelivAddressNoInputError";
	/** 注文ファイルの注文IDが重複しています。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_DUPLICATE_ERROR = "ecOrderBulkInputCannotUploadOrderDuplicateError";
	/** 商品ファイルの注文IDが注文ファイルに存在しません。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_ORDER_NOT_FOUND_ERROR = "ecOrderBulkInputCannotUploadOrderNotFoundError";
	/** 注文ファイルの注文IDが商品ファイルに存在しません。(注文ID：[0]) */
	public static final String EC_ORDER_BULK_INPUT_CANNOT_UPLOAD_PRODUCT_NOT_FOUND_ERROR = "ecOrderBulkInputCannotUploadProductNotFoundError";
	/** 未出荷以外の受注データはキャンセルできません。 */
	public static final String EC_ORDER_CANNOT_CANCEL_EXCEPT_NOT_SHIPPING_ERROR = "ecOrderCannotCancelExceptNotShippingError";
	/** 同梱する商品が異なる出庫作業No.で登録されています。同梱商品はまとめて出庫指示してください。（名寄せID：[0]） */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_DIFFERENT_PICKING_WORK_NO_ERROR = "ecOrderCannotStatementOutDifferentPickingWorkNoError";
	/** 未出荷またはキャンセルまたはエラー有または出庫指示削除の受注データは納品書を出力できません。 */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_NOT_SHIPPING_ERROR = "ecOrderCannotStatementOutNotShippingError";
	/** 同梱する商品の合計金額が異なります。同梱商品はまとめて出力してください。（名寄せID：[0]） */
	public static final String EC_ORDER_CANNOT_STATEMENT_OUT_TOTAL_UNMATCH_ERROR = "ecOrderCannotStatementOutTotalUnmatchError";
	/** 未出荷以外の受注データは修正できません。 */
	public static final String EC_ORDER_CANNOT_UPDATE_EXCEPT_NOT_SHIPPING_ERROR = "ecOrderCannotUpdateExceptNotShippingError";
	/** EC受注データが既に取り込まれています。（受注番号：[0]） */
	public static final String EC_ORDER_DUPLICATE_ORDER_NO_ERROR = "ecOrderDuplicateOrderNoError";
	/** 受注番号が設定されていない行があるため、取込み出来ません。 */
	public static final String EC_ORDER_NECESSARY_ORDER_NO_ERROR = "ecOrderNecessaryOrderNoError";
	/** 商品CDが設定されていない行があるため、取込み出来ません。 */
	public static final String EC_ORDER_NECESSARY_PRODUCT_CD_ERROR = "ecOrderNecessaryProductCdError";
	/** 未出荷またはキャンセルまたはエラー有または出庫指示削除の受注データは送り状データを作成できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_INVOICE_CREATE_NOT_SHIPPING_ERROR = "ecShippingTagDataOutputCannotInvoiceCreateNotShippingError";
	/** 異なる運送業者のデータが選択されているため、出力できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_CARRIER_TO_ERROR = "ecShippingTagDataOutputCannotSelectDifferentCarrierToError";
	/** 異なる送り状データ種別のデータが選択されているため、出力できません。 */
	public static final String EC_SHIPPING_TAG_DATA_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_DATA_TYPE_ERROR = "ecShippingTagDataOutputCannotSelectDifferentTagDataTypeError";
	/** 受信CD：[0] , 荷主CD：[1] */
	public static final String EDI_PARAMETER_CLIENT_CD_ONLY_INFORMATION = "ediParameterClientCdOnlyInformation";
	/** 受信CD：[0] , センタCD：[1] , 荷主CD：[2] */
	public static final String EDI_PARAMETER_INFORMATION = "ediParameterInformation";
	/** 緊急フラグが存在しません。 */
	public static final String EMERGENCY_FLAG_NOT_FOUND_ERROR = "emergencyFlagNotFoundError";
	/** 緊急フラグを入力して下さい。 */
	public static final String EMERGENCY_FLG_NOT_INPUT_ERROR = "emergencyFlgNotInputError";
	/** 緊急補充移動先ロケーションが補充マスタに設定しません。 */
	public static final String EMERGENCY_REPLENISHMENT_LOCATION_NOT_FOUND_IN_REPLENISHMENT_MASTER_ERROR = "emergencyReplenishmentLocationNotFoundInReplenishmentMasterError";
	/** エラーチェック処理を行います。宜しいですか？ */
	public static final String ERROR_CHECK_EXECUTE_CONFIRMATION = "errorCheckExecuteConfirmation";
	/** 未出荷またはエラー以外の出荷指示に対して、エラーチェックを実行できません。 */
	public static final String ERROR_CHECK_START_ERROR = "errorCheckStartError";
	/** エラーデータを複製することはできません。 */
	public static final String ERROR_DATA_CANNOT_COPY_ERROR = "errorDataCannotCopyError";
	/** エラーデータが含まれています。 */
	public static final String ERROR_DATA_FOUND_ERROR = "errorDataFoundError";
	/** エラー以外は削除することはできません。 */
	public static final String ERROR_DELETE_START_ERROR = "errorDeleteStartError";
	/** Excelダウンロード */
	public static final String EXCEL_DOWNLOAD_TITLE_INFORMATION = "excelDownloadTitleInformation";
	/** [0]行のデータを読み込みました。 */
	public static final String EXCEL_READ_SUCCESS_CONFIRMATION = "excelReadSuccessConfirmation";
	/** 他のユーザが変更している可能性があります。内容を確認して下さい。 */
	public static final String EXCLUSIVE_CONTROL_ERROR = "exclusiveControlError";
	/** 定点に小数は入力できません。 */
	public static final String FIXED_POINT_CHECK_INPUT_DECIMAL_ERROR = "fixedPointCheckInputDecimalError";
	/** 定点は最大9999999以下を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_MAX_ERROR = "fixedPointCheckInputMaxError";
	/** 定点は最小0以上を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_MIN_ERROR = "fixedPointCheckInputMinError";
	/** 定点 数値のみ */
	public static final String FIXED_POINT_CHECK_NUMERIC_ONLY_ERROR = "fixedPointCheckNumericOnlyError";
	/** 出庫指示済またはピッキング済以外の出庫指示に対して、強制出荷の確定はできません。 */
	public static final String FORCED_SHIP_COMPLETE_START_ERROR = "forcedShipCompleteStartError";
	/** エラーデータ以外が含まれています。 */
	public static final String FOUND_EXCEPT_ERROR_DATA_ERROR = "foundExceptErrorDataError";
	/** ロケーションマスタに存在します。 */
	public static final String FOUND_IN_LOCATION_MASTER_ERROR = "foundInLocationMasterError";
	/** 取引先マスタに既に登録されています。 */
	public static final String FOUND_IN_PARTNER_MASTER_ERROR = "foundInPartnerMasterError";
	/** 棚補充マスタに既に登録されています。 */
	public static final String FOUND_IN_REPLENISHMENT_MASTER_ERROR = "foundInReplenishmentMasterError";
	/** 分納のデータが含まれています。 */
	public static final String FOUND_INSTALLMENT_RECEIVE_DATA_ERROR = "foundInstallmentReceiveDataError";
	/** 出荷未確定のデータが含まれています。 */
	public static final String FOUND_NOT_SHIP_COMPLETED_ERROR = "foundNotShipCompletedError";
	/** 出荷確定済のデータが含まれています。 */
	public static final String FOUND_SHIP_COMPLETED_ERROR = "foundShipCompletedError";
	/** 引当禁止のロケーションが含まれています。 */
	public static final String FOUND_STOPPED_ALLOC_TO_ERROR = "foundStoppedAllocToError";
	/** 出荷停止中、または引当不可の商品が含まれています。 */
	public static final String FOUND_STOPPED_OR_PRODUCT_ERROR = "foundStoppedOrProductError";
	/** 出荷停止の取引先が含まれています。 */
	public static final String FOUND_STOPPED_SHIP_TO_ERROR = "foundStoppedShipToError";
	/** 出荷停止の取引先が含まれていました。出庫指示一覧で確認して下さい。 */
	public static final String FOUND_STOPPED_SHIP_TO_INFORMATION = "foundStoppedShipToInformation";
	/** 荷札未発行のデータが含まれています。 */
	public static final String FOUND_TAG_NOT_PRINTED_DATA_ERROR = "foundTagNotPrintedDataError";
	/** 梱包情報取得時にエラーが発生しました。 */
	public static final String GET_PACKING_INFORMATION_FAILED_INFORMATION = "getPackingInformationFailedInformation";
	/** 納品日の取得に失敗しました。 */
	public static final String GET_SHIPPING_DATE_FAILED_INFORMATION = "getShippingDateFailedInformation";
	/** ピース総重量(g) は最大9999999以下を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_MAX_ERROR = "grossWeightCheckInputMaxError";
	/** ピース総重量(g) は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_MIN_ERROR = "grossWeightCheckInputMinError";
	/** ピース総重量(g) 数値のみ */
	public static final String GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "grossWeightCheckNumericOnlyError";
	/** 総重量(g)は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "grossWeightInputRequestMinIsZeroError";
	/** ログインできません。再度入力してください。 */
	public static final String HANDY_LOGIN_AUTH_ERROR = "handyLoginAuthError";
	/** ピース高さ(mm) は最大99999以下を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_MAX_ERROR = "heightCheckInputMaxError";
	/** ピース高さ(mm) は最小0以上を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_MIN_ERROR = "heightCheckInputMinError";
	/** ピース高さ(mm) 数値のみ */
	public static final String HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "heightCheckNumericOnlyError";
	/** 高さ(mm)は最小0以上を入力して下さい。 */
	public static final String HEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "heightInputRequestMinIsZeroError";
	/** 同じ伝票No.を選択して下さい。 */
	public static final String IDENTICAL_SHIPPING_SLIP_NO_NOT_SELECT_ERROR = "identicalShippingSlipNoNotSelectError";
	/** 親商品と構成品が同じです。 */
	public static final String IDENTITY_PARENT_PRODUCT_AND_STRUCTURE_PRODUCT_ERROR = "identityParentProductAndStructureProductError";
	/** 取込種別CDが重複しています。 */
	public static final String IMPORT_TYPE_DUPLICATE_ERROR = "importTypeDuplicateError";
	/** 取込み種別マスタに存在しません。 */
	public static final String IMPORT_TYPE_NOT_FOUND_ERROR = "importTypeNotFoundError";
	/** 入力内容に誤りがあります。 */
	public static final String INPUT_ERROR = "inputError";
	/** ロケーションCDFromTo逆転 */
	public static final String INPUT_LIMIT_CHECK_CD_REVERSAL_ERROR = "inputLimitCheckCdReversalError";
	/** 登録対象データが存在しません。 */
	public static final String INSERT_DATA_NOT_FOUND_INFORMATION = "insertDataNotFoundInformation";
	/** 対象の出庫作業No／梱包Noはケースのみなので、出荷検品できません。 */
	public static final String INSPECT_CANNOT_SELECT_ONLY_CASE_ERROR = "inspectCannotSelectOnlyCaseError";
	/** 一部欠品の出荷停止データが含まれています。 */
	public static final String INSPECT_CANNOT_START_SOME_STOCK_OUT_SHIPPING_STOP_DATA_ERROR = "inspectCannotStartSomeStockOutShippingStopDataError";
	/** すべての検品作業が完了しました。 */
	public static final String INSPECT_COMPLETE_ALL_INFORMATION = "inspectCompleteAllInformation";
	/** 出荷検品済のデータが含まれています。 */
	public static final String INSPECTED_DATA_FOUND_ERROR = "inspectedDataFoundError";
	/** 該当商品は指示数を超えています。 */
	public static final String INSPECT_QTY_CANNOT_INPUT_MORE_THAN_SHIP_ODER_QTY_ERROR = "inspectQtyCannotInputMoreThanShipOderQtyError";
	/** 出荷検品処理を再開します。 */
	public static final String INSPECT_RESTART_CONFIRMATION = "inspectRestartConfirmation";
	/** 検品完了です。クリアしますか？ */
	public static final String INSPECT_RESULT_CLEAR_COMPLETED_CONFIRMATION = "inspectResultClearCompletedConfirmation";
	/** 検品クリア処理が正常終了しました。 */
	public static final String INSPECT_RESULT_CLEAR_COMPLETED_INFORMATION = "inspectResultClearCompletedInformation";
	/** 検品中です。クリアして宜しいでしょうか？ */
	public static final String INSPECT_RESULT_CLEAR_INSPECTING_CONFIRMATION = "inspectResultClearInspectingConfirmation";
	/** 該当商品の検品数をリセットします。宜しいですか？ */
	public static final String INSPECT_RESULT_QTY_CLEAR_CONFIRMATION = "inspectResultQtyClearConfirmation";
	/** 分納の場合は分納指示日を入力して下さい。 */
	public static final String INSTALLMENT_RECEIVE_PLAN_DATE_NOT_INPUT_ERROR = "installmentReceivePlanDateNotInputError";
	/** 構成品の指示数が超過している為、指示できません。 */
	public static final String INST_NUM_CANNOT_EXECUTE_OVERAGE_ERROR = "instNumCannotExecuteOverageError";
	/** 構成品の指示数が不足している為、指示できません。 */
	public static final String INST_NUM_CANNOT_EXECUTE_SHORTAGE_ERROR = "instNumCannotExecuteShortageError";
	/** 指示数に小数は入力できません。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_ERROR = "instNumCheckInputDecimalError";
	/** 指示数は整数7桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_INTEGER_ERROR = "instNumCheckInputIntegerError";
	/** 指示数は最大9999999以下を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_MAX_ERROR = "instNumCheckInputMaxError";
	/** 指示数 数値のみ */
	public static final String INST_NUM_CHECK_NUMERIC_ONLY_ERROR = "instNumCheckNumericOnlyError";
	/** 指示数は1以上の数値を入力して下さい。 */
	public static final String INST_NUM_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "instNumInputRequestMoreThanOneError";
	/** 指示数を入力して下さい。 */
	public static final String INST_NUM_NOT_INPUT_ERROR = "instNumNotInputError";
	/** 構成品の指示数が不足している為、解除できません。 */
	public static final String INSTRUCTION_REGISTER_SHORTAGE_ERROR = "instructionRegisterShortageError";
	/** 検品中断処理が正常終了しました。 */
	public static final String INTERRUPT_INSPECT_COMPLETE_INFORMATION = "interruptInspectCompleteInformation";
	/** 検品を中断します。宜しいですか？ */
	public static final String INTERRUPT_INSPECT_EXECUTE_CONFIRMATION = "interruptInspectExecuteConfirmation";
	/** 既に在庫調整済です、更新できません */
	public static final String INVENTORY_ALL_COMPLETE_STOCK_UPDATE_ERROR = "inventoryAllCompleteStockUpdateError";
	/** 差異が無い商品は更新できません */
	public static final String INVENTORY_ALL_NO_DIFF_STOCK_UPDATE_ERROR = "inventoryAllNoDiffStockUpdateError";
	/** 棚卸入力がされていないデータは更新できません。 */
	public static final String INVENTORY_BULK_UPDATE_CANNOT_UPDATE_NOT_INVENTORY_INPUT_ERROR = "inventoryBulkUpdateCannotUpdateNotInventoryInputError";
	/** 異なる送り状種別のデータが選択されているため、出力できません。 */
	public static final String INVOICE_TAG_REPORT_OUTPUT_CANNOT_SELECT_DIFFERENT_TAG_TYPE_ERROR = "invoiceTagReportOutputCannotSelectDifferentTagTypeError";
	/** 対象商品は検品済です。 */
	public static final String ITEM_INSPECTED_ERROR = "itemInspectedError";
	/** JANCDは最大13文字以下を入力して下さい。 */
	public static final String JAN_CD_CHECK_INPUT_MAX_ERROR = "janCdCheckInputMaxError";
	/** JANCD 数値のみ */
	public static final String JAN_CD_CHECK_NUMERIC_ONLY_ERROR = "janCdCheckNumericOnlyError";
	/** JANCDが重複しています。 */
	public static final String JAN_CD_DUPLICATE_ERROR = "janCdDuplicateError";
	/** JANCDの入力内容に誤りがあります。 */
	public static final String JAN_CODE_INPUT_ERROR = "janCodeInputError";
	/** 日本郵政着店マスタ取込（ワーク取込） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "jpCarrierZipInputProgramNameInputWorkInformation";
	/** 日本郵政着店マスタ取込（データ移行） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "jpCarrierZipInputProgramNameRegisterInformation";
	/** キー項目の変更はできません。 */
	public static final String KEY_ITEＭ_CANNOT_CHANGE_ERROR = "keyIteｍCannotChangeError";
	/** キーが重複しています。 */
	public static final String KEY_ITEＭ_DUPLICATE_ERROR = "keyIteｍDuplicateError";
	/** ピース縦(mm) は最大99999以下を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_MAX_ERROR = "lengthCheckInputMaxError";
	/** ピース縦(mm) は最小0以上を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_MIN_ERROR = "lengthCheckInputMinError";
	/** ピース縦(mm) 数値のみ */
	public static final String LENGTH_CHECK_NUMERIC_ONLY_ERROR = "lengthCheckNumericOnlyError";
	/** 縦(mm)は最小0以上を入力して下さい。 */
	public static final String LENGTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "lengthInputRequestMinIsZeroError";
	/** この商品は期限日管理対象外です。期限日は入力しないで下さい。 */
	public static final String LIMIT_DATE_CANNOT_INPUT_EXCEPT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDateCannotInputExceptLimitDateManagementProductError";
	/** 期限日逆転管理フラグが存在しません。 */
	public static final String LIMIT_DATE_CLASS_NOT_FOUND_ERROR = "limitDateClassNotFoundError";
	/** 期限日を入力して下さい。 */
	public static final String LIMIT_DATE_NOT_INPUT_ERROR = "limitDateNotInputError";
	/** この商品は期限日管理対象です。期限日を入力して下さい。 */
	public static final String LIMIT_DATE_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDateNotInputLimitDateManagementProductError";
	/** 期限日逆転管理フラグが設定されているため、期限日数を入力して下さい。 */
	public static final String LIMIT_DAYS_NOT_INPUT_LIMIT_DATE_MANAGEMENT_PRODUCT_ERROR = "limitDaysNotInputLimitDateManagementProductError";
	/** 期限日が日付不正（形式：YYYYMMDD） */
	public static final String LIMIT_DT_DATE_ERROR = "limitDtDateError";
	/** 期限日管理フラグが存在しません。 */
	public static final String LIMIT_DT_MANAG_FLG_NOT_FOUND_ERROR = "limitDtManagFlgNotFoundError";
	/** 期限日管理フラグを入力して下さい。 */
	public static final String LIMIT_DT_MANAG_FLG_NOT_INPUT_ERROR = "limitDtManagFlgNotInputError";
	/** 期限日管理フラグに[管理しない]を設定した場合、期限日逆転防止フラグも[管理しない]を設定して下さい。 */
	public static final String LIMIT_DT_REVERSE_FLG_CHECK_NO_MANAG_ERROR = "limitDtReverseFlgCheckNoManagError";
	/** 期限日逆転防止フラグが存在しません。 */
	public static final String LIMIT_DT_REVERSE_FLG_NOT_FOUND_ERROR = "limitDtReverseFlgNotFoundError";
	/** 期限日逆転防止フラグを入力して下さい。 */
	public static final String LIMIT_DT_REVERSE_FLG_NOT_INPUT_ERROR = "limitDtReverseFlgNotInputError";
	/** 行番号を入力して下さい。 */
	public static final String LINE_NUMBER_NOT_INPUT_ERROR = "lineNumberNotInputError";
	/** バックロケは登録できません。 */
	public static final String LOCATION_CANNOT_REGISTER_BACK_LOCATION_ERROR = "locationCannotRegisterBackLocationError";
	/** 指定ロケーションCD 英数字のみ */
	public static final String LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "locationCdCheckAlphabetAndNumericOnlyError";
	/** 指定ロケーションCDは最大10文字以下を入力して下さい。 */
	public static final String LOCATION_CD_CHECK_INPUT_MAX_ERROR = "locationCdCheckInputMaxError";
	/** 指定ロケーションCDはロケーションマスタに存在しません。 */
	public static final String LOCATION_CD_NOT_FOUND_ERROR = "locationCdNotFoundError";
	/** ロケーションCDを入力して下さい。 */
	public static final String LOCATION_CD_NOT_INPUT_ERROR = "locationCdNotInputError";
	/** ロケーション区分が存在しません。 */
	public static final String LOCATION_CLASS_NOT_FOUND_ERROR = "locationClassNotFoundError";
	/** ロケーションCDが重複しています。 */
	public static final String LOCATION_CODE_DUPLICATE_ERROR = "locationCodeDuplicateError";
	/** 該当ロケーションが該当倉庫マスタに存在しません。 */
	public static final String LOCATION_DATA_IN_WAREHOUSE_NOT_FOUND_ERROR = "locationDataInWarehouseNotFoundError";
	/** ロケーションマスタ取込（ワーク取込） */
	public static final String LOCATION_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "locationInputProgramNameInputWorkInformation";
	/** ロケーションマスタ取込（データ移行） */
	public static final String LOCATION_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "locationInputProgramNameRegisterInformation";
	/** ロケーションマスタ一括登録 */
	public static final String LOCATION_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "locationMasterBulkInputProgramNameInformation";
	/** ロケーション名称が重複しています。 */
	public static final String LOCATION_NAME_DUPLICATE_ERROR = "locationNameDuplicateError";
	/** ロケーション名称は最大15文字以下を入力して下さい。 */
	public static final String LOCATION_NM_CHECK_INPUT_MAX_ERROR = "locationNmCheckInputMaxError";
	/** ロケーション名称を入力して下さい。 */
	public static final String LOCATION_NM_NOT_INPUT_ERROR = "locationNmNotInputError";
	/** ロケーションマスタに存在しません。 */
	public static final String LOCATION_NOT_FOUND_ERROR = "locationNotFoundError";
	/** ロケーションを入力して下さい。 */
	public static final String LOCATION_NOT_INPUT_ERROR = "locationNotInputError";
	/** ロケーション種別が存在しません。 */
	public static final String LOCATION_TYPE_NOT_FOUND_ERROR = "locationTypeNotFoundError";
	/** ロケーション種別を入力して下さい。 */
	public static final String LOCATION_TYPE_NOT_INPUT_ERROR = "locationTypeNotInputError";
	/** この商品はロット管理対象外です。ロットは入力しないで下さい。 */
	public static final String LOT_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "lotCannotInputExceptLotManagementProductError";
	/** 指定ロット 半角文字のみ */
	public static final String LOT_CHECK_HALF_WIDTH_ONLY_ERROR = "lotCheckHalfWidthOnlyError";
	/** 指定ロットは最大10文字以下を入力して下さい。 */
	public static final String LOT_CHECK_INPUT_MAX_ERROR = "lotCheckInputMaxError";
	/** ロット管理フラグが存在しません。 */
	public static final String LOT_MANAG_FLG_NOT_FOUND_ERROR = "lotManagFlgNotFoundError";
	/** ロット管理フラグを入力して下さい。 */
	public static final String LOT_MANAG_FLG_NOT_INPUT_ERROR = "lotManagFlgNotInputError";
	/** ロットマスタに存在しません。 */
	public static final String LOT_NOT_FOUND_IN_LOT_MASTER_ERROR = "lotNotFoundInLotMasterError";
	/** ロットを入力して下さい。 */
	public static final String LOT_NOT_INPUT_ERROR = "lotNotInputError";
	/** この商品はロット管理対象です。ロットを入力して下さい。 */
	public static final String LOT_NOT_INPUT_LOT_MANAGEMENT_PRODUCT_ERROR = "lotNotInputLotManagementProductError";
	/** ロット管理フラグに[管理しない]を設定した場合、ロット逆転防止フラグも[管理しない]を設定して下さい。 */
	public static final String LOT_REVERSE_FLG_CHECK_NO_MANAG_ERROR = "lotReverseFlgCheckNoManagError";
	/** ロット逆転防止フラグが存在しません。 */
	public static final String LOT_REVERSE_FLG_NOT_FOUND_ERROR = "lotReverseFlgNotFoundError";
	/** ロット逆転防止フラグを入力して下さい。 */
	public static final String LOT_REVERSE_FLG_NOT_INPUT_ERROR = "lotReverseFlgNotInputError";
	/** マッチング種別、キーワードが重複しています。 */
	public static final String MATCHING_DUPLICATE_ERROR = "matchingDuplicateError";
	/** マッチングマスタに存在しません。 */
	public static final String MATCHING_NOT_FOUND_ERROR = "matchingNotFoundError";
	/** 最大格納数に小数は入力できません。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_DECIMAL_ERROR = "maxStoreNumCheckInputDecimalError";
	/** 最大格納数は整数7桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_INTEGER_ERROR = "maxStoreNumCheckInputIntegerError";
	/** 最大格納数　数値のみ */
	public static final String MAX_STORE_NUM_CHECK_NUMERIC_ONLY_ERROR = "maxStoreNumCheckNumericOnlyError";
	/** 最大格納数は最小0以上を入力して下さい。 */
	public static final String MAX_STORE_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "maxStoreNumInputRequestMinIsZeroError";
	/** 最大格納数商品荷姿CD　英数字と記号のみ */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "maxStoreProductShapeCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 最大格納数商品荷姿CDは荷姿マスタに存在しません。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR = "maxStoreProductShapeCdNotFoundError";
	/** 最大格納数商品荷姿CDを入力して下さい。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR = "maxStoreProductShapeCdNotInputError";
	/** マージしないを選択。 */
	public static final String MERGE_CLS_CANNOT_SELECT_EXCEPTION_CASE_ERROR = "mergeClsCannotSelectExceptionCaseError";
	/** 入庫No.マージ区分が存在しません。 */
	public static final String MERGE_CLS_NOT_FOUND_ERROR = "mergeClsNotFoundError";
	/** 入庫No.マージ区分を入力して下さい。 */
	public static final String MERGE_CLS_NOT_INPUT_ERROR = "mergeClsNotInputError";
	/** 最小1以上 */
	public static final String MIN_IS_ONE_ERROR = "minIsOneError";
	/** 未作業または作業中以外に対して、処理はできません。 */
	public static final String MOVE_INST_STATUS_CANNOT_EXECUTE_EXCEPT_WORKING_NONWORK_ERROR = "moveInstStatusCannotExecuteExceptWorkingNonworkError";
	/** 移動数が引当可能数を超えています。 */
	public static final String MOVE_QTY_CANNOT_INPUT_MORE_THANSTOCK_CAN_BE_ALLOCATE_ERROR = "moveQtyCannotInputMoreThanstockCanBeAllocateError";
	/** 移動数を入力して下さい。 */
	public static final String MOVE_QTY_NOT_INPUT_ERROR = "moveQtyNotInputError";
	/** 必須項目を入力して下さい。 */
	public static final String NECESSARY_ITEM_NOT_INPUT_ERROR = "necessaryItemNotInputError";
	/** ピース商品重量(g) は最大9999999以下を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_MAX_ERROR = "netWeightCheckInputMaxError";
	/** ピース商品重量(g) は最小0以上を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_MIN_ERROR = "netWeightCheckInputMinError";
	/** ピース商品重量(g) 数値のみ */
	public static final String NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "netWeightCheckNumericOnlyError";
	/** 商品重量(g)は最小0以上を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "netWeightInputRequestMinIsZeroError";
	/** 新規の削除データは登録されません。 */
	public static final String NEW_DELETE_DATA_CANNOT_REGISTER_ERROR = "newDeleteDataCannotRegisterError";
	/** ノード行です。 */
	public static final String NODE_LINE_CANNOT_SELECT_ERROR = "nodeLineCannotSelectError";
	/** 変更されたデータがありません。 */
	public static final String NOT_FOUND_CHANGED_DATA_ERROR = "notFoundChangedDataError";
	/** マスタに存在しません。 */
	public static final String NOT_FOUND_IN_MASTER_ERROR = "notFoundInMasterError";
	/** 商品ロケーションマスタに存在しません。 */
	public static final String NOT_FOUND_IN_PRODUCT_LOCATION_MASTER_ERROR = "notFoundInProductLocationMasterError";
	/** 補充棚マスタに存在しません。 */
	public static final String NOT_FOUND_IN_REPLENISHMENT_MASTER_ERROR = "notFoundInReplenishmentMasterError";
	/** 担当者マスタに存在しません。 */
	public static final String NOT_FOUND_IN_USER_CODE_ERROR = "notFoundInUserCodeError";
	/** 未検品のデータが含まれています。 */
	public static final String NOT_INSPECTED_FOUND_ERROR = "notInspectedFoundError";
	/** 名寄せ不可フラグが存在しません。 */
	public static final String NOT_MERGE_FLAG_NOT_FOUND_ERROR = "notMergeFlagNotFoundError";
	/** 未完了のデータを選択して下さい。 */
	public static final String NOT_SELECT_DATA_NOT_COMPLETED_ERROR = "notSelectDataNotCompletedError";
	/** 分納／打切り指示がされていません。 */
	public static final String NOT_SELECT_INSTALLMENT_OR_CLOSED_RECEIVE_ERROR = "notSelectInstallmentOrClosedReceiveError";
	/** 未入荷の行を選択して下さい。 */
	public static final String NOT_SELECT_NOT_COMPLETING_RECEIVE_ERROR = "notSelectNotCompletingReceiveError";
	/** 未出荷の場合はピッキングリスト発行画面へ遷移できません。 */
	public static final String NOT_SHIPPING_DATA_CANNOT_TRANSITION_ERROR = "notShippingDataCannotTransitionError";
	/** 入力した数値が不正です。 */
	public static final String NUMERIC_VALUE_INPUT_ERROR = "numericValueInputError";
	/** 1以上の数値を入力して下さい。 */
	public static final String NUMERIC_VALUE_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "numericValueInputRequestMoreThanOneError";
	/** ワンタイムフラグが存在しません。 */
	public static final String ONETIME_FLG_NOT_FOUND_ERROR = "onetimeFlgNotFoundError";
	/** ワンタイムフラグを入力して下さい。 */
	public static final String ONETIME_FLG_NOT_INPUT_ERROR = "onetimeFlgNotInputError";
	/** 同じ入庫No.で、異なるロケーション、期限日、ロットが入力できません。 */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_SAME_CONDITION_ERROR = "onsLabelNumberCannotInputSameConditionError";
	/** 入力された入庫ラベルNo.は商品入数が異なるため使用できません。（入庫ラベルNo：[0] , 商品CD：[1]） */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_UNIT_NUM_CHANGED_ERROR = "onsLabelNumberCannotInputUnitNumChangedError";
	/** 入力された入庫ラベルNo.([0])は異なる商品、在庫区分、預託、ロット、期限日、仕入先で登録されているため使用できません。[/]入庫ラベルNo.を入力しないで登録するか、新しい入庫ラベルNo.を入力してください。入力しないで登録した場合は新しい入庫ラベルNo.で登録されます。 */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_ERROR = "onsLabelNumberCannotInputUsedOtherStockError";
	/** 入力された入庫ラベルNo.([0])は異なる商品、在庫区分、預託、ロット、期限日、仕入先、入庫日で登録されているため使用できません。[/]入庫ラベルNo.を入力しないで登録するか、新しい入庫ラベルNo.を入力してください。入力しないで登録した場合は新しい入庫ラベルNo.で登録されます。 */
	public static final String ONS_LABEL_NUMBER_CANNOT_INPUT_USED_OTHER_STOCK_IS_MANAGE_STORE_DT_ERROR = "onsLabelNumberCannotInputUsedOtherStockIsManageStoreDtError";
	/** 入庫ラベルNo.が重複しています。 */
	public static final String ONS_LABEL_NUMBER_DUPLICATE_ERROR = "onsLabelNumberDuplicateError";
	/** 同じ入庫ラベルNo.の在庫が異なるロケーションに存在します。 */
	public static final String ONS_LABEL_NUMBER_DUPLICATE_OTHER_LOCATION_ERROR = "onsLabelNumberDuplicateOtherLocationError";
	/** 入庫ラベルNoが存在しません。 */
	public static final String ONS_LABEL_NUMBER_NOT_FOUND_ERROR = "onsLabelNumberNotFoundError";
	/** 入庫ラベルNoに対する在庫情報は見つかりませんでした。新規登録の場合は入庫ラベルNoを消して下さい。 */
	public static final String ONS_LABEL_NUMBER_NOT_FOUND_IN_STOCK_INFORMATION_ERROR = "onsLabelNumberNotFoundInStockInformationError";
	/** 入庫ラベルNoを入力して下さい。 */
	public static final String ONS_LABEL_NUMBER_NOT_INPUT_ERROR = "onsLabelNumberNotInputError";
	/** 入庫Noを再採番しました。入庫ラベルを印刷して下さい。 */
	public static final String ONS_NUM_RENUMBER_INFORMATION = "onsNumRenumberInformation";
	/** システム稼動時間外です！操作には十分注意して下さい。 */
	public static final String OPERATION_CAUTIONS_SYSTEM_ENDED_INFORMATION = "operationCautionsSystemEndedInformation";
	/** 出力枚数　数値のみ */
	public static final String OUTPUT_CNT_CHECK_NUMERIC_ONLY_ERROR = "outputCntCheckNumericOnlyError";
	/** 出力枚数を入力して下さい。 */
	public static final String OUTPUT_CNT_NOT_INPUT_ERROR = "outputCntNotInputError";
	/** 社内移動として既に登録されている社内入荷センタと社内入荷倉庫です。 */
	public static final String OWNED_CENTER_AND_WAREHOUSE_FOUND_ERROR = "ownedCenterAndWarehouseFoundError";
	/** 取引先区分(社内)が存在しません。 */
	public static final String OWNED_CENTER_FLAG_NOT_FOUND_ERROR = "ownedCenterFlagNotFoundError";
	/** 社内入荷センタがセンタマスタに存在しません。 */
	public static final String OWNED_CENTER_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "ownedCenterNotFoundInPartnerMasterError";
	/** 社内入荷センタを入力して下さい。 */
	public static final String OWNED_CENTER_NOT_INPUT_ERROR = "ownedCenterNotInputError";
	/** 社内移動の出荷先です。取引先マスタの取引区分を社内、社内入荷センタ、社内入荷倉庫を登録して下さい。 */
	public static final String OWNED_SHIP_TO_INPUT_ERROR = "ownedShipToInputError";
	/** 社内入荷倉庫が倉庫マスタに存在しません。 */
	public static final String OWNED_WAREHOUSE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "ownedWarehouseNotFoundInWarehouseMasterError";
	/** 社内入荷倉庫を入力して下さい。 */
	public static final String OWNED_WAREHOUSE_NOT_INPUT_ERROR = "ownedWarehouseNotInputError";
	/** 梱包荷材が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR = "packingCalculateCannotExecuteNotFoundBoxGroupError";
	/** 詰込区分が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PROCESS_CLS_ERROR = "packingCalculateCannotExecuteNotFoundProcessClsError";
	/** 商品毎別梱包が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PRODUCT_PART_PACKING_CLS_ERROR = "packingCalculateCannotExecuteNotFoundProductPartPackingClsError";
	/** 標準荷材の容積または重量が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_STANDARD_BOX_INFO_ERROR = "packingCalculateCannotExecuteNotFoundStandardBoxInfoError";
	/** 総容積または総重量が大きすぎるため梱包データを登録できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_MAX_NUMBER_ERROR = "packingCalculateCannotExecuteMaxNumberError";
	/** 梱包明細修正が正常終了しました。積込リスト及び送り状データを確認して、必要であれば再発行、再出力をして下さい。 */
	public static final String PACKING_COMPLETE_PACKAGE_CHANGED_INFORMATION = "packingCompletePackageChangedInformation";
	/** 箱種のみを変更する場合は投入数を変更できません。 */
	public static final String PACKING_QTY_CANNOT_CHANGE_SAME_BOX_TYPE_ERROR = "packingQtyCannotChangeSameBoxTypeError";
	/** 入替可能な投入数を超えています。 */
	public static final String PACKING_QTY_CANNOT_INPUT_MORE_THAN_ALOWED_QTY_ERROR = "packingQtyCannotInputMoreThanAlowedQtyError";
	/** 梱包明細の修正をクリアしました。 */
	public static final String PACKING_UPDATE_CLEAR_COMPLETED_INFORMATION = "packingUpdateClearCompletedInformation";
	/** 梱包明細を修正中です。クリアして宜しいですか？ */
	public static final String PACKING_UPDATE_CLEAR_CONFIRMATION = "packingUpdateClearConfirmation";
	/** 検品済以外の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String PACKING_UPDATE_START_ERROR = "packingUpdateStartError";
	/** パラメータマスタに存在しません。 */
	public static final String PARAM_NOT_FOUND_ERROR = "paramNotFoundError";
	/** 親商品が別の親商品の構成品に使用済みです。 */
	public static final String PARENT_PRODUCT_CANNOT_INPUT_ANOTHER_STRUCTURE_PRODUCT_ERROR = "parentProductCannotInputAnotherStructureProductError";
	/** 親商品CDが登録済みです。 */
	public static final String PARENT_PRODUCT_CODE_DUPLICATE_ERROR = "parentProductCodeDuplicateError";
	/** 親商品CDがセット品親マスタに存在しません。 */
	public static final String PARENT_PRODUCT_CODE_NOT_FOUND_ERROR = "parentProductCodeNotFoundError";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、解除しますか？ */
	public static final String PICKING_INST_CANCEL_EXISTED_WORKING_STATE_CONFIRMATION = "pickingInstCancelExistedWorkingStateConfirmation";
	/** 出庫指示済またはピッキング中／済または検品中／済以外の出荷指示に対して、出庫指示を解除することはできません。 */
	public static final String PICKING_INST_CANCEL_START_ERROR = "pickingInstCancelStartError";
	/** 未出荷以外の出荷指示に対して、出庫指示はできません。 */
	public static final String PICKING_INST_START_ERROR = "pickingInstStartError";
	/** 出庫作業No.単位にピッキングリストが発行されますが宜しいですか？ */
	public static final String PICKING_LIST_PRINT_MULTIPLE_WAREHOUSE_CONFIRMATION = "pickingListPrintMultipleWarehouseConfirmation";
	/** ピックロケフラグが存在しません。 */
	public static final String PICKING_LOCATION_FLG_NOT_FOUND_ERROR = "pickingLocationFlgNotFoundError";
	/** ピックロケフラグを入力して下さい。 */
	public static final String PICKING_LOCATION_FLG_NOT_INPUT_ERROR = "pickingLocationFlgNotInputError";
	/** ピッキング順序　数値のみ */
	public static final String PICKING_ORDER_CHECK_NUMERIC_ONLY_ERROR = "pickingOrderCheckNumericOnlyError";
	/** ピッキング順序は最小0以上を入力して下さい。 */
	public static final String PICKING_ORDER_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "pickingOrderInputRequestMinIsZeroError";
	/** ピッキング順序を入力して下さい。 */
	public static final String PICKING_ORDER_NOT_INPUT_ERROR = "pickingOrderNotInputError";
	/** 補充商品CDの入力ある場合はピックロケを入力して下さい。 */
	public static final String PICKING_PICKING_LOCATION_FLG_NOT_INPUT_ERROR = "pickingPickingLocationFlgNotInputError";
	/** 出庫作業メッセージは最大100文字以下を入力して下さい。 */
	public static final String PICKING_WORK_MESSAGE_CHECK_INPUT_MAX_ERROR = "pickingWorkMessageCheckInputMaxError";
	/** ピース荷姿が設定されていません。 */
	public static final String PIECE_SHAPE_NOT_FOUND_ERROR = "pieceShapeNotFoundError";
	/** 出荷検品中または出荷検品中断または出荷検品済以外の出荷指示に対して、出荷検品解除できません。 */
	public static final String PIECE_SHIPPING_INSPECT_CACEL_START_ERROR = "pieceShippingInspectCacelStartError";
	/** 出庫作業No.単位で出荷検品を解除しますが宜しいですか？ */
	public static final String PIECE_SHIPPING_INSPECT_CANCEL_CONFIRMATION = "pieceShippingInspectCancelConfirmation";
	/** 出荷検品中ですが、解除してよろしいですか？ */
	public static final String PIECE_SHIPPING_INSPECT_CANCEL_EXISTED_INSPECT_STATE_CONFIRMATION = "pieceShippingInspectCancelExistedInspectStateConfirmation";
	/** 予定顧客発注No. 英数字と-のみ */
	public static final String PLAN_CLIENT_ORDER_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planClientOrderNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 予定顧客発注No.は最大30文字以下を入力して下さい。 */
	public static final String PLAN_CLIENT_ORDER_NO_CHECK_INPUT_MAX_ERROR = "planClientOrderNoCheckInputMaxError";
	/** 予定顧客入荷指示No. 英数字と-のみ */
	public static final String PLAN_CLIENT_RECEIVE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planClientReceiveCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 予定顧客入荷指示No.は最大20文字以下を入力して下さい。 */
	public static final String PLAN_CLIENT_RECEIVE_CHECK_INPUT_MAX_ERROR = "planClientReceiveCheckInputMaxError";
	/** 同一の予定顧客入荷指示No.の伝票が既に登録済です。 */
	public static final String PLAN_CLIENT_RECEIVE_NO_CANNOT_REGISTER_ALREADY_USED_ERROR = "planClientReceiveNoCannotRegisterAlreadyUsedError";
	/** 同一の予定顧客入荷指示No.の伝票が他の行で入力されています。 */
	public static final String PLAN_CLIENT_RECEIVE_NO_DUPLICATE_ERROR = "planClientReceiveNoDuplicateError";
	/** 予定顧客入荷指示No.を入力して下さい。 */
	public static final String PLAN_CLIENT_RECEIVE_NOT_INPUT_ERROR = "planClientReceiveNotInputError";
	/** 預託は最大30文字以下を入力して下さい。 */
	public static final String PLAN_DEPOSIT_CD_CHECK_INPUT_MAX_ERROR = "planDepositCdCheckInputMaxError";
	/** 預託CDを入力して下さい。 */
	public static final String PLAN_DEPOSIT_CD_NOT_INPUT_ERROR = "planDepositCdNotInputError";
	/** 予定期限日が日付不正(形式:yyyy/MM/dd) */
	public static final String PLAN_LIMIT_DT_DATE_ERROR = "planLimitDtDateError";
	/** 予定ロケーションCD 英数字のみ */
	public static final String PLAN_LOCATION_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "planLocationCdCheckAlphabetAndNumericOnlyError";
	/** 予定ロケーションCDは最大30文字以下を入力して下さい。 */
	public static final String PLAN_LOCATION_CD_CHECK_INPUT_MAX_ERROR = "planLocationCdCheckInputMaxError";
	/** 予定ロット 半角文字のみ */
	public static final String PLAN_LOT_CHECK_HALF_WIDTH_ONLY_ERROR = "planLotCheckHalfWidthOnlyError";
	/** 予定ロットは最大10文字以下を入力して下さい。 */
	public static final String PLAN_LOT_CHECK_INPUT_MAX_ERROR = "planLotCheckInputMaxError";
	/** 予定数に小数は入力できません。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_ERROR = "planNumCheckInputDecimalError";
	/** 予定数は9999999以下を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_MAX_ERROR = "planNumCheckInputMaxError";
	/** 予定数は1以上を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_MIN_ERROR = "planNumCheckInputMinError";
	/** 予定数 数値のみ */
	public static final String PLAN_NUM_CHECK_NUMERIC_ONLY_ERROR = "planNumCheckNumericOnlyError";
	/** 予定数を入力して下さい。 */
	public static final String PLAN_NUM_NOT_INPUT_ERROR = "planNumNotInputError";
	/** 予定入庫ラベルNo.が重複しています。 */
	public static final String PLAN_STORE_LABEL_NO_DUPLICATE_ERROR = "planStoreLabelNoDuplicateError";
	/** 仕入先CD 英数字と-のみ */
	public static final String PLAN_SUPPLIER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "planSupplierCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 仕入先CDは最大10文字以下を入力して下さい。 */
	public static final String PLAN_SUPPLIER_CD_CHECK_INPUT_MAX_ERROR = "planSupplierCdCheckInputMaxError";
	/** 仕入先CDを入力して下さい。 */
	public static final String PLAN_SUPPLIER_CD_NOT_INPUT_ERROR = "planSupplierCdNotInputError";
	/** 予定倉庫CDは倉庫マスタに存在しません。 */
	public static final String PLAN_WAREHOUSE_CD_NOT_FOUND_ERROR = "planWarehouseCdNotFoundError";
	/** 郵便番号が郵便番号マスタに存在しません。 */
	public static final String POST_CODE_NOT_FOUND_POST_CODE_MASTER_ERROR = "postCodeNotFoundPostCodeMasterError";
	/** 処理は正常終了しましたが、エラーデータが含まれています。 */
	public static final String PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION = "processCompleteErrorIncludedInformation";
	/** 処理区分は最大30文字以下を入力して下さい。 */
	public static final String PROCESS_TYPE_CD_CHECK_INPUT_MAX_ERROR = "processTypeCdCheckInputMaxError";
	/** 処理区分が存在しません。 */
	public static final String PROCESS_TYPE_CD_NOT_FOUND_ERROR = "processTypeCdNotFoundError";
	/** 処理区分CDを入力して下さい。 */
	public static final String PROCESS_TYPE_CD_NOT_INPUT_ERROR = "processTypeCdNotInputError";
	/** 処理区分が24:調整(+)を指定してください。 */
	public static final String PROCESS_TYPE_CHECK_STOCK_ADJUSTMENT_PLUS_ERROR = "processTypeCheckStockAdjustmentPlusError";
	/** 処理区分CDが重複しています。 */
	public static final String PROCESS_TYPE_CODE_DUPLICATE_ERROR = "processTypeCodeDuplicateError";
	/** 処理区分マスタに存在しません。 */
	public static final String PROCESS_TYPE_NOT_FOUND_ERROR = "processTypeNotFoundError";
	/** 同一の顧客入荷指示No、仕入先内で処理区分が不一致です。 */
	public static final String PROCESS_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "processTypeUnmatchInClientReceiveNoOnBulkError";
	/** 商品略称は最大35文字以下を入力して下さい。 */
	public static final String PRODUCT_ABBR_CHECK_INPUT_MAX_ERROR = "productAbbrCheckInputMaxError";
	/** 商品略称を入力して下さい。 */
	public static final String PRODUCT_ABBR_NOT_INPUT_ERROR = "productAbbrNotInputError";
	/** 商品CD、荷姿CDが重複しています。 */
	public static final String PRODUCT_AND_SHAPE_CODE_DUPLICATE_ERROR = "productAndShapeCodeDuplicateError";
	/** 商品CD  英数字と記号のみ */
	public static final String PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "productCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 商品CDは最大30文字以下を入力して下さい。 */
	public static final String PRODUCT_CD_CHECK_INPUT_MAX_ERROR = "productCdCheckInputMaxError";
	/** 商品CDは商品マスタに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_ERROR = "productCdNotFoundError";
	/** 商品CDを入力して下さい。 */
	public static final String PRODUCT_CD_NOT_INPUT_ERROR = "productCdNotInputError";
	/** 商品CDが重複しています。 */
	public static final String PRODUCT_CODE_DUPLICATE_ERROR = "productCodeDuplicateError";
	/** 複数のロケーションに割り付いているため登録出来ません。 */
	public static final String PRODUCT_CODE_DUPLICATE_REPLENISHMENT_LOCATION_ERROR = "productCodeDuplicateReplenishmentLocationError";
	/** 商品マスタに存在しない商品が含まれています。 */
	public static final String PRODUCT_CODE_FOUND_DELETED_ERROR = "productCodeFoundDeletedError";
	/** 商品マスタに存在しない商品が含まれています。（商品CD：[0]） */
	public static final String PRODUCT_CODE_FOUND_DELETED_WITH_CD_ERROR = "productCodeFoundDeletedWithCdError";
	/** 商品CDが商品マスタに存在しません。 */
	public static final String PRODUCT_CODE_NOT_FOUND_ERROR = "productCodeNotFoundError";
	/** 商品マスタ取込（ワーク取込） */
	public static final String PRODUCT_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "productInputProgramNameInputWorkInformation";
	/** 商品マスタ取込（データ移行） */
	public static final String PRODUCT_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "productInputProgramNameRegisterInformation";
	/** 入荷済以外の入荷予定は商品ラベル発行できません。 */
	public static final String PRODUCT_LABEL_CANNOT_OUTPUT_NOT_RECEIVE_COMPLETED_ERROR = "productLabelCannotOutputNotReceiveCompletedError";
	/** 商品マスタ一括登録 */
	public static final String PRODUCT_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "productMasterBulkInputProgramNameInformation";
	/** 商品名称は最大50文字以下を入力して下さい。 */
	public static final String PRODUCT_NM_CHECK_INPUT_MAX_ERROR = "productNmCheckInputMaxError";
	/** 商品名称を入力して下さい。 */
	public static final String PRODUCT_NM_NOT_INPUT_ERROR = "productNmNotInputError";
	/** 商品マスタに存在しません。 */
	public static final String PRODUCT_NOT_FOUND_ERROR = "productNotFoundError";
	/** 商品荷姿マスタ取込（ワーク取込） */
	public static final String PRODUCT_SHAPE_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "productShapeInputProgramNameInputWorkInformation";
	/** 商品荷姿マスタ取込（データ移行） */
	public static final String PRODUCT_SHAPE_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "productShapeInputProgramNameRegisterInformation";
	/** 商品荷姿マスタ一括登録 */
	public static final String PRODUCT_SHAPE_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "productShapeMasterBulkInputProgramNameInformation";
	/** 商品荷姿マスタに存在しません。 */
	public static final String PRODUCT_SHAPE_NOT_FOUND_ERROR = "productShapeNotFoundError";
	/** 数量を入力して下さい。 */
	public static final String QTY_NOT_INPUT_ERROR = "qtyNotInputError";
	/** 入荷済を選択して下さい。 */
	public static final String RECEIVE_COMPLETED_NOT_SELECT_ERROR = "receiveCompletedNotSelectError";
	/** 入荷納品ステータスを選択して下さい。 */
	public static final String RECEIVE_DELIVERY_STATUS_NOT_SELECT_ERROR = "receiveDeliveryStatusNotSelectError";
	/** 入荷する明細行を選択して下さい。 */
	public static final String RECEIVEＤETAIL_LINE_NOT_SELECT_ERROR = "receiveＤetailLineNotSelectError";
	/** 未入荷またはエラー以外の入荷予定はエラーチェックできません。 */
	public static final String RECEIVE_ERROR_CHECK_START_ERROR = "receiveErrorCheckStartError";
	/** 入荷入力済です。 */
	public static final String RECEIVE_INPUT_FOUND_COMPLETED_INFORMATION = "receiveInputFoundCompletedInformation";
	/** この商品は期限日管理対象外です。予定期限日は入力しないで下さい。 */
	public static final String RECEIVE_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR = "receiveLimitDtManagFlgCannotInputExceptLimitDtManagementProductError";
	/** 入荷期限日数に小数は入力できません。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "receiveLimitNumCheckInputDecimalError";
	/** 入荷期限日数は最大99999以下を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "receiveLimitNumCheckInputMaxError";
	/** 入荷期限日数 数値のみ */
	public static final String RECEIVE_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "receiveLimitNumCheckNumericOnlyError";
	/** 入荷期限日数は最小1以上を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR = "receiveLimitNumInputRequestMinIsOneError";
	/** 入荷期限日数は最小0以上を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "receiveLimitNumInputRequestMinIsZeroError";
	/** 入荷期限日数を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_NOT_INPUT_ERROR = "receiveLimitNumNotInputError";
	/** この商品はロット管理対象外です。予定ロットは入力しないで下さい。 */
	public static final String RECEIVE_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "receiveLotManagFlgCannotInputExceptLotManagementProductError";
	/** 入荷番号を入力して下さい。 */
	public static final String RECEIVE_NUMBER_NOT_INPUT_ERROR = "receiveNumberNotInputError";
	/** 入荷検品ステータスが未完以外は分納／打切りすることはできません。 */
	public static final String RECEIVE_PART_INSERT_START_ERROR = "receivePartInsertStartError";
	/** 入荷予定一括登録 */
	public static final String RECEIVE_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION = "receivePlanBulkInputProgramNameInformation";
	/** センタ間移動の入荷予定は変更できません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_CNETER_TRANSIT_ERROR = "receivePlanCannotChangeCneterTransitError";
	/** 未入荷、エラー以外の商品が含まれているため、入荷予定の削除は出来ません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_EXCEPT_NOT_OR_ERROR_ERROR = "receivePlanCannotChangeExceptNotOrErrorError";
	/** 入荷中／入荷済の商品が含まれているため、入荷予定の変更は出来ません。 */
	public static final String RECEIVE_PLAN_CANNOT_CHANGE_RECEIVING_OR_COMPLETED_ERROR = "receivePlanCannotChangeReceivingOrCompletedError";
	/** センタ間移動の入荷予定は削除できません。 */
	public static final String RECEIVE_PLAN_CANNOT_DELETE_CNETER_TRANSIT_ERROR = "receivePlanCannotDeleteCneterTransitError";
	/** 同一の予定顧客入荷指示Ｎo.内で処理区分が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_PROCESS_TYPE_UNMATCH_ERROR = "receivePlanCannotRegisterProcessTypeUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で入荷予定日が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_RECEIVE_PLAN_DT_UNMATCH_ERROR = "receivePlanCannotRegisterReceivePlanDtUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で在庫区分が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_STOCK_TYPE_UNMATCH_ERROR = "receivePlanCannotRegisterStockTypeUnmatchError";
	/** 同一の予定顧客入荷指示Ｎo.内で仕入先が異なっている為、登録できません。 */
	public static final String RECEIVE_PLAN_CANNOT_REGISTER_SUPPLIER_UNMATCH_ERROR = "receivePlanCannotRegisterSupplierUnmatchError";
	/** 入荷入力対象外です。 */
	public static final String RECEIVE_PLAN_CANNOT_SELECT_RECEIVE_COMPLETED_ERROR = "receivePlanCannotSelectReceiveCompletedError";
	/** 未入荷またはエラー以外の入荷予定は修正できません。 */
	public static final String RECEIVE_PLAN_CHANGE_START_ERROR = "receivePlanChangeStartError";
	/** 入荷データが削除されました。 */
	public static final String RECEIVE_PLAN_DATA_DELETE_INFORMATION = "receivePlanDataDeleteInformation";
	/** 未入荷またはエラー以外の入荷予定は削除できません。 */
	public static final String RECEIVE_PLAN_DELETE_START_ERROR = "receivePlanDeleteStartError";
	/** 入荷予定日が日付不正(形式:yyyy/MM/dd) */
	public static final String RECEIVE_PLAN_DT_DATE_ERROR = "receivePlanDtDateError";
	/** 入荷予定日を入力して下さい。 */
	public static final String RECEIVE_PLAN_DT_NOT_INPUT_ERROR = "receivePlanDtNotInputError";
	/** 同一の顧客入荷指示No、仕入先内で入荷予定日が不一致です。 */
	public static final String RECEIVE_PLAN_DT_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "receivePlanDtUnmatchInClientReceiveNoOnBulkError";
	/** 商品情報がマスタに存在しませんが、登録して宜しいですか？ */
	public static final String RECEIVE_PLAN_REGISTERPRODUCT_CODE_NOT_FOUND_CONFIRMATION = "receivePlanRegisterproductCodeNotFoundConfirmation";
	/** 明細行が入力されていません。対象データを削除して宜しいですか？ */
	public static final String RECEIVE_PLAN_UPDATE_DETAIL_LINE_NOT_INPUT_CONFIRMATION = "receivePlanUpdateDetailLineNotInputConfirmation";
	/** 商品情報がマスタに存在しませんが、更新して宜しいですか？ */
	public static final String RECEIVE_PLAN_UPDATEPRODUCT_CODE_NOT_FOUND_CONFIRMATION = "receivePlanUpdateproductCodeNotFoundConfirmation";
	/** 入荷予定数を超えていますが、登録しますか？ */
	public static final String RECEIVE_QTY_REGISTER_MORE_THAN_PLAN_CONFIRMATION = "receiveQtyRegisterMoreThanPlanConfirmation";
	/** 入荷実績を取り消しますか？ */
	public static final String RECEIVE_RESULT_CANCEL_CONFIRMATION = "receiveResultCancelConfirmation";
	/** 他端末で検品中ですが、入荷取消を行ってもよろしいですか？ */
	public static final String RECEIVE_RESULT_CANCEL_DISREGARD_EXCLUSIVE_CONTROL_CONFIRMATION = "receiveResultCancelDisregardExclusiveControlConfirmation";
	/** エラーの入荷予定に対し、実績は登録できません。 */
	public static final String RECEIVE_RESULT_INSERT_START_ERROR = "receiveResultInsertStartError";
	/** 入荷予定数を０にすることはできません。 */
	public static final String RECIVE_PLAN_QTY_CANNOT_INPUT_EXCEPT_ZERO_ERROR = "recivePlanQtyCannotInputExceptZeroError";
	/** 入庫推奨ロケーションがロケーションマスタに存在しません。 */
	public static final String RECOMMENDED_LOCATION_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "recommendedLocationNotFoundInLocationMasterError";
	/** 推奨倉庫が倉庫マスタに存在しません。 */
	public static final String RECOMMENDED_WAREHOUSE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "recommendedWarehouseNotFoundInWarehouseMasterError";
	/** 梱包情報登録時にエラーが発生しました。 */
	public static final String REGISTERE_PACKING_INFORMATION_FAILED_INFORMATION = "registerePackingInformationFailedInformation";
	/** 補充預託CDは取引先マスタ存在しません。 */
	public static final String REPLENISH_DEPOSIT_CD_NOT_FOUND_ERROR = "replenishDepositCdNotFoundError";
	/** 補充預託CDを入力して下さい。 */
	public static final String REPLENISH_DEPOSIT_CD_NOT_INPUT_ERROR = "replenishDepositCdNotInputError";
	/** ピックロケ以外の場合、補充情報は設定しないで下さい。 */
	public static final String REPLENISH_INFO_INPUT_ERROR = "replenishInfoInputError";
	/** 補充指示数が0以下のデータは補充できません。 */
	public static final String REPLENISH_INST_CANNNOT_REGISTER_INST_NUM_ZERO_ERROR = "replenishInstCannnotRegisterInstNumZeroError";
	/** 画面で操作しているデータが古い為、最新情報を検索してください。 */
	public static final String REPLENISH_INST_CANNNOT_REGISTER_PAGE_DATA_IS_OLD_ERROR = "replenishInstCannnotRegisterPageDataIsOldError";
	/** 補充指示が正常に終了しました。<a href="#wms/stock/StockMoveList?mode=3&processTypeCd=32"><b><u>在庫移動一覧</b></u></a>にて確認して下さい。 */
	public static final String REPLENISH_INST_COMPLETE_INFORMATION = "replenishInstCompleteInformation";
	/** 補充指示を取消します。宜しいですか？ */
	public static final String REPLENISHMENT_CANCEL_CONFIRMATION = "replenishmentCancelConfirmation";
	/** 補充を完了します。宜しいですか？ */
	public static final String REPLENISHMENT_COMPLETE_CONFIRMATION = "replenishmentCompleteConfirmation";
	/** 補充MAXバラ数には補充MINバラ数より大きい値を設定して下さい。 */
	public static final String REPLENISHMENT_MAX_QTY_CANNOT_INPUT_LESS_THAN_MIN_QTY_ERROR = "replenishmentMaxQtyCannotInputLessThanMinQtyError";
	/** 補充MAXバラ数には補充単位以上の値を設定して下さい。 */
	public static final String REPLENISHMENT_MAX_QTY_CANNOT_INPUT_LESS_THAN_UNIT_QTY_ERROR = "replenishmentMaxQtyCannotInputLessThanUnitQtyError";
	/** 補充指示数は補充単位の倍数で入力して下さい。 */
	public static final String REPLENISHMENT_ORDER_QTY_CANNOT_INPUT_EXCEPT_MULTIPLE_UNIT_QTY_ERROR = "replenishmentOrderQtyCannotInputExceptMultipleUnitQtyError";
	/** 補充指示数は1以上で入力して下さい。 */
	public static final String REPLENISHMENT_ORDER_QTY_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "replenishmentOrderQtyInputRequestMoreThanOneError";
	/** 補充優先順位に「0」より大きい数値を入力して下さい。 */
	public static final String REPLENISHMENT_PRIORITY_INPUT_REQUEST_MORE_THAN_ZERO_ERROR = "replenishmentPriorityInputRequestMoreThanZeroError";
	/** 同一商品が既に存在しているため、登録できません。 */
	public static final String REPLENISHMENT_PRODUCT_CANNOT_REGISTER_EXISTED_ERROR = "replenishmentProductCannotRegisterExistedError";
	/** 補充元の在庫が存在しません。 */
	public static final String REPLENISHMENT_STOCK_NOT_FOUND_ERROR = "replenishmentStockNotFoundError";
	/** 補充先在庫数が補充数ＭＡＸを超えるため指示できません。 */
	public static final String REPLENISHMENT_UNIT_QTY_CANNOT_INPUT_MORE_THAN_MAX_QTY_ERROR = "replenishmentUnitQtyCannotInputMoreThanMaxQtyError";
	/** 補充点に小数は入力できません。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_ERROR = "replenishPNumCheckInputDecimalError";
	/** 補充点は整数7桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_INTEGER_ERROR = "replenishPNumCheckInputIntegerError";
	/** 補充点　数値のみ */
	public static final String REPLENISH_P_NUM_CHECK_NUMERIC_ONLY_ERROR = "replenishPNumCheckNumericOnlyError";
	/** 補充点荷姿CD　英数字と記号のみ */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "replenishPProductShapeCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 補充点荷姿CDは荷姿マスタに存在しません。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR = "replenishPProductShapeCdNotFoundError";
	/** 補充点荷姿CDを入力して下さい。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR = "replenishPProductShapeCdNotInputError";
	/** 補充商品CD　英数字と記号のみ */
	public static final String REPLENISH_PRODUCT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "replenishProductCdCheckAlphabetAndNumericAndSymbolOnlyError";
	/** 補充商品CDが商品マスタに存在しません。 */
	public static final String REPLENISH_PRODUCT_CD_NOT_FOUND_ERROR = "replenishProductCdNotFoundError";
	/** 補充商品CDを入力して下さい。 */
	public static final String REPLENISH_PRODUCT_CD_NOT_INPUT_ERROR = "replenishProductCdNotInputError";
	/** 補充在庫区分CDは在庫区分マスタに存在しません。 */
	public static final String REPLENISH_STOCK_TYPE_CD_NOT_FOUND_ERROR = "replenishStockTypeCdNotFoundError";
	/** 補充在庫区分CDを入力して下さい。 */
	public static final String REPLENISH_STOCK_TYPE_CD_NOT_INPUT_ERROR = "replenishStockTypeCdNotInputError";
	/** 発行対象を選択して下さい。 */
	public static final String REPORT_NOT_SELECT_ERROR = "reportNotSelectError";
	/** 帳票の発行に失敗しました。 */
	public static final String REPORT_PRINT_CANNOT_EXECUTE_ERROR = "reportPrintCannotExecuteError";
	/** セット品、補充、移動データ以外の指示書は出力できません。 */
	public static final String REPORT_PRINT_CANNOT_EXECUTE_EXCEPT_SET_REPLENISH_MOVE_DATA_ERROR = "reportPrintCannotExecuteExceptSetReplenishMoveDataError";
	/** 補充点は最小0以上を入力して下さい。 */
	public static final String RESTOCK_POINT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "restockPointInputRequestMinIsZeroError";
	/** 佐川送り状作成システムに接続できません。 */
	public static final String SAGAWA_API_SYSTEM_CANNOT_CONNECT_ERROR = "sagawaApiSystemCannotConnectError";
	/** 佐川送り状作成システムに接続できません。([0]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_CONNECT_RESPONSE_CODE_ERROR = "sagawaApiSystemCannotConnectResponseCodeError";
	/** 佐川送り状作成システムへのダウンロードURL要求でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_GET_DOWNLOAD_URL_ERROR = "sagawaApiSystemCannotExecuteGetDownloadUrlError";
	/** 佐川送り状作成システムへの荷札データ送信でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DATA_ERROR = "sagawaApiSystemCannotExecuteSendDataError";
	/** 佐川送り状作成システムへの荷物受渡書データ送信でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DELIVERY_DATA_ERROR = "sagawaApiSystemCannotExecuteSendDeliveryDataError";
	/** 佐川送り状作成システムへの再発行要求でエラーが発生しました。[/][0] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_RETRY_ERROR = "sagawaApiSystemCannotExecuteSendRetryError";
	/** シールが重複しています。 */
	public static final String SEAL_TYPE_DUPLICATE_ERROR = "sealTypeDuplicateError";
	/** 荷主センタの取得に失敗しました。 */
	public static final String SELECT_CLIENT_CENTER_FAILED = "selectClientCenterFailed";
	/** 取引先の取得に失敗しました。 */
	public static final String SELECT_CUSTOMER_FAILED = "selectCustomerFailed";
	/** 選択 */
	public static final String SELECT_INFORMATION = "selectInformation";
	/** 商品荷姿は最大30文字以下を入力して下さい。 */
	public static final String SHAPE_CD_CHECK_INPUT_MAX_ERROR = "shapeCdCheckInputMaxError";
	/** 商品荷姿を入力して下さい。 */
	public static final String SHAPE_CD_NOT_INPUT_ERROR = "shapeCdNotInputError";
	/** 入数の倍数以外は入力できません。 */
	public static final String SHAPE_CLASS_CANNOT_INPUT_EXCEPT_MULTIPLE_ERROR = "shapeClassCannotInputExceptMultipleError";
	/** 荷姿にケースは指定できません。 */
	public static final String SHAPE_CLASS_CANNOT_SELECT_EXCEPT_CASE_ERROR = "shapeClassCannotSelectExceptCaseError";
	/** 荷姿CDを入力して下さい。 */
	public static final String SHAPE_CLASS_NOT_INPUT_ERROR = "shapeClassNotInputError";
	/** パラメータマスタに登録されている荷姿CDは削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_PARAM_MASTER_ERROR = "shapeCodeCannotDeleteInParamMasterError";
	/** 商品荷姿マスタに登録されている荷姿CDは削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_PRODUCT_SHAPE_MASTER_ERROR = "shapeCodeCannotDeleteInProductShapeMasterError";
	/** 総重量(g)に小数は入力できません。 */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_INPUT_DECIMAL_ERROR = "shapeGrossWeightCheckInputDecimalError";
	/** 総重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeGrossWeightCheckInputIntegerError";
	/** 総重量(g) は最大9999999以下を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_INPUT_MAX_ERROR = "shapeGrossWeightCheckInputMaxError";
	/** 総重量(g) 数値のみ */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeGrossWeightCheckNumericOnlyError";
	/** 高さ(mm)に小数は入力できません。 */
	public static final String SHAPE_HEIGHT_CHECK_INPUT_DECIMAL_ERROR = "shapeHeightCheckInputDecimalError";
	/** 高さ(mm)は最大99999以下を入力して下さい。 */
	public static final String SHAPE_HEIGHT_CHECK_INPUT_MAX_ERROR = "shapeHeightCheckInputMaxError";
	/** 高さ(mm) 数値のみ */
	public static final String SHAPE_HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeHeightCheckNumericOnlyError";
	/** 縦(mm)に小数は入力できません。 */
	public static final String SHAPE_LENGTH_CHECK_INPUT_DECIMAL_ERROR = "shapeLengthCheckInputDecimalError";
	/** 縦(mm)は最大99999以下を入力して下さい。 */
	public static final String SHAPE_LENGTH_CHECK_INPUT_MAX_ERROR = "shapeLengthCheckInputMaxError";
	/** 縦(mm) 数値のみ */
	public static final String SHAPE_LENGTH_CHECK_NUMERIC_ONLY_ERROR = "shapeLengthCheckNumericOnlyError";
	/** 商品重量(g)に小数は入力できません。 */
	public static final String SHAPE_NET_WEIGHT_CHECK_INPUT_DECIMAL_ERROR = "shapeNetWeightCheckInputDecimalError";
	/** 商品重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeNetWeightCheckInputIntegerError";
	/** 商品重量(g) は最大9999999以下を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_CHECK_INPUT_MAX_ERROR = "shapeNetWeightCheckInputMaxError";
	/** 商品重量(g) 数値のみ */
	public static final String SHAPE_NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeNetWeightCheckNumericOnlyError";
	/** 荷姿マスタに存在しません。 */
	public static final String SHAPE_NOT_FOUND_ERROR = "shapeNotFoundError";
	/** 容積(mm3)に小数は入力できません。 */
	public static final String SHAPE_VOLUME_CHECK_INPUT_DECIMAL_ERROR = "shapeVolumeCheckInputDecimalError";
	/** 容積(mm3)は整数15桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_CHECK_INPUT_INTEGER_ERROR = "shapeVolumeCheckInputIntegerError";
	/** 容積(mm3)は最小0以上を入力して下さい。 */
	public static final String SHAPE_VOLUME_CHECK_MIN_IS_ZERO_ERROR = "shapeVolumeCheckMinIsZeroError";
	/** 容積(mm3) 数値のみ */
	public static final String SHAPE_VOLUME_CHECK_NUMERIC_ONLY_ERROR = "shapeVolumeCheckNumericOnlyError";
	/** 横(mm)に小数は入力できません。 */
	public static final String SHAPE_WIDTH_CHECK_INPUT_DECIMAL_ERROR = "shapeWidthCheckInputDecimalError";
	/** 横(mm)は最大99999以下を入力して下さい。 */
	public static final String SHAPE_WIDTH_CHECK_INPUT_MAX_ERROR = "shapeWidthCheckInputMaxError";
	/** 横(mm) 数値のみ */
	public static final String SHAPE_WIDTH_CHECK_NUMERIC_ONLY_ERROR = "shapeWidthCheckNumericOnlyError";
	/** 出荷確定以外の出庫指示に対して、出荷確定の解除はできません。 */
	public static final String SHIP_COMPLETE_CANCEL_START_ERROR = "shipCompleteCancelStartError";
	/** 入荷作業が既に始まっている為、出荷確定解除は出来ません。(出庫作業No：[0]) */
	public static final String SHIP_COMPLETED_CANNOT_CANCEL_RECEIVING_ERROR = "shipCompletedCannotCancelReceivingError";
	/** 検品済以外の出庫指示に対して、出荷確定はできません。 */
	public static final String SHIP_COMPLETE_START_ERROR = "shipCompleteStartError";
	/** 出荷日は納品指定日より後の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_DATE_ERROR = "shipDateCannotChangeAfterDelivDateError";
	/** 出荷日は納品予定日より後の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_PLAN_DATE_ERROR = "shipDateCannotChangeAfterDelivPlanDateError";
	/** 出荷日は作業日より前の日付に変更できません。 */
	public static final String SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "shipDateCannotChangeBeforeWorkDateError";
	/** 検品中断以外の出庫指示に対して、出荷検品を再開することはできません。 */
	public static final String SHIP_INSPECT_RE_START_ERROR = "shipInspectReStartError";
	/** 出庫指示済またはピッキング済以外の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_ERROR = "shipInspectStartError";
	/** 検品済の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_INSPECT_COMPLETE_ERROR = "shipInspectStartInspectCompleteError";
	/** 検品中の出庫指示に対して、出荷検品を開始することはできません。 */
	public static final String SHIP_INSPECT_START_UNDER_INSPECT_ERROR = "shipInspectStartUnderInspectError";
	/** 出荷元と納品先に同一のセンタが指定されています。 */
	public static final String SHIP_INST_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR = "shipInstCannnotInputSameTransitCenterError";
	/** 未出荷以外の出荷指示をキャンセルすることはできません。 */
	public static final String SHIP_INST_DELETE_START_ERROR = "shipInstDeleteStartError";
	/** 出庫指示処理は正常終了しました。緊急補充が発生していますので<a href="#wms/stock/StockMoveList?mode=3&processTypeCd=33"><b><u>在庫移動一覧</b></u></a>にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_REPLENISH_INFORMATION = "shipInstructeCompleteReplenishInformation";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので商品別出荷一覧にて確認して下さい。[/]緊急補充が発生していますので<a href="#wms/stock/StockMoveList?mode=3&processTypeCd=33"><b><u>在庫移動一覧</b></u></a>にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_AND_REPLENISH_INFORMATION = "shipInstructeCompleteStockOutAndReplenishInformation";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので商品別出荷一覧にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_INFORMATION = "shipInstructeCompleteStockOutInformation";
	/** ピッキングした在庫が別ロケーションに移動されています。在庫を確認して下さい。 */
	public static final String SHIP_INSTRUCTED_CANCEL_FORCED_MOVE_INFORMATION = "shipInstructedCancelForcedMoveInformation";
	/** 出庫作業No単位で指示を解除しますが宜しいですか？ */
	public static final String SHIP_INSTRUCTED_CANCEL_SAME_WORK_ORDER_NUMBER_CONFIRMATION = "shipInstructedCancelSameWorkOrderNumberConfirmation";
	/** 在庫数が不足している為、登録できません。 */
	public static final String SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR = "shipInstructedCannotRegisterStockShortageError";
	/** 出庫作業No単位で指示日を設定しますが宜しいですか？ */
	public static final String SHIP_INSTRUCTED_DATE_CHANGE_SAME_WORK_ORDER_NUMBER_CONFIRMATION = "shipInstructedDateChangeSameWorkOrderNumberConfirmation";
	/** 出庫指示済のデータが含まれています。 */
	public static final String SHIP_INSTRUCTED_FOUND_ERROR = "shipInstructedFoundError";
	/** 出荷指示数が引当可能数を超えています。 */
	public static final String SHIP_ORDER_QTY_CANNOT_INPUT_MORE_THANSTOCK_CAN_BE_ALLOCATE_ERROR = "shipOrderQtyCannotInputMoreThanstockCanBeAllocateError";
	/** 出荷指示数分の梱包がされていません。 */
	public static final String SHIP_ORDER_QTY_CANNOT_INPUT_NOT_EQUAL_PACKING_QTY_TOTAL_ERROR = "shipOrderQtyCannotInputNotEqualPackingQtyTotalError";
	/** 出荷指示数が引当可能数を超えています。宜しいですか？ */
	public static final String SHIP_ORDER_QTY_REGISTER_MORE_THAN_STOCK_CONFIRMATION = "shipOrderQtyRegisterMoreThanStockConfirmation";
	/** マスタエラーが有りましたが、出荷指示は登録されました。一覧でエラー内容を確認して下さい。[/]伝票番号：[0]で登録しました。 */
	public static final String SHIP_ORDER_REGISTER_CONTAINED_MASTER_ERROR_INFORMATION = "shipOrderRegisterContainedMasterErrorInformation";
	/** EDI入力した出荷指示データの修正はできません。 */
	public static final String SHIP_ORDER_UPDATE_START_EDI_ERROR = "shipOrderUpdateStartEdiError";
	/** 未出荷以外の出荷指示データは修正できません。 */
	public static final String SHIP_ORDER_UPDATE_START_NONSHIPMENT_ERROR = "shipOrderUpdateStartNonshipmentError";
	/** ピッキング中、またはピッキング済のため、出庫検品できません。 */
	public static final String SHIP_PICK_FIRST_START_ERROR = "shipPickFirstStartError";
	/** 出庫指示済以外は、出庫検品できません。 */
	public static final String SHIP_PICK_SECOND_START_ERROR = "shipPickSecondStartError";
	/** 出荷日が日付不正(形式:yyyy/MM/dd) */
	public static final String SHIPPING_DT_DATE_ERROR = "shippingDtDateError";
	/** 出荷日を入力して下さい。 */
	public static final String SHIPPING_DT_NOT_INPUT_ERROR = "shippingDtNotInputError";
	/** センタCD：[0] , 荷主CD：[1] , 出庫指示バッチNo.：[2] , 処理No.：[3] , 伝票数：[4] */
	public static final String SHIPPING_INST_BATCH_PARAMETER_INFORMATION = "shippingInstBatchParameterInformation";
	/** 出庫指示 */
	public static final String SHIPPING_INST_BATCH_PROGRAM_NAME_INFORMATION = "shippingInstBatchProgramNameInformation";
	/** 出庫指示処理をキューに登録しました。キューNo.([0]) */
	public static final String SHIPPING_INST_BATCH_REGISTER_INFORMATION = "shippingInstBatchRegisterInformation";
	/** この商品は期限日管理対象外です。指定期限日は入力しないで下さい。 */
	public static final String SHIPPING_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR = "shippingLimitDtManagFlgCannotInputExceptLimitDtManagementProductError";
	/** 出荷期限日数に小数は入力できません。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "shippingLimitNumCheckInputDecimalError";
	/** 出荷期限日数は最大99999以下を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "shippingLimitNumCheckInputMaxError";
	/** 出荷期限日数 数値のみ */
	public static final String SHIPPING_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "shippingLimitNumCheckNumericOnlyError";
	/** 出荷期限日数は最小1以上を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR = "shippingLimitNumInputRequestMinIsOneError";
	/** 出荷期限日数は最小0以上を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "shippingLimitNumInputRequestMinIsZeroError";
	/** 出荷期限日数を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_NOT_INPUT_ERROR = "shippingLimitNumNotInputError";
	/** この商品はロット管理対象外です。指定ロットは入力しないで下さい。 */
	public static final String SHIPPING_LOT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LOT_MANAGEMENT_PRODUCT_ERROR = "shippingLotManagFlgCannotInputExceptLotManagementProductError";
	/** 出荷予定一括取込 */
	public static final String SHIPPING_PLAN_BULK_INPUT_PROGRAM_NAME_INFORMATION = "shippingPlanBulkInputProgramNameInformation";
	/** 出荷停止フラグが存在しません。 */
	public static final String SHIPPING_STOP_FLG_NOT_FOUND_ERROR = "shippingStopFlgNotFoundError";
	/** 出荷停止フラグを入力して下さい。 */
	public static final String SHIPPING_STOP_FLG_NOT_INPUT_ERROR = "shippingStopFlgNotInputError";
	/** 佐川送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_SGW_INFORMATION = "shippingTagDataOutputFileNameSgwInformation";
	/** ヤマト送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YMT_INFORMATION = "shippingTagDataOutputFileNameYmtInformation";
	/** ゆうパック送り状データ */
	public static final String SHIPPING_TAG_DATA_OUTPUT_FILE_NAME_YUPK_INFORMATION = "shippingTagDataOutputFileNameYupkInformation";
	/** 削除することはできません。 */
	public static final String SHIP_RESULT_CANNOT_DELETE_ERROR = "shipResultCannotDeleteError";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日・入庫日を入力時は、入庫ラベルNoを入力して下さい。 */
	public static final String SHIP_RESULT_CＨANGE_CANNOT_UPDATE_STORE_LABEL_NUMBER_NOT_INPUT_SAME_STOCK_ERROR = "shipResultCｈangeCannotUpdateStoreLabelNumberNotInputSameStockError";
	/** 出荷実績訂正処理は正常終了しました。梱包明細修正にて梱包内容を修正して下さい。 */
	public static final String SHIP_RESULT_CＨANGE_COMPLETE_PACKAGE_CHANGED_INFORMATION = "shipResultCｈangeCompletePackageChangedInformation";
	/** 出荷実績入力画面へデータを上書きしますが、宜しいですか？ */
	public static final String SHIP_RESULT_OVER_WRITE_CONFIRMATION = "shipResultOverWriteConfirmation";
	/** ケース出荷中は検品終了まで修正できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_CHANGE_CASE_INSPECT_ERROR = "shipResultQtyCannotChangeCaseInspectError";
	/** 出荷検品中、検品中断中は修正できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_CHANGE_INSPECT_OR_INTERRUPT_ERROR = "shipResultQtyCannotChangeInspectOrInterruptError";
	/** 出荷停止中、または引当不可の商品は実績数に０以外は入力できません。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_EXCEPT_ZERO_ERROR = "shipResultQtyCannotInputExceptZeroError";
	/** 入荷予定数を超えています。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_PLAN_ERROR = "shipResultQtyCannotInputMoreThanPlanError";
	/** 実績数の合計が指示数を超えています。 */
	public static final String SHIP_RESULT_QTY_CANNOT_INPUT_MORE_THAN_TOTAL_ERROR = "shipResultQtyCannotInputMoreThanTotalError";
	/** 引当可能な在庫数がありません。宜しいですか？ */
	public static final String SHIP_RESULT_QTY_REGISTER_STOCK_SHORTAGE_CONFIRMATION = "shipResultQtyRegisterStockShortageConfirmation";
	/** 引当で欠品が発生しましたが、出荷実績は登録されました。一覧で欠品内容を確認して下さい。[/]伝票番号：[0]で登録しました。 */
	public static final String SHIP_RESULT_REGISTER_CONTAINED_STOCK_OUT_INFORMATION = "shipResultRegisterContainedStockOutInformation";
	/** 納品先が存在しません。 */
	public static final String SHIP_TO_CODE_NOT_FOUND_ERROR = "shipToCodeNotFoundError";
	/** 取引先区分(納品先)が存在しません。 */
	public static final String SHIP_TO_FLAG_NOT_FOUND_IN_PARTNER_MASTER_ERROR = "shipToFlagNotFoundInPartnerMasterError";
	/** 出庫指示済またはピッキング済または検品済以外の出荷指示に対して、出荷実績を訂正することはできません。 */
	public static final String SHIP_UPDATE_START_ERROR = "shipUpdateStartError";
	/** 入力された出庫作業Noは既に確定済です。 */
	public static final String SHIP_WOKING_NUMBER_CANNOT_SELECT_COMPLETED_ERROR = "shipWokingNumberCannotSelectCompletedError";
	/** 対象の出庫作業No.／梱包No.は検品済です。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTED_ERROR = "shipWokingOrPackingNumberCannotInputInspectedError";
	/** 出庫作業No.／梱包No.は検品中です。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_CANNOT_INPUT_INSPECTING_ERROR = "shipWokingOrPackingNumberCannotInputInspectingError";
	/** 出庫作業No.／梱包No.に誤りがあります。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_INPUT_ERROR = "shipWokingOrPackingNumberInputError";
	/** 出庫作業No.／梱包No.が入力されていません。 */
	public static final String SHIP_WOKING_OR_PACKING_NUMBER_NOT_INPUT_ERROR = "shipWokingOrPackingNumberNotInputError";
	/** 同一伝票の明細データが、他の行で入力されています。 */
	public static final String SLIP_NO_DUPLICATE_ERROR = "slipNoDuplicateError";
	/** 標準箱に設定されているため、削除できません。 */
	public static final String STANDARD_BOX_CANNOT_DELETE_ERROR = "standardBoxCannotDeleteError";
	/** 標準箱の設定を変更します。宜しいですか？ */
	public static final String STANDARD_BOX_CHANGE_CONFIRMATION = "standardBoxChangeConfirmation";
	/** 削除された箱は標準箱に設定出来ません。 */
	public static final String STANDERD_BOX_CANNOT_SELECT_DELETED_ERROR = "standerdBoxCannotSelectDeletedError";
	/** 開始時間を終了時間前の時点に設定しなければなりません。 */
	public static final String START_TIME_INPUT_REQUEST_BEFORE_END_TIME_ERROR = "startTimeInputRequestBeforeEndTimeError";
	/** 確定済のデータは在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_COMPLETED_ERROR = "stockAdjustmentCannotExecuteCompletedError";
	/** 登録されていないデータは在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_NOT_REGISTERED_ERROR = "stockAdjustmentCannotExecuteNotRegisteredError";
	/** 棚卸数量が未登録のため在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_RESULT_QTY_NOT_REGISTERED_ERROR = "stockAdjustmentCannotExecuteResultQtyNotRegisteredError";
	/** 棚卸データ作成時より在庫に変更がある為、調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_COUNT_DATA_CHANGED_ERROR = "stockAdjustmentCannotExecuteStockCountDataChangedError";
	/** 既に在庫が存在しています。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_DATA_EXISTS_ERROR = "stockAdjustmentCannotExecuteStockDataExistsError";
	/** 棚卸データ作成時より在庫に変更がある為、調整できません。詳細は運用管理情報で確認して下さい。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_QTY_CHANGED_INFORMATION = "stockAdjustmentCannotExecuteStockQtyChangedInformation";
	/** 在庫数が不足の為、調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR = "stockAdjustmentCannotExecuteStockShortageError";
	/** 既に存在する入庫ラベルNoです。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_EXECUTE_STORE_NO_EXISTS_ERROR = "stockAdjustmentCannotExecuteStoreNoExistsError";
	/** ロット管理フラグまたは期限日管理フラグが変更された為、在庫調整できません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_REGISTER_LOT_LIMIT_DT_FLG_CHANGED_ERROR = "stockAdjustmentCannotRegisterLotLimitDtFlgChangedError";
	/** マージ先の在庫があるため、新しい入庫ラベルNoの指定はできません。 */
	public static final String STOCK_ADJUSTMENT_CANNOT_REGISTER_MERGE_BY_NEW_STORE_LABEL_ERROR = "stockAdjustmentCannotRegisterMergeByNewStoreLabelError";
	/** 在庫調整を行いますが、宜しいですか？ */
	public static final String STOCK_ADJUSTMENT_EXECUTE_CONFIRMATION = "stockAdjustmentExecuteConfirmation";
	/** 調整数量項目の入力内容に誤りがあります。 */
	public static final String STOCK_ADJUSTMENT_INPUT_STOCK_INFORMATION_ERROR = "stockAdjustmentInputStockInformationError";
	/** 調整数量が調整前数量を超えています。 */
	public static final String STOCK_ADJUSTMENT_QTY_CANNOT_INPUT_MORE_THAN_BEFORE_ERROR = "stockAdjustmentQtyCannotInputMoreThanBeforeError";
	/** 引当可能な在庫がありません。 */
	public static final String STOCK_CAN_BE_ALLOCATE_NOT_FOUND_INFORMATION = "stockCanBeAllocateNotFoundInformation";
	/** セット品、定期補充、緊急補充データ以外に対して、処理はできません。 */
	public static final String STOCK_CANNOT_EXECUTE_SET_REPLENISH_DATA_ERROR = "stockCannotExecuteSetReplenishDataError";
	/** 在庫を特定できません。指定ロケーションに複数の在庫が存在します。 */
	public static final String STOCK_CANNOT_SPECIFY_ERROR = "stockCannotSpecifyError";
	/** 在庫区分は最大30文字以下を入力して下さい。 */
	public static final String STOCK_CLASS_CHECK_INPUT_MAX_ERROR = "stockClassCheckInputMaxError";
	/** 在庫区分を入力して下さい。 */
	public static final String STOCK_CLASS_NOT_INPUT_ERROR = "stockClassNotInputError";
	/** 棚卸在庫一括更新終了 */
	public static final String STOCK_COUNT_BULK_UPDATE_COMPLETE_INFORMATION = "stockCountBulkUpdateCompleteInformation";
	/** 棚卸在庫一括更新 */
	public static final String STOCK_COUNT_BULK_UPDATE_EXECUTE_INFORMATION = "stockCountBulkUpdateExecuteInformation";
	/** 商品CD：[1] ,商品名称：[2] ,ロット：[3] ,期限日：[4] ,ロケーション：[5] ,棚卸前在庫数[6] ,棚卸数量：[7] ,棚卸差異数：[8] */
	public static final String STOCK_COUNT_BULK_UPDATE_PARAMETER_INFORMATION = "stockCountBulkUpdateParameterInformation";
	/** 処理件数：[1]件 ,更新件数：[2]件 ,エラー件数：[3]件 */
	public static final String STOCK_COUNT_BULK_UPDATE_RESULT_TRANSACTION_INFORMATION = "stockCountBulkUpdateResultTransactionInformation";
	/** 棚卸在庫一括更新開始 */
	public static final String STOCK_COUNT_BULK_UPDATE_START_INFORMATION = "stockCountBulkUpdateStartInformation";
	/** 作業中またはは引当済の在庫が存在しています。棚卸データを作成して宜しいですか？ */
	public static final String STOCK_COUNT_CREATE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION = "stockCountCreateCompleteContainedIntransitInformation";
	/** 棚卸データ作成終了 */
	public static final String STOCK_COUNT_CREATE_COMPLETE_INFORMATION = "stockCountCreateCompleteInformation";
	/** 棚卸データ抽出条件 */
	public static final String STOCK_COUNT_CREATE_CONDITION_INFORMATION = "stockCountCreateConditionInformation";
	/** 確定済のデータが含まれています。処理を行いますか？ */
	public static final String STOCK_COUNT_CREATE_EXECUTE_INCLUDED_COMPLETED_CONFIRMATION = "stockCountCreateExecuteIncludedCompletedConfirmation";
	/** ロケーション：[1] ,商品CD：[2] ,商品名称：[3] ,ロット：[4] ,期限日：[5] ,引当可能数：[6] ,未確定数：[7] ,作業／積送中数：[8] */
	public static final String STOCK_COUNT_CREATE_EXECUTE_INFORMATION = "stockCountCreateExecuteInformation";
	/** 既に棚卸入力されたデータがあります。データを上書きしてよろしいですか？ */
	public static final String STOCK_COUNT_CREATE_EXECUTE_OVERWRITE_CONFIRMATION = "stockCountCreateExecuteOverwriteConfirmation";
	/** 棚卸データを作成できません。（積送中、引当済の在庫あり。） */
	public static final String STOCK_COUNT_CREATE_FAILED_INFORMATION = "stockCountCreateFailedInformation";
	/** 棚卸日：[1] ,在庫区分：[2] ,ロケーション：[3]～[4] ,ゾーン：[5] ,当日受払のみ：[6] ,在庫数＞0のみ：[7] */
	public static final String STOCK_COUNT_CREATE_PARAMETER_INFORMATION = "stockCountCreateParameterInformation";
	/** 作業／積送中または未確定数の在庫件数：[1] */
	public static final String STOCK_COUNT_CREATE_RESULT_CONTAINED_INTRANSIT_INFORMATION = "stockCountCreateResultContainedIntransitInformation";
	/** 棚卸データ作成 */
	public static final String STOCK_COUNT_CREATE_RESULT_INFORMATION = "stockCountCreateResultInformation";
	/** 追加件数：[1]件 ,更新件数：[2]件 */
	public static final String STOCK_COUNT_CREATE_RESULT_TRANSACTION_INFORMATION = "stockCountCreateResultTransactionInformation";
	/** 棚卸データ作成開始 */
	public static final String STOCK_COUNT_CREATE_START_INFORMATION = "stockCountCreateStartInformation";
	/** 棚卸データチェック */
	public static final String STOCK_COUNT_DATA_CHECK_EXECUTE_INFORMATION = "stockCountDataCheckExecuteInformation";
	/** 棚卸データが既に存在します。 */
	public static final String STOCK_COUNT_DATA_FOUND_ERROR = "stockCountDataFoundError";
	/** 指定された入庫ラベルNo.は移動中の為、指定できません。 */
	public static final String STOCK_DATA_CANNOT_CHANGE_MOVING_ERROR = "stockDataCannotChangeMovingError";
	/** 在庫データが既に存在します、処理できません。 */
	public static final String STOCK_DATA_FOUND_ERROR = "stockDataFoundError";
	/** 在庫更新で同じ入庫No、ロケの現品が存在しています、在庫情報を確認して下さい。 */
	public static final String STOCK_DATA_FOUND_LOCATION_STORE_NO_ERROR = "stockDataFoundLocationStoreNoError";
	/** 在庫データが存在しません。 */
	public static final String STOCK_DATA_NOT_FOUND_ERROR = "stockDataNotFoundError";
	/** 複数の在庫情報(入庫ラベルNo)がある為、処理できません。 */
	public static final String STOCK_DATA_PLURAL_FOUND_ERROR = "stockDataPluralFoundError";
	/** 入出荷データが存在する為、移行できない。 */
	public static final String STOCK_INPUT_CANNOT_REGISTER_STOCK_INOUT_EXISTED_ERROR = "stockInputCannotRegisterStockInoutExistedError";
	/** 在庫データ取込（ワーク取込） */
	public static final String STOCK_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "stockInputProgramNameInputWorkInformation";
	/** 在庫データ取込（データ移行） */
	public static final String STOCK_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "stockInputProgramNameRegisterInformation";
	/** 在庫数が不足している為、移動できません。 */
	public static final String STOCK_MOVE_CANNOT_EXECUTE_STOCK_SHORTAGE_ERROR = "stockMoveCannotExecuteStockShortageError";
	/** 処理区分を統一してください。 */
	public static final String STOCK_MOVE_DATA_CANNOT_SELECT_DIFFERENT_PROCESS_TYPE_ERROR = "stockMoveDataCannotSelectDifferentProcessTypeError";
	/** 移動先ロケーションに他商品の補充設定がされています。上書きしてしまいますがよろしいですか？ */
	public static final String STOCK_MOVE_REGISTER_REPLENISH_DATA_OVERWRITE_CONFIRMATION = "stockMoveRegisterReplenishDataOverwriteConfirmation";
	/** 棚卸差異調整 */
	public static final String STOCK_MOVE_REMARKS_INFORMATION = "stockMoveRemarksInformation";
	/** 欠品棚CDはロケーションマスタに存在しません。 */
	public static final String STOCK_OUT_LOCATION_CODE_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "stockOutLocationCodeNotFoundInLocationMasterError";
	/** 欠品倉庫CDは倉庫マスタに存在しません。 */
	public static final String STOCK_OUT_WAREHOUSE_CODE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "stockOutWarehouseCodeNotFoundInWarehouseMasterError";
	/** 正常に更新されました。商品内容が異なるため新しい入庫ラベルNo.で登録された商品があります。 */
	public static final String STOCK_REGISTER_NEW_CAUSE_STORE_LABEL_USED_INFORMATION = "stockRegisterNewCauseStoreLabelUsedInformation";
	/** 入荷したロケーションの在庫が不足している為、登録できません。入荷した時の在庫数に戻してから登録してください。 */
	public static final String STOCK_RESULT_CANNOT_CANCEL_STOCK_SHORTAGE_ERROR = "stockResultCannotCancelStockShortageError";
	/** 入荷可能な期限日を過ぎている商品がありますが、このまま続行しても宜しいですか？ */
	public static final String STOCK_RESULT_REGISTER_LIMIT_DATE_OVER_INFORMATION = "stockResultRegisterLimitDateOverInformation";
	/** 在庫区分CDは在庫区分マスタに存在しません。 */
	public static final String STOCK_TYPE_CD_NOT_FOUND_ERROR = "stockTypeCdNotFoundError";
	/** 在庫区分CDを入力して下さい。 */
	public static final String STOCK_TYPE_CD_NOT_INPUT_ERROR = "stockTypeCdNotInputError";
	/** 処理区分マスタに登録されている在庫区分CDは削除できません。 */
	public static final String STOCK_TYPE_CODE_CANNOT_DELETE_IN_PROCESS_TYPE_MASTER_ERROR = "stockTypeCodeCannotDeleteInProcessTypeMasterError";
	/** 在庫区分CDが重複しています。 */
	public static final String STOCK_TYPE_CODE_DUPLICATE_ERROR = "stockTypeCodeDuplicateError";
	/** 在庫区分が存在しません。 */
	public static final String STOCK_TYPE_NOT_FOUND_ERROR = "stockTypeNotFoundError";
	/** 同一の顧客入荷指示No、仕入先内で在庫区分が不一致です。 */
	public static final String STOCK_TYPE_UNMATCH_IN_CLIENT_RECEIVE_NO_ON_BULK_ERROR = "stockTypeUnmatchInClientReceiveNoOnBulkError";
	/** ロケ、ロット、在庫区分、預託、期限日、仕入先が在庫と不一致です。確認して下さい。 */
	public static final String STORE_ITEM_UNMATCH_ERROR = "storeItemUnmatchError";
	/** センタ間移動の移動元出庫データが存在しません。履歴に移動されたか削除されています。 */
	public static final String STORE_RESULT_CANNNOT_REGISTER_NOT_FOUND_TRANSIT_PICKING_DATA_ERROR = "storeResultCannnotRegisterNotFoundTransitPickingDataError";
	/** 実績が無いデータは取消できません。 */
	public static final String STORE_RESULT_CANNOT_CANCEL_NO_INPUT_ERROR = "storeResultCannotCancelNoInputError";
	/** 入数が異なる為、入庫できません。（商品CD：[0] , ロケーションCD：[1]）入数が異なる商品は違うロケーションに入庫して下さい。 */
	public static final String STORE_RESULT_CANNOT_REGISTER_UNIT_NUM_CHANGED_ERROR = "storeResultCannotRegisterUnitNumChangedError";
	/** 構成品が別の親商品に使用済みです。 */
	public static final String STRUCTURE_CANNOT_INPUT_ANOTHER_PARENT_PRODUCT_ERROR = "structureCannotInputAnotherParentProductError";
	/** 構成品CDが重複しています。 */
	public static final String STRUCTURE_CODE_DUPLICATE_ERROR = "structureCodeDuplicateError";
	/** 構成品、ロケーション、期限日、ロットが重複しています。 */
	public static final String STRUCTURE_LOCATION_LOT_LIMIT_DT_DUPLICATE_ERROR = "structureLocationLotLimitDtDuplicateError";
	/** 集計行を複製することは出来ません。 */
	public static final String SUMMARY_LINE_CANNOT_COPY_ERROR = "summaryLineCannotCopyError";
	/** 補充商品CD、補充点荷姿CD、補充点、最大格納数商品荷姿CD、最大格納数いずれ入力ある場合、補充の項目が全部必須入力です。 */
	public static final String SUPPLEMENT_NO_INPUT_ERROR = "supplementNoInputError";
	/** 取引先区分(仕入先)が存在しません。 */
	public static final String SUPPLIER_FLAG_NOT_FOUND_ERROR = "supplierFlagNotFoundError";
	/** 仕入先が取引先マスタに存在しません。 */
	public static final String SUPPLIER_NOT_FOUND_ERROR = "supplierNotFoundError";
	/** 納品先CD 英数字と-のみ */
	public static final String SUPPLY_CUSTOMER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "supplyCustomerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 納品先CDは最大10文字以下を入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_CD_CHECK_INPUT_MAX_ERROR = "supplyCustomerCdCheckInputMaxError";
	/** 納品先CDを入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_CD_NOT_INPUT_ERROR = "supplyCustomerCdNotInputError";
	/** システム稼動時間外です！操作できません。 */
	public static final String SYSTEM_CANNOT_OPERATION_AFTER_HOURS_ERROR = "systemCannotOperationAfterHoursError";
	/** 日次処理を実行してください。 */
	public static final String SYSTEM_DT_WARN = "systemDtWarn";
	/** データ種別が重複しています。 */
	public static final String TAG_TYPE_DUPLICATE_ERROR = "tagTypeDuplicateError";
	/** 配送コース([0])の送り状種別が設定されていません。 */
	public static final String TAG_TYPE_NOT_FOUND_IN_DELIVERY_COURSE_ERROR = "tagTypeNotFoundInDeliveryCourseError";
	/** 該当データの配送コースには送り状種別が登録されていません。 */
	public static final String TAG_TYPE_NOT_FOUND_IN_DELIVERY_COURSE_MASTER_ERROR = "tagTypeNotFoundInDeliveryCourseMasterError";
	/** 電話番号は最大15文字以下を入力して下さい。 */
	public static final String TEL_NO_CHECK_INPUT_MAX_ERROR = "telNoCheckInputMaxError";
	/** 電話番号 数字と-のみ */
	public static final String TEL_NO_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR = "telNoCheckNumericAndHyphenOnlyError";
	/** 仮置棚CDはロケーションマスタに存在しません。 */
	public static final String TEMPORARY_WAREHOUSE_CODE_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "temporaryWarehouseCodeNotFoundInLocationMasterError";
	/** 仮置倉庫CDは倉庫マスタに存在しません。 */
	public static final String TEMPORARY_WAREHOUSE_CODE_NOT_FOUND_IN_WAREHAUSE_MASTER_ERROR = "temporaryWarehouseCodeNotFoundInWarehauseMasterError";
	/** トランザクション保持期間には履歴保持期間より小さい日数を入力して下さい。 */
	public static final String T_KEEPING_DAYS_CANNOT_CHANGE_H_KEEPING_DAYS_ERROR = "tKeepingDaysCannotChangeHKeepingDaysError";
	/** HT検品中ですが、入荷実績を登録しますか？ */
	public static final String UNDER_H_T_INSPECT_CONFIRMATION = "underHTInspectConfirmation";
	/** HT検品中ですが、入荷取消を行ってもよろしいですか？ */
	public static final String UNDER_H_T_INSPECT_RECEIVE_CANCEL_CONFIRMATION = "underHTInspectReceiveCancelConfirmation";
	/** 入数に小数は入力できません。 */
	public static final String UNIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "unitNumCheckInputDecimalError";
	/** 入数は最大99999以下を入力して下さい。 */
	public static final String UNIT_NUM_CHECK_INPUT_MAX_ERROR = "unitNumCheckInputMaxError";
	/** 入数 数値のみ */
	public static final String UNIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "unitNumCheckNumericOnlyError";
	/** 入数は最小1以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR = "unitNumInputRequestMinIsOneError";
	/** 入数は最小0以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "unitNumInputRequestMinIsZeroError";
	/** 入数を入力して下さい。 */
	public static final String UNIT_NUM_NOT_INPUT_ERROR = "unitNumNotInputError";
	/** ロケーション、ロット、在庫区分、預託在庫区分、期限日、仕入先が在庫と不一致です。確認して下さい。 */
	public static final String UNMATCH_STOCK_DATA_ERROR = "unmatchStockDataError";
	/** セット組指示が行われている為、変更できません。 */
	public static final String UPDATE_PRODUCT_MOVE_INST_FOUND_ERROR = "updateProductMoveInstFoundError";
	/** 該当商品に在庫データが存在するため変更できません。 */
	public static final String UPDATE_PRODUCT_STOCK_FOUND_ERROR = "updateProductStockFoundError";
	/** ユーザに紐づく荷主、又はセンタ、又は倉庫が取得出来ませんでした。 */
	public static final String USER_INFO_GET_ERROR = "userInfoGetError";
	/** ユーザログインマスタに存在しません。 */
	public static final String USER_LOGIN_NOT_FOUND_ERROR = "userLoginNotFoundError";
	/** 仕入先フラグが存在しません。 */
	public static final String VENDOR_FLG_NOT_FOUND_ERROR = "vendorFlgNotFoundError";
	/** 仕入先フラグを入力して下さい。 */
	public static final String VENDOR_FLG_NOT_INPUT_ERROR = "vendorFlgNotInputError";
	/** ピース容積(mm3) は整数15桁以内を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_MAX_ERROR = "volumeCheckInputMaxError";
	/** ピース容積(mm3) は最小0以上を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_MIN_ERROR = "volumeCheckInputMinError";
	/** ピース容積(mm3) 数値のみ */
	public static final String VOLUME_CHECK_NUMERIC_ONLY_ERROR = "volumeCheckNumericOnlyError";
	/** 指定倉庫CDは倉庫マスタに存在しません。 */
	public static final String WAREHOUSE_CD_NOT_FOUND_ERROR = "warehouseCdNotFoundError";
	/** 倉庫CDを入力して下さい。 */
	public static final String WAREHOUSE_CD_NOT_INPUT_ERROR = "warehouseCdNotInputError";
	/** ゾーンマスタに登録されている倉庫CDは削除できません。 */
	public static final String WAREHOUSE_CODE_CANNOT_DELETE_IN_ZONE_MASTER_ERROR = "warehouseCodeCannotDeleteInZoneMasterError";
	/** 倉庫CDが重複しています。 */
	public static final String WAREHOUSE_CODE_DUPLICATE_ERROR = "warehouseCodeDuplicateError";
	/** 倉庫マスタに存在しません。 */
	public static final String WAREHOUSE_NOT_FOUND_ERROR = "warehouseNotFoundError";
	/** 倉庫 */
	public static final String WAREHOUSE_TITLE = "warehouseTitle";
	/** 佐川送り状マスタのカスタマーIDが不正です。 */
	public static final String WEB_API_CUSTOMER_ID_NOT_FOUND_ERROR = "webApiCustomerIdNotFoundError";
	/** 佐川送り状マスタの送り状コードが不正です。 */
	public static final String WEB_API_OKURI_CODE_NOT_FOUND_ERROR = "webApiOkuriCodeNotFoundError";
	/** 佐川送り状マスタのWebAPIリクエストURLが不正です。 */
	public static final String WEB_API_REQUEST_URL_NOT_FOUND_ERROR = "webApiRequestUrlNotFoundError";
	/** ピース横(mm) は最大99999以下を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_MAX_ERROR = "widthCheckInputMaxError";
	/** ピース横(mm) は最小0以上を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_MIN_ERROR = "widthCheckInputMinError";
	/** ピース横(mm) 数値のみ */
	public static final String WIDTH_CHECK_NUMERIC_ONLY_ERROR = "widthCheckNumericOnlyError";
	/** 横(mm)は最小0以上を入力して下さい。 */
	public static final String WIDTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "widthInputRequestMinIsZeroError";
	/** WMS基盤エラー */
	public static final String WMS_BASE_ERROR = "wmsBaseError";
	/** 作業日は出荷日より後の日付に変更できません。 */
	public static final String WORK_DATE_CANNOT_CHANGE_BEFORE_SHIO_DATE_ERROR = "workDateCannotChangeBeforeShioDateError";
	/** 出荷確定またはキャンセル済の出荷指示に対して、作業日／出荷日を変更することはできません。 */
	public static final String WORK_DAY_SHIPPING_DAY_CHANGE_START_ERROR = "workDayShippingDayChangeStartError";
	/** 作業日が日付不正(形式:yyyy/MM/dd) */
	public static final String WORK_DT_DATE_ERROR = "workDtDateError";
	/** 作業日を入力して下さい。 */
	public static final String WORK_DT_NOT_INPUT_ERROR = "workDtNotInputError";
	/** 出荷確定またはキャンセル済の出荷指示に対して、作業メッセージを登録することはできません。 */
	public static final String WORK_MESSAGE_INSERT_START_ERROR = "workMessageInsertStartError";
	/** 出庫作業No.単位で指示を解除しますが宜しいですか？ */
	public static final String WORK_ORDER_CANCEL_CONFIRMATION = "workOrderCancelConfirmation";
	/** ヤマト着店マスタ取込（ワーク取込） */
	public static final String YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "ymtCarrierZipInputProgramNameInputWorkInformation";
	/** ヤマト着店マスタ取込（データ移行） */
	public static final String YMT_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "ymtCarrierZipInputProgramNameRegisterInformation";
	/** 郵便番号は最大7文字以下を入力して下さい。 */
	public static final String ZIP_CD_CHECK_INPUT_MAX_ERROR = "zipCdCheckInputMaxError";
	/** 郵便番号 数値のみ */
	public static final String ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "zipCdCheckNumericOnlyError";
	/** 郵便番号CDが重複しています。 */
	public static final String ZIP_CODE_DUPLICATE_ERROR = "zipCodeDuplicateError";
	/** 郵便番号で存在しません。 */
	public static final String ZIP_CODE_NOT_FOUND_ERROR = "zipCodeNotFoundError";
	/** 郵便番号を入力して下さい。 */
	public static final String ZIP_CODE_NOT_INPUT_ERROR = "zipCodeNotInputError";
	/** 郵便番号マスタ（大口事業所）取込（ワーク取込） */
	public static final String ZIP_COMPANY_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "zipCompanyInputProgramNameInputWorkInformation";
	/** 郵便番号マスタ（大口事業所）取込（データ移行） */
	public static final String ZIP_COMPANY_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "zipCompanyInputProgramNameRegisterInformation";
	/** 郵便番号マスタ取込（ワーク取込） */
	public static final String ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "zipInputProgramNameInputWorkInformation";
	/** 郵便番号マスタ取込（データ移行） */
	public static final String ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "zipInputProgramNameRegisterInformation";
	/** 検索条件を入力して検索して下さい。 */
	public static final String ZIP_MASTER_CANNOT_SELECT_NOT_INPUT_ERROR = "zipMasterCannotSelectNotInputError";
	/** エラー以外の出荷指示に対して、郵便番号を変更することはできません。 */
	public static final String ZIP_NO_CHANGE_START_ERROR = "zipNoChangeStartError";
	/** 郵便番号一括変更 */
	public static final String ZIP_UPDATE_CONDITION = "zipUpdateCondition";
	/** 該当ゾーンCDが該当倉庫マスタに存在しません。 */
	public static final String ZONE_CD_NOT_FOUND_ERROR = "zoneCdNotFoundError";
	/** ゾーンCDを入力して下さい。 */
	public static final String ZONE_CD_NOT_INPUT_ERROR = "zoneCdNotInputError";
	/** ロケーションマスタに登録されているゾーンCDは削除できません。 */
	public static final String ZONE_CODE_CANNOT_DELETE_IN_LOCATION_MASTER_ERROR = "zoneCodeCannotDeleteInLocationMasterError";
	/** ゾーンCDが重複しています。 */
	public static final String ZONE_CODE_DUPLICATE_ERROR = "zoneCodeDuplicateError";
	/** ゾーンマスタに存在します。 */
	public static final String ZONE_CODE_FOUND_IN_ZONE_MASTER_ERROR = "zoneCodeFoundInZoneMasterError";
	/** ゾーンCDがゾーンマスタに存在しません。 */
	public static final String ZONE_CODE_NOT_FOUND_IN_ZONE_MASTER_ERROR = "zoneCodeNotFoundInZoneMasterError";
	/** ゾーン名称を入力して下さい。 */
	public static final String ZONE_NAME_NOT_INPUT_ERROR = "zoneNameNotInputError";
	/** 小数管理商品梱包単位が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_DECIMAL_PACKING_CLS_ERROR = "packingCalculateCannotExecuteNotFoundDecimalPackingClsError";
	/** セッションが切断されました。再度ログインしてください。 */
	public static final String HANDY_SESSION_TIMEOUT = "handySessionTimeout";
}
