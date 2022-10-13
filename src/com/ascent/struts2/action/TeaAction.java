package com.ascent.struts2.action;

import java.util.List;
import com.ascent.po.Teacher;
import com.ascent.service.TeaService;
import com.opensymphony.xwork2.ActionContext;


public class TeaAction extends BaseAction{

	
//	private TeaService teaService;
//	public TeaService getTeaService() {
//	return teaService;
//}
//
//public void setTeaService(TeaService teaService) {
//	this.teaService = teaService;
//}
//
//			

		
		
		public String show(){
			
			List<Teacher> list=teaService.findAll();
			//ActionContext.getContext().getSession().put("Info", list);

			for(int i=0;i<list.size();i++)
				ActionContext.getContext().put("allInfo", list);
				if(list.isEmpty())
					return "fail";
				else return "success";
		


}
		}