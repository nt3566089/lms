package com.oneslogi.ht.base.cdi.interceptor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.apache.commons.lang3.StringUtils;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.cdi.interceptor.AbstractInterceptor;
import com.oneslogi.base.dto.ArgDto;
import com.oneslogi.base.dto.ArgDto.ArgData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.validator.CommonValidator;
import com.oneslogi.ht.base.cdi.annotation.ValidateHandy;
import com.oneslogi.ht.base.dto.HandyBaseDto;
import com.oneslogi.wms.core.WmsCoreMessageConst;

/**
 * Validate制御用Interceptorクラス。
 */
@ValidateHandy
@Interceptor
public class ValidateHandyInterceptor extends AbstractInterceptor {

	// [#2900] HT国際化対応(メッセージマスタ連携) メッセージCDの○○DispNmの「DispNm」を削除 2017.11.27 kawana

	// ===== 使用ロジック =====

	// [#3085] 項目名をHT辞書マスタから取得 2017.11.27 kawana Start

	@Inject
	private HtArgLogic argLogic;

	// [#3085] 項目名をHT辞書マスタから取得 2017.11.27 kawana End

	// ===== 定数定義 =====

	private static final String ARG_TYPE_NUMBER = "number";
	// [#2047] HT日付チェックを追加 2017.07.04 kawana Start
	private static final String ARG_TYPE_DATE = "date";
	// [#2047] HT日付チェックを追加 2017.07.04 kawana End
	private static final String INPUT_LIMIT_NUMBER = "^([1-9]\\d*|0)(\\.\\d+)?$";

	/**
	 * <h2>Validateチェックの実行.</h2>
	 * <pre>
	 * メソッド実行時の引数DTOのフィールド値に対して次のチェックを実行する。
	 * チェックがエラーの場合はエラー管理クラスにエラー内容を登録する。
	 * ・必須チェック
	 * ・入力文字チェック(正規表現)
	 * ・最小文字数チェック
	 * ・最大文字数チェック
	 * ・最小値チェック
	 * ・最大値チェック
	 * ・整数桁数チェック
	 * ・小数桁数チェック
	 *
	 * メソッドの引数は「HandyBaseDto」を継承しているクラスのみをチェック対象とし、
	 * チェック内容は引数マスタ(B_ARG)に紐づく 辞書検証マスタ、引数検証マスタ から取得する。
	 * </pre>
	 * @param ic InvocationContext
	 * @return エラー時はエラーをエラー管理クラスに登録後、nullを返却。通常時はメソッドの実行(ic.proceed)。
	 * @throws Exception
	 */
	@AroundInvoke
	public Object execute(final InvocationContext ic) throws Exception {

		// 前提条件チェック
		checkExtendBase(ic);

		// ネスト実行チェック
		if (isEnclosingMethodInvoke(ic)) {
			return ic.proceed();
		}

		// 基底クラスチェック
		if ((ic.getTarget() instanceof AbstractBase) == false) {
			throw new RuntimeException("Error information was not processed correctly.");
		}

		// 引数有無チェック
		if (ic.getParameters() == null || ic.getParameters().length < 1) {
			// 引数なし(エラーとしない)
			return ic.proceed();
		}

		String classNm = ic.getMethod().getDeclaringClass().getSimpleName();
		String methodNm = ic.getMethod().getName();

		// [#3085] 項目名をHT辞書マスタから取得 2017.11.27 kawana Start

		// 引数マスタの定義取得
		ArgDto argDto = argLogic.getArgDto(classNm, methodNm, HtArgLogic.UseCache.TRUE);

		// [#3085] 項目名をHT辞書マスタから取得 2017.11.27 kawana End

		if (argDto.data.size() < 1) {
			// 定義なし
			return ic.proceed();
		}

		// Validate処理
		for (Object parameter : ic.getParameters()) {

			if (!(parameter instanceof HandyBaseDto)) {
				// 対象外
				continue;
			}

			for (Map.Entry<String, ArgData> entry : argDto.data.entrySet()) {
				String argNm = entry.getKey();
				ArgData argInfo = entry.getValue();

				// 入力値の取得 (リフレクション)
				Object inputValue = null;
				try {
					// ゲッタから取得
					PropertyDescriptor pd = new PropertyDescriptor(argNm, parameter.getClass());
					Method getter = pd.getReadMethod();
					inputValue = getter.invoke(parameter, (Object[]) null);
				} catch (IntrospectionException getFieldException) {
					// ゲッタからの取得失敗
					// publicフィールドから取得
					try {
						Class<?> parameterClass = parameter.getClass();
						Field field = parameterClass.getField(argNm);
						inputValue = field.get(parameter);
					} catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException | ExceptionInInitializerError accessFieldException) {
						// 取得失敗
						// 次の定義へ(エラーとしない)
						continue;
					}
				}

				// 必須チェック
				if (!CommonValidator.checkNecessary(inputValue, argInfo.bArg.getNecessary())) {

					// エラー
					((HandyBaseDto) parameter).setValidateErr(true);
					((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.REQUIRED_ERROR, argInfo.bDict.getDictNm());
					return ic.proceed();
				}

				if (inputValue != null) {

					String argType = CU.nullToStr(argInfo.bArg.getArgType());
					String inputLimit = argInfo.bArgValid.getInputLimit();
					boolean isOverwriteInputLimit = false;

					// [#2047] HT日付チェックを追加 2017.07.04 kawana Start

					if (argType.equals(ARG_TYPE_DATE)) {
						// 日付型の場合

						try {
							// 日付変換してみる

							String dateStr = inputValue.toString();
							Date checkDate = CU.stringToDate(dateStr);
							String checkDateStr = CU.dateToString(checkDate);

							// ※ stringToDateのみのチェックだと適当な数字でもdateクラスに変換されてしまう。
							// ※ 逆変換して正しい日付が取得できているかを確認している。

							if (!dateStr.equals(checkDateStr)) {
								((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.DATE_ERROR, argInfo.bDict.getDictNm());
								return ic.proceed();
							}

						} catch (ParseException e) {
							// エラー
							((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.DATE_ERROR, argInfo.bDict.getDictNm());
							return ic.proceed();
						}

						// 通常のValidateチェックはしない
						return ic.proceed();
					}

					// [#2047] HT日付チェックを追加 2017.07.04 kawana End

					if (CU.isNullOrEmpty(inputLimit)) {
						if (argType.equals(ARG_TYPE_NUMBER)) {
							// 数値型の場合は数値用の正規表現を使用
							inputLimit = INPUT_LIMIT_NUMBER;
							isOverwriteInputLimit = true;
						}
					}

					// 入力文字チェック(正規表現)
					if (!CommonValidator.checkInputLimit(inputValue, inputLimit)) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);

						String messageCd;
						if (isOverwriteInputLimit) {
							messageCd = WmsCoreMessageConst.INPUT_LIMIT_CHECK_NUMERIC_ONLY_ERROR;
						} else {
							messageCd = CU.nullToStr(argInfo.bArgValid.getLimitMessageCd());
						}
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), messageCd, argInfo.bDict.getDictNm());
						return ic.proceed();
					}

					// 最小文字数チェック
					if (!CommonValidator.checkMinChars(inputValue, nullToMinus(argInfo.bArgValid.getMinChars()))) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.MINLENGTH_ERROR,
								argInfo.bDict.getDictNm(), String.valueOf(nullToMinus(argInfo.bArgValid.getMinChars())));
						return ic.proceed();
					}

