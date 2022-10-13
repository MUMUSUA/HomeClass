package com.ascent.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.ascent.dao.impl.UcDAOImpl;
import com.ascent.po.Uc;

public class UcDAOImplTest {
private UcDAOImpl uc;
private Uc u;
	@Before
	public void setUp() throws Exception {
		uc=new UcDAOImpl();
		
	}

	@Test
	public void testAdd() throws SQLException {

		u=new Uc("7","ee");
		String result1=uc.add(u);
		assertEquals("输入的不是数字", result1);
		u=new Uc("7","12.1");
		String result2=uc.add(u);
		assertEquals("输入的应为整数", result2);
		u=new Uc("7","-19");
		String result3=uc.add(u);
		assertEquals("输入的课程号应大于0", result3);
		u=new Uc("7","011");
		String result4=uc.add(u);
		assertEquals("暂无该课程号对应课程", result4);
		u=new Uc("7","001");
		String result5=uc.add(u);
		assertEquals("您已选择该课程", result5);
		u=new Uc("123","003");
		String result6=uc.add(u);
		assertEquals("选课成功", result6);
		u=new Uc("123","000");
		String result7=uc.add(u);
		assertEquals("输入的课程号应大于0", result7);

		
	}

}
