package com.example.demo.entity;

/**
 * ZjTjxxhzb entity. @author MyEclipse Persistence Tools
 */

public class ZjTjxxhzb implements java.io.Serializable {

	// Fields

	private String tjxid;
	private ZjDwzpgzb zjDwzpgzb;
	private ZjGrqzgzb zjGrqzgzb;
	private String tjxlx;
	private String tjsj;
	private String sfcg;
	private String jyyx;
	private String bcgyy;
	private String sfhz;
	private String hzsj;

	// Constructors

	/** default constructor */
	public ZjTjxxhzb() {
	}

	/** full constructor */
	public ZjTjxxhzb(ZjDwzpgzb zjDwzpgzb, ZjGrqzgzb zjGrqzgzb, String tjxlx,
			String tjsj, String sfcg, String jyyx, String bcgyy, String sfhz,
			String hzsj) {
		this.zjDwzpgzb = zjDwzpgzb;
		this.zjGrqzgzb = zjGrqzgzb;
		this.tjxlx = tjxlx;
		this.tjsj = tjsj;
		this.sfcg = sfcg;
		this.jyyx = jyyx;
		this.bcgyy = bcgyy;
		this.sfhz = sfhz;
		this.hzsj = hzsj;
	}

	// Property accessors

	public String getTjxid() {
		return this.tjxid;
	}

	public void setTjxid(String tjxid) {
		this.tjxid = tjxid;
	}

	public ZjDwzpgzb getZjDwzpgzb() {
		return this.zjDwzpgzb;
	}

	public void setZjDwzpgzb(ZjDwzpgzb zjDwzpgzb) {
		this.zjDwzpgzb = zjDwzpgzb;
	}

	public ZjGrqzgzb getZjGrqzgzb() {
		return this.zjGrqzgzb;
	}

	public void setZjGrqzgzb(ZjGrqzgzb zjGrqzgzb) {
		this.zjGrqzgzb = zjGrqzgzb;
	}

	public String getTjxlx() {
		return this.tjxlx;
	}

	public void setTjxlx(String tjxlx) {
		this.tjxlx = tjxlx;
	}

	public String getTjsj() {
		return this.tjsj;
	}

	public void setTjsj(String tjsj) {
		this.tjsj = tjsj;
	}

	public String getSfcg() {
		return this.sfcg;
	}

	public void setSfcg(String sfcg) {
		this.sfcg = sfcg;
	}

	public String getJyyx() {
		return this.jyyx;
	}

	public void setJyyx(String jyyx) {
		this.jyyx = jyyx;
	}

	public String getBcgyy() {
		return this.bcgyy;
	}

	public void setBcgyy(String bcgyy) {
		this.bcgyy = bcgyy;
	}

	public String getSfhz() {
		return this.sfhz;
	}

	public void setSfhz(String sfhz) {
		this.sfhz = sfhz;
	}

	public String getHzsj() {
		return this.hzsj;
	}

	public void setHzsj(String hzsj) {
		this.hzsj = hzsj;
	}

}