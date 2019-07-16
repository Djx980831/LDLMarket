package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ZjDwzpdjb entity. @author MyEclipse Persistence Tools
 */

public class ZjDwzpdjb implements java.io.Serializable {

	// Fields

	private String zpbh;
	private Bio bio;
	private String dwlxr;
	private String lxrsfzhm;
	private String lxrsj;
	private String sfdj;
	private BigDecimal djyxq;
	private String djsj;
	private String gdsj;
	private String sfgd;
	private List<ZjDwzpgzb> zjDwzpgzbs = new ArrayList();
	private List<ZjDwdjjdb> zjDwdjjdbs = new ArrayList();

	// Constructors

	/** default constructor */
	public ZjDwzpdjb() {
	}

	/** full constructor */
	public ZjDwzpdjb(Bio bio, String dwlxr, String lxrsfzhm, String lxrsj,
			String sfdj, BigDecimal djyxq, String djsj, String gdsj,
			Set zjDwzpgzbs, Set zjDwdjjdbs) {
		this.bio = bio;
		this.dwlxr = dwlxr;
		this.lxrsfzhm = lxrsfzhm;
		this.lxrsj = lxrsj;
		this.sfdj = sfdj;
		this.djyxq = djyxq;
		this.djsj = djsj;
		this.gdsj = gdsj;
		this.sfgd = gdsj;
		
	}

	// Property accessors
	
	public String getZpbh() {
		return this.zpbh;
	}

	public String getSfgd() {
		return sfgd;
	}

	public void setSfgd(String sfgd) {
		this.sfgd = sfgd;
	}

	public void setZpbh(String zpbh) {
		this.zpbh = zpbh;
	}

	public Bio getBio() {
		return this.bio;
	}

	public void setBio(Bio bio) {
		this.bio = bio;
	}

	public String getDwlxr() {
		return this.dwlxr;
	}

	public void setDwlxr(String dwlxr) {
		this.dwlxr = dwlxr;
	}

	public String getLxrsfzhm() {
		return this.lxrsfzhm;
	}

	public void setLxrsfzhm(String lxrsfzhm) {
		this.lxrsfzhm = lxrsfzhm;
	}

	public String getLxrsj() {
		return this.lxrsj;
	}

	public void setLxrsj(String lxrsj) {
		this.lxrsj = lxrsj;
	}

	public String getSfdj() {
		return this.sfdj;
	}

	public void setSfdj(String sfdj) {
		this.sfdj = sfdj;
	}

	public BigDecimal getDjyxq() {
		return this.djyxq;
	}

	public void setDjyxq(BigDecimal djyxq) {
		this.djyxq = djyxq;
	}

	public String getDjsj() {
		return this.djsj;
	}

	public void setDjsj(String djsj) {
		this.djsj = djsj;
	}

	public String getGdsj() {
		return this.gdsj;
	}

	public void setGdsj(String gdsj) {
		this.gdsj = gdsj;
	}

	public List<ZjDwzpgzb> getZjDwzpgzbs() {
		return zjDwzpgzbs;
	}

	public void setZjDwzpgzbs(List<ZjDwzpgzb> zjDwzpgzbs) {
		this.zjDwzpgzbs = zjDwzpgzbs;
	}

	public List<ZjDwdjjdb> getZjDwdjjdbs() {
		return zjDwdjjdbs;
	}

	public void setZjDwdjjdbs(List<ZjDwdjjdb> zjDwdjjdbs) {
		this.zjDwdjjdbs = zjDwdjjdbs;
	}



}