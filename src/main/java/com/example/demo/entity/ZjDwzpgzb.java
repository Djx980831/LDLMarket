package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ZjDwzpgzb entity. @author MyEclipse Persistence Tools
 */

public class ZjDwzpgzb implements java.io.Serializable {

	// Fields

	private String zpgzbh;
	private ZjDwzpdjb zjDwzpdjb;
	private String zpgz;
	private String zpgzbm;
	private String gwlb;
	private String zrs;
	private String zprsn;
	private String zprsnv;
	private String xbbx;
	private String hjxz;
	private String kssj;
	private String jssj;
	private String zxnl;
	private String zdnl;
	private String whcd;
	private String ygxs;
	private String zzyx;
	private String zgyx;
	private String hyzk;
	private String jkzk;
	private String rylb;
	private String sfbys;
	private String zpdq;
	private String jyyz;
	private String slcd;
	private String jsjdj;
	private String jsjslcd;
	private String gwms;
	private String gzdd;
	private String cgrsn;
	private String cgrsnv;
	private String djyxq;
	private String djsj;
	private String gdsj;
	private CdlSpecialty cal;
	private Set zjTjxxbs = new HashSet(0);
	private Set zjTjxxhzbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public ZjDwzpgzb() {
	}

	/** full constructor */
	public ZjDwzpgzb(ZjDwzpdjb zjDwzpdjb, String zpgz, String zpgzbm,
			String gwlb, String zrs, String zprsn, String zprsnv, String xbbx,
			String hjxz, String kssj, String jssj, String zxnl, String zdnl,
			String whcd, String ygxs, String zzyx, String zgyx, String hyzk,
			String jkzk, String rylb, String sfbys, String zpdq, String jyyz,
			String slcd, String jsjdj, String jsjslcd, String gwms,
			String gzdd, String cgrsn, String cgrsnv, String djyxq,
			String djsj, String gdsj, Set zjTjxxbs, Set zjTjxxhzbs) {
		this.zjDwzpdjb = zjDwzpdjb;
		this.zpgz = zpgz;
		this.zpgzbm = zpgzbm;
		this.gwlb = gwlb;
		this.zrs = zrs;
		this.zprsn = zprsn;
		this.zprsnv = zprsnv;
		this.xbbx = xbbx;
		this.hjxz = hjxz;
		this.kssj = kssj;
		this.jssj = jssj;
		this.zxnl = zxnl;
		this.zdnl = zdnl;
		this.whcd = whcd;
		this.ygxs = ygxs;
		this.zzyx = zzyx;
		this.zgyx = zgyx;
		this.hyzk = hyzk;
		this.jkzk = jkzk;
		this.rylb = rylb;
		this.sfbys = sfbys;
		this.zpdq = zpdq;
		this.jyyz = jyyz;
		this.slcd = slcd;
		this.jsjdj = jsjdj;
		this.jsjslcd = jsjslcd;
		this.gwms = gwms;
		this.gzdd = gzdd;
		this.cgrsn = cgrsn;
		this.cgrsnv = cgrsnv;
		this.djyxq = djyxq;
		this.djsj = djsj;
		this.gdsj = gdsj;
		this.zjTjxxbs = zjTjxxbs;
		this.zjTjxxhzbs = zjTjxxhzbs;
		this.cal=cal;
	}

	// Property accessors
	
	public String getZpgzbh() {
		return this.zpgzbh;
	}

	public CdlSpecialty getCal() {
		return cal;
	}

	public void setCal(CdlSpecialty cal) {
		this.cal = cal;
	}

	public void setZpgzbh(String zpgzbh) {
		this.zpgzbh = zpgzbh;
	}

	public ZjDwzpdjb getZjDwzpdjb() {
		return this.zjDwzpdjb;
	}

	public void setZjDwzpdjb(ZjDwzpdjb zjDwzpdjb) {
		this.zjDwzpdjb = zjDwzpdjb;
	}

	public String getZpgz() {
		return this.zpgz;
	}

	public void setZpgz(String zpgz) {
		this.zpgz = zpgz;
	}

	public String getZpgzbm() {
		return this.zpgzbm;
	}

	public void setZpgzbm(String zpgzbm) {
		this.zpgzbm = zpgzbm;
	}

	public String getGwlb() {
		return this.gwlb;
	}

