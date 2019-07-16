package com.example.demo.entity;

/**
 * ZjTjxxb entity. @author MyEclipse Persistence Tools
 */

public class ZjTjxxb implements java.io.Serializable {

	// Fields

	private String tjxid;
	private ZjDwzpgzb zjDwzpgzb;
	private ZjGrqzgzb zjGrqzgzb;
	private String tjxlx;
	private String tjsj;

	// Constructors

	/** default constructor */
	public ZjTjxxb() {
	}

	/** full constructor */
	public ZjTjxxb(ZjDwzpgzb zjDwzpgzb, ZjGrqzgzb zjGrqzgzb, String tjxlx,
			String tjsj) {
		this.zjDwzpgzb = zjDwzpgzb;
		this.zjGrqzgzb = zjGrqzgzb;
		this.tjxlx = tjxlx;
		this.tjsj = tjsj;
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

}