package com.java.spring.service;

import java.util.List;

import com.java.spring.model.Client;

public interface ClientService {

	 /**
	    * This is the method to be used to create
	    * a record in the Client table.
	    */
	   public void create(Client client);
	   /**
	    * This is the method to be used to list down
	    * a record from the Client table corresponding
	    * to a passed Client id.
	    */
	   public Client getClient(Integer id);
	   /**
	    * This is the method to be used to list down
	    * all the records from the Client table.
	    */
	   public List<Client> listClient();
	   /**
	    * This is the method to be used to delete
	    * a record from the Client table corresponding
	    * to a passed Client id.
	    */
	   public void delete(Integer id);
	   /**
	    * This is the method to be used to update
	    * a record into the Client table.
	    */
	   public void update(Integer id, String name);
	   /**
	    * This is the method to be used to insert
	    * a record into the Client table.
	    */

	   public void insert();

}
