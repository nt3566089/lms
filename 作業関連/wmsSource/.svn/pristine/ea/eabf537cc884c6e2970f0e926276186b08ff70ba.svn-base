package com.oneslogi.ht.base.cdi.interceptor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.exception.SQLFailureException;

import com.oneslogi.base.dbflute.exentity.BCulture;
import com.oneslogi.base.logic.common.CultureLogic;
import com.oneslogi.ht.base.AbstractWmsHtBase;

/**
 * jsp遷移ロジッククラス
 */
class JspForwardLogic extends AbstractWmsHtBase {

	// ===== 定数 =====

	private static final String EXTENSION = ".jsp";

	// ===== 使用ロジック =====

	@Inject
	private CultureLogic cultureLogic;

	// ===== ローカル変数 =====

	/** カルチャ文字列のリストマップ(キー:カルチャID) */
	private static Map<Long, List<String>> paddingStrMap = new HashMap<Long, List<String>>();

	/**
	 * キャッシュのクリア
	 */
	public static void splash() {
		paddingStrMap = new HashMap<Long, List<String>>();
	}

	/**
	 * <h2>ログインユーザのカルチャに応じたjspに遷移.</h2>
	 * <pre>
	 * ログインユーザのカルチャに応じたjspに遷移する。
	 * ログインユーザのカルチャCDが「ja-JP」の場合、
	 * 以下の優先順位でjspへ遷移する。
	 *
	 * 1. (遷移先URL)_ja_JP.jsp
	 * 2. (遷移先URL)_ja.jsp
	 * 3. (遷移先URL).jsp
	 *
	 * </pre>
	 * @param url 遷移先jspのURL
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException 最終的なフォワード先となるリソースがこの例外をスローした場合
	 * @throws IOException 最終的なフォワード先となるリソースがこの例外をスローした場合
	 */
	protected void forward(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// カルチャCDからjspファイルの末尾の文字列を取得
		List<String> cultureCdList = getPaddingStr();
		if (cultureCdList == null || cultureCdList.size() < 1) {
			request.getRequestDispatcher(url).forward(request, response);
			return;
		}

		// .jspを除いたurl
		String basePath = StringUtils.removeEnd(url, EXTENSION);

		for (String cultureCd : cultureCdList) {

			// カルチャCDに対応したjspのurlを作成
			String cultureUrl = new StringBuilder(basePath).append("_").append(cultureCd).append(EXTENSION).toString();

			// ファイルの存在確認
			File file = new File(getServletContext().getRealPath(cultureUrl));
			if (file.exists()) {
				// カルチャ用のjspファイルあり

				// カルチャ用jspに遷移
				request.getRequestDispatcher(cultureUrl).forward(request, response);
				return;
			}
		}

		// カルチャ用のjspがないため引数のurlに遷移
		request.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * カルチャCDからjspの後ろに付加する文字列を取得する。
	 */
	private List<String> getPaddingStr() {

		long cultureId = getCultureId();

		if (paddingStrMap.containsKey(cultureId)) {
			// キャッシュから取得
			return paddingStrMap.get(cultureId);
		}

		String cultureCd = getCultureCd(cultureId);
		if (cultureCd == null) {
			return null;
		}

		List<String> list = new ArrayList<String>();
		cultureCd = cultureCd.replaceAll("-", "_");
		list.add(cultureCd);

		int loopCount = 1;
		// 無限ループ防止(最大10回まで)
		while (loopCount < 10) {

			int index = cultureCd.lastIndexOf("_");
			if (index < 1) {
				break;
			}

			cultureCd = cultureCd.substring(0, index);
			list.add(cultureCd);

			loopCount++;
		}

		// キャッシュ
		paddingStrMap.put(cultureId, list);

		return list;
	}

	/**
	 * カルチャCDを取得
	 */
	private String getCultureCd(long cultureId) {

		BCulture entity = new BCulture();
		entity.setCultureId(cultureId);

		BCulture culture = null;
		try {
			culture = cultureLogic.getPkEntity(entity);
		} catch (SQLFailureException e) {
			// SQL接続エラーの場合は何もしない
			// ※ DB未接続の致命的エラー画面を表示に対応するためcatch節が必要
		}

		if (culture == null) {
			return null;
		}

		return culture.getCultureCd();
	}
}