	public void setGwlb(String gwlb) {
		this.gwlb = gwlb;
	}

	public String getZrs() {
		return this.zrs;
	}

	public void setZrs(String zrs) {
		this.zrs = zrs;
	}

	public String getZprsn() {
		return this.zprsn;
	}

	public void setZprsn(String zprsn) {
		this.zprsn = zprsn;
	}

	public String getZprsnv() {
		return this.zprsnv;
	}

	public void setZprsnv(String zprsnv) {
		this.zprsnv = zprsnv;
	}

	public String getXbbx() {
		return this.xbbx;
	}

	public void setXbbx(String xbbx) {
		this.xbbx = xbbx;
	}

	public String getHjxz() {
		return this.hjxz;
	}

	public void setHjxz(String hjxz) {
		this.hjxz = hjxz;
	}

	public String getKssj() {
		return this.kssj;
	}

	public void setKssj(String kssj) {
		this.kssj = kssj;
	}

	public String getJssj() {
		return this.jssj;
	}

	public void setJssj(String jssj) {
		this.jssj = jssj;
	}

	public String getZxnl() {
		return this.zxnl;
	}

	public void setZxnl(String zxnl) {
		this.zxnl = zxnl;
	}

	public String getZdnl() {
		return this.zdnl;
	}

	public void setZdnl(String zdnl) {
		this.zdnl = zdnl;
	}

	public String getWhcd() {
		return this.whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getYgxs() {
		return this.ygxs;
	}

	public void setYgxs(String ygxs) {
		this.ygxs = ygxs;
	}

	public String getZzyx() {
		return this.zzyx;
	}

	public void setZzyx(String zzyx) {
		this.zzyx = zzyx;
	}

	public String getZgyx() {
		return this.zgyx;
	}

	public void setZgyx(String zgyx) {
		this.zgyx = zgyx;
	}

	public String getHyzk() {
		return this.hyzk;
	}

	public void setHyzk(String hyzk) {
		this.hyzk = hyzk;
	}

	public String getJkzk() {
		return this.jkzk;
	}

	public void setJkzk(String jkzk) {
		this.jkzk = jkzk;
	}

	public String getRylb() {
		return this.rylb;
	}

	public void setRylb(String rylb) {
		this.rylb = rylb;
	}

	public String getSfbys() {
		return this.sfbys;
	}

	public void setSfbys(String sfbys) {
		this.sfbys = sfbys;
	}

	public String getZpdq() {
		return this.zpdq;
	}

	public void setZpdq(String zpdq) {
		this.zpdq = zpdq;
	}

	public String getJyyz() {
		return this.jyyz;
	}

	public void setJyyz(String jyyz) {
		this.jyyz = jyyz;
	}

	public String getSlcd() {
		return this.slcd;
	}

	public void setSlcd(String slcd) {
		this.slcd = slcd;
	}

	public String getJsjdj() {
		return this.jsjdj;
	}

	public void setJsjdj(String jsjdj) {
		this.jsjdj = jsjdj;
	}

	public String getJsjslcd() {
		return this.jsjslcd;
	}

	public void setJsjslcd(String jsjslcd) {
		this.jsjslcd = jsjslcd;
	}

	public String getGwms() {
		return this.gwms;
	}

	public void setGwms(String gwms) {
		this.gwms = gwms;
	}

	public String getGzdd() {
		return this.gzdd;
	}

	public void setGzdd(String gzdd) {
		this.gzdd = gzdd;
	}

	public String getCgrsn() {
		return this.cgrsn;
	}

	public void setCgrsn(String cgrsn) {
		this.cgrsn = cgrsn;
	}

	public String getCgrsnv() {
		return this.cgrsnv;
	}

	public void setCgrsnv(String cgrsnv) {
		this.cgrsnv = cgrsnv;
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

	public Set getZjTjxxbs() {
		return this.zjTjxxbs;
	}

	public void setZjTjxxbs(Set zjTjxxbs) {
		this.zjTjxxbs = zjTjxxbs;
	}

	public Set getZjTjxxhzbs() {
		return this.zjTjxxhzbs;
	}

	public void setZjTjxxhzbs(Set zjTjxxhzbs) {
		this.zjTjxxhzbs = zjTjxxhzbs;
	}

}