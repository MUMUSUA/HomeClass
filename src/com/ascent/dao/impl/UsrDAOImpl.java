package com.ascent.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
//import org.apache.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
//import org.springframework.*;
import org.springframework.orm.hibernate3.support.*;
import org.springframework.orm.hibernate3.HibernateCallback;
import com.ascent.dao.UsrDAO;
import com.ascent.po.UserInfo;
import com.ascent.util.AccessDB;
public class UsrDAOImpl extends HibernateDaoSupport implements UsrDAO{
private static final Logger LOGGER=LogManager.getLogger("UsrDAOImpl.class");
	
public UserInfo saveUsr(UserInfo usr){
	try{
		this.getHibernateTemplate().save(usr);
		LOGGER.debug("save user to database success!");
		return usr;
	}catch(Exception e){
		LOGGER.debug("save failed!!!");
		e.printStackTrace();}
		return null;
	}
	

	
	public UserInfo findByUserName(String Username) {
		
		String sql="from UserInfo u where u.username="+Username;
		
	List list=this.getHibernateTemplate().find(sql);
	if(list.size()>0){
	LOGGER.debug("find user by username!");
	return (UserInfo)list.get(0);


	}
	LOGGER.debug("failed to find user by username!");
	return null;
	}
	
	
	public boolean CheckUsr(String username,String password){
		System.out.println("????????????????"+username+password);
		String hql="from UserInfo as u where u.username='"+username+"' and u.password= '"+password+"'";//字符串要用引号
    	List<UserInfo> list=this.getHibernateTemplate().find(hql);
    	if(list.size()>0){
    		
    		return true;
    	}
    	else return false; 
}

	public String CheckUser(String username,String password) throws SQLException{
		if(username.trim()==""||username.trim()==null){
			return "用户名输入为空";
		}else if(password.trim()==""||password.trim()==null){
			return "密码输入为空";
		}
		else{
		System.out.println("????????????????"+username+password);
		AccessDB db=new AccessDB();
		Connection conn=db.getConnection();
		String sql = "select password from FuDao.dbo.[UserInfo] where username='"+username+"' and password='"+ password + "'";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      if(rs.next()){
      
          return "登陆成功";   
      }
      else{
        return "用户名或密码错误";            
      }
	
		
//		String hql="from UserInfo as u where u.username='"+username+"' and u.password= '"+password+"'";//字符串要用引号
//    	List<UserInfo> list=this.getHibernateTemplate().find(hql);
//    	if(list.size()>0){
//    		
//    		return "登陆成功";
//    	}
//    	else return "用户名或密码错误"; 
		}
}
	
@SuppressWarnings("unchecked")
public List findAll(){
	List list=new ArrayList();
	List l=this.getHibernateTemplate().find("from UserInfo u oeder by u.id");
	Iterator it=l.iterator();
	while(it.hasNext()){
		UserInfo u=(UserInfo)it.next();
		//u.setTemp4("<input type=\"checkbox\" name=\"infoid\"value=\"
		//"+u.getId()+"\">");
		list.add(u);
	}
	return list;
}

public int getTotalRows(){
	String sql="from UserInfo u order by u.id";
	int totalRows=this.getHibernateTemplate().find(sql).size();
	LOGGER.debug("return the number of users!");
	return totalRows;
}

public ArrayList getData(final String sql,final int firstRow,final int maxRow)
{return (ArrayList)this.getHibernateTemplate().executeFind(new HibernateCallback(){


	public Object doInHibernate(Session session) throws HibernateException,
			SQLException {
		Query q=session.createQuery(sql);
		q.setFirstResult(firstRow);
		q.setMaxResults(maxRow);
		ArrayList data=(ArrayList)q.list();
		LOGGER.debug("Return the list of users!");
		return data;
	}
});
	}

public boolean deleteUsr(String username){
	UserInfo u=(UserInfo)this.getHibernateTemplate().load(UserInfo.class, new String(username));
	this.getHibernateTemplate().delete(u);
	return true;
}

public UserInfo findById(String uid){
	UserInfo u=(UserInfo)(this.getHibernateTemplate().find("from UserInfo u where u.id=?",
		 new Integer(uid))).get(0);
 LOGGER.debug("find user by id");
	return u;
}

public boolean updateUsr(UserInfo usr){
	this.getHibernateTemplate().saveOrUpdate(usr);
	LOGGER.debug("Update user message success!");
	return true;
}

public static void main(String args[]){
	UsrDAOImpl dao=new UsrDAOImpl();
	boolean usr=dao.CheckUsr("123","123");
	System.out.println(usr);
}
}
