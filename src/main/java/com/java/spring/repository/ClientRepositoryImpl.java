package com.java.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.java.spring.model.Client;
@Repository
public class ClientRepositoryImpl  extends JdbcDaoSupport implements ClientRepository{

	/*   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		  this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	      this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}


	public DataSource getDataSource() {
		return dataSource;
	}*/



	public void create(Client client) {
		// TODO Auto-generated method stub

	}

	public Client getClient(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	// Pls do code change here
	public List<Client> listClient() {
		return getJdbcTemplate().query("select * from CLIENT",new RowMapper<Client>(){
		      public Client mapRow(ResultSet rs, int rownumber) throws SQLException {
		    	  Client c=new Client();
		    	 c.setCLIENT_ID(rs.getInt("CLIENT_ID"));
		         c.setCLIENT_NAME(rs.getString("CLIENT_NAME"));

		          return c;
		      }
		      });
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	public void update(Integer id, String name) {
		// TODO Auto-generated method stub

	}

	// Pls do code change here
	public void insert() {

		String sql = "INSERT INTO CLIENT VALUES (3,'A')";
	    try{
	    	getJdbcTemplate().update(sql);
	    }
	    catch(Exception e)
	    {
	    	System.out.print(e.toString());
	    }
	}

}
