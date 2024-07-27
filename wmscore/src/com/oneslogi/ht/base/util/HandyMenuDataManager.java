package com.oneslogi.ht.base.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.LoadReferrerOption;

import com.oneslogi.base.AbstractBase;
import com.oneslogi.base.BaseContext;
import com.oneslogi.base.dbflute.cbean.BMenuCB;
import com.oneslogi.base.dbflute.cbean.BMenuGrpCB;
import com.oneslogi.base.dbflute.dto.BMenuDto;
import com.oneslogi.base.dbflute.dto.BMenuGrpDto;
import com.oneslogi.base.dbflute.dtomapper.BMenuGrpDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BMenuGrpBhv;
import com.oneslogi.base.dbflute.exentity.BMenu;
import com.oneslogi.base.dbflute.exentity.BMenuGrp;
import com.oneslogi.base.dbflute.exentity.BScreenRole;
import com.oneslogi.base.dbflute.exentity.VHtDict;
import com.oneslogi.base.dto.MenuDto;
import com.oneslogi.base.logic.common.RoleLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.dto.HandyMenuDto;

/**
 * HT画面マスタデータ管理クラス
 */
public class HandyMenuDataManager extends AbstractBase {

	// ===== 使用テーブル =====

	@Inject
	private BMenuGrpBhv BMenuGrpBhv;

	// ===== 使用ロジック =====

	@Inject
	private RoleLogic roleLogic;

	// ===== クラス変数 =====

	/**
	 * 画面マスタ関連データ
	 */
	private static Map<MenuKey, List<BMenuGrp>> menuDtoMap = new HashMap<MenuKey, List<BMenuGrp>>();

	/**
	 * キャッシュのクリア
	 */
	public static void splash() {
		menuDtoMap = new HashMap<MenuKey, List<BMenuGrp>>();
	}

	/**
	 * 画面CDから戻り先のメニューを取得
	 *
	 * @param screenCd 画面CD
	 * @return 戻り先メニュー情報
	 */
	public List<HandyMenuDto> getReturnMenuList(String screenCd) {

		MenuDto menuDto = getVisibleMenuDto();

		String menuGrpCd = null;
		for (BMenuGrpDto menuGrp : menuDto.data) {

			for (BMenuDto menu : menuGrp.getBMenuList()) {

				if (menu.getBScreen().getScreenCd().equals(screenCd)) {
					menuGrpCd = menuGrp.getMenuGrpCd();
					break;
				}
			}
		}

		if (menuGrpCd == null) {
			return new ArrayList<HandyMenuDto>();
		}

		return getMenuList(menuGrpCd);
	}

	/**
	 * 最初のメニューグループ情報を取得
	 * @return メニューグループ情報
	 */
	public List<HandyMenuDto> getMenuGrpList() {

		MenuDto menuDto = getVisibleMenuDto();

		List<HandyMenuDto> htMenuList = new ArrayList<HandyMenuDto>();
		for (BMenuGrpDto menuGrp : menuDto.data) {

			HandyMenuDto htMenuGrpDto = new HandyMenuDto();
			htMenuGrpDto.setMenuGrpCd(menuGrp.getMenuGrpCd());
			htMenuGrpDto.setMenuGrpNm(menuGrp.getVHtDict().getDictNm());

			htMenuList.add(htMenuGrpDto);
		}

		return htMenuList;
	}

	/**
	 * メニューグループCDからメニュー情報を取得
	 * @param menuGrpCd メニューグループCD
	 * @return メニュー情報
	 */
	public List<HandyMenuDto> getMenuList(String menuGrpCd) {

		MenuDto menuDto = getVisibleMenuDto();

		List<HandyMenuDto> htMenuList = new ArrayList<HandyMenuDto>();
		for (BMenuGrpDto menuGrp : menuDto.data) {

			if (menuGrp.getMenuGrpCd().equals(menuGrpCd)) {
				// 該当グループのメニュー

				for (BMenuDto menu : menuGrp.getBMenuList()) {

					HandyMenuDto htMenuDto = new HandyMenuDto();
					htMenuDto.setMenuGrpNm(menuGrp.getVHtDict().getDictNm());
					htMenuDto.setMenuGrpCd(menuGrp.getMenuGrpCd());
					htMenuDto.setMenuNm(menu.getVHtDict().getDictNm());
					htMenuDto.setUrl(menu.getUrlPath());

					htMenuList.add(htMenuDto);
				}

				break;
			}
		}

		return htMenuList;
	}

