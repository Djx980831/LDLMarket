package com.example.demo.entity;

/**
 * ZjGrqzdjjdb entity. @author MyEclipse Persistence Tools
 */

public class ZjGrqzdjjdb implements java.io.Serializable {

	// Fields

	private String grdjjdbh;
	private ZjGrqzdjb zjGrqzdjb;
	private String dojyy;
	private String dojsj;
	private String jidyy;
	private String jidsj;
	private String gdsj;

	// Constructors

	/** default constructor */
	public ZjGrqzdjjdb() {
	}

	/** full constructor */
	public ZjGrqzdjjdb(ZjGrqzdjb zjGrqzdjb, String dojyy, String dojsj,
			String jidyy, String jidsj, String gdsj) {
		this.zjGrqzdjb = zjGrqzdjb;
		this.dojyy = dojyy;
		this.dojsj = dojsj;
		this.jidyy = jidyy;
		this.jidsj = jidsj;
		this.gdsj = gdsj;
	}

	// Property accessors

	public String getGrdjjdbh() {
		return this.grdjjdbh;
	}

	public void setGrdjjdbh(String grdjjdbh) {
		this.grdjjdbh = grdjjdbh;
	}

	public ZjGrqzdjb getZjGrqzdjb() {
		return this.zjGrqzdjb;
	}

	public void setZjGrqzdjb(ZjGrqzdjb zjGrqzdjb) {
		this.zjGrqzdjb = zjGrqzdjb;
	}

	public String getDojyy() {
		return this.dojyy;
	}

	public void setDojyy(String dojyy) {
		this.dojyy = dojyy;
	}

	public String getDojsj() {
		return this.dojsj;
	}

	public void setDojsj(String dojsj) {
		this.dojsj = dojsj;
	}

	public String getJidyy() {
		return this.jidyy;
	}

	public void setJidyy(String jidyy) {
		this.jidyy = jidyy;
	}

	public String getJidsj() {
		return this.jidsj;
	}

	public void setJidsj(String jidsj) {
		this.jidsj = jidsj;
	}

	public String getGdsj() {
		return this.gdsj;
	}

	public void setGdsj(String gdsj) {
		this.gdsj = gdsj;
	}

}