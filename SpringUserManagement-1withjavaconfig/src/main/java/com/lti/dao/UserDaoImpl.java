package com.lti.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Users;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate template ;

	public UserDaoImpl() {
		
	}
	
	public UserDaoImpl(  JdbcTemplate template){ 
		this.template= template;
		
		
	}
private static final String SELECT_users_RECORD = "Select * from users";
	private static final String INSERT_users_RECORD ="Insert Into users(username,password,firstname,lastname,mobilenumber) Values (?,?,?,?,?)";
	private static final String DELETE_users_RECORD ="Delete From users Where username=?";
	private static final String UPDATE_users_RECORD ="Update users Set firstname=?,lastname=?,mobilenumber=? Where username=?";
	private static final String  CHECK_LOGIN ="Select * from users where username=? and password=?";
	
	


	public List<Users> readAllUsers() {
		
		 List<Users> list = getTemplate().query(SELECT_users_RECORD, new UserRowMapper());
		 return list;
	}

	public int deleteUser(String username) {

		int result = 	getTemplate().update(DELETE_users_RECORD,username);
		return result;
	
	}


	public int createUser(Users user) {
		// TODO Auto-generated method stub
		 int result =  getTemplate().update(INSERT_users_RECORD,user.getUsername(),user.getPassword(),user.getFirstname(),user.getLastname(),user.getMobilenumber());
			return result;
		
	
	}


	public int updateUser(Users user) {
		int result = getTemplate().update(UPDATE_users_RECORD,user.getFirstname(),user.getLastname(),user.getMobilenumber(),user.getUsername());
		return result;
		
	}


	public int readLogin(String username, String password) {

		List<Users> list= template.query(CHECK_LOGIN,new Object[]{ username, password},new UserRowMapper());
		return list!=null?list.size():0;
	}
	
		
		
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	
	
		
	}



	
	
	
	
	
	
	














//private static final String  CHECK_LOGIN ="Select * from users where username=? and password=?";
//template.query(CHECK_LOGIN,new Object[]{username,password},new Uses;
//return 0;	


