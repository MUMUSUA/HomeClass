package com.ascent.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.ascent.dao.UsrDAO;
import com.ascent.po.UserInfo;
import com.ascent.service.UsrService;

public class UsrServiceImpl implements UsrService{
private UsrDAO usrDAO;


public void setUsrDAO(UsrDAO usrDAO) {
	this.usrDAO = usrDAO;
}

public UserInfo saveUsr(UserInfo usr) {
	// TODO Auto-generated method stub
	
	return usrDAO.saveUsr(usr);
}

public UserInfo findByUserName(String username) {
	// TODO Auto-generated method stub
	return usrDAO.findByUserName(username);
}

public boolean checkUsr(String username, String password) {
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!"+username+password);
	// TODO Auto-generated method stub
	return usrDAO.CheckUsr(username, password);
}

public List findAll() {
	// TODO Auto-generated method stub
	return usrDAO.findAll();
}

public int getTotalRows() {
	// TODO Auto-generated method stub
	return usrDAO.getTotalRows();
}

public ArrayList getData(String sql, int firstRow, int maxRow) {
	// TODO Auto-generated method stub
	return usrDAO.getData(sql, firstRow, maxRow);
}

public UserInfo findById(String uid) {
	// TODO Auto-generated method stub

	return usrDAO.findById(uid);
}

public boolean deleteUsr(String uid) {
	// TODO Auto-generated method stub
	return usrDAO.deleteUsr(uid);
}

public boolean updateUsr(UserInfo usr) {
	// TODO Auto-generated method stub
	return usrDAO.updateUsr(usr);
}

}
