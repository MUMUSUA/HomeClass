package com.ascent.dao;

import java.util.List;

import com.ascent.po.Course;

public interface CouDAO {
	public List<Course> findAll();
	public Course findByCname(String Cname);
	public Course findByCid(String Cid);
}
