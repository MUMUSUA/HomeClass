package com.ascent.service;

import java.util.List;

import com.ascent.po.Course;
import com.ascent.po.Uc;

public interface UcService {
	
		public Uc saveUsr (Uc uc);
	
		public List<Uc> findByUserName (String username) ;
	
		public boolean delete (int uid);
		
		public Uc find(Uc Uc);
}
