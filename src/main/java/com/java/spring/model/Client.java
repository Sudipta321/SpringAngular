package com.java.spring.model;

import java.io.Serializable;

public class Client implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -3439150580617584645L;
	int CLIENT_ID;
	String CLIENT_NAME;


	public int getCLIENT_ID() {
		return CLIENT_ID;
	}
	public void setCLIENT_ID(int cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	public String getCLIENT_NAME() {
		return CLIENT_NAME;
	}
	public void setCLIENT_NAME(String cLIENT_NAME) {
		CLIENT_NAME = cLIENT_NAME;
	}




}
