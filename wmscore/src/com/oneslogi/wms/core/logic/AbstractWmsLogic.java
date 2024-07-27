package com.oneslogi.wms.core.logic;

import java.math.BigDecimal;

import com.oneslogi.wms.core.AbstractWmsBase;

public abstract class AbstractWmsLogic extends AbstractWmsBase {

	/**
	 * ログインユーザが現在作業しているセンタのセンタIDを取得
	 * @return 作業中のセンタCD
	 */
	public Long getCenterClassCondition() {
		return super.getCenterId();
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public Long getClientId() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public String getClientCd() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public String getClientNm() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public Long getCenterId() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public String getCenterCd() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public String getCenterNm() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void appendWorkLogWorkCd(String workCd) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void setWorkLogClientCd(String clientCd) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void setWorkLogCenterCd(String centerCd) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void setWorkLogTraceItem(String traceItem) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void setWorkLogQty(Object workQty) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana Start

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public BigDecimal getWorkLogQty() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}

	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void addWorkLogQty(Object workQty) {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}


	/**
	 * ロジッククラスでは使用できません
	 * @deprecated
	 */
	@Override
	public void skipWorkLogEnd() {
		throw new RuntimeException("Logicクラスから当メソッドを実行する事はできません。Resourceクラスから実行して下さい。");
	}
	// [#3712] WAS連携用に作業中数をコア部で管理 2018.02.27 kawana End

}
