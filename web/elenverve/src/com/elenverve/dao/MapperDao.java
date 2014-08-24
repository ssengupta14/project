package com.elenverve.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.elenverve.db.beans.UserAuthenticationBean;
import com.elenverve.dvo.CredentialsDvo;

public class MapperDao  {

	protected RowMapper<UserAuthenticationBean> userAuthenticationBeanMapper = new RowMapper<UserAuthenticationBean>(){
		
		public UserAuthenticationBean mapRow(ResultSet rs , int rowNum) throws SQLException{
			UserAuthenticationBean userAuthenticationBean = new UserAuthenticationBean();
			return userAuthenticationBean;
		}
	};	

}
