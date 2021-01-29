package com.datacompanies.dao;

import java.util.List;

import com.datacompanies.beans.BeanException;
import com.datacompanies.beans.User;


public interface UserDao {

	void createUser(User User) throws BeanException;
    
	User findUser(User User) throws BeanException;

}