package com.ascent.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.ascent.dao.impl.UsrDAOImpl;

public class UsrDAOImplTest {
	private UsrDAOImpl u;

	@Before
	public void setUp() throws Exception {
		u=new UsrDAOImpl();
	}



	@Test
	public void testCheckUser() throws SQLException {
		String result1=u.CheckUser("","7");
		assertEquals("用户名输入为空", result1);
		String result2=u.CheckUser("7","");
		assertEquals("密码输入为空", result2);
		String result3=u.CheckUser("Vernon","19980218");
		assertEquals("登陆成功", result3);
		String result4=u.CheckUser("11","13");
		assertEquals("用户名或密码错误", result4);
		
		//fail("Not yet implemented");
	}



}
