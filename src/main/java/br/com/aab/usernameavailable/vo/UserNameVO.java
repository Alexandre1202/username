package br.com.aab.usernameavailable.vo;

import java.io.Serializable;

public class UserNameVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1242948814073431201L;

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
