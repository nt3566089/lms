/**
 * 出荷関連ロジックパッケージ
 */
package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.PReportLayoutCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.PReportLayoutBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPackingListUpdatePmb;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlPackingListUpdate;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;
/**
 * 梱包明細修正データ取得ジッククラス
 */
public class PackingUpdateSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	//[Ver3.0] unit of measure対応 2017.11.22 ライ DEL
	//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
	@Inject
	private MProductBhv mProductBhv;
	//[Ver3.0] unit of measure対応 2017.11.22 ライ END
	
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [S]
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private PReportLayoutBhv pReportLayoutBhv;
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [E]
	
	@Inject
	private MBoxBhv mBoxhv;
	
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [S]
	/**
	 * <h2>出庫データ荷揃番号を取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しデータベースから梱包データを取得する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：センタID・荷主ID・荷揃番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TPackingH 梱包ヘッダー
	 */
	public ListResultBean<TPackingH> selectNizoroe(TPackingH tPackingH, ErrorStatus errSts) {
		
		TPackingHCB cb = tPackingHBhv.newConditionBean();
		cb.setupSelect_TPickingH();
		cb.specify().specifyTPickingH().columnNizoroeNo2();
		cb.specify().specifyTPickingH().columnTagPrintTypeCd();
		cb.specify().specifyTPickingH().columnPickingHId();
		cb.query().setNizoroeNo2_Equal(tPackingH.getNizoroeNo2());
		cb.query().setCenterId_Equal(tPackingH.getCenterId());
		cb.query().queryTPickingH().setPickingStatus_InScope(Arrays.asList(CDef.PickingStatus.$35.code(),CDef.PickingStatus.$50.code()));
		ListResultBean<TPackingH> list = tPackingHBhv.selectList(cb);
		
		// ===== ０件チェック =====

		if (list.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return list;
	}
	
	/**
	 * <h2>追加更新チェック対象を取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しデータベースから梱包データを取得する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：センタID・荷主ID・荷揃番号
	 * @param errSts エラー時に設定するエラーステータス
	 * @return TPackingH 梱包ヘッダー
	 */
	public ListResultBean<TPackingH> selectAddUpdate(TPackingH tPackingH, ErrorStatus errSts) {
		
		TPackingHCB cb = tPackingHBhv.newConditionBean();
		cb.setupSelect_TPickingH();
		cb.specify().specifyTPickingH().columnPickingStatus();
		cb.query().setNizoroeNo2_Equal(tPackingH.getNizoroeNo2());
		cb.query().setCenterId_Equal(tPackingH.getCenterId());
		ListResultBean<TPackingH> list = tPackingHBhv.selectList(cb);
		
		// ===== ０件チェック =====

		if (list.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return list;
	}
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [E]
	
	/**
	 * <h2>引当指示と出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しデータベースから梱包データを取得する。
	 * </pre>
	 * @param tPackingH 出庫ヘッダ：センタID・荷主ID・荷揃番号
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlPackingListUpdate> 梱包明細リスト
	 */
	public PagingResultBean<SqlPackingListUpdate> select(TPackingH tPackingH, PagingData paging, ErrorStatus errSts) {
		PagingResultBean<SqlPackingListUpdate> result = null;

		// 外出しSQLの定義
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		String path = MProductBhv.PATH_selectSqlPackingListUpdate;
		//[Ver3.0] unit of measure対応 2017.11.22 ライ END
		// 検索条件の設定
		SqlPackingListUpdatePmb pmb = setCondition(tPackingH);

		// 検索実行
		Class<SqlPackingListUpdate> entityType = SqlPackingListUpdate.class;
		result = selectPage(mProductBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			return result;
		}
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		List<MProduct> mProductList = new ArrayList<MProduct>();
		for (SqlPackingListUpdate sqlReuslt : result) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			if (sqlReuslt.prepareDomain() != null) {
				mProductList.add(sqlReuslt.prepareDomain());
			}
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
		}

		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		mProductBhv.loadMProductShapeList(mProductList, new ConditionBeanSetupper<MProductShapeCB>() {
			public void setup(MProductShapeCB cb) {
				cb.setupSelect_MShapeGrpDtl().withMShapeGrp();
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
				cb.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
				cb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
				cb.query().setDelFlg_Equal_$0();
			}
		});

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();
		//[Ver3.0] unit of measure対応 2017.11.22 ライ END
		// 荷材No.設定
		Long tPackingHId = null;
		int boxNo = 0;
		for (SqlPackingListUpdate body : result){

			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, body.prepareDomain());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			if (body.getPackingHId().equals(tPackingHId) == false) {
				boxNo++;
				body.setBoxNo(String.valueOf(boxNo));
			} else {
				body.setBoxNo(String.valueOf(boxNo));
			}
            body.setUpdateRow("0");
			tPackingHId = body.getPackingHId();

			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 入数内訳
			body.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, body.prepareDomain()));
			// [Ver3.0] unit of measure対応 2017.11.22 ライ Start
			//商品单位
			//body.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, body.prepareDomain()));
			body.setProductUnit(body.getUnitNm());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.22 ライ Start
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
		}

		return result;
	}

	/**
	 * <h2>検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param header 出庫ヘッダ
	 * @return SqlPackingListUpdatePmb 梱包明細リスト
	 */
	private SqlPackingListUpdatePmb setCondition(TPackingH header) {
		// 検索条件の設定
		SqlPackingListUpdatePmb pmb = new SqlPackingListUpdatePmb();
		pmb.setCenterCd(String.valueOf(header.getCenterId()));
		// ミドリ安全様向けカスタマイズ対応  検索条件追加 2024.7.15 張 Add [S]
		pmb.setNizoroeNo2(header.getNizoroeNo2());
		// ミドリ安全様向けカスタマイズ対応  検索条件追加 2024.7.15 張 Add [E]
		// ミドリ安全様向けカスタマイズ対応  検索条件削除 2024.7.15 張 Del [S]
		//pmb.setClientCd(String.valueOf(header.getClientId()));
		//pmb.setPickingWorkNo(header.getPickingWorkNo());
		// ミドリ安全様向けカスタマイズ対応  検索条件削除 2024.7.15 張 Del [E]
		return pmb;
	}
	
	/**
	 * <h2>荷材数の集計</h2>
	 * <pre>
	 * 荷材CDを条件に荷材マスタから合致する対象の集計
	 * </pre>
	 * @param boxCd 荷材CD
	 * @return int 荷材数の集計
	 */
	public int countBoxCd(String boxCd, Long centerId) {
		MBoxCB cb = mBoxhv.newConditionBean();
		cb.query().setBoxCd_Equal(boxCd);
		cb.query().setCenterId_Equal(centerId);
		int count = mBoxhv.selectCount(cb);
		return count;
	}
	
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [S]
	/**
	 * 帳票のReportLayoutIdを取得
	 * @param reportId 帳票のId
	 * @return　ReportLayoutId 帳票のReportLayoutId
	 */
	public Long selectReportLayoutId(Long reportId) {
		PReportLayoutCB cb=pReportLayoutBhv.newConditionBean();
		PReportLayout pReportLayout=new PReportLayout();
		cb.query().setReportId_Equal(reportId);
		pReportLayout=pReportLayoutBhv.selectEntity(cb);

		return pReportLayout.getReportLayoutId();
	}
	// ミドリ安全様向けカスタマイズ対応  追加 2024.7.15 張 Add [E]

}

