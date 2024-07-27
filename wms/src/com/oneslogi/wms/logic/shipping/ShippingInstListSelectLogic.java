package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.PReportLayoutCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.PReportLayoutBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingInstListPmb;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.dbflute.exentity.TPickingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingInstList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ピッキング状況(荷揃番号別)・運送業者変更データ取得ロジッククラス
 */
public class ShippingInstListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	@Inject
	private PReportLayoutBhv pReportLayoutBhv;



	/**
	 * <h2>出庫指示データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し出庫指示一覧のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダ：日付(From)・日付(To)・荷揃番号(From)・荷揃番号(To)・代表荷揃番号(From)・代表荷揃番号(To)・出荷処理区分
	 *                                ・出荷区分・出荷ステータス・発注伝票番号・送り先・運送便CD・運送業者CD・配達指定日無・ピッキング済非表示
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlShippingInstList> ピッキング状況(荷揃番号別)・運送業者変更リスト
	 */
	public PagingResultBean<SqlShippingInstList> select(TShippingInstH header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlShippingInstList> result = null;

		// ===== ピッキング状況(荷揃番号別)・運送業者変更データ取得 =====

		// 外出しSQLの定義
		String path = TShippingInstHBhv.PATH_selectSqlShippingInstList;

		// 検索条件の設定
		SqlShippingInstListPmb pmb = setCondition(header);

		if (pmb == null) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlShippingInstList> entityType = SqlShippingInstList.class;
		result = selectPage(tShippingInstHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====

		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * 検索条件の設定
	 * @param header 出荷指示ヘッダ：日付(From)・日付(To)・荷揃番号(From)・荷揃番号(To)・代表荷揃番号(From)・代表荷揃番号(To)・出荷処理区分
	 *                                ・出荷区分・出荷ステータス・発注伝票番号・送り先・運送便CD・運送業者CD・配達指定日無・ピッキング済非表示
	 * @return SqlShippingInstListPmb 出荷指示ヘッダのリスト
	 */
	private SqlShippingInstListPmb setCondition(TShippingInstH header) {
		SqlShippingInstListPmb pmb = new SqlShippingInstListPmb();

		// 検索条件の設定
//		pmb.setCultureId(getCultureId());
//		pmb.setCenterCd(header.getMCenter().getCenterCd());// センタCD
//		pmb.setTakingShippingFlg(header.getTakingShippingFlg());// 検索基準日
//		pmb.setDtFrom(header.getDtFrom());// 日付(From)
//		pmb.setDtTo(header.getDtTo());// 日付(To)
//		pmb.setNizoroeNo2From(header.getNizoroeNo2From());// 荷揃番号(From)
//		pmb.setNizoroeNo2To(header.getNizoroeNo2To());// 荷揃番号(To)
//		pmb.setDaihyoNizoroeNo2From(header.getDaihyoNizoroeNo2From());// 代表荷揃番号(From)
//		pmb.setDaihyoNizoroeNo2To(header.getDaihyoNizoroeNo2To());// 代表荷揃番号(To)
//		pmb.setProcessType(header.getProcessType());// 出荷処理区分
//		pmb.setShippingTypeCd(header.getShippingTypeCd());// 出荷区分
//		pmb.setPickingStatus(header.getPickingStatus());// 出荷ステータス
//		pmb.setClientShippingNo_PrefixSearch(header.getClientShippingNo());// 発注伝票番号
//		pmb.setDeliveryCourseCd_PrefixSearch(header.getDeliveryCourseCd());// 運送便CD
//		pmb.setCarrierCd_PrefixSearch(header.getCarrierCd());// 運送業者CD
//		pmb.setDeliveryDtFlg(header.getDeliveryDtFlg());// 配達指定日無
//		pmb.setDelivCustomerCd_PrefixSearch(header.getDelivCustomerCd());// 送り先
//		pmb.setPickedHidden(header.getPickedHidden());// ピッキング済非表示
		return pmb;
	}



	/**
	 * <h2>出荷ステータスのチェック</h2>
	 *
	 * @param shippingInstHId 出荷指示ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public TShippingInstH checkPickingCancel(Long shippingInstHId, ErrorStatus errSts) {

		TShippingInstH tsih = tShippingInstHBhv.selectByPKValue(shippingInstHId);

		// 出荷ステータスが「ピッキング中」「ピッキング済」以外の場合
		if (tsih != null && !tsih.getShippingStatus().equals(CDef.ShippingStatus.$30.code()) && !tsih.getShippingStatus().equals(CDef.ShippingStatus.$35.code())) {
			// ピッキング中またはピッキング済以外の出荷指示に対して、ピッキング解除処理を実行できません
			this.getErrorManager().add(errSts, WmsMessageConst.CANNOT_CANCEL_EXCEPT_PICKING_IN_PROGRESS_OR_PICKED_SHIPPING_INST_ERROR);
			return null;
		}

		return tsih;
	}

	/**
	 * <h2>複数伝票の存在チェックを行う。</h2>
	 * <pre>
	 * 引数のリスト件数が０件の場合、異常エラーをスローする。
	 * 出荷指示ヘッダのデータを検索して、複数伝票の存在チェックを行う。
	 * 複数件データが存在する場合、tureを返す。
	 * それ以外の場合、falseを返す。
	 * </pre>
	 * @param sShipInstHeaderList 出荷指示ヘッダリスト：出庫作業No.・荷主ID・センタID
	 * @param sShipInstBodyList 出荷指示ボディリスト
	 * @param pickHeaderList 出庫ヘッダリスト
	 * @param pickBodyList 出庫ボディリスト
	 * @return boolean true：複数件/false：複数件ではない
	 */
	public boolean workOrderCancelCheck(List<TShippingInstH> sShipInstHeaderList,
			List<TShippingInstB> sShipInstBodyList,
			List<TPickingH> pickHeaderList,
			List<TPickingB> pickBodyList) {

		boolean blnFlg = false;

		// ===== sShipInstHeaderListの件数＝0の場合 =====
		if (sShipInstHeaderList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return false;
		}

		// ===== 出庫指示解除起動時処理 =====
		// ===== sShipInstHeaderListのデータ件数分繰返 =====
		ListResultBean<TShippingInstH> result = null;
		for (TShippingInstH tShippingInstH : sShipInstHeaderList) {
			// 検索条件の設定
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();

			//コントロールNo.の設定
			cb.query().setClientId_Equal(tShippingInstH.getClientId());
			cb.query().setCenterId_Equal(tShippingInstH.getCenterId());
			cb.query().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(tShippingInstH.getPickingWorkNo());
			result = tShippingInstHBhv.selectList(cb);

			if (result.size() > 1) {
				// 確認表示
				blnFlg = true;
			}
		}
		return blnFlg;
	}
	
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
}
