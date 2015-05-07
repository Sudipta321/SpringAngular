package com.java.spring.repository;

import java.util.List;

import javax.sql.DataSource;

import com.java.spring.model.File;


public interface FileRepository {


	/**
	    * This is the method to be used to list down
	    * all the records from the File table.
	    */
	 public List<File> listFile(int clientId);

}
