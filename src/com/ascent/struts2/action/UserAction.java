package com.ascent.struts2.action;

import java.util.List;
import com.ascent.po.UserInfo;
import com.ascent.service.UsrService;
import com.opensymphony.xwork2.ActionContext;


public class UserAction extends BaseAction{
	private String username;
	private String password;
	private String realname;
	private short    age ;
	private String email;
	private String sex;
	private String phone;
	private String address;
	private int id;
	
//	private UsrService usrService;
//	public UsrService getUsrService() {
//	return usrService;
//}
//
//public void setUsrService(UsrService usrService) {
//	this.usrService = usrService;
//}
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		}
			public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
		this.username = username;
		}
		public String login(){
			
			
//未添加Spring框架前
			//if(getUsername().equals("LMT")&& getPassword().equals("LMT")){
//				return "success";
//		}
//		return "error";

			//添加Spring框架后的代码
			System.out.println("........................"+username+password);
			if(this.usrService.checkUsr(username, password)){
				String u=username;
				String name=(String)ActionContext.getContext().getSession().put("User",u);
				return "success";}
			return "error";
			

		}
		
		public String regist(){
			if(usrService.findByUserName(username)!=null)
				return "error";
			else {
			UserInfo info=new UserInfo();
			info.setUsername(username);
			info.setPassword(password);
			info.setRealname(realname);
			info.setAge(age);
			info.setEmail(email);
			info.setPhone(phone);
			if(sex=="female") sex="女";else sex="男";
			info.setSex(sex);System.out.println(sex);
			System.out.println(address);
			info.setAddress(address);
			System.out.println("kkkkkkkkkkkk"+info.getAddress());
			
			this.usrService.saveUsr(info);
			return "success";}
		}
		
		public String show(){
			System.out.println(username);
			UserInfo u=usrService.findByUserName(username);
			this.usrService.updateUsr(u);
			ActionContext.getContext().put("info", u);
			ActionContext.getContext().getSession().put("Info", u);
			if(id==2){

				return "display";
			}
			else{
			if(u==null)
				return "fail";
			else return "success";
						}
			}
		
		@SuppressWarnings("unused")
		public String update(){
			
			UserInfo u=usrService.findByUserName(username);
			ActionContext.getContext().put("info", u);
			u.setPassword(password);
			u.setRealname(realname);
			u.setAge(age);
			u.setEmail(email);
			u.setPhone(phone);
			u.setAddress(address);
			usrService.updateUsr(u);
			if(u==null)
				return "fail";
			else return "success";
						}
		
		
		public String delete(){
			//;
			usrService.deleteUsr(username);
			if(usrService.findByUserName(username)==null)
			return "success";
			else return "error";
		}
		public static void main(String args[]){
		
		}
		

}