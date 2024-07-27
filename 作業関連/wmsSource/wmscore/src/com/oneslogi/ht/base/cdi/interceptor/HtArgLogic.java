package com.oneslogi.ht.base.cdi.interceptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.BArgCB;
import com.oneslogi.base.dbflute.dto.BArgDto;
import com.oneslogi.base.dbflute.dto.BArgValidDto;
import com.oneslogi.base.dbflute.dtomapper.BArgDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BArgBhv;
import com.oneslogi.base.dbflute.exentity.BArg;
import com.oneslogi.base.dto.ArgDto;
import com.oneslogi.base.dto.ArgDto.ArgData;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.AbstractWmsHtBase;

/**
 * 引数マスタ処理ロジッククラス(HT辞書使用)
 *
 * ※ 共通的な処理だが現在は「ValidateHandyInterceptor」クラスからしか使われないため
 * ※ interceptorパッケージに配置してprotectedにする
 */
class HtArgLogic extends AbstractWmsHtBase {

	// ===== 使用テーブル =====

	@Inject
	private BArgBhv bArgBhv;

	// ===== enun =====

	/**
	 * 引数マスタのキャッシュを使用するか
	 */
	protected enum UseCache {
		TRUE,
		FALSE
	}

	// ===== 内部変数 =====

	private static Map<ArgKey, ArgDto> argDtoCacheMap = new HashMap<ArgKey, ArgDto>();

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合は例外(EntityAlreadyDeletedException)をスローする。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	protected BArg getUkEntityWithDeletedCheck(BArg entity) {

		if (entity.getFuncId() == null) {
			return null;
		}

		if (CU.isNullOrEmpty(entity.getArgCd())) {
			return null;
		}

		BArgCB cb = bArgBhv.newMyConditionBean();
		cb.query().setFuncId_Equal(entity.getFuncId());
		cb.query().setArgCd_Equal(entity.getArgCd());
		return bArgBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	protected BArg getUkEntity(BArg entity) {
		return getUkEntity(entity, null);
	}

	/**
	 * ユニークキーを条件にエンティティを返す。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件
	 * @param errSts エラー時のエラー情報への設定値
	 * @return ０件の場合はNULL、それ以外の場合はエンティティ
	 */
	protected BArg getUkEntity(BArg entity, ErrorStatus errSts) {
		BArg resultEntity = null;
		try {
			resultEntity = getUkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合

			this.getErrorManager().add(errSts, BaseMessageConst.ARG_MASTER_ERROR);
		}
		return resultEntity;
	}

	/**
	 * ArgDtoの生成
	 * ※※ 権限による制御は意識しない ※※
	 * @param classCd
	 */
	protected ArgDto getArgDto(final String classCd, final String methodCd, UseCache useCache) {

		// ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※
		// ※ 現在は権限の機能が実装されていないため権限についての考慮はしない。
		// ※ PCブラウザの同様のメソッドは権限を意識しているため、(列マスタなど)
		// ※ 機能マスタの権限を実装する場合は、本メソッドにも修正が必要。
		// ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※

		if (classCd == null || methodCd == null) {
			throw new CommonException(-1, "argumnMasterError");
		}

		ArgKey key = new ArgKey(classCd, methodCd, getCultureId());

		if (useCache == UseCache.TRUE) {
			// キャッシュ使用

			if (argDtoCacheMap.containsKey(key)) {
				return argDtoCacheMap.get(key);
			}
		}

		List<BArgDto> argDtoList = selectArgList(classCd, methodCd);

		ArgDto dto = new ArgDto();

		for (BArgDto argDto : argDtoList) {

			ArgData data = new ArgData();
			data.bArg = argDto;

			data.bDict = argDto.getBDict();
			data.bDict.setDictNm(argDto.getVHtDict().getDictNm());

			// 関連テーブル「BArgValid」が存在する場合はDtoにマッピング
			if (argDto.getBArgValidAsOne() != null) {
				data.bArgValid = argDto.getBArgValidAsOne();
			} else if (argDto.getBDict().getBDictValidAsOne() != null) {
				data.bArgValid = new BArgValidDto();
				data.bArgValid.setInputLimit(argDto.getBDict().getBDictValidAsOne().getInputLimit());
				data.bArgValid.setLimitMessageCd(argDto.getBDict().getBDictValidAsOne().getLimitMessageCd());
				data.bArgValid.setMinChars(argDto.getBDict().getBDictValidAsOne().getMinChars());
				data.bArgValid.setMaxChars(argDto.getBDict().getBDictValidAsOne().getMaxChars());
				data.bArgValid.setMinNumber(argDto.getBDict().getBDictValidAsOne().getMinNumber());
				data.bArgValid.setMaxNumber(argDto.getBDict().getBDictValidAsOne().getMaxNumber());
				data.bArgValid.setIntegerLength(argDto.getBDict().getBDictValidAsOne().getIntegerLength());
				data.bArgValid.setDecimalLength(argDto.getBDict().getBDictValidAsOne().getDecimalLength());
			} else {
				data.bArgValid = new BArgValidDto();
			}

			dto.data.put(argDto.getArgCd(), data);
		}

		// 返却する値をキャッシュに保存
		argDtoCacheMap.put(key, dto);

		return dto;
	}

	/**
	 * クラス名、メソッド名指定で引数マスタのリストを取得する
	 */
	private List<BArgDto> selectArgList(final String classCd, final String methodCd) {
		BArgCB cb = bArgBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.setupSelect_BFunc();
		cb.setupSelect_BDict().withBDictValidAsOne();
		cb.setupSelect_VHtDict(getCultureId());
		cb.setupSelect_BArgValidAsOne();
		cb.query().queryBFunc().setClassCd_Equal(classCd);
		cb.query().queryBFunc().setMethodCd_Equal(methodCd);
		cb.query().addOrderBy_ArgId_Asc();

		List<BArg> bArg = bArgBhv.selectList(cb);

		BArgDtoMapper mapper = new BArgDtoMapper();
		return mapper.mappingToDtoList(bArg);
	}

	/**
	 * 引数マスタのキークラス
	 */
	private static class ArgKey {

		private String classCd;
		private String methodCd;
		private Long cultureId;

		public ArgKey(String classCd, String methodCd, Long cultureId) {
			this.classCd = CU.nullToStr(classCd);
			this.methodCd = CU.nullToStr(methodCd);
			this.cultureId = cultureId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((classCd == null) ? 0 : classCd.hashCode());
			result = prime * result + ((cultureId == null) ? 0 : cultureId.hashCode());
			result = prime * result + ((methodCd == null) ? 0 : methodCd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ArgKey other = (ArgKey) obj;
			if (classCd == null) {
				if (other.classCd != null)
					return false;
			} else if (!classCd.equals(other.classCd))
				return false;
			if (cultureId == null) {
				if (other.cultureId != null)
					return false;
			} else if (!cultureId.equals(other.cultureId))
				return false;
			if (methodCd == null) {
				if (other.methodCd != null)
					return false;
			} else if (!methodCd.equals(other.methodCd))
				return false;
			return true;
		}
	}

}