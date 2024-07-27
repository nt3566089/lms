package com.oneslogi.wms.core.logic.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MProductCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.MShapeGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpDtlBhv;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dbflute.exentity.MShapeGrpDtl;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿の取得、入数の計算ロジック
 */
public class ProductShapeCalcLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MProductBhv mProductBhv;
	@Inject
	private MShapeGrpDtlBhv MShapeGrpDtlBhv;

	// ===== 使用変数 =====

	// インスタンス単位で計算結果を保持して無駄な処理を避ける (リクエスト単位で破棄される想定)
	private Map<Long, ProductShapeGrp> instanceMap = new HashMap<Long, ProductShapeGrp>();
	private Map<Long, Long> pieceShapeIdMap = new HashMap<Long, Long>();

	/**
	 * ケース荷姿の入数(ピース単位)を取得
	 * @param productId 商品ID
	 * @return ケース荷姿の入数(ピース単位)
	 */
	public long getCaseUnitNumPiece(final long productId) {

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return 0L;
		}

		MProductShape shape = grp.getCaseProductShape();
		if (shape == null) {
			return 0L;
		}

		return shape.getUnitNumPiece();
	}

	/**
	 * ケース荷姿を取得(入数計算後)
	 * @param productId 商品ID
	 * @return ケース荷姿
	 */
	public MProductShape getCaseProductShape(final long productId) {

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return null;
		}

		return grp.getCaseProductShape();
	}

	/**
	 * 緊急補充荷姿の入数(ピース単位)を取得
	 * @param productId 商品ID
	 * @return 緊急補充荷姿の入数(ピース単位)
	 */
	public long getEmReplenishUnitNumPiece(final long productId) {

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return 0L;
		}

		MProductShape shape = grp.getEmReplenishProductShape();
		if (shape == null) {
			return 0L;
		}

		return shape.getUnitNumPiece();
	}

	/**
	 * 指定商品荷姿のピース単位の入数を取得
	 * @param productId 商品ID
	 * @param productShpeId 商品荷姿ID
	 * @return ピース単位の入数
	 */
	public long getUnitNumPieceByProductShapeId(final long productId, Long productShpeId) {

		if (productShpeId == null) {
			return 0L;
		}

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return 0L;
		}

		List<MProductShape> shapeList = grp.getAllProductShape();

		for (MProductShape shape : shapeList) {

			if (shape.getProductShapeId().longValue() == productShpeId.longValue()) {
				return shape.getUnitNumPiece();
			}
		}

		return 0L;
	}

	/**
	 * ピース商品荷姿を取得
	 * @param productId 商品ID
	 * @return ピース商品荷姿
	 */
	public MProductShape getPieceProductShape(final long productId) {

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return null;
		}

		return grp.getPieceProductShape();
	}

	/**
	 * ピースの荷姿ID取得
	 * @param productId 商品ID
	 * @return ピースの荷姿ID
	 */
	public long getPieceShapeId(long productId) {

		if (instanceMap.containsKey(productId)) {
			// 既に検索済

			ProductShapeGrp grp = instanceMap.get(productId);
			if (grp != null) {
				MProductShape shape = grp.getPieceProductShape();
				if (shape != null) {
					return shape.getMShapeGrpDtl().getShapeId();
				}
			}
		}

		// 未検索
		return selectPieceShapeId(productId);
	}

	/**
	 * <h2>指定数量の荷姿内訳を取得.</h2>
	 * <pre>
	 * 指定された総数では
	 * 各荷姿がいくつになるかを計算し、
	 * 商品荷姿毎に数(num)を設定した商品荷姿リストを返却する。
	 * 小数ありの商品の場合や、小数ありの総数の場合は
	 * 空のリストを返却する。
	 * </pre>
	 *
	 * @param productId 商品ID
	 * @param allNum 総数
	 * @return 各荷姿の内訳(num)が設定された商品荷姿リスト
	 */
	public List<MProductShape> getAllShapeNum(long productId, BigDecimal allNum) {
		long allNumLong = 0L;
		try {
			allNumLong = allNum.longValueExact();
		} catch (ArithmeticException e) {
			// 小数あり
			return new ArrayList<MProductShape>();
		}
		return getAllShapeNum(productId, allNumLong);
	}

	/**
	 * <h2>指定数量の荷姿内訳を取得.</h2>
	 * <pre>
	 * 指定された総数では
	 * 各荷姿がいくつになるかを計算し、
	 * 商品荷姿毎に数(num)を設定した商品荷姿リストを返却する。
	 * 小数ありの商品の場合や、小数ありの総数の場合は
	 * 空のリストを返却する。
	 * </pre>
	 *
	 * @param productId 商品ID
	 * @param allNum 総数
	 * @return 各荷姿の内訳(num)が設定された商品荷姿リスト
	 */
	public List<MProductShape> getAllShapeNum(long productId, long allNum) {

		List<MProductShape> resultShapeList = new ArrayList<MProductShape>();

		ProductShapeGrp grp = createProductShapeGrp(productId);
		if (grp == null) {
			return resultShapeList;
		}

		List<MProductShape> shapeInfoList = grp.getAllProductShape();

		// 残数
		long num = allNum;

		// 入数が大きい順に繰返
		for (int index = (shapeInfoList.size() - 1); 0 <= index; index--) {

			// 荷姿情報自体に変更を加えないためcloneを生成して返す
			MProductShape shape = shapeInfoList.get(index).clone();
			long unitNum = shape.getUnitNumPiece();

			if (unitNum < 1 || num < 1) {
				shape.setNum(num);
				num = 0L;
			} else {
				shape.setNum(num / unitNum);
				num = num % unitNum;
			}

			resultShapeList.add(shape);

			// 全ての荷姿を返すため残数(num)が 0でもbreakしない
		}

		return resultShapeList;
	}

	private ProductShapeGrp createProductShapeGrp(final long productId) {

		if (instanceMap.containsKey(productId)) {
			return instanceMap.get(productId);
		}

		// ===== 各マスタの取得 =====

		MProductCB cb = mProductBhv.newConditionBean();
		cb.setupSelect_MShapeGrp();

		cb.specify().specifyMShapeGrp().columnShapeGrpId();
		cb.specify().specifyMShapeGrp().columnDecimalExistFlg();
		cb.specify().columnProductId();

		cb.query().setProductId_Equal(productId);

		// 商品を検索
		MProduct product = mProductBhv.selectEntityWithDeletedCheck(cb);
		MShapeGrp shapeGrp = product.getMShapeGrp();

		// 小数あり ⇒ 入数管理しない
		if (shapeGrp.isDecimalExistFlg$1()) {

			// 商品荷姿は使用しないためnullを返却
			instanceMap.put(productId, null);
			selectPieceShapeId(productId, shapeGrp.getShapeGrpId());

			return null;
		}

		mProductBhv.loadMProductShapeList(product, new ConditionBeanSetupper<MProductShapeCB>() {

			@Override
			public void setup(MProductShapeCB psCb) {

				psCb.setupSelect_MShapeGrpDtl();

				// 荷姿ソート順(昇順に取得)
				psCb.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc().withNullsLast();
			}
		});

		// ===== 計算 =====

		ProductShapeGrp productShapeGrp = createProductShapeGrp(product.getMProductShapeList());

		instanceMap.put(productId, productShapeGrp);

		return productShapeGrp;
	}

	private ProductShapeGrp createProductShapeGrp(List<MProductShape> productShapeList) {

		ProductShapeGrp resultProductShapeGrp = new ProductShapeGrp();

		// 子のピース数
		long childUnitNumPiece = 1L;

		boolean isFirst = true;

		for (MProductShape productShape : productShapeList) {

			MShapeGrpDtl dtl = productShape.getMShapeGrpDtl();

			long unitNum = CU.nullToZero(productShape.getUnitNum());

			if (isFirst) {
				// 1番目 => ピース荷姿とする

				isFirst = false;

				// 入数(0の場合は1)をピース数に設定
				long unitNumPiece = zeroToOne(unitNum);
				productShape.setUnitNumPiece(unitNumPiece);
				childUnitNumPiece = unitNumPiece;

				productShape.setPieceFlg("1");
				resultProductShapeGrp.setPieceProductShape(productShape);

				// 荷姿追加
				resultProductShapeGrp.addProductShape(productShape);

				continue;
			}

			if (unitNum < 1) {
				// 入数未設定

				continue;
			}

			// 子荷姿のピース数 * 入数
			long unitNumPiece = childUnitNumPiece * unitNum;
			productShape.setUnitNumPiece(unitNumPiece);
			childUnitNumPiece = unitNumPiece;

			// ケース荷姿
			if (dtl.isCasePickFlg$1()) {

				productShape.setCaseFlg("1");
				resultProductShapeGrp.setCaseProductShape(productShape);
			}

			// 緊急補充ゾーン補充荷姿
			if (dtl.isEmReplenishShapeFlg$1()) {

				resultProductShapeGrp.setEmReplenishProductShape(productShape);
			}

			// 荷姿追加
			resultProductShapeGrp.addProductShape(productShape);
		}
		return resultProductShapeGrp;
	}

	/**
	 * ピース荷姿IDの取得
	 */
	private long selectPieceShapeId(long productId) {

		if (pieceShapeIdMap.containsKey(productId)) {
			return pieceShapeIdMap.get(productId);
		}

		MProductCB cb = mProductBhv.newConditionBean();
		cb.specify().columnShapeGrpId();
		cb.query().setProductId_Equal(productId);

		// 商品を検索
		MProduct product = mProductBhv.selectEntityWithDeletedCheck(cb);

		return selectPieceShapeId(productId, product.getShapeGrpId());
	}

	/**
	 * ピース荷姿IDの取得
	 */
	private long selectPieceShapeId(long productId, long shapeGrpId) {

		if (pieceShapeIdMap.containsKey(productId)) {
			return pieceShapeIdMap.get(productId);
		}

		MShapeGrpDtlCB cb = MShapeGrpDtlBhv.newMyConditionBean();

		cb.specify().columnShapeId();

		cb.query().setShapeGrpId_Equal(shapeGrpId);
		cb.query().addOrderBy_ShapeSort_Asc().withNullsLast();
		cb.fetchFirst(1);

		MShapeGrpDtl dtl = MShapeGrpDtlBhv.selectEntity(cb);

		long pieceShapeId = 0L;

		if (dtl != null) {
			pieceShapeId = dtl.getShapeId();
		}

		pieceShapeIdMap.put(productId, pieceShapeId);

		return pieceShapeId;
	}

	private long zeroToOne(Long unitNum) {

		if (unitNum == null || unitNum.longValue() < 1) {
			return 1;
		}

		return unitNum;
	}

	private static class ProductShapeGrp {

		private List<MProductShape> allProductShape = new ArrayList<MProductShape>();
		private MProductShape pieceProductShape;
		private MProductShape caseProductShape;
		private MProductShape emReplenishProductShape;

		public List<MProductShape> getAllProductShape() {
			return allProductShape;
		}

		public void addProductShape(MProductShape productShape) {
			this.allProductShape.add(productShape);
		}

		public MProductShape getPieceProductShape() {
			return pieceProductShape;
		}

		public void setPieceProductShape(MProductShape pieceProductShape) {
			this.pieceProductShape = pieceProductShape;
		}

		public MProductShape getCaseProductShape() {
			return caseProductShape;
		}

		public void setCaseProductShape(MProductShape caseProductShape) {
			this.caseProductShape = caseProductShape;
		}

		public MProductShape getEmReplenishProductShape() {
			return emReplenishProductShape;
		}

		public void setEmReplenishProductShape(MProductShape emReplenishProductShape) {
			this.emReplenishProductShape = emReplenishProductShape;
		}
	}
}
