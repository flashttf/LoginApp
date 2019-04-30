package com.bridgelabz.Dao;

import javax.transaction.HeuristicMixedException;

import com.bridgelabz.pojo.User;

public interface InterfaceDao {
	String userRegister(User user) throws HeuristicMixedException;
	public boolean loginUser(String username,String password);
	public void changePassword(String username,String newpassword);
}