					// 最大文字数チェック
					if (!CommonValidator.checkMaxChars(inputValue, nullToMinus(argInfo.bArgValid.getMaxChars()))) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.MAXLENGTH_ERROR,
								argInfo.bDict.getDictNm(), String.valueOf(nullToMinus(argInfo.bArgValid.getMaxChars())));
						return ic.proceed();
					}

					// 桁数チェックを最大値・最小値チェックより前に順番変更 2018.04.26 kawana Start

					// 整数桁数チェック
					if (!CommonValidator.checkIntegerLength(inputValue, nullToMinus(argInfo.bArgValid.getIntegerLength()))) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.INTEGER_LENGTH_ERROR,
								argInfo.bDict.getDictNm(), String.valueOf(nullToMinus(argInfo.bArgValid.getIntegerLength())));
						return ic.proceed();
					}

					// 小数桁数チェック
					if (!CommonValidator.checkDecimalLength(inputValue, nullToMinus(argInfo.bArgValid.getDecimalLength()))) {

						// [#4103] 「小数0桁以内」のメッセージを「整数のみ」に変更 2018.03.19 kawana Start
						String messageCd;
						if (0 < CU.nullToZero(argInfo.bArgValid.getDecimalLength()).longValue()) {
							messageCd = BaseMessageConst.DECIMAL_LENGTH_ERROR;
						} else {
							messageCd = BaseMessageConst.INTEGER_ERROR;
						}

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), messageCd, argInfo.bDict.getDictNm(),
								String.valueOf(nullToMinus(argInfo.bArgValid.getDecimalLength())));
						// [#4103] 「小数0桁以内」のメッセージを「整数のみ」に変更 2018.03.19 kawana End
						return ic.proceed();
					}

					// 最小値チェック
					if (!CommonValidator.checkMinNumber(inputValue, argInfo.bArgValid.getMinNumber())) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.MIN_ERROR,
								argInfo.bDict.getDictNm(), trimZero(CU.nullToZero(argInfo.bArgValid.getMinNumber()).toString()));
						return ic.proceed();
					}

					// 最大値チェック
					if (!CommonValidator.checkMaxNumber(inputValue, argInfo.bArgValid.getMaxNumber())) {

						// エラー
						((HandyBaseDto) parameter).setValidateErr(true);
						((AbstractBase) ic.getTarget()).getErrorManager().add(new ErrorStatus(), BaseMessageConst.MAX_ERROR,
								argInfo.bDict.getDictNm(), trimZero(CU.nullToZero(argInfo.bArgValid.getMaxNumber()).toString()));
						return ic.proceed();
					}

					// 桁数チェックを最大値・最小値チェックより前に順番変更 2018.04.26 kawana End
				}
			}
		}

		return ic.proceed();
	}

	private int nullToMinus(Long value) {
		if (value == null) {
			return -1;
		}

		return value.intValue();
	}

	private String trimZero(String s) {
		if (s == null || s.length() < 2) {
			return s;
		}

		String res = StringUtils.strip(s, "0");

		if (res.startsWith(".")) {
			res = "0" + res;
		}

		if (res.endsWith(".")) {
			res = res.replace(".", "");
		}

		return res;
	}

}
