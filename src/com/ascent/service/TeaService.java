package com.ascent.service;

import java.util.List;

import com.ascent.po.Teacher;

public interface TeaService {
	//查询所有讲师
		public List<Teacher> findAll();
}
