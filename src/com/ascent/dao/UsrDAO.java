package com.ascent.dao;

import java.util.ArrayList;
import java.util.List;

import com.ascent.po.UserInfo;

public interface UsrDAO {
//register
	public UserInfo saveUsr(UserInfo usr);
//find user by name
	public UserInfo findByUserName(String Username);
	public boolean CheckUsr(String username,String password);
	// find all users
	public List findAll();
//return rows and split page
	public int getTotalRows();
//fins data set
	public ArrayList getData(String sql,int firstRow,int maxRow);
//find users by ID
	public UserInfo findById(String id);
//delete users
	public boolean deleteUsr(String userID);
//update user information
	public boolean updateUsr(UserInfo usr);
}
