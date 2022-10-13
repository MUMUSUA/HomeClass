package com.ascent.po;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private String cid;
	private Teacher teacher;
	private String ctea;
	private String cname;
	private String time;
	private String introduction;

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** full constructor */
	public Course(Teacher teacher, String ctea, String cname, String time,
			String introduction) {
		this.teacher = teacher;
		this.ctea = ctea;
		this.cname = cname;
		this.time = time;
		this.introduction = introduction;
	}

	// Property accessors

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getCtea() {
		return this.ctea;
	}

	public void setCtea(String ctea) {
		this.ctea = ctea;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

}