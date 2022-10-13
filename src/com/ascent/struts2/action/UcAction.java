package com.ascent.struts2.action;

import java.util.List;

import com.ascent.po.Uc;
import com.ascent.service.UcService;
import com.opensymphony.xwork2.ActionContext;

public class UcAction{
	/**
	 * 
	 */
	private UcService ucService;
	private static final long serialVersionUID = 1L;
	private String username;
	private int type;
	private String Cname;
	private String Ctea;
	private String Cid;
	private String time;
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	private int id;
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

		public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCtea() {
		return Ctea;
	}

	public void setCtea(String ctea) {
		Ctea = ctea;
	}

	public String getCid() {
		return Cid;
	}

	public void setCid(String cid) {
		Cid = cid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	//
//		private UcService ucService;
//		public UcService getUcService() {
//		return ucService;
	//}
	//
	//public void setUcService(UcService ucService) {
//		this.ucService = ucService;
	//}
	//



	public String show(){
				
				List<Uc> list=ucService.findByUserName(username);
				ActionContext.getContext().getSession().put("Info", list);
				for(int i=0;i<list.size();i++)
					ActionContext.getContext().put("allInfo", list);
					if(list.isEmpty())
						return "fail";
					else if(type==2)
						return "success1";
					else return "success";
			

	}

	public String delete(){
		

		boolean flag=ucService.delete(id);
		if(flag)
		return "success";
		else return "error";

	}

	public String save(){
		Uc uc=new Uc(username,Cid,Cname,Ctea, time);
		ucService.saveUsr(uc);
		return "success";
	}

}
