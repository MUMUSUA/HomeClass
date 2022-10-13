package com.ascent.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ascent.dao.TeaDAO;
import com.ascent.po.Teacher;


public class TeaDAOImpl extends HibernateDaoSupport implements TeaDAO{
	@SuppressWarnings("unchecked")
	public List<Teacher> findAll(){
		List list=new ArrayList();
		List l=this.getHibernateTemplate().find("from Teacher ");
		Iterator it=l.iterator();
		while(it.hasNext()){
			Teacher u=(Teacher)it.next();
			//u.setTemp4("<input type=\"checkbox\" name=\"infoid\"value=\"
			//"+u.getId()+"\">");
			list.add(u);
		}
		return list;
	}

}