	/**
	 * ユーザに表示可能なメニューDtoを作成して返す
	 */
	private MenuDto getVisibleMenuDto() {

		final long cultureId = getCultureId();

		MenuKey key = new MenuKey(cultureId);

		// メニューデータはキャッシュからとる
		// ※データの書き換えが出来るようにキャッシュはEntityで保持
		List<BMenuGrp> menuData;
		if (menuDtoMap.containsKey(key)) {
			menuData = menuDtoMap.get(key);
		} else {
			menuData = selectMenuData();
			menuDtoMap.put(key, menuData);
		}

		MenuDto menuDto = new MenuDto();
		menuDto.data = new BMenuGrpDtoMapper().mappingToDtoList(menuData);

		// 権限はキャッシュしない
		final Set<Long> invisibleScrennIdList = roleLogic.getInvisibleScreenIdSet();
		if (invisibleScrennIdList.size() < 1) {

			return menuDto;
		}

		MenuDto visibleMenuDto = new MenuDto();

		// 割り込み権限の画面名称 (センタ・荷主ごとの画面名称)
		Map<Long, String> customDictNmMap = new HashMap<Long, String>();
		//割り込み権限抽出処理
		List<BScreenRole> bScreenRoleCustomList = null;
		if (BaseContext.getScreenRoleCustomHandler() != null) {
			bScreenRoleCustomList = CU.castList(CDI.current().select(BaseContext.getScreenRoleCustomHandler()).get().execute(null));
			for (BScreenRole screenRole : bScreenRoleCustomList) {
				if (screenRole.getBScreen() != null && screenRole.getBScreen().getVHtDict() != null) {
					customDictNmMap.put(screenRole.getScreenId(), screenRole.getBScreen().getVHtDict().getDictNm());
				}
			}
		}

		for (BMenuGrpDto menuGrp : menuDto.data) {

			List<BMenuDto> visibleMenuList = new ArrayList<BMenuDto>();

			for (BMenuDto menu : menuGrp.getBMenuList()) {

				long screenId = menu.getScreenId();

				// 非表示判定
				if (invisibleScrennIdList.contains(screenId)) {

					continue;
				}

				// 画面名の書換
				if (customDictNmMap.containsKey(screenId)) {

					String customDictNm = customDictNmMap.get(screenId);

					if (!CU.isNullOrEmpty(customDictNm)) {
						menu.getVHtDict().setDictNm(customDictNm);
					}
				}

				visibleMenuList.add(menu);
			}

			if (0 < visibleMenuList.size()) {
				// メニュー有り

				// メニューグループを新規作成してメニューを設定
				// キャッシュからとってきたMenuGrpのリストを入れ替えてしまうと別の権限にも影響するため
				// （キャッシュしなければnewの必要なし)

				BMenuGrpDto visibleMenuGrp = new BMenuGrpDto();
				visibleMenuGrp.setMenuGrpId(menuGrp.getMenuGrpId());
				visibleMenuGrp.setMenuGrpCd(menuGrp.getMenuGrpCd());
				visibleMenuGrp.setVHtDict(menuGrp.getVHtDict());
				visibleMenuGrp.setViewOrder(menuGrp.getViewOrder());

				visibleMenuGrp.setBMenuList(visibleMenuList);

				visibleMenuDto.data.add(visibleMenuGrp);
			}
		}

		return visibleMenuDto;
	}

	/**
	 * メニューグループマスタ、メニューマスタの検索
	 */
	private List<BMenuGrp> selectMenuData() {

		// ===== メニューグループ検索 =====

		BMenuGrpCB cb = BMenuGrpBhv.newMyConditionBean();
		cb.setupSelect_VHtDict(getCultureId());
		cb.query().setVisibleType_Equal("HT");
		cb.query().addOrderBy_ViewOrder_Asc();
		List<BMenuGrp> bMenuGrp = BMenuGrpBhv.selectList(cb);

		// ===== メニュー検索 =====

		LoadReferrerOption<BMenuCB, BMenu> loadReferrerOption = new LoadReferrerOption<BMenuCB, BMenu>();
		loadReferrerOption.setConditionBeanSetupper(new ConditionBeanSetupper<BMenuCB>() {
			public void setup(BMenuCB cb) {
				cb.setupSelect_VHtDict(getCultureId());
				cb.setupSelect_BScreen().withVHtDict(getCultureId());
				cb.query().addOrderBy_ViewOrder_Asc();

				setDelFlg(cb);
			}
		});
		BMenuGrpBhv.loadBMenuList(bMenuGrp, loadReferrerOption);

		// ===== メニュー用DTO作成 =====

		List<BMenuGrp> menuData = new ArrayList<BMenuGrp>();

		for (BMenuGrp menuGrp : bMenuGrp) {

			if (menuGrp.getBMenuList().size() == 0) {
				continue;
			}

			for (BMenu menu : menuGrp.getBMenuList()) {

				if (menu.getVHtDict() == null) {
					menu.setVHtDict(new VHtDict());
				}

				if (CU.isNullOrEmpty(menu.getVHtDict().getDictNm())) {
					// メニュー表示名が未設定

					// 画面名を設定
					menu.getVHtDict().setDictNm(menu.chaseBScreen().chaseVHtDict().getDictNm());
				}
			}

			menuData.add(menuGrp);
		}

		return menuData;
	}

	/**
	 * メニューのキークラス
	 */
	private static final class MenuKey {

		private long cultureId;

		public MenuKey(long cultureId) {
			this.cultureId = cultureId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (cultureId ^ (cultureId >>> 32));
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
			MenuKey other = (MenuKey) obj;
			if (cultureId != other.cultureId)
				return false;
			return true;
		}
	}
}
