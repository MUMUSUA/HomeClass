package com.ascent.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.ascent.dao.UcDAO;
import com.ascent.po.Course;
import com.ascent.po.Uc;
import com.ascent.po.UserInfo;
import com.ascent.service.CouService;
import com.ascent.util.AccessDB;

public class UcDAOImpl extends HibernateDaoSupport implements UcDAO{
	private static final Logger LOGGER=LogManager.getLogger("UcDAOImpl.class");
	CouService couService;
	public Uc saveUsr(Uc usr){
		try{
			this.getHibernateTemplate().save(usr);
			LOGGER.debug("save user to database success!");
			return usr;
		}catch(Exception e){
			LOGGER.debug("save failed!!!");
			e.printStackTrace();}
			return null;
		}
		

		
		public List<Uc> findByUserName(String Username) {

			String sql="from Uc u where u.username="+Username;
			List list=new ArrayList();
		List l=this.getHibernateTemplate().find(sql);
		Iterator it=l.iterator();
		while(it.hasNext()){
			Uc u=(Uc)it.next();
			//u.setTemp4("<input type=\"checkbox\" name=\"infoid\"value=\"
			//"+u.getId()+"\">");
			list.add(u);
		}
		return list;
		}
		
		public boolean delete(int id){
			//Uc u=(Uc)this.getHibernateTemplate().load(Uc.class, new Integer(id));
			Uc u=(Uc)this.getHibernateTemplate().load(Uc.class,id);
			this.getHibernateTemplate().delete(u);
			return true;
		}
		public static void main(String args[]){
		
			UcDAOImpl d=new UcDAOImpl();
			d.delete(3);
			
		}
		
		public Uc find(Uc Uc) {
			System.out.println(Uc.getCid()+Uc.getUsername()+Uc.getCname());
			
		String sql="from Uc as u where u.username='"+Uc.getUsername()+"' and u.cid= '"+Uc.getCid()+"'";		
		List list=this.getHibernateTemplate().find(sql);
		if(list.size()>0){
		System.out.println("find user by cid!");
		return (Uc)list.get(0);


		}
		System.out.println("failed to find user by cid!");
		return null;
		}
		
		
		
		public String add(Uc uc) throws SQLException{
			if(isNumeric(uc.getCid())==false){
				Boolean strResult2 = uc.getCid().matches(".");
				if (uc.getCid().indexOf(".")!=-1)
				{
					return "输入的应为整数";
				}

				return "输入的不是数字";}
//			else if(isNumeric(cid)=="false2")
//				return "输入应为整数";
			int num = Integer.parseInt(uc.getCid());
			if(num<=0)
				return "输入的课程号应大于0";
			
			AccessDB db=new AccessDB();
			Connection conn=db.getConnection();
			String sql = "select * from FuDao.dbo.[Course] where Cid='"+uc.getCid()+"'";
	      Statement stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery(sql);
	      if(rs.next()){
	    	  String sql1 = "select * from FuDao.dbo.[UC] where username='"+uc.getUsername()+"' and Cid='"+ uc.getCid() + "'";
		      Statement stmt1 = conn.createStatement();
		      ResultSet rs1 = stmt.executeQuery(sql1);
		      if(rs1.next())
		     return "您已选择该课程";
		    	  else
	          return "选课成功";   
	      }
	      else{
	        return "暂无该课程号对应课程";            
	      }
			//Course course=couService.searchByCid(uc.getCid());
			//ActionContext.getContext().getSession().put("Info", list);

		


}
		/**
	     * 利用正则表达式判断字符串是否是数字
	     * @param str
	     * @return
	     */
	    public Boolean isNumeric(String str){
	    	Boolean strResult = str.matches("-?[0-9]+[0-9]");  
	        return strResult;
//	    	if(strResult == true) {  
//	    		Boolean strResult2 = str.matches(".");  
//		       //Pattern pattern = Pattern.compile(".");
//	          // Matcher isNum = pattern.matcher(str);
////	           if( isNum.matches() )
////               return "false2";
////               else return "true";
//	    		if(strResult2)return "false2";
//	    		else return "true";
           
//		} else return "false";
	         

	    }
		
}
