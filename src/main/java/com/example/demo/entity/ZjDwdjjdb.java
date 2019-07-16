package com.example.demo.entity;

/**
 * ZjDwdjjdb entity. @author MyEclipse Persistence Tools
 */

public class ZjDwdjjdb implements java.io.Serializable {

	// Fields

	private String dwdjjdbh;
	private ZjDwzpdjb zjDwzpdjb;
	private String djyy;
	private String djsj;
	private String jdyy;
	private String jdsj;
	private String gdsj;

	// Constructors

	/** default constructor */
	public ZjDwdjjdb() {
	}

	/** full constructor */
	public ZjDwdjjdb(ZjDwzpdjb zjDwzpdjb, String djyy, String djsj,
			String jdyy, String jdsj, String gdsj) {
		this.zjDwzpdjb = zjDwzpdjb;
		this.djyy = djyy;
		this.djsj = djsj;
		this.jdyy = jdyy;
		this.jdsj = jdsj;
		this.gdsj = gdsj;
	}

	// Property accessors

	public String getDwdjjdbh() {
		return this.dwdjjdbh;
	}

	public void setDwdjjdbh(String dwdjjdbh) {
		this.dwdjjdbh = dwdjjdbh;
	}

	public ZjDwzpdjb getZjDwzpdjb() {
		return this.zjDwzpdjb;
	}

	public void setZjDwzpdjb(ZjDwzpdjb zjDwzpdjb) {
		this.zjDwzpdjb = zjDwzpdjb;
	}

	public String getDjyy() {
		return this.djyy;
	}

	public void setDjyy(String djyy) {
		this.djyy = djyy;
	}

	public String getDjsj() {
		return this.djsj;
	}

	public void setDjsj(String djsj) {
		this.djsj = djsj;
	}

	public String getJdyy() {
		return this.jdyy;
	}

	public void setJdyy(String jdyy) {
		this.jdyy = jdyy;
	}

	public String getJdsj() {
		return this.jdsj;
	}

	public void setJdsj(String jdsj) {
		this.jdsj = jdsj;
	}

	public String getGdsj() {
		return this.gdsj;
	}

	public void setGdsj(String gdsj) {
		this.gdsj = gdsj;
	}

}