package com.ascent.po;

/**
 * Uc entity. @author MyEclipse Persistence Tools
 */

public class Uc implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String cid;
	private String cname;
	private String ctea;
	private String time;

	// Constructors

	/** default constructor */
	public Uc() {
	}

	/** full constructor */
	public Uc(String username, String cid, String cname, String ctea,
			String time) {
		this.username = username;
		this.cid = cid;
		this.cname = cname;
		this.ctea = ctea;
		this.time = time;
	}
	
	public Uc(String username, String cid) {
		this.username = username;
		this.cid = cid;

	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtea() {
		return this.ctea;
	}

	public void setCtea(String ctea) {
		this.ctea = ctea;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}