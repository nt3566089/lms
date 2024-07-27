package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstRBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveRecordBBhv;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.dbflute.exentity.TMoveInstH;
import com.oneslogi.base.dbflute.exentity.TMoveInstR;
import com.oneslogi.base.dbflute.exentity.TMoveRecordB;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.stockupdate.StockUpdateLogic;

/**
 * 緊急補充在庫移動ロジッククラス
 */
class EmergencyReplenishStockMoveLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TMoveInstHBhv tMoveInstHBhv;
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;
	@Inject
	private TMoveInstRBhv tMoveInstRBhv;
	@Inject
	private TMoveRecordBBhv tMoveRecordBBhv;

	// ===== 使用ロジック =====
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private StockUpdateLogic stockUpdateLogic;

	/**
	 * <h2>在庫移動を行う。</h2>
	 * <pre>
	 * 引数より、
	 * 在庫移動指示データ（在庫移動指示ヘッダ、在庫移動実績ボディ、在庫移動指示帳票）を登録し、
	 * 【在庫移動[出庫]処理】、【在庫移動[入庫]処理】を実行する。
	 * 在庫移動処理で設定された情報を在庫移動指示データへ更新する。
	 * 在庫移動[入庫]処理で登録した在庫受払を返す。
	 *
	 * 【在庫移動[出庫]処理】
	 * ・{@link StockUpdateLogic#stockMoveOut(TMoveInstH, List, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.在庫移動[出庫]}を呼び出す。
	 *
	 * 【在庫移動[入庫]処理】。
	 * ・{@link StockUpdateLogic#stockMoveIn(TMoveInstH, List, TMoveRecordB, com.oneslogi.base.exception.ErrorManager.ErrorStatus) 在庫更新.在庫移動[入庫]}を呼び出す。
	 *
	 * </pre>
	 * @param stockFrom 移動元在庫：商品ID・ロットID・在庫区分ID・倉庫ID・預託ID・入庫No.ID・荷姿ID・仕入先ID・商品CD
	 *                  ・ロット・期限日・在庫区分CD・ロケーションCD・預託CD・仕入先CD・入庫ラベルNo.・入庫日・荷姿CD・入数
	 * @param moveNum 移動数
	 * @param locationTo 移動先ロケーション：倉庫ID・ロケーションID・倉庫CD・ロケーションCD
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param srcWorkNo 出庫指示バッチNo (在庫移動指示ヘッダに登録)
	 * @param processNo 処理No
	 * @param processDt 処理日(移動日)
	 * @param errSts エラー時に設定するエラーステータス
	 *
	 * @return TStockInout 移動先(入庫)の在庫受払
	 */
	protected TStockInout stockMove(TStock stockFrom, BigDecimal moveNum, MLocation locationTo, long centerId, long clientId, String srcWorkNo, String processNo, String processDt, ErrorStatus errSts) {

		// 在庫移動指示ヘッダ作成
		TMoveInstH header = createMoveInstHeader(centerId, clientId, processDt, srcWorkNo);

		// 在庫移動指示ボディ作成
		List<TMoveInstB> instBodyList = new ArrayList<TMoveInstB>();
		TMoveInstB instBodyFrom = createMoveInstBodyFrom(stockFrom, moveNum);
		TMoveInstB instBodyTo = createMoveInstBodyTo(stockFrom, moveNum, locationTo);

		instBodyList.add(instBodyFrom);
		instBodyList.add(instBodyTo);

		// 在庫移動実績ボディ作成
		TMoveRecordB recordBodyFrom = createMoveRecordB(instBodyFrom, processNo, processDt);
		TMoveRecordB recordBodyTo = createMoveRecordB(instBodyTo, processNo, processDt);

		// 在庫移動データ登録
		insertMoveData(header, instBodyFrom, instBodyTo, recordBodyFrom, recordBodyTo);

		// 在庫移動[出庫]実行
		stockUpdateLogic.stockMoveOut(header, instBodyList, recordBodyFrom, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-1083] 緊急補充の在庫移動ステータスは「未作業」のままとする(ステータス変更処理を削除) 2016.04.07 kawana

		// 在庫移動[入庫]実行
		TStockInout stockInout = stockUpdateLogic.stockMoveIn(header, instBodyList, recordBodyTo, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-1083] 緊急補充の在庫移動ステータスは「未作業」のままとする(ステータス変更処理を削除) 2016.04.07 kawana

		// 在庫移動データ更新
		updateMoveData(header, instBodyFrom, instBodyTo, recordBodyFrom, recordBodyTo);

		// 移動先在庫の返却

		return stockInout;
	}

	/**
	 * <h2>在庫移動指示データ登録処理。</h2>
	 * <pre>
	 *
	 * 【登録テーブル】
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示帳票
	 * ・在庫移動指示ボディ
	 * </pre>
	 */
	private void insertMoveData(TMoveInstH header, TMoveInstB instBodyFrom, TMoveInstB instBodyTo, TMoveRecordB recordBodyFrom, TMoveRecordB recordBodyTo) {

		// ===== 在庫移動指示ヘッダ登録 =====

		tMoveInstHBhv.insert(header);

		long headerId = header.getMoveInstHId();

		// ===== 在庫移動指示帳票登録 =====

		TMoveInstR tMoveInstR = new TMoveInstR();
		tMoveInstR.setMoveInstHId(headerId);
		tMoveInstR.setInstOutFlg_$0();
		tMoveInstRBhv.insert(tMoveInstR);

		// ===== 在庫移動指示ボディ登録 =====

		instBodyFrom.setMoveInstHId(headerId);
		instBodyTo.setMoveInstHId(headerId);

		tMoveInstBBhv.insert(instBodyFrom);
		tMoveInstBBhv.insert(instBodyTo);

		// ===== 在庫移動実績ボディ登録 =====
		recordBodyFrom.setMoveInstHId(headerId);
		recordBodyFrom.setMoveInstBId(instBodyFrom.getMoveInstBId());

		recordBodyTo.setMoveInstHId(headerId);
		recordBodyTo.setMoveInstBId(instBodyTo.getMoveInstBId());

		tMoveRecordBBhv.insert(recordBodyFrom);
		tMoveRecordBBhv.insert(recordBodyTo);
	}

	/**
	 * <h2>在庫移動実績データ登録処理。</h2>
	 * <pre>
	 *
	 * 【更新テーブル】
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示ボディ
	 *
	 * 【登録テーブル】
	 * ・在庫移動指示ヘッダ
	 * ・在庫移動指示帳票
	 * ・在庫移動指示ボディ
	 * ・在庫移動実績ボディ
	 * </pre>
	 */
	private void updateMoveData(TMoveInstH header, TMoveInstB instBodyFrom, TMoveInstB instBodyTo, TMoveRecordB recordBodyFrom, TMoveRecordB recordBodyTo) {

		// ===== 在庫移動指示ヘッダ更新 =====

		tMoveInstHBhv.update(header);

		// ===== 在庫移動指示ボディ更新 =====

		tMoveInstBBhv.update(instBodyFrom);
		tMoveInstBBhv.update(instBodyTo);

		// ===== 在庫移動実績ボディ更新 =====

		tMoveRecordBBhv.update(recordBodyFrom);
		tMoveRecordBBhv.update(recordBodyTo);
	}

	/**
	 * 在庫移動指示ヘッダを作成
	 * @return 在庫移動指示ヘッダ
	 */
	private TMoveInstH createMoveInstHeader(long centerId, long clientId, String systemDt, String srcWorkNo) {

		TMoveInstH header = new TMoveInstH();
		header.setClientId(clientId);
		header.setCenterId(centerId);
		header.setInputType_$00();
		header.setMoveInstStatus_$00();
		header.setInstDt(systemDt);
		header.setSourceBatchNo(srcWorkNo);

		// 処理区分ID取得
		MProcessType processTypeCondition = new MProcessType();
		processTypeCondition.setProcessTypeCd(CDef.ProcessTypeCd.$33.code());
		MProcessType processType = processTypeLogic.getUkEntityCacheable(processTypeCondition);

		header.setProcessTypeId(processType.getProcessTypeId());

		// WMS在庫移動伝票No.を採番
		String moveSlipNo = numberingCenterLogic.getNumbering(header.getCenterId(), WmsCoreNumberingConst.MOVE_SLIP_NO);
		header.setMoveSlipNo(moveSlipNo);

		return header;
	}

	/**
	 * 在庫移動指示ボディ(移動元)を作成
	 * @return 在庫移動指示ボディ(移動元)
	 */
	private TMoveInstB createMoveInstBodyFrom(TStock stockFrom, BigDecimal moveNum) {

		TMoveInstB body = new TMoveInstB();

		body.setInoutType_$1();
		body.setInstNum(moveNum);

		body.setProductId(stockFrom.getProductId());
		body.setLotId(stockFrom.getLotId());
		body.setStockTypeId(stockFrom.getStockTypeId());
		body.setWarehouseId(stockFrom.getWarehouseId());
		body.setLocationId(stockFrom.getLocationId());

		body.setDepositId(stockFrom.getDepositId());
		body.setSupplierId(stockFrom.getTStoreNo().getSupplierId());

		body.setStoreNoId(stockFrom.getStoreNoId());
		body.setShapeId(stockFrom.getShapeId());

		body.setProductCd(stockFrom.getMProduct().getProductCd());
		body.setLot(stockFrom.getTLot().getLot());
		body.setLimitDt(stockFrom.getTLot().getLimitDt());
		body.setStockTypeCd(stockFrom.getMStockType().getStockTypeCd());
		body.setWarehouseCd(stockFrom.getMWarehouse().getWarehouseCd());
		body.setLocationCd(stockFrom.getMLocation().getLocationCd());
		body.setDepositCd(stockFrom.getMCustomer().getCustomerCd());
		body.setSupplierCd(stockFrom.chaseTStoreNo().chaseMCustomer().getCustomerCd());
		body.setStoreLabelNo(stockFrom.getTStoreNo().getStoreLabelNo());
		body.setStoreDt(stockFrom.getTStoreNo().getStoreDt());
		body.setShapeCd(stockFrom.getMShape().getShapeCd());
		body.setUnitNum(stockFrom.getUnitNum());

		body.setMoveInstStatus_$00();

		return body;
	}

	/**
	 * 在庫移動指示ボディ(移動先)を作成
	 * @return 在庫移動指示ボディ(移動先)
	 */
	private TMoveInstB createMoveInstBodyTo(TStock stockFrom, BigDecimal moveNum, MLocation locationTo) {

		TMoveInstB body = new TMoveInstB();

		body.setInoutType_$0();
		body.setInstNum(moveNum);

		body.setProductId(stockFrom.getProductId());
		body.setLotId(stockFrom.getLotId());
		body.setStockTypeId(stockFrom.getStockTypeId());
		body.setWarehouseId(locationTo.chaseMZone().getWarehouseId());
		body.setLocationId(locationTo.getLocationId());

		body.setDepositId(stockFrom.getDepositId());
		body.setSupplierId(stockFrom.getTStoreNo().getSupplierId());

		body.setShapeId(stockFrom.getShapeId());

		body.setProductCd(stockFrom.getMProduct().getProductCd());
		body.setLot(stockFrom.getTLot().getLot());
		body.setLimitDt(stockFrom.getTLot().getLimitDt());
		body.setStockTypeCd(stockFrom.getMStockType().getStockTypeCd());
		body.setWarehouseCd(locationTo.chaseMZone().chaseMWarehouse().getWarehouseCd());
		body.setLocationCd(locationTo.getLocationCd());
		body.setDepositCd(stockFrom.getMCustomer().getCustomerCd());
		body.setSupplierCd(stockFrom.chaseTStoreNo().chaseMCustomer().getCustomerCd());
		body.setStoreDt(stockFrom.getTStoreNo().getStoreDt());
		body.setShapeCd(stockFrom.getMShape().getShapeCd());
		body.setUnitNum(stockFrom.getUnitNum());

		body.setMoveInstStatus_$00();

		return body;
	}

	/**
	 * 在庫移動実績ボディの作成
	 * @param instBody 在庫移動指示ボディ
	 * @param processNo 処理No.
	 * @param processDt 処理日
	 * @return 新規 在庫移動実績ボディ
	 */
	private TMoveRecordB createMoveRecordB(TMoveInstB instBody, String processNo, String processDt) {

		TMoveRecordB body = new TMoveRecordB();

		body.setMoveInstHId(instBody.getMoveInstHId());
		body.setMoveInstBId(instBody.getMoveInstBId());
		body.setProcessNo(processNo);
		body.setLocationId(instBody.getLocationId());
		body.setMoveDt(processDt);
		body.setMoveNum(instBody.getInstNum());

		return body;
	}
}
