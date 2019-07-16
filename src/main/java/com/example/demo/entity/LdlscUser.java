package com.example.demo.entity;

/**
 * LdlscUser entity. @author MyEclipse Persistence Tools
 */

public class LdlscUser implements java.io.Serializable {

	// Fields

	private String userId;
	private String userName;
	private String userloginname;
	private String userpassword;
	private String userindex;

	// Constructors

	/** default constructor */
	public LdlscUser() {
	}

	/** full constructor */
	public LdlscUser(String userName, String userloginname,
			String userpassword, String userindex) {
		this.userName = userName;
		this.userloginname = userloginname;
		this.userpassword = userpassword;
		this.userindex = userindex;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserloginname() {
		return this.userloginname;
	}

	public void setUserloginname(String userloginname) {
		this.userloginname = userloginname;
	}

	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserindex() {
		return this.userindex;
	}

	public void setUserindex(String userindex) {
		this.userindex = userindex;
	}

}