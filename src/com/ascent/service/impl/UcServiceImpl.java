package com.ascent.service.impl;

import java.util.List;

import com.ascent.dao.UcDAO;
import com.ascent.po.Course;
import com.ascent.po.Uc;
import com.ascent.service.TeaService;
import com.ascent.service.UcService;

public class UcServiceImpl implements UcService{
	private UcDAO ucDAO;

	public void setUcDAO(UcDAO ucDAO) {
		this.ucDAO = ucDAO;
	}
	public Uc saveUsr(Uc usr) {
		// TODO Auto-generated method stub
		
		return ucDAO.saveUsr(usr);
	}

	public List<Uc> findByUserName(String username) {
		// TODO Auto-generated method stub
		return ucDAO.findByUserName(username);
	}
	
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return ucDAO.delete(id);
	}
	

public Uc find(Uc Uc){
	return ucDAO.find(Uc);
}
	
}
