package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMDepositProduct;

/**
 * The entity of m_deposit_product.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MDepositProduct extends BsMDepositProduct {

    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;
    // ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(編集)より追加 2024.7.9 張 Add [S]
    //得意先名称
    private String accountNm;
    
    //荷主ID
    private Long clientId; 
    //センタCD
    private String centerCd;
    
    //センタ名称
    private String centerNm;
    
    //個体管理区分名称
    private String idManagTypeNm;
    
    //削除フラグ名称
    private String delFlgNm;

	public String getAccountNm() {
		return accountNm;
	}

	public void setAccountNm(String accountNm) {
		this.accountNm = accountNm;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getCenterCd() {
		return centerCd;
	}

	public void setCenterCd(String centerCd) {
		this.centerCd = centerCd;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public String getIdManagTypeNm() {
		return idManagTypeNm;
	}

	public void setIdManagTypeNm(String idManagTypeNm) {
		this.idManagTypeNm = idManagTypeNm;
	}

	public String getDelFlgNm() {
		return delFlgNm;
	}

	public void setDelFlgNm(String delFlgNm) {
		this.delFlgNm = delFlgNm;
	}
	// ミドリ安全様向けカスタマイズ対応 預り商品マスタメンテナンス(編集)より追加 2024.7.9 張 Add [E]
}
