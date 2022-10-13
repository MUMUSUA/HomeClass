package com.ascent.struts2.action;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.ascent.po.Course;
import com.ascent.service.CouService;
import com.opensymphony.xwork2.ActionContext;

public class CouAction extends BaseAction{

	private String cid;
//	private CouService couService;
//	public CouService getCouService() {
//	return couService;
//}
//
//public void setCouService(CouService couService) {
//	this.couService = couService;
//}

			

			
		public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

		public String show(){
			
			List<Course> list=couService.findAll();
			//ActionContext.getContext().getSession().put("Info", list);

			for(int i=0;i<list.size();i++)
				ActionContext.getContext().put("allInfo", list);
				if(list.isEmpty())
					return "fail";
				else return "success";
		


}
		
		public String findByCid(){
			if(isNumeric(cid)==false){
				Boolean strResult2 = cid.matches(".");
				if (cid.indexOf(".")!=-1)
				{
					return "输入的应为整数";
				}

				return "输入的不是数字";}
//			else if(isNumeric(cid)=="false2")
//				return "输入应为整数";
			int num = Integer.parseInt(cid);
			if(num<=0)
				return "输入的课程号应大于0";
			Course course=couService.findByCid(cid);
			//ActionContext.getContext().getSession().put("Info", list);

				if(course==null)
				return "暂无对应课程";
				else return "success";
		


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
//public static void main(String args[]){
//	if(isNumeric("1.2")=="false")
//		System.out.println("输入的不是数字");
//	if(isNumeric("1.2")=="false2")
//		System.out.println("输入应为整数");
//	int num = Integer.parseInt("1.2");
//	if(num<=0)
//		System.out.println("输入的课程号应大于0");
//}
	}
