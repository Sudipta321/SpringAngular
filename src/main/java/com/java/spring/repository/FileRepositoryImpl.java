package com.java.spring.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.java.spring.model.File;

public class FileRepositoryImpl extends JdbcDaoSupport implements FileRepository{



/*
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {

		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
	}


	public DataSource getDataSource() {
		return dataSource;
	}
*/
// Pls do code change here
		public List<File> listFile(int clientId) {

			return getJdbcTemplate().query("select * from FILE_N where CLIENT_ID =" + clientId,new RowMapper<File>(){
				public File mapRow(ResultSet rs, int rownumber) throws SQLException {
					File f1=new File();
					f1.setCLIENT_ID(rs.getInt("CLIENT_ID"));
					f1.setFILE_ID(rs.getInt("FILE_ID"));
					f1.setFILE_NAME(rs.getString("FILE_NAME"));


					return f1;
				}
			});

		}


}
