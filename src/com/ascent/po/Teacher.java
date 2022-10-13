package com.ascent.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private String teaid;
	private String teaname;
	private Integer teaage;
	private String teasex;
	private String introduction;
	private String teaphone;
	private Set courses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String teaname, Integer teaage, String teasex,
			String introduction, String teaphone) {
		this.teaname = teaname;
		this.teaage = teaage;
		this.teasex = teasex;
		this.introduction = introduction;
		this.teaphone = teaphone;
	}

	/** full constructor */
	public Teacher(String teaname, Integer teaage, String teasex,
			String introduction, String teaphone, Set courses) {
		this.teaname = teaname;
		this.teaage = teaage;
		this.teasex = teasex;
		this.introduction = introduction;
		this.teaphone = teaphone;
		this.courses = courses;
	}

	// Property accessors

	public String getTeaid() {
		return this.teaid;
	}

	public void setTeaid(String teaid) {
		this.teaid = teaid;
	}

	public String getTeaname() {
		return this.teaname;
	}

	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}

	public Integer getTeaage() {
		return this.teaage;
	}

	public void setTeaage(Integer teaage) {
		this.teaage = teaage;
	}

	public String getTeasex() {
		return this.teasex;
	}

	public void setTeasex(String teasex) {
		this.teasex = teasex;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getTeaphone() {
		return this.teaphone;
	}

	public void setTeaphone(String teaphone) {
		this.teaphone = teaphone;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}