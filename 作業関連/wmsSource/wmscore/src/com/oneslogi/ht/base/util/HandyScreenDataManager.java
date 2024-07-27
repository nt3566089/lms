package com.oneslogi.ht.base.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BItemCB;
import com.oneslogi.base.dbflute.cbean.BScreenCB;
import com.oneslogi.base.dbflute.dto.BItemDto;
import com.oneslogi.base.dbflute.dto.BItemValidDto;
import com.oneslogi.base.dbflute.dto.BScreenDto;
import com.oneslogi.base.dbflute.dtomapper.BItemDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.BScreenDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BItemBhv;
import com.oneslogi.base.dbflute.exbhv.BScreenBhv;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dto.ItemDto;
import com.oneslogi.base.dto.ItemDto.ItemData;
import com.oneslogi.base.dto.ScreenDto;
import com.oneslogi.base.dto.ScreenDto.ScreenData;
import com.oneslogi.ht.base.AbstractWmsHtBase;

/**
 * HT画面マスタデータ管理クラス
 */
public class HandyScreenDataManager extends AbstractWmsHtBase {

	// ===== 使用テーブル =====

	@Inject
	private BScreenBhv bScreenBhv;

	@Inject
	private BItemBhv bItemBhv;

	// ===== クラス変数 =====

	/**
	 * 画面マスタ関連データ
	 */
	private static Map<ScreenKey, ScreenDto> screenDtoMap = new HashMap<ScreenKey, ScreenDto>();

	/**
	 * 項目マスタ関連データ
	 */
	private static Map<ScreenKey, ItemDto> itemDtoMap = new HashMap<ScreenKey, ItemDto>();

	/**
	 * キャッシュのクリア
	 */
	public static void splash() {
		itemDtoMap = new HashMap<ScreenKey, ItemDto>();
	}

	/**
	 * <h2>画面名称の取得.</h2>
	 * <pre>
	 * 画面マスタから画面名称を取得する。
	 * </pre>
	 * @param screenCd 画面CD
	 * @return 画面名称
	 */
	public String getScreenNm(String screenCd) {

		// 画面マスタ関連DTO取得
		ScreenDto dto = getScreenDto(screenCd);

		ScreenData screenData = dto.data.get(screenCd);

		return screenData.bDict.getDictNm();
	}

	/**
	 * <h2>項目名称の取得.</h2>
	 * <pre>
	 * 項目マスタから項目名称を取得する。
	 * </pre>
	 * @param screenCd 画面CD
	 * @param itemCd 項目CD
	 * @return 項目名称
	 */
	public String getItemNm(String screenCd, String itemCd) {

		ItemDto dto = getItemDto(screenCd);

		if (dto.data.containsKey(itemCd)) {
			return dto.data.get(itemCd).bDict.getDictNm();
		} else {
			return "";
		}
	}

	/**
	 * <h2>項目検証の取得.</h2>
	 * <pre>
	 * 辞書検証マスタまたは項目検証マスタから項目検証を取得する。
	 * </pre>
	 * @param screenCd 画面CD
	 * @param itemCd 項目CD
	 * @return 項目名称
	 */
	public BItemValidDto getItemValid(String screenCd, String itemCd) {

		ItemDto dto = getItemDto(screenCd);

		if (dto.data.containsKey(itemCd)) {
			return dto.data.get(itemCd).bItemValid;
		} else {
			return null;
		}
	}

	/**
	 * 画面マスタ関連データ取得
	 */
	private ScreenDto getScreenDto(String screenCd) {

		final long cultureId = getCultureId();

		ScreenKey key = ScreenKey.builder().screenCd(screenCd).cultureId(cultureId).build();

		if (screenDtoMap.containsKey(key)) {
			return screenDtoMap.get(key);
		}

		ScreenDto dto = selectScreenDto(screenCd);
		screenDtoMap.put(key, dto);

		return dto;
	}

	/**
	 * 項目マスタ関連データ取得
	 */
	private ItemDto getItemDto(String screenCd) {

		final long cultureId = getCultureId();

		ScreenKey key = ScreenKey.builder().screenCd(screenCd).cultureId(cultureId).build();

		if (itemDtoMap.containsKey(key)) {
			return itemDtoMap.get(key);
		}

		ItemDto dto = selectItemDto(screenCd);
		itemDtoMap.put(key, dto);

		return dto;
	}

