package com.ascent.struts2.action;

import com.ascent.service.CouService;
import com.ascent.service.TeaService;
import com.ascent.service.UcService;
import com.ascent.service.UsrService;
import com.opensymphony.xwork2.ActionSupport;


public class BaseAction extends ActionSupport{
protected UsrService usrService;
protected TeaService teaService;
protected CouService couService;
protected UcService ucService;
public UsrService getUsrService() {
	return usrService;
}

public void setUsrService(UsrService usrService) {
	this.usrService = usrService;
	System.out.println("userService==="+usrService);
}

public TeaService getTeaService() {
	return teaService;
}

public void setTeaService(TeaService teaService) {
	this.teaService = teaService;
	System.out.println("teaService==="+teaService);
}

public CouService getCouService() {
	return couService;
}

public void setCouService(CouService couService) {
	this.couService = couService;
	System.out.println("couService==="+couService);
}


public UcService getUcService() {
	return ucService;
}

public void setUcService(UcService ucService) {
	this.ucService = ucService;
	System.out.println("ucService==="+ucService);
}

}
