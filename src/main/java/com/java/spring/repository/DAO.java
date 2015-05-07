package com.java.spring.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.java.spring.model.Client;
import com.java.spring.model.File;


@Repository
public class DAO {

	public static DataSource dataSource;
    public static JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
    	this.dataSource = dataSource;
    	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public DataSource getDataSource()
    {
    	return this.dataSource;
    }



    public void insertrecord(){
	    String sql = "INSERT INTO CLIENT VALUES (3,'A')";
	    try{
	    	jdbcTemplate.update(sql);
	    }
	    catch(Exception e)
	    {
	    	System.out.print(e.toString());
	    }
    }

    public List<Client> clientlist(){
    	 return jdbcTemplate.query("select * from CLIENT",new RowMapper<Client>(){
		      public Client mapRow(ResultSet rs, int rownumber) throws SQLException {
		    	  Client c=new Client();
		    	 c.setCLIENT_ID(rs.getInt(1));
		         c.setCLIENT_NAME(rs.getString(2));

		          return c;
		      }
		      });
    }


    public List<File> fileList(int clientId){
   	 return jdbcTemplate.query("select * from FILE_N where CLIENT_ID =" + clientId,new RowMapper<File>(){
		      public File mapRow(ResultSet rs, int rownumber) throws SQLException {
		    	  File f=new File();
		    	  f.setCLIENT_ID(rs.getInt(1));
		    	  f.setFILE_ID(rs.getInt(2));
		    	  f.setFILE_NAME(rs.getString(3));

		          return f;
		      }
		      });
   }


}
