package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TInventoryBCB;
import com.oneslogi.base.dbflute.cbean.TInventoryRCB;
import com.oneslogi.base.dbflute.cbean.TInventoryReceiveLabelCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryReceiveLabelBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryListPrintReportData01Pmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryListPrintReportData02Pmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryListPrintReportData03Pmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryListPrintReportData04Pmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MSalesOrg;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.dbflute.exentity.TInventoryReceiveLabel;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData01;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData02;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData03;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryListPrintReportData04;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 棚卸作業リスト発行ロジッククラス
 */
public class InventoryListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	@Inject
	private TInventoryBBhv tInventoryBBhv;
	@Inject
	private TInventoryReceiveLabelBhv tInventoryReceiveLabelBhv;
//	@Inject
//	private MPlantStorageSpaceBhv mPlantStorageSpaceBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
//	@Inject
//	private MCustomerBhv mCustomerBhv;
	
	//品種区分値ＣＤ
	private final static String PRODUCT_CATEGORY_TYPE = "PRODUCT_CATEGORY_TYPE";
	//棚卸差異区分値ＣＤ
	private final static String INVENTORY_DIFF_CLS = "INVENTORY_DIFF_CLS";
	
	/**
	 * <h2>棚卸在庫差異データを取得する。</h2>
	 * <pre>
	 * 棚卸在庫差異データ情報を取得する。
	 *
	 * </pre>
	 * @param head 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<TInventoryB> getReportData01(TInventoryH head , TInventoryB body ,  ErrorStatus errSts) {
		
		// ===== 棚卸在庫差異データ取得 =====
//		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
//		cb.setupSelect_TInventoryH().withMCenter();
//		cb.setupSelect_TInventoryH().withMClient();
//		cb.setupSelect_TInventoryRAsOne();
//		cb.setupSelect_MCustomerByDepositId();
//		cb.setupSelect_MLocation();
//		cb.setupSelect_MProduct();
//		cb.setupSelect_MSalesOrg();
//		cb.setupSelect_TStock();
//		cb.setupSelect_MWarehouse();
//		cb.setupSelect_BUserByInventoryUserId();
//		cb.specify().derivedTInventoryReceiveLabelList().count(sub -> {
//			sub.specify().columnReceiveLabelNo();
//			sub.query().setScanFlg_Equal("1");
//			setDelFlg(sub);
//		},TInventoryB.ALIAS_scanCount);
////		
////		// ====== 検索条件 ======
////		
////		//センタCD
//		cb.query().queryTInventoryH().queryMCenter().setCenterCd_Equal(head.getMCenter().getCenterCd());
//		//取引先CD
//		cb.query().queryMCustomerByDepositId().setCustomerCd_Equal(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
//		//棚卸日
//		cb.query().queryTInventoryH().setInventoryDt_Equal(head.getInventoryInstDt());
//		//ロケーションCDfrom
//		cb.query().queryMLocation().setLocationCd_GreaterEqual(body.getFromLocationCd());
//		//ロケーションCDto
//		cb.query().queryMLocation().setLocationCd_LessEqual(body.getToLocationCd());
//		//エリア
//		cb.query().setAreaCd_Equal(body.getAreaCd());
//		//棚卸担当者ID
//		cb.query().queryBUserByInventoryUserId().setUserCd_PrefixSearch(head.getInventoryUserCd());
//		//検索.棚卸リスト発行区分が「 01:未出力のロケのみ出力」の場合、以下を設定
//		if(CDef.InventoryListOutCls.$01.code().equals(head.getInventoryListPrintType())) {
//			//棚卸在庫差異表出力フラグ
//			cb.query().queryTInventoryRAsOne().setInventoryDiffOutFlg_Equal("0");
//		}
//		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
//		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
//			cb.columnQuery(subCb -> {
//				//引当可能数
//				subCb.specify().columnChargeNum();
//			}).notEqual(subCb -> {
//				//棚卸数
//				subCb.specify().columnInventoryNum();
//			});
//		}
////		// ====== 出力順 ======
////
//		cb.query().queryTInventoryH().queryMClient().addOrderBy_ClientCd_Asc();
//		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
//
////		//janCdソート
//		//cb.query().queryMProduct().addOrderBy_JanCd_Asc();
//
//		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
////
////
//		cb.query().addOrderBy_LimitDt_Asc();
//		cb.query().queryMLocation().addOrderBy_PickingOrder_Asc();
//		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
//
//		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
//		cb.query().queryMCustomerByDepositId().addOrderBy_CustomerCd_Asc();
//
////		// ====== 検索実行 ======
//		List<TInventoryB> result = selectList(tInventoryBBhv, cb);
//		tInventoryBBhv.loadTInventoryReceiveLabelList(result, sub -> {
//			sub.specify().columnReceiveLabelNo();
//			sub.query().setScanFlg_Equal("0");
//			sub.query().setDelFlg_Equal_$0();
//		});
		//未スキャン入荷ラベル取得
		TInventoryReceiveLabelCB cb = tInventoryReceiveLabelBhv.newConditionBean();
		cb.specify().columnInventoryBId();
		cb.specify().columnReceiveLabelNo();
		cb.query().setScanFlg_Equal("0");
		List<TInventoryReceiveLabel> labelList = selectList(tInventoryReceiveLabelBhv, cb);
		
		//検索.棚卸リスト発行区分が「 01:未出力のロケのみ出力」の場合、以下を設定
		//検索.棚卸リスト発行区分が「 01:未出力のロケのみ出力」の場合、以下を設定
		boolean isPrintType = false;
		if(CDef.InventoryListOutCls.$01.code().equals(head.getInventoryListPrintType())) {
			isPrintType = true;
		}
		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
		boolean isInventoryDiff = false;
		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
			isInventoryDiff = true;
		}
		SqlInventoryListPrintReportData01Pmb report1pmb = new SqlInventoryListPrintReportData01Pmb();
		report1pmb.setCenterCd(head.getMCenter().getCenterCd());
		report1pmb.setInventoryDt(head.getInventoryInstDt());
		report1pmb.setIsInventoryDiff(isInventoryDiff);
		report1pmb.setIsPrintType(isPrintType);
		report1pmb.setAreaCd(body.getAreaCd());
		report1pmb.setDepCustomerCd(body.getMCustomerByDepositId()== null ? null : body.getMCustomerByDepositId().getCustomerCd());
		report1pmb.setInventoryUserCd_PrefixSearch(head.getInventoryUserCd());
		report1pmb.setLocationFrom(body.getFromLocationCd());
		report1pmb.setLocationTo(body.getToLocationCd());
		ListResultBean<SqlInventoryListPrintReportData01> resulList = tInventoryBBhv.outsideSql().selectList(tInventoryBBhv.PATH_selectSqlInventoryListPrintReportData01 , report1pmb, SqlInventoryListPrintReportData01.class);
		List<TInventoryB> bodyList = new ArrayList<TInventoryB>();
		resulList.forEach(bd -> {
			TInventoryB entity = new TInventoryB();
			TInventoryH tInventoryH = new TInventoryH();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(bd.getCenterCd());
			mCenter.setCenterAbbr(bd.getCenterAbbr());
			MLocation location = new MLocation();
			location.setLocationCd(bd.getLocationCd());
			MProduct product = new MProduct();
			product.setJanCd(bd.getJanCd());
			product.setProductNm(bd.getProductNm());
			MSalesOrg salesOrg = new MSalesOrg();
			salesOrg.setSalesOrgCd(bd.getSalesOrgCd());
			salesOrg.setTenhanshaNm1(bd.getTenhanshaNm1());
			salesOrg.setTenhanshaNm2(bd.getTenhanshaNm2());
			MCustomer account = new MCustomer();
			account.setCustomerCd(bd.getCustomerCd());
			account.setCustomerNm(bd.getCustomerNm());
			MCustomer deposit = new MCustomer();
			deposit.setCustomerCd(bd.getDepositCd());
			BUser user = new BUser();
			user.setUserNm(bd.getUserNm());
			tInventoryH.setMCenter(mCenter);
			
			List<TInventoryReceiveLabel> labels = new ArrayList<TInventoryReceiveLabel>();
			entity.setInventoryBId(bd.getInventoryBId());
			entity.setLot(bd.getLot());
			entity.setLimitDt(bd.getLimitDt());
			entity.setChargeNum(bd.getChargeNum());
			entity.setInventoryNum(bd.getInventoryNum());
			entity.setProdDt(bd.getProdDt());
			entity.setAreaCd(bd.getAreaCd());
			entity.setTInventoryH(tInventoryH);
			entity.setMLocation(location);
			entity.setMProduct(product);
			entity.setMCustomerByAccountId(account);
			entity.setMCustomerByDepositId(deposit);
			entity.setMSalesOrg(salesOrg);
			entity.setBUserByInventoryUserId(user);
			entity.setScanCount(new BigDecimal(bd.getScancount()));
			entity.setdJanCd(bd.getDjanCd());
			
			labelList.forEach(label -> {
				if(bd.getInventoryBId().equals(label.getInventoryBId())) {
					TInventoryReceiveLabel tLabel = new TInventoryReceiveLabel();
					tLabel.setReceiveLabelNo(label.getReceiveLabelNo());
					labels.add(tLabel);
				}
			});
			entity.setTInventoryReceiveLabelList(labels);
			bodyList.add(entity);
		});
		// ===== 件数チェック =====
		if (resulList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return bodyList;
	}
	
	/**
	 * <h2>在庫差異確認データを取得する。</h2>
	 * <pre>
	 * 在庫差異確認データを取得する。
	 *
	 * </pre>
	 * @param head 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<TInventoryB> getReportData02(TInventoryH head , TInventoryB body ,  ErrorStatus errSts) {
		
		// ===== 棚卸在庫差異データ取得 =====
		//検索.棚卸リスト発行区分が「 01:未出力のロケのみ出力」の場合、以下を設定
		boolean isPrintType = false;
		if(CDef.InventoryListOutCls.$01.code().equals(head.getInventoryListPrintType())) {
			isPrintType = true;
		}
		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
		boolean isInventoryDiff = false;
		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
			isInventoryDiff = true;
		}
		SqlInventoryListPrintReportData02Pmb report2pmb = new SqlInventoryListPrintReportData02Pmb();
		report2pmb.setCenterCd(head.getMCenter().getCenterCd());
		report2pmb.setInventoryDt(head.getInventoryInstDt());
		report2pmb.setIsInventoryDiff(isInventoryDiff);
		report2pmb.setIsPrintType(isPrintType);
		report2pmb.setAreaCd(body.getAreaCd());
		report2pmb.setDepCustomerCd(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
		report2pmb.setInventoryUserCd_PrefixSearch(head.getInventoryUserCd());
		report2pmb.setLocationFrom(body.getFromLocationCd());
		report2pmb.setLocationTo(body.getToLocationCd());
		ListResultBean<SqlInventoryListPrintReportData02> resulList = tInventoryBBhv.outsideSql().selectList(tInventoryBBhv.PATH_selectSqlInventoryListPrintReportData02 , report2pmb, SqlInventoryListPrintReportData02.class);
		List<TInventoryB> bodyList = new ArrayList<TInventoryB>();
		resulList.forEach(bd -> {
			TInventoryB entity = new TInventoryB();
			TInventoryH tInventoryH = new TInventoryH();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(bd.getCenterCd());
			mCenter.setCenterAbbr(bd.getCenterAbbr());
			MLocation location = new MLocation();
			location.setLocationCd(bd.getLocationCd());
			MProduct product = new MProduct();
			product.setJanCd(bd.getJanCd());
			product.setProductNm(bd.getProductNm());
			MSalesOrg salesOrg = new MSalesOrg();
			salesOrg.setSalesOrgCd(bd.getSalesOrgCd());
			salesOrg.setTenhanshaNm1(bd.getTenhanshaNm1());
			salesOrg.setTenhanshaNm2(bd.getTenhanshaNm2());
			MCustomer customer = new MCustomer();
			customer.setCustomerCd(bd.getCustomerCd());
			customer.setCustomerNm(bd.getCustomerNm());
			MCustomer deposit = new MCustomer();
			deposit.setCustomerCd(bd.getDepositCd());
			BUser user = new BUser();
			user.setUserNm(bd.getUserNm());
			tInventoryH.setMCenter(mCenter);
			entity.setInventoryBId(bd.getInventoryBId());
			entity.setLot(bd.getLot());
			entity.setLimitDt(bd.getLimitDt());
			entity.setChargeNum(bd.getChargeNum());
			entity.setInventoryNum(bd.getInventoryNum());
			entity.setProdDt(bd.getProdDt());
			entity.setAreaCd(bd.getAreaCd());
			entity.setTInventoryH(tInventoryH);
			entity.setMLocation(location);
			entity.setMProduct(product);
			entity.setMCustomerByAccountId(customer);
			entity.setMCustomerByDepositId(deposit);
			entity.setMSalesOrg(salesOrg);
			entity.setBUserByInventoryUserId(user);
			entity.setScanCount(new BigDecimal(bd.getScancount()));
			entity.setdJanCd(bd.getDjanCd());
			entity.setUpdateUserCd(bd.getUserCdUpd());
			entity.setUpdateUserNm(bd.getUserNmUpd());
			
			//修正前数量取得
			 TInventoryBCB cb = tInventoryBBhv.newConditionBean();
			cb.specify().columnInventoryBId();
			cb.specify().columnInventoryNum();
			cb.query().setInventoryUserId_IsNotNull();
			cb.query().setInventoryBId_Equal(bd.getInventoryBId());
			TInventoryB modNumEntity = tInventoryBBhv.selectEntity(cb);
			entity.setInventoryModNum(modNumEntity == null ? new BigDecimal(0) : modNumEntity.getInventoryNum());
			bodyList.add(entity);
		});
		// ===== 件数チェック =====
		if (resulList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return bodyList;
	}
	
	/**
	 * <h2>商品別棚卸実績兼差異データを取得する。</h2>
	 * <pre>
	 * 商品別棚卸実績兼差異データを取得する。
	 *
	 * </pre>
	 * @param head 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<TInventoryB> getReportData03(TInventoryH head , TInventoryB body ,  ErrorStatus errSts) {
		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
		boolean isInventoryDiff = false;
		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
			isInventoryDiff = true;
		}
		SqlInventoryListPrintReportData03Pmb report3pmb = new SqlInventoryListPrintReportData03Pmb();
		report3pmb.setCenterCd(head.getMCenter().getCenterCd());
		report3pmb.setDepCustomerCd(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
		report3pmb.setInventoryDt(head.getInventoryInstDt());
		report3pmb.setIsInventoryDiff(isInventoryDiff);
		ListResultBean<SqlInventoryListPrintReportData03> resulList = tInventoryBBhv.outsideSql().selectList(tInventoryBBhv.PATH_selectSqlInventoryListPrintReportData03 , report3pmb, SqlInventoryListPrintReportData03.class);
		List<TInventoryB> result = new ArrayList<TInventoryB>();
		resulList.forEach(bd -> {
			TInventoryB entity = new TInventoryB();
			TInventoryH tInventoryH = new TInventoryH();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(bd.getCenterCd());
			mCenter.setCenterAbbr(bd.getCenterAbbr());
			MProduct product = new MProduct();
			product.setProductCategoryCls(bd.getProductCategoryCls());
			product.setProductCd(bd.getProductCd());
			product.setEvaluationUnitPrice(bd.getEvaluationUnitPrice());
			product.setJanCd(bd.getJanCd());
			product.setProductNm(bd.getProductNm());
//			MSalesOrg salesOrg = new MSalesOrg();
//			salesOrg.setSalesOrgCd(bd.getSalesOrgCd());
//			salesOrg.setTenhanshaNm1(bd.getTenhanshaNm1());
//			salesOrg.setTenhanshaNm2(bd.getTenhanshaNm2());
//			MCustomer customer = new MCustomer();
//			customer.setCustomerCd(bd.getAccountCd());
//			customer.setCustomerNm(bd.getAccountNm());
			tInventoryH.setMCenter(mCenter);
			tInventoryH.setInventoryDt(bd.getInventoryDt());
			tInventoryH.setPlantCd(bd.getPlantCd());
			entity.setPlantNm(bd.getPlantnm());
			entity.setChargeNum(bd.getChargeNum());
			entity.setInventoryNum(bd.getInventoryNum());
			entity.setTInventoryH(tInventoryH);
			entity.setMProduct(product);
			entity.setSalesUserNm(bd.getSalesname());
		//	entity.setMCustomerByAccountId(customer);
		//	entity.setMSalesOrg(salesOrg);
			result.add(entity);
		});
		// ===== 棚卸在庫差異データ取得 =====
//		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
//		cb.setupSelect_TInventoryH().withMCenter();
//		cb.specify().specifyTInventoryH().specifyMCenter().columnCenterCd();
//		cb.specify().specifyTInventoryH().specifyMCenter().columnCenterAbbr();
//		cb.specify().specifyTInventoryH().columnPlantCd();
//		cb.specify().specifyTInventoryH().columnStorageSpaceCd();
//		cb.specify().specifyTInventoryH().columnInventoryDt();
//		cb.setupSelect_MSalesOrg();
//		cb.specify().specifyMSalesOrg().columnSalesOrgCd();
//		cb.specify().specifyMSalesOrg().columnTenhanshaNm1();
//		cb.specify().specifyMSalesOrg().columnTenhanshaNm2();
//		cb.setupSelect_MCustomerByDepositId();
//		cb.specify().columnAccountId();
//		cb.setupSelect_MProduct();
//		cb.specify().specifyMProduct().columnProductCategoryCls();
//		cb.specify().specifyMProduct().columnProductCd();
//		cb.specify().specifyMProduct().columnJanCd();
//		cb.specify().specifyMProduct().columnProductNm();
//		cb.specify().specifyMProduct().columnEvaluationUnitPrice();
//		cb.specify().columnChargeNum();
//		cb.specify().columnInventoryNum();
//		// ====== 検索条件 ======
//		//センタCD
//		cb.query().queryTInventoryH().queryMCenter().setCenterCd_Equal(head.getMCenter().getCenterCd());
//		//取引先CD
//		cb.query().queryMCustomerByDepositId().setCustomerCd_Equal(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
//		//棚卸日
//		cb.query().queryTInventoryH().setInventoryDt_Equal(head.getInventoryInstDt());
//		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
//		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
//			cb.columnQuery(subCb -> {
//				//引当可能数
//				subCb.specify().columnChargeNum();
//			}).notEqual(subCb -> {
//				//棚卸数
//				subCb.specify().columnInventoryNum();
//			});
//		}
//		// ====== 出力順 ======
//		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
//		cb.query().queryMWarehouse().addOrderBy_WarehouseCd_Asc();
//		cb.query().queryTInventoryH().addOrderBy_PlantCd_Asc();
//		cb.query().queryTInventoryH().addOrderBy_InventoryDt_Asc();
//		cb.query().queryMSalesOrg().addOrderBy_SalesOrgCd_Asc();
//		cb.query().queryMCustomerByAccountId().addOrderBy_CustomerCd_Asc();
//		cb.query().queryMProduct().addOrderBy_ProductCategoryCls_Asc();
//		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
//		cb.query().queryMProduct().addOrderBy_JanCd_Asc();
//		// ====== 検索実行 ======
//		List<TInventoryB> result = selectList(tInventoryBBhv, cb);
		
		result.forEach(entity -> {
			//得意先の取引先Cdと取引先名取得
//			String acccountCd = "";
//			String accountNm = "";
//			if(entity.getAccountId() != null) {
//				MCustomerCB csBean = mCustomerBhv.newConditionBean();
//				csBean.specify().columnCustomerCd();
//				csBean.specify().columnCustomerNm();
//				csBean.query().setCustomerId_Equal(entity.getAccountId());
//				MCustomer cs = mCustomerBhv.selectEntity(csBean);
//				acccountCd = cs == null ? "" : cs.getCustomerCd();
//				accountNm = cs == null ? "" : cs.getCustomerNm();
//			}
//			MCustomer account = new MCustomer();
//			account.setCustomerCd(acccountCd);
//			account.setCustomerNm(accountNm);
//			entity.setMCustomerByAccountId(account);
//			//部門名取得
//			String plantNm = "";
//			if(entity.getTInventoryH().getPlantCd() != null && entity.getTInventoryH().getStorageSpaceCd() != null) {
//				MPlantStorageSpaceCB scb = mPlantStorageSpaceBhv.newConditionBean();
//				scb.specify().columnPlantNm();
//				scb.query().setPlantCd_Equal(entity.getTInventoryH().getPlantCd());
//				scb.query().setStorageSpaceCd_Equal(entity.getTInventoryH().getStorageSpaceCd());
//				MPlantStorageSpace plant = mPlantStorageSpaceBhv.selectEntity(scb);
//				plantNm = plant == null ? "" : plant.getPlantNm();
//			}
//			entity.setPlantNm(plantNm);
			//品種名取得
			String typeNm = "";
			BClassDtlCB classCb = bClassDtlBhv.newMyConditionBean();
			if(entity.getMProduct() != null && entity.getMProduct().getProductCategoryCls() != null) {
				classCb.setupSelect_VDict(getCultureId());
				classCb.specify().specifyVDict().columnDictNm();
				classCb.query().queryBClass().setClassCd_Equal(PRODUCT_CATEGORY_TYPE);
				classCb.query().setClassDtlCd_Equal(entity.getMProduct().getProductCategoryCls());
				BClassDtl dtl = bClassDtlBhv.selectEntity(classCb);
				typeNm = (dtl == null || dtl.getVDict() == null) ? "" : dtl.getVDict().getDictNm();
			}
			entity.setTypeNm(typeNm);
			//棚卸差異
			//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
			String diffNm = "";
			if(head.getInventoryDiff() == null  || head.getInventoryDiff().isEmpty()) {
				diffNm = "00:全で";
			}else {
				classCb.setupSelect_VDict(getCultureId());
				classCb.specify().specifyVDict().columnDictNm();
				classCb.query().queryBClass().setClassCd_Equal(INVENTORY_DIFF_CLS);
				classCb.query().setClassDtlCd_Equal(head.getInventoryDiff());
				BClassDtl diff = bClassDtlBhv.selectEntity(classCb);
				diffNm = (diff == null ||  diff.getVDict() == null) ? "" : head.getInventoryDiff() + ":"+ diff.getVDict().getDictNm();
			}
			entity.setInventoryDiffNm(diffNm);
		});
		
		// ===== 件数チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}
	
	/**
	 * <h2>商品別棚卸実績(LOC表示あり)データを取得する。</h2>
	 * <pre>
	 * 商品別棚卸実績(LOC表示あり)データを取得する。
	 *
	 * </pre>
	 * @param head 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public List<TInventoryB> getReportData04(TInventoryH head , TInventoryB body ,  ErrorStatus errSts) {
		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
				boolean isInventoryDiff = false;
				if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
					isInventoryDiff = true;
				}
				SqlInventoryListPrintReportData04Pmb report4pmb = new SqlInventoryListPrintReportData04Pmb();
				report4pmb.setCenterCd(head.getMCenter().getCenterCd());
				report4pmb.setDepCustomerCd(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
				report4pmb.setInventoryDt(head.getInventoryInstDt());
				report4pmb.setIsInventoryDiff(isInventoryDiff);
				ListResultBean<SqlInventoryListPrintReportData04> resulList = tInventoryBBhv.outsideSql().selectList(tInventoryBBhv.PATH_selectSqlInventoryListPrintReportData04 , report4pmb, SqlInventoryListPrintReportData04.class);
				List<TInventoryB> result = new ArrayList<TInventoryB>();
				resulList.forEach(bd -> {
					TInventoryB entity = new TInventoryB();
					TInventoryH tInventoryH = new TInventoryH();
					MCenter mCenter = new MCenter();
					mCenter.setCenterCd(bd.getCenterCd());
					mCenter.setCenterAbbr(bd.getCenterAbbr());
					MLocation location = new MLocation();
					location.setLocationCd(bd.getLocationCd());
					MProduct product = new MProduct();
					product.setProductCategoryCls(bd.getProductCategoryCls());
					product.setProductCd(bd.getProductCd());
					product.setJanCd(bd.getJanCd());
					product.setProductNm(bd.getProductNm());
					tInventoryH.setMCenter(mCenter);
					tInventoryH.setInventoryDt(bd.getInventoryDt());
					entity.setInventoryNum(bd.getSuminvnum());
					entity.setTInventoryH(tInventoryH);
					entity.setMProduct(product);
					entity.setMLocation(location);
					result.add(entity);
				});
		// ===== 棚卸在庫差異データ取得 =====
//		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
//		cb.setupSelect_TInventoryH().withMCenter();
//		cb.specify().specifyTInventoryH().specifyMCenter().columnCenterCd();
//		cb.specify().specifyTInventoryH().specifyMCenter().columnCenterAbbr();
//		cb.specify().specifyTInventoryH().columnInventoryDt();
//		cb.setupSelect_MCustomerByDepositId();
//		cb.setupSelect_MProduct();
//		cb.specify().specifyMProduct().columnProductCategoryCls();
//		cb.specify().specifyMProduct().columnProductCd();
//		cb.specify().specifyMProduct().columnJanCd();
//		cb.specify().specifyMProduct().columnProductNm();
//		cb.setupSelect_MLocation();
//		cb.specify().specifyMLocation().columnLocationCd();
//		cb.specify().columnInventoryNum();
//		// ====== 検索条件 ======
//		//センタCD
//		cb.query().queryTInventoryH().queryMCenter().setCenterCd_Equal(head.getMCenter().getCenterCd());
//		//取引先CD
//		cb.query().queryMCustomerByDepositId().setCustomerCd_Equal(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
//		//棚卸日
//		cb.query().queryTInventoryH().setInventoryDt_Equal(head.getInventoryInstDt());
//		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
//		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
//			cb.columnQuery(subCb -> {
//				//引当可能数
//				subCb.specify().columnChargeNum();
//			}).notEqual(subCb -> {
//				//棚卸数
//				subCb.specify().columnInventoryNum();
//			});
//		}
//		// ====== 出力順 ======
//		cb.query().queryTInventoryH().queryMCenter().addOrderBy_CenterCd_Asc();
//		cb.query().queryTInventoryH().addOrderBy_InventoryDt_Asc();
//		cb.query().queryMProduct().addOrderBy_ProductCategoryCls_Asc();
//		cb.query().queryMProduct().addOrderBy_ProductCd_Asc();
//		cb.query().queryMProduct().addOrderBy_JanCd_Asc();
//		cb.query().queryMLocation().addOrderBy_LocationCd_Asc();
//		// ====== 検索実行 ======
//		List<TInventoryB> result = selectList(tInventoryBBhv, cb);
		
		result.forEach(entity -> {
			//品種名取得
			String typeNm = "";
			BClassDtlCB classCb = bClassDtlBhv.newMyConditionBean();
			if(entity.getMProduct() != null && entity.getMProduct().getProductCategoryCls() != null) {
				classCb.setupSelect_VDict(getCultureId());
				classCb.specify().specifyVDict().columnDictNm();
				classCb.query().queryBClass().setClassCd_Equal(PRODUCT_CATEGORY_TYPE);
				classCb.query().setClassDtlCd_Equal(entity.getMProduct().getProductCategoryCls());
				BClassDtl dtl = bClassDtlBhv.selectEntity(classCb);
				typeNm = (dtl == null || dtl.getVDict() == null) ? "" : dtl.getVDict().getDictNm();
			}
			entity.setTypeNm(typeNm);
			//棚卸差異
			//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
			String diffNm = "";
			if(head.getInventoryDiff() == null  || head.getInventoryDiff().isEmpty()) {
				diffNm = "00:全で";
			}else {
				classCb.setupSelect_VDict(getCultureId());
				classCb.specify().specifyVDict().columnDictNm();
				classCb.query().queryBClass().setClassCd_Equal(INVENTORY_DIFF_CLS);
				classCb.query().setClassDtlCd_Equal(head.getInventoryDiff());
				BClassDtl diff = bClassDtlBhv.selectEntity(classCb);
				diffNm = (diff == null ||  diff.getVDict() == null) ? "" : head.getInventoryDiff() + ":"+ diff.getVDict().getDictNm();
			}
			entity.setInventoryDiffNm(diffNm);
		});
		// ===== 件数チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}
	
	/**
	 * <h2>商品別棚卸の棚卸ボディ.棚卸ボディIdを取得する。</h2>
	 * <pre>
	 * 棚卸ボディIdを取得する。
	 *
	 * </pre>
	 * @param head 棚卸ヘッダ
	 * @param body 棚卸ボディ
	 */
	public List<TInventoryB> getBodyIdsFor03_04(TInventoryH head , TInventoryB body) {
		
		// ===== 棚卸在庫差異データ取得 =====
		TInventoryBCB cb = tInventoryBBhv.newMyConditionBean();
		cb.specify().columnInventoryBId();
		// ====== 検索条件 ======
		//センタCD
		cb.query().queryTInventoryH().queryMCenter().setCenterCd_Equal(head.getMCenter().getCenterCd());
		//取引先CD
		cb.query().queryMCustomerByDepositId().setCustomerCd_Equal(body.getMCustomerByDepositId() == null ? null : body.getMCustomerByDepositId().getCustomerCd());
		//棚卸日
		cb.query().queryTInventoryH().setInventoryDt_Equal(head.getInventoryInstDt());
		//検索.棚卸差異が「 01:差異ありのみ出力」の場合、以下を設定
		if(CDef.InventoryDiffCls.$01.code().equals(head.getInventoryDiff())) {
			cb.columnQuery(subCb -> {
				//引当可能数
				subCb.specify().columnChargeNum();
			}).notEqual(subCb -> {
				//棚卸数
				subCb.specify().columnInventoryNum();
			});
		}
		// ====== 検索実行 ======
		List<TInventoryB> result = selectList(tInventoryBBhv, cb);
		return result;
	}
	
	/**
	 * <h2>棚卸帳票データを更新する。</h2>
	 * <pre>
	 * 「01:棚卸在庫差異表」、「02:在庫差異確認表」、
	 * 「03:商品別棚卸実績表兼差異表」または「04:商品別棚卸実績表(LOC表示あり)」の場合、棚卸帳票のコントロールNo.を更新する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param List<TInventoryB> 棚卸ボディリスト:棚卸ボディID
	 * @param controlNo  コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void updateControlNo1_2_3_4(List<TInventoryB>  tInventoryBList, Long controlNo, ErrorStatus errSts) {
		// ===== 初期処理 =====
		
		//棚卸ボディIDリスト取得
		List<Long> tInventoryBIds = tInventoryBList.stream().map( tInventoryB -> tInventoryB.getInventoryBId()).collect(Collectors.toList());
		
		//TInventoryR entity = new TInventoryR();
		//entity.setControlNo(controlNo);
		// ===== 棚卸帳票データ取得 =====
		TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
		// ===== 検索条件の設定 =====
		// 棚卸ボディID
		cb.query().setInventoryBId_InScope(tInventoryBIds);
		ListResultBean<TInventoryR> selectList = tInventoryRBhv.selectList(cb);
		selectList.forEach(o -> o.setControlNo(controlNo));

		// 棚卸帳票の検索更新実行
		tInventoryRBhv.batchUpdate(selectList);
		//tInventoryRBhv.varyingQueryUpdate(entity, cb, op -> op.allowNonQueryUpdate());

	}
	
	/**
	 * <h2>棚卸帳票データを更新する。</h2>
	 * <pre>
	 * 「01:棚卸在庫差異表」または「02:在庫差異確認表」の差異表出力フラグを更新する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param controlNo  コントロールNo.
	 * @param 「棚卸在庫差異表」/「在庫差異確認表」更新フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 棚卸帳票の更新件数
	 */
	public void updateOutFLg1_2(Long controlNo, String flag, ErrorStatus errSts) {
		// ===== 初期処理 =====
		//棚卸ボディIDリスト取得
		//List<Long> inventoryBIds = tInventoryBList.stream().map(inventoryB -> inventoryB.getInventoryBId()).collect(Collectors.toList());
		if(!Arrays.asList("01", "02").contains(flag)) {
			return;
		}
		TInventoryR entity = new TInventoryR();
		entity.setControlNo(null);
		switch(flag) {
			case "01" :
				entity.setInventoryDiffOutFlg(CDef.ListOutKbn.$1.code());
				entity.setInventoryDiffOutDt(Timestamp.valueOf(LocalDateTime.now()));
				entity.setInventoryDiffOutUserId(getUserId());
				break;
			case "02" :
				entity.setStockDiffOutFlg(CDef.ListOutKbn.$1.code());
				entity.setStockDiffOutDt(Timestamp.valueOf(LocalDateTime.now()));
				entity.setStockDiffOutUserId(getUserId());
				break;
			default:
		}
		// ===== 棚卸帳票データ取得 =====
		TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
		//cb.setupSelect_TInventoryB();
		// ===== 検索条件の設定 =====
		// 棚卸ボディID
		cb.query().setControlNo_Equal(controlNo);

		// 棚卸帳票の検索更新実行
		tInventoryRBhv.varyingQueryUpdate(entity, cb, op -> op.allowNonQueryUpdate());

	}
	
	/**
	 * <h2>棚卸帳票データを更新する。</h2>
	 * <pre>
	 * 「03:商品別棚卸実績表兼差異表」または「04:商品別棚卸実績表(LOC表示あり)」の場合、差異表出力フラグを更新する。
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param controlNo  コントロールNo.
	 * @param 「棚卸在庫差異表」/「在庫差異確認表」更新フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 棚卸帳票の更新件数
	 */
	public void updateOutFLg3_4(Long controlNo, String flag,  ErrorStatus errSts) {
		// ===== 初期処理 =====
				
				//棚卸ボディIDリスト取得
				//List<Long> inventoryBIds = tInventoryBList.stream().map(inventoryB -> inventoryB.getInventoryBId()).collect(Collectors.toList());
				if(!Arrays.asList("03", "04").contains(flag)) {
					return;
				}
				TInventoryR entity = new TInventoryR();
				entity.setControlNo(null);
				switch(flag) {
					case "03" :
						entity.setInventoryRecordOutFlg(CDef.ListOutKbn.$1.code());
						entity.setInventoryRecordOutDt(Timestamp.valueOf(LocalDateTime.now()));
						entity.setInventoryRecordOutUserId(getUserId());
						break;
					case "04" :
						entity.setInventoryRecordLocOutFlg(CDef.ListOutKbn.$1.code());
						entity.setInventoryRecordLocOutDt(Timestamp.valueOf(LocalDateTime.now()));
						entity.setInventoryRecordLocOutUserId(getUserId());
						break;
					default:
						
				}
				// ===== 棚卸帳票データ取得 =====
				TInventoryRCB cb = tInventoryRBhv.newMyConditionBean();
				//cb.setupSelect_TInventoryB();
				// ===== 検索条件の設定 =====
				// 棚卸ボディID
				cb.query().setControlNo_Equal(controlNo);
				// 棚卸帳票の検索更新実行
				tInventoryRBhv.varyingQueryUpdate(entity, cb, op -> op.allowNonQueryUpdate());

	}
}
