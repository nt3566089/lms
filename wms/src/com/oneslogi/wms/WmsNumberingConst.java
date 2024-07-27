package com.oneslogi.wms;

import com.oneslogi.base.BaseNumberingConst;

public class WmsNumberingConst extends BaseNumberingConst {

	/** 入荷伝票No. */
	public static final String RECEIVE_SPLIT_NO = "RECEIVE_SPLIT_NO";

	/** 入庫ラベルNo. */
	public static final String STORE_LABEL_NO = "STORE_LABEL_NO";

	/** 処理No. */
	public static final String PROCESS_NO = "PROCESS_NO";

	/** 棚卸バッチNo */
	public static final String INVENTORY_BATCH_NUM = "INVENTORY_BATCH_NUM";

	/** 出荷伝票No. */
	public static final String SHIPPING_SLIP_NO = "SHIPPING_SLIP_NO";

	/** 出庫指示バッチNo */
	public static final String PICKING_BATCH_NO = "PICKING_BATCH_NO";

	/** 届先単位No. */
	public static final String DELIV_UNIT_NO = "DELIV_UNIT_NO";

	/** 出庫作業No. */
	public static final String PICKING_WORK_NO = "PICKING_WORK_NO";

	/** 出荷検品中断ID(自動採番). */
	public static final String SHIPPING_INST_H_ID = "SHIPPING_INST_H_ID";

	/** 在庫移動伝票No. */
	public static final String MOVE_SLIP_NO = "MOVE_SLIP_NO";

	/** ピッキンググループNo. */
	public static final String PICKING_GROUP_NO = "PICKING_GROUP_NO";

	/** 出荷梱包No. */
	public static final String SHIPPING_PACKING_NO = "SHIPPING_PACKING_NO";

	/** 受信ID */
	public static final String RECEIVE_ID = "RECEIVE_ID";

	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.01 kawana Start
	/** 受信CD */
	public static final String RECEIVE_CD = "RECEIVE_CD";
	// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 2016.08.01 kawana End

	//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	/** 受信CD */
	public static final String BOL_NO = "BOL_NO";
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM End

}
