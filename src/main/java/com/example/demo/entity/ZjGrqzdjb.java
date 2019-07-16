package com.example.demo.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ZjGrqzdjb entity. @author MyEclipse Persistence Tools
 */

public class ZjGrqzdjb implements java.io.Serializable {

	// Fields
	private String bipId;
	private String qzbh;
	private Bip bip;
	private String dwxx;
	private String dwjjlx;
	private String dwhy;
	private String gzdq;
	private String sfdj;
	private String sfjsdx;
	private String sfcjpx;
	private String sfjszyzd;
	private String djyxq;
	private String djsj;
	private String gdsj;
	private String sfgd;
	private String tjx;
	

	private Set zjGrqzdjjdbs = new HashSet(0);
	private List<ZjGrqzgzb> zjGrqzgzbs = new ArrayList();

	// Constructors

	/** default constructor */
	public ZjGrqzdjb() {
	}

	/** full constructor */
	public ZjGrqzdjb(Bip bip, String dwxx, String dwjjlx, String dwhy,
			String gzdq, String sfdj, String sfjsdx, String sfcjpx,
			String sfjszyzd, String djyxq, String djsj, String gdsj,
			Set zjGrqzdjjdbs, Set zjGrqzgzbs) {
		this.bip = bip;
		this.dwxx = dwxx;
		this.dwjjlx = dwjjlx;
		this.dwhy = dwhy;
		this.gzdq = gzdq;
		this.sfdj = sfdj;
		this.sfjsdx = sfjsdx;
		this.sfcjpx = sfcjpx;
		this.sfjszyzd = sfjszyzd;
		this.djyxq = djyxq;
		this.djsj = djsj;
		this.gdsj = gdsj;
		this.tjx=tjx;
		this.zjGrqzdjjdbs = zjGrqzdjjdbs;
		
	}

	// Property accessors
	public String getTjx() {
		return tjx;
	}

	public void setTjx(String tjx) {
		this.tjx = tjx;
	}
	public String getQzbh() {
		return this.qzbh;
	}

	public void setQzbh(String qzbh) {
		this.qzbh = qzbh;
	}

	public Bip getBip() {
		return this.bip;
	}

	public void setBip(Bip bip) {
		this.bip = bip;
	}

	public String getDwxx() {
		return this.dwxx;
	}

	public void setDwxx(String dwxx) {
		this.dwxx = dwxx;
	}

	public String getDwjjlx() {
		return this.dwjjlx;
	}

	public void setDwjjlx(String dwjjlx) {
		this.dwjjlx = dwjjlx;
	}

	public String getDwhy() {
		return this.dwhy;
	}

	public void setDwhy(String dwhy) {
		this.dwhy = dwhy;
	}

	public String getGzdq() {
		return this.gzdq;
	}

	public void setGzdq(String gzdq) {
		this.gzdq = gzdq;
	}

	public String getSfdj() {
		return this.sfdj;
	}

	public void setSfdj(String sfdj) {
		this.sfdj = sfdj;
	}

	public String getSfjsdx() {
		return this.sfjsdx;
	}

	public void setSfjsdx(String sfjsdx) {
		this.sfjsdx = sfjsdx;
	}

	public String getSfcjpx() {
		return this.sfcjpx;
	}

	public void setSfcjpx(String sfcjpx) {
		this.sfcjpx = sfcjpx;
	}

	public String getSfjszyzd() {
		return this.sfjszyzd;
	}

	public void setSfjszyzd(String sfjszyzd) {
		this.sfjszyzd = sfjszyzd;
	}

	public String getDjyxq() {
		return this.djyxq;
	}

	public void setDjyxq(String djyxq) {
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

	public Set getZjGrqzdjjdbs() {
		return this.zjGrqzdjjdbs;
	}

	public void setZjGrqzdjjdbs(Set zjGrqzdjjdbs) {
		this.zjGrqzdjjdbs = zjGrqzdjjdbs;
	}

	

	public List<ZjGrqzgzb> getZjGrqzgzbs() {
		return zjGrqzgzbs;
	}

	public void setZjGrqzgzbs(List<ZjGrqzgzb> zjGrqzgzbs) {
		this.zjGrqzgzbs = zjGrqzgzbs;
	}

	public String getSfgd() {
		return sfgd;
	}

	public void setSfgd(String sfgd) {
		this.sfgd = sfgd;
	}

	public String getBipId() {
		return bipId;
	}

	public void setBipId(String bipId) {
		this.bipId = bipId;
	}
	
}