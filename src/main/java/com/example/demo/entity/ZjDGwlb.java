package com.example.demo.entity;

import java.math.BigDecimal;

/**
 * ZjDGwlb entity. @author MyEclipse Persistence Tools
 */

public class ZjDGwlb implements java.io.Serializable {

	// Fields

	private String dmid;
	private String dmmc;
	private String sfky;
	private BigDecimal xh;

	// Constructors

	/** default constructor */
	public ZjDGwlb() {
	}

	/** full constructor */
	public ZjDGwlb(String dmmc, String sfky, BigDecimal xh) {
		this.dmmc = dmmc;
		this.sfky = sfky;
		this.xh = xh;
	}

	// Property accessors

	public String getDmid() {
		return this.dmid;
	}

	public void setDmid(String dmid) {
		this.dmid = dmid;
	}

	public String getDmmc() {
		return this.dmmc;
	}

	public void setDmmc(String dmmc) {
		this.dmmc = dmmc;
	}

	public String getSfky() {
		return this.sfky;
	}

	public void setSfky(String sfky) {
		this.sfky = sfky;
	}

	public BigDecimal getXh() {
		return this.xh;
	}

	public void setXh(BigDecimal xh) {
		this.xh = xh;
	}

}