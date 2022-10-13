package com.ascent.service;

import java.util.List;

import com.ascent.po.Course;

public interface CouService {
	public List<Course> findAll();
	public Course findByCname(String Cname);
	public Course findByCid(String Cid);
}
