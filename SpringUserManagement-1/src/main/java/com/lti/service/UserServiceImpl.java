package com.lti.service;

import java.util.List;

import com.lti.dao.UserDao;

import com.lti.model.Users;

public class UserServiceImpl implements UserService{
	private UserDao dao = null;
	public UserServiceImpl(){
	}
	
	public UserServiceImpl( UserDao dao){ 
		this.dao=dao;
		
	}
	public boolean checkLogin(String username, String password){
		int result = getDao().readLogin(username, password);
		if(result ==1)
			return true;
		else
			return false;
	}
	public List<Users> findAllUsers(){
		return getDao().readAllUsers();
	}
	
	
	public boolean removeUser(String username){
		
		int result = getDao().deleteUser(username);
		if(result == 1){
			
		return true;
	}
	else{
		
		return false;
	}
		
	}
	public boolean addUser(Users user){
		
		
		 int result = getDao().createUser(user);
		 if(result==1){
			
			 return true;
		 }else{
			
			 return false;
		 }
		
	}
	public boolean updateUser(Users user) {
		
	 int result = getDao().updateUser(user);
	if(result==1){
		
		return true;
	}else{
		return false;
	}
		
	}
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
