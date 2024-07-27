package com.oneslogi.wms.core;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class WmsCoreCalc {

	// ===== publicの定数 =====

	/** BigDecimal型の「0」 **/
	public static final BigDecimal ZERO = BigDecimal.ZERO;

	/** BigDecimal型の「1」 **/
	public static final BigDecimal ONE = BigDecimal.ONE;

	/** BigDecimal型の「-1」 **/
	public static final BigDecimal MINUS_ONE = new BigDecimal("-1");

	// TODO b_propertiesから取得 もしくは 荷主毎ならm_paramから取得

	/** 乗算に使用するスケール (小数点以下の桁数) */
	public static final int SCALE = 3;

	/** スケールをこえた時の丸め方 */
	public static final RoundingMode RAOUNDING_MODE = RoundingMode.DOWN;

	// ===== private(内部)変数 =====

	/** 繰返し加算クラス */
	private static final RepeatCalc AddCalc;
	/** 繰返し減算クラス */
	private static final RepeatCalc SubtractCalc;
	/** 繰返し乗算クラス */
	private static final RepeatCalc MultiplyCalc;

	static {
		AddCalc = new RepeatCalc() {
			@Override
			protected BigDecimal calc(BigDecimal a, BigDecimal b) {
				return a.add(b);
			}
		};

		MultiplyCalc = new RepeatCalc() {
			@Override
			protected BigDecimal calc(BigDecimal a, BigDecimal b) {
				return a.multiply(b);
			}
		};

		SubtractCalc = new RepeatCalc() {
			@Override
			protected BigDecimal calc(BigDecimal a, BigDecimal b) {
				return a.subtract(b);
			}
		};
	}

	/**
	 * 引数をBigDecimalに変換
	 * @param val
	 * @return val値のBigDecimal
	 */
	public static BigDecimal toBigDecimal(Object val) {

		if (val == null) {
			throw new NullPointerException("Argument(val) is null");
		}

		if (val instanceof BigDecimal) {
			return (BigDecimal) val;
		}

		if (val instanceof String) {
			return new BigDecimal((String) val);
		}

		if (val instanceof Long) {
			return new BigDecimal((Long) val);
		}

		if (val instanceof Integer) {
			return new BigDecimal((Integer) val);
		}

		throw new IllegalArgumentException("Argument(val) cannot do longValue.(Other than String, Long, Integer, BigDecimal)");
	}

	/**
	 * 小数部を切り捨てで整数を返す
	 * @param val
	 * @return long型のval
	 */
	public static long longValue(Object val) {

		if (val == null) {
			throw new NullPointerException("Argument(val) is null");
		}

		if (val instanceof BigDecimal) {
			return ((BigDecimal) val).longValue();
		}

		if (val instanceof Long) {
			return ((Long) val).longValue();
		}

		if (val instanceof Integer) {
			return ((Integer) val).longValue();
		}

		if (val instanceof BigInteger) {
			return ((BigInteger) val).longValue();
		}

		if (val instanceof String) {
			return Long.valueOf((String) val);
		}

		if (val instanceof Double) {
			return ((Double) val).longValue();
		}

		throw new IllegalArgumentException("Argument(val) cannot do longValue.(Other than BigDecimal, Long, Integer, Double, String,  BigInteger)");
	}

	/**
	 * "0"かどうかを返す
	 * @param val
	 * @return val == 0の場合true、それ以外はfalse
	 */
	public static boolean isZero(Object val) {
		return isEqual(val, BigDecimal.ZERO);
	}

	/**
	 * "0"以外かどうかを返す
	 * @param val
	 * @return val != 0の場合true、それ以外はfalse
	 */
	public static boolean isNotZero(Object val) {
		return !isZero(val);
	}

	/**
	 * "0"以上かどうかを返す
	 * @param val
	 * @return val >= 0の場合true、それ以外はfalse
	 */
	public static boolean isZeroOrGreater(Object val) {
		return isGreaterEqual(val, BigDecimal.ZERO);
	}

	/**
	 * "0"以下かどうかを返す
	 * @param val
	 * @return val <= 0の場合true、それ以外はfalse
	 */
	public static boolean isZeroOrLess(Object val) {
		return isLessEqual(val, BigDecimal.ZERO);
	}

	/**
	 * "0"より大きいかどうかを返す
	 * @param val
	 * @return val > 0の場合true、それ以外はfalse
	 */
	public static boolean isPositive(Object val) {
		return isGreaterThan(val, BigDecimal.ZERO);
	}

	/**
	 * "0"より小さいかどうかを返す
	 * @param val
	 * @return val < 0の場合true、それ以外はfalse
	 */
	public static boolean isNegative(Object val) {
		return isLessThan(val, BigDecimal.ZERO);
	}

	/**
	 * left == right かどうかを返す
	 * @param left
	 * @param right
	 * @return left == rightの場合true、それ以外はfalse
	 */
	public static boolean isEqual(Object left, Object right) {

		if (left == null && right == null) {
			return true;
		}

		if (left == null || right == null) {
			return false;
		}

		return compare(left, right) == 0;
	}

	/**
	 * left != right かどうかを返す
	 * @param left
	 * @param right
	 * @return left != rightの場合true、それ以外はfalse
	 */
	public static boolean isNotEqual(Object left, Object right) {
		return !isEqual(left, right);
	}

	/**
	 * 値の比較
	 * left == right の場合は 0
	 * left < right の場合は -1
	 * left > right の場合は 1
	 * @param left
	 * @param right
	 * @return left == right の場合は 0、left < right の場合は -1、left > right の場合は 1
	 */
	public static int compare(Object left, Object right) {
		BigDecimal leftBd = toBigDecimal(left);
		BigDecimal rightBd = toBigDecimal(right);

		return leftBd.compareTo(rightBd);
	}

	/**
	 * "left > right"かどうかを返す
	 * @param left
	 * @param right
	 * @return left > rightの場合true、それ以外はfalse
	 */
	public static boolean isGreaterThan(Object left, Object right) {
		return compare(left, right) > 0;
	}

	/**
	 * "left < right"かどうかを返す
	 * @param left
	 * @param right
	 * @return left < rightの場合true、それ以外はfalse
	 */
	public static boolean isLessThan(Object left, Object right) {
		return compare(left, right) < 0;
	}

	/**
	 * "left >= right"かどうかを返す
	 * @param left
	 * @param right
	 * @return left >= rightの場合true、それ以外はfalse
	 */
	public static boolean isGreaterEqual(Object left, Object right) {
		return compare(left, right) >= 0;
	}

	/**
	 * "left <= right"かどうかを返す
	 * @param left
	 * @param right
	 * @return left <= rightの場合true、それ以外はfalse
	 */
	public static boolean isLessEqual(Object left, Object right) {
		return compare(left, right) <= 0;
	}

	/**
	 * 値の加算
	 * left + right ( + right + right...)
	 *
	 * @param left 加算される値
	 * @param rights  加算する値
	 * @return 加算後のBigDecimal
	 */
	public static BigDecimal add(Object left, Object... rights) {

		return AddCalc.execute(left, rights);
	}

	/**
	 * 値の減算
	 * left - right ( - right - right...)
	 *
	 * @param left 減算される値
	 * @param rights  減算する値
	 * @return 減算後のBigDecimal
	 */
	public static BigDecimal subtract(Object left, Object... rights) {

		return SubtractCalc.execute(left, rights);
	}

	/**
	 * 値の乗算
	 * left * right ( * right * right...)
	 *
	 * @param left 乗算される値
	 * @param rights  乗算する値
	 * @return 乗算後のBigDecimal
	 */
	public static BigDecimal multiply(Object left, Object... rights) {
		return MultiplyCalc.execute(left, rights).setScale(SCALE, RAOUNDING_MODE);
	}

	/**
	 * 値の除算 (小数以下は切捨て)
	 * left / right
	 *
	 * @param left 除算される値
	 * @param rights  除算する値
	 * @return left / right
	 */
	public static BigDecimal divide(Object left, Object right) {

		BigDecimal leftBd = toBigDecimal(left);
		BigDecimal rightBd = toBigDecimal(right);

		return leftBd.divide(rightBd, 0, RoundingMode.DOWN);
	}

	/**
	 * 値の除算 (丸め動作指定)
	 * left / right
	 *
	 * @param left 除算される値
	 * @param rights  除算する値
	 * @param roundingMode 丸め動作
	 * @return
	 */
	public static BigDecimal divide(Object left, Object right, RoundingMode roundingMode) {

		BigDecimal leftBd = toBigDecimal(left);
		BigDecimal rightBd = toBigDecimal(right);

		return leftBd.divide(rightBd, 0, roundingMode);
	}

	/**
	 * 値の除算 (小数以下は切上げ)
	 * left / right (余りがあれば +1 又は -1)
	 *
	 * @param left 除算される値
	 * @param rights  除算する値
	 * @return left / right (余りがあれば +1 又は -1)
	 */
	public static BigDecimal divideRoundUp(Object left, Object right) {

		BigDecimal leftBd = toBigDecimal(left);
		BigDecimal rightBd = toBigDecimal(right);

		return leftBd.divide(rightBd, 0, RoundingMode.UP);
	}

	/**
	 * 値の剰余
	 * left % right
	 *
	 * @param left 除算される値
	 * @param rights  除算する値
	 * @return left % right
	 */
	public static BigDecimal remainder(Object left, Object right) {

		BigDecimal leftBd = toBigDecimal(left);
		BigDecimal rightBd = toBigDecimal(right);

		return leftBd.remainder(rightBd);
	}

	/**
	 * 小数点以下切捨て
	 * @param val 切捨てる値
	 * @return 切捨て後の値
	 */
	public static BigDecimal roundDown(Object val) {
		BigDecimal valBd = toBigDecimal(val).setScale(0, RoundingMode.DOWN);
		return valBd;
	}

	/**
	 * 末尾の0を削除(Stringで返却)
	 * @param val 対象の値
	 * @return 末尾の0を削除したString
	 */
	public static String stripTrailingZeros(Object val) {

		if (val == null) {
			return null;
		}

		BigDecimal bd = toBigDecimal(val);

		// java7では0.00が正しく変換されず0.00で出力されてしまう
		// java8の場合は修正されているので以下if文は不要
		if (isZero(bd)) {
			return "0";
		}

		return bd.stripTrailingZeros().toPlainString();
	}

	/**
	 * 繰返し同じ計算をする場合に使用する
	 * (例えば引数の数だけ加算する処理など)
	 */
	private static abstract class RepeatCalc {

		public BigDecimal execute(Object left, Object... rights) {

			BigDecimal leftBd = toBigDecimal(left);

			for (Object right : rights) {
				BigDecimal rightBd = toBigDecimal(right);
				leftBd = calc(leftBd, rightBd);
			}

			return leftBd;
		}

		protected abstract BigDecimal calc(BigDecimal left, BigDecimal right);
	}
}
