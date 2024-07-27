package com.oneslogi.ht.base.dto;

import javax.ws.rs.QueryParam;


/**
 * ログイン画面の入力情報を保持します。
 * @author hi.watanabe.mp
 *
 */
public class HandyLoginDto extends HandyBaseDto{

	// [#575] ValidateチェックのHT国際化 2017.01.18 kawana Start

	@QueryParam("user")
	private String user;

	@QueryParam("pass")
	/* 2015/05/25 INOUE UPDATE START パスワード認証なしモード追加対応 */
	private HandyLoginPasswordDto pass;
	/* 2015/05/25 INOUE UPDATE END */

	// [#575] ValidateチェックのHT国際化 2017.01.18 kawana End

	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}

	/* 2015/05/25 INOUE UPDATE START パスワード認証なしモード追加対応 */
//	public String getPass() {
//		return pass;
//	}
//	public void setPass(String pass) {
//		this.pass = pass;
//	}
	public String getPass() {
		// [#575] ValidateチェックのHT国際化 2017.01.13 kawana Start
		if (pass == null) {
			return null;
		}
		// [#575] ValidateチェックのHT国際化 2017.01.13 kawana End

		return pass.getPass();
	}
	public void setPass(String pass) {
		this.pass.setPass(pass);
	}
	public void setNeedPasswordInput(boolean needInput) {
		this.pass.setNeedInput(needInput);
	}

	public HandyLoginPasswordDto getHandyLoginPasswordDto() {
		return pass;
	}
	public void setHandyLoginPasswordDto(HandyLoginPasswordDto dto) {
		this.pass = dto;
	}
	/* 2015/05/25 INOUE UPDATE END */

}
