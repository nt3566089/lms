package com.oneslogi.ht.base.enums;

public enum HtLoginMode {
	SSO("1"),
	MAC("2"),
	PASS("3");

	private String htLoginMode;

	HtLoginMode(String htLoginMode) {
		this.htLoginMode = htLoginMode;
	}

	@Override
	public String toString() {
		return htLoginMode;
	}

}
