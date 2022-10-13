package com.ascent.service.impl;

import java.util.List;

import com.ascent.dao.TeaDAO;
import com.ascent.po.Teacher;
import com.ascent.service.TeaService;

public class TeaServiceImpl implements TeaService{
	private TeaDAO teaDAO;


	public void setTeaDAO(TeaDAO teaDAO) {
		this.teaDAO = teaDAO;
	}
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teaDAO.findAll();
	}
}
