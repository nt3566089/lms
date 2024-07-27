package com.oneslogi.wms.core;

import com.oneslogi.base.PropertyConst;

/**
 * プロパティマスタのデフォルト値設定クラス
 *
 */

public class WmsCorePropertyConst extends PropertyConst {

	/** 数値の最大値(出庫指示[梱包計算]の数値チェックで使用) */
	public static final PropertySetting MAX_COUNT = new PropertySetting("maxNumber", "9999999999.9999");
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
	/** 一括処理件数 (日次締処理で使用)（デフォルト値:1000）*/
	public static final PropertySetting BATCH_DATA_COUNT = new PropertySetting("batchDataCount", "1000");
	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
	// [#5395][v3.1] 帳票最大桁の確認用モードの追加 2018.10.30 kawana Start
	/** 帳票最大桁数確認モード (デフォルト値:未設定）*/
	public static final PropertySetting REPORT_MAX_TEST_MODE = new PropertySetting("reportMaxTestMode", "");
	// [#5395][v3.1] 帳票最大桁の確認用モードの追加 2018.10.30 kawana End
	/** 在庫引当ロケ指定時、ロケーションID利用モード (デフォルト値:未設定）*/
	public static final PropertySetting STOCK_ALLOCATION_MODE_BY_LOCATION_ID = new PropertySetting("stockAllocationModeByLocationId", "");
	/** 在庫引当ロット・期限日指定時、ロットID利用モード (デフォルト値:未設定）*/
	public static final PropertySetting STOCK_ALLOCATION_MODE_BY_LOT_ID = new PropertySetting("stockAllocationModeByLotId", "");
}
