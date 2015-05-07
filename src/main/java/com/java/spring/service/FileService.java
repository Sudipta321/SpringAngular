package com.java.spring.service;

import java.util.List;

import com.java.spring.model.File;

public interface FileService {

	/**
	    * This is the method to be used to list down
	    * all the records from the File table.
	    */
	 public List<File> listFile(int clientId);


}
