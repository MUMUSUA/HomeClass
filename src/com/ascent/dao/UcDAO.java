package com.ascent.dao;

import java.util.List;

import com.ascent.po.Course;
import com.ascent.po.Uc;

public interface UcDAO {
		public Uc saveUsr(Uc uc);
		public List<Uc> findByUserName(String Username);
		public boolean delete(int id);
		public Uc find(Uc Uc);
}
