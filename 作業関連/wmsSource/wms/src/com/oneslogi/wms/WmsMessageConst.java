package com.oneslogi.wms;

import com.oneslogi.base.BaseMessageConst;

public class WmsMessageConst extends BaseMessageConst {

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
	/** 構成セットにこの構成品がある為、行削除は行えません。 */
	public static final String ALREADY_EXISTS_STRUCTURE_CANNOT_DELETE_ERROR = "alreadyExistsStructureCannotDeleteError";
	/** 登録済データの為、行削除は行えません。 */
	public static final String ALREADY_REGISTERED_CANNOT_DELETE_ERROR = "alreadyRegisteredCannotDeleteError";
	/** 登録済データの為、分割解除は行えません。 */
	public static final String ALREADY_REGISTERED_CANNOT_SPLIT_CANCEL_ERROR = "alreadyRegisteredCannotSplitCancelError";
	/** 登録後はメインメニューに遷移します。 */
	public static final String ANNOUNCE_CHANGE_CENTER_CLIENT = "announceChangeCenterClient";
	/** 仕分コードを入力して下さい。 */
	public static final String ARRIVAL_STORE_CD_NOT_INPUT_ERROR = "arrivalStoreCdNotInputError";
	/** バーコード 英数字と記号のみ */
	public static final String BARCODE_CHECK_ALPHABET_AND_NUMERIC_AND_SYMBOL_ONLY_ERROR = "barcodeCheckAlphabetAndNumericAndSymbolOnlyError";
	/** バーコードを入力して下さい。 */
	public static final String BARCODE_NOT_INPUT_ERROR = "barcodeNotInputError";
	/** バーコードは最大100文字以下を入力して下さい。 */
	public static final String BARCODE_CHECK_INPUT_MAX_ERROR = "barcodeCheckInputMaxError";
	/** バーコード名称は最大100文字以下を入力して下さい。 */
	public static final String BARCODE_NM_CHECK_INPUT_MAX_ERROR = "barcodeNmCheckInputMaxError";
	/** 備考は最大100文字以下を入力して下さい。 */
	public static final String COMMENT_CHECK_INPUT_MAX_ERROR = "commentCheckInputMaxError";
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
	/** エラー行番号：[0] , エラーメッセージ：[1] */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_DTL_INFORMATION = "bulkInputExecuteErrorCheckDtlInformation";
	/** エラー件数：[0]件 , 正常件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_INFORMATION = "bulkInputExecuteErrorCheckInformation";
	/** エラー件数：[商品マスタ][0]件 , [商品荷姿マスタ][1]件 , 正常件数：[商品マスタ][2]件 , [商品荷姿マスタ][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_PRODUCT_MASTER_INFORMATION = "bulkInputExecuteErrorCheckProductMasterInformation";
	/** エラー件数：[入荷予定][0]件 , [入荷予定明細][1]件 , 正常件数：[入荷予定][2]件 , [入荷予定明細][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_RECEIVE_PLAN_INFORMATION = "bulkInputExecuteErrorCheckReceivePlanInformation";
	/** エラー件数：[出荷指示][0]件 , [出荷指示明細][1]件 , 正常件数：[出荷指示][2]件 , [出荷指示明細][3]件 */
	public static final String BULK_INPUT_EXECUTE_ERROR_CHECK_SHIPPING_PLAN_INFORMATION = "bulkInputExecuteErrorCheckShippingPlanInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_INFORMATION = "bulkInputExecuteRegisterInformation";
	/** 登録件数：[商品マスタ][0]件 , [商品荷姿マスタ][1]件 , 更新件数：[商品マスタ][2]件 , [商品荷姿マスタ][3]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_PRODUCT_MASTER_INFORMATION = "bulkInputExecuteRegisterProductMasterInformation";
	/** 登録件数：[入荷予定][0]件 , [入荷予定明細][1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_RECEIVE_PLAN_INFORMATION = "bulkInputExecuteRegisterReceivePlanInformation";
	/** 登録件数：[出荷指示][0]件 , [出荷指示明細][1]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_SHIPPING_PLAN_INFORMATION = "bulkInputExecuteRegisterShippingPlanInformation";
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
	/** 配送コースマスタに登録されている運送業者は削除できません。 */
	public static final String CARRIER_CANNOT_DELETE_EXIST_DELIVERY_COURSE_MASTER_ERROR = "carrierCannotDeleteExistDeliveryCourseMasterError";
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
	/** 日次処理実行中のため、メインメニューに戻ります。 */
	public static final String DAILY_PROCESS_RUNNING_CONFIRM = "dailyProcessRunningConfirm";
	/** システム稼働日が不一致です。 */
	public static final String SYSTEM_DT_CHECK_ERROR = "systemDtCheckError";
	/** ログイン時のシステム管理日付と現在のシステム管理日付が一致しません。[/]画面を更新し、システム管理日付を取得します。 */
	public static final String SYSTEM_DT_MISMATCH_CONFIRM = "systemDtMismatchConfirm";
	/** EC受注データの保持期間がトランザクション保持期間より長く設定されています。 */
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
	public static final String DAILY_PROCESS_PARAMETER_DAILY_DATE_UPDATE = "dailyProcessParameterDailyDateUpdate";
	/** 取込み種別CD：[0] , システム管理日付：[1] , 受注保持期間：[2] , 対象日付：[3] */
	public static final String DAILY_PROCESS_PARAMETER_EC_DATA_DELETE = "dailyProcessParameterEcDataDelete";
	/** システム管理日付：[0] , 履歴データ保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_HIST_KEEP_DAYS = "dailyProcessParameterSystemDtHistKeepDays";
	/** システム管理日付：[0] , トランザクション保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS = "dailyProcessParameterSystemDtTranKeepDays";
	/** システム管理日付：[0] , トランザクション保持期間：[1] , 履歴データ保持期間：[2] , 対象日付：[3] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_TRAN_KEEP_DAYS_HIST_KEEP_DAYS = "dailyProcessParameterSystemDtTranKeepDaysHistKeepDays";
	/** センタCD：[0] , 荷主CD：[1] , 前回システム管理日付：[2] , システム管理日付：[3] , システム管理日付（翌稼働日）：[4] */
	public static final String DAILY_PROCESS_PARAMETER = "dailyProcessParameter";
	/** システム管理日付：[0] , システム管理日付（翌稼働日）：[1] */
	public static final String DAILY_PROCESS_PARAMETER_STOCK_DAILY = "dailyProcessParameterStockDaily";
	/** システム管理日付：[0] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT = "dailyProcessParameterSystemDt";
	/** システム管理日付：[0] , 未処理データ保持期間：[1] , 対象日付：[2] */
	public static final String DAILY_PROCESS_PARAMETER_SYSTEM_DT_UNPROCESS_KEEP_DAYS = "dailyProcessParameterSystemDtUnprocessKeepDays";
	/** 日次処理 */
	public static final String DAILY_PROCESS_PROGRAM_NAME = "dailyProcessProgramName";
	/** 前回システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_DAILY_DATE_UPDATE = "dailyProcessSectionNameDailyDateUpdate";
	/** EC受注データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EC_DATA_DELETE = "dailyProcessSectionNameEcDataDelete";
	/** EDIデータ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_EDI_DATA_DELETE = "dailyProcessSectionNameEdiDataDelete";
	/** シリアルNo.データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_SERIAL_NO_DELETE = "dailyProcessSectionNameSerialNoDelete";
	/** ワークデータ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_WORK_DELETE = "dailyProcessSectionNameWorkDelete";
	/** 履歴データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_DELETE = "dailyProcessSectionNameHistoryDataDelete";
	/** 履歴データ移動 */
	public static final String DAILY_PROCESS_SECTION_NAME_HISTORY_DATA_MOVE = "dailyProcessSectionNameHistoryDataMove";
	/** 在庫繰越 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_DAILY = "dailyProcessSectionNameStockDaily";
	/** 在庫日報復元 */
	public static final String DAILY_PROCESS_SECTION_NAME_STOCK_REPORT_RECOVERY = "dailyProcessSectionNameStockReportRecovery";
	/** システム管理日付更新 */
	public static final String DAILY_PROCESS_SECTION_NAME_SYSTEM_DATE_UPDATE = "dailyProcessSectionNameSystemDateUpdate";
	/** 未処理データ削除 */
	public static final String DAILY_PROCESS_SECTION_NAME_UNPROCESS_DATA_DELETE = "dailyProcessSectionNameUnprocessDataDelete";
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
	/** 同一顧客出荷指示No.、納品先CD内で処理区分が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PROCESS_TYPE_ERROR = "dataCheckClientShippingNoUnmatchProcessTypeError";
	/** 同一顧客出荷指示No.、納品先CD内で納品予定日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_PLAN_DT_ERROR = "dataCheckClientShippingNoUnmatchDelivPlanDtError";
	/** 同一顧客出荷指示No.、納品先CD内で作業日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_WORK_DT_ERROR = "dataCheckClientShippingNoUnmatchWorkDtError";
	/** 同一顧客出荷指示No.、納品先CD内で出荷日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_SHIPPING_DT_ERROR = "dataCheckClientShippingNoUnmatchShippingDtError";
	/** 同一顧客出荷指示No.、納品先CD内で配送コースが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIVERY_COURSE_ERROR = "dataCheckClientShippingNoUnmatchDeliveryCourseError";
	/** 同一顧客出荷指示No.、納品先CD内で納品指定日が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_DT_ERROR = "dataCheckClientShippingNoUnmatchDelivDtError";
	/** 同一顧客出荷指示No.、納品先CD内で納品時間帯が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TZ_ERROR = "dataCheckClientShippingNoUnmatchDelivTzError";
	/** 同一顧客出荷指示No.、納品先CD内で緊急フラグが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_EMERGENCY_FLG_ERROR = "dataCheckClientShippingNoUnmatchEmergencyFlgError";
	/** 同一顧客出荷指示No.、納品先CD内で届先CDが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_CD_ERROR = "dataCheckClientShippingNoUnmatchDelivCustomerCdError";
	/** 同一顧客出荷指示No.、納品先CD内で届先名称が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_CUSTOMER_NM_ERROR = "dataCheckClientShippingNoUnmatchDelivCustomerNmError";
	/** 同一顧客出荷指示No.、納品先CD内で届先郵便番号が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ZIP_CD_ERROR = "dataCheckClientShippingNoUnmatchDelivZipCdError";
	/** 同一顧客出荷指示No.、納品先CD内で届先住所が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_ERROR = "dataCheckClientShippingNoUnmatchDelivAddressError";
	/** 同一顧客出荷指示No.、納品先CD内で届先電話番号が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_TEL_NO_ERROR = "dataCheckClientShippingNoUnmatchDelivTelNoError";
	/** 同一顧客出荷指示No.、納品先CD内で届先住所補足が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_DELIV_ADDRESS_SUPPLY_ERROR = "dataCheckClientShippingNoUnmatchDelivAddressSupplyError";
	/** 同一顧客出荷指示No.、納品先CD内で合計金額が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_PRICE_ERROR = "dataCheckClientShippingNoUnmatchTotalPriceError";
	/** 同一顧客出荷指示No.、納品先CD内で合計消費税が不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_TOTAL_TAX_ERROR = "dataCheckClientShippingNoUnmatchTotalTaxError";
	/** 同一顧客出荷指示No.、納品先CD内で出庫作業メッセージが不一致です。 */
	public static final String DATA_CHECK_CLIENT_SHIPPING_NO_UNMATCH_PICKING_WORK_MESSAGE_ERROR = "dataCheckClientShippingNoUnmatchPickingWorkMessageError";
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
	/** 入力済です。選択した行を削除しますか？ */
	public static final String DELETE_ROW_ALREADY_INPUT_CONFIRMATION = "deleteRowAlreadyInputConfirmation";
	/** 複数行選択しています。選択した行を削除しますか？ */
	public static final String DELETE_ROW_MULTIPLE_CONFIRMATION = "deleteRowMultipleConfirmation";
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
	/** 届先CDが取引先マスタに存在しません。 */
	public static final String DELIV_CUSTOMER_CD_NOT_FOUND_ERROR = "delivCustomerCdNotFoundError";
	/** 届先CDを入力して下さい。 */
	public static final String DELIV_CUSTOMER_CD_NOT_INPUT_ERROR = "delivCustomerCdNotInputError";
	/** 届先名称は最大50文字以下を入力して下さい。 */
	public static final String DELIV_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "delivCustomerNmCheckInputMaxError";
	/** 納品指定日は出荷日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_SHIP_DATE_ERROR = "delivDateCannotChangeBeforeShipDateError";
	/** 納品指定日は作業日より前の日付に変更できません。 */
	public static final String DELIV_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR = "delivDateCannotChangeBeforeWorkDateError";
	/** 納品指定日が日付不正(形式:yyyyMMdd) */
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
	/** 出荷確定済の出荷指示に対して、配送コースは変更できません。 */
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
	/** 納品予定日が日付不正(形式:yyyyMMdd) */
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
	/** 預託CDが取引先マスタに存在しません。 */
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
	/** 明細が表示されていません。 */
	public static final String DETAIL_LINE_NOT_DISPLAY_ERROR = "detailLineNotDisplayError";
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
	/** 【在庫最小単位】商品総重量(g) は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_MIN_ERROR = "grossWeightCheckInputMinError";
	/** 【在庫最小単位】商品総重量(g)  数値のみ */
	public static final String GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "grossWeightCheckNumericOnlyError";
	/** 【在庫最小単位】商品総重量(g) は小数3桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "grossWeightCheckInputDecimalLengthError";
	/** 総重量(g)は最小0以上を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "grossWeightInputRequestMinIsZeroError";
	/** 【在庫最小単位】高さ(mm)は最小0以上を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_MIN_ERROR = "heightCheckInputMinError";
	/** 【在庫最小単位】高さ(mm)数値のみ */
	public static final String HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "heightCheckNumericOnlyError";
	/** 【在庫最小単位】高さ(mm)は小数3桁以内を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "heightCheckInputDecimalLengthError";
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
	/** 日付FromTo逆転 */
	public static final String INPUT_LIMIT_CHECK_REVERSAL_ERROR = "inputLimitCheckReversalError";
	/** 登録対象データが存在しません。 */
	public static final String INSERT_DATA_NOT_FOUND_INFORMATION = "insertDataNotFoundInformation";
	/** 対象の出庫作業No.／出荷梱包No.はケースのみなので、出荷検品できません。 */
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
	/** 指示数 数値のみ */
	public static final String INST_NUM_CHECK_NUMERIC_ONLY_ERROR = "instNumCheckNumericOnlyError";
	/** 指示数は1以上の数値を入力して下さい。 */
	public static final String INST_NUM_INPUT_REQUEST_MORE_THAN_ONE_ERROR = "instNumInputRequestMoreThanOneError";
	/** 指示数を入力して下さい。 */
	public static final String INST_NUM_NOT_INPUT_ERROR = "instNumNotInputError";
	/** 構成品の指示数が超過している為、解除できません。 */
	public static final String INSTRUCTION_REGISTER_OVERAGE_ERROR = "instructionRegisterOverageError";
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
	/** ソースCDは最大30文字以下を入力して下さい。 */
	public static final String JAN_CD_CHECK_INPUT_MAX_ERROR = "janCdCheckInputMaxError";
	/** ソースCDは英数字と記号で入力して下さい。 */
	public static final String JAN_CD_CHECK_NUMERIC_ONLY_ERROR = "janCdCheckNumericOnlyError";
	/** ソースCDが重複しています。 */
	public static final String JAN_CD_DUPLICATE_ERROR = "janCdDuplicateError";
	/** ソースCDの入力内容に誤りがあります。 */
	public static final String JAN_CODE_INPUT_ERROR = "janCodeInputError";
	/** 日本郵政着店マスタ取込（ワーク取込） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_INPUT_WORK_INFORMATION = "jpCarrierZipInputProgramNameInputWorkInformation";
	/** 日本郵政着店マスタ取込（データ移行） */
	public static final String JP_CARRIER_ZIP_INPUT_PROGRAM_NAME_REGISTER_INFORMATION = "jpCarrierZipInputProgramNameRegisterInformation";
	/** キー項目の変更はできません。 */
	public static final String KEY_ITEM_CANNOT_CHANGE_ERROR = "keyItemCannotChangeError";
	/** キーが重複しています。 */
	public static final String KEY_ITEM_DUPLICATE_ERROR = "keyItemDuplicateError";
	/** 【在庫最小単位】縦(mm)は最小0以上を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_MIN_ERROR = "lengthCheckInputMinError";
	/** 【在庫最小単位】縦(mm)数値のみ */
	public static final String LENGTH_CHECK_NUMERIC_ONLY_ERROR = "lengthCheckNumericOnlyError";
	/** 【在庫最小単位】縦(mm)は小数3桁以内を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "lengthCheckInputDecimalLengthError";
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
	/** 期限日が日付不正(形式：yyyyMMdd) */
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
	/** 行を選択して下さい。 */
	public static final String LINE_NOT_SELECT_ERROR = "lineNotSelectError";
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
	/** 最大格納数を入力して下さい。 */
	public static final String MAX_STORE_NUM_NOT_INPUT_ERROR = "maxStoreNumNotInputError";
	/** 最大格納数は整数7桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_INTEGER_ERROR = "maxStoreNumCheckInputIntegerError";
	/** 最大格納数 数値のみ */
	public static final String MAX_STORE_NUM_CHECK_NUMERIC_ONLY_ERROR = "maxStoreNumCheckNumericOnlyError";
	/** 最大格納数は最小0以上を入力して下さい。 */
	public static final String MAX_STORE_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "maxStoreNumInputRequestMinIsZeroError";
	/** 最大格納数商品荷姿CD 英数字のみ */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "maxStoreProductShapeCdCheckAlphabetAndNumericOnlyError";
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
	/** 【在庫最小単位】商品重量(g) は最小0以上を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_MIN_ERROR = "netWeightCheckInputMinError";
	/** 【在庫最小単位】商品重量(g) 数値のみ */
	public static final String NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "netWeightCheckNumericOnlyError";
	/** 【在庫最小単位】商品重量(g) は小数3桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "netWeightCheckInputDecimalLengthError";
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
	/** 同じ入庫ラベルNo.で、異なるロケーション、期限日、ロットが入力できません。 */
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
	/** 入庫ラベルNo.を再採番しました。入庫ラベルを印刷して下さい。 */
	public static final String ONS_NUM_RENUMBER_INFORMATION = "onsNumRenumberInformation";
	/** システム稼動時間外です！操作には十分注意して下さい。 */
	public static final String OPERATION_CAUTIONS_SYSTEM_ENDED_INFORMATION = "operationCautionsSystemEndedInformation";
	/** 出力枚数 数値のみ */
	public static final String OUTPUT_CNT_CHECK_NUMERIC_ONLY_ERROR = "outputCntCheckNumericOnlyError";
	/** 出力枚数を入力して下さい。 */
	public static final String OUTPUT_CNT_NOT_INPUT_ERROR = "outputCntNotInputError";
	/** 出力枚数は整数2桁以内を入力して下さい。 */
	public static final String OUTPUT_CNT_CHECK_INPUT_MAX_ERROR = "outputCntCheckInputMaxError";
	/** 出力枚数に小数は入力できません。 */
	public static final String OUTPUT_CNT_CHECK_INPUT_DECIMAL_ERROR = "outputCntCheckInputDecimalError";
	/** 出力枚数は最小1以上を入力して下さい。 */
	public static final String OUTPUT_CNT_INPUT_REQUEST_MIN_IS_ONE_ERROR = "outputCntInputRequestMinIsOneError";
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
	/** 梱包明細修正が正常終了しました。個口数に変更があります。送り状データの再出力および送り状、積込リストの再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_INFORMATION = "packingUpdateCompletePackingCountChangedInformation";
	/** 梱包明細修正が正常終了しました。個口数に変更があります。送り状データの再出力および送り状、積込リストの再発行をして下さい。また、追加した梱包の荷札を発行して下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_ADD_PACKING_INFORMATION = "packingUpdateCompletePackingCountChangedAddPackingInformation";
	/** 梱包明細修正が正常終了しました。個口数または届先情報に変更があります。送り状データの再出力および荷札、送り状、積込リストの再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_PACKING_COUNT_CHANGED_REPRINT_TAG_INFORMATION = "packingUpdateCompletePackingCountChangedReprintTagInformation";
	/** 梱包明細修正が正常終了しました。出荷梱包No.が変更されています。荷札の再発行をして下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_REPRINT_TAG_INFORMATION = "packingUpdateCompleteReprintTagInformation";
	/** 梱包明細修正が正常終了しました。追加した梱包の荷札を発行して下さい。 */
	public static final String PACKING_UPDATE_COMPLETE_ADD_PACKING_INFORMATION = "packingUpdateCompleteAddPackingInformation";
	/** 投入数に小数は入力できません。 */
	public static final String PACKING_QTY_CHECK_INPUT_DECIMAL_ERROR = "packingQtyCheckInputDecimalError";
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
	/** ピッキング順序 数値のみ */
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
	/** 予定期限日が日付不正(形式:yyyyMMdd) */
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
	/** 処理を行いますか？ */
	public static final String PROCESS_EXECUTE_CONFIRMATION = "processExecuteConfirmation";
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
	/** 商品ラベルの発行に失敗しました。 */
	public static final String PRODUCT_LABEL_PRINT_ERROR = "productLabelPrintError";
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
	/** 商品荷姿([0])はロケーション([1])の補充商品で使用しているため削除できません。 */
	public static final String PRODUCT_SHAPE_CANNOT_DELETE_USE_LOCATION_ERROR = "productShapeCannotDeleteUseLocationError";
	/** 数量を入力して下さい。 */
	public static final String QTY_NOT_INPUT_ERROR = "qtyNotInputError";
	/** 入荷済を選択して下さい。 */
	public static final String RECEIVE_COMPLETED_NOT_SELECT_ERROR = "receiveCompletedNotSelectError";
	/** 入荷納品ステータスを選択して下さい。 */
	public static final String RECEIVE_DELIVERY_STATUS_NOT_SELECT_ERROR = "receiveDeliveryStatusNotSelectError";
	/** 入荷する明細行を選択して下さい。 */
	public static final String RECEIVE_DETAIL_LINE_NOT_SELECT_ERROR = "receiveDetailLineNotSelectError";
	/** 未入荷またはエラー以外の入荷予定はエラーチェックできません。 */
	public static final String RECEIVE_ERROR_CHECK_START_ERROR = "receiveErrorCheckStartError";
	/** 入荷入力済です。 */
	public static final String RECEIVE_INPUT_FOUND_COMPLETED_INFORMATION = "receiveInputFoundCompletedInformation";
	/** この商品は期限日管理対象外です。予定期限日は入力しないで下さい。 */
	public static final String RECEIVE_LIMIT_DT_MANAG_FLG_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAGEMENT_PRODUCT_ERROR = "receiveLimitDtManagFlgCannotInputExceptLimitDtManagementProductError";
	/** 入荷期限日数に小数は入力できません。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_DECIMAL_ERROR = "receiveLimitNumCheckInputDecimalError";
	/** 入荷期限日数は整数5桁以内を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "receiveLimitNumCheckInputMaxError";
	/** 入荷期限日数 数値のみ */
	public static final String RECEIVE_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "receiveLimitNumCheckNumericOnlyError";
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
	/** 入荷予定日が日付不正(形式:yyyyMMdd) */
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
	/** 入荷日が変更されています。以前に入荷した商品の入荷日も変更されますが、登録して宜しいですか？ */
	public static final String RECEIVE_DT_UPDATE_CONFIRMATION = "receiveDtUpdateConfirmation";
	/** エラーの入荷予定に対し、実績は登録できません。 */
	public static final String RECEIVE_RESULT_INSERT_START_ERROR = "receiveResultInsertStartError";
	/** 予定なしで登録された商品は検品できません。 */
	public static final String RECEIVE_INSPECTION_CANNOT_EXECUTE_NOT_FOUND_PLAN_DATA_ERROR = "receiveInspectionCannotExecuteNotFoundPlanDataError";
	/** 入庫推奨ロケーションがロケーションマスタに存在しません。 */
	public static final String RECOMMENDED_LOCATION_NOT_FOUND_IN_LOCATION_MASTER_ERROR = "recommendedLocationNotFoundInLocationMasterError";
	/** 推奨倉庫が倉庫マスタに存在しません。 */
	public static final String RECOMMENDED_WAREHOUSE_NOT_FOUND_IN_WAREHOUSE_MASTER_ERROR = "recommendedWarehouseNotFoundInWarehouseMasterError";
	/** 登録済の行は削除は出来ません。 */
	public static final String REGISTERED_LINE_CANNOT_DELETE_ERROR = "registeredLineCannotDeleteError";
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
	/** 補充指示が正常に終了しました。[0]にて確認して下さい。 */
	public static final String REPLENISH_INST_COMPLETE_INFORMATION = "replenishInstCompleteInformation";
	/** <a href="#wms/stock/StockMoveList?mode=3&amp;centerCd=[0]&amp;clientCd=[1]&amp;processTypeCd=32"><b><u>在庫移動一覧</b></u></a> */
	public static final String STOCK_MOVE_LIST_REPLENISH_LINK = "stockMoveListReplenishLink";
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
	/** 補充点 数値のみ */
	public static final String REPLENISH_P_NUM_CHECK_NUMERIC_ONLY_ERROR = "replenishPNumCheckNumericOnlyError";
	/** 補充点荷姿CD 英数字のみ */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "replenishPProductShapeCdCheckAlphabetAndNumericOnlyError";
	/** 補充点荷姿CDは荷姿マスタに存在しません。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_FOUND_ERROR = "replenishPProductShapeCdNotFoundError";
	/** 補充点荷姿CDを入力して下さい。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_NOT_INPUT_ERROR = "replenishPProductShapeCdNotInputError";
	/** 補充商品CD 英数字と記号のみ */
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
	/** [0]：[1] */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL = "sagawaApiSystemCannotExecuteSendErrorDetail";
	/** [0]：[1] (出庫作業No.：[2]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_PICKING_WORK_NO = "sagawaApiSystemCannotExecuteSendErrorDetailWithPickingWorkNo";
	/** [0]：[1] (貨物追跡No.：[2]) */
	public static final String SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_CARRIER_TRACE_NUM = "sagawaApiSystemCannotExecuteSendErrorDetailWithCarrierTraceNum";
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
	/** 総重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeGrossWeightCheckInputIntegerError";
	/** 総重量(g) 数値のみ */
	public static final String SHAPE_GROSS_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeGrossWeightCheckNumericOnlyError";
	/** 総重量(g) は小数3桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "grossWeightInputDecimalLengthError";
	/** 高さ(mm) 数値のみ */
	public static final String SHAPE_HEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeHeightCheckNumericOnlyError";
	/** 高(mm)は小数3桁以内を入力して下さい。 */
	public static final String HEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "heightInputDecimalLengthError";
	/** 縦(mm) 数値のみ */
	public static final String SHAPE_LENGTH_CHECK_NUMERIC_ONLY_ERROR = "shapeLengthCheckNumericOnlyError";
	/** 縦(mm)は小数3桁以内を入力して下さい。 */
	public static final String LENGTH_INPUT_DECIMAL_LENGTH_ERROR = "lengthInputDecimalLengthError";
	/** 商品重量(g)は整数7桁以内を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_CHECK_INPUT_INTEGER_ERROR = "shapeNetWeightCheckInputIntegerError";
	/** 商品重量(g) 数値のみ */
	public static final String SHAPE_NET_WEIGHT_CHECK_NUMERIC_ONLY_ERROR = "shapeNetWeightCheckNumericOnlyError";
	/** 商品重量(g) は小数3桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_DECIMAL_LENGTH_ERROR = "netWeightInputDecimalLengthError";
	/** 荷姿マスタに存在しません。 */
	public static final String SHAPE_NOT_FOUND_ERROR = "shapeNotFoundError";
	/** 容積(mm3)は小数3桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_INPUT_DECIMAL_LENGTH_ERROR = "shapeVolumeInputDecimalLengthError";
	/** 容積(mm3)は最小0以上を入力して下さい。 */
	public static final String SHAPE_VOLUME_CHECK_MIN_IS_ZERO_ERROR = "shapeVolumeCheckMinIsZeroError";
	/** 容積(mm3) 数値のみ */
	public static final String SHAPE_VOLUME_CHECK_NUMERIC_ONLY_ERROR = "shapeVolumeCheckNumericOnlyError";
	/** 横(mm) 数値のみ */
	public static final String SHAPE_WIDTH_CHECK_NUMERIC_ONLY_ERROR = "shapeWidthCheckNumericOnlyError";
	/** 横(mm)は小数3桁以内を入力して下さい。 */
	public static final String WIDTH_INPUT_DECIMAL_LENGTH_ERROR = "widthInputDecimalLengthError";
	/** 出荷確定以外の出庫指示に対して、出荷確定の解除はできません。 */
	public static final String SHIP_COMPLETE_CANCEL_START_ERROR = "shipCompleteCancelStartError";
	/** 入荷作業が既に始まっている為、出荷確定解除は出来ません。(出庫作業No.：[0]) */
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
	/** 出庫指示処理は正常終了しました。緊急補充が発生していますので[0]にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_REPLENISH_INFORMATION = "shipInstructeCompleteReplenishInformation";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので商品別出荷一覧にて確認して下さい。[/]緊急補充が発生していますので[0]にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_AND_REPLENISH_INFORMATION = "shipInstructeCompleteStockOutAndReplenishInformation";
	/** <a href="#wms/stock/StockMoveList?mode=3&amp;centerCd=[0]&amp;clientCd=[1]&amp;processTypeCd=33"><b><u>在庫移動一覧</b></u></a> */
	public static final String STOCK_MOVE_LIST_EMERGENCY_REPLENISH_LINK = "stockMoveListEmergencyReplenishLink";
	/** 出庫指示処理は正常終了しました。欠品が発生していますので商品別出荷一覧にて確認して下さい。 */
	public static final String SHIP_INSTRUCTE_COMPLETE_STOCK_OUT_INFORMATION = "shipInstructeCompleteStockOutInformation";
	/** ピッキングした在庫が別ロケーションに移動されています。在庫を確認して下さい。 */
	public static final String SHIP_INSTRUCTED_CANCEL_FORCED_MOVE_INFORMATION = "shipInstructedCancelForcedMoveInformation";
	/** 在庫数が不足している為、登録できません。 */
	public static final String SHIP_INSTRUCTED_CANNOT_REGISTER_STOCK_SHORTAGE_ERROR = "shipInstructedCannotRegisterStockShortageError";
	/** 出庫作業No.単位で指示日を設定しますが宜しいですか？ */
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
	/** 出荷日が日付不正(形式:yyyyMMdd) */
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
	/** 出荷期限日数は整数5桁以内を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_MAX_ERROR = "shippingLimitNumCheckInputMaxError";
	/** 出荷期限日数 数値のみ */
	public static final String SHIPPING_LIMIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "shippingLimitNumCheckNumericOnlyError";
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
	/** 同一預託・在庫区分・ロケーション・ロット・期限日を入力時は、入庫日または入庫ラベルNo.を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_DT_OR_STORE_NO_ERROR = "shippingUpdateSameStockNotInputStoreDtOrStoreNoError";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日・入庫ラベルNo.を入力時は、入庫日を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_DT_ERROR = "shippingUpdateSameStockNotInputStoreDtError";
	/** 同一預託・在庫区分・ロケーション・ロット・期限日・入庫日を入力時は、入庫ラベルNo.を入力して下さい。 */
	public static final String SHIPPING_UPDATE_SAME_STOCK_NOT_INPUT_STORE_NO_ERROR = "shippingUpdateSameStockNotInputStoreNoError";
	/** 出荷実績訂正が完了しました。[0] */
	public static final String SHIPPING_UPDATE_COMPLETE = "shippingUpdateComplete";
	/** 梱包数に変更があります。梱包明細修正にて梱包内容を修正して下さい。 */
	public static final String SHIPPING_UPDATE_COMPLETE_CHANGE_PACKING = "shippingUpdateCompleteChangePacking";
	/** 次の帳票またはデータを再出力して下さい。([0]) */
	public static final String SHIPPING_UPDATE_COMPLETE_REPRINT_REPORT = "shippingUpdateCompleteReprintReport";
	/** 納品明細書 */
	public static final String REPORT_NAME_PACKING = "reportNamePacking";
	/** 送り状 */
	public static final String REPORT_NAME_SLIP = "reportNameSlip";
	/** 送り状データ */
	public static final String REPORT_NAME_INVOICE = "reportNameInvoice";
	/** 積込リスト */
	public static final String REPORT_NAME_STW = "reportNameStw";
	/** 荷札 */
	public static final String REPORT_NAME_TAG = "reportNameTag";
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
	/** 入力された出庫作業No.は既に確定済です。 */
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
	/** 移動、セット品、定期補充、緊急補充データ以外に対して、処理はできません。 */
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
	/** 作業中または引当済の在庫が存在しています。棚卸データを作成して宜しいですか？ */
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
	/** 入荷データまたは出荷データで使用されているため処理できません。 */
	public static final String TRANSACTION_DATA_FOUND_ERROR = "transactionDataFoundError";
	/** 在庫更新で同じ入庫ラベルNo.、ロケーションの現品が存在しています、在庫情報を確認して下さい。 */
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
	/** 入数 数値のみ */
	public static final String UNIT_NUM_CHECK_NUMERIC_ONLY_ERROR = "unitNumCheckNumericOnlyError";
	/** 入数は最小1以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ONE_ERROR = "unitNumInputRequestMinIsOneError";
	/** 入数は最小0以上を入力して下さい。 */
	public static final String UNIT_NUM_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "unitNumInputRequestMinIsZeroError";
	/** 入数を入力して下さい。 */
	public static final String UNIT_NUM_NOT_INPUT_ERROR = "unitNumNotInputError";
	/** 最小荷姿の入数には、0を入力してください。 */
	public static final String UNIT_NUM_INPUT_REQUEST_ONLY_ZERO_ERROR = "unitNumInputRequestOnlyZeroError";
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
	/** 【在庫最小単位】容積(mm3) は最小0以上を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_MIN_ERROR = "volumeCheckInputMinError";
	/** 【在庫最小単位】容積(mm3) 数値のみ */
	public static final String VOLUME_CHECK_NUMERIC_ONLY_ERROR = "volumeCheckNumericOnlyError";
	/** 【在庫最小単位】容積(mm3) は小数3桁以内を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "volumeCheckInputDecimalLengthError";
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
	/** 荷札発行に失敗しました。カスタマーIDが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_CUSTOMER_ID_NOT_FOUND_ERROR = "webApiCustomerIdNotFoundError";
	/** 荷札発行に失敗しました。送り状コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_OKURI_CODE_NOT_FOUND_ERROR = "webApiOkuriCodeNotFoundError";
	/** 荷札発行に失敗しました。WebAPIリクエストURLが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_REQUEST_URL_NOT_FOUND_ERROR = "webApiRequestUrlNotFoundError";
	/** 荷札発行に失敗しました。お客様コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_SLIP_CUSTOMER_CD_NOT_FOUND_ERROR = "webApiSlipCustomerCdNotFoundError";
	/** 荷札発行に失敗しました。届先住所が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_ADDRESS_NOT_FOUND_ERROR = "webApiDelivAddressNotFoundError";
	/** 荷札発行に失敗しました。届先名称が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_CUSTOMER_NM_NOT_FOUND_ERROR = "webApiDelivCustomerNmNotFoundError";
	/** 荷札発行に失敗しました。届先郵便番号が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_ZIP_CD_NOT_FOUND_ERROR = "webApiDelivZipCdNotFoundError";
	/** 荷札発行に失敗しました。届先電話番号が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_DELIV_TEL_NO_NOT_FOUND_ERROR = "webApiDelivTelNoNotFoundError";
	/** 荷札発行に失敗しました。便種コードが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_BINSYU_CODE_NOT_FOUND_ERROR = "webApiBinsyuCodeNotFoundError";
	/** 荷札発行に失敗しました。代引フラグが未設定です。(出庫作業No.：[0]) */
	public static final String WEB_API_DAIBIKI_FLG_NOT_FOUND_ERROR = "webApiDaibikiFlgNotFoundError";
	/** 荷札発行に失敗しました。代引金額が未入力です。(出庫作業No.：[0]) */
	public static final String WEB_API_COD_NOT_FOUND_ERROR = "webApiCodNotFoundError";
	/** 【在庫最小単位】横(mm)は最小0以上を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_MIN_ERROR = "widthCheckInputMinError";
	/** 【在庫最小単位】横(mm)数値のみ */
	public static final String WIDTH_CHECK_NUMERIC_ONLY_ERROR = "widthCheckNumericOnlyError";
	/** 【在庫最小単位】横(mm)は小数3桁以内を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "widthCheckInputDecimalLengthError";
	/** 横(mm)は最小0以上を入力して下さい。 */
	public static final String WIDTH_INPUT_REQUEST_MIN_IS_ZERO_ERROR = "widthInputRequestMinIsZeroError";
	/** WMS基盤エラー */
	public static final String WMS_BASE_ERROR = "wmsBaseError";
	/** 作業日は出荷日より後の日付に変更できません。 */
	public static final String WORK_DATE_CANNOT_CHANGE_BEFORE_SHIO_DATE_ERROR = "workDateCannotChangeBeforeShioDateError";
	/** 出荷確定またはキャンセル済の出荷指示に対して、作業日／出荷日を変更することはできません。 */
	public static final String WORK_DAY_SHIPPING_DAY_CHANGE_START_ERROR = "workDayShippingDayChangeStartError";
	/** 作業日が日付不正(形式:yyyyMMdd) */
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
	/** 郵便番号が存在しません。 */
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
	/** 未出荷またはエラー以外の出荷指示に対して、郵便番号を変更することはできません。 */
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
	/** 出荷情報更新 */
	public static final String SHIPPING_INFO_UPDATE_CONDITION = "shippingInfoUpdateCondition";
	/** WMS入荷伝票No.が空白以外の行を選択して下さい。 */
	public static final String RECEIVE_SLIP_NO_NOT_SELECT_ERROR = "receiveSlipNoNotSelectError";
	/** 入荷日が空白以外の行を選択して下さい。 */
	public static final String RECEIVE_DT_NOT_SELECT_ERROR = "receiveDtNotSelectError";
	/** 出庫作業No./出荷梱包No.が空白以外の行を選択して下さい。 */
	public static final String PICKING_WORK_NO_NOT_SELECT_ERROR = "pickingWorkNoNotSelectError";
	/** 出荷日が空白以外の行を選択して下さい。 */
	public static final String SHIPPING_DT_NOT_SELECT_ERROR = "shippingDtNotSelectError";
	/** 納品先CDが取引先マスタに存在しません。 */
	public static final String SUPPLY_CUSTOMER_CD_NOT_FOUND_ERROR = "supplyCustomerCdNotFoundError";
	/** 出庫作業No./出荷梱包No.が存在しません。 */
	public static final String PICKING_WORK_NO_NOT_FOUND_ERROR = "pickingWorkNoNotFoundError";
	/** 登録件数：[0]件 , 更新件数：[1]件 , 削除件数：[2]件 */
	public static final String BULK_INPUT_EXECUTE_REGISTER_DELETE_INFORMATION = "bulkInputExecuteRegisterDeleteInformation";
	/** 処理区分を入力して下さい。 */
	public static final String PROCESS_TYPE_NOT_INPUT_ERROR = "processTypeNotInputError";
	/** シリアルNo.を入力して下さい。 */
	public static final String SERIAL_NO_NOT_INPUT_ERROR = "serialNoNotInputError";
	/** シリアルNo.英数字と-のみ */
	public static final String SERIAL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "serialNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** シリアルNo.は最大30文字以下を入力して下さい。 */
	public static final String SERIAL_NO_CHECK_INPUT_MAX_ERROR = "serialNoCheckInputMaxError";
	/** 商品CDとシリアルNo.が重複しています。 */
	public static final String PRODUCT_CD_AND_SERIAL_NO_DUPLICATE_ERROR = "productCdAndSerialNoDuplicateError";
	/** 仕入先名称は最大50文字以下を入力して下さい。 */
	public static final String SUPPLIER_NM_CHECK_INPUT_MAX_ERROR = "supplierNmCheckInputMaxError";
	/** WMS入荷伝票No.英数字と-のみ */
	public static final String RECEIVE_SLIP_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "receiveSlipNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** WMS入荷伝票No.は最大13文字以下を入力して下さい。 */
	public static final String RECEIVE_SLIP_NO_CHECK_INPUT_MAX_ERROR = "receiveSlipNoCheckInputMaxError";
	/** 納品先名称は最大50文字以下を入力して下さい。 */
	public static final String SUPPLY_CUSTOMER_NM_CHECK_INPUT_MAX_ERROR = "supplyCustomerNmCheckInputMaxError";
	/** 出庫作業No./出荷梱包No.英数字と-のみ */
	public static final String PICKING_WORK_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "pickingWorkNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 出庫作業No./出荷梱包No.は最大13文字以下を入力して下さい。 */
	public static final String PICKING_WORK_NO_CHECK_INPUT_MAX_ERROR = "pickingWorkNoCheckInputMaxError";
	/** 仕入先CDが取引先マスタに存在しません。 */
	public static final String SUPPLIER_CD_NOT_FOUND_ERROR = "supplierCdNotFoundError";
	/** WMS入荷伝票No.が存在しません。 */
	public static final String RECEIVE_SLIP_NO_NOT_FOUND_ERROR = "receiveSlipNoNotFoundError";
	/** シリアルNo.が存在しません。 */
	public static final String SERIAL_NO_NOT_FOUND_ERROR = "serialNoNotFoundError";
	/** シリアルNo.([0])は異なる伝票No.([1])で登録済です。 */
	public static final String SERIAL_NO_ALREADY_REGISTERED_ERROR = "serialNoAlreadyRegisteredError";
	/** シリアルNo.([0])は異なる出庫作業No./出荷梱包No.([1])で登録済です。 */
	public static final String SERIAL_NO_ALREADY_REGISTERED_ERROR_SHIPPING = "serialNoAlreadyRegisteredErrorShipping";
	/** 数量またはシリアルNo.のどちらかを入力してください。 */
	public static final String SERIAL_NO_RANGE_INPUT_ERROR = "serialNoRangeInputError";
	/** シリアルNo.の範囲入力が不正です。 */
	public static final String SERIAL_NO_RANGE_FORMAT_ERROR = "serialNoRangeFormatError";
	/** 出庫数を超過するためシリアルNo.を登録できません。 */
	public static final String SERIAL_NO_ORVER_SHIPPING_NUM_ERROR = "serialNoOrverShippingNumError";
	/** 入荷数を超過するためシリアルNo.を登録できません。 */
	public static final String SERIAL_NO_ORVER_RECEIVE_NUM_ERROR = "serialNoOrverReceiveNumError";
	/** センタが変更されました。再検索を行ってください。 */
	public static final String RESEARCH_BY_CENTER_CHANGE_WARN = "researchByCenterChangeWarn";
	/** 他でピッキング中です。 */
	public static final String OTHER_SHIPPING_PICKING = "otherShippingPicking";
	/** 他で出荷検品中です。 */
	public static final String OTHER_SHIPPING_PACKING = "otherShippingPacking";
	/** すべてピッキング済です。 */
	public static final String PICKING_ALL_COMPLETED_ERROR = "pickingAllCompletedError";
	/** 出庫指示済またはピッキング中以外の出荷データはピッキングできません。 */
	public static final String PICKING_START_STATUS_ERROR = "pickingStartStatusError";
	/** ピッキング中以外の出荷データはピッキング解除できません。 */
	public static final String PICKING_CANCEL_STATUS_ERROR = "pickingCancelStatusError";
	/** 対象のケースピッキングNo.は出荷確定済のデータが含まれています。(出庫作業No.：[0]) */
	public static final String CASE_PICKING_NO_EXISTS_FIXED_DATA_ERROR = "casePickingNoExistsFixedDataError";
	/** 明細 */
	public static final String DETAIL_TITLE = "detailTitle";
	/** 前 */
	public static final String DETAIL_PREVIOUS = "detailPrevious";
	/** 次 */
	public static final String DETAIL_NEXT = "detailNext";
	/** 合計件数 */
	public static final String SEARCH_RESULT_TITLE = "searchResultTitle";
	/** 戻る */
	public static final String BACK = "back";
	/** 閉じる */
	public static final String CANCEL = "cancel";
	/** 荷札発行に失敗しました。PCで出力し直して下さい。検品は終了しています。 */
	public static final String CASE_PICKING_AUTO_TAG_PRINT_FAILED_WARN = "casePickingAutoTagPrintFailedWarn";
	/** 月 */
	public static final String SD_CALENDAR_MON = "sdCalendarMon";
	/** 火 */
	public static final String SD_CALENDAR_TUE = "sdCalendarTue";
	/** 水 */
	public static final String SD_CALENDAR_WED = "sdCalendarWed";
	/** 木 */
	public static final String SD_CALENDAR_THU = "sdCalendarThu";
	/** 金 */
	public static final String SD_CALENDAR_FRI = "sdCalendarFri";
	/** 土 */
	public static final String SD_CALENDAR_SAT = "sdCalendarSat";
	/** 日 */
	public static final String SD_CALENDAR_SUN = "sdCalendarSun";
	/** 1月 */
	public static final String SD_CALENDAR_JAN = "sdCalendarJan";
	/** 2月 */
	public static final String SD_CALENDAR_FEB = "sdCalendarFeb";
	/** 3月 */
	public static final String SD_CALENDAR_MAR = "sdCalendarMar";
	/** 4月 */
	public static final String SD_CALENDAR_APR = "sdCalendarApr";
	/** 5月 */
	public static final String SD_CALENDAR_MAY = "sdCalendarMay";
	/** 6月 */
	public static final String SD_CALENDAR_JUN = "sdCalendarJun";
	/** 7月 */
	public static final String SD_CALENDAR_JUL = "sdCalendarJul";
	/** 8月 */
	public static final String SD_CALENDAR_AUG = "sdCalendarAug";
	/** 9月 */
	public static final String SD_CALENDAR_SEP = "sdCalendarSep";
	/** 10月 */
	public static final String SD_CALENDAR_OCT = "sdCalendarOct";
	/** 11月 */
	public static final String SD_CALENDAR_NOV = "sdCalendarNov";
	/** 12月 */
	public static final String SD_CALENDAR_DEC = "sdCalendarDec";
	/** 仕入先CDが入荷データと不一致です。 */
	public static final String SUPPLIER_CD_UNMATCH_RECEIVE_DATA_ERROR = "supplierCdUnmatchReceiveDataError";
	/** 納品先CDが出荷データと不一致です。 */
	public static final String SUPPLIER_CD_UNMATCH_SHIPPING_DATA_ERROR = "supplierCdUnmatchShippingDataError";
	/** 出荷日が出荷データと不一致です。 */
	public static final String SHIPPING_DT_UNMATCH_SHIPPING_DATA_ERROR = "shippingDtUnmatchShippingDataError";
	/** 商品CDは入荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR = "productCdNotFoundReceiveDataError";
	/** 商品CD([0])は入荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_RECEIVE_DATA_ERROR_DISP_CD = "productCdNotFoundReceiveDataErrorDispCd";
	/** 商品CDは出荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR = "productCdNotFoundShippingDataError";
	/** 商品CD([0])は出荷データに存在しません。 */
	public static final String PRODUCT_CD_NOT_FOUND_SHIPPING_DATA_ERROR_DISP_CD = "productCdNotFoundShippingDataErrorDispCd";
	/** 入力した期限日が入荷限界日を過ぎています。 */
	public static final String INPUT_LIMIT_DATE_OVER_ERROR = "inputLimitDateOverError";
	/** 選択したセンタの使用権限が付与されていません。 */
	public static final String CENTER_CANNOT_USE_NO_PERMISSION_ERROR = "centerCannotUseNoPermissionError";
	/** 処理件数が[0]件を超えています。内容を見直し再度処理を実行して下さい。 */
	public static final String OVER_SAFETY_SIZE_TO_H_T_ERROR = "overSafetySizeToHTError";
	/** 親商品の在庫が存在しません。 */
	public static final String PARENT_STOCK_NOT_FOUND_ERROR = "parentStockNotFoundError";
	/** 構成品の在庫が存在しません。 */
	public static final String STRUCTURE_STOCK_NOT_FOUND_ERROR = "structureStockNotFoundError";
	/** 検品ラベルの発行に失敗しました。ピッキングは終了しています。 */
	public static final String INSPECTION_LABEL_AUTO_PRINT_FAILED_WARN = "inspectionLabelAutoPrintFailedWarn";
	/** 商品ラベルの発行に失敗しました。ピッキングは終了しています。 */
	public static final String PRODUCT_LABEL_AUTO_PRINT_FAILED_WARN = "productLabelAutoPrintFailedWarn";
	/** 業務CDが重複しています。 */
	public static final String BIZ_CD_DUPLICATE_ERROR = "bizCdDuplicateError";
	/** 棚卸データ削除終了 */
	public static final String STOCK_COUNT_DELETE_COMPLETE_INFORMATION = "stockCountDeleteCompleteInformation";
	/** 出荷確定済の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String SHIPPING_CONFIRM_ERROR = "shippingConfirmError";
	/** 入庫ラベルの発行に失敗しました。 */
	public static final String STORE_LABEL_PRINT_ERROR = "storeLabelPrintError";
	/** コピー元とコピー先に同一のセンタが指定されています。 */
	public static final String COPY_CANNNOT_INPUT_SAME_TRANSIT_CENTER_ERROR = "copyCannnotInputSameTransitCenterError";
	/** 作業中の出庫指示に対して、梱包明細を修正することはできません。 */
	public static final String WORKING_PACKING_ERROR = "workingPackingError";
	/** 出荷検品が完了しました。出庫指示時と梱包数が異なりますので、荷札を再出力してください。 */
	public static final String SHIPPING_INSPECTION_COMPLETE_TAG_LABEL_REISSUE_INFORMATION = "shippingInspectionCompleteTagLabelReissueInformation";
	/** 現在値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String PRESENT_NUMBER_LENGTH_OVER_ERROR = "presentNumberLengthOverError";
	/** 最小値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String MIN_NUMBER_LENGTH_OVER_ERROR = "minNumberLengthOverError";
	/** 最大値の桁数が桁数欄に入力した値の範囲になるよう入力してください。 */
	public static final String MAX_NUMBER_LENGTH_OVER_ERROR = "maxNumberLengthOverError";
	/** 最小値には最大値未満の値を入力してください。 */
	public static final String MAX_NUMBER_SMALLER_THAN_MIN_NUMBER_ERROR = "maxNumberSmallerThanMinNumberError";
	/** 現在値には最大値よりも小さい値を入力してください。 */
	public static final String PRESENT_NUMBER_EXCEEDS_MAX_NUMBER_ERROR = "presentNumberExceedsMaxNumberError";
	/** 入庫ロケーション未入力のため、処理できません。 */
	public static final String CANNOT_STOCK_MOVE_ERROR = "cannotStockMoveError";
	/** 既に棚卸入力されたデータがあります。データを削除してよろしいですか？ */
	public static final String STOCK_COUNT_DELETE_EXECUTE_DELETE_CONFIRMATION = "stockCountDeleteExecuteDeleteConfirmation";
	/** 作業中または引当済の在庫が存在しています。棚卸データを削除して宜しいですか？ */
	public static final String STOCK_COUNT_DELETE_COMPLETE_CONTAINED_INTRANSIT_INFORMATION = "stockCountDeleteCompleteContainedIntransitInformation";
	/** 予備項目１（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR1_CHECK_INPUT_MAX_ERROR = "spareStr1CheckInputMaxError";
	/** 予備項目２（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR2_CHECK_INPUT_MAX_ERROR = "spareStr2CheckInputMaxError";
	/** 予備項目３（文字列）は最大200文字以下で入力してください。 */
	public static final String SPARE_STR3_CHECK_INPUT_MAX_ERROR = "spareStr3CheckInputMaxError";
	/** 予備項目１（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM1_CHECK_INPUT_MIN_ERROR = "spareNum1CheckInputMinError";
	/** 予備項目１（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM1_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum1CheckInputDecimalMaxError";
	/** 予備項目１（数値） 数値のみ */
	public static final String SPARE_NUM1_CHECK_NUMERIC_ONLY_ERROR = "spareNum1CheckNumericOnlyError";
	/** 予備項目２（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM2_CHECK_INPUT_MIN_ERROR = "spareNum2CheckInputMinError";
	/** 予備項目２（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM2_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum2CheckInputDecimalMaxError";
	/** 予備項目２（数値） 数値のみ */
	public static final String SPARE_NUM2_CHECK_NUMERIC_ONLY_ERROR = "spareNum2CheckNumericOnlyError";
	/** 予備項目３（数値）は0以上を入力してください。 */
	public static final String SPARE_NUM3_CHECK_INPUT_MIN_ERROR = "spareNum3CheckInputMinError";
	/** 予備項目３（数値）は小数3桁以内で入力してください。 */
	public static final String SPARE_NUM3_CHECK_INPUT_DECIMAL_MAX_ERROR = "spareNum3CheckInputDecimalMaxError";
	/** 予備項目３（数値） 数値のみ */
	public static final String SPARE_NUM3_CHECK_NUMERIC_ONLY_ERROR = "spareNum3CheckNumericOnlyError";
	/** 合計金額は9999999以下を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_MAX_ERROR = "totalPriceCheckInputMaxError";
	/** 合計金額は0以上を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_MIN_ERROR = "totalPriceCheckInputMinError";
	/** 合計金額は小数3桁以内を入力して下さい。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_DECIMAL_ERROR = "totalPriceCheckInputDecimalError";
	/** 合計金額 数値のみ */
	public static final String TOTAL_PRICE_CHECK_NUMERIC_ONLY_ERROR = "totalPriceCheckNumericOnlyError";
	/** 合計金額は0.001以上を入力してください。 */
	public static final String TOTAL_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "totalPriceCheckInputDecimalMinError";
	/** 合計消費税は9999999以下を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_MAX_ERROR = "totalTaxCheckInputMaxError";
	/** 合計消費税は0以上を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_MIN_ERROR = "totalTaxCheckInputMinError";
	/** 合計消費税は小数3桁以内を入力して下さい。 */
	public static final String TOTAL_TAX_CHECK_INPUT_DECIMAL_ERROR = "totalTaxCheckInputDecimalError";
	/** 合計消費税 数値のみ */
	public static final String TOTAL_TAX_CHECK_NUMERIC_ONLY_ERROR = "totalTaxCheckNumericOnlyError";
	/** 合計消費税は0.001以上を入力してください。 */
	public static final String TOTAL_TAX_CHECK_INPUT_DECIMAL_MIN_ERROR = "totalTaxCheckInputDecimalMinError";
	/** 単価は9999999以下を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_MAX_ERROR = "unitPriceCheckInputMaxError";
	/** 単価は0以上を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_MIN_ERROR = "unitPriceCheckInputMinError";
	/** 単価は小数3桁以内を入力して下さい。 */
	public static final String UNIT_PRICE_CHECK_INPUT_DECIMAL_ERROR = "unitPriceCheckInputDecimalError";
	/** 単価 数値のみ */
	public static final String UNIT_PRICE_CHECK_NUMERIC_ONLY_ERROR = "unitPriceCheckNumericOnlyError";
	/** 単価は0.001以上を入力してください。 */
	public static final String UNIT_PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "unitPriceCheckInputDecimalMinError";
	/** 金額は9999999以下を入力してください。 */
	public static final String PRICE_CHECK_INPUT_MAX_ERROR = "priceCheckInputMaxError";
	/** 金額は0以上を入力してください。 */
	public static final String PRICE_CHECK_INPUT_MIN_ERROR = "priceCheckInputMinError";
	/** 金額は小数3桁以内を入力して下さい。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_ERROR = "priceCheckInputDecimalError";
	/** 金額 数値のみ */
	public static final String PRICE_CHECK_NUMERIC_ONLY_ERROR = "priceCheckNumericOnlyError";
	/** 金額は9999999.999以下を入力してください。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_MAX_ERROR = "priceCheckInputDecimalMaxError";
	/** 金額は0.001以上を入力してください。 */
	public static final String PRICE_CHECK_INPUT_DECIMAL_MIN_ERROR = "priceCheckInputDecimalMinError";
	/** 消費税は9999999以下を入力してください。 */
	public static final String TAX_CHECK_INPUT_MAX_ERROR = "taxCheckInputMaxError";
	/** 消費税は0以上を入力してください。 */
	public static final String TAX_CHECK_INPUT_MIN_ERROR = "taxCheckInputMinError";
	/** 消費税は小数3桁以内を入力して下さい。 */
	public static final String TAX_CHECK_INPUT_DECIMAL_ERROR = "taxCheckInputDecimalError";
	/** 消費税 数値のみ */
	public static final String TAX_CHECK_NUMERIC_ONLY_ERROR = "taxCheckNumericOnlyError";
	/** 消費税は0.001以上を入力してください。 */
	public static final String TAX_CHECK_INPUT_DECIMAL_MIN_ERROR = "taxCheckInputDecimalMinError";
	/** 出荷確定されていない実績がありますがよろしいですか？[/][0] */
	public static final String DAILY_CONFIRMATION_NOT_COMPLETE_SHIPPING_INSPECTION = "dailyConfirmationNotCompleteShippingInspection";
	/** センタ：[0]、荷主：[1] */
	public static final String NOT_COMPLETE_SHIPPING_INSPECTION_CLIENT_CENTER_INFORMATION = "notCompleteShippingInspectionClientCenterInformation";
	/** 数量は0より大きい値を入力してください。 */
	public static final String QTY_MUST_GREATER_THAN_ZERO = "qtyMustGreaterThanZero";
	/** 小数管理商品梱包単位が設定されていないため梱包できません。 */
	public static final String PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_DECIMAL_PACKING_CLS_ERROR = "packingCalculateCannotExecuteNotFoundDecimalPackingClsError";
	/** 処理区分が同一のデータのみ選択してください。 */
	public static final String STOCK_MOVE_LIST_DATA_CANNOT_SELECT_DIFFERENT_PROCESS_TYPE_ERROR = "stockMoveListDataCannotSelectDifferentProcessTypeError";
	/** メニューの設定を確認してください。 */
	public static final String HANDY_MENU_DEF_ERROR = "handyMenuDefError";
	/** セッションが切断されました。再度ログインしてください。 */
	public static final String HANDY_SESSION_TIMEOUT = "handySessionTimeout";
	/** セッションが切断されました。 */
	public static final String HANDY_SESSION_TIMEOUT1 = "handySessionTimeout1";
	/** 再度ログインしてください。 */
	public static final String HANDY_SESSION_TIMEOUT2 = "handySessionTimeout2";
	/** 中断データが存在します再開しますか？ */
	public static final String HANDY_CONFIRM_INTERRUPT_RESUME = "handyConfirmInterruptResume";
	/** 対象の追跡Noは積込検品済です。 */
	public static final String HANDY_CARRIER_TRACE_NUM_LOAD_COMPLETE = "handyCarrierTraceNumLoadComplete";
	/** 選択したセンターと荷主を使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_CLIENT_CENTER_AUTH_ERROR = "handyClientCenterAuthError";
	/** 検品未完了のデータは削除できません。 */
	public static final String HANDY_COULD_NOT_DELETE_NOT_COMPLETE = "handyCouldNotDeleteNotComplete";
	/** 納品先は出荷指示に存在しません。 */
	public static final String HANDY_CUSTOMER_NOT_IN_SHIPPING_INST_ERROR = "handyCustomerNotInShippingInstError";
	/** 該当データが存在しません。 */
	public static final String HANDY_DATA_NOT_FOUND_ERROR = "handyDataNotFoundError";
	/** 日付の入力が不正です(形式:yyyyMMdd)。 */
	public static final String HANDY_DATE_ERROR = "handyDateError";
	/** 配送コースCDが異なります。確認して下さい。 */
	public static final String HANDY_DELIVERY_COURSE_CD_DIFF_ERROR = "handyDeliveryCourseCdDiffError";
	/** 預託が選択されていません。 */
	public static final String HANDY_DEPOSIT_NOT_SELECT_ERROR = "handyDepositNotSelectError";
	/** エラーの伝票Noです。 */
	public static final String HANDY_ERROR_SLIP_NO = "handyErrorSlipNo";
	/** 該当の棚卸データは全て在庫調整済のため、棚卸入力できません。 */
	public static final String HANDY_INVENTORY_INPUT_ERROR = "handyInventoryInputError";
	/** 商品が異なります。 */
	public static final String HANDY_JAN_CD_DIFFER_ERROR = "handyJanCdDifferError";
	/** 該当のアイテムの指示数を超えています。 */
	public static final String HANDY_JAN_CD_INST_NUM_OVER_ERROR = "handyJanCdInstNumOverError";
	/** 商品をスキャンして下さい。 */
	public static final String HANDY_JAN_CD_NOT_INPUT_ERROR = "handyJanCdNotInputError";
	/** 該当のアイテムの数量を超えています。 */
	public static final String HANDY_JAN_CD_QTY_OVER_ERROR = "handyJanCdQtyOverError";
	/** 該当のアイテムの数量が不足です。 */
	public static final String HANDY_JAN_CD_QTY_SHORTAGE_ERROR = "handyJanCdQtyShortageError";
	/** 該当のアイテムの残数を超えています。 */
	public static final String HANDY_JAN_CD_SPG_QTY_OVER_ERROR = "handyJanCdSpgQtyOverError";
	/** 完了時、ソースCDをクリアして下さい。 */
	public static final String HANDY_JAN_COMPLETE_NO_INPUT = "handyJanCompleteNoInput";
	/** 仮ロケは入庫仮ロケーションを入力してください。 */
	public static final String HANDY_LOC_NOT_NORMAL = "handyLocNotNormal";
	/** ロケーションまたはソースCDまたは入庫ラベルNo.を入力してください。 */
	public static final String HANDY_LOC_OR_JANCD_OR_STOCK_LABEL_NO_NOT_BLANK_ERROR = "handyLocOrJancdOrStockLabelNoNotBlankError";
	/** ログインできません。再度入力してください。 */
	public static final String HANDY_LOGIN_AUTH_ERROR = "handyLoginAuthError";
	/** 選択したセンターを使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_LOGIN_CENTER_AUTH_ERROR = "handyLoginCenterAuthError";
	/** 選択した荷主を使う権限がありません。管理者に連絡してください。 */
	public static final String HANDY_LOGIN_CLIENT_AUTH_ERROR = "handyLoginClientAuthError";
	/** 棚卸データ未作成。 */
	public static final String HANDY_NO_STOCK_COUNT = "handyNoStockCount";
	/** 出庫ロケと入庫ロケが同一です。 */
	public static final String HANDY_OUTLOC_INLOC_SAME_ERROR = "handyOutlocInlocSameError";
	/** 対象の出庫作業Noが削除されました。 */
	public static final String HANDY_PICKING_WORK_NO_DELETED = "handyPickingWorkNoDeleted";
	/** 出荷梱包Noを入力して下さい。 */
	public static final String HANDY_PICKING_WORK_NO_INPUT_ERROR = "handyPickingWorkNoInputError";
	/** すでに登録されています。 */
	public static final String HANDY_PRINTER_ALREADY_REGISTER_ERROR = "handyPrinterAlreadyRegisterError";
	/** プリンタグループを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_PRINTER_GROUP_NOT_SET = "handyPrinterSelectPrinterGroupNotSet";
	/** プリンタを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_PRINTER_NOT_SET = "handyPrinterSelectPrinterNotSet";
	/** 帳票レイアウトを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_REPORT_LAYOUT_NOT_SET = "handyPrinterSelectReportLayoutNotSet";
	/** トレイを設定していません。 */
	public static final String HANDY_PRINTER_SELECT_TRAY_NOT_SET = "handyPrinterSelectTrayNotSet";
	/** 処理区分が選択されていません。 */
	public static final String HANDY_PROCESS_TYPE_NOT_SELECT_ERROR = "handyProcessTypeNotSelectError";
	/** 完了時、数量をクリアして下さい。 */
	public static final String HANDY_QTY_COMPLETE_NO_INPUT = "handyQtyCompleteNoInput";
	/** 数量は1以上で入力して下さい。 */
	public static final String HANDY_QTY_MUST_GREATER_THEN_ONE = "handyQtyMustGreaterThenOne";
	/** 予定無し入荷が行われていません。 */
	public static final String HANDY_RECEIVE_NO_PLAN_NOT_INPUT = "handyReceiveNoPlanNotInput";
	/** 検品が行われていません。 */
	public static final String HANDY_RECEIVE_NOT_INPUT = "handyReceiveNotInput";
	/** 検品数が予定数を超えています。 */
	public static final String HANDY_RECEIVE_QTY_OVER_ERROR = "handyReceiveQtyOverError";
	/** 該当のソースCD/商品CDが入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_JAN_NOT_FOUND_ERROR = "handyReceiveStoreJanNotFoundError";
	/** 該当のソースCD/商品CDの入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_QTY_ZERO_ERROR = "handyReceiveStoreJanQtyZeroError";
	/** 該当のソースCD/商品CDで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreJanStockNotFoundError";
	/** 該当のソースCD/商品CDの仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreJanStockQtyZeroError";
	/** 該当のソースCD/商品CDが全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_JAN_STORED_ERROR = "handyReceiveStoreJanStoredError";
	/** 該当の仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_KARI_LOC_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreKariLocStockNotFoundError";
	/** 該当のラベルNOに入荷した在庫データ（仮ロケ）が存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LABEL_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLabelStockNotFoundError";
	/** 該当のラベルNOに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LABEL_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLabelStockQtyZeroError";
	/** 該当の期限日が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_NOT_FOUND_ERROR = "handyReceiveStoreLimitDtNotFoundError";
	/** 該当の期限日の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_QTY_ZERO_ERROR = "handyReceiveStoreLimitDtQtyZeroError";
	/** 該当の期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLimitDtStockNotFoundError";
	/** 該当の期限日の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLimitDtStockQtyZeroError";
	/** 該当の期限日が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LIMIT_DT_STORED_ERROR = "handyReceiveStoreLimitDtStoredError";
	/** ロケは通常ロケーションを入力してください。 */
	public static final String HANDY_RECEIVE_STORE_LOC_NORMAL = "handyReceiveStoreLocNormal";
	/** 該当のロット、期限日が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_NOT_FOUND_ERROR = "handyReceiveStoreLotLimitDtNotFoundError";
	/** 該当のロット、期限日の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_QTY_ZERO_ERROR = "handyReceiveStoreLotLimitDtQtyZeroError";
	/** 該当のロット、期限日で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLotLimitDtStockNotFoundError";
	/** 該当のロット、期限日の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLotLimitDtStockQtyZeroError";
	/** 該当のロット、期限日が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_LIMIT_DT_STORED_ERROR = "handyReceiveStoreLotLimitDtStoredError";
	/** 該当のロットが入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_NOT_FOUND_ERROR = "handyReceiveStoreLotNotFoundError";
	/** 該当のロットの入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_QTY_ZERO_ERROR = "handyReceiveStoreLotQtyZeroError";
	/** 該当のロットで取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreLotStockNotFoundError";
	/** 該当のロットの仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreLotStockQtyZeroError";
	/** 該当のロットが全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_LOT_STORED_ERROR = "handyReceiveStoreLotStoredError";
	/** 入荷数を超えて格納はできません。 */
	public static final String HANDY_RECEIVE_STORE_QTY_ERROR = "handyReceiveStoreQtyError";
	/** 該当の伝票No.が入庫実績データに存在しません。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_NOT_FOUND_ERROR = "handyReceiveStoreWorkNoNotFoundError";
	/** 該当の伝票No.の入庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_QTY_ZERO_ERROR = "handyReceiveStoreWorkNoQtyZeroError";
	/** 該当の伝票No.で取得した入庫実績データから仮ロケに入荷した在庫データが存在しません。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STOCK_NOT_FOUND_ERROR = "handyReceiveStoreWorkNoStockNotFoundError";
	/** 該当の伝票No.の仮ロケに入荷した在庫データの在庫数が0です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STOCK_QTY_ZERO_ERROR = "handyReceiveStoreWorkNoStockQtyZeroError";
	/** 該当の伝票No.が全て格納済です。 */
	public static final String HANDY_RECEIVE_STORE_WORK_NO_STORED_ERROR = "handyReceiveStoreWorkNoStoredError";
	/** 対象のケースピッキングNo.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_CASE_PICKING_NO_FORCE_FIXED = "handyShippingPackingCasePickingNoForceFixed";
	/** データはすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_COMPLETE = "handyShippingPackingComplete";
	/** 対象の出庫作業No.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_FORCE_FIXED = "handyShippingPackingForceFixed";
	/** 対象の出荷梱包No.はすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_ALL_COMPLETE = "handyShippingPackingNoAllComplete";
	/** 対象の出荷梱包No.が削除されました。 */
	public static final String HANDY_SHIPPING_PACKING_NO_DELETED = "handyShippingPackingNoDeleted";
	/** 対象の出荷梱包No.は強制確定済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_FORCE_FIXED = "handyShippingPackingNoForceFixed";
	/** 対象の梱包Noは積込検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_NO_LOAD_COMPLETE = "handyShippingPackingNoLoadComplete";
	/** 未検品データが存在します。 */
	public static final String HANDY_SHIPPING_PACKING_NOT_COMPLETE = "handyShippingPackingNotComplete";
	/** 対象の出庫作業No.はすべて検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_WORK_NO_ALL_COMPLETE = "handyShippingPackingWorkNoAllComplete";
	/** 対象の出庫作業No.は検品済です。 */
	public static final String HANDY_SHIPPING_PACKING_WORK_NO_COMPLETE = "handyShippingPackingWorkNoComplete";
	/** 該当データが既にピック済です。 */
	public static final String HANDY_SHIPPING_PICKING_ALREADY = "handyShippingPickingAlready";
	/** 対象のケースピッキングNo.はすべてピッキング済です。 */
	public static final String HANDY_SHIPPING_PICKING_CASE_PICKING_NO_ALL_COMPLETE = "handyShippingPickingCasePickingNoAllComplete";
	/** 対象のケースピッキングNo.は削除されています。 */
	public static final String HANDY_SHIPPING_PICKING_CASE_PICKING_NO_DELETED = "handyShippingPickingCasePickingNoDeleted";
	/** 対象の出庫作業No.はすべてピッキング済です。 */
	public static final String HANDY_SHIPPING_PICKING_WORK_NO_ALL_COMPLETE = "handyShippingPickingWorkNoAllComplete";
	/** 対象の出荷梱包No.はケースピッキング対象です。 */
	public static final String SHIPPING_PACKING_NO_CANNOT_PICKING_TARGET_CASE_PICKING_ERROR = "shippingPackingNoCannotPickingTargetCasePickingError";
	/** 対象の伝票が削除されました。 */
	public static final String HANDY_SLIP_NO_DELETED = "handySlipNoDeleted";
	/** 該当の商品は検品済です。 */
	public static final String HANDY_SPG_QTY_ONS_COMPLETE = "handySpgQtyOnsComplete";
	/** 該当の商品は検品数を超えています。 */
	public static final String HANDY_SPG_QTY_ONS_OVER_ERROR = "handySpgQtyOnsOverError";
	/** 該当のラベルNO移動が全て完了しました */
	public static final String HANDY_STOCK_LABEL_MOVE_COMPLETE = "handyStockLabelMoveComplete";
	/** 該当商品はすべて移動完了しました。 */
	public static final String HANDY_STOCK_MOVE_COMPLETE = "handyStockMoveComplete";
	/** 在庫区分マスタに在庫区分が存在しません。 */
	public static final String HANDY_STOCK_TYPE_FLAG_NOT_FOUND_ERROR = "handyStockTypeFlagNotFoundError";
	/** 在庫区分が選択されていません。 */
	public static final String HANDY_STOCK_TYPE_NOT_SELECT_ERROR = "handyStockTypeNotSelectError";
	/** 該当の入庫ラベルNo.は数量を超えています。 */
	public static final String HANDY_STORE_LABEL_NO_QTY_OVER_ERROR = "handyStoreLabelNoQtyOverError";
	/** 該当の入庫ラベルNo.の数量が不足です。 */
	public static final String HANDY_STORE_LABEL_NO_QTY_SHORTAGE_ERROR = "handyStoreLabelNoQtyShortageError";
	/** 入庫ラベルNo.が異なります。 */
	public static final String HANDY_STORE_NO_DIFFER_ERROR = "handyStoreNoDifferError";
	/** 入庫ラベルNo.をスキャンして下さい。 */
	public static final String HANDY_STORE_NO_NOT_INPUT_ERROR = "handyStoreNoNotInputError";
	/** 荷札/納品明細書出力エラー。PCで出力し直して下さい。検品は終了しています。 */
	public static final String HANDY_TAG_OUTPUT_ERROR = "handyTagOutputError";
	/** 取引先マスタに仕入先が存在しません。 */
	public static final String HANDY_VENDOR_FLAG_NOT_FOUND_ERROR = "handyVendorFlagNotFoundError";
	/** 使用する荷材CDを入力してください。 */
	public static final String HANDY_INPUT_BOX_CD_INFO = "handyInputBoxCdInfo";
	/** 選択した預託の荷主が選択されていません。 */
	public static final String DEPOSIT_CLIENT_NOT_SELECT_ERROR = "depositClientNotSelectError";
	/** 既に最大行数[0]の為、行を追加できません。 */
	public static final String OVER_SHAPE_GROUP_DTL_ERROR = "overShapeGroupDtlError";
	/** 親荷姿が設定されていません。 */
	public static final String PARENT_SHAPE_CD_PLURAL_NOT_INPUT_ERROR = "parentShapeCdPluralNotInputError";
	/** 最小荷姿はケースピッキング対象に設定できません。 */
	public static final String CASE_PICK_FLG_CANNOT_SET_ERROR = "casePickFlgCannotSetError";
	/** ケースピッキング対象は複数の荷姿を選択できません。 */
	public static final String CASE_PICK_FLG_PLURAL_NOT_INPUT_ERROR = "casePickFlgPluralNotInputError";
	/** 緊急補充ゾーン補充荷姿が設定されていません。 */
	public static final String EM_REPLANISH_SHAPE_FLG_NO_INPUT_ERROR = "emReplanishShapeFlgNoInputError";
	/** 緊急補充ゾーン補充荷姿は複数の荷姿を選択できません。 */
	public static final String EM_REPLANISH_SHAPE_FLG_PLURAL_NOT_INPUT_ERROR = "emReplanishShapeFlgPluralNotInputError";
	/** 荷姿グループに紐付く商品が存在するため、荷姿グループを削除できません。 */
	public static final String SHAPE_GROUP_CANNOT_DELETE_USED_BY_PRODUCT_ERROR = "shapeGroupCannotDeleteUsedByProductError";
	/** 荷姿グループに紐付く商品の在庫が存在するため、削除できません。 */
	public static final String SHAPE_CANNOT_DELETE_USED_BY_PRODUCT_IN_STOCK_ERROR = "shapeCannotDeleteUsedByProductInStockError";
	/** 商品荷姿に登録されている荷姿です。[/]削除する場合、商品荷姿も削除されますが宜しいですか？ */
	public static final String SHAPE_CANNOT_DELETE_USED_BY_PRODUCT_WARN = "shapeCannotDeleteUsedByProductWarn";
	/** 最大単位荷姿の親荷姿は設定しないで下さい。 */
	public static final String ALL_PARENT_SHAPE_CD_INPUT_ERROR = "allParentShapeCdInputError";
	/** 荷姿と親荷姿が同じです。 */
	public static final String PARENT_CHILD_SHAPE_CD_INPUT_SAME_SHAPE_CD_ERROR = "parentChildShapeCdInputSameShapeCdError";
	/** 予定数は小数3桁以内を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR = "planNumCheckInputDecimalMaxError";
	/** 指示数は小数3桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_MAX_ERROR = "instNumCheckInputDecimalMaxError";
	/** ケースピッキング対象の荷姿が見つかりません。[/]荷姿グループの設定を確認してください。 */
	public static final String CASE_PICKING_FLG_NOT_FOUND_ERROR = "casePickingFlgNotFoundError";
	/** 荷姿グループCDが既に登録済です。 */
	public static final String SHAPE_GRP_CD_CODE_DUPLICATE_ERROR = "shapeGrpCdCodeDuplicateError";
	/** 荷姿CDが重複しています。 */
	public static final String SHAPE_CODE_DUPLICATE_ERROR = "shapeCodeDuplicateError";
	/** GTIN1が重複しています。 */
	public static final String GTIN14_DUPLICATE_ERROR = "gtin14DuplicateError";
	/** 荷姿の親子関係が不正です。 */
	public static final String LARGEST_SHAPE_CD_NOT_SELECTED_AS_PARENT_SHAPE_CD_ERROR = "largestShapeCdNotSelectedAsParentShapeCdError";
	/** ケースピッキング対象が設定されていません。 */
	public static final String CASE_PICK_FLG_NOT_INPUT_ERROR = "casePickFlgNotInputError";
	/** 補充点を入力して下さい。 */
	public static final String REPLENISH_P_NUM_NOT_INPUT_ERROR = "replenishPNumNotInputError";
	/** 補充点 数値のみ */
	public static final String REPLENISH_P_NUM_CHECK_DECIMAL_ONLY_ERROR = "replenishPNumCheckDecimalOnlyError";
	/** 補充点は小数3桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "replenishPNumCheckInputDecimalLengthError";
	/** 最大格納数 数値のみ */
	public static final String MAX_STORE_NUM_CHECK_DECIMAL_ONLY_ERROR = "maxStoreNumCheckDecimalOnlyError";
	/** 最大格納数は小数3桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "maxStoreNumCheckInputDecimalLengthError";
	/** 荷姿グループ明細に登録されている荷姿([0])は削除できません。 */
	public static final String SHAPE_CODE_CANNOT_DELETE_IN_SHAPE_GROUP_MASTER_DTL_ERROR = "shapeCodeCannotDeleteInShapeGroupMasterDtlError";
	/** 荷姿グループ明細マスタに存在しません。 */
	public static final String SHAPE_GRP_DTL_NOT_FOUND_ERROR = "shapeGrpDtlNotFoundError";
	/** 荷姿CDが重複しています。 */
	public static final String PARENTSHAPE_CODE_DUPLICATE_ERROR = "parentshapeCodeDuplicateError";
	/** 荷姿CDが荷姿マスタに存在しません。 */
	public static final String SHAPE_CD_NOT_FOUND_ERROR = "shapeCdNotFoundError";
	/** 荷姿グループに紐付く商品が存在するため、荷姿の親子関係は更新できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_UPDATE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotUpdateUsedByProductError";
	/** 荷姿グループに紐付く商品が存在するため、荷姿を削除できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_DELETE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotDeleteUsedByProductError";
	/** 荷姿グループに紐付く商品が存在するため、荷姿を追加できません。 */
	public static final String SHAPE_GROUP_DTL_CANNOT_INSERT_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotInsertUsedByProductError";
	/** 荷姿グループに紐付く商品が存在しますが、荷姿を更新してよろしいですか？ */
	public static final String SHAPE_GROUP_DTL_CANNOT_CHANGE_USED_BY_PRODUCT_ERROR = "shapeGroupDtlCannotChangeUsedByProductError";
	/** 在庫管理単位を選択してください。 */
	public static final String CLIENT_DEFAULT_SHAPE_GRP_ID_NOT_INPUT_ERROR = "clientDefaultShapeGrpIdNotInputError";
	/** 選択中の荷姿グループは既に削除されています。 */
	public static final String SHAPE_GROUP_ALREADY_DELETED_CANNOT_SELECT = "shapeGroupAlreadyDeletedCannotSelect";
	/** 小数有無フラグが「1：小数を含む」の場合、複数の荷姿を登録することはできません。 */
	public static final String SHAPE_GROUP_DTL_OVER_ONE_LINE_ERROR = "shapeGroupDtlOverOneLineError";
	/** 予定数は0.001以上を入力して下さい。 */
	public static final String PLAN_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR = "planNumCheckInputDecimalMinError";
	/** 指示数は0.001以上を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_DECIMAL_MIN_ERROR = "instNumCheckInputDecimalMinError";
	/** 在庫管理単位はロケーション([0])の補充商品に使用しているため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_CANNOT_UPDATE_USE_LOCATION_ERROR = "productShapeGrpCannotUpdateUseLocationError";
	/** 在庫が存在するため、在庫管理単位を変更できません。 */
	public static final String SHAPE_GROUP_CHANGED_ERROR = "shapeGroupChangedError";
	/** 入数が変更されていますがよろしいですか？ */
	public static final String UNIT_NUM_CHANGED_WARN = "unitNumChangedWarn";
	/** 在庫管理単位 英数字のみ */
	public static final String SHAPE_GRP_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "shapeGrpCdCheckAlphabetAndNumericOnlyError";
	/** 在庫管理単位は最大30文字以下で入力して下さい。 */
	public static final String SHAPE_GRP_CD_CHECK_INPUT_MAX_ERROR = "shapeGrpCdCheckInputMaxError";
	/** 在庫管理単位が荷姿グループマスタに存在しません。 */
	public static final String SHAPE_GROUP_NOT_FOUND_ERROR = "shapeGroupNotFoundError";
	/** 商品の在庫があるため、在庫管理単位を変更できません。 */
	public static final String SHAPE_GROUP_CANNOT_UPDATE_USED_BY_PRODUCT_IN_STOCK_ERROR = "shapeGroupCannotUpdateUsedByProductInStockError";
	/** 最小在庫管理単位は使用中のため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_DTL_CANNOT_UPDATE_ERROR = "productShapeGrpDtlCannotUpdateError";
	/** 在庫管理単位はロケーションの補充商品に使用しているため、変更できません。 */
	public static final String PRODUCT_SHAPE_GRP_BULK_CANNOT_UPDATE_USE_LOCATION_ERROR = "productShapeGrpBulkCannotUpdateUseLocationError";
	/** 在庫管理単位の最小荷姿が荷姿グループ明細マスタに存在しません。 */
	public static final String UNIT_PRODUCT_SHAPE_NOT_FOUND_ERROR = "unitProductShapeNotFoundError";
	/** 出庫数に小数は入力できません。 */
	public static final String PICKING_NUM_CHECK_INPUT_DECIMAL_ERROR = "pickingNumCheckInputDecimalError";
	/** 取込用Excelの在庫管理単位を指定するか、荷主マスタの在庫管理単位を設定してください。 */
	public static final String CLIENT_DEFAULT_SHAPE_GROUP_NOT_INPUT_ERROR = "clientDefaultShapeGroupNotInputError";
	/** 配送コースマスタの追跡番号採番キーに登録されているセンタ採番は削除できません。 */
	public static final String NUMBERING_CENTER_CANNOT_DELETE_USE_DELIVERY_COURSE_ERROR = "numberingCenterCannotDeleteUseDeliveryCourseError";
	/** 現在値には最小値-1よりも大きい値を入力してください。 */
	public static final String PRESENT_NUMBER_LESS_THAN_SUBTRACT_MIN_NUMBER2_ERROR = "presentNumberLessThanSubtractMinNumber2Error";
	/** 他で出庫指示解除中です。 */
	public static final String OTHER_SHIP_INSTRUCTE_RELEASING = "otherShipInstructeReleasing";
	/** 入庫数0のデータには[0]は入力できません。 */
	public static final String CAN_NOT_ENTER_IN_STORE_NUM_ZERO_DATA_ERROR = "canNotEnterInStoreNumZeroDataError";
	/** 数量に小数を含む商品は入力できません。 */
	public static final String INPUT_PRODUCT_DECIMAL_EXIST_FLG_ERROR = "inputProductDecimalExistFlgError";
	/** 小数有無フラグが「1：小数を含む」の場合、セット品の構成品として登録できません。 */
	public static final String SET_STRUCTURE_DECIMAL_EXIST_FLG_ERROR = "setStructureDecimalExistFlgError";
	/** Bill of Lading Noが空白のため、貨物追跡番号登録できません。 */
	public static final String NO_PRINTED_SELECTED = "noPrintedSelected";
	/** 取引先CDが既に登録済です。 */
	public static final String CUSTMOER_CD_CODE_DUPLICATE_ERROR = "custmoerCdCodeDuplicateError";
	/** 違う届先コードに対して、一括Bill of Ladingは発行できません。 */
	public static final String DIFFERENT_DELIV_SELECTED = "differentDelivSelected";
	/** 未発行データが含めるため、発行取消できません。 */
	public static final String NO_PRINTED_DATA_SELECTED = "noPrintedDataSelected";
	/** 構成品：[0]の在庫が存在しません。 */
	public static final String STRUCTURE_PART_STOCK_NOT_FOUND_ERROR = "structurePartStockNotFoundError";
	/** 入荷予定日を入力してください。 */
	public static final String RECEIVE_PLAN_DT_NOT_INOUT_ERROR = "receivePlanDtNotInoutError";
	/** フラグ1（一町域が二以上の郵便番号で表される場合の表示）が存在しません。 */
	public static final String FLG1_NOT_FOUND_ERROR = "flg1NotFoundError";
	/** フラグ2（小字毎に番地が起番されている町域の表示）が存在しません。 */
	public static final String FLG2_NOT_FOUND_ERROR = "flg2NotFoundError";
	/** フラグ3（丁目を有する町域の場合の表示）が存在しません。 */
	public static final String FLG3_NOT_FOUND_ERROR = "flg3NotFoundError";
	/** フラグ4（一つの郵便番号で二以上の町域を表す場合の表示）が存在しません。 */
	public static final String FLG4_NOT_FOUND_ERROR = "flg4NotFoundError";
	/** 更新区分が存在しません。 */
	public static final String UPD_TYPE_NOT_FOUND_ERROR = "updTypeNotFoundError";
	/** 変更理由が存在しません。 */
	public static final String REASON_TYPE_NOT_FOUND_ERROR = "reasonTypeNotFoundError";
	/** フラグ5（個別番号の種別の表示）が存在しません。 */
	public static final String FLG5_NOT_FOUND_ERROR = "flg5NotFoundError";
	/** フラグ6（複数番号の有無）が存在しません。 */
	public static final String FLG6_NOT_FOUND_ERROR = "flg6NotFoundError";
	/** 修正コードが存在しません。 */
	public static final String UPD_CD_NOT_FOUND_ERROR = "updCdNotFoundError";
	/** 期限日管理フラグに[管理しない]を設定した場合、入荷期限日数は入力しないで下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR = "receiveLimitNumCannotInputExceptLimitDtManagFlgProductError";
	/** 入荷期限日数は整数[0]桁以内を入力して下さい。 */
	public static final String RECEIVE_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "receiveLimitNumCheckInputIntegerLengthError";
	/** 期限日管理フラグに[管理しない]を設定した場合、出荷期限日数は入力しないで下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CANNOT_INPUT_EXCEPT_LIMIT_DT_MANAG_FLG_PRODUCT_ERROR = "shippingLimitNumCannotInputExceptLimitDtManagFlgProductError";
	/** 出荷期限日数は整数[0]桁以内を入力して下さい。 */
	public static final String SHIPPING_LIMIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shippingLimitNumCheckInputIntegerLengthError";
	/** 定点は整数[0]桁以内を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "fixedPointCheckInputIntegerLengthError";
	/** 【在庫最小単位】縦(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String LENGTH_CHECK_INPUT_INTEGER_LENGTH_ERROR = "lengthCheckInputIntegerLengthError";
	/** 【在庫最小単位】横(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String WIDTH_CHECK_INPUT_INTEGER_LENGTH_ERROR = "widthCheckInputIntegerLengthError";
	/** 【在庫最小単位】高さ(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String HEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "heightCheckInputIntegerLengthError";
	/** 【在庫最小単位】容積(mm) は整数[0]桁以内を入力して下さい。 */
	public static final String VOLUME_CHECK_INPUT_INTEGER_LENGTH_ERROR = "volumeCheckInputIntegerLengthError";
	/** 【在庫最小単位】商品重量(g) は整数[0]桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "netWeightCheckInputIntegerLengthError";
	/** 【在庫最小単位】総重量(g) は整数[0]桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_CHECK_INPUT_INTEGER_LENGTH_ERROR = "grossWeightCheckInputIntegerLengthError";
	/** 荷主CDを入力して下さい。 */
	public static final String CLIENT_CD_NOT_INPUT_ERROR = "clientCdNotInputError";
	/** 荷主CD 英数字と-のみ */
	public static final String CLIENT_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "clientCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 荷主CDは最大[0]文字以下を入力して下さい。 */
	public static final String CLIENT_CD_CHECK_INPUT_MAX_ERROR = "clientCdCheckInputMaxError";
	/** 荷姿 英数字のみ */
	public static final String SHAPE_CLASS_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "shapeClassCheckAlphabetAndNumericOnlyError";
	/** 荷姿は最大30文字以下を入力して下さい。 */
	public static final String SHAPE_CLASS_CHECK_INPUT_MAX_ERROR = "shapeClassCheckInputMaxError";
	/** 入数は整数[0]桁以内を入力して下さい。 */
	public static final String UNIT_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitNumCheckInputIntegerLengthError";
	/** 縦(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String LENGTH_INPUT_INTEGER_LENGTH_ERROR = "lengthInputIntegerLengthError";
	/** 横(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String WIDTH_INPUT_INTEGER_LENGTH_ERROR = "widthInputIntegerLengthError";
	/** 高さ(mm)は整数[0]桁以内を入力して下さい。 */
	public static final String HEIGHT_INPUT_INTEGER_LENGTH_ERROR = "heightInputIntegerLengthError";
	/** 容積(mm3)は整数[0]桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_INPUT_INTEGER_LENGTH_ERROR = "shapeVolumeInputIntegerLengthError";
	/** 商品重量(g)は整数[0]桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_INPUT_INTEGER_LENGTH_ERROR = "netWeightInputIntegerLengthError";
	/** 総重量(g)は整数[0]桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_INPUT_INTEGER_LENGTH_ERROR = "grossWeightInputIntegerLengthError";
	/** センタCD 英数字と-のみ */
	public static final String CENTER_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "centerCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** センタCDは最大[0]文字以下を入力して下さい。 */
	public static final String CENTER_CD_CHECK_INPUT_MAX_ERROR = "centerCdCheckInputMaxError";
	/** センタCDを入力して下さい。 */
	public static final String CENTER_CD_NOT_INPUT_ERROR = "centerCdNotInputError";
	/** 倉庫CD 英数字と-のみ */
	public static final String WAREHOUSE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "warehouseCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 倉庫CDは最大[0]文字以下を入力して下さい。 */
	public static final String WAREHOUSE_CD_CHECK_INPUT_MAX_ERROR = "warehouseCdCheckInputMaxError";
	/** ゾーンCD 英数字のみ */
	public static final String ZONE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "zoneCdCheckAlphabetAndNumericOnlyError";
	/** ゾーンCDは最大[0]文字以下を入力して下さい。 */
	public static final String ZONE_CD_CHECK_INPUT_MAX_ERROR = "zoneCdCheckInputMaxError";
	/** ロケーションCD 英数字のみ */
	public static final String LOCATION_CODE_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "locationCodeCheckAlphabetAndNumericOnlyError";
	/** ロケーションCDは最大[0]文字以下を入力して下さい。 */
	public static final String LOCATION_CODE_CHECK_INPUT_MAX_ERROR = "locationCodeCheckInputMaxError";
	/** 補充商品CDは最大[0]文字以下を入力して下さい。 */
	public static final String REPLENISH_PRODUCT_CD_CHECK_INPUT_MAX_ERROR = "replenishProductCdCheckInputMaxError";
	/** 補充点荷姿CDは最大[0]文字以下を入力して下さい。 */
	public static final String REPLENISH_P_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR = "replenishPProductShapeCdCheckInputMaxError";
	/** 補充点は整数[0]桁以内を入力して下さい。 */
	public static final String REPLENISH_P_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "replenishPNumCheckInputIntegerLengthError";
	/** 最大格納数商品荷姿CDは最大[0]文字以下を入力して下さい。 */
	public static final String MAX_STORE_PRODUCT_SHAPE_CD_CHECK_INPUT_MAX_ERROR = "maxStoreProductShapeCdCheckInputMaxError";
	/** 最大格納数は整数[0]桁以内を入力して下さい。 */
	public static final String MAX_STORE_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "maxStoreNumCheckInputIntegerLengthError";
	/** ピッキング順序は整数5桁以内を入力して下さい。 */
	public static final String PICKING_ORDER_CHECK_INPUT_INTEGER_ERROR = "pickingOrderCheckInputIntegerError";
	/** ピッキング順序に小数は入力できません。 */
	public static final String PICKING_ORDER_CHECK_INPUT_DECIMAL_ERROR = "pickingOrderCheckInputDecimalError";
	/** 預託CD 英数字と-のみ */
	public static final String DEPOSIT_CODE_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "depositCodeCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 預託CDは最大[0]文字以下を入力して下さい。 */
	public static final String DEPOSIT_CODE_CHECK_INPUT_MAX_ERROR = "depositCodeCheckInputMaxError";
	/** ロットCDは最大[0]文字以下を入力して下さい。 */
	public static final String LOT_CD_CHECK_INPUT_MAX_ERROR = "lotCdCheckInputMaxError";
	/** 入庫ラベルNO 英数字と-のみ */
	public static final String STORE_LABEL_NO_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "storeLabelNoCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 入庫ラベルNOは最大[0]文字以下を入力して下さい。 */
	public static final String STORE_LABEL_NO_CHECK_INPUT_MAX_ERROR = "storeLabelNoCheckInputMaxError";
	/** 指示数は整数[0]桁以内を入力して下さい。 */
	public static final String INST_NUM_CHECK_INPUT_INTEGER_LENGTH_ERROR = "instNumCheckInputIntegerLengthError";
	/** 指示数は[0]以上の数値を入力して下さい。 */
	public static final String INST_NUM_INPUT_REQUEST_MORE_THAN_MIN_ERROR = "instNumInputRequestMoreThanMinError";
	/** 備考は最大[0]文字以下を入力して下さい。 */
	public static final String STOCK_INPUT_COMMENT_CHECK_INPUT_MAX_ERROR = "stockInputCommentCheckInputMaxError";
	/** ロットCD 半角文字のみ */
	public static final String LOT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "lotCdCheckHalfWidthOnlyError";
	/** 仕分コードは最大[0]文字以下を入力して下さい。 */
	public static final String ARRIVAL_STORE_CD_CHECK_INPUT_MAX_ERROR = "arrivalStoreCdCheckInputMaxError";
	/** 仕分名称は最大[0]文字以下を入力して下さい。 */
	public static final String ARRIVAL_STORE_NM_CHECK_INPUT_MAX_ERROR = "arrivalStoreNmCheckInputMaxError";
	/** 全国地方公共団体コード 数値のみ */
	public static final String PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR = "publicCdCheckNumericOnlyError";
	/** 全国地方公共団体コードは最大[0]文字以下を入力して下さい。 */
	public static final String PUBLIC_CD_CHECK_INPUT_MAX_ERROR = "publicCdCheckInputMaxError";
	/** 旧郵便番号 数値のみ */
	public static final String ZIP_CD5_CHECK_NUMERIC_ONLY_ERROR = "zipCd5CheckNumericOnlyError";
	/** 旧郵便番号は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_CD5_CHECK_INPUT_MAX_ERROR = "zipCd5CheckInputMaxError";
	/** 都道府県名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN1_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn1CheckHalfWidthOnlyError";
	/** 都道府県名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN1_CHECK_INPUT_MAX_ERROR = "zipAddressKn1CheckInputMaxError";
	/** 市区町村名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN2_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn2CheckHalfWidthOnlyError";
	/** 市区町村名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN2_CHECK_INPUT_MAX_ERROR = "zipAddressKn2CheckInputMaxError";
	/** 町域名カナ 半角文字のみ */
	public static final String ZIP_ADDRESS_KN3_CHECK_HALF_WIDTH_ONLY_ERROR = "zipAddressKn3CheckHalfWidthOnlyError";
	/** 町域名カナは最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN3_CHECK_INPUT_MAX_ERROR = "zipAddressKn3CheckInputMaxError";
	/** 都道府県名 全角文字のみ */
	public static final String ZIP_ADDRESS1_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress1CheckFullWidthOnlyError";
	/** 都道府県名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS1_CHECK_INPUT_MAX_ERROR = "zipAddress1CheckInputMaxError";
	/** 市区町村名 全角文字のみ */
	public static final String ZIP_ADDRESS2_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress2CheckFullWidthOnlyError";
	/** 市区町村名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS2_CHECK_INPUT_MAX_ERROR = "zipAddress2CheckInputMaxError";
	/** 町域名 全角文字のみ */
	public static final String ZIP_ADDRESS3_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress3CheckFullWidthOnlyError";
	/** 町域名は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS3_CHECK_INPUT_MAX_ERROR = "zipAddress3CheckInputMaxError";
	/** 都道府県または市区町村または町域を入力して下さい。 */
	public static final String ZIP_ADDRESS_CHECK_NOT_INPUT_ERROR = "zipAddressCheckNotInputError";
	/** 全国地方公共団体コード（大口事業所の所在地のJISコード） 数値のみ */
	public static final String COMPANY_PUBLIC_CD_CHECK_NUMERIC_ONLY_ERROR = "companyPublicCdCheckNumericOnlyError";
	/** 全国地方公共団体コード（大口事業所の所在地のJISコード）は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_PUBLIC_CD_CHECK_INPUT_MAX_ERROR = "companyPublicCdCheckInputMaxError";
	/** 大口事業所名カナ  半角文字のみ */
	public static final String COMPANY_KN_CHECK_HALF_WIDTH_ONLY_ERROR = "companyKnCheckHalfWidthOnlyError";
	/** 大口事業所名カナ は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_KN_CHECK_INPUT_MAX_ERROR = "companyKnCheckInputMaxError";
	/** 大口事業所名 全角文字のみ */
	public static final String COMPANY_NM_CHECK_FULL_WIDTH_ONLY_ERROR = "companyNmCheckFullWidthOnlyError";
	/** 大口事業所名は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_NM_CHECK_INPUT_MAX_ERROR = "companyNmCheckInputMaxError";
	/** 小字（丁目、番地等） 全角文字のみ */
	public static final String ZIP_ADDRESS4_CHECK_FULL_WIDTH_ONLY_ERROR = "zipAddress4CheckFullWidthOnlyError";
	/** 小字（丁目、番地等）は最大[0]文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS4_CHECK_INPUT_MAX_ERROR = "zipAddress4CheckInputMaxError";
	/** 郵便番号（大口事業所個別番号）を入力して下さい。 */
	public static final String COMPANY_ZIP_CD_NOT_INPUT_ERROR = "companyZipCdNotInputError";
	/** 郵便番号（大口事業所個別番号） 数値のみ */
	public static final String COMPANY_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "companyZipCdCheckNumericOnlyError";
	/** 郵便番号（大口事業所個別番号）は最大[0]文字以下を入力して下さい。 */
	public static final String COMPANY_ZIP_CD_CHECK_INPUT_MAX_ERROR = "companyZipCdCheckInputMaxError";
	/** 取扱局 全角文字のみ */
	public static final String HANDLING_ADDRESS_CHECK_FULL_WIDTH_ONLY_ERROR = "handlingAddressCheckFullWidthOnlyError";
	/** 取扱局は最大[0]文字以下を入力して下さい。 */
	public static final String HANDLING_ADDRESS_CHECK_INPUT_MAX_ERROR = "handlingAddressCheckInputMaxError";
	/** 定点は小数[0]桁以内を入力して下さい。 */
	public static final String FIXED_POINT_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "fixedPointCheckInputDecimalLengthError";
	/** 定点は整数7桁以内を入力して下さい。 */
	public static final String FIXED_POINT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "fixedPointBulkCheckInputIntegerLengthError";
	/** 定点は小数3桁以内を入力して下さい。 */
	public static final String FIXED_POINT_BULK_CHECK_INPUT_DECIMAL_LENGTH_ERROR = "fixedPointBulkCheckInputDecimalLengthError";
	/** 【在庫最小単位】縦(mm)は整数10桁以内を入力して下さい。 */
	public static final String LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "lengthBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】横(mm)は整数10桁以内を入力して下さい。 */
	public static final String WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "widthBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】高さ(mm)は整数10桁以内を入力して下さい。 */
	public static final String HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "heightBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】容積(mm3)は整数10桁以内を入力して下さい。 */
	public static final String VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "volumeBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】商品重量(g) は整数10桁以内を入力して下さい。 */
	public static final String NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "netWeightBulkCheckInputIntegerLengthError";
	/** 【在庫最小単位】商品総重量(g)は整数10桁以内を入力して下さい。 */
	public static final String GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "grossWeightBulkCheckInputIntegerLengthError";
	/** 入数は整数5桁以内を入力して下さい。 */
	public static final String UNIT_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitNumBulkCheckInputIntegerLengthError";
	/** 縦(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_LENGTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeLengthBulkCheckInputIntegerLengthError";
	/** 横(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_WIDTH_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeWidthBulkCheckInputIntegerLengthError";
	/** 高さ(mm)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_HEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeHeightBulkCheckInputIntegerLengthError";
	/** 容積(mm3)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_VOLUME_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeVolumeBulkCheckInputIntegerLengthError";
	/** 商品重量(g)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_NET_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeNetWeightBulkCheckInputIntegerLengthError";
	/** 総重量(g)は整数10桁以内を入力して下さい。 */
	public static final String SHAPE_GROSS_WEIGHT_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "shapeGrossWeightBulkCheckInputIntegerLengthError";
	/** 予定数は整数7桁以内を入力して下さい。 */
	public static final String PLAN_NUM_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "planNumBulkCheckInputIntegerLengthError";
	/** 予備項目１（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM1_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum1BulkCheckInputIntegerLengthError";
	/** 予備項目２（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM2_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum2BulkCheckInputIntegerLengthError";
	/** 予備項目３（数値）は整数7桁以内を入力して下さい。 */
	public static final String SPARE_NUM3_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "spareNum3BulkCheckInputIntegerLengthError";
	/** 合計金額は整数7桁以内を入力して下さい。 */
	public static final String TOTAL_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "totalPriceBulkCheckInputIntegerLengthError";
	/** 合計消費税は整数7桁以内を入力して下さい。 */
	public static final String TOTAL_TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "totalTaxBulkCheckInputIntegerLengthError";
	/** 単価は整数7桁以内を入力して下さい。 */
	public static final String UNIT_PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "unitPriceBulkCheckInputIntegerLengthError";
	/** 金額は整数7桁以内を入力して下さい。 */
	public static final String PRICE_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "priceBulkCheckInputIntegerLengthError";
	/** 消費税は整数7桁以内を入力して下さい。 */
	public static final String TAX_BULK_CHECK_INPUT_INTEGER_LENGTH_ERROR = "taxBulkCheckInputIntegerLengthError";
	/** プリンタの設定がされていないため帳票が発行できませんでした。 */
	public static final String CAN_NOT_PRINT_PRINTER_NOT_SET_ERROR = "canNotPrintPrinterNotSetError";
	/** 自動出庫指示登録 */
	public static final String CALL_SHIPPING_INST_BATCH_PROGRAM_NAME = "callShippingInstBatchProgramName";
	/** センタCD：[0] , 荷主CD：[1] */
	public static final String CALL_SHIPPING_INST_BATCH_PARAMETER_INFORMATION = "callShippingInstBatchParameterInformation";
	/** センタCD：[0] , 荷主CD：[1] , 出庫指示件数：[2] , エラー件数：[3] */
	public static final String CALL_SHIPPING_INST_BATCH_ERROR_CHECK_INFORMATION = "callShippingInstBatchErrorCheckInformation";
	/** ジョブキューNo.：[0] , コントロールNo.：[1] , [2] */
	public static final String CALL_SHIPPING_INST_BATCH_EXECUTE_INFORMATION = "callShippingInstBatchExecuteInformation";
	/** [0] (出庫作業No.：[1]) */
	public static final String PICKING_WORK_MESSAGE_INFORMATION = "pickingWorkMessageInformation";
	/** 検品済の商品があります。検品済数を確認して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_EXISTS_INSPECTED_PRODUCT_WARN = "singleRowShippingInspectExistsInspectedProductWarn";
	/** 出荷停止の取引先が含まれていましたので検品対象から除外しました。出荷可能な取引先のみ検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_EXISTS_SHIPPING_STOP_CUSTOMER_WARN = "singleRowShippingInspectExistsShippingStopCustomerWarn";
	/** 他のピッキンググループNo.([0])を検品中です。先に検品中のピッキンググループNo.を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_PICKING_GROUP_NO_ERROR = "singleRowShippingInspectOtherPickingGroupNoError";
	/** 他の仮置きNo.([0])を検品中です。先に検品中の仮置きNo.を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_TEMP_NO_ERROR = "singleRowShippingInspectOtherTempNoError";
	/** 他の商品([0])を検品中です。先に検品中の商品を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_PRODUCT_ERROR = "singleRowShippingInspectOtherProductError";
	/** 他の倉庫([0])を検品中です。先に検品中の倉庫を検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_WAREHOUSE_ERROR = "singleRowShippingInspectOtherWarehouseError";
	/** 他のゾーン([0])を検品中です。先に検品中のゾーンを検品して下さい。 */
	public static final String SINGLE_ROW_SHIPPING_INSPECT_OTHER_ZONE_ERROR = "singleRowShippingInspectOtherZoneError";
	/** 出荷停止中の商品です。 */
	public static final String PRODUCT_CANNOT_SELECT_SHIPPING_STOP_ERROR = "productCannotSelectShippingStopError";
	/** 処理は正常終了しましたが、帳票の発行に失敗しました。(エラー内容：[0]) */
	public static final String PROCESS_COMPLETE_FAILED_PRINT_WARN = "processCompleteFailedPrintWarn";
	/** 荷材を選択して下さい。 */
	public static final String BOX_CD_NOT_SELECT_ERROR = "boxCdNotSelectError";
	/** 未出荷以外の出荷指示に対して、欠品解除処理を実行できません。 */
	public static final String CLEAR_SHORTAGE_EXCEPT_NOT_SHIPPING_START_ERROR = "clearShortageExceptNotShippingStartError";
	/** 欠品がない出荷指示に対して、欠品解除処理を実行できません。 */
	public static final String CLEAR_SHORTAGE_EXCEPT_STOCK_OUT_START_ERROR = "clearShortageExceptStockOutStartError";
	/** 1次ピッキングリストおよび2次ピッキングリストが未発行の行が選択されています。 */
	public static final String CLEAR_ISSUE_EXCEPT_NOT_ISSUE_ERROR = "clearIssueExceptNotIssueError";
	/** ケースピッキングリストが未発行の行が選択されています。 */
	public static final String CLEAR_ISSUE_EXCEPT_NOT_CASE_ISSUE_ERROR = "clearIssueExceptNotCaseIssueError";
	/** 1次ピッキングリストおよび2次ピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CONFIRM = "clearIssueExcecuteConfirm";
	/** ケースピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CASE_CONFIRM = "clearIssueExcecuteCaseConfirm";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、1次ピッキングリストおよび2次ピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_STATUS_CONFIRM = "clearIssueExcecuteStatusConfirm";
	/** ピッキング中／済または検品中／済のデータが含まれていますが、ケースピッキングリストの発行解除処理を行いますか？ */
	public static final String CLEAR_ISSUE_EXCECUTE_CASE_STATUS_CONFIRM = "clearIssueExcecuteCaseStatusConfirm";
	/** ピッキング提案は未使用に設定されています。 */
	public static final String PMR_NOT_USE_ERROR = "pmrNotUseError";
	/** ピッキング提案のリクエストURLが未設定です。 */
	public static final String PMR_API_REQUEST_URL_NOT_FOUND_ERROR = "pmrApiRequestUrlNotFoundError";
	/** ピッキング提案システムに接続できません。 */
	public static final String PMR_API_SYSTEM_CANNOT_CONNECT_ERROR = "pmrApiSystemCannotConnectError";
	/** ピッキング提案に失敗しました。[0](問合せ番号：[1])[/][2] */
	public static final String PMR_API_SYSTEM_RESPONSE_ERROR = "pmrApiSystemResponseError";
	/** ピッキング提案 */
	public static final String PICKING_METHOD_RECOMMENDATION_PROGRAM_NAME = "pickingMethodRecommendationProgramName";
	/** センタCD：[0] , 荷主CD：[1] , 作業日：[2] , 納品先件数：[3] , ブレイクキー：[4] */
	public static final String PICKING_METHOD_RECOMMENDATION_PARAMETER_INFORMATION = "pickingMethodRecommendationParameterInformation";
	/** ピッキング提案を実施しますか？ */
	public static final String PICKING_METHOD_RECOMMENDATION_CALL_CONFIRM = "pickingMethodRecommendationCallConfirm";
	/** ピッキング提案を実施しますか？現在の提案データは削除されます。 */
	public static final String PICKING_METHOD_RECOMMENDATION_CALL_WITH_DELETE_CONFIRM = "pickingMethodRecommendationCallWithDeleteConfirm";
	/** 出庫指示済以外のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ILLEGAL_SHIP_STATUS_ERROR = "pmrPickingListCannotPrintIllegalShipStatusError";
	/** 1次ピッキングリスト発行済のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_ERROR = "pmrPickingListCannotPrintAlreadyPrintedError";
	/** ケースピッキングリスト発行済のデータが含まれています。再提案を実行してください。 */
	public static final String PMR_PICKING_LIST_CANNOT_PRINT_ALREADY_PRINTED_CASE_ERROR = "pmrPickingListCannotPrintAlreadyPrintedCaseError";
	/** 単行ピッキング対象です。単行出荷検品から検品を行ってください。 */
	public static final String SINGLE_ROW_PICKING_TARGET_ERROR = "singleRowPickingTargetError";
	/** MACアドレスが重複しています。 */
	public static final String MAC_ADDRESS_DUPLICATE_ERROR = "macAddressDuplicateError";
	/** 郵便番号マスタ一括登録 */
	public static final String ZIP_MASTER_BULK_INPUT_PROGRAM_NAME_INFORMATION = "zipMasterBulkInputProgramNameInformation";
	/** 全国地方公共団体コードは最大5文字以下を入力して下さい。 */
	public static final String PUBLIC_CD_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "publicCdBulkInputCheckInputMaxError";
	/** 旧郵便番号は最大5文字以下を入力して下さい。 */
	public static final String ZIP_CD5_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipCd5BulkInputCheckInputMaxError";
	/** 都道府県名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN1_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn1BulkInputCheckInputMaxError";
	/** 市区町村名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN2_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn2BulkInputCheckInputMaxError";
	/** 町域名カナは最大76文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS_KN3_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddressKn3BulkInputCheckInputMaxError";
	/** 大口事業所名カナ は最大100文字以下を入力して下さい。 */
	public static final String COMPANY_KN_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "companyKnBulkInputCheckInputMaxError";
	/** 都道府県名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS1_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress1BulkInputCheckInputMaxError";
	/** 市区町村名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS2_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress2BulkInputCheckInputMaxError";
	/** 町域名は最大38文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS3_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress3BulkInputCheckInputMaxError";
	/** 小字（丁目、番地等）は最大62文字以下を入力して下さい。 */
	public static final String ZIP_ADDRESS4_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "zipAddress4BulkInputCheckInputMaxError";
	/** 大口事業所名は最大80文字以下を入力して下さい。 */
	public static final String COMPANY_NM_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "companyNmBulkInputCheckInputMaxError";
	/** 取扱局は最大20文字以下を入力して下さい。 */
	public static final String HANDLING_ADDRESS_BULK_INPUT_CHECK_INPUT_MAX_ERROR = "handlingAddressBulkInputCheckInputMaxError";
	/** 大口事業所フラグが存在しません。 */
	public static final String COMPANY_FLG_NOT_FOUND_ERROR = "companyFlgNotFoundError";
	/** 選択したピッキングリストと異なる一次ピッキングリストを発行したデータが存在します。 */
	public static final String PICKING_LIST_CANNOT_PRINT_EXISTS_OTHER_LIST_PRINT_ERROR = "pickingListCannotPrintExistsOtherListPrintError";
	/** 出勤されていません。 */
	public static final String NOT_ATTENDANCE_ERROR = "notAttendanceError";
	/** 既に出勤されています。 */
	public static final String ALREADY_ATTENDANCE_ERROR = "alreadyAttendanceError";
	/** 既に退勤されています。 */
	public static final String ALREADY_LEAVE_WORK_ERROR = "alreadyLeaveWorkError";
	/** 休憩開始が選択されていません。 */
	public static final String BREAK_START_IS_NOT_SELECTED = "breakStartIsNotSelected";
	/** 【出勤】【退勤】【休憩開始】【休憩終了】のいずれかを選択してください。 */
	public static final String NOT_ATTENDANCE_LEAVE_WORK_REST_SELECTED_ERROR = "notAttendanceLeaveWorkRestSelectedError";
	/** シフトカレンダーが登録されていません。管理者に問い合わせてください。 */
	public static final String SHIFT_CALENDAR_IS_NOT_REGISTERED = "shiftCalendarIsNotRegistered";
	/** 労務マスタが登録されていません。管理者に問い合わせてください。 */
	public static final String LABOR_MASTER_IS_NOT_REGISTERED = "laborMasterIsNotRegistered";
	/** エントリーユニット（休憩）が登録されていません。管理者に問い合わせてください。 */
	public static final String BREAK_ENTRY_UNIT_IS_NOT_REGISTERED = "breakEntryUnitIsNotRegistered";
	/** センタCD:[0]で[1]が出勤を選択しました。 */
	public static final String SELECT_ATTENDANCE_LOG = "selectAttendanceLog";
	/** センタCD:[0]で[1]が退勤を選択しました。 */
	public static final String SELECT_LEAVE_WORK_LOG = "selectLeaveWorkLog";
	/** センタCD:[0]で[1]が休憩開始を選択しました。 */
	public static final String SELECT_START_BREAK_LOG = "selectStartBreakLog";
	/** センタCD:[0]で[1]が休憩終了を選択しました。 */
	public static final String SELECT_END_BREAK_LOG = "selectEndBreakLog";
	/** ユーザマスタに存在しません。 */
	public static final String DOES_NOT_EXIST_IN_THE_B_USER_ERROR = "doesNotExistInTheBUserError";
	/** 取込が完了しました。取込件数：[0]件、除外件数：[1]件 */
	public static final String ZIP_INSERT_INFO = "zipInsertInfo";
	/** 受信CD：[0] , 郵便番号種別：[1] */
	public static final String EDI_ZIP_PARAMETER_INFORMATION = "ediZipParameterInformation";
	/** 登録件数：[0]件 , 更新件数：[1]件 , 除外件数：[2]件 */
	public static final String ZIP_INSERT_BATCH_INFO = "zipInsertBatchInfo";
	/** 複数の出荷伝票に出庫作業メッセージが登録されています。全ての出庫作業メッセージが上書きされますが宜しいですか？ */
	public static final String PICKING_WORK_MESSAGE_UPDATE_MULTIPLE_OVERWRITE_CONFIRM = "pickingWorkMessageUpdateMultipleOverwriteConfirm";
	/** 既に休憩開始されています。 */
	public static final String BREAK_START_DUPLICATE_ERROR = "breakStartDuplicateError";
	/** 他センタで出勤されていますので、出勤したセンタに切り替えてください。 */
	public static final String ALREADY_ATTENDANCE_ANOTHER_ERROR = "alreadyAttendanceAnotherError";
	/** 作業者CD・パスワードに誤りがあるか、作業者CDが存在しません。 */
	public static final String USER_CD_OR_PASSWORD_INPUT_ERROR = "userCdOrPasswordInputError";
	/** 作業者CDが存在しません。 */
	public static final String USER_CD_NOT_FOUND_ERROR = "userCdNotFoundError";
	/** ログインセンタが切り替えられた為、リロードします。 */
	public static final String LOGIN_CENTER_CHANGE_INFO = "loginCenterChangeInfo";
	/** 時刻の入力が不正です(形式:hhmm)。 */
	public static final String HANDY_TIME_ERROR = "handyTimeError";
	/** 取消済のデータが含まれている為、発行はできません。 */
	public static final String CANCEL_DATA_CANNOT_OUTPUT_ERROR = "cancelDataCannotOutputError";
	/** 指示数量が引当可能数を超えている為、選択できません。 */
	public static final String INST_CHARGE_NUM_OVER_STOCK_CHARGE_NUM_ERROR = "instChargeNumOverStockChargeNumError";
	/** トランザクション保持期間が設定されているため、EC受注データの保持期間を削除なしに設定できません。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_T_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalTKeepingDaysError";
	/** 未処理データ保持期間が設定されているため、EC受注データの保持期間を削除なしに設定できません。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_D_KEEPING_DAYS_ERROR = "dailyProcessCannotExecuteIllegalDKeepingDaysError";
	/** EC受注データの保持期間が未処理データ保持期間より長く設定されています。 */
	public static final String DAILY_PROCESS_CANNOT_EXECUTE_ILLEGAL_UNPROCESS_KEEP_DAYS_ERROR = "dailyProcessCannotExecuteIllegalUnprocessKeepDaysError";
	/** 該当データは出荷検品できない状態に変更されました。 */
	public static final String SHIPPING_INSPECT_DATA_ALREADY_UPDATED_ERROR = "shippingInspectDataAlreadyUpdatedError";
	/** 該当データは梱包明細修正ができない状態に変更されました。 */
	public static final String PACKING_LIST_UPDATE_DATA_ALREADY_UPDATED_ERROR = "packingListUpdateDataAlreadyUpdatedError";
	/** 出荷確定済の為、作業を完了できません。 */
	public static final String HANDY_SHIPPING_CONFIRM_ERROR = "handyShippingConfirmError";
	/** 荷揃マスタで使用されているため処理できません。 */
	public static final String SHIP_PATTERN_ID_USE_ERROR = "shipPatternIdUseError";
	/** 荷揃パターンマスタで設定されてません。 */
	public static final String NIZOROE_TYPE_CD_NOT_FOUND_IN_MASTER_ERROR = "nizoroeTypeCdNotFoundInMasterError";
	/** 得意先が取引先マスタに存在しません。 */
	public static final String ACCOUNT_NOT_FOUND_IN_MASTER_ERROR = "accountNotFoundInMasterError";
	/** 休日振替業者と祝日振替業者は同じにして下さい。 */
	public static final String HOLIDAY_CARRIER_UNMATCH_ERROR = "holidayCarrierUnmatchError";
	/** 拠点と年度を指定して下さい。 */
	public static final String SPECIFY_BASE_AND_YEAR_COMFIRMATION = "specifyBaseAndYearComfirmation";
	/** 荷揃区分を入力して下さい。 */
	public static final String NIZOROE_TYPE_CD_NOT_ENTERED_ERROR = "nizoroeTypeCdNotEnteredError";
	/** 荷揃区分 英数字のみ */
	public static final String NIZOROE_TYPE_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "nizoroeTypeCdCheckAlphabetAndNumericOnlyError";
	/** 区分値マスタに存在しません。 */
	public static final String CLASS_CD_NOT_FOUND_IN_MASTER_ERROR = "classCdNotFoundInMasterError";
	/** 荷揃処理IDを入力して下さい。 */
	public static final String NIZOROE_ID_NOT_ENTERED_ERROR = "nizoroeIdNotEnteredError";
	/** 荷揃処理ID 英数字のみ */
	public static final String NIZOROE_PROCESS_ID_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "nizoroeProcessIdCheckAlphabetAndNumericOnlyError";
	/** 荷揃処理IDは最大[0]文字以下を入力して下さい。 */
	public static final String NIZOROE_PROCESS_ID_LENGTH_CHECK_MAX_ERROR = "nizoroeProcessIdLengthCheckMaxError";
	/** 荷揃処パターンマスタに存在しない荷揃処理IDが含まれています。（荷揃処理ID：[0]） */
	public static final String CONTAINS_NIZOROE_PROC_ID_NOT_IN_NIZOROE_PATERN_MASTER = "containsNizoroeProcIdNotInNizoroePaternMaster";
	/** 削除を入力して下さい。 */
	public static final String DEL_FLG_NOT_ENTERED_ERROR = "delFlgNotEnteredError";
	/** 削除 0と1のみ */
	public static final String DEL_FLG_ZERO_AND_ONE_ONLY_ERROR = "delFlgZeroAndOneOnlyError";
	/** EC単位名の桁数が範囲外です。 */
	public static final String EC_UNIT_NM_LENGTH_OUT_OF_RANGE_ERROR = "ecUnitNmLengthOutOfRangeError";
	/** ＥＣ発注番号_枝番の桁数が範囲外です。 */
	public static final String EC_ORDER_BRANCH_NO_LENGTH_OUT_OF_RANGE_ERROR = "ecOrderBranchNoLengthOutOfRangeError";
	/** ＥＣ発注番号の桁数が範囲外です。 */
	public static final String EC_ORDER_NO_LENGTH_OUT_OF_RANGE_ERROR = "ecOrderNoLengthOutOfRangeError";
	/** EC品名漢字の桁数が範囲外です。 */
	public static final String EC_PRODUCT_NM_KANJI_LENGTH_OUT_OF_RANGE_ERROR = "ecProductNmKanjiLengthOutOfRangeError";
	/** JANコードの桁数が範囲外です。 */
	public static final String JAN_CD_LENGTH_OUT_OF_RANGE_ERROR = "janCdLengthOutOfRangeError";
	/** 運送業者コードが存在しません。 */
	public static final String CARRIER_CD_NULL_ERROR = "carrierCdNullError";
	/** 運送便コードが存在しません。 */
	public static final String DELIVERY_COURSE_CD_NULL_ERROR = "deliveryCourseCdNullError";
	/** カナメッセージ_10の桁数が範囲外です。 */
	public static final String KANA_MESSAGE10_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage10LengthOutOfRangeError";
	/** カナメッセージ_1の桁数が範囲外です。 */
	public static final String KANA_MESSAGE1_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage1LengthOutOfRangeError";
	/** カナメッセージ_2の桁数が範囲外です。 */
	public static final String KANA_MESSAGE2_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage2LengthOutOfRangeError";
	/** カナメッセージ_3の桁数が範囲外です。 */
	public static final String KANA_MESSAGE3_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage3LengthOutOfRangeError";
	/** カナメッセージ_4の桁数が範囲外です。 */
	public static final String KANA_MESSAGE4_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage4LengthOutOfRangeError";
	/** カナメッセージ_5の桁数が範囲外です。 */
	public static final String KANA_MESSAGE5_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage5LengthOutOfRangeError";
	/** カナメッセージ_6の桁数が範囲外です。 */
	public static final String KANA_MESSAGE6_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage6LengthOutOfRangeError";
	/** カナメッセージ_7の桁数が範囲外です。 */
	public static final String KANA_MESSAGE7_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage7LengthOutOfRangeError";
	/** カナメッセージ_8の桁数が範囲外です。 */
	public static final String KANA_MESSAGE8_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage8LengthOutOfRangeError";
	/** カナメッセージ_9の桁数が範囲外です。 */
	public static final String KANA_MESSAGE9_LENGTH_OUT_OF_RANGE_ERROR = "kanaMessage9LengthOutOfRangeError";
	/** 合計金額(税込)が数値以外です。 */
	public static final String TOTAL_PRICE_WITH_TAX_CHECK_NUMERIC_ONLY_ERROR = "totalPriceWithTaxCheckNumericOnlyError";
	/** サンプル区分の桁数が範囲外です。 */
	public static final String SAMPLE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "sampleTypeCdLengthOutOfRangeError";
	/** 受注数量が数値以外です。 */
	public static final String SALES_ORDER_NUM_CHECK_NUMERIC_ONLY_ERROR = "salesOrderNumCheckNumericOnlyError";
	/** 出荷数が数値以外です。 */
	public static final String SHIPPING_NUM_CHECK_NUMERIC_ONLY_ERROR = "shippingNumCheckNumericOnlyError";
	/** 出荷数が存在しません。 */
	public static final String SHIPPING_NUM_NULL_ERROR = "shippingNumNullError";
	/** 出荷伝票番号が存在しません。 */
	public static final String SHIPPING_SLIP_NO_NULL_ERROR = "shippingSlipNoNullError";
	/** 出荷伝票番号の桁数が範囲外です。 */
	public static final String SHIPPING_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "shippingSlipNoLengthOutOfRangeError";
	/** 出荷発生事由が存在しません。 */
	public static final String SHIPPING_REASON_NULL_ERROR = "shippingReasonNullError";
	/** 出荷日が数値以外です。 */
	public static final String SHIPPING_DT_CHECK_NUMERIC_ONLY_ERROR = "shippingDtCheckNumericOnlyError";
	/** 出荷日が存在しません。 */
	public static final String SHIPPING_DT_NULL_ERROR = "shippingDtNullError";
	/** 出荷伝票明細番号が存在しません。 */
	public static final String SHIPPING_SLIP_ROW_NO_NULL_ERROR = "shippingSlipRowNoNullError";
	/** ステータスの桁数が範囲外です。 */
	public static final String STATUS_LENGTH_OUT_OF_RANGE_ERROR = "statusLengthOutOfRangeError";
	/** 注文日が数値以外です。 */
	public static final String ORDER_DT_CHECK_NUMERIC_ONLY_ERROR = "orderDtCheckNumericOnlyError";
	/** 荷揃番号が存在しません。 */
	public static final String NIZOROE_NO_NULL_ERROR = "nizoroeNoNullError";
	/** 入庫プラントの桁数が範囲外です。 */
	public static final String STORE_PLANT_LENGTH_OUT_OF_RANGE_ERROR = "storePlantLengthOutOfRangeError";
	/** 入庫保管場所の桁数が範囲外です。 */
	public static final String STORE_STORAGE_SPACE_CD_LENGTH_OUT_OF_RANGE_ERROR = "storeStorageSpaceCdLengthOutOfRangeError";
	/** 配達指定時間が数値以外です。 */
	public static final String SPECIFY_DELIVERY_TIME_CHECK_NUMERIC_ONLY_ERROR = "specifyDeliveryTimeCheckNumericOnlyError";
	/** 配達指定日が数値以外です。 */
	public static final String SPECIFY_DELIVERY_DT_CHECK_NUMERIC_ONLY_ERROR = "specifyDeliveryDtCheckNumericOnlyError";
	/** 販売組織の桁数が範囲外です。 */
	public static final String SALES_ORG_LENGTH_OUT_OF_RANGE_ERROR = "salesOrgLengthOutOfRangeError";
	/** 品目グループが存在しません。 */
	public static final String HINMOKU_GROUP_NULL_ERROR = "hinmokuGroupNullError";
	/** 品目コードが存在しません。 */
	public static final String HINMOKU_CD_NULL_ERROR = "hinmokuCdNullError";
	/** ヘルメット区分の桁数が範囲外です。 */
	public static final String HELMET_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "helmetTypeCdLengthOutOfRangeError";
	/** ポイントの桁数が範囲外です。 */
	public static final String POINT_LENGTH_OUT_OF_RANGE_ERROR = "pointLengthOutOfRangeError";
	/** マーク名称の桁数が範囲外です。 */
	public static final String MARK_NM_LENGTH_OUT_OF_RANGE_ERROR = "markNmLengthOutOfRangeError";
	/** ロット管理区分の桁数が範囲外です。 */
	public static final String LOT_MANAGE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "lotManageTypeCdLengthOutOfRangeError";
	/** 運送会社区分の桁数が範囲外です。 */
	public static final String CARRIER_COMPANY_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "carrierCompanyTypeCdLengthOutOfRangeError";
	/** 運送業者コードの桁数が範囲外です。 */
	public static final String CARRIER_CD_LENGTH_OUT_OF_RANGE_ERROR = "carrierCdLengthOutOfRangeError";
	/** 運送便コードの桁数が範囲外です。 */
	public static final String DELIVERY_COURSE_CD_LENGTH_OUT_OF_RANGE_ERROR = "deliveryCourseCdLengthOutOfRangeError";
	/** 荷揃番号の桁数が範囲外です。 */
	public static final String NIZOROE_NO_LENGTH_OUT_OF_RANGE_ERROR = "nizoroeNoLengthOutOfRangeError";
	/** 漢字メッセージ_10の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE10_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage10LengthOutOfRangeError";
	/** 漢字メッセージ_1の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE1_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage1LengthOutOfRangeError";
	/** 漢字メッセージ_2の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE2_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage2LengthOutOfRangeError";
	/** 漢字メッセージ_3の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE3_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage3LengthOutOfRangeError";
	/** 漢字メッセージ_4の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE4_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage4LengthOutOfRangeError";
	/** 漢字メッセージ_5の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE5_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage5LengthOutOfRangeError";
	/** 漢字メッセージ_6の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE6_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage6LengthOutOfRangeError";
	/** 漢字メッセージ_7の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE7_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage7LengthOutOfRangeError";
	/** 漢字メッセージ_8の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE8_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage8LengthOutOfRangeError";
	/** 漢字メッセージ_9の桁数が範囲外です。 */
	public static final String KANJI_MESSAGE9_LENGTH_OUT_OF_RANGE_ERROR = "kanjiMessage9LengthOutOfRangeError";
	/** 金額非表示フラグの桁数が範囲外です。 */
	public static final String PRICE_HIDDEN_FLG_LENGTH_OUT_OF_RANGE_ERROR = "priceHiddenFlgLengthOutOfRangeError";
	/** 決済区分の桁数が範囲外です。 */
	public static final String PAYMENT_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "paymentTypeCdLengthOutOfRangeError";
	/** 決済非表示フラグの桁数が範囲外です。 */
	public static final String PAYMENT_HIDDEN_FLG_LENGTH_OUT_OF_RANGE_ERROR = "paymentHiddenFlgLengthOutOfRangeError";
	/** 戸口配送フラグの桁数が範囲外です。 */
	public static final String KOGUCHI_DELIVERY_FLG_LENGTH_OUT_OF_RANGE_ERROR = "koguchiDeliveryFlgLengthOutOfRangeError";
	/** 戸配契約先コードの桁数が範囲外です。 */
	public static final String KOHAI_CONTRACTOR_NM_LENGTH_OUT_OF_RANGE_ERROR = "kohaiContractorNmLengthOutOfRangeError";
	/** 戸配契約先名称の桁数が範囲外です。 */
	public static final String KOHAI_CONTRACTOR_CD_LENGTH_OUT_OF_RANGE_ERROR = "kohaiContractorCdLengthOutOfRangeError";
	/** 顧客コードの桁数が範囲外です。 */
	public static final String KOKYAKU_CD_LENGTH_OUT_OF_RANGE_ERROR = "kokyakuCdLengthOutOfRangeError";
	/** 更新時間_時が数値以外です。 */
	public static final String SAP_UPD_HH_CHECK_NUMERIC_ONLY_ERROR = "sapUpdHhCheckNumericOnlyError";
	/** 更新時間_時の桁数が範囲外です。 */
	public static final String SAP_UPD_HH_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdHhLengthOutOfRangeError";
	/** 更新時間_秒が数値以外です。 */
	public static final String SAP_UPD_SS_CHECK_NUMERIC_ONLY_ERROR = "sapUpdSsCheckNumericOnlyError";
	/** 更新時間_秒の桁数が範囲外です。 */
	public static final String SAP_UPD_SS_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdSsLengthOutOfRangeError";
	/** 更新時間_分が数値以外です。 */
	public static final String SAP_UPD_MI_CHECK_NUMERIC_ONLY_ERROR = "sapUpdMiCheckNumericOnlyError";
	/** 更新時間_分の桁数が範囲外です。 */
	public static final String SAP_UPD_MI_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdMiLengthOutOfRangeError";
	/** 更新者が数値以外です。 */
	public static final String SAP_UPD_USER_CD_CHECK_NUMERIC_ONLY_ERROR = "sapUpdUserCdCheckNumericOnlyError";
	/** 更新者の桁数が範囲外です。 */
	public static final String SAP_UPD_USER_CD_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdUserCdLengthOutOfRangeError";
	/** 更新日_月が数値以外です。 */
	public static final String SAP_UPD_MM_CHECK_NUMERIC_ONLY_ERROR = "sapUpdMmCheckNumericOnlyError";
	/** 更新日_月の桁数が範囲外です。 */
	public static final String SAP_UPD_MM_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdMmLengthOutOfRangeError";
	/** 更新日_日が数値以外です。 */
	public static final String SAP_UPD_DD_CHECK_NUMERIC_ONLY_ERROR = "sapUpdDdCheckNumericOnlyError";
	/** 更新日_日の桁数が範囲外です。 */
	public static final String SAP_UPD_DD_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdDdLengthOutOfRangeError";
	/** 更新日_年が数値以外です。 */
	public static final String SAP_UPD_YYYY_CHECK_NUMERIC_ONLY_ERROR = "sapUpdYyyyCheckNumericOnlyError";
	/** 更新日_年の桁数が範囲外です。 */
	public static final String SAP_UPD_YYYY_LENGTH_OUT_OF_RANGE_ERROR = "sapUpdYyyyLengthOutOfRangeError";
	/** 合計金額(税込)の桁数が範囲外です。 */
	public static final String TOTAL_PRICE_LENGTH_OUT_OF_RANGE_ERROR = "totalPriceLengthOutOfRangeError";
	/** 作成時間_時が数値以外です。 */
	public static final String SAP_ADD_HH_CHECK_NUMERIC_ONLY_ERROR = "sapAddHhCheckNumericOnlyError";
	/** 作成時間_時の桁数が範囲外です。 */
	public static final String SAP_ADD_HH_LENGTH_OUT_OF_RANGE_ERROR = "sapAddHhLengthOutOfRangeError";
	/** 作成時間_秒が数値以外です。 */
	public static final String SAP_ADD_SS_CHECK_NUMERIC_ONLY_ERROR = "sapAddSsCheckNumericOnlyError";
	/** 作成時間_秒の桁数が範囲外です。 */
	public static final String SAP_ADD_SS_LENGTH_OUT_OF_RANGE_ERROR = "sapAddSsLengthOutOfRangeError";
	/** 作成時間_分が数値以外です。 */
	public static final String SAP_ADD_MI_CHECK_NUMERIC_ONLY_ERROR = "sapAddMiCheckNumericOnlyError";
	/** 作成時間_分の桁数が範囲外です。 */
	public static final String SAP_ADD_MI_LENGTH_OUT_OF_RANGE_ERROR = "sapAddMiLengthOutOfRangeError";
	/** 作成者が数値以外です。 */
	public static final String SAP_ADD_USER_CHECK_NUMERIC_ONLY_ERROR = "sapAddUserCheckNumericOnlyError";
	/** 作成者の桁数が範囲外です。 */
	public static final String SAP_ADD_USER_LENGTH_OUT_OF_RANGE_ERROR = "sapAddUserLengthOutOfRangeError";
	/** 作成日_月が数値以外です。 */
	public static final String SAP_ADD_MM_CHECK_NUMERIC_ONLY_ERROR = "sapAddMmCheckNumericOnlyError";
	/** 作成日_月の桁数が範囲外です。 */
	public static final String SAP_ADD_MM_LENGTH_OUT_OF_RANGE_ERROR = "sapAddMmLengthOutOfRangeError";
	/** 作成日_日が数値以外です。 */
	public static final String SAP_ADD_DD_CHECK_NUMERIC_ONLY_ERROR = "sapAddDdCheckNumericOnlyError";
	/** 作成日_日の桁数が範囲外です。 */
	public static final String SAP_ADD_DD_LENGTH_OUT_OF_RANGE_ERROR = "sapAddDdLengthOutOfRangeError";
	/** 作成日_年が数値以外です。 */
	public static final String SAP_ADD_YYYY_CHECK_NUMERIC_ONLY_ERROR = "sapAddYyyyCheckNumericOnlyError";
	/** 作成日_年の桁数が範囲外です。 */
	public static final String SAP_ADD_YYYY_LENGTH_OUT_OF_RANGE_ERROR = "sapAddYyyyLengthOutOfRangeError";
	/** 社員氏名の桁数が範囲外です。 */
	public static final String EMP_NM_LENGTH_OUT_OF_RANGE_ERROR = "empNmLengthOutOfRangeError";
	/** 社員識別コードの桁数が範囲外です。 */
	public static final String EMP_ID_LENGTH_OUT_OF_RANGE_ERROR = "empIdLengthOutOfRangeError";
	/** 取引区分の桁数が範囲外です。 */
	public static final String DEAL_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "dealTypeCdLengthOutOfRangeError";
	/** 取引先コードの桁数が範囲外です。 */
	public static final String CUSTOMER_CD_LENGTH_OUT_OF_RANGE_ERROR = "customerCdLengthOutOfRangeError";
	/** 取引先名称の桁数が範囲外です。 */
	public static final String CUSTOMER_NM_LENGTH_OUT_OF_RANGE_ERROR = "customerNmLengthOutOfRangeError";
	/** 受注数量の桁数が範囲外です。 */
	public static final String SALES_ORDER_NUM_LENGTH_OUT_OF_RANGE_ERROR = "salesOrderNumLengthOutOfRangeError";
	/** 受注伝票タイプの桁数が範囲外です。 */
	public static final String SALES_ORDER_SLIP_TYPE_LENGTH_OUT_OF_RANGE_ERROR = "salesOrderSlipTypeLengthOutOfRangeError";
	/** 受注伝票番号の桁数が範囲外です。 */
	public static final String SALES_ORDER_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "salesOrderSlipNoLengthOutOfRangeError";
	/** 受注番号の桁数が範囲外です。 */
	public static final String SALES_ORDER_NO_LENGTH_OUT_OF_RANGE_ERROR = "salesOrderNoLengthOutOfRangeError";
	/** 出荷区分が存在しません。 */
	public static final String SHIPPING_TYPE_CD_NULL_ERROR = "shippingTypeCdNullError";
	/** 出荷区分の桁数が範囲外です。 */
	public static final String SHIPPING_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "shippingTypeCdLengthOutOfRangeError";
	/** 出荷数の桁数が範囲外です。 */
	public static final String SHIPPING_NUM_LENGTH_OUT_OF_RANGE_ERROR = "shippingNumLengthOutOfRangeError";
	/** 出荷日が日付ではありません。 */
	public static final String SHIPPING_DT_CHECK_NOT_DATE_FORMAT_ERROR = "shippingDtCheckNotDateFormatError";
	/** 出荷日の桁数が範囲外です。 */
	public static final String SHIPPING_DT_LENGTH_OUT_OF_RANGE_ERROR = "shippingDtLengthOutOfRangeError";
	/** 出荷発生事由の桁数が範囲外です。 */
	public static final String SHIPPING_REASON_LENGTH_OUT_OF_RANGE_ERROR = "shippingReasonLengthOutOfRangeError";
	/** 出荷伝票明細番号の桁数が範囲外です。 */
	public static final String SHIPPING_SLIP_ROW_NO_LENGTH_OUT_OF_RANGE_ERROR = "shippingSlipRowNoLengthOutOfRangeError";
	/** 出庫プラントが存在しません。 */
	public static final String SHIPPING_PLANT_CD_NULL_ERROR = "shippingPlantCdNullError";
	/** 出庫プラントの桁数が範囲外です。 */
	public static final String SHIPPING_PLANT_LENGTH_OUT_OF_RANGE_ERROR = "shippingPlantLengthOutOfRangeError";
	/** 出庫保管場所が存在しません。 */
	public static final String SHIPPING_STORAGE_SPACE_CD_NULL_ERROR = "shippingStorageSpaceCdNullError";
	/** 出庫保管場所の桁数が範囲外です。 */
	public static final String SHIPPING_STORAGE_SPACE_CD_LENGTH_OUT_OF_RANGE_ERROR = "shippingStorageSpaceCdLengthOutOfRangeError";
	/** 商品単価(税込)が数値以外です。 */
	public static final String UNIT_PRICE_WITH_TAX_CHECK_NUMERIC_ONLY_ERROR = "unitPriceWithTaxCheckNumericOnlyError";
	/** 商品単価(税込)の桁数が範囲外です。 */
	public static final String UNIT_PRICE_WITH_TAX_LENGTH_OUT_OF_RANGE_ERROR = "unitPriceWithTaxLengthOutOfRangeError";
	/** 消費税率が数値以外です。 */
	public static final String TAX_RATE_CHECK_NUMERIC_ONLY_ERROR = "taxRateCheckNumericOnlyError";
	/** 消費税率の桁数が範囲外です。 */
	public static final String TAX_RATE_LENGTH_OUT_OF_RANGE_ERROR = "taxRateLengthOutOfRangeError";
	/** 送り状摘要の桁数が範囲外です。 */
	public static final String INVOICE_SUMMARY_LENGTH_OUT_OF_RANGE_ERROR = "invoiceSummaryLengthOutOfRangeError";
	/** 送り先ＦＡＸ番号の桁数が範囲外です。 */
	public static final String DESTINATION_FAX_LENGTH_OUT_OF_TANGE_ERROR = "destinationFaxLengthOutOfTangeError";
	/** 送り先コードの桁数が範囲外です。 */
	public static final String DESTINATION_CD_LENGTH_OUT_OF_TANGE_ERROR = "destinationCdLengthOutOfTangeError";
	/** 送り先都道府県の桁数が範囲外です。 */
	public static final String DESTINATION_PREFECTURE_LENGTH_OUT_OF_TANGE_ERROR = "destinationPrefectureLengthOutOfTangeError";
	/** 送り先住所１の桁数が範囲外です。 */
	public static final String DESTINATION_ADDRESS1_LENGTH_OUT_OF_RANGE_ERROR = "destinationAddress1LengthOutOfRangeError";
	/** 送り先住所２の桁数が範囲外です。 */
	public static final String DESTINATION_ADDRESS2_LENGTH_OUT_OF_RANGE_ERROR = "destinationAddress2LengthOutOfRangeError";
	/** 送り先電話番号の桁数が範囲外です。 */
	public static final String DESTINATION_TEL_NO_LENGTH_OUT_OF_TANGE_ERROR = "destinationTelNoLengthOutOfTangeError";
	/** 送り先名称_カナの桁数が範囲外です。 */
	public static final String DESTINATION_NM_KANA_LENGTH_OUT_OF_TANGE_ERROR = "destinationNmKanaLengthOutOfTangeError";
	/** 送り先名称１の桁数が範囲外です。 */
	public static final String DESTINATION_NM1_LENGTH_OUT_OF_TANGE_ERROR = "destinationNm1LengthOutOfTangeError";
	/** 送り先名称２の桁数が範囲外です。 */
	public static final String DESTINATION_NM2_LENGTH_OUT_OF_TANGE_ERROR = "destinationNm2LengthOutOfTangeError";
	/** 送り先郵便番号の桁数が範囲外です。 */
	public static final String DESTINATION_ZIP_CD_LENGTH_OUT_OF_TANGE_ERROR = "destinationZipCdLengthOutOfTangeError";
	/** 送料(税込)が数値以外です。 */
	public static final String SHIPPING_FEE_WITH_TAX_CHECK_NUMERIC_ONLY_ERROR = "shippingFeeWithTaxCheckNumericOnlyError";
	/** 送料(税込)の桁数が範囲外です。 */
	public static final String SHIPPING_FEE_LENGTH_OUT_OF_RANGE_ERROR = "shippingFeeLengthOutOfRangeError";
	/** 代引手数料(税込)が数値以外です。 */
	public static final String COD_FEE_WITH_TAX_CHECK_NUMERIC_ONLY_ERROR = "codFeeWithTaxCheckNumericOnlyError";
	/** 代引手数料(税込)の桁数が範囲外です。 */
	public static final String COD_FEE_WITH_TAX_LENGTH_OUT_OF_RANGE_ERROR = "codFeeWithTaxLengthOutOfRangeError";
	/** 単位名称の桁数が範囲外です。 */
	public static final String UNIT_NM_LENGTH_OUT_OF_RANGE_ERROR = "unitNmLengthOutOfRangeError";
	/** 注文日が日付ではありません。 */
	public static final String ORDER_DT_CHECK_NOT_DATE_FORMAT_ERROR = "orderDtCheckNotDateFormatError";
	/** 注文日の桁数が範囲外です。 */
	public static final String ORDER_DT_LENGTH_OUT_OF_RANGE_ERROR = "orderDtLengthOutOfRangeError";
	/** 注文番号_納品書の桁数が範囲外です。 */
	public static final String ORDER_NO_DELIVERY_NOTE_LENGTH_OUT_OF_RANGE_ERROR = "orderNoDeliveryNoteLengthOutOfRangeError";
	/** 直送区分の桁数が範囲外です。 */
	public static final String DIRECT_DELIVERY_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "directDeliveryTypeCdLengthOutOfRangeError";
	/** 店販社コードの桁数が範囲外です。 */
	public static final String TENHANSHA_CD_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaCdLengthOutOfRangeError";
	/** 店販社発注番号の桁数が範囲外です。 */
	public static final String TENHANSHA_ORDER_NO_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaOrderNoLengthOutOfRangeError";
	/** 納入先コードの桁数が範囲外です。 */
	public static final String DELIV_CD_LENGTH_OUT_OF_RANGE_ERROR = "delivCdLengthOutOfRangeError";
	/** 納品書摘要の桁数が範囲外です。 */
	public static final String DELIVERY_NOTE_SUMMARY_LENGTH_OUT_OF_RANGE_ERROR = "deliveryNoteSummaryLengthOutOfRangeError";
	/** 配達指定時間の桁数が範囲外です。 */
	public static final String SPECIFY_DELIVERY_TIME_LENGTH_OUT_OF_RANGE_ERROR = "specifyDeliveryTimeLengthOutOfRangeError";
	/** 配達指定日が日付ではありません。 */
	public static final String SPECIFY_DELIVERY_DT_NOT_DATE_FORMAT_ERROR = "specifyDeliveryDtNotDateFormatError";
	/** 配達指定日の桁数が範囲外です。 */
	public static final String SPECIFY_DELIVERY_DT_LENGTH_OUT_OF_RANGE_ERROR = "specifyDeliveryDtLengthOutOfRangeError";
	/** 品目グループの桁数が範囲外です。 */
	public static final String HINMOKU_GROUP_LENGTH_OUT_OF_RANGE_ERROR = "hinmokuGroupLengthOutOfRangeError";
	/** 品目コードの桁数が範囲外です。 */
	public static final String HINMOKU_CD_LENGTH_OUT_OF_RANGE_ERROR = "hinmokuCdLengthOutOfRangeError";
	/** 品目テキストの桁数が範囲外です。 */
	public static final String HINMOKU_TEXT_LENGTH_OUT_OF_RANGE_ERROR = "hinmokuTextLengthOutOfRangeError";
	/** 物流重量物フラグの桁数が範囲外です。 */
	public static final String LOGI_WEIGHT_FLG_LENGTH_OUT_OF_RANGE_ERROR = "logiWeightFlgLengthOutOfRangeError";
	/** 物流注意区分の桁数が範囲外です。 */
	public static final String LOGI_ATTENTION_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "logiAttentionTypeCdLengthOutOfRangeError";
	/** 物流特殊区分の桁数が範囲外です。 */
	public static final String LOGI_SPECIAL_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "logiSpecialTypeCdLengthOutOfRangeError";
	/** 分納区分の桁数が範囲外です。 */
	public static final String SPLIT_DELIVERY_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "splitDeliveryTypeCdLengthOutOfRangeError";
	/** 別途送料(税込)が数値以外です。 */
	public static final String SEPARATE_SHIPPING_FEE_WITH_TAX_CHECK_NUMERIC_ONLY_ERROR = "separateShippingFeeWithTaxCheckNumericOnlyError";
	/** 別途送料(税込)の桁数が範囲外です。 */
	public static final String SEPARATE_SHIPPING_FEE_WITH_TAX_LENGTH_OUT_OF_RANGE_ERROR = "separateShippingFeeWithTaxLengthOutOfRangeError";
	/** 予備の桁数が範囲外です。 */
	public static final String SPARE_LENGTH_OUT_OF_RANGE_ERROR = "spareLengthOutOfRangeError";
	/** 出荷指示が重複しています。 */
	public static final String SHIPPIN_INST_DUPLICATE_ERROR = "shippinInstDuplicateError";
	/** 入庫予定が重複しています。 */
	public static final String RECEIVE_PLAN_DUPLICATE_ERROR = "receivePlanDuplicateError";
	/** ３社区分の桁数が範囲外です。 */
	public static final String SANSHA_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "sanshaTypeCdLengthOutOfRangeError";
	/** 3社納品書番号1の桁数が範囲外です。 */
	public static final String SANSHA_DELIVERY_SLIP_NO1_LENGTH_OUT_OF_RANGE_ERROR = "sanshaDeliverySlipNo1LengthOutOfRangeError";
	/** 3社納品書番号2が数値以外です。 */
	public static final String SANSHA_DELIVERY_SLIP_NO2_CHECK_NUMERIC_ONLY_ERROR = "sanshaDeliverySlipNo2CheckNumericOnlyError";
	/** 3社納品書番号2の桁数が範囲外です。 */
	public static final String SANSHA_DELIVERY_SLIP_NO2_LENGTH_OUT_OF_RANGE_ERROR = "sanshaDeliverySlipNo2LengthOutOfRangeError";
	/** 3社売上日が数値以外です。 */
	public static final String SANSHA_SALES_DT_CHECK_NUMERIC_ONLY_ERROR = "sanshaSalesDtCheckNumericOnlyError";
	/** 3社売上日が日付ではありません。 */
	public static final String SANSHA_SALES_DT_NOT_DATE_FORMAT_ERROR = "sanshaSalesDtNotDateFormatError";
	/** 3社売上日の桁数が範囲外です。 */
	public static final String SANSHA_SALES_DT_LENGTH_OUT_OF_RANGE_ERROR = "sanshaSalesDtLengthOutOfRangeError";
	/** IFIDの桁数が範囲外です。 */
	public static final String IF_ID_LENGTH_OUT_OF_RANGE_ERROR = "ifIdLengthOutOfRangeError";
	/** IF用番号の桁数が範囲外です。 */
	public static final String IF_NO_LENGTH_OUT_OF_RANGE_ERROR = "ifNoLengthOutOfRangeError";
	/** JANコード区分の桁数が範囲外です。 */
	public static final String JAN_CD_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "janCdTypeCdLengthOutOfRangeError";
	/** 赤黒区分の桁数が範囲外です。 */
	public static final String AKAKURO_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "akakuroTypeCdLengthOutOfRangeError";
	/** 確定納期が日付ではありません。 */
	public static final String CONFIRMED_DELIVERY_DATE_NOT_DATE_FORMAT_ERROR = "confirmedDeliveryDateNotDateFormatError";
	/** 確定納期が存在しません。 */
	public static final String CONFIRMED_DELIVERY_DATE_NULL_ERROR = "confirmedDeliveryDateNullError";
	/** 管理区分の桁数が範囲外です。 */
	public static final String MANAG_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "managTypeCdLengthOutOfRangeError";
	/** 管理番号の桁数が範囲外です。 */
	public static final String MANAG_NO_LENGTH_OUT_OF_RANGE_ERROR = "managNoLengthOutOfRangeError";
	/** 完了区分の桁数が範囲外です。 */
	public static final String COMPLETE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "completeTypeCdLengthOutOfRangeError";
	/** 検品確定区分の桁数が範囲外です。 */
	public static final String INSPECTION_COMFIRM_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "inspectionComfirmTypeCdLengthOutOfRangeError";
	/** 検品残数量の桁数が範囲外です。 */
	public static final String INSPECTION_NUM_REMAIN_LENGTH_OUT_OF_RANGE_ERROR = "inspectionNumRemainLengthOutOfRangeError";
	/** 検品数量の桁数が範囲外です。 */
	public static final String INSPECTION_NUM_LENGTH_OUT_OF_RANGE_ERROR = "inspectionNumLengthOutOfRangeError";
	/** 更新担当者コードの桁数が範囲外です。 */
	public static final String UPD_USER_CD_LENGTH_OUT_OF_RANGE_ERROR = "updUserCdLengthOutOfRangeError";
	/** サーバー送信フラグの桁数が範囲外です。 */
	public static final String SERVER_SEND_FLG_LENGTH_OUT_OF_RANGE_ERROR = "serverSendFlgLengthOutOfRangeError";
	/** サーバー宛送信時刻が数値以外です。 */
	public static final String SERVER_SEND_TIME_CHECK_NUMERIC_ONLY_ERROR = "serverSendTimeCheckNumericOnlyError";
	/** サーバー宛送信時刻の桁数が範囲外です。 */
	public static final String SERVER_SEND_TIME_LENGTH_OUT_OF_RANGE_ERROR = "serverSendTimeLengthOutOfRangeError";
	/** 削除フラグの桁数が範囲外です。 */
	public static final String DEL_FLG_LENGTH_OUT_OF_RANGE_ERROR = "delFlgLengthOutOfRangeError";
	/** 倉庫コードの桁数が範囲外です。 */
	public static final String WAREHOUSE_CD_LENGTH_OUT_OF_RANGE_ERROR = "warehouseCdLengthOutOfRangeError";
	/** 代表ロケーションの桁数が範囲外です。 */
	public static final String DAIHYO_LOCATION_LENGTH_OUT_OF_RANGE_ERROR = "daihyoLocationLengthOutOfRangeError";
	/** ダミーの桁数が範囲外です。 */
	public static final String DUMMY_LENGTH_OUT_OF_RANGE_ERROR = "dummyLengthOutOfRangeError";
	/** 端末番号の桁数が範囲外です。 */
	public static final String TERMINAL_NO_LENGTH_OUT_OF_RANGE_ERROR = "terminalNoLengthOutOfRangeError";
	/** データ種別の桁数が範囲外です。 */
	public static final String DATA_TYPE_LENGTH_OUT_OF_RANGE_ERROR = "dataTypeLengthOutOfRangeError";
	/** データ区分の桁数が範囲外です。 */
	public static final String DATA_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "dataTypeCdLengthOutOfRangeError";
	/** 伝票種別が存在しません。 */
	public static final String SLIP_TYPE_CD_NULL_ERROR = "slipTypeCdNullError";
	/** 伝票種別の桁数が範囲外です。 */
	public static final String SLIP_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "slipTypeCdLengthOutOfRangeError";
	/** 取引先名称が存在しません。 */
	public static final String CUSTOMER_NM_NULL_ERROR = "customerNmNullError";
	/** 入荷発生事由が存在しません。 */
	public static final String RECEIVE_REASON_NULL_ERROR = "receiveReasonNullError";
	/** 入荷発生事由の桁数が範囲外です。 */
	public static final String RECEIVE_REASON_LENGTH_OUT_OF_RANGE_ERROR = "receiveReasonLengthOutOfRangeError";
	/** 入荷発生事由名称の桁数が範囲外です。 */
	public static final String RECEIVE_REASON_NM_LENGTH_OUT_OF_RANGE_ERROR = "receiveReasonNmLengthOutOfRangeError";
	/** 入荷予定数量が存在しません。 */
	public static final String RECEIVE_PLAN_NUM_NULL_ERROR = "receivePlanNumNullError";
	/** 入庫伝票番号が存在しません。 */
	public static final String STORE_SLIP_NO_NULL_ERROR = "storeSlipNoNullError";
	/** 入庫伝票番号の桁数が範囲外です。 */
	public static final String STORE_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "storeSlipNoLengthOutOfRangeError";
	/** 入庫明細番号が数値以外です。 */
	public static final String STORE_SLIP_ROW_NO_CHECK_NUMERIC_ONLY_ERROR = "storeSlipRowNoCheckNumericOnlyError";
	/** 入庫明細番号が存在しません。 */
	public static final String STORE_SLIP_ROW_NO_NULL_ERROR = "storeSlipRowNoNullError";
	/** 入庫明細番号の桁数が範囲外です。 */
	public static final String STORE_SLIP_ROW_NO_LENGTH_OUT_OF_RANGE_ERROR = "storeSlipRowNoLengthOutOfRangeError";
	/** 入力順の桁数が範囲外です。 */
	public static final String ENTRY_SEQ_LENGTH_OUT_OF_RANGE_ERROR = "entrySeqLengthOutOfRangeError";
	/** 発注時刻が時刻ではありません。 */
	public static final String ORDER_TIME_CHECK_NOT_TIME_FORMAT_ERROR = "orderTimeCheckNotTimeFormatError";
	/** 発注時刻が数値以外です。 */
	public static final String ORDER_TIME_CHECK_NUMERIC_ONLY_ERROR = "orderTimeCheckNumericOnlyError";
	/** 発注時刻の桁数が範囲外です。 */
	public static final String ORDER_TIME_LENGTH_OUT_OF_RANGE_ERROR = "orderTimeLengthOutOfRangeError";
	/** 発注日が数値以外です。 */
	public static final String ORDER_DATE_CHECK_NUMERIC_ONLY_ERROR = "orderDateCheckNumericOnlyError";
	/** 発注日が日付ではありません。 */
	public static final String ORDER_DATE_CHECK_NOT_DATE_FORMAT_ERROR = "orderDateCheckNotDateFormatError";
	/** 発注日の桁数が範囲外です。 */
	public static final String ORDER_DATE_LENGTH_OUT_OF_RANGE_ERROR = "orderDateLengthOutOfRangeError";
	/** 品名カナ1の桁数が範囲外です。 */
	public static final String PRODUCT_NM_KANA1_LENGTH_OUT_OF_RANGE_ERROR = "productNmKana1LengthOutOfRangeError";
	/** 品名カナ2の桁数が範囲外です。 */
	public static final String PRODUCT_NM_KANA2_LENGTH_OUT_OF_RANGE_ERROR = "productNmKana2LengthOutOfRangeError";
	/** プログラムIDの桁数が範囲外です。 */
	public static final String PROGRAM_ID_LENGTH_OUT_OF_RANGE_ERROR = "programIdLengthOutOfRangeError";
	/** ユーザコードの桁数が範囲外です。 */
	public static final String USER_CD_LENGTH_OUT_OF_RANGE_ERROR = "userCdLengthOutOfRangeError";
	/** ユーザ名称の桁数が範囲外です。 */
	public static final String USER_NM_LENGTH_OUT_OF_RANGE_ERROR = "userNmLengthOutOfRangeError";
	/** 加工品区分の桁数が範囲外です。 */
	public static final String PROCESSED_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "processedTypeCdLengthOutOfRangeError";
	/** 回数が数値以外です。 */
	public static final String TIMES_NUM_CHECK_NUMERIC_ONLY_ERROR = "timesNumCheckNumericOnlyError";
	/** 回数の桁数が範囲外です。 */
	public static final String TIMES_NUM_LENGTH_OUT_OF_RANGE_ERROR = "timesNumLengthOutOfRangeError";
	/** 確定納期が数値以外です。 */
	public static final String CONFIRMED_DELIVERY_DATE_CHECK_NUMERIC_ONLY_ERROR = "confirmedDeliveryDateCheckNumericOnlyError";
	/** 確定納期の桁数が範囲外です。 */
	public static final String CONFIRMED_DELIVERY_DATE_LENGTH_OUT_OF_RANGE_ERROR = "confirmedDeliveryDateLengthOutOfRangeError";
	/** 管理番号が数値以外です。 */
	public static final String MANAG_NO_CHECK_NUMERIC_ONLY_ERROR = "managNoCheckNumericOnlyError";
	/** 検品残数量が数値以外です。 */
	public static final String SPG_QTY_REMAIN_CHECK_NUMERIC_ONLY_ERROR = "spgQtyRemainCheckNumericOnlyError";
	/** 検品数量が数値以外です。 */
	public static final String SPG_QTY_ONS_CHECK_NUMERIC_ONLY_ERROR = "spgQtyOnsCheckNumericOnlyError";
	/** 作成時間(発注)が数値以外です。 */
	public static final String ADD_TIME_ORDER_CHECK_NUMERIC_ONLY_ERROR = "addTimeOrderCheckNumericOnlyError";
	/** 作成時間(発注)の桁数が範囲外です。 */
	public static final String ADD_TIME_ORDE_LENGTH_OUT_OF_RANGE_ERROR = "addTimeOrdeLengthOutOfRangeError";
	/** 作成日(発注)が数値以外です。 */
	public static final String ADD_DATE_ORDER_CHECK_NUMERIC_ONLY_ERROR = "addDateOrderCheckNumericOnlyError";
	/** 作成日(発注)が日付ではありません。 */
	public static final String ADD_DATE_ORDER_CHECK_NOT_DATE_FORMAT_ERROR = "addDateOrderCheckNotDateFormatError";
	/** 作成日(発注)の桁数が範囲外です。 */
	public static final String ADD_DATE_ORDER_LENGTH_OUT_OF_RANGE_ERROR = "addDateOrderLengthOutOfRangeError";
	/** 仕入先コードが数値以外です。 */
	public static final String SUPPLIER_CD_CHECK_NUMERIC_ONLY_ERROR = "supplierCdCheckNumericOnlyError";
	/** 仕入先コードの桁数が範囲外です。 */
	public static final String SUPPLIER_CD_LENGTH_OUT_OF_RANGE_ERROR = "supplierCdLengthOutOfRangeError";
	/** 仕入単価が数値以外です。 */
	public static final String PURCHASE_UNIT_PRICE_CHECK_NUMERIC_ONLY_ERROR = "purchaseUnitPriceCheckNumericOnlyError";
	/** 仕入単価の桁数が範囲外です。 */
	public static final String PURCHASE_UNIT_PRICE_LENGTH_OUT_OF_RANGE_ERROR = "purchaseUnitPriceLengthOutOfRangeError";
	/** 取引先コードが存在しません。 */
	public static final String CUSTOMER_CD_NULL_ERROR = "customerCdNullError";
	/** 修正区分の桁数が範囲外です。 */
	public static final String MOD_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "modTypeCdLengthOutOfRangeError";
	/** 店販社名称１の桁数が範囲外です。 */
	public static final String TENHANSHA_NM1_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaNm1LengthOutOfRangeError";
	/** 店販社名称２の桁数が範囲外です。 */
	public static final String TENHANSHA_NM2_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaNm2LengthOutOfRangeError";
	/** 当日分フラグの桁数が範囲外です。 */
	public static final String TODAY_FLG_LENGTH_OUT_OF_RANGE_ERROR = "todayFlgLengthOutOfRangeError";
	/** 得意先注文番号の桁数が範囲外です。 */
	public static final String ACCOUNT_ORDER_NO_LENGTH_OUT_OF_RANGE_ERROR = "accountOrderNoLengthOutOfRangeError";
	/** 入荷予定残数が数値以外です。 */
	public static final String RECEIVE_REMAINING_NUM_CHECK_NUMERIC_ONLY_ERROR = "receiveRemainingNumCheckNumericOnlyError";
	/** 入荷予定残数が存在しません。 */
	public static final String RECEIVE_REMAINING_NUM_NULL_ERROR = "receiveRemainingNumNullError";
	/** 入荷予定残数の桁数が範囲外です。 */
	public static final String RECEIVE_REMAINING_NUM_LENGTH_OUT_OF_RANGE_ERROR = "receiveRemainingNumLengthOutOfRangeError";
	/** 入荷予定数量が数値以外です。 */
	public static final String RECEIVE_PLAN_NUM_CHECK_NUMERIC_ONLY_ERROR = "receivePlanNumCheckNumericOnlyError";
	/** 入荷予定数量の桁数が範囲外です。 */
	public static final String RECEIVE_PLAN_NUM_LENGTH_OUT_OF_RANGE_ERROR = "receivePlanNumLengthOutOfRangeError";
	/** 入庫プラントが存在しません。 */
	public static final String STORE_PLANT_CD_NULL_ERROR = "storePlantCdNullError";
	/** 入庫保管場所が存在しません。 */
	public static final String STORE_STRAGE_SPACE_CD_NULL_ERROR = "storeStrageSpaceCdNullError";
	/** 入力順が数値以外です。 */
	public static final String ENTRY_SEQ_CHECK_NUMERIC_ONLY_ERROR = "entrySeqCheckNumericOnlyError";
	/** 発注先コードが数値以外です。 */
	public static final String SAP_VENDOR_CD_CHECK_NUMERIC_ONLY_ERROR = "sapVendorCdCheckNumericOnlyError";
	/** 発注先コードの桁数が範囲外です。 */
	public static final String SAP_VENDOR_CD_LENGTH_OUT_OF_RANGE_ERROR = "sapVendorCdLengthOutOfRangeError";
	/** 預りJANコードの桁数が範囲外です。 */
	public static final String DEPOSIT_JAN_CD_LENGTH_OUT_OF_RANGE_ERROR = "depositJanCdLengthOutOfRangeError";
	/** 入庫日が当日のデータは登録できません */
	public static final String STORE_DT_CANNOT_BE_CURRENT_DT_ERROR = "storeDtCannotBeCurrentDtError";
	/** 出荷伝票番号が半角文字以外です。 */
	public static final String SHIPPING_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingSlipNoCheckHalfWidthOnlyError";
	/** 出荷伝票明細番号が数値以外です。 */
	public static final String SHIPPING_SLIP_ROW_NO_CHECK_NUMERIC_ONLY_ERROR = "shippingSlipRowNoCheckNumericOnlyError";
	/** 受注番号が半角文字以外です。 */
	public static final String SALSE_ORDER_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "salseOrderNoCheckHalfWidthOnlyError";
	/** 品目コードが半角文字以外です。 */
	public static final String HINMOKU_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "hinmokuCdCheckHalfWidthOnlyError";
	/** 受注伝票タイプが半角文字以外です。 */
	public static final String SALES_ORDER_SLIP_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "salesOrderSlipTypeCdCheckHalfWidthOnlyError";
	/** 受注伝票番号が半角文字以外です。 */
	public static final String SALES_ORDER_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "salesOrderSlipNoCheckHalfWidthOnlyError";
	/** 荷揃番号が数値以外です。 */
	public static final String NIZOROE_NO_CHECK_NUMERIC_ONLY_ERROR = "nizoroeNoCheckNumericOnlyError";
	/** 出荷区分が半角文字以外です。 */
	public static final String SHIPPING_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingTypeCdCheckHalfWidthOnlyError";
	/** 出荷発生事由が半角文字以外です。 */
	public static final String SHIPPING_REASON_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingReasonCdCheckHalfWidthOnlyError";
	/** 品目グループが半角文字以外です。 */
	public static final String HINMOKU_GROUP_CHECK_HALF_WIDTH_ONLY_ERROR = "hinmokuGroupCheckHalfWidthOnlyError";
	/** JANコードが半角文字以外です。 */
	public static final String JAN_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "janCdCheckHalfWidthOnlyError";
	/** サンプル区分が半角文字以外です。 */
	public static final String SAMPLE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "sampleTypeCdCheckHalfWidthOnlyError";
	/** 物流重量物フラグが半角文字以外です。 */
	public static final String LOGI_WEIGHT_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "logiWeightFlgCheckHalfWidthOnlyError";
	/** 物流注意区分が半角文字以外です。 */
	public static final String LOGI_ATTENTION_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "logiAttentionTypeCdCheckHalfWidthOnlyError";
	/** 物流特殊区分が半角文字以外です。 */
	public static final String LOGI_SPECIAL_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "logiSpecialTypeCdCheckHalfWidthOnlyError";
	/** 直送区分が半角文字以外です。 */
	public static final String DIRECT_DELIVERY_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "directDeliveryTypeCdCheckHalfWidthOnlyError";
	/** 戸口配送フラグが半角文字以外です。 */
	public static final String KOGUCHI_DELIVERY_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "koguchiDeliveryFlgCheckHalfWidthOnlyError";
	/** 分納区分が半角文字以外です。 */
	public static final String SPLIT_DELIVERY_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "splitDeliveryTypeCdCheckHalfWidthOnlyError";
	/** 運送会社区分が半角文字以外です。 */
	public static final String CARRIER_COMPANY_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "carrierCompanyTypeCdCheckHalfWidthOnlyError";
	/** 運送業者コードが半角文字以外です。 */
	public static final String CARRIER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "carrierCdCheckHalfWidthOnlyError";
	/** 運送便コードが半角文字以外です。 */
	public static final String DELIVERY_COURSE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "deliveryCourseCdCheckHalfWidthOnlyError";
	/** 店販社コードが半角文字以外です。 */
	public static final String TENHANSHA_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "tenhanshaCdCheckHalfWidthOnlyError";
	/** 販売組織が半角文字以外です。 */
	public static final String SALES_ORG_CHECK_HALF_WIDTH_ONLY_ERROR = "salesOrgCheckHalfWidthOnlyError";
	/** 店販社発注番号が半角文字以外です。 */
	public static final String TENHANSHA_ORDER_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "tenhanshaOrderNoCheckHalfWidthOnlyError";
	/** 戸配契約先が半角文字以外です。 */
	public static final String KOHAI_CONTRACTOR_CHECK_HALF_WIDTH_ONLY_ERROR = "kohaiContractorCheckHalfWidthOnlyError";
	/** 送り先コードが半角文字以外です。 */
	public static final String DESTINATION_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "destinationCdCheckHalfWidthOnlyError";
	/** 送り先名称_カナが半角文字以外です。 */
	public static final String DESTINATION_NM_KANA_CHECK_HALF_WIDTH_ONLY_ERROR = "destinationNmKanaCheckHalfWidthOnlyError";
	/** 送り先郵便番号が半角文字以外です。 */
	public static final String DESTINATION_ZIP_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "destinationZipCdCheckHalfWidthOnlyError";
	/** カナメッセージ_1が半角文字以外です。 */
	public static final String KANA_MESSAGE1_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage1CheckHalfWidthOnlyError";
	/** カナメッセージ_2が半角文字以外です。 */
	public static final String KANA_MESSAGE2_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage2CheckHalfWidthOnlyError";
	/** カナメッセージ_3が半角文字以外です。 */
	public static final String KANA_MESSAGE3_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage3CheckHalfWidthOnlyError";
	/** カナメッセージ_4が半角文字以外です。 */
	public static final String KANA_MESSAGE4_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage4CheckHalfWidthOnlyError";
	/** カナメッセージ_5が半角文字以外です。 */
	public static final String KANA_MESSAGE5_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage5CheckHalfWidthOnlyError";
	/** カナメッセージ_6が半角文字以外です。 */
	public static final String KANA_MESSAGE6_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage6CheckHalfWidthOnlyError";
	/** カナメッセージ_7が半角文字以外です。 */
	public static final String KANA_MESSAGE7_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage7CheckHalfWidthOnlyError";
	/** カナメッセージ_8が半角文字以外です。 */
	public static final String KANA_MESSAGE8_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage8CheckHalfWidthOnlyError";
	/** カナメッセージ_9が半角文字以外です。 */
	public static final String KANA_MESSAGE9_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage9CheckHalfWidthOnlyError";
	/** カナメッセージ_10が半角文字以外です。 */
	public static final String KANA_MESSAGE10_CHECK_HALF_WIDTH_ONLY_ERROR = "kanaMessage10CheckHalfWidthOnlyError";
	/** ＥＣ発注番号が半角文字以外です。 */
	public static final String EC_ORDER_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "ecOrderNoCheckHalfWidthOnlyError";
	/** ＥＣ発注番号_枝番が半角文字以外です。 */
	public static final String EC_ORDER_BLANCH_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "ecOrderBlanchNoCheckHalfWidthOnlyError";
	/** 顧客コードが半角文字以外です。 */
	public static final String KOKYAKU_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "kokyakuCdCheckHalfWidthOnlyError";
	/** 決済区分が半角文字以外です。 */
	public static final String PAYMENT_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "paymentTypeCdCheckHalfWidthOnlyError";
	/** 金額非表示フラグが半角文字以外です。 */
	public static final String PRICE_HIDDEN_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "priceHiddenFlgCheckHalfWidthOnlyError";
	/** 決済非表示フラグが半角文字以外です。 */
	public static final String PAYMENT_HIDDEN_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "paymentHiddenFlgCheckHalfWidthOnlyError";
	/** 注文番号_納品書が半角文字以外です。 */
	public static final String ORDER_NO_DELIVERY_NOTE_CHECK_HALF_WIDTH_ONLY_ERROR = "orderNoDeliveryNoteCheckHalfWidthOnlyError";
	/** ポイントが数値以外です。 */
	public static final String POINT_CHECK_NUMERIC_ONLY_ERROR = "pointCheckNumericOnlyError";
	/** 入庫プラントが半角文字以外です。 */
	public static final String STORE_PLANT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "storePlantCdCheckHalfWidthOnlyError";
	/** 入庫保管場所が半角文字以外です。 */
	public static final String STORE_STORAGE_SPACE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "storeStorageSpaceCdCheckHalfWidthOnlyError";
	/** 出庫プラントが半角文字以外です。 */
	public static final String SHIPPING_PLANT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingPlantCdCheckHalfWidthOnlyError";
	/** 出庫保管場所が半角文字以外です。 */
	public static final String SHIPPING_STORAGE_SPACE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingStorageSpaceCdCheckHalfWidthOnlyError";
	/** ロット管理区分が半角文字以外です。 */
	public static final String LOT_MANAG_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "lotManagTypeCdCheckHalfWidthOnlyError";
	/** 取引区分が半角文字以外です。 */
	public static final String TRANSACTION_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "transactionTypeCdCheckHalfWidthOnlyError";
	/** 取引先コードが半角文字以外です。 */
	public static final String CUSTOMER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "customerCdCheckHalfWidthOnlyError";
	/** 納入先コードが数値以外です。 */
	public static final String DELIV_CD_CHECK_NUMERIC_ONLY_ERROR = "delivCdCheckNumericOnlyError";
	/** 運送業者(UN/HM/用品)、運送業者(FW足数上限)、運送業者(FW足数以上業者)のいずれかを入力して下さい。 */
	public static final String CARRIER1_OR_CARRIER2_OR_CARRIER3_NOT_INPUT_ERROR = "carrier1OrCarrier2OrCarrier3NotInputError";
	/** 拠点を入力して下さい。 */
	public static final String BASE_NOT_ENTERED_ERROR = "baseNotEnteredError";
	/** 販売組織CD 英数字のみ */
	public static final String SALES_ORG_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "salesOrgCdCheckAlphabetAndNumericOnlyError";
	/** 販売組織CDは最大[0]文字以下を入力して下さい。 */
	public static final String SALES_ORG_CD_LENGTH_CHECK_MAX_ERROR = "salesOrgCdLengthCheckMaxError";
	/** 店販社マスタに存在しません。 */
	public static final String NOT_FOUND_IN_SALES_ORG_MASTER_ERROR = "notFoundInSalesOrgMasterError";
	/** 取引先CDは最大[0]文字以下を入力して下さい。 */
	public static final String CUSTOMER_CD_LENGTH_CHECK_MAX_ERROR = "customerCdLengthCheckMaxError";
	/** 郵便番号 数値と-のみ */
	public static final String ZIP_CD_CHECK_NUMERIC_AND_HYPHEN_ONLY_ERROR = "zipCdCheckNumericAndHyphenOnlyError";
	/** 郵便番号は最大8文字以下を入力して下さい。 */
	public static final String ZIP_CD_LENGTH_CHECK_MAX_ERROR = "zipCdLengthCheckMaxError";
	/** 拠点CDを入力して下さい。 */
	public static final String BASE_CD_NOT_ENTERED_ERROR = "baseCdNotEnteredError";
	/** 拠点CD 英数字と-のみ */
	public static final String BASE_CD_CHECK_ALPHABET_AND_NUMERIC_AND_HYPHEN_ONLY_ERROR = "baseCdCheckAlphabetAndNumericAndHyphenOnlyError";
	/** 拠点CDは最大[0]文字以下を入力して下さい。 */
	public static final String BASE_CD_LENGTH_CHECK_MAX_ERROR = "baseCdLengthCheckMaxError";
	/** 拠点マスタに存在しません。 */
	public static final String NOT_FOUND_IN_BASE_MASTER_ERROR = "notFoundInBaseMasterError";
	/** 運送業者 英数字のみ */
	public static final String CARRIER_CD_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "carrierCdCheckAlphabetAndNumericOnlyError";
	/** 運送業者は最大5文字以下を入力して下さい。 */
	public static final String CARRIER_CD_LENGTH_CHECK_MAX_ERROR = "carrierCdLengthCheckMaxError";
	/** 運送業者CD(UN/HM/用品) 英数字のみ */
	public static final String CARRIER_CD1_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "carrierCd1CheckAlphabetAndNumericOnlyError";
	/** 運送業者CD(UN/HM/用品)は最大5文字以下を入力して下さい。 */
	public static final String CARRIER_CD1_LENGTH_CHECK_MAX_ERROR = "carrierCd1LengthCheckMaxError";
	/** 運送業者CD(FW足数上限) 英数字のみ */
	public static final String CARRIER_CD2_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "carrierCd2CheckAlphabetAndNumericOnlyError";
	/** 運送業者CD(FW足数上限)は最大5文字以下を入力して下さい。 */
	public static final String CARRIER_CD2_LENGTH_CHECK_MAX_ERROR = "carrierCd2LengthCheckMaxError";
	/** 運送業者CD(FW足数以上) 英数字のみ */
	public static final String CARRIER_CD3_CHECK_ALPHABET_AND_NUMERIC_ONLY_ERROR = "carrierCd3CheckAlphabetAndNumericOnlyError";
	/** 運送業者CD(FW足数以上)は最大5文字以下を入力して下さい。 */
	public static final String CARRIER_CD3_LENGTH_CHECK_MAX_ERROR = "carrierCd3LengthCheckMaxError";
	/** 販売組織CD・取引先CDまたは郵便番号または出荷区分・都道府県・運送業者CD(UN/HM/用品)・運送業者CD(FW足数上限)・運送業者CD(FW足数以上)のいずれかのパターンを入力してください。 */
	public static final String EITHER_PATTERN_NOT_INPUT_ERROR = "eitherPatternNotInputError";
	/** 拠点CD・販売組織CD・取引先CDの組合せが重複しています。 */
	public static final String BASE_CD_SALES_ORG_CUSTOMER_CD_DUPLICATE_ERROR = "baseCdSalesOrgCustomerCdDuplicateError";
	/** 拠点CD・郵便番号の組合せが重複しています。 */
	public static final String BASE_CD_ZIP_CD_DUPLICATION_ERROR = "baseCdZipCdDuplicationError";
	/** 拠点CD・出荷区分・都道府県の組合せが重複しています。 */
	public static final String BASE_CD_SHIPPING_TYPE_CD_PREFECTURE_DUPLICATE_ERROR = "baseCdShippingTypeCdPrefectureDuplicateError";
	/** 未出荷の問合せ番号は梱包明細を表示できません。 */
	public static final String UNSHIP_TRACE_NO_CANNOT_DISPLAY_PACKING_LIST_ERROR = "unshipTraceNoCannotDisplayPackingListError";
	/** 大物取扱フラグは拠点に1つしか設定できません。 */
	public static final String LARGE_ITEM_HANDLING_FLG_AT_BASE_ERROR = "largeItemHandlingFlgAtBaseError";
	/** 重量取扱フラグは拠点に1つしか設定できません。 */
	public static final String HEAVY_ITEM_HANDLING_FLG_AT_BASE_ERROR = "heavyItemHandlingFlgAtBaseError";
	/** 休日振替運送業者フラグは拠点に1つしか設定できません。 */
	public static final String HOLIDAY_CARRIER_FLG_AT_BASE_ERROR = "holidayCarrierFlgAtBaseError";
	/** 沖縄航空便振替フラグは拠点に1つしか設定できません。 */
	public static final String OKINAWA_FLIGHT_FLG_AT_BASE_ERROR = "okinawaFlightFlgAtBaseError";
	/** 拠点デフォルト運送業者フラグは拠点に1つしか設定できません。 */
	public static final String BASE_DEFAULT_CARRIER_FLG_AT_BASE_ERROR = "baseDefaultCarrierFlgAtBaseError";
	/** 入力された運送業者CDは運送業者マスタに存在しません。 */
	public static final String CARRIER_CD_NOT_FOUND_IN_MASTER_ERROR = "carrierCdNotFoundInMasterError";
	/** 3社区分が半角文字以外です。 */
	public static final String SANSHA_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "sanshaTypeCdCheckHalfWidthOnlyError";
	/** 3社対象区分が半角文字以外です。 */
	public static final String SANSHA_TARGET_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "sanshaTargetTypeCdCheckHalfWidthOnlyError";
	/** 3社対象区分の桁数が範囲外です。 */
	public static final String SANSHA_TARGET_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "sanshaTargetTypeCdLengthOutOfRangeError";
	/** 3社納品書番号1が数値以外です。 */
	public static final String SANSHA_DELIVERY_SLIP_NO1_CHECK_NUMERIC_ONLY_ERROR = "sanshaDeliverySlipNo1CheckNumericOnlyError";
	/** Dの桁数が範囲外です。 */
	public static final String D_LENGTH_OUT_OF_RANGE_ERROR = "dLengthOutOfRangeError";
	/** FAXが数値以外です。 */
	public static final String FAX_CHECK_NUMERIC_ONLY_ERROR = "faxCheckNumericOnlyError";
	/** FAXの桁数が範囲外です。 */
	public static final String FAX_LENGTH_OUT_OF_RANGE_ERROR = "faxLengthOutOfRangeError";
	/** IFIDが半角文字以外です。 */
	public static final String IF_ID_CHECK_HALF_WIDTH_ONLY_ERROR = "ifIdCheckHalfWidthOnlyError";
	/** IFIDが存在しません。 */
	public static final String IF_ID_NULL_ERROR = "ifIdNullError";
	/** IF用番号が存在しません。 */
	public static final String IF_NO_NULL_ERROR = "ifNoNullError";
	/** IF用番号が半角文字以外です。 */
	public static final String IF_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "ifNoCheckHalfWidthOnlyError";
	/** Iの桁数が範囲外です。 */
	public static final String I_LENGTH_OUT_OF_RANGE_ERROR = "iLengthOutOfRangeError";
	/** JANコードが存在しません。 */
	public static final String JAN_CD_NULL_ERROR = "janCdNullError";
	/** JANコードグループの桁数が範囲外です。 */
	public static final String JAN_CD_GROUP_LENGTH_OUT_OF_RANGE_ERROR = "janCdGroupLengthOutOfRangeError";
	/** JANコード区分が半角文字以外です。 */
	public static final String JAN_CD_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "janCdTypeCdCheckHalfWidthOnlyError";
	/** PSAM名が半角文字以外です。 */
	public static final String PSAM_NM_CHECK_HALF_WIDTH_ONLY_ERROR = "psamNmCheckHalfWidthOnlyError";
	/** PSAM名の桁数が範囲外です。 */
	public static final String PSAM_NM_LENGTH_OUT_OF_RANGE_ERROR = "psamNmLengthOutOfRangeError";
	/** RFIDシリアル番号の桁数が範囲外です。 */
	public static final String RF_ID_SN_LENGTH_OUT_OF_RANGE_ERROR = "rfIdSnLengthOutOfRangeError";
	/** RFIDタグ情報が重複しています。 */
	public static final String RF_ID_TAG_DUPLICATE_ERROR = "rfIdTagDuplicateError";
	/** SCMラベル情報が重複しています。 */
	public static final String SCM_LABEL_DUPLICATE_ERROR = "scmLabelDuplicateError";
	/** 移動平均単価の桁数が範囲外です。 */
	public static final String MOVING_AVERAGE_PRICE_LENGTH_OUT_OF_RANGE_ERROR = "movingAveragePriceLengthOutOfRangeError";
	/** 運送会社コードの桁数が範囲外です。 */
	public static final String CARRIER_COMPANY_CD_LENGTH_OUT_OF_RANGE_ERROR = "carrierCompanyCdLengthOutOfRangeError";
	/** 運送会社名称の桁数が範囲外です。 */
	public static final String CARRIER_COMPANY_NM_LENGTH_OUT_OF_RANGE_ERROR = "carrierCompanyNmLengthOutOfRangeError";
	/** 運送便伝票番号が存在しません。 */
	public static final String CARRIER_SLIP_NO_NULL_ERROR = "carrierSlipNoNullError";
	/** 運送便伝票番号の桁数が範囲外です。 */
	public static final String CARRIER_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "carrierSlipNoLengthOutOfRangeError";
	/** 送り先コードが数値以外です。 */
	public static final String DESTINATION_CD_CHECK_NUMERIC_ONLY_ERROR = "destinationCdCheckNumericOnlyError";
	/** カートン識別番号が存在しません。 */
	public static final String CARTON_ID_NO_NULL_ERROR = "cartonIdNoNullError";
	/** カートン識別番号の桁数が範囲外です。 */
	public static final String CARTON_ID_NO_LENGTH_OUT_OF_RANGE_ERROR = "cartonIdNoLengthOutOfRangeError";
	/** 会計年度が半角文字以外です。 */
	public static final String FISCAL_YEAR_CHECK_HALF_WIDTH_ONLY_ERROR = "fiscalYearCheckHalfWidthOnlyError";
	/** 会社コードの桁数が範囲外です。 */
	public static final String COMPANY_CD_LENGTH_OUT_OF_RANGE_ERROR = "companyCdLengthOutOfRangeError";
	/** 基準日が日付ではありません。 */
	public static final String REFERENCE_DT_CHECK_NOT_DATE_FORMAT_ERROR = "referenceDtCheckNotDateFormatError";
	/** ケース区分が半角文字以外です。 */
	public static final String CASE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "caseTypeCdCheckHalfWidthOnlyError";
	/** ケース区分の桁数が範囲外です。 */
	public static final String CASE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "caseTypeCdLengthOutOfRangeError";
	/** 個体管理番号が存在しません。 */
	public static final String ID_MANAG_NO_NULL_ERROR = "idManagNoNullError";
	/** 個体管理番号の桁数が範囲外です。 */
	public static final String ID_MANAG_NO_LENGTH_OUT_OF_RANGE_ERROR = "idManagNoLengthOutOfRangeError";
	/** 梱包数が数値ではありません。 */
	public static final String PACKING_NUM_CHECK_NUMERIC_ONLY_ERROR = "packingNumCheckNumericOnlyError";
	/** 梱包数が存在しません。 */
	public static final String PACKING_NUM_NULL_ERROR = "packingNumNullError";
	/** 梱包数の桁数が範囲外です。 */
	public static final String PACKING_NUM_LENGTH_OUT_OF_RANGE_ERROR = "packingNumLengthOutOfRangeError";
	/** 梱包番号が存在しません。 */
	public static final String PACKING_NO_NULL_ERROR = "packingNoNullError";
	/** 梱包番号の桁数が範囲外です。 */
	public static final String PACKING_NO_LENGTH_OUT_OF_RANGE_ERROR = "packingNoLengthOutOfRangeError";
	/** サーバー宛送信時刻が時刻ではありません。 */
	public static final String SERVER_SEND_TIME_CHECK_NOT_TIME_FORMAT_ERROR = "serverSendTimeCheckNotTimeFormatError";
	/** サーバー送信フラグが半角文字以外です。 */
	public static final String SERVER_SEND_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "serverSendFlgCheckHalfWidthOnlyError";
	/** 在庫数量が数値以外です。 */
	public static final String STOCK_NUM_CHECK_NUMERIC_ONLY_ERROR = "stockNumCheckNumericOnlyError";
	/** 在庫数量が存在しません。 */
	public static final String STOCK_NUM_NULL_ERROR = "stockNumNullError";
	/** サイズ名称が半角文字以外です。 */
	public static final String SIZE_NM_CHECK_HALF_WIDTH_ONLY_ERROR = "sizeNmCheckHalfWidthOnlyError";
	/** サイズ名称の桁数が範囲外です。 */
	public static final String SIZE_NM_LENGTH_OUT_OF_RANGE_ERROR = "sizeNmLengthOutOfRangeError";
	/** 作成時間が数値以外です。 */
	public static final String ADD_TIME_CHECK_NUMERIC_ONLY_ERROR = "addTimeCheckNumericOnlyError";
	/** 作成時間の桁数が範囲外です。 */
	public static final String ADD_TIME_LENGTH_OUT_OF_RANGE_ERROR = "addTimeLengthOutOfRangeError";
	/** 作成者が存在しません。 */
	public static final String SAP_ADD_USER_CD_NULL_ERROR = "sapAddUserCdNullError";
	/** 作成日_月が存在しません。 */
	public static final String SAP_ADD_MM_NULL_ERROR = "sapAddMmNullError";
	/** 作成日が数値以外です。 */
	public static final String ADD_DT_CHECK_NUMERIC_ONLY_ERROR = "addDtCheckNumericOnlyError";
	/** 作成日が日付ではありません。 */
	public static final String ADD_DT_CHECK_NOT_DATE_FORMAT_ERROR = "addDtCheckNotDateFormatError";
	/** 作成日の桁数が範囲外です。 */
	public static final String ADD_DT_LENGTH_OUT_OF_RANGE_ERROR = "addDtLengthOutOfRangeError";
	/** 実地棚卸伝票番号が半角文字以外です。 */
	public static final String INVENTORY_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "inventorySlipNoCheckHalfWidthOnlyError";
	/** 実地棚卸伝票明細番号が数値以外です。 */
	public static final String INVENTORY_SLIP_ROW_NO_CHECK_NUMERIC_ONLY_ERROR = "inventorySlipRowNoCheckNumericOnlyError";
	/** 出荷伝票明細番号連番が数値以外です。 */
	public static final String SHIPPING_SLIP_ROW_NO_SN_CHECK_NUMERIC_ONLY_ERROR = "shippingSlipRowNoSnCheckNumericOnlyError";
	/** 出荷伝票明細番号連番が存在しません。 */
	public static final String SHIPPING_SLIP_ROW_NO_SN_NULL_ERROR = "shippingSlipRowNoSnNullError";
	/** 出荷予定伝票番号が存在しません。 */
	public static final String SHIPPING_PLAN_SLIP_NO_NULL_ERROR = "shippingPlanSlipNoNullError";
	/** 出荷予定伝票番号の桁数が範囲外です。 */
	public static final String SHIPPING_PLAN_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "shippingPlanSlipNoLengthOutOfRangeError";
	/** 商品代金が数値以外です。 */
	public static final String PRODUCT_PRICE_CHECK_NUMERIC_ONLY_ERROR = "productPriceCheckNumericOnlyError";
	/** 商品マスタが重複しています。 */
	public static final String PRODUCT_MASTER_ERROR_DUPLICATE_ERROR = "productMasterErrorDuplicateError";
	/** シリアル番号情報が重複しています。 */
	public static final String SERIAL_NO_DUPLICATE_ERROR = "serialNoDuplicateError";
	/** シリアル番号が存在しません。 */
	public static final String SERIAL_NO_NULL_ERROR = "serialNoNullError";
	/** シリアル番号の桁数が範囲外です。 */
	public static final String SERIAL_NO_LENGTH_OUT_OF_RANGE_ERROR = "serialNoLengthOutOfRangeError";
	/** 数量の桁数が範囲外です。 */
	public static final String NUM_LENGTH_OUT_OF_RANGE_ERROR = "numLengthOutOfRangeError";
	/** ステータスが半角文字以外です。 */
	public static final String STATUS_CHECK_HALF_WIDTH_ONLY_ERROR = "statusCheckHalfWidthOnlyError";
	/** 棚卸フラグの桁数が範囲外です。 */
	public static final String INVENTORY_FLG_LENGTH_OUT_OF_RANGE_ERROR = "inventoryFlgLengthOutOfRangeError";
	/** ダミーが半角文字以外です。 */
	public static final String DUMMY_CHECK_HALF_WIDTH_ONLY_ERROR = "dummyCheckHalfWidthOnlyError";
	/** 提供データ作成日_出庫が数値以外です。 */
	public static final String DATA_ADD_DT_PICKING_CHECK_NUMERIC_ONLY_ERROR = "dataAddDtPickingCheckNumericOnlyError";
	/** データ区分が半角文字以外です。 */
	public static final String DATA_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "dataTypeCdCheckHalfWidthOnlyError";
	/** データ種別が半角文字以外です。 */
	public static final String DATA_TYPE_CHECK_HALF_WIDTH_ONLY_ERROR = "dataTypeCheckHalfWidthOnlyError";
	/** 店販社が重複しています。 */
	public static final String SALSE_ORG_DUPLICATE_ERROR = "SalseOrgDuplicateError";
	/** 店販社マスタテーブルへの更新ができません。 */
	public static final String SALES_ORG_MASTER_UPDATE_ERROR = "salesOrgMasterUpdateError";
	/** 店販社マスタテーブルへの新規登録ができません。 */
	public static final String SALES_ORG_MASTER_INSERT_ERROR = "salesOrgMasterInsertError";
	/** 荷揃番号連番が数値ではありません。 */
	public static final String NIZOROE_NO_SN_CHECK_NUMERIC_ONLY_ERROR = "nizoroeNoSnCheckNumericOnlyError";
	/** 荷揃番号連番の桁数が範囲外です。 */
	public static final String NIZOROE_NO_SN_LENGTH_OUT_OF_RANGE_ERROR = "nizoroeNoSnLengthOutOfRangeError";
	/** 入数の桁数が範囲外です。 */
	public static final String UNIT_NUM_LENGTH_OUT_OF_RANGE_ERROR = "unitNumLengthOutOfRangeError";
	/** バーコードが半角文字以外です。 */
	public static final String BARCODE_CHECK_HALF_WIDTH_ONLY_ERROR = "barcodeCheckHalfWidthOnlyError";
	/** バーコードの桁数が範囲外です。 */
	public static final String BARCODE_LENGTH_OUT_OF_RANGE_ERROR = "barcodeLengthOutOfRangeError";
	/** 販売組織が存在しません。 */
	public static final String SALES_ORG_CD_NULL_ERROR = "salesOrgCdNullError";
	/** プラント(通常品)が半角文字以外です。 */
	public static final String PLANT_NORMAL_PRODUCT_CHECK_HALF_WIDTH_ONLY_ERROR = "plantNormalProductCheckHalfWidthOnlyError";
	/** プラント(通常品)の桁数が範囲外です。 */
	public static final String PLANT_NORMAL_PRODUCT_LENGTH_OUT_OF_RANGE_ERROR = "plantNormalProductLengthOutOfRangeError";
	/** プラント(預かり品)が半角文字以外です。 */
	public static final String PLANT_DEPOSIT_PRODUCT_CHECK_HALF_WIDTH_ONLY_ERROR = "plantDepositProductCheckHalfWidthOnlyError";
	/** プラント(預かり品)の桁数が範囲外です。 */
	public static final String PLANT_DEPOSIT_PRODUCT_LENGTH_OUT_OF_RANGE_ERROR = "plantDepositProductLengthOutOfRangeError";
	/** プラントCDが半角文字以外です。 */
	public static final String PLANT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "plantCdCheckHalfWidthOnlyError";
	/** プラントCDが存在しません。 */
	public static final String PLANT_CD_NULL_ERROR = "plantCdNullError";
	/** プラントCDの桁数が範囲外です。 */
	public static final String PLANT_CD_LENGTH_OUT_OF_RANGE_ERROR = "plantCdLengthOutOfRangeError";
	/** プラントが半角文字以外です。 */
	public static final String PLANT_CHECK_HALF_WIDTH_ONLY_ERROR = "plantCheckHalfWidthOnlyError";
	/** プラントが存在しません。 */
	public static final String PLANT_NULL_ERROR = "plantNullError";
	/** プラントの桁数が範囲外です。 */
	public static final String PLANT_LENGTH_OUT_OF_RANGE_ERROR = "plantLengthOutOfRangeError";
	/** プラント保管場所が重複しています。 */
	public static final String PLANT_STORAGE_SPACE_CD_DUPLICATE_ERROR = "plantStorageSpaceCdDuplicateError";
	/** プラント保管場所マスタテーブルへの更新ができません。 */
	public static final String PLANT_STORAGE_SPACE_MASTER_UPDATE_ERROR = "plantStorageSpaceMasterUpdateError";
	/** プラント保管場所マスタテーブルへの新規登録ができません。 */
	public static final String PLANT_STORAGE_SPACE_MASTE_INSERT_ERROR = "plantStorageSpaceMasteInsertError";
	/** プラント名の桁数が範囲外です。 */
	public static final String PLANT_NM_LENGTH_OUT_OF_RANGE_ERROR = "plantNmLengthOutOfRangeError";
	/** 振替が重複しています。 */
	public static final String TRANSFER_DUPLICATE_ERROR = "transferDuplicateError";
	/** フロア区分(保管場所区分)が半角文字以外です。 */
	public static final String STORAGE_LOCATION_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "storageLocationTypeCdCheckHalfWidthOnlyError";
	/** フロア区分(保管場所区分)の桁数が範囲外です。 */
	public static final String STORAGE_LOCATION_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "storageLocationTypeCdLengthOutOfRangeError";
	/** プログラムIDが半角文字以外です。 */
	public static final String PROGRAM_ID_CHECK_HALF_WIDTH_ONLY_ERROR = "programIdCheckHalfWidthOnlyError";
	/** ヘルメット区分が半角文字以外です。 */
	public static final String HELMET_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "helmetTypeCdCheckHalfWidthOnlyError";
	/** ポイントが半角文字以外です。 */
	public static final String POINT_CHECK_HALF_WIDTH_ONLY_ERROR = "pointCheckHalfWidthOnlyError";
	/** ユーザコードが半角文字以外です。 */
	public static final String USER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "userCdCheckHalfWidthOnlyError";
	/** 連番が存在しません。 */
	public static final String SN_NULL_ERROR = "snNullError";
	/** 連番の桁数が範囲外です。 */
	public static final String SN_LENGTH_OUT_OF_RANGE_ERROR = "snLengthOutOfRangeError";
	/** ロット番号が半角文字以外です。 */
	public static final String LOT_CHECK_HALF_WIDTH_ONLY_ERROR2 = "lotCheckHalfWidthOnlyError2";
	/** ロット番号の桁数が範囲外です。 */
	public static final String LOT_LENGTH_OUT_OF_RANGE_ERROR = "lotLengthOutOfRangeError";
	/** 移動タイプが半角文字以外です。 */
	public static final String TRANSFER_TYPE_CHECK_HALF_WIDTH_ONLY_ERROR = "transferTypeCheckHalfWidthOnlyError";
	/** 移動タイプが存在しません。 */
	public static final String TRANSFER_TYPE_NULL_ERROR = "transferTypeNullError";
	/** 移動タイプの桁数が範囲外です。 */
	public static final String TRANSFER_TYPE_LENGTH_OUT_OF_RANGE_ERROR = "transferTypeLengthOutOfRangeError";
	/** 移動平均単価が半角文字以外です。 */
	public static final String MOVING_AVERAGE_PRICE_CHECK_HALF_WIDTH_ONLY_ERROR = "movingAveragePriceCheckHalfWidthOnlyError";
	/** 引当区分が半角文字以外です。 */
	public static final String ALLOC_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "allocTypeCdCheckHalfWidthOnlyError";
	/** 引当区分の桁数が範囲外です。 */
	public static final String ALLOC_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "allocTypeCdLengthOutOfRangeError";
	/** 運送会社コードが存在しません。 */
	public static final String CARRIER_COMPANY_CD_NULL_ERROR = "carrierCompanyCdNullError";
	/** 運送会社名称が半角文字ではありません。 */
	public static final String CARRIER_COMPANY_NM_CHECK_NOT_HALF_WIDTH_CHARACTER_ERROR = "carrierCompanyNmCheckNotHalfWidthCharacterError";
	/** 運送業者略称の桁数が範囲外です。 */
	public static final String CARRIER_ABBR_LENGTH_OUT_OF_RANGE_ERROR = "carrierAbbrLengthOutOfRangeError";
	/** 運送便伝票番号が半角文字以外です。 */
	public static final String CARRIER_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "carrierSlipNoCheckHalfWidthOnlyError";
	/** 運送便伝票番号が半角文字ではありません。 */
	public static final String CARRIER_SLIP_NO_CHECK_NOT_HALF_WIDTH_CHARACTER_ERROR = "carrierSlipNoCheckNotHalfWidthCharacterError";
	/** 加工品区分が半角文字以外です。 */
	public static final String PROCESSED_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "processedTypeCdCheckHalfWidthOnlyError";
	/** 荷揃番号が半角文字ではありません。 */
	public static final String NIZOROE_NO_CHECK_NOT_HALF_WIDTH_CHARACTER_ERROR = "nizoroeNoCheckNotHalfWidthCharacterError";
	/** 荷揃番号連番が存在しません。 */
	public static final String NIZOROE_NO_SN_NULL_ERROR = "nizoroeNoSnNullError";
	/** 会計年度が数値以外です。 */
	public static final String FISCAL_YEAR_CHECK_NUMERIC_ONLY_ERROR = "fiscalYearCheckNumericOnlyError";
	/** 会計年度が存在しません。 */
	public static final String FISCAL_YEAR_NULL_ERROR = "fiscalYearNullError";
	/** 会計年度の桁数が範囲外です。 */
	public static final String FISCAL_YEAR_LENGTH_OUT_OF_RANGE_ERROR = "fiscalYearLengthOutOfRangeError";
	/** 会社コードが半角文字以外です。 */
	public static final String COMPANY_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "companyCdCheckHalfWidthOnlyError";
	/** 会社名の桁数が範囲外です。 */
	public static final String COMPANY_NM_LENGTH_OUT_OF_RANGE_ERROR = "companyNmLengthOutOfRangeError";
	/** 確定梱包数が数値以外です。 */
	public static final String CONFIRMED_PACKING_NUM_CHECK_NUMERIC_ONLY_ERROR = "confirmedPackingNumCheckNumericOnlyError";
	/** 確定梱包数が存在しません。 */
	public static final String CONFIRMED_PACKING_NUM_NULL_ERROR = "confirmedPackingNumNullError";
	/** 確定梱包数の桁数が範囲外です。 */
	public static final String CONFIRMED_PACKING_NUM_LENGTH_OUT_OF_RANGE_ERROR = "confirmedPackingNumLengthOutOfRangeError";
	/** 完了区分が半角文字以外です。 */
	public static final String COMPLETE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "completeTypeCdCheckHalfWidthOnlyError";
	/** 管理区分が半角文字以外です。 */
	public static final String MANAG_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "managTypeCdCheckHalfWidthOnlyError";
	/** 基準日が出荷日が日付ではありません。 */
	public static final String REFERENCE_DT_SHIPPING_DT_CHECK_NOT_DATE_FORMAT_ERROR = "referenceDtShippingDtCheckNotDateFormatError";
	/** 基準日が数値以外です。 */
	public static final String REFERENCE_DT_CHECK_NUMERIC_ONLY_ERROR = "referenceDtCheckNumericOnlyError";
	/** 基準日が存在しません。 */
	public static final String REFERENCE_DT_NULL_ERROR = "referenceDtNullError";
	/** 基準日の桁数が範囲外です。 */
	public static final String REFERENCE_DT_LENGTH_OUT_OF_RANGE_ERROR = "referenceDtLengthOutOfRangeError";
	/** 期限日が数値以外です。 */
	public static final String LIMIT_DT_CHECK_NUMERIC_ONLY_ERROR = "limitDtCheckNumericOnlyError";
	/** 期限日が日付ではありません。 */
	public static final String LIMIT_DT_CHECK_NOT_DATE_FORMAT_ERROR = "limitDtCheckNotDateFormatError";
	/** 期限日の桁数が範囲外です。 */
	public static final String LIMIT_DT_LENGTH_OUT_OF_RANGE_ERROR = "limitDtLengthOutOfRangeError";
	/** 旧JANコードが半角文字以外です。 */
	public static final String OLD_JAN_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "oldJanCdCheckHalfWidthOnlyError";
	/** 旧JANコードの桁数が範囲外です。 */
	public static final String OLD_JAN_CD_LENGTH_OUT_OF_RANGE_ERROR = "oldJanCdLengthOutOfRangeError";
	/** 拠点コードが半角文字以外です。 */
	public static final String BASE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "baseCdCheckHalfWidthOnlyError";
	/** 拠点コードの桁数が範囲外です。 */
	public static final String BASE_CD_LENGTH_OUT_OF_RANGE_ERROR = "baseCdLengthOutOfRangeError";
	/** 拠点区分が半角文字以外です。 */
	public static final String BASE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "baseTypeCdCheckHalfWidthOnlyError";
	/** 拠点区分の桁数が範囲外です。 */
	public static final String BASE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "baseTypeCdLengthOutOfRangeError";
	/** 拠点名称が半角文字以外です。 */
	public static final String BASE_NM_CHECK_HALF_WIDTH_ONLY_ERROR = "baseNmCheckHalfWidthOnlyError";
	/** 拠点名称の桁数が範囲外です。 */
	public static final String BASE_NM_LENGTH_OUT_OF_RANGE_ERROR = "baseNmLengthOutOfRangeError";
	/** 共有商品区分が半角文字以外です。 */
	public static final String SHARED_PRODUCT_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "sharedProductTypeCdCheckHalfWidthOnlyError";
	/** 共有商品区分の桁数が範囲外です。 */
	public static final String SHARED_PRODUCT_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "sharedProductTypeCdLengthOutOfRangeError";
	/** 緊急区分が半角文字以外です。 */
	public static final String EMERGENCY_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "emergencyFlgCheckHalfWidthOnlyError";
	/** 緊急区分の桁数が範囲外です。 */
	public static final String EMERGENCY_FLG_LENGTH_OUT_OF_RANGE_ERROR = "emergencyFlgLengthOutOfRangeError";
	/** 検品確定区分が半角文字以外です。 */
	public static final String INSPECTION_COMPLETE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "inspectionCompleteTypeCdCheckHalfWidthOnlyError";
	/** 言語が半角文字以外です。 */
	public static final String LANG_CHECK_HALF_WIDTH_ONLY_ERROR = "langCheckHalfWidthOnlyError";
	/** 言語の桁数が範囲外です。 */
	public static final String LANG_LENGTH_OUT_OF_RANGE_ERROR = "langLengthOutOfRangeError";
	/** 個体管理情報が重複しています。 */
	public static final String ID_MANAG_DATA_DUPLICATE_ERROR = "idManagDataDuplicateError";
	/** 個体管理廃止区分が半角文字以外です。 */
	public static final String ID_MANAG_ABOLITION_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "idManagAbolitionTypeCdCheckHalfWidthOnlyError";
	/** 個体管理廃止区分の桁数が範囲外です。 */
	public static final String ID_MANAG_ABOLITION_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "idManagAbolitionTypeCdLengthOutOfRangeError";
	/** 個体管理番号が数値以外です。 */
	public static final String ID_MANAG_NO_CHECK_NUMERIC_ONLY_ERROR = "idManagNoCheckNumericOnlyError";
	/** 戸口配送マスタが重複しています。 */
	public static final String KOGUCHI_DELIVERY_MASTER_DUPLICATE_ERROR = "koguchiDeliveryMasterDuplicateError";
	/** 戸配契約先コードが半角文字以外です。 */
	public static final String KOHAI_CONSTRACTOR_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "kohaiConstractorCdCheckHalfWidthOnlyError";
	/** 更新フラグの桁数が範囲外です。 */
	public static final String UPD_FLG_LENGTH_OUT_OF_RANGE_ERROR = "updFlgLengthOutOfRangeError";
	/** 更新担当者コードが半角文字以外です。 */
	public static final String UPD_USER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "updUserCdCheckHalfWidthOnlyError";
	/** 購買組織が半角文字以外です。 */
	public static final String PUCHASE_ORG_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "puchaseOrgCdCheckHalfWidthOnlyError";
	/** 購買組織の桁数が範囲外です。 */
	public static final String PUCHASE_ORG_CD_LENGTH_OUT_OF_RANGE_ERROR = "puchaseOrgCdLengthOutOfRangeError";
	/** 国が半角文字以外です。 */
	public static final String COUNTRY_CHECK_HALF_WIDTH_ONLY_ERROR = "countryCheckHalfWidthOnlyError";
	/** 国の桁数が範囲外です。 */
	public static final String COUNTRY_LENGTH_OUT_OF_RANGE_ERROR = "countryLengthOutOfRangeError";
	/** 梱包明細が重複しています。 */
	public static final String PACKING_REPORT_DUPLICATE_ERROR = "packingReportDuplicateError";
	/** 梱包明細番号が数値以外です */
	public static final String PACKING_ROW_NO_CHECK_NOT_NUMERIC_ERROR = "packingRowNoCheckNotNumericError";
	/** 梱包明細番号が存在しません。 */
	public static final String PACKING_ROW_NO_NULL_ERROR = "packingRowNoNullError";
	/** 梱包明細番号の桁数が範囲外です。 */
	public static final String PACKING_ROW_NO_LENGTH_OUT_OF_RANGE_ERROR = "packingRowNoLengthOutOfRangeError";
	/** 在庫移動日(年月日)が存在しません。 */
	public static final String STOCK_TRANSFER_DT_NULLERROR = "stockTransferDtNullerror";
	/** 在庫移動日(年月日)が日付ではありません。 */
	public static final String STOCK_TRANSFER_DT_CHECK_NOT_DATE_FORMAT_ERROR = "stockTransferDtCheckNotDateFormatError";
	/** 在庫移動日(年月日)の桁数が範囲外です。 */
	public static final String STOCK_TRANSFER_DT_LENGTH_OUT_OF_RANGE_ERROR = "stockTransferDtLengthOutOfRangeError";
	/** 在庫実績が重複しています。 */
	public static final String STOCK_RECORD_DUPLICATE_ERROR = "stockRecordDuplicateError";
	/** 在庫数量の桁数が範囲外です。 */
	public static final String STOCK_NUM_LENGTH_OUT_OF_RANGE_ERROR = "stockNumLengthOutOfRangeError";
	/** 作成時間(発注)が半角文字以外です。 */
	public static final String ADD_TIME_ORDER_CHECK_HALF_WIDTH_ONLY_ERROR = "addTimeOrderCheckHalfWidthOnlyError";
	/** 作成時間_時が存在しません。 */
	public static final String SAP_ADD_HH_NULL_ERROR = "sapAddHhNullError";
	/** 作成時間_秒が存在しません。 */
	public static final String SAP_ADD_SS_NULL_ERROR = "sapAddSsNullError";
	/** 作成時間_分が存在しません。 */
	public static final String SAP_ADD_MI_NULL_ERROR = "sapAddMiNullError";
	/** 作成時間が時刻ではありません。 */
	public static final String ADD_TIME_CHECK_NOT_TIME_FORMAT_ERROR = "addTimeCheckNotTimeFormatError";
	/** 作成日_年が存在しません。 */
	public static final String SAP_ADD_YYYY_NULL_ERROR = "sapAddYyyyNullError";
	/** 作成日_日が存在しません。 */
	public static final String SAP_ADD_DD_NULL_ERROR = "sapAddDdNullError";
	/** 削除フラグが半角文字以外です。 */
	public static final String DEL_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "delFlgCheckHalfWidthOnlyError";
	/** 市区町村が半角文字以外です。 */
	public static final String ADDRESS2_CHECK_HALF_WIDTH_ONLY_ERROR = "address2CheckHalfWidthOnlyError";
	/** 市区町村の桁数が範囲外です。 */
	public static final String ADDRESS2_LENGTH_OUT_OF_RANGE_ERROR = "address2LengthOutOfRangeError";
	/** 氏名の桁数が範囲外です。 */
	public static final String NM_LENGTH_OUT_OF_RANGE_ERROR = "nmLengthOutOfRangeError";
	/** 実地棚卸伝票番号が存在しません。 */
	public static final String INVENTORY_SLIP_NO_NULL_ERROR = "inventorySlipNoNullError";
	/** 実地棚卸伝票番号の桁数が範囲外です。 */
	public static final String INVENTORY_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "inventorySlipNoLengthOutOfRangeError";
	/** 実地棚卸伝票明細番号が存在しません。 */
	public static final String INVENTORY_SLIP_ROW_NO_NULL_ERROR = "inventorySlipRowNoNullError";
	/** 実地棚卸伝票明細番号の桁数が範囲外です。 */
	public static final String INVENTORY_SLIP_ROW_NO_LENGTH_OUT_OF_RANGE_ERROR = "inventorySlipRowNoLengthOutOfRangeError";
	/** 社員識別コードが半角文字以外です。 */
	public static final String EMP_ID_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "empIdCdCheckHalfWidthOnlyError";
	/** 取引先注文番号が半角文字以外です。 */
	public static final String CUSTOMER_ORDER_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "customerOrderNoCheckHalfWidthOnlyError";
	/** 取引先注文番号の桁数が範囲外です。 */
	public static final String CUSTOMER_ORDER_NO_LENGTH_OUT_OF_RANGE_ERROR = "customerOrderNoLengthOutOfRangeError";
	/** 取引先名称が半角文字以外です。 */
	public static final String CUSTOMER_NM_CHECK_HALF_WIDTH_ONLY_ERROR = "customerNmCheckHalfWidthOnlyError";
	/** 受注番号が数値以外です。 */
	public static final String SALES_ORDER_NO_CHECK_NUMERIC_ONLY_ERROR = "salesOrderNoCheckNumericOnlyError";
	/** 修正区分が半角文字以外です。 */
	public static final String MOD_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "modTypeCdCheckHalfWidthOnlyError";
	/** 出荷実績が重複しています。 */
	public static final String SHIPPING_RECORD_DUPLICATE_ERROR = "shippingRecordDuplicateError";
	/** 出荷伝票番号が数値以外です。 */
	public static final String SHIPPING_SLIP_NO_CHECK_NUMERIC_ONLY_ERROR = "shippingSlipNoCheckNumericOnlyError";
	/** 出荷伝票番号が半角文字ではありません。 */
	public static final String SHIPPING_SLIP_NO_CHECK_NOT_HALF_WIDTH_CHARACTER_ERROR = "shippingSlipNoCheckNotHalfWidthCharacterError";
	/** 出荷伝票明細番号連番の桁数が範囲外です。 */
	public static final String SHIPPING_SLIP_ROW_NO_SN_LENGTH_OUT_OF_RANGE_ERROR = "shippingSlipRowNoSnLengthOutOfRangeError";
	/** 出荷予定が重複しています。 */
	public static final String SHIPPING_PLAN_DUPLICATE_ERROR = "shippingPlanDuplicateError";
	/** 出荷予定伝票番号が半角文字以外です。 */
	public static final String SHIPPING_PLAN_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "shippingPlanSlipNoCheckHalfWidthOnlyError";
	/** 出荷予定明細番号が数値以外です。 */
	public static final String SHIPPING_PLAN_SLIP_ROW_NO_CHECK_NUMERIC_ONLY_ERROR = "shippingPlanSlipRowNoCheckNumericOnlyError";
	/** 出荷予定明細番号の桁数が範囲外です。 */
	public static final String SHIPPING_PLAN_SLIP_ROW_NO_LENGTH_OUT_OF_RANGE_ERROR = "shippingPlanSlipRowNoLengthOutOfRangeError";
	/** 出庫日が数値以外です。 */
	public static final String PICKING_DT_CHECK_NUMERIC_ONLY_ERROR = "pickingDtCheckNumericOnlyError";
	/** 出庫日が日付ではありません。 */
	public static final String PICKING_DT_CHECK_NOT_DATE_FORMAT_ERROR = "pickingDtCheckNotDateFormatError";
	/** 出庫日の桁数が範囲外です。 */
	public static final String PICKING_DT_LENGTH_OUT_OF_RANGE_ERROR = "pickingDtLengthOutOfRangeError";
	/** 処理区分が半角文字以外です。 */
	public static final String PROCESS_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "processTypeCdCheckHalfWidthOnlyError";
	/** 処理区分の桁数が範囲外です。 */
	public static final String PROCESS_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "processTypeCdLengthOutOfRangeError";
	/** 所在地が半角文字以外です。 */
	public static final String ADDRESS3_CHECK_HALF_WIDTH_ONLY_ERROR = "address3CheckHalfWidthOnlyError";
	/** 所在地の桁数が範囲外です。 */
	public static final String ADDRESS3_LENGTH_OUT_OF_RANGE_ERROR = "address3LengthOutOfRangeError";
	/** 商品マスタ (移動平均単価)テーブルへの更新ができません。 */
	public static final String PRODUCT_PRICE_MASTER_UPDATE_ERROR = "productPriceMasterUpdateError";
	/** 商品マスタ (移動平均単価)テーブルへの新規登録ができません。 */
	public static final String PRODUCT_PRICE_MASTER_INSERT_ERROR = "productPriceMasterInsertError";
	/** 商品マスタテーブルへの更新ができません。 */
	public static final String PRODUCT_MASTER_UPDATE_ERROR = "productMasterUpdateError";
	/** 商品マスタテーブルへの新規登録ができません。 */
	public static final String PRODUCT_MASTER_INSERT_ERROR = "productMasterInsertError";
	/** 商品種別が半角文字以外です。 */
	public static final String PRODUCT_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "productTypeCdCheckHalfWidthOnlyError";
	/** 商品種別の桁数が範囲外です。 */
	public static final String PRODUCT_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "productTypeCdLengthOutOfRangeError";
	/** 商品代金の桁数が範囲外です。 */
	public static final String PRODUCT_PRICE_LENGTH_OUT_OF_RANGE_ERROR = "productPriceLengthOutOfRangeError";
	/** 商品名称の桁数が範囲外です。 */
	public static final String PRODUCT_NM_LENGTH_OUT_OF_RANGE_ERROR = "productNmLengthOutOfRangeError";
	/** 数量が数値以外です。 */
	public static final String NUM_CHECK_NUMERIC_ONLY_ERROR = "numCheckNumericOnlyError";
	/** 数量が存在しません。 */
	public static final String NUM_NULL_ERROR = "numNullError";
	/** 製造日が数値以外です。 */
	public static final String PRODUCTION_DT_CHECK_NUMERIC_ONLY_ERROR = "productionDtCheckNumericOnlyError";
	/** 製造日が日付ではありません。 */
	public static final String PRODUCTION_DT_CHECK_NOT_DATE_FORMAT_ERROR = "productionDtCheckNotDateFormatError";
	/** 製造日の桁数が範囲外です。 */
	public static final String PRODUCTION_DT_LENGTH_OUT_OF_RANGE_ERROR = "productionDtLengthOutOfRangeError";
	/** 赤黒区分が半角文字以外です。 */
	public static final String AKAKURO_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "akakuroTypeCdCheckHalfWidthOnlyError";
	/** 倉庫コードが半角文字以外です。 */
	public static final String WAREHOUSE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "warehouseCdCheckHalfWidthOnlyError";
	/** 送り元コードが半角文字以外です。 */
	public static final String SENDER_CD_CHECK_HALF_WIDTH_ONLY_ERRO = "senderCdCheckHalfWidthOnlyErro";
	/** 送り元コードの桁数が範囲外です。 */
	public static final String SENDER_CD_LENGTH_OUT_OF_RANGE_ERROR = "senderCdLengthOutOfRangeError";
	/** 送り状摘要番号が半角文字以外です。 */
	public static final String INVOICE_SUMMARY_NO_HALF_WIDTH_ONLY_ERROR = "invoiceSummaryNoHalfWidthOnlyError";
	/** 送り状摘要番号の桁数が範囲外です。 */
	public static final String INVOICE_SUMMARY_NO_LENGTH_OUT_OF_RANGE_ERROR = "invoiceSummaryNoLengthOutOfRangeError";
	/** 送り先ＦＡＸ番号が半角文字以外です。 */
	public static final String DESTINATION_FAX_CHECK_HALF_WIDTH_ONLY_ERROR = "destinationFaxCheckHalfWidthOnlyError";
	/** 送り先電話番号が半角文字以外です。 */
	public static final String DESTINATION_TEL_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "destinationTelNoCheckHalfWidthOnlyError";
	/** 代引手数料が数値以外です。 */
	public static final String COD_FEE_CHECK_NUMERIC_ONLY_ERROR = "codFeeCheckNumericOnlyError";
	/** 代引手数料の桁数が範囲外です。 */
	public static final String COD_FEE_LENGTH_OUT_OF_RANGE_ERROR = "codFeeLengthOutOfRangeError";
	/** 代表ロケーションが半角文字以外です。 */
	public static final String DAIHYO_LOCATION_CHECK_HALF_WIDTH_ONLY_ERROR = "daihyoLocationCheckHalfWidthOnlyError";
	/** 棚卸フラグが半角文字以外です。 */
	public static final String INVENTORY_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "inventoryFlgCheckHalfWidthOnlyError";
	/** 棚卸指示が重複しています。 */
	public static final String INVENTORY_INST_DUPLICATE_ERROR = "inventoryInstDuplicateError";
	/** 棚卸実績が重複しています。 */
	public static final String INVENTORY_RECORD_DUPLICATE_ERROR = "inventoryRecordDuplicateError";
	/** 棚卸日が数値以外です。 */
	public static final String INVENTORY_DT_CHECK_NUMERIC_ONLY_ERROR = "inventoryDtCheckNumericOnlyError";
	/** 棚卸日が日付ではありません。 */
	public static final String INVENTORY_DT_CHECK_NOT_DATE_FORMAT_ERROR = "inventoryDtCheckNotDateFormatError";
	/** 棚卸日の桁数が範囲外です。 */
	public static final String INVENTORY_DT_LENGTH_OUT_OF_RANGE_ERROR = "inventoryDtLengthOutOfRangeError";
	/** 単位コードが半角文字以外です。 */
	public static final String UNIT_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "unitCdCheckHalfWidthOnlyError";
	/** 単位コードの桁数が範囲外です。 */
	public static final String UNIT_CD_LENGTH_OUT_OF_RANGE_ERROR = "unitCdLengthOutOfRangeError";
	/** 単位コード名称の桁数が範囲外です。 */
	public static final String UNIT_CD_NM_LENGTH_OUT_OF_RANGE_ERROR = "unitCdNmLengthOutOfRangeError";
	/** 担当者の桁数が範囲外です。 */
	public static final String USER_LENGTH_OUT_OF_RANGE_ERROR = "userLengthOutOfRangeError";
	/** 端末番号1が半角文字以外です。 */
	public static final String TERMINAL_NO1_CHECK_HALF_WIDTH_ONLY_ERROR = "terminalNo1CheckHalfWidthOnlyError";
	/** 端末番号1の桁数が範囲外です。 */
	public static final String TERMINAL_NO1_LENGTH_OUT_OF_RANGE_ERROR = "terminalNo1LengthOutOfRangeError";
	/** 端末番号2が半角文字以外です。 */
	public static final String TERMINAL_NO2_CHECK_HALF_WIDTH_ONLY_ERROR = "terminalNo2CheckHalfWidthOnlyError";
	/** 端末番号2の桁数が範囲外です。 */
	public static final String TERMINAL_NO2_LENGTH_OUT_OF_RANGE_ERROR = "terminalNo2LengthOutOfRangeError";
	/** 端末番号が半角文字以外です。 */
	public static final String TERMINAL_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "terminalNoCheckHalfWidthOnlyError";
	/** 提供データ作成日_出庫が日付ではありません。 */
	public static final String DATA_ADD_DT_PICKING_CHECK_NOT_DATE_FORMAT_ERROR = "dataAddDtPickingCheckNotDateFormatError";
	/** 提供データ作成日_出庫の桁数が範囲外です。 */
	public static final String DATA_ADD_DT_PICKING_LENGTH_OUT_OF_RANGE_ERROR = "dataAddDtPickingLengthOutOfRangeError";
	/** 提供データ作成日_廃棄が数値以外です。 */
	public static final String DATA_ADD_DT_WASTE_CHECK_NUMERIC_ONLY_ERROR = "dataAddDtWasteCheckNumericOnlyError";
	/** 提供データ作成日_廃棄が日付ではありません。 */
	public static final String DATA_ADD_DT_WASTE_CHECK_NOT_DATE_FORMAT_ERROR = "dataAddDtWasteCheckNotDateFormatError";
	/** 提供データ作成日_廃棄の桁数が範囲外です。 */
	public static final String DATA_ADD_DT_WASTE_LENGTH_OUT_OF_RANGE_ERROR = "dataAddDtWasteLengthOutOfRangeError";
	/** 提供データ作成日_良返が数値以外です。 */
	public static final String DATA_ADD_DT_RETURN_CHECK_NUMERIC_ONLY_ERROR = "dataAddDtReturnCheckNumericOnlyError";
	/** 提供データ作成日_良返が日付ではありません。 */
	public static final String DATA_ADD_DT_RETURN_CHECK_NOT_DATE_FORMAT_ERROR = "dataAddDtReturnCheckNotDateFormatError";
	/** 提供データ作成日_良返の桁数が範囲外です。 */
	public static final String DATA_ADD_DT_RETURN_LENGTH_OUT_OF_RANGE_ERROR = "dataAddDtReturnLengthOutOfRangeError";
	/** 提供データ抽出済_出庫が半角文字以外です。 */
	public static final String DATA_EXT_FLG_PICKING_CHECK_HALF_WIDTH_ONLY_ERROR = "dataExtFlgPickingCheckHalfWidthOnlyError";
	/** 提供データ抽出済_出庫の桁数が範囲外です。 */
	public static final String DATA_EXT_FLG_PICKING_LENGTH_OUT_OF_RANGE_ERROR = "dataExtFlgPickingLengthOutOfRangeError";
	/** 提供データ抽出済_廃棄が半角文字以外です。 */
	public static final String DATA_EXT_FLG_WASTE_CHECK_HALF_WIDTH_ONLY_ERROR = "dataExtFlgWasteCheckHalfWidthOnlyError";
	/** 提供データ抽出済_廃棄の桁数が範囲外です。 */
	public static final String DATA_EXT_FLG_WASTE_LENGTH_OUT_OF_RANGE_ERROR = "dataExtFlgWasteLengthOutOfRangeError";
	/** 提供データ抽出済_良返が半角文字以外です。 */
	public static final String DATA_EXT_FLG_RETURN_CHECK_HALF_WIDTH_ONLY_ERROR = "dataExtFlgReturnCheckHalfWidthOnlyError";
	/** 提供データ抽出済_良返の桁数が範囲外です。 */
	public static final String DATA_EXT_FLG_RETURN_LENGTH_OUT_OF_RANGE_ERROR = "dataExtFlgReturnLengthOutOfRangeError";
	/** 店販社ＦＡＸ番号が数値以外です。 */
	public static final String TENHANSHA_FAX_NO_CHECK_NUMERIC_ONLY_ERROR = "tenhanshaFaxNoCheckNumericOnlyError";
	/** 店販社ＦＡＸ番号が半角文字以外です。 */
	public static final String TENHANSHA_FAX_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "tenhanshaFaxNoCheckHalfWidthOnlyError";
	/** 店販社ＦＡＸ番号の桁数が範囲外です。 */
	public static final String TENHANSHA_FAX_NO_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaFaxNoLengthOutOfRangeError";
	/** 店販社コードが存在しません。 */
	public static final String TENHANSHA_CD_NULL_ERROR = "tenhanshaCdNullError";
	/** 店販社電話番号が半角文字以外です。 */
	public static final String TENHANSHA_TEL_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "tenhanshaTelNoCheckHalfWidthOnlyError";
	/** 店販社住所1の桁数が範囲外です。 */
	public static final String TENHANSHA_ADDRESS1_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaAddress1LengthOutOfRangeError";
	/** 店販社住所2の桁数が範囲外です。 */
	public static final String TENHANSHA_ADDRESS2_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaAddress2LengthOutOfRangeError";
	/** 店販社電話番号が数値以外です。 */
	public static final String TENHANSHA_TEL_NO_CHECK_NUMERIC_ONLY_ERROR = "tenhanshaTelNoCheckNumericOnlyError";
	/** 店販社電話番号の桁数が範囲外です。 */
	public static final String TENHANSHA_TEL_NO_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaTelNoLengthOutOfRangeError";
	/** 店販社都道府県の桁数が範囲外です。 */
	public static final String TENHANSHA_PREFECTURE_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaPrefectureLengthOutOfRangeError";
	/** 店販社郵便番号が半角文字以外です。 */
	public static final String TENHANSHA_ZIP_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "tenhanshaZipCdCheckHalfWidthOnlyError";
	/** 店販社郵便番号の桁数が範囲外です。 */
	public static final String TENHANSHA_ZIP_CD_LENGTH_OUT_OF_RANGE_ERROR = "tenhanshaZipCdLengthOutOfRangeError";
	/** 伝票種別が半角文字以外です。 */
	public static final String SLIP_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "slipTypeCdCheckHalfWidthOnlyError";
	/** 伝票番号が半角文字以外です。 */
	public static final String SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "slipNoCheckHalfWidthOnlyError";
	/** 伝票番号の桁数が範囲外です。 */
	public static final String SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "slipNoLengthOutOfRangeError";
	/** 電話番号が数値以外です。 */
	public static final String TEL_NO_CHECK_NUMERIC_ONLY_ERROR = "telNoCheckNumericOnlyError";
	/** 電話番号の桁数が範囲外です。 */
	public static final String TEL_NO_LENGTH_OUT_OF_RANGE_ERROR = "telNoLengthOutOfRangeError";
	/** 都道府県の桁数が範囲外です。 */
	public static final String PREFECTURE_LENGTH_OUT_OF_RANGE_ERROR = "prefectureLengthOutOfRangeError";
	/** 当日分フラグが半角文字以外です。 */
	public static final String TODAY_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "todayFlgCheckHalfWidthOnlyError";
	/** 統合先ユーザーコードが半角文字以外です。 */
	public static final String UNI_USER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "uniUserCdCheckHalfWidthOnlyError";
	/** 統合先ユーザーコードの桁数が範囲外です。 */
	public static final String UNI_USER_CD_LENGTH_OUT_OF_RANGE_ERROR = "uniUserCdLengthOutOfRangeError";
	/** 得意先注文番号が半角文字以外です。 */
	public static final String ACCOUNT_ORDER_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "accountOrderNoCheckHalfWidthOnlyError";
	/** 特殊メッセージ区分が半角文字以外です。 */
	public static final String SPECIAL_MESSAGE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "specialMessageTypeCdCheckHalfWidthOnlyError";
	/** 特殊メッセージ区分の桁数が範囲外です。 */
	public static final String SPECIAL_MESSAGE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "specialMessageTypeCdLengthOutOfRangeError";
	/** 入荷日が数値以外です。 */
	public static final String RECEIVE_DT_CHECK_NUMERIC_ONLY_ERROR = "receiveDtCheckNumericOnlyError";
	/** 入荷日が日付ではありません。 */
	public static final String RECEIVE_DT_CHECK_NOT_DATE_FORMAT_ERROR = "receiveDtCheckNotDateFormatError";
	/** 入荷日が存在しません。 */
	public static final String RECEIVE_DT_NULL_ERROR = "receiveDtNullError";
	/** 入荷日の桁数が範囲外です。 */
	public static final String RECEIVE_DT_LENGTH_OUT_OF_RANGE_ERROR = "receiveDtLengthOutOfRangeError";
	/** 入荷発生事由が半角文字以外です。 */
	public static final String STORE_REASON_CHECK_HALF_WIDTH_ONLY_ERROR = "storeReasonCheckHalfWidthOnlyError";
	/** 入荷番号が半角文字以外です。 */
	public static final String RECEIVE_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "receiveNoCheckHalfWidthOnlyError";
	/** 入荷番号の桁数が範囲外です。 */
	public static final String RECEIVE_NO_LENGTH_OUT_OF_RANGE_ERROR = "receiveNoLengthOutOfRangeError";
	/** 入庫発生事由の桁数が範囲外です。 */
	public static final String STORE_REASON_LENGTH_OUT_OF_RANGE_ERROR = "storeReasonLengthOutOfRangeError";
	/** 入庫実績が重複しています。 */
	public static final String STORE_RECORD_DUPLICATE_ERROR = "storeRecordDuplicateError";
	/** 入庫伝票番号が半角文字以外です。 */
	public static final String STORE_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "storeSlipNoCheckHalfWidthOnlyError";
	/** 入庫日が数値以外です。 */
	public static final String STORE_DT_CHECK_NUMERIC_ONLY_ERROR = "storeDtCheckNumericOnlyError";
	/** 入庫日が日付ではありません。 */
	public static final String STORE_DT_CHECK_NOT_DATE_FORMAT_ERROR = "storeDtCheckNotDateFormatError";
	/** 入庫日の桁数が範囲外です。 */
	public static final String STORE_DT_LENGTH_OUT_OF_RANGE_ERROR = "storeDtLengthOutOfRangeError";
	/** 入出庫番号が半角文字以外です。 */
	public static final String RCV_SHP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "rcvShpNoCheckHalfWidthOnlyError";
	/** 入出庫番号の桁数が範囲外です。 */
	public static final String RCV_SHP_NO_LENGTH_OUT_OF_RANGE_ERROR = "rcvShpNoLengthOutOfRangeError";
	/** 入数が半角文字以外です。 */
	public static final String UNIT_NUM_CHECK_HALF_WIDTH_ONLY_ERROR = "unitNumCheckHalfWidthOnlyError";
	/** 納入先コードが半角文字以外です。 */
	public static final String DELIV_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "delivCdCheckHalfWidthOnlyError";
	/** 納品書印刷区分が半角文字以外です。 */
	public static final String DELIVERY_SLIP_PRINT_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "deliverySlipPrintTypeCdCheckHalfWidthOnlyError";
	/** 納品書印刷区分の桁数が範囲外です。 */
	public static final String DELIVERY_SLIP_PRINT_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "deliverySlipPrintTypeCdLengthOutOfRangeError";
	/** 納品書番号が半角文字以外です。 */
	public static final String DELIVERY_SLIP_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "deliverySlipNoCheckHalfWidthOnlyError";
	/** 納品書番号の桁数が範囲外です。 */
	public static final String DELIVERY_SLIP_NO_LENGTH_OUT_OF_RANGE_ERROR = "deliverySlipNoLengthOutOfRangeError";
	/** 廃棄返却日が数値以外です。 */
	public static final String WASTE_RETURN_DT_CHECK_NUMERIC_ONLY_ERROR = "wasteReturnDtCheckNumericOnlyError";
	/** 廃棄返却日が日付ではありません。 */
	public static final String WASTE_RETURN_DT_CHECK_NOT_DATE_FORMAT_ERROR = "wasteReturnDtCheckNotDateFormatError";
	/** 廃棄返却日の桁数が範囲外です。 */
	public static final String WASTE_RETURN_DT_LENGTH_OUT_OF_RANGE_ERROR = "wasteReturnDtLengthOutOfRangeError";
	/** 売上番号２が半角文字以外です。 */
	public static final String SALES_NO2_CHECK_HALF_WIDTH_ONLY_ERROR = "salesNo2CheckHalfWidthOnlyError";
	/** 売上番号２の桁数が範囲外です。 */
	public static final String SALES_NO2_LENGTH_OUT_OF_RANGE_ERROR = "salesNo2LengthOutOfRangeError";
	/** 販売組織コードが半角文字以外です。 */
	public static final String SALES_ORG_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "salesOrgCdCheckHalfWidthOnlyError";
	/** 販売組織コードの桁数が範囲外です。 */
	public static final String SALES_ORG_CD_LENGTH_OUT_OF_RANGE_ERROR = "salesOrgCdLengthOutOfRangeError";
	/** 品名カナ1が半角文字以外です。 */
	public static final String PROCUCT_NM_KANA1_CHECK_HALF_WIDTH_ONLY_ERROR = "procuctNmKana1CheckHalfWidthOnlyError";
	/** 品名カナ2が半角文字以外です。 */
	public static final String PROCUCT_NM_KANA2_CHECK_HALF_WIDTH_ONLY_ERROR = "procuctNmKana2CheckHalfWidthOnlyError";
	/** 品名漢字の桁数が範囲外です。 */
	public static final String PRODUCT_NM_KANJI_LENGTH_OUT_OF_RANGE_ERROR = "productNmKanjiLengthOutOfRangeError";
	/** 品目漢字の桁数が範囲外です。 */
	public static final String HINMOKU_KANJI_LENGTH_OUT_OF_RANGE_ERROR = "hinmokuKanjiLengthOutOfRangeError";
	/** 物品送付案内書備考欄の桁数が範囲外です。 */
	public static final String NOTIFICATION_COMMENT_LENGTH_OUT_OF_RANGE_ERROR = "notificationCommentLengthOutOfRangeError";
	/** 別途送料が数値以外です。 */
	public static final String SEPARATE_SHIPPING_FEE_CHECK_NUMERIC_ONLY_ERROR = "separateShippingFeeCheckNumericOnlyError";
	/** 別途送料の桁数が範囲外です。 */
	public static final String SEPARATE_SHIPPING_FEE_LENGTH_OUT_OF_RANGE_ERROR = "separateShippingFeeLengthOutOfRangeError";
	/** 保管場所が半角文字以外です。 */
	public static final String STORAGE_SPACE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "storageSpaceCdCheckHalfWidthOnlyError";
	/** 保管場所が存在しません。 */
	public static final String STORAGE_SPACE_CD_NULL_ERROR = "storageSpaceCdNullError";
	/** 保管場所の桁数が範囲外です。 */
	public static final String STORAGE_SPACE_CD_LENGTH_OUT_OF_RANGE_ERROR = "storageSpaceCdLengthOutOfRangeError";
	/** 保管場所名の桁数が範囲外です。 */
	public static final String STORAGE_SPACE_NM1_LENGTH_OUT_OF_RANGE_ERROR = "storageSpaceNm1LengthOutOfRangeError";
	/** 保管場所名別名の桁数が範囲外です。 */
	public static final String STORAGE_SPACE_NM2_LENGTH_OUT_OF_RANGE_ERROR = "storageSpaceNm2LengthOutOfRangeError";
	/** 郵便番号が半角文字以外です。 */
	public static final String ZIP_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "zipCdCheckHalfWidthOnlyError";
	/** 郵便番号の桁数が範囲外です。 */
	public static final String ZIP_CD_LENGTH_OUT_OF_RANGE_ERROR = "zipCdLengthOutOfRangeError";
	/** 予備コードが半角文字以外です。 */
	public static final String SPARE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "spareCdCheckHalfWidthOnlyError";
	/** 予備区分が半角文字以外です。 */
	public static final String SPARE_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "spareTypeCdCheckHalfWidthOnlyError";
	/** 予備区分の桁数が範囲外です。 */
	public static final String SPARE_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "spareTypeCdLengthOutOfRangeError";
	/** 預りJANコードが半角文字以外です。 */
	public static final String DEPOSIT_JAN_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "depositJanCdCheckHalfWidthOnlyError";
	/** 流通加工情報が重複しています。 */
	public static final String DISTRIBUTION_PROCESS_DATA_DUPLICATE_ERROR = "distributionProcessDataDuplicateError";
	/** 良品返却日が数値以外です。 */
	public static final String PRODUCT_RETURN_DT_CHECK_NUMERIC_ONLY_ERROR = "productReturnDtCheckNumericOnlyError";
	/** 良品返却日が日付ではありません。 */
	public static final String PRODUCT_RETURN_DT_CHECK_NOT_DATE_FORMAT_ERROR = "productReturnDtCheckNotDateFormatError";
	/** 良品返却日の桁数が範囲外です。 */
	public static final String PRODUCT_RETURN_DT_LENGTH_OUT_OF_RANGE_ERROR = "productReturnDtLengthOutOfRangeError";
	/** 連番が数値以外です。 */
	public static final String SN_CHECK_NUMERIC_ONLY_ERROR = "snCheckNumericOnlyError";
	/** 取扱販売組織CDを入力して下さい。 */
	public static final String SERV_SALES_ORG_CD_NOT_INPUT_ERROR = "servSalesOrgCdNotInputError";
	/** 取扱販売組織名称を入力して下さい。 */
	public static final String SERV_SALES_ORG_NM_NOT_INPUT_ERROR = "servSalesOrgNmNotInputError";
	/** 戸口配送先CDを入力して下さい。 */
	public static final String KOGUCHI_DELIVERY_CD_NOT_INPUT_ERROR = "koguchiDeliveryCdNotInputError";
	/** 戸口配送先名称を入力して下さい。 */
	public static final String KOGUCHI_DELIVERY_NM_NOT_INPUT_ERROR = "koguchiDeliveryNmNotInputError";
	/** 販売組織名称を入力して下さい。 */
	public static final String SALES_ORG_NM_NOT_INPUT_ERROR = "salesOrgNmNotInputError";
	/** 販売組織支店名称を入力して下さい。 */
	public static final String SALES_ORG_BRANCH_NM_NOT_INPUT_ERROR = "salesOrgBranchNmNotInputError";
	/** 廃止日が日付不正(形式:YYYY/MM/DD) */
	public static final String ABOLISH_DT_CHECK_DATE_FORMAT_ERROR = "abolishDtCheckDateFormatError";
	/** 廃止日は現在日より前の日付に指定することはできません。 */
	public static final String ABOLISH_DT_BEFORE_CURRENT_DATE_ERROR = "abolishDtBeforeCurrentDateError";
	/** 取扱販売組織CDが販売組織マスタに存在しません。 */
	public static final String SERV_SALES_ORG_CD_NOT_FOUND_IN_MASTER_ERROR = "servSalesOrgCdNotFoundInMasterError";
	/** 戸口配送先CDが配送先マスタに存在しません。 */
	public static final String KOGUCHI_DELIVERY_CD_NOT_FOUND_IN_MASTER_ERROR = "koguchiDeliveryCdNotFoundInMasterError";
	/** 作成時間(発注)が時刻ではありません。 */
	public static final String ADD_TIME_ORDER_CHECK_NOT_TIME_FORMAT_ERROR = "addTimeOrderCheckNotTimeFormatError";
	/** 梱包番号が半角文字以外です。 */
	public static final String PACKING_NO_CHECK_HALF_WIDTH_ONLY_ERROR = "packingNoCheckHalfWidthOnlyError";
	/** 作成者が半角文字以外です。 */
	public static final String SAP_ADD_USER_CHECK_HALF_WIDTH_ONLY_ERROR = "sapAddUserCheckHalfWidthOnlyError";
	/** 更新者が半角文字以外です。 */
	public static final String SAP_UPD_USER_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "sapUpdUserCdCheckHalfWidthOnlyError";
	/** 予備が半角文字以外です。 */
	public static final String SPARE_CHECK_HALF_WIDTH_ONLY_ERROR = "spareCheckHalfWidthOnlyError";
	/** 取扱販売組織CDが半角文字以外です。 */
	public static final String SERV_SALES_ORG_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "servSalesOrgCdCheckHalfWidthOnlyError";
	/** 取扱販売組織名称の桁数が範囲外です。 */
	public static final String SERV_SALES_ORG_NM_LENGTH_OUT_OF_RANGE_ERROR = "servSalesOrgNmLengthOutOfRangeError";
	/** 直送フラグの桁数が範囲外です。 */
	public static final String DIRECT_FLG_LENGTH_OUT_OF_RANGE_ERROR = "directFlgLengthOutOfRangeError";
	/** 取扱販売組織CDの桁数が範囲外です。 */
	public static final String SERV_SALES_ORG_CD_LENGTH_OUT_OF_RANGE_ERROR = "servSalesOrgCdLengthOutOfRangeError";
	/** 直送フラグが半角文字以外です。 */
	public static final String DIRECT_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "directFlgCheckHalfWidthOnlyError";
	/** 緊急フラグの桁数が範囲外です。 */
	public static final String URGENT_FLG_LENGTH_OUT_OF_RANGE_ERROR = "urgentFlgLengthOutOfRangeError";
	/** 緊急フラグが半角文字以外です。 */
	public static final String URGENT_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "urgentFlgCheckHalfWidthOnlyError";
	/** 納品フラグの桁数が範囲外です。 */
	public static final String DELIVERY_FLG_LENGTH_OUT_OF_RANGE_ERROR = "deliveryFlgLengthOutOfRangeError";
	/** 納品フラグが半角文字以外です。 */
	public static final String DELIVERY_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "deliveryFlgCheckHalfWidthOnlyError";
	/** 戸口配送先CDの桁数が範囲外です。 */
	public static final String KOGUCHI_DELIVERY_CD_LENGTH_OUT_OF_RANGE_ERROR = "koguchiDeliveryCdLengthOutOfRangeError";
	/** 戸口配送先CDが半角文字以外です。 */
	public static final String KOGUCHI_DELIVERY_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "koguchiDeliveryCdCheckHalfWidthOnlyError";
	/** 戸口配送先名称の桁数が範囲外です。 */
	public static final String KOGUCHI_DELIVERY_NM_LENGTH_OUT_OF_RANGE_ERROR = "koguchiDeliveryNmLengthOutOfRangeError";
	/** 統合配送先CDの桁数が範囲外です。 */
	public static final String UNI_DELIVERY_CD_LENGTH_OUT_OF_RANGE_ERROR = "uniDeliveryCdLengthOutOfRangeError";
	/** 統合配送先CDが半角文字以外です。 */
	public static final String UNI_DELIVERY_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "uniDeliveryCdCheckHalfWidthOnlyError";
	/** 統合配送先名称の桁数が範囲外です。 */
	public static final String UNI_DELIVERY_NM_LENGTH_OUT_OF_RANGE_ERROR = "uniDeliveryNmLengthOutOfRangeError";
	/** FW区分の桁数が範囲外です。 */
	public static final String FW_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "fwTypeCdLengthOutOfRangeError";
	/** FW区分が半角文字以外です。 */
	public static final String FW_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "fwTypeCdCheckHalfWidthOnlyError";
	/** MCA区分の桁数が範囲外です。 */
	public static final String MCA_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "mcaTypeCdLengthOutOfRangeError";
	/** MCA区分が半角文字以外です。 */
	public static final String MCA_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "mcaTypeCdCheckHalfWidthOnlyError";
	/** 用品区分の桁数が範囲外です。 */
	public static final String YOUHIN_TYPE_CD_LENGTH_OUT_OF_RANGE_ERROR = "youhinTypeCdLengthOutOfRangeError";
	/** 用品区分が半角文字以外です。 */
	public static final String YOUHIN_TYPE_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "youhinTypeCdCheckHalfWidthOnlyError";
	/** 運送業者IDの桁数が範囲外です。 */
	public static final String CARRIER_ID_LENGTH_OUT_OF_RANGE_ERROR = "carrierIdLengthOutOfRangeError";
	/** 運送業者IDが半角文字以外です。 */
	public static final String CARRIER_ID_CHECK_HALF_WIDTH_ONLY_ERROR = "carrierIdCheckHalfWidthOnlyError";
	/** 依頼元販売組織CDの桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_CD_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgCdLengthOutOfRangeError";
	/** 依頼元販売組織CDが半角文字以外です。 */
	public static final String REQ_SALES_ORG_CD_CHECK_HALF_WIDTH_ONLY_ERROR = "reqSalesOrgCdCheckHalfWidthOnlyError";
	/** 依頼元販売組織名称の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_NM_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgNmLengthOutOfRangeError";
	/** 依頼元販売組織支店名称の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_BRANCH_NM_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgBranchNmLengthOutOfRangeError";
	/** 依頼元販売組織住所１の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_ADDRESS1_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgAddress1LengthOutOfRangeError";
	/** 依頼元販売組織住所２の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_ADDRESS2_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgAddress2LengthOutOfRangeError";
	/** 依頼元販売組織郵便番号の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_ZIP_CD_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgZipCdLengthOutOfRangeError";
	/** 依頼元販売組織郵便番号が数値以外です。 */
	public static final String REQ_SALES_ORG_ZIP_CD_CHECK_NUMERIC_ONLY_ERROR = "reqSalesOrgZipCdCheckNumericOnlyError";
	/** 依頼元販売組織電話番号の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_TEL_NO_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgTelNoLengthOutOfRangeError";
	/** 依頼元販売組織電話番号が数値以外です。 */
	public static final String REQ_SALES_ORG_TEL_NO_CHECK_NUMERIC_ONLY_ERROR = "reqSalesOrgTelNoCheckNumericOnlyError";
	/** 依頼元販売組織FAX番号の桁数が範囲外です。 */
	public static final String REQ_SALES_ORG_FAX_NO_LENGTH_OUT_OF_RANGE_ERROR = "reqSalesOrgFaxNoLengthOutOfRangeError";
	/** 依頼元販売組織FAX番号が数値以外です。 */
	public static final String REQ_SALES_ORG_FAX_NO_CHECK_NUMERIC_ONLY_ERROR = "reqSalesOrgFaxNoCheckNumericOnlyError";
	/** 物品送付下部備考項目1の桁数が範囲外です。 */
	public static final String REMARK1_LENGTH_OUT_OF_RANGE_ERROR = "remark1LengthOutOfRangeError";
	/** 物品送付下部備考項目2の桁数が範囲外です。 */
	public static final String REMARK2_LENGTH_OUT_OF_RANGE_ERROR = "remark2LengthOutOfRangeError";
	/** 物品送付下部備考項目3の桁数が範囲外です。 */
	public static final String REMARK3_LENGTH_OUT_OF_RANGE_ERROR = "remark3LengthOutOfRangeError";
	/** 物品送付下部備考項目4の桁数が範囲外です。 */
	public static final String REMARK4_LENGTH_OUT_OF_RANGE_ERROR = "remark4LengthOutOfRangeError";
	/** 個別出力の桁数が範囲外です。 */
	public static final String INDV_OUT_LENGTH_OUT_OF_RANGE_ERROR = "indvOutLengthOutOfRangeError";
	/** 個別出力が半角文字以外です。 */
	public static final String INDV_OUT_CHECK_HALF_WIDTH_ONLY_ERROR = "indvOutCheckHalfWidthOnlyError";
	/** 送り状摘要が半角文字以外です。 */
	public static final String INVOICE_SUMMARY_CHECK_HALF_WIDTH_ONLY_ERROR = "invoiceSummaryCheckHalfWidthOnlyError";
	/** PSAMの桁数が範囲外です。 */
	public static final String PSAM_LENGTH_OUT_OF_RANGE_ERROR = "psamLengthOutOfRangeError";
	/** PSAMが半角文字以外です。 */
	public static final String PSAM_CHECK_HALF_WIDTH_ONLY_ERROR = "psamCheckHalfWidthOnlyError";
	/** 廃止日の桁数が範囲外です。 */
	public static final String ABOLISH_DT_LENGTH_OUT_OF_RANGE_ERROR = "abolishDtLengthOutOfRangeError";
	/** 廃止日が半角文字以外です。 */
	public static final String ABOLISH_DT_CHECK_HALF_WIDTH_ONLY_ERROR = "abolishDtCheckHalfWidthOnlyError";
	/** 運送会社名称が存在しません。 */
	public static final String CARRIER_COMPANY_NM_NULL_ERROR = "carrierCompanyNmNullError";
	/** 拠点CDの桁数が範囲外です。 */
	public static final String BASE_CD_LENGTH_OUT_OF_RANGE_ERROR2 = "baseCdLengthOutOfRangeError2";
	/** 拠点CDが半角文字以外です。 */
	public static final String BASE_CD_CHECK_HALF_WIDTH_ONLY_ERROR2 = "baseCdCheckHalfWidthOnlyError2";
	/** フロア完結フラグの桁数が範囲外です。 */
	public static final String FLOOR_COMP_FLG_LENGTH_OUT_OF_RANGE_ERROR = "floorCompFlgLengthOutOfRangeError";
	/** フロア完結フラグが半角文字以外です。 */
	public static final String FLOOR_COMP_FLG_CHECK_HALF_WIDTH_ONLY_ERROR = "floorCompFlgCheckHalfWidthOnlyError";
	/** 梱包明細情報が存在しません。 */
	public static final String PACKING_DTL_DATA_NOT_FOUND_ERROR = "packingDtlDataNotFoundError";
	/** Dが半角文字以外です。 */
	public static final String D_CHECK_HALF_WIDTH_ONLY_ERROR = "dCheckHalfWidthOnlyError";
	/** Iが半角文字以外です。 */
	public static final String I_CHECK_HALF_WIDTH_ONLY_ERROR = "iCheckHalfWidthOnlyError";
	/** 出荷予定明細番号が存在しません。 */
	public static final String SHIPPING_PLAN_SLIP_ROW_NO_NULL_ERROR = "shippingPlanSlipRowNoNullError";

}