package com.oneslogi.wms.core.logic.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef.DecimalProductPacking;
import com.oneslogi.base.dbflute.allcommon.CDef.PackingCalCls;
import com.oneslogi.base.dbflute.allcommon.CDef.PackingProcessCls;
import com.oneslogi.base.dbflute.allcommon.CDef.ProductPartPacking;
import com.oneslogi.base.dbflute.cbean.MBoxGrpDtlCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingBBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MBoxGrpDtl;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.WmsCoreMessageConst;
import com.oneslogi.wms.core.WmsCoreNumberingConst;
import com.oneslogi.wms.core.WmsCorePropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.core.logic.common.ProductShapeCalcLogic;

/**
 * 梱包計算ロジッククラス
 */
public class PackingCalculateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private TPickingBBhv pickingBBhv;
	@Inject
	private TPackingHBhv packingHBhv;
	@Inject
	private TPackingRBhv packingRBhv;
	@Inject
	private TPackingBBhv packingBBhv;
	@Inject
	private MBoxGrpDtlBhv boxGrpDtlBhv;

	// ===== 使用ロジック ======

	@Inject
	private ParamLogic paramLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	// [#2961] 複数荷姿対応 2017.11.10 kawana Start
	@Inject
	private ProductShapeCalcLogic productShapeCalcLogic;
	// [#2961] 複数荷姿対応 2017.11.10 kawana End

	// [#928] ケースピッキングNo.採番を追加 2017.02.02 kawana Start

	// ===== 変数 =====

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(CasePickingNoMap削除) 2018.08.22 kawana Delete

	// 数値の最大(超過チェック用)
	private static BigDecimal MAX_NUMBER = null;

	// [#928] ケースピッキングNo.採番を追加 2017.02.02 kawana End

	/**
	 * <h2>梱包計算。</h2>
	 * <pre>
	 * パラメータのコントロールNoを検索条件に出庫ボディを検索し、
	 * 検索したデータを対象に梱包計算を行う。
	 *
	 * パラメータマスタの下記項目の設定に従い梱包計算し、
	 * 梱包ヘッダ、梱包ボディ、梱包帳票を登録する。
	 *
	 * ・梱包計算処理区分
	 * ・詰め込み方
	 * ・商品毎別梱包
	 * ・梱包荷材グループID
	 *
	 * このメソッドで「出荷梱包No」を採番する
	 *
	 * 【検索テーブル】
	 * ・出庫ボディ
	 * ・パラメータマスタ
	 * ・荷材グループ明細
	 *
	 * 【登録テーブル】
	 * ・梱包ヘッダ
	 * ・梱包帳票
	 * ・梱包ボディ
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 * ・センタID
	 * ・荷主ID
	 * ・コントロールNo
	 *
	 * </pre>
	 * @param shippingInstHead 引当指示ヘッダ
	 * @param errSts エラー発生時のエラーステータス
	 */
	public void calculate(TShippingInstH shippingInstHead, ErrorStatus errSts) {

		final long centerId = shippingInstHead.getCenterId();
		final long clientId = shippingInstHead.getClientId();

		// ===== 梱包の設定値を取得 =====

		// パラメータマスタ検索
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(clientId);
		mClientCenter.setCenterId(centerId);
		// レスポンス対策 2016.01.22 kawana Start
		MParam mParam = paramLogic.getUkEntityUseCash(mClientCenter);
		// レスポンス対策 2016.01.22 kawana End

		// 計算処理区分
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
		PackingCalCls calCls = mParam.getPackingCalClsAsPackingCalCls();
		if (calCls == null) {
			// 未設定の場合は梱包計算なし扱い
			calCls = PackingCalCls.$0;
		}

		// 詰め込み方
		PackingProcessCls processCls = mParam.getPackingProcessClsAsPackingProcessCls();
		// 商品の別梱包 可不可
		ProductPartPacking productPartPackingCls = mParam.getProductPartPackingAsProductPartPacking();
		// [#2961] 複数荷姿対応 2017.11.10 kawana Start
		// 小数管理商品梱包単位
		DecimalProductPacking decimalProductPackingCls = mParam.getDecimalProductPackingAsDecimalProductPacking();
		// [#2961] 複数荷姿対応 2017.11.10 kawana End

		// ===== 使用する荷材、基準荷材を取得 ===

		// 荷材グループを検索
		List<MBox> boxList = selectBoxList(mParam.getPackingBoxGroupId());
		MBox standardBox = null;
		if (boxList == null) {
			if (calCls == PackingCalCls.$1) {
				// 荷材グループ取得エラー
				getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_BOX_GROUP_ERROR);
				return;
			}
		} else {

			// 標準荷材の取得
			standardBox = getStandardBox(boxList);

			if (calCls == PackingCalCls.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End

				// 容積と重量の設定チェック
				if (WCC.isZero(CU.nullToZero(standardBox.getPermitVolume())) &&
						WCC.isZero(CU.nullToZero(standardBox.getPermitWeight()))) {

					// 容積、重量未設定エラー
					getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_STANDARD_BOX_INFO_ERROR);
					return;
				}
			}

			// 荷材の大きさが全て同じ大きさかをチェック
			if (isSameBoxVolume(boxList)) {

				// 標準荷材のみを使用
				boxList.clear();
				boxList.add(standardBox);
			}
		}

		// ===== 対象の出荷データの検索(出庫ボディ) =====

		// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 - 検索処理の共通化 2018.02.21 kawana Start

		List<TPickingB> pickingBList = selectShippingData(shippingInstHead);
		if (pickingBList.isEmpty()) {
			return;
		}

		// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 - 検索処理の共通化 2018.02.21 kawana End

		// ===== 梱包計算 =====

		// 出庫ヘッダID毎にデータをまとめる
		Map<Long, List<TPickingB>> pickingDataMap = groupPickingDataByHeaderId(pickingBList);

		// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana Start
		// 出庫ヘッダID毎に梱包処理 (DB登録順を固定するためにLinkedHashMap使用)
		Map<Long, List<TPackingH>> packingDataMap = new LinkedHashMap<Long, List<TPackingH>>();
		// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana End
		for (Map.Entry<Long, List<TPickingB>> pickingDataEntry : pickingDataMap.entrySet()) {

			List<TPickingB> pickingBodyList = pickingDataEntry.getValue();

			// 出庫ヘッダ毎に梱包計算処理
			List<TPackingH> packingHList = calculate(pickingBodyList, mParam, calCls, processCls, productPartPackingCls, decimalProductPackingCls, boxList, standardBox, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			packingDataMap.put(pickingDataEntry.getKey(), packingHList);
		}

		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(setSeedNo呼出削除) 2018.08.22 kawana Delete

		// ===== 梱包データをデータベースに登録 =====
		insertPackingData(packingDataMap.values());
	}

	/**
	 * 荷材リストを検索
	 * 検索した後、標準荷材には標準荷材フラグを設定する
	 * @param boxGroupId 荷材グループID
	 */
	private List<MBox> selectBoxList(Long boxGroupId) {
		if (boxGroupId == null) {
			return null;
		}

		MBoxGrpDtlCB boxCb = boxGrpDtlBhv.newMyConditionBean();
		boxCb.checkInvalidQuery();
		boxCb.setupSelect_MBox();
		boxCb.setupSelect_MBoxGrp();
		boxCb.query().setBoxGrpId_Equal(boxGroupId);

		List<MBoxGrpDtl> boxGrpDtlList = boxGrpDtlBhv.selectList(boxCb);
		if (boxGrpDtlList.size() == 0) {
			return null;
		}

		Long standardId = boxGrpDtlList.get(0).getMBoxGrp().getStandardBoxId();

		List<MBox> boxList = new ArrayList<MBox>();
		for (MBoxGrpDtl dtl : boxGrpDtlList) {
			MBox box = dtl.getMBox();
			// 標準荷材の判定
			if (CU.isNotNullAndEquals(standardId, box.getBoxId())) {
				box.setStandardFlg(true);
			}
			boxList.add(box);
		}

		// 容積、重量でソート
		Collections.sort(boxList, new BoxComparator());

		return boxList;
	}

	/**
	 * 荷材リストが全て同じ容積、重量でないかをチェック
	 *
	 * @param boxList 荷材リスト
	 * @return true : 全て同じ容積、重量
	 */
	private boolean isSameBoxVolume(List<MBox> boxList) {

		boolean isAllSame = true;
		// 1件目を比較対象に設定
		BigDecimal preBoxVolume = boxList.get(0).getPermitVolume();
		BigDecimal preBoxWeigt = boxList.get(0).getPermitWeight();
		for (MBox box : boxList) {
			BigDecimal boxVolume = box.getPermitVolume();
			BigDecimal boxWeigt = box.getPermitWeight();

			if (preBoxVolume != null || boxVolume != null) {
				if (!WCC.isEqual(preBoxVolume, boxVolume)) {
					isAllSame = false;
					break;
				}
			}

			if (preBoxWeigt != null || boxWeigt != null) {
				if (!WCC.isEqual(preBoxWeigt, boxWeigt)) {
					isAllSame = false;
					break;
				}
			}
		}

		return isAllSame;
	}

	/**
	 * 荷材の比較クラス
	 * ・荷材の容積 (小さい順)
	 * ・荷材の重量 (小さい順)
	 */
	static class BoxComparator implements Comparator<MBox> {

		@Override
		public int compare(MBox box1, MBox box2) {

			BigDecimal box1volume = box1.getPermitVolume();
			BigDecimal box2volume = box2.getPermitVolume();

			if (box1volume == null) {
				box1volume = WCC.MINUS_ONE;
			}
			if (box2volume == null) {
				box2volume = WCC.MINUS_ONE;
			}

			if (box1volume.compareTo(box2volume) != 0) {
				// 容積昇順
				return box1volume.compareTo(box2volume);
			}

			BigDecimal box1weight = box1.getPermitWeight();
			BigDecimal box2weight = box2.getPermitWeight();

			if (box1weight == null) {
				box1weight = WCC.MINUS_ONE;
			}
			if (box2weight == null) {
				box2weight = WCC.MINUS_ONE;
			}

			if (box1weight.compareTo(box2weight) != 0) {
				// 重量昇順
				return box1weight.compareTo(box2weight);
			}

			return 0;
		}
	}

	/**
	 * 標準荷材を取得
	 * 標準荷材が設定されていない場合は1件目の荷材を返す
	 * @param boxList 荷材リスト
	 * @return 標準荷材
	 */
	private MBox getStandardBox(List<MBox> boxList) {

		for (MBox box : boxList) {
			if (box.getStandardFlg() == null) {
				continue;
			}

			if (box.getStandardFlg()) {
				return box;
			}
		}

		return boxList.get(0);
	}

	// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 - 検索処理の共通化 2018.02.21 kawana Start

	/**
	 * 出荷データ検索
	 */
	private List<TPickingB> selectShippingData(TShippingInstH shippingInstHead) {

		TPickingBCB cb = pickingBBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_TPickingH();
		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(MCenterCustomer結合削除) 2018.08.22 kawana Delete
		// [#2961] 複数荷姿対応 2017.11.10 kawana Start
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		cb.setupSelect_TStock().withMProduct().withMShapeGrp();
		// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		// [#2961] 複数荷姿対応 2017.11.10 kawana End
		// [#5131][v3.1] ピッキングリストの採番を発行時に変更(MLocation結合削除) 2018.08.22 kawana Delete
		// 検索条件：コントロールNo
		cb.query().queryTShippingInstB().queryTShippingInstH().setControlNo_Equal(shippingInstHead.getControlNo());

		// ソート順
		// 出荷No順 ( 顧客伝票No順 > WMS伝票No順 > 明細の行No )
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_ClientShippingNo_Asc().withNullsLast();
		cb.query().queryTShippingInstB().queryTShippingInstH().addOrderBy_ShippingSlipNo_Asc().withNullsLast();
		cb.query().queryTShippingInstB().addOrderBy_LineNo_Asc();
		// [#2732][v3.0] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2018.07.31 kawana Start
		cb.query().addOrderBy_PickingBId_Asc();
		// [#2732][v3.0] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2018.07.31 kawana End

		// 検索実行
		List<TPickingB> pickingBList = pickingBBhv.selectList(cb);

		return pickingBList;
	}

	// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 - 検索処理の共通化 2018.02.21 kawana End

	/**
	 * 引数の出庫ボディリストを出庫ヘッダID毎にまとめる
	 * @param pickingBList 出庫ボディリスト
	 * @return 出庫ヘッダID毎にまとめた出庫ボディリスト
	 */
	private Map<Long, List<TPickingB>> groupPickingDataByHeaderId(List<TPickingB> pickingBList) {

		// キー:出庫ヘッダID
		Map<Long, List<TPickingB>> pickingData = new LinkedHashMap<Long, List<TPickingB>>();

		for (TPickingB body : pickingBList) {
			long headerId = body.getPickingHId();

			List<TPickingB> bodyList;
			if (pickingData.containsKey(headerId)) {
				bodyList = pickingData.get(headerId);
			} else {
				bodyList = new ArrayList<TPickingB>();
				pickingData.put(headerId, bodyList);
			}

			bodyList.add(body);
		}

		return pickingData;
	}

	/**
	 * <h2>梱包計算。</h2>
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
	private List<TPackingH> calculate(List<TPickingB> pickingBList, MParam mParam, PackingCalCls calCls, PackingProcessCls processCls, ProductPartPacking productPartPackingCls,
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End
			DecimalProductPacking decimalProductPackingCls, List<MBox> boxList, MBox standardBox, ErrorStatus errSts) {

		// [#2961] 複数荷姿対応 2017.11.10 kawana Start

		// ===== ケース単位引当とピース単位引当のリストに分割 =====

		// ケース単位の出庫
		List<TPickingB> casePickingBList = new ArrayList<TPickingB>();
		// ピース単位の出庫
		List<TPickingB> piecePickingBList = new ArrayList<TPickingB>();
		// 小数あり商品の出庫
		List<TPickingB> decimalPickingBList = new ArrayList<TPickingB>();

		// 小数あり商品の荷姿グループマップ(キー：商品ID)
		Map<Long, Long> shpaeGrpMap = new HashMap<Long, Long>();

		for (TPickingB pickingB : pickingBList) {
			if (pickingB.getShapeId() == null) {
				// ケース単位の梱包なし

				if (pickingB.getTStock().getMProduct().getMShapeGrp().isDecimalExistFlg$1()) {
					// 小数あり

					decimalPickingBList.add(pickingB);
					// 荷姿グループの情報を退避
					shpaeGrpMap.put(pickingB.getTStock().getProductId(), pickingB.getTStock().getMProduct().getShapeGrpId());
				} else {
					// 小数なし

					piecePickingBList.add(pickingB);
				}
			} else {
				// ケース梱包

				casePickingBList.add(pickingB);
			}
		}

		// [#2961] 複数荷姿対応 2017.11.10 kawana End

		// ===== 梱包リスト =====
		List<TPackingH> packingList = new ArrayList<TPackingH>();

		// ===== ケースの梱包 =====
		if (0 < casePickingBList.size()) {
			List<TPackingH> casePackingList = packingCase(casePickingBList, boxList);
			packingList.addAll(casePackingList);
		}

		// [#2961] 複数荷姿対応 2017.11.10 kawana Start

		// ===== バラの梱包 =====
		if (0 < piecePickingBList.size() || 0 < decimalPickingBList.size()) {

			// 計算区分により処理わけ
			switch (calCls) {
			case $0:
				// 梱包計算なし
				piecePickingBList.addAll(decimalPickingBList);
				List<TPackingH> piecePackingNoCalcList = packingPieceNoCalc(piecePickingBList, standardBox, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				packingList.addAll(piecePackingNoCalcList);
				break;
			case $1:
				// 容積と重量による計算

				// ===== 小数なしの商品を梱包 =====

				if (0 < piecePickingBList.size()) {

					if (processCls == null) {
						// 詰込区分取得エラー
						getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PROCESS_CLS_ERROR);
						return null;
					}

					if (productPartPackingCls == null) {
						// 商品毎別梱包取得エラー
						getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_PRODUCT_PART_PACKING_CLS_ERROR);
						return null;
					}

					List<TPackingH> piecePackingCalcList = packingPieceCalc(piecePickingBList, processCls, productPartPackingCls, standardBox);
					// 最適な荷材を再設定
					for (TPackingH packingH : piecePackingCalcList) {
						MBox optimumBox = getOptimumBox(packingH.getTotalVolume(), packingH.getGrossWeight(), boxList);
						packingH.setBoxId(optimumBox.getBoxId());
					}
					packingList.addAll(piecePackingCalcList);
				}

				// ===== 小数ありの商品を梱包 =====

				if (0 < decimalPickingBList.size()) {

					if (decimalProductPackingCls == null) {
						// 小数管理商品梱包単位取得エラー
						getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_NOT_FOUND_DECIMAL_PACKING_CLS_ERROR);
						return null;
					}

					List<TPackingH> decimalPackingList = packingDecimal(decimalPickingBList, shpaeGrpMap, decimalProductPackingCls, standardBox);
					packingList.addAll(decimalPackingList);
				}
				break;
			}
		}

		// [#2961] 複数荷姿対応 2017.11.10 kawana End

		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana Start

		// 最大数値チェック
		checkMaxNumber(packingList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana End

		return packingList;
	}

	/**
	 * ケース単位の梱包
	 *
	 * @return ケース単位で梱包した梱包ヘッダ(梱包ボディリストのセットあり)
	 */
	private List<TPackingH> packingCase(List<TPickingB> pickingBList, List<MBox> boxList) {

		// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana Start
		// ケース入数で割り切れなかったデータを商品IDごとに管理(処理を後回し) ※Plutoで差異がでないように順番を固定(TreeMap)
		Map<Long, List<TPickingB>> indivisibleProductMap = new TreeMap<Long, List<TPickingB>>();
		// [#2732] 同じデータで出庫指示してもDBデータの順番が異なる問題を修正(PlutoのDB比較用) 2017.12.18 kawana End

		// 梱包ヘッダリスト
		List<TPackingH> packingHList = new ArrayList<TPackingH>();

		for (TPickingB pickingB : pickingBList) {

			// 出庫数
			BigDecimal pickingNum = pickingB.getPickingNum();
			if (WCC.isZero(pickingNum)) {
				continue;
			}

			// [#2961] 複数荷姿対応 2017.11.10 kawana Start

			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

			// 商品ID
			long productId = pickingB.chaseTStock().getProductId();
			// 商品のケース荷姿
			MProductShape caseProductShape = productShapeCalcLogic.getCaseProductShape(productId);

			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			// ケース入数
			long unitNum = caseProductShape.getUnitNumPiece();

			// [#2961] 複数荷姿対応 2017.11.10 kawana End

			// ケース数の余り
			BigDecimal surplus = WCC.remainder(pickingNum, unitNum);

			if (WCC.isNotZero(surplus)) {
				// 余りがあるデータは後で処理

				// キー単位で割り切れないデータをリストにする
				List<TPickingB> indivisiblePickingBList;
				if (indivisibleProductMap.containsKey(productId)) {
					indivisiblePickingBList = indivisibleProductMap.get(productId);
				} else {
					indivisiblePickingBList = new ArrayList<TPickingB>();
					indivisibleProductMap.put(productId, indivisiblePickingBList);
				}
				indivisiblePickingBList.add(pickingB);
				continue;
			}

			// ケース数
			BigDecimal caseNum = WCC.divide(pickingNum, unitNum);

			BigDecimal caseVolume = caseProductShape.getVolume();
			BigDecimal caseWeight = caseProductShape.getGrossWeight();
			// 商品荷姿にあった荷材を取得
			MBox box = null;
			if (boxList != null) {
				box = getOptimumBox(caseVolume, caseWeight, boxList);
			}

			// ケース数分の梱包ヘッダ、梱包ボディを作成
			for (int i = 0; WCC.isLessThan(i, caseNum); i++) {

				// 梱包ヘッダ、梱包ボディを作成して追加
				packingHList.add(createCasePackingData(pickingB.getTPickingH(), pickingB, caseProductShape, box));
			}
		}

		// [#2961] 複数荷姿対応 2017.11.10 kawana Start

		// 割り切れなかったデータを処理(商品単位で繰返)
		for (Map.Entry<Long, List<TPickingB>> entry : indivisibleProductMap.entrySet()) {

			long productId = entry.getKey();
			List<TPickingB> indivisiblePickingList = entry.getValue();

			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			// 商品のケース荷姿
			MProductShape caseProductShape = productShapeCalcLogic.getCaseProductShape(productId);
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

			// ケース入数
			long unitNum = caseProductShape.getUnitNumPiece();

			// [#2961] 複数荷姿対応 2017.11.10 kawana End

			BigDecimal caseVolume = caseProductShape.getVolume();
			BigDecimal caseWeight = caseProductShape.getGrossWeight();
			// 商品荷姿にあった荷材を取得
			MBox box = null;
			if (boxList != null) {
				box = getOptimumBox(caseVolume, caseWeight, boxList);
			}

			// 梱包データ作成対象の出庫ボディリスト
			List<TPickingB> targetPikingBList = new ArrayList<TPickingB>();
			// 現在の数
			BigDecimal surplusPickingNum = WCC.ZERO;

			// 同じ商品の出庫ボディ件数分の繰返
			for (TPickingB pickingB : indivisiblePickingList) {
				// 現在の数に出庫数を追加
				BigDecimal pickingNum = pickingB.getPickingNum();
				surplusPickingNum = WCC.add(surplusPickingNum, pickingNum);
				// 対象の出庫ボディリストに追加
				targetPikingBList.add(pickingB);

				// ケース数
				BigDecimal caseNum = WCC.divide(surplusPickingNum, unitNum);
				if (WCC.isZeroOrLess(caseNum)) {
					// 1ケースに満たない場合は次のループ
					continue;
				}

				// ケース数分の梱包ヘッダ、梱包ボディを作成
				for (int i = 0; WCC.isLessThan(i, caseNum); i++) {

					// 梱包ヘッダ、梱包ボディを作成して追加
					packingHList.add(createCasePackingData(pickingB.getTPickingH(), targetPikingBList, caseProductShape, box));

					// 現在の数から1ケース分の数を引く
					surplusPickingNum = WCC.subtract(surplusPickingNum, unitNum);
					// 梱包データを作成したので対象の出庫ボディリストをクリア
					targetPikingBList.clear();

					// 余り数がまだある場合は、対象の出庫ボディリストに再追加
					if (WCC.isPositive(surplusPickingNum)) {
						targetPikingBList.add(pickingB);
					}
				}
			}
		}

		return packingHList;
	}

	/**
	 * 容積、重量の最適な荷材を返す
	 * 引数の荷材リストは許容容積、許容重量の小さい順に並んでいる必要がある
	 * @param weight 容積
	 * @param volume 重量
	 * @param boxList 荷材リスト
	 * @return 最適な荷材
	 */
	private MBox getOptimumBox(BigDecimal volume, BigDecimal weight, List<MBox> boxList) {

		// 商品容積、商品重量
		BigDecimal productVolume = nullToMinus(volume);
		BigDecimal productWeight = nullToMinus(weight);

		// 荷材に入るかチェックする
		for (MBox box : boxList) {
			// 容積を比較
			BigDecimal boxVolume = nullToMinus(box.getPermitVolume());
			if (WCC.isLessThan(boxVolume, productVolume)) {
				// 商品が大きくて入らない
				continue;
			}

			// 重量
			BigDecimal boxWeight = nullToMinus(box.getPermitWeight());
			if (WCC.isLessThan(boxWeight, productWeight)) {
				// 商品が重くて入らない
				continue;
			}

			// 容積も重量も問題なし
			return box;
		}

		// 最適な荷材が見つからない(どの荷材にも入らない)場合は最大の荷材を返却
		return boxList.get(boxList.size() - 1);
	}

	/**
	 * ケース梱包のデータを作成
	 */
	private TPackingH createCasePackingData(TPickingH pickingH, TPickingB pickingB, MProductShape caseProductShape, MBox box) {

		List<TPickingB> pickingBList = new ArrayList<TPickingB>();
		pickingBList.add(pickingB);
		return createCasePackingData(pickingH, pickingBList, caseProductShape, box);
	}

	/**
	 * ケース梱包のデータを作成
	 */
	private TPackingH createCasePackingData(TPickingH pickingH, List<TPickingB> pickingBList, MProductShape caseProductShape, MBox box) {
		BigDecimal totalGrossWeight = caseProductShape.getGrossWeight();
		BigDecimal totalVolume = caseProductShape.getVolume();
		// [#2961] 複数荷姿対応 2017.12.25 kawana Start
		BigDecimal pieceNum = WCC.toBigDecimal(caseProductShape.getUnitNumPiece());
		// [#2961] 複数荷姿対応 2017.12.25 kawana End

		// 梱包ヘッダ
		TPackingH packingH = new TPackingH();
		packingH.setClientId(pickingH.getClientId());
		packingH.setCenterId(pickingH.getCenterId());
		packingH.setProcessTypeId(pickingH.getProcessTypeId());
		packingH.setAllocInstHId(pickingH.getAllocInstHId());
		packingH.setPickingHId(pickingH.getPickingHId());
		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
		packingH.setShippingPackingNo(numberingLogic.getNumbering(pickingH.getCenterId(), WmsCoreNumberingConst.SHIPPING_PACKING_NO));
		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End
		if (box != null) {
			packingH.setBoxId(box.getBoxId());
		}
		packingH.setGrossWeight(totalGrossWeight);
		packingH.setTotalVolume(totalVolume);
		packingH.setPackingStatus_$25();
		packingH.setMixedFlg_$0();

		// 梱包帳票
		TPackingR packingR = new TPackingR();
		packingR.setStwOutFlg_$0();

		packingH.setTPackingRAsOne(packingR);

		// 梱包ボディ
		List<TPackingB> packingBList = createPackingBList(pickingBList, pieceNum);

		packingH.setTPackingBList(packingBList);

		return packingH;
	}

	/**
	 * <h2>梱包ボディを作成</h2>
	 * <pre>
	 * ※ 引数の出庫ボディの使い回しを考慮し、出庫数から梱包数を引く
	 * </pre>
	 */
	private List<TPackingB> createPackingBList(List<TPickingB> pickingBList, BigDecimal pieceNum) {

		List<TPackingB> packingBList = new ArrayList<TPackingB>();
		BigDecimal totalPackingNum = pieceNum;
		for (TPickingB pickingB : pickingBList) {
			TPackingB packingB = new TPackingB();
			packingB.setPickingBId(pickingB.getPickingBId());
			packingB.setAllocInstBId(pickingB.getAllocInstBId());

			// 梱包数の計算
			BigDecimal pickingNum = pickingB.getPickingNum();
			if (WCC.isZeroOrLess(pickingNum)) {
				continue;
			}
			BigDecimal packingNum;
			if (WCC.isLessThan(pickingNum, totalPackingNum)) {
				// 出庫数より総梱包数が多い

				packingNum = pickingNum;
			} else {
				// 出庫数より総梱包数が多い

				packingNum = totalPackingNum;
			}

			// 梱包ボディに梱包数を設定
			packingB.setPackingNum(packingNum);
			totalPackingNum = WCC.subtract(totalPackingNum, packingNum);

			// 出庫数を減らす(出庫ボディを使い回すため)
			pickingB.setPickingNum(WCC.subtract(pickingNum, packingNum));

			packingB.setPickingFlg_$0();
			packingB.setInspectionFlg_$0();

			// [#5131][v3.1] ピッキングリストの採番を発行時に変更(ケースピッキングNo.採番処理を削除) 2018.08.22 kawana Delete

			packingBList.add(packingB);

			if (WCC.isZeroOrLess(totalPackingNum)) {
				break;
			}
		}
		return packingBList;
	}

	// [#2961] 複数荷姿対応 2017.11.10 kawana Start

	/**
	 * <h2>梱包ボディを作成(小数有り商品)</h2>
	 */
	private List<TPackingB> createPackingBListDecimal(TPackingH packingH, List<TPickingB> pickingBList) {

		List<TPackingB> packingBList = new ArrayList<TPackingB>();

		for (TPickingB pickingB : pickingBList) {

			TPackingB packingB = new TPackingB();
			packingB.setPickingBId(pickingB.getPickingBId());
			packingB.setAllocInstBId(pickingB.getAllocInstBId());

			// 出庫数
			BigDecimal pickingNum = pickingB.getPickingNum();
			if (WCC.isZeroOrLess(pickingNum)) {
				continue;
			}

			// 梱包数に出庫数を設定
			packingB.setPackingNum(pickingNum);

			packingB.setPickingFlg_$0();
			packingB.setInspectionFlg_$0();

			packingBList.add(packingB);
		}

		return packingBList;
	}

	// [#2961] 複数荷姿対応 2017.11.10 kawana End

	/**
	 * ピース単位での梱包を行う
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
	private List<TPackingH> packingPieceCalc(List<TPickingB> piecePickingBList, PackingProcessCls processCls, ProductPartPacking productPartPackingCls, MBox standardBox) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End

		// ===== 商品ごとに容積、重量を計算 =====
		List<PiecePackingProduct> pakicngProductList = createPackingProductList(piecePickingBList);

		// ===== 詰め込み方で分岐 =====
		List<TPackingH> packingDataList = null;
		switch (processCls) {
		case $0:
			// 出荷No順
			packingDataList = packingPieceCalcPriorityOrder(pakicngProductList, productPartPackingCls, standardBox);
			break;
		case $1:
			// なるべく詰める
			packingDataList = packingPieceCalcPriorityBoxSpace(pakicngProductList, productPartPackingCls, standardBox);
			break;
		}

		return packingDataList;
	}

	/**
	 * 引数の出庫ボディのリストから同じ商品をまとめて返却する
	 *
	 * @param piecePickingBList 出庫ボディリスト
	 * @return PiecePackingProduct ピース梱包商品クラス
	 */
	private List<PiecePackingProduct> createPackingProductList(List<TPickingB> piecePickingBList) {

		// 商品IDをキーにしたピース梱包商品クラスのマップ
		Map<Long, PiecePackingProduct> packingProductMap = new LinkedHashMap<Long, PiecePackingProduct>();

		for (TPickingB pickingB : piecePickingBList) {

			// 商品ID
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			long productId = pickingB.chaseTStock().getProductId();
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			// 出庫数
			BigDecimal pickingNum = pickingB.getPickingNum();
			if (WCC.isZero(pickingNum)) {
				continue;
			}

			if (packingProductMap.containsKey(productId)) {
				// 既に作成済のため梱包数に加算
				PiecePackingProduct packingProduct = packingProductMap.get(productId);
				packingProduct.addPackingNum(pickingNum, pickingB);
			} else {
				// ピース商品クラスを作成

				// [#2961] 複数荷姿対応 2017.11.10 kawana Start

				BigDecimal pieceVolume = null;
				BigDecimal pieceWeight = null;

				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				// 商品のピース荷姿
				MProductShape pieceProductShape = productShapeCalcLogic.getPieceProductShape(pickingB.chaseTStock().getProductId());
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

				if (pieceProductShape != null) {

					pieceVolume = pieceProductShape.getVolume();
					pieceWeight = pieceProductShape.getGrossWeight();
				}

				// [#2961] 複数荷姿対応 2017.11.10 kawana End

				PiecePackingProduct packingProduct = new PiecePackingProduct(productId, pieceVolume, pieceWeight, pickingNum, pickingB);
				packingProductMap.put(productId, packingProduct);
			}
		}

		List<PiecePackingProduct> pakicngProductList = new ArrayList<PiecePackingProduct>();
		pakicngProductList.addAll(packingProductMap.values());
		return pakicngProductList;
	}

	/**
	 * ピース単位での梱包を行う(出庫指示No順)
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
	private List<TPackingH> packingPieceCalcPriorityOrder(List<PiecePackingProduct> pakicngProductList, ProductPartPacking productPartPackingCls, MBox box) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End
		List<TPackingH> packingDataList = null;
		switch (productPartPackingCls) {
		case $0:
			// 同じ商品は1つの箱に梱包
			packingDataList = packingPieceCalcPriorityOrderUnpermitPart(pakicngProductList, box);
			break;
		case $1:
			// 同じ商品を別の箱に梱包しても良い
			packingDataList = packingPieceCalcPriorityOrderPermitPart(pakicngProductList, box);
			break;
		}

		return packingDataList;
	}

	/**
	 * ピース単位での梱包を行う(出庫指示No順 - 同じ商品の別箱への梱包不可)
	 */
	private List<TPackingH> packingPieceCalcPriorityOrderUnpermitPart(List<PiecePackingProduct> pakicngProductList, MBox box) {

		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 荷材の容積、重量
		BigDecimal boxVolume = nullOrZeroToMax(box.getPermitVolume());
		BigDecimal boxWeight = nullOrZeroToMax(box.getPermitWeight());

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 現在作業中の箱
		TPackingH workingPackingH = createPiecePackingH(pickingH, box);
		packingDataList.add(workingPackingH);

		// 梱包商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 現在の箱に入る数を算出
			BigDecimal productSpaceNum = getProductSpaceNum(workingPackingH, product, boxVolume, boxWeight);
			// 商品数
			BigDecimal productNum = product.getPackingNum();

			if (WCC.isLessEqual(productNum, productSpaceNum)) {
				// 全ての商品が入る場合は梱包

				// 梱包ボディを作成
				List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);

				if ((workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {
					workingPackingH.setTPackingBList(packingBList);
				} else {
					workingPackingH.getTPackingBList().addAll(packingBList);
				}

				// 箱の容積、重量を更新
				workingPackingH.setTotalVolume(WCC.add(workingPackingH.getTotalVolume(), product.getTotalVolume()));
				workingPackingH.setGrossWeight(WCC.add(workingPackingH.getGrossWeight(), product.getTotalWeight()));
			} else {
				// 全ての商品が入らない

				// 基準荷材に1つも入らない場合は無理やり梱包
				if (WCC.isZero(workingPackingH.getTotalVolume()) &&
						WCC.isZero(workingPackingH.getGrossWeight()) &&
						(workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {
					// 空の状態なのに入らない

					List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);
					workingPackingH.setTPackingBList(packingBList);
					workingPackingH.setTotalVolume(product.getTotalVolume());
					workingPackingH.setGrossWeight(product.getTotalWeight());
				} else {
					// 新規荷材を作成して梱包
					workingPackingH = createPiecePackingH(pickingH, box);
					packingDataList.add(workingPackingH);

					List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);
					workingPackingH.setTPackingBList(packingBList);
					workingPackingH.setTotalVolume(product.getTotalVolume());
					workingPackingH.setGrossWeight(product.getTotalWeight());
				}
			}
		}

		return packingDataList;
	}

	/**
	 * ピース単位での梱包を行う(出庫指示No順 - 同じ商品の別箱への梱包可)
	 */
	private List<TPackingH> packingPieceCalcPriorityOrderPermitPart(List<PiecePackingProduct> pakicngProductList, MBox box) {

		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 荷材の容積、重量
		BigDecimal boxVolume = nullOrZeroToMax(box.getPermitVolume());
		BigDecimal boxWeight = nullOrZeroToMax(box.getPermitWeight());

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 現在作業中の箱
		TPackingH workingPackingH = createPiecePackingH(pickingH, box);
		packingDataList.add(workingPackingH);

		// 梱包商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 無限ループ防止
			int loopcount = 0;
			int loopCheckCount = 10;
			BigDecimal checkPackingNum = WCC.ZERO;

			while (WCC.isPositive(product.getPackingNum())) {

				// ===== 無限ループのチェック =====
				if (loopcount == 0) {
					checkPackingNum = product.getPackingNum();
					loopcount++;
				} else if (loopcount == loopCheckCount) {
					// 梱包数が減っていることのチェック
					if (WCC.isLessEqual(checkPackingNum, product.getPackingNum())) {
						// 梱包数が減っていないので無限ループしている

						getErrorManager().throwException(new IllegalStateException("packing product is no increment.(infinite loop)"));
					}
					// チェックしたのでリセット(定期的にチェックする)
					loopcount = 0;
				} else {
					loopcount++;
				}
				// ================================

				// 現在の箱に入る数を算出
				BigDecimal productSpaceNum = getProductSpaceNum(workingPackingH, product, boxVolume, boxWeight);

				if (WCC.isPositive(productSpaceNum)) {
					// 箱に入るスペースあり

					// 梱包
					addPackingB(workingPackingH, product, productSpaceNum);
				} else {
					// 箱に入るスペースなし

					// 基準荷材にそもそも入らない場合は1を返却
					if (WCC.isZero(workingPackingH.getTotalVolume()) &&
							WCC.isZero(workingPackingH.getGrossWeight()) &&
							(workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {
						// 何も入っていない(空の状態なのに1個も入らない)

						// 1個の梱包ボディを作成
						List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), WCC.ONE);
						workingPackingH.setTPackingBList(packingBList);

						// 残りの梱包数を反映
						product.setPackingNum(WCC.subtract(product.getPackingNum(), 1));
						workingPackingH.setTotalVolume(product.getPieceVolume());
						workingPackingH.setGrossWeight(product.getPieceWeight());

						if (WCC.isPositive(product.getPackingNum())) {
							// 新しい箱を作成
							workingPackingH = createPiecePackingH(pickingH, box);
							packingDataList.add(workingPackingH);
						}
					} else {
						// 新しい箱を作成
						workingPackingH = createPiecePackingH(pickingH, box);
						packingDataList.add(workingPackingH);
					}
				}
			}
		}

		return packingDataList;
	}

	/**
	 * ピース単位での梱包を行う(商品をなるべく詰める)
	 */
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe Start
	private List<TPackingH> packingPieceCalcPriorityBoxSpace(List<PiecePackingProduct> pakicngProductList, ProductPartPacking productPartPackingCls, MBox box) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.15 miyabe End
		// 商品を大きい順に並び替える
		Collections.sort(pakicngProductList, new PackingProductComparator());

		List<TPackingH> packingDataList = null;
		switch (productPartPackingCls) {
		case $0:
			// 同じ商品は1つの箱に梱包
			packingDataList = packingPieceCalcPriorityBoxSpaceUnpermitPart(pakicngProductList, box);
			break;
		case $1:
			// 同じ商品を別の箱に梱包しても良い
			packingDataList = packingPieceCalcPriorityBoxSpacePermitPart(pakicngProductList, box);
			break;
		}

		// 梱包ヘッダの大きい順に並び替える
		Collections.sort(packingDataList, new PackingHVolumeDescComparator());

		return packingDataList;
	}

	/**
	 * ピース単位での梱包を行う(商品をなるべく詰める - 同じ商品の別箱への梱包不可)
	 */
	private List<TPackingH> packingPieceCalcPriorityBoxSpaceUnpermitPart(List<PiecePackingProduct> pakicngProductList, MBox box) {

		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 荷材の容積、重量
		BigDecimal boxVolume = nullOrZeroToMax(box.getPermitVolume());
		BigDecimal boxWeight = nullOrZeroToMax(box.getPermitWeight());

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 最初の梱包ヘッダを作成(容積0、重量0の空箱)
		packingDataList.add(createPiecePackingH(pickingH, box));

		// 梱包商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 梱包ヘッダリストの1件目を取り出し(一番空き容積が大きい)
			TPackingH workingPackingH = packingDataList.get(0);

			// 現在の箱に入る数を算出
			BigDecimal productSpaceNum = getProductSpaceNum(workingPackingH, product, boxVolume, boxWeight);

			// 梱包数
			BigDecimal productNum = product.getPackingNum();
			if (WCC.isLessEqual(productNum, productSpaceNum)) {
				// 箱に全て入る

				// 梱包ボディを作成
				List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);

				if ((workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {
					workingPackingH.setTPackingBList(packingBList);
				} else {
					workingPackingH.getTPackingBList().addAll(packingBList);
				}
				workingPackingH.setTotalVolume(WCC.add(workingPackingH.getTotalVolume(), product.getTotalVolume()));
				workingPackingH.setGrossWeight(WCC.add(workingPackingH.getGrossWeight(), product.getTotalWeight()));
			} else {
				// 入らない

				// 基準荷材にそもそも入らない場合は無理やり梱包
				if (WCC.isZero(workingPackingH.getTotalVolume()) &&
						WCC.isZero(workingPackingH.getGrossWeight()) &&
						(workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {
					// 空の状態なのに入らない

					List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);
					workingPackingH.setTPackingBList(packingBList);
					workingPackingH.setTotalVolume(product.getTotalVolume());
					workingPackingH.setGrossWeight(product.getTotalWeight());

				} else {

					// ===== 重量順でもチェック =====
					// 梱包ヘッダを空き重量順に並び替え
					Collections.sort(packingDataList, new PackingHWeightComparator());
					// 空き重量の一番大きい箱を取得
					TPackingH workingPackingHWeight = packingDataList.get(0);
					// 入る数を算出
					BigDecimal productSpaceNumWeight = getProductSpaceNum(workingPackingHWeight, product, boxVolume, boxWeight);
					if (WCC.isLessEqual(productNum, productSpaceNumWeight)) {
						// 箱に全て入れる

						// 梱包ボディを作成
						List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);

						if ((workingPackingHWeight.getTPackingBList() == null || workingPackingHWeight.getTPackingBList().size() == 0)) {
							workingPackingHWeight.setTPackingBList(packingBList);
						} else {
							workingPackingHWeight.getTPackingBList().addAll(packingBList);
						}
						workingPackingHWeight.setTotalVolume(WCC.add(workingPackingHWeight.getTotalVolume(), product.getTotalVolume()));
						workingPackingHWeight.setGrossWeight(WCC.add(workingPackingHWeight.getGrossWeight(), product.getTotalWeight()));
					} else {
						// 重量順でも入らない

						// 新規荷材に梱包
						TPackingH newPackingH = createPiecePackingH(pickingH, box);
						List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), productNum);
						newPackingH.setTPackingBList(packingBList);
						newPackingH.setTotalVolume(product.getTotalVolume());
						newPackingH.setGrossWeight(product.getTotalWeight());

						packingDataList.add(newPackingH);
					}
				}
			}

			// 梱包ヘッダを空き容積順に並び替え
			Collections.sort(packingDataList, new PackingHVolumeComparator());
		}

		return packingDataList;
	}

	/**
	 * ピース単位での梱包を行う(商品をなるべく詰める - 同じ商品の別箱への梱包可)
	 */
	private List<TPackingH> packingPieceCalcPriorityBoxSpacePermitPart(List<PiecePackingProduct> pakicngProductList, MBox box) {

		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 荷材の容積、重量
		BigDecimal boxVolume = nullOrZeroToMax(box.getPermitVolume());
		BigDecimal boxWeight = nullOrZeroToMax(box.getPermitWeight());

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 最初の梱包ヘッダを作成(容積0、重量0の空箱)
		packingDataList.add(createPiecePackingH(pickingH, box));

		// 梱包商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 無限ループ防止
			int loopcount = 0;
			int loopCheckCount = 10;
			BigDecimal checkPackingNum = WCC.ZERO;

			while (WCC.isPositive(product.getPackingNum())) {

				// ===== 無限ループのチェック =====
				if (loopcount == 0) {
					checkPackingNum = product.getPackingNum();
					loopcount++;
				} else if (loopcount == loopCheckCount) {
					// 梱包数が減っていることのチェック
					if (WCC.isLessEqual(checkPackingNum, product.getPackingNum())) {
						// 梱包数が減っていないので無限ループしている

						getErrorManager().throwException(new IllegalStateException("packing product is no increment.(infinite loop)"));
					}
					// チェックしたのでリセット(定期的にチェックする)
					loopcount = 0;
				} else {
					loopcount++;
				}
				// ================================

				// 梱包ヘッダリストの1件目を取り出し(一番空き容積が大きい)
				TPackingH workingPackingH = packingDataList.get(0);

				// 現在の箱に入る数を算出
				BigDecimal productSpaceNum = getProductSpaceNum(workingPackingH, product, boxVolume, boxWeight);

				if (WCC.isPositive(productSpaceNum)) {
					// 箱に入るスペースあり

					// 梱包
					addPackingB(workingPackingH, product, productSpaceNum);
				} else {

					// 空箱でも入らない場合は無理やり1個を梱包
					if (WCC.isZero(workingPackingH.getTotalVolume()) &&
							WCC.isZero(workingPackingH.getGrossWeight()) &&
							(workingPackingH.getTPackingBList() == null || workingPackingH.getTPackingBList().size() == 0)) {

						// 1個の梱包ボディを作成
						List<TPackingB> packingBList = createPackingBList(product.getPickingBList(), WCC.ONE);
						workingPackingH.setTPackingBList(packingBList);

						// 残りの梱包数を反映
						product.setPackingNum(WCC.subtract(product.getPackingNum(), 1));
						workingPackingH.setTotalVolume(product.getPieceVolume());
						workingPackingH.setGrossWeight(product.getPieceWeight());

						if (WCC.isPositive(product.getPackingNum())) {
							// 新しい箱を作成(容積0、重量0の空箱)
							packingDataList.add(createPiecePackingH(pickingH, box));
						}
					} else {

						// 1番空き容積が大きい箱に入らない

						// ===== 重量順でもチェック =====
						// 梱包ヘッダを空き重量順に並び替え
						Collections.sort(packingDataList, new PackingHWeightComparator());
						// 空き重量の一番大きい箱を取得
						TPackingH workingPackingHWeight = packingDataList.get(0);
						// 入る数を算出
						BigDecimal productSpaceNumWeight = getProductSpaceNum(workingPackingHWeight, product, boxVolume, boxWeight);
						if (WCC.isPositive(productSpaceNumWeight)) {
							// 箱に入るスペースあり

							// 梱包
							addPackingB(workingPackingHWeight, product, productSpaceNumWeight);
						} else {
							// 重量順でも入らない

							// 新しい箱を作成(容積0、重量0の空箱)
							packingDataList.add(createPiecePackingH(pickingH, box));
						}
					}
				}

				// 梱包ヘッダを空き容積順に並び替え
				Collections.sort(packingDataList, new PackingHVolumeComparator());
			}
		}

		return packingDataList;
	}

	// [#2961] 複数荷姿対応 2017.11.10 kawana Start

	/**
	 * 小数有りの商品の梱包を行う
	 */
	private List<TPackingH> packingDecimal(List<TPickingB> decimalPickingBList, Map<Long, Long> shpaeGrpMap, DecimalProductPacking decimalProductPackingCls, MBox box) {

		// ===== 商品単位にまとめる =====
		List<PiecePackingProduct> pakicngProductList = createPackingProductList(decimalPickingBList);

		List<TPackingH> packingHList = null;
		switch (decimalProductPackingCls) {
		case $0:
			// 荷姿グループ単位で1梱包
			packingHList = packingDecimalUnitShapeGrp(pakicngProductList, shpaeGrpMap, box);
			break;
		case $1:
			// 商品単位で1梱包
			packingHList = packingDecimalUnitProduct(pakicngProductList, box);
			break;
		}

		return packingHList;
	}

	/**
	 * 小数有りの商品の梱包を行う(荷姿グループ単位で1梱包)
	 */
	private List<TPackingH> packingDecimalUnitShapeGrp(List<PiecePackingProduct> pakicngProductList, Map<Long, Long> shpaeGrpMap, MBox box) {

		// 梱包データ
		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 荷姿グループごとに梱包ヘッダを管理 (キー:荷姿グループID)
		Map<Long, TPackingH> packingHMap = new LinkedHashMap<Long, TPackingH>();

		// 商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 荷姿グループID
			long shapeGrpId = shpaeGrpMap.get(product.getProductId());

			if (packingHMap.containsKey(shapeGrpId)) {
				// 既に梱包ヘッダを作成済 ⇒ 梱包ボディを既存の梱包ヘッダに追加

				TPackingH packingH = packingHMap.get(shapeGrpId);
				List<TPackingB> packingBList = createPackingBListDecimal(packingH, product.getPickingBList());
				packingH.getTPackingBList().addAll(packingBList);
			} else {
				// 新規に梱包ヘッダを作成

				// 新規荷材に梱包
				TPackingH packingH = createPiecePackingH(pickingH, box);
				List<TPackingB> packingBList = createPackingBListDecimal(packingH, product.getPickingBList());
				packingH.setTPackingBList(packingBList);

				// 梱包データに追加
				packingDataList.add(packingH);

				// 梱包ヘッダを荷姿グループ毎に管理しているマップに登録
				packingHMap.put(shapeGrpId, packingH);
			}
		}

		return packingDataList;
	}

	/**
	 * 小数有りの商品の梱包を行う(商品単位で1梱包)
	 */
	private List<TPackingH> packingDecimalUnitProduct(List<PiecePackingProduct> pakicngProductList, MBox box) {

		// 梱包データ
		List<TPackingH> packingDataList = new ArrayList<TPackingH>();

		// 出庫ヘッダ
		TPickingH pickingH = pakicngProductList.get(0).getPickingBList().get(0).getTPickingH();

		// 商品の件数分繰返し
		for (PiecePackingProduct product : pakicngProductList) {

			// 新規荷材に梱包
			TPackingH packingH = createPiecePackingH(pickingH, box);
			List<TPackingB> packingBList = createPackingBListDecimal(packingH, product.getPickingBList());
			packingH.setTPackingBList(packingBList);

			// 梱包データに追加
			packingDataList.add(packingH);
		}

		return packingDataList;
	}

	// [#2961] 複数荷姿対応 2017.11.10 kawana End

	/**
	 * 梱包ボディを作成し、引数の梱包ヘッダに設定する
	 *
	 * @param packingH 梱包ヘッダ
	 * @param packingProduct 梱包商品
	 * @param productSpaceNum 梱包ヘッダの空きスペースに入る商品最大数
	 */
	private void addPackingB(TPackingH packingH, PiecePackingProduct packingProduct, BigDecimal productSpaceNum) {
		BigDecimal productNum = packingProduct.getPackingNum();

		BigDecimal packingNum;
		if (WCC.isLessThan(productNum, productSpaceNum)) {
			// 荷材の空きの方が大きい

			packingNum = productNum;
		} else {
			// 荷材の空きより梱包商品数が大きい

			packingNum = productSpaceNum;
		}

		// 現在の箱に入る分の梱包ボディを作成
		List<TPackingB> packingBList = createPackingBList(packingProduct.getPickingBList(), packingNum);
		if (packingH.getTPackingBList() == null || packingH.getTPackingBList().size() == 0) {

			packingH.setTPackingBList(packingBList);
		} else {

			packingH.getTPackingBList().addAll(packingBList);
		}

		// 残りの梱包数を反映
		packingProduct.setPackingNum(WCC.subtract(productNum, packingNum));
		packingH.setTotalVolume(WCC.add(packingH.getTotalVolume(), WCC.multiply(packingNum, packingProduct.getPieceVolume())));
		packingH.setGrossWeight(WCC.add(packingH.getGrossWeight(), WCC.multiply(packingNum, packingProduct.getPieceWeight())));
	}

	/**
	 * 梱包ヘッダの空きスペースに入る商品数を返す
	 *
	 * @param packingH 梱包ヘッダ
	 * @param product 梱包する商品
	 * @param boxVolume 荷材の許容容積
	 * @param boxWeight 荷材の許容重量
	 * @return 空きスペースに入る商品数
	 */
	private BigDecimal getProductSpaceNum(TPackingH packingH, PiecePackingProduct product, BigDecimal boxVolume, BigDecimal boxWeight) {
		BigDecimal spaceVolume = WCC.subtract(boxVolume, packingH.getTotalVolume());
		BigDecimal spaceWeight = WCC.subtract(boxWeight, packingH.getGrossWeight());

		if (WCC.isZeroOrLess(spaceVolume) || WCC.isZeroOrLess(spaceWeight)) {
			return WCC.ZERO;
		}

		BigDecimal pieceVolume = product.getPieceVolume();
		BigDecimal productNumVolume;
		if (WCC.isZero(pieceVolume)) {
			productNumVolume = WCC.toBigDecimal(Long.MAX_VALUE);
		} else {
			productNumVolume = WCC.divide(spaceVolume, pieceVolume);
		}

		BigDecimal pieceWeight = product.getPieceWeight();
		BigDecimal productNumWeight;
		if (WCC.isZero(pieceWeight)) {
			productNumWeight = WCC.toBigDecimal(Long.MAX_VALUE);
		} else {
			productNumWeight = WCC.divide(spaceWeight, pieceWeight);
		}

		BigDecimal spaceNum;
		if (WCC.isLessThan(productNumVolume, productNumWeight)) {
			spaceNum = productNumVolume;
		} else {
			spaceNum = productNumWeight;
		}

		return spaceNum;
	}

	/**
	 * ピース梱包の梱包ヘッダの作成
	 * 容積、重量は0で作成する
	 */
	private TPackingH createPiecePackingH(TPickingH pickingH, MBox box) {

		// 梱包ヘッダ
		TPackingH packingH = new TPackingH();
		packingH.setClientId(pickingH.getClientId());
		packingH.setCenterId(pickingH.getCenterId());
		packingH.setProcessTypeId(pickingH.getProcessTypeId());
		packingH.setAllocInstHId(pickingH.getAllocInstHId());
		packingH.setPickingHId(pickingH.getPickingHId());
		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana Start
		packingH.setShippingPackingNo(numberingLogic.getNumbering(pickingH.getCenterId(), WmsCoreNumberingConst.SHIPPING_PACKING_NO));
		// [ON推-品向-1171] センタ採番マスタにない場合は採番マスタから取得するように変更 2016.07.08 kawana End
		if (box != null) {
			packingH.setBoxId(box.getBoxId());
		}
		packingH.setPackingStatus_$25();
		packingH.setMixedFlg_$1();

		packingH.setTotalVolume(WCC.ZERO);
		packingH.setGrossWeight(WCC.ZERO);

		// 梱包帳票
		TPackingR packingR = new TPackingR();
		packingR.setStwOutFlg_$0();

		packingH.setTPackingRAsOne(packingR);

		return packingH;
	}

	/**
	 * ピース単位に梱包する商品クラス
	 */
	static class PiecePackingProduct {
		private long productId;
		private BigDecimal pieceVolume;
		private BigDecimal pieceWeight;
		private BigDecimal packingNum = WCC.ZERO;
		private List<TPickingB> pickingBodyList = new ArrayList<TPickingB>();

		public PiecePackingProduct(long productId, BigDecimal pieceVolume, BigDecimal pieceWeight) {
			this.productId = productId;
			this.pieceVolume = pieceVolume;
			this.pieceWeight = pieceWeight;
		}

		public PiecePackingProduct(long productId, BigDecimal pieceVolume, BigDecimal pieceWeight, BigDecimal packingNum, TPickingB pickingB) {
			this.productId = productId;
			this.pieceVolume = pieceVolume;
			this.pieceWeight = pieceWeight;
			this.packingNum = packingNum;
			pickingBodyList.add(pickingB);
		}

		public void addPackingNum(BigDecimal packingNum, TPickingB pickingB) {
			this.packingNum = WCC.add(this.packingNum, packingNum);
			pickingBodyList.add(pickingB);
		}

		public long getProductId() {
			return productId;
		}

		public BigDecimal getTotalVolume() {
			BigDecimal volume = CU.nullToZero(pieceVolume);
			return WCC.multiply(packingNum, volume);
		}

		public BigDecimal getTotalWeight() {
			BigDecimal weight = CU.nullToZero(pieceWeight);
			return WCC.multiply(packingNum, weight);
		}

		public BigDecimal getPieceVolume() {
			return CU.nullToZero(pieceVolume);
		}

		public BigDecimal getPieceWeight() {
			return CU.nullToZero(pieceWeight);
		}

		public BigDecimal getPackingNum() {
			return packingNum;
		}

		public void setPackingNum(BigDecimal packingNum) {
			this.packingNum = packingNum;
		}

		public List<TPickingB> getPickingBList() {
			return pickingBodyList;
		}
	}

	/**
	 * 梱包商品の比較クラス
	 *
	 * ・商品の容積順(大きい順)
	 * ・商品の重量 (大きい順)
	 */
	static class PackingProductComparator implements Comparator<PiecePackingProduct> {

		@Override
		public int compare(PiecePackingProduct product1, PiecePackingProduct product2) {

			BigDecimal product1volume = product1.getTotalVolume();
			BigDecimal product2volume = product2.getTotalVolume();

			if (product1volume != product2volume) {
				// 容積降順
				BigDecimal diff = WCC.subtract(product2volume, product1volume);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			BigDecimal product1weight = product1.getTotalWeight();
			BigDecimal product2weight = product2.getTotalWeight();

			if (product1weight != product2weight) {
				// 重量降順
				BigDecimal diff = WCC.subtract(product2weight, product1weight);
				if (WCC.isNegative(diff)) {
					return -1;
				} else if (WCC.isPositive(diff)) {
					return 1;
				}
			}

			return 0;
		}
	}

	/**
	 * 梱包ヘッダの比較クラス(容積優先)
	 *
	 * ・商品の容積順(小さい順)
	 * ・商品の重量 (小さい順)
	 */
	static class PackingHVolumeComparator implements Comparator<TPackingH> {

		@Override
		public int compare(TPackingH packingH1, TPackingH packingH2) {

			BigDecimal packingH1volume = packingH1.getTotalVolume();
			BigDecimal packingH2volume = packingH2.getTotalVolume();

			if (packingH1volume == null) {
				packingH1volume = WCC.MINUS_ONE;
			}
			if (packingH2volume == null) {
				packingH2volume = WCC.MINUS_ONE;
			}

			if (packingH1volume.compareTo(packingH2volume) != 0) {
				// 容積昇順
				return packingH1volume.compareTo(packingH2volume);
			}

			BigDecimal packingH1weight = packingH1.getGrossWeight();
			BigDecimal packingH2weight = packingH2.getGrossWeight();

			if (packingH1weight == null) {
				packingH1weight = WCC.MINUS_ONE;
			}
			if (packingH2weight == null) {
				packingH2weight = WCC.MINUS_ONE;
			}

			if (packingH1weight.compareTo(packingH2weight) != 0) {
				// 重量昇順
				return packingH1weight.compareTo(packingH2weight);
			}

			return 0;
		}
	}

	/**
	 * 梱包ヘッダの比較クラス(容積優先)
	 *
	 * ・商品の容積順(大きい順)
	 * ・商品の重量(大きい順)
	 * ・梱包ボディの数(小さい順)
	 */
	static class PackingHVolumeDescComparator implements Comparator<TPackingH> {

		@Override
		public int compare(TPackingH packingH1, TPackingH packingH2) {

			BigDecimal packingH1volume = packingH1.getTotalVolume();
			BigDecimal packingH2volume = packingH2.getTotalVolume();

			if (packingH1volume == null) {
				packingH1volume = WCC.MINUS_ONE;
			}
			if (packingH2volume == null) {
				packingH2volume = WCC.MINUS_ONE;
			}

			if (packingH1volume.compareTo(packingH2volume) != 0) {
				// 容積「降」順
				return packingH2volume.compareTo(packingH1volume);
			}

			BigDecimal packingH1weight = packingH1.getGrossWeight();
			BigDecimal packingH2weight = packingH2.getGrossWeight();

			if (packingH1weight == null) {
				packingH1weight = WCC.MINUS_ONE;
			}
			if (packingH2weight == null) {
				packingH2weight = WCC.MINUS_ONE;
			}

			if (packingH1weight.compareTo(packingH2weight) != 0) {
				// 重量「降」順
				return packingH2weight.compareTo(packingH1weight);
			}

			// 梱包ボディの少ない順
			List<TPackingB> packingH1bodyList = packingH1.getTPackingBList();
			List<TPackingB> packingH2bodyList = packingH2.getTPackingBList();
			int packingH1bodySize;
			int packingH2bodySize;
			if (packingH1bodyList == null) {
				packingH1bodySize = 0;
			} else {
				packingH1bodySize = packingH1bodyList.size();
			}

			if (packingH2bodyList == null) {
				packingH2bodySize = 0;
			} else {
				packingH2bodySize = packingH2bodyList.size();
			}

			return packingH1bodySize - packingH2bodySize;
		}
	}

	/**
	 * 梱包ヘッダの比較クラス(重量優先)
	 *
	 * ・商品の重量 (小さい順)
	 * ・商品の容積順(小さい順)
	 */
	static class PackingHWeightComparator implements Comparator<TPackingH> {

		@Override
		public int compare(TPackingH packingH1, TPackingH packingH2) {

			BigDecimal packingH1weight = packingH1.getGrossWeight();
			BigDecimal packingH2weight = packingH2.getGrossWeight();

			if (packingH1weight == null) {
				packingH1weight = WCC.MINUS_ONE;
			}
			if (packingH2weight == null) {
				packingH2weight = WCC.MINUS_ONE;
			}

			if (packingH1weight.compareTo(packingH2weight) != 0) {
				// 重量昇順
				return packingH1weight.compareTo(packingH2weight);
			}

			BigDecimal packingH1volume = packingH1.getTotalVolume();
			BigDecimal packingH2volume = packingH2.getTotalVolume();

			if (packingH1volume == null) {
				packingH1volume = WCC.MINUS_ONE;
			}
			if (packingH2volume == null) {
				packingH2volume = WCC.MINUS_ONE;
			}

			if (packingH1volume.compareTo(packingH2volume) != 0) {
				// 容積昇順
				return packingH1volume.compareTo(packingH2volume);
			}

			return 0;
		}
	}

	// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 2018.02.21 kawana Start

	/**
	 * <h2>梱包計算なしで梱包データ作成。</h2>
	 * <pre>
	 * パラメータのコントロールNoを検索条件に出庫ボディを検索し、
	 * 検索したデータの梱包を作成する。
	 * 梱包計算はせずに1梱包(1梱包ヘッダ)でデータを作成。
	 *
	 * 梱包ヘッダ、梱包ボディ、梱包帳票を登録する。
	 * このメソッドで「出荷梱包No」を採番する。
	 *
	 * 【検索テーブル】
	 * ・出庫ボディ
	 *
	 * 【登録テーブル】
	 * ・梱包ヘッダ
	 * ・梱包帳票
	 * ・梱包ボディ
	 *
	 * 【パラメータの使用項目】
	 *  (引当指示ヘッダ)
	 * ・コントロールNo
	 *
	 * </pre>
	 * @param shippingInstHead 引当指示ヘッダ
	 * @param box 梱包荷材
	 * @param errSts エラー発生時のエラーステータス
	 */
	public void noCalculate(TShippingInstH shippingInstHead, MBox box, ErrorStatus errSts) {

		// 出荷データ検索
		List<TPickingB> targetPickingBList = selectShippingData(shippingInstHead);
		if (targetPickingBList.isEmpty()) {
			return;
		}

		// 出庫ヘッダID毎にデータをまとめる
		Map<Long, List<TPickingB>> pickingDataMap = groupPickingDataByHeaderId(targetPickingBList);

		// 梱包データを作成
		Map<Long, List<TPackingH>> packingDataMap = new LinkedHashMap<Long, List<TPackingH>>();
		for (Map.Entry<Long, List<TPickingB>> pickingDataEntry : pickingDataMap.entrySet()) {

			List<TPickingB> pickingBList = pickingDataEntry.getValue();

			// 梱包データ作成 (梱包計算なし)
			List<TPackingH> packingHList = packingPieceNoCalc(pickingBList, box, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}

			packingDataMap.put(pickingDataEntry.getKey(), packingHList);
		}

		// DBに登録
		insertPackingData(packingDataMap.values());
	}

	// [ver3.0][#2220] 梱包計算なしの公開メソッド作成 2018.02.21 kawana End

	/**
	 * <h2>ピース単位での梱包を行う(梱包計算なし).</h2>
	 * <pre>
	 * 梱包計算なしで梱包データを作成する。
	 * 返却される梱包データは梱包帳票、梱包ボディが結合されている。
	 * (それぞれ、getTPackingRAsOne()、getTPackingBList() で取得可能)
	 *
	 * </pre>
	 * @param pickingBList 出庫ボディリスト
	 * @param box 梱包荷材
	 * @param errSts エラー時に設定するエラーステータス
	 * @return 梱包ヘッダリスト(梱包帳票、梱包ボディ結合済)
	 */
	public List<TPackingH> packingPieceNoCalc(List<TPickingB> pickingBList, MBox box, ErrorStatus errSts) {

		// 出庫ヘッダ
		TPickingH pickingH = pickingBList.get(0).getTPickingH();

		// 梱包ヘッダの作成
		TPackingH packingH = createPiecePackingH(pickingH, box);

		// 梱包ボディの作成
		List<TPackingB> packingBList = new ArrayList<TPackingB>();
		BigDecimal totalVolume = WCC.ZERO;
		BigDecimal totalWeight = WCC.ZERO;

		for (TPickingB pickingB : pickingBList) {

			// 出庫数
			BigDecimal pickingNum = pickingB.getPickingNum();
			if (WCC.isZeroOrLess(pickingNum)) {
				continue;
			}

			TPackingB packingB = new TPackingB();
			packingB.setPickingBId(pickingB.getPickingBId());
			packingB.setAllocInstBId(pickingB.getAllocInstBId());

			// 梱包ボディに出庫数を設定
			packingB.setPackingNum(pickingNum);

			packingB.setPickingFlg_$0();
			packingB.setInspectionFlg_$0();

			packingBList.add(packingB);

			// ===== 総容積、総重量に加算 =====

			// [#2961] 複数荷姿対応 2017.11.10 kawana Start
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			// 商品のピース荷姿
			MProductShape pieceProductShape = productShapeCalcLogic.getPieceProductShape(pickingB.chaseTStock().getProductId());
			// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			// [#2961] 複数荷姿対応 2017.11.10 kawana End
			if (pieceProductShape == null) {
				continue;
			}
			BigDecimal pieceVolume = CU.nullToZero(pieceProductShape.getVolume());
			BigDecimal pieceWeight = CU.nullToZero(pieceProductShape.getGrossWeight());

			totalVolume = WCC.add(totalVolume, WCC.multiply(pieceVolume, pickingNum));
			totalWeight = WCC.add(totalWeight, WCC.multiply(pieceWeight, pickingNum));
		}

		// 梱包ヘッダに総容積、総重量、梱包ボディリストを設定
		packingH.setTotalVolume(totalVolume);
		packingH.setGrossWeight(totalWeight);
		packingH.setTPackingBList(packingBList);

		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana Start
		// 最大数値チェック
		checkMaxNumber(packingH, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana End

		// 戻り値用 - 梱包ヘッダリスト
		List<TPackingH> packingHList = new ArrayList<TPackingH>();
		packingHList.add(packingH);

		return packingHList;
	}

	// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana Start

	/**
	 * <h2>梱包ヘッダの最大数値チェック.</h2>
	 * <pre>
	 * 梱包ヘッダの下記数値が最大値を超えている場合、エラーを登録する。
	 * ・総重量(g)
	 * ・総容積(mm3)
	 *
	 * </pre>
	 * @param packingH 梱包ヘッダ
	 * @param errSts エラーステータス
	 */
	public void checkMaxNumber(TPackingH packingH, ErrorStatus errSts) {

		if (MAX_NUMBER == null) {
			MAX_NUMBER = WCC.toBigDecimal(getPropertyValue(WmsCorePropertyConst.MAX_COUNT));
		}

		// 総重量
		if (WCC.isLessThan(MAX_NUMBER, CU.nullToZero(packingH.getGrossWeight()))) {

			getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_MAX_NUMBER_ERROR);
			return;
		}

		// 総容積
		if (WCC.isLessThan(MAX_NUMBER, CU.nullToZero(packingH.getTotalVolume()))) {

			getErrorManager().add(errSts, WmsCoreMessageConst.PACKING_CALCULATE_CANNOT_EXECUTE_MAX_NUMBER_ERROR);
			return;
		}
	}

	/**
	 * <h2>梱包ヘッダの最大数値チェック.</h2>
	 * <pre>
	 * 梱包ヘッダの下記数値が最大値を超えている場合、エラーを登録する。
	 * ・総重量(g)
	 * ・総容積(mm3)
	 *
	 * </pre>
	 * @param List<packingH> 梱包ヘッダリスト
	 * @param errSts エラーステータス
	 */
	public void checkMaxNumber(List<TPackingH> packingHList, ErrorStatus errSts) {

		for (TPackingH packingH : packingHList) {
			checkMaxNumber(packingH, errSts);
			if (0 < getErrorManager().size()) {
				return;
			}
		}
	}

	// [#3899] 最大数量、最大容積の商品を出庫指示すると致命的エラーが発生 2018.03.05 kawana End

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(setSeedNoメソッド削除) 2018.08.22 kawana Delete

	/**
	 * 引数の下記の梱包データをデータベースに登録する
	 * ・梱包ヘッダ
	 * ・梱包帳票
	 * ・梱包ボディのリスト
	 */
	private void insertPackingData(Collection<List<TPackingH>> packingHListCollection) {

		List<TPackingB> allPackingBList = new ArrayList<TPackingB>();
		List<TPackingR> allPackingRList = new ArrayList<TPackingR>();

		for (List<TPackingH> packingHList : packingHListCollection) {

			for (TPackingH packingH : packingHList) {

				packingHBhv.insert(packingH);
				long packingHId = packingH.getPackingHId();

				TPackingR packingR = packingH.getTPackingRAsOne();
				packingR.setPackingHId(packingHId);
				allPackingRList.add(packingR);

				List<TPackingB> packingBList = packingH.getTPackingBList();
				for (TPackingB packingB : packingBList) {
					packingB.setPackingHId(packingHId);
					allPackingBList.add(packingB);
				}
			}
		}

		packingRBhv.batchInsert(allPackingRList);
		packingBBhv.batchInsert(allPackingBList);
	}

	/**
	 * 引数がnullの場合は-1を返す
	 * @param value(Long)
	 * @return valueまたは-1
	 */
	private BigDecimal nullToMinus(BigDecimal value) {
		if (value == null) {
			return WCC.MINUS_ONE;
		} else {
			return value;
		}
	}

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(nullToMaxメソッド削除) 2018.08.22 kawana Delete

	/**
	 * 引数がnullか0の場合はmax値を返す
	 * @param value
	 * @return valueまたはLong側の最大値
	 */
	private BigDecimal nullOrZeroToMax(BigDecimal value) {

		BigDecimal longValue = CU.nullToZero(value);
		if (WCC.isZero(longValue)) {
			return WCC.toBigDecimal(Long.MAX_VALUE);
		} else {
			return longValue;
		}
	}

	// [#5131][v3.1] ピッキングリストの採番を発行時に変更(CasePickingNoKeyクラス削除) 2018.08.22 kawana Delete
}