	/**
	 * 画面マスタ関連データ検索
	 */
	private ScreenDto selectScreenDto(final String screenCd) {

		// ※※※ PCでは権限での表示・非表示設定をしているが、HTは表示・非表示の制御はないため省略

		final long cultureId = getCultureId();

		BScreenCB cb = bScreenBhv.newMyConditionBean();
		cb.setupSelect_BDict();
		cb.setupSelect_VHtDict(cultureId);
		cb.query().setScreenCd_Equal(screenCd);

		ListResultBean<BScreen> bScreen = bScreenBhv.selectList(cb);

		BScreenDtoMapper mapper = new BScreenDtoMapper();
		List<BScreenDto> simpleDto = mapper.mappingToDtoList(bScreen);
		ScreenDto dto = new ScreenDto();

		for (BScreenDto w : simpleDto) {
			ScreenData data = new ScreenData();
			data.bScreen = w;
			data.bDict = w.getBDict();
			data.bDict.setDictNm(w.getVHtDict().getDictNm());

			dto.data.put(w.getScreenCd(), data);
		}

		return dto;
	}

	/**
	 * 項目マスタ関連データ検索
	 */
	private ItemDto selectItemDto(final String screenCd) {

		// ※※※ PCでは権限での表示・非表示設定をしているが、HTは表示・非表示の制御はないため省略

		final long cultureId = getCultureId();

		BItemCB cb = bItemBhv.newMyConditionBean();
		cb.setupSelect_BDict().withBDictValidAsOne();
		cb.setupSelect_VHtDict(cultureId);
		cb.setupSelect_BItemValidAsOne();
		cb.query().queryBScreen().setScreenCd_Equal(screenCd);

		ListResultBean<BItem> bItem = bItemBhv.selectList(cb);

		BItemDtoMapper mapper = new BItemDtoMapper();
		List<BItemDto> simpleDto = mapper.mappingToDtoList(bItem);
		ItemDto dto = new ItemDto();

		// SimpleDtoよりKeyValue型のDtoに詰め替える
		for (BItemDto w : simpleDto) {
			ItemData data = new ItemData();

			data.bItem = w;
			data.bDict = w.getBDict();
			// [#4808][v3.0] 辞書の改行対応 2018.07.12 kawana Start
			// HT用に改行文字を置換
			data.bDict.setDictNm(w.getVHtDict().getDictNm().replaceAll("\\[/\\]", "\n"));
			// [#4808][v3.0] 辞書の改行対応 2018.07.12 kawana End

			// 関連テーブル「BItemValid」が存在する場合はDtoにマッピング
			if (w.getBItemValidAsOne() != null) {
				data.bItemValid = w.getBItemValidAsOne();
				w.setBItemValidAsOne(null);
			} else if (w.getBDict() != null && w.getBDict().getBDictValidAsOne() != null) {
				data.bItemValid = new BItemValidDto();
				data.bItemValid.setInputLimit(w.getBDict().getBDictValidAsOne().getInputLimit());
				data.bItemValid.setLimitMessageCd(w.getBDict().getBDictValidAsOne().getLimitMessageCd());
				data.bItemValid.setMinChars(w.getBDict().getBDictValidAsOne().getMinChars());
				data.bItemValid.setMaxChars(w.getBDict().getBDictValidAsOne().getMaxChars());
				data.bItemValid.setMinNumber(w.getBDict().getBDictValidAsOne().getMinNumber());
				data.bItemValid.setMaxNumber(w.getBDict().getBDictValidAsOne().getMaxNumber());
				data.bItemValid.setIntegerLength(w.getBDict().getBDictValidAsOne().getIntegerLength());
				data.bItemValid.setDecimalLength(w.getBDict().getBDictValidAsOne().getDecimalLength());
			}

			dto.data.put(w.getItemCd(), data);
		}

		// ===== データ削減 =====

		for (ItemData data : dto.data.values()) {
			data.bItem.getBDict().setBDictValidAsOne(null);
		}

		return dto;
	}

	/**
	 * 画面のキークラス
	 */
	private static final class ScreenKey {

		private String screenCd;
		private long cultureId;

		private ScreenKey() {
		}

		private ScreenKey(Builder builder) {
			this.screenCd = builder.screenCd;
			this.cultureId = builder.cultureId;
		}

		public static Builder builder() {
			return new Builder();
		}

		public static class Builder {

			private String screenCd;
			public long cultureId;

			public Builder screenCd(String screenCd) {
				this.screenCd = screenCd;
				return this;
			}

			public Builder cultureId(long cultureId) {
				this.cultureId = cultureId;
				return this;
			}

			public ScreenKey build() {
				return new ScreenKey(this);
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (cultureId ^ (cultureId >>> 32));
			result = prime * result + ((screenCd == null) ? 0 : screenCd.hashCode());
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
			ScreenKey other = (ScreenKey) obj;
			if (cultureId != other.cultureId)
				return false;
			if (screenCd == null) {
				if (other.screenCd != null)
					return false;
			} else if (!screenCd.equals(other.screenCd))
				return false;
			return true;
		}
	}
}
