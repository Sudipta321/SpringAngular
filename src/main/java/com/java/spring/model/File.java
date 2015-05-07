package com.java.spring.model;

import java.io.Serializable;

public class File implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 6421022067495700168L;

	int CLIENT_ID;
	int FILE_ID;
	String FILE_NAME;
	String FEED_BACK;

	public int getCLIENT_ID() {
		return CLIENT_ID;
	}
	public void setCLIENT_ID(int cLIENT_ID) {
		CLIENT_ID = cLIENT_ID;
	}
	public int getFILE_ID() {
		return FILE_ID;
	}
	public void setFILE_ID(int fILE_ID) {
		FILE_ID = fILE_ID;
	}
	public String getFILE_NAME() {
		return FILE_NAME;
	}
	public void setFILE_NAME(String fILE_NAME) {
		FILE_NAME = fILE_NAME;
	}
	public String getFEED_BACK() {
		return FEED_BACK;
	}
	public void setFEED_BACK(String fEED_BACK) {
		FEED_BACK = fEED_BACK;
	}



}
