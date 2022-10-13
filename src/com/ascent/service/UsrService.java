package com.ascent.service;

import java.util.ArrayList;
import java.util.List;

import com.ascent.po.UserInfo;

public interface UsrService {
	//注册方法
	public UserInfo saveUsr (UserInfo usr);
	//按照姓名查询方法
	public UserInfo findByUserName (String username) ;
	//用户登录验证的方法
	public boolean checkUsr (String username, String password);
	//查询所有用户
	public List findAll();
	//返回查询所有行分页
	public int getTotalRows ();
	//查询分页设置数量的数据
	public ArrayList getData(final String sql,final int firstRow,final int maxRow);
	//按主键查询用户
	public UserInfo findById(String uid);
	//删除用户
	public boolean deleteUsr (String uid);
	//修改用户信息
	public boolean updateUsr (UserInfo usr);
}
