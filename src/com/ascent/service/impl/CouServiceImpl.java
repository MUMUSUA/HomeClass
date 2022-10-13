package com.ascent.service.impl;

import java.util.List;

import com.ascent.dao.CouDAO;
import com.ascent.po.Course;
import com.ascent.service.CouService;

public class CouServiceImpl implements CouService{

	private CouDAO couDAO;

	public void setCouDAO(CouDAO couDAO) {
		this.couDAO = couDAO;
	}
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return couDAO.findAll();
	}public Course findByCid(String Cid){
		return couDAO.findByCid(Cid);
	}
	public Course findByCname(String Cname){
		return couDAO.findByCname(Cname);
	}
}
