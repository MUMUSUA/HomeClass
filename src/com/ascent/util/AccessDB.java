package com.ascent.util;


import java.sql.*;

public class AccessDB {
	private static  Connection conn=null;
	private static Statement stmt=null;

	
public AccessDB() {
	
		conn=this.getConnection();
		try {
			
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	public void AddUser(UserInfo user) throws SQLException
//	{   
//		String sql="INSERT MyWeb.dbo.[UserInfo](username,password) VALUES('"
//			+user.getUsername()+"','"+user.getPassword()+"')";
//		stmt.executeUpdate(sql);
//	}
//
//	public UserInfo searchByUsername(String username) throws SQLException
//	{    
//		UserInfo user=new UserInfo();
//		String sql="select * from MyWeb.dbo.[UserInfo] where username='"+username+"'";
//		ResultSet rs=stmt.executeQuery(sql);
//		while(rs.next())
//		{
//			String name=rs.getString("username");
//			if(name.equals(username))
//			{
//				
//				user.setUsername(name);
//				user.setPassword(rs.getString("password"));
//				if(rs!=null)
//					rs.close();
//				return user;
//			}
//		}
//		return null;	
//	}
//
//	public boolean exists(String username)
//	{
//		boolean rtn=false;
//		try {
//			if(searchByUsername(username)!=null)
//				rtn=true;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	return rtn;
//	}
//		public boolean Login(UserInfo user) throws SQLException{
//			String username=user.getUsername();
//			String password=user.getPassword();
//			String sql = "select password from MyWeb.dbo.[UserInfo] where username='"+username+"' and password='"+ password + "'";
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            if(rs.next()){
//            
//                return true;   
//            }
//            else{
//              return false;            
//            }
//           
//		}
//		public void Add(Board u) throws SQLException
//		{
//			String sql="INSERT MyWeb.dbo.[Board] VALUES('"
//				+u.getUsername()+"','"+u.getMessage()+"','"+u.getDate()+"')";
//			stmt.executeUpdate(sql);
//		}
//		
//		public void Delete(Board u) throws SQLException
//		{
//			String sql="delete from MyWeb.dbo.[Board] (username,message)VALUES('"
//				+u.getUsername()+"',+u.getMessage()')";
//			stmt.executeUpdate(sql);
//		}
//		
	public 	static Connection getConnection()
		{
			String driverClass="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url="jdbc:sqlserver://localhost:1433";

			String username = "sa";
			String password = "20011021";
			try {
				Class.forName(driverClass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}	 
			try {
				conn = DriverManager.getConnection(url, username, password);//��������
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.print("FAILURE!");
			}	
			
			return conn;		
		}

		
		
		public ResultSet executeQuery(String sql){
			ResultSet rs;
			try{
			
			rs=stmt.executeQuery(sql);
			}
			catch(Exception e){
				return null;
			}
			return rs;
		}

		
	protected void finalize()   
    {
		try {
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}
			catch (SQLException e) {
		e.printStackTrace();
		}
    }
	
	

	
//	
//	public static void main(String[] args) {
//		
//		try {
//			AccessDB dbUtil=new AccessDB();
//		
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
	}

