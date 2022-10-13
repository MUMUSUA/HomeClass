package com.ascent.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ascent.dao.CouDAO;
import com.ascent.po.Course;
import com.ascent.po.UserInfo;

public class CouDAOImpl extends HibernateDaoSupport implements CouDAO{
	@SuppressWarnings("unchecked")
	public List<Course> findAll(){
		List list=new ArrayList();
		List l=this.getHibernateTemplate().find("from Course ");
		Iterator it=l.iterator();
		while(it.hasNext()){
			Course u=(Course)it.next();
			//u.setTemp4("<input type=\"checkbox\" name=\"infoid\"value=\"
			//"+u.getId()+"\">");
			list.add(u);
		}
		return list;
	}
	public Course findByCid(String Cid) {
		
		String sql="from Course u where u.cid="+Cid;
		
	List list=this.getHibernateTemplate().find(sql);
	if(list.size()>0){
	System.out.println("find user by cid!");
	return (Course)list.get(0);


	}
	System.out.println("failed to find user by cid!");
	return null;
	}
	
	public Course findByCname(String Cname) {
		
		String sql="from Course u where u.cname="+Cname;
		
	List list=this.getHibernateTemplate().find(sql);
	if(list.size()>0){
	System.out.println("find user by cname!");
	return (Course)list.get(0);


	}
	System.out.println("failed to find user by cname!");
	return null;
	}

}
