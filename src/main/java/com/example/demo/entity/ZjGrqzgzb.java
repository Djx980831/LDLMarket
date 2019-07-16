
package com.example.demo.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ZjGrqzgzb entity. @author MyEclipse Persistence Tools
 */

public class ZjGrqzgzb implements java.io.Serializable {

	// Fields
 
	private String qzgzbh;
	private ZjGrqzdjb zjGrqzdjb;
	private String xh;
	private String gz;
	private String ygxs;
	private String zdyx;
	private String zgyx;
	private String djsj;
	private String gdsj;
	private Set zjTjxxhzbs = new HashSet(0);
	private List<ZjTjxxb> zjTjxxbs = new ArrayList();

	// Constructors

	/** default constructor */
	public ZjGrqzgzb() {
	}

	/** full constructor */
	public ZjGrqzgzb(ZjGrqzdjb zjGrqzdjb, String xh, String gz, String ygxs,
			String zdyx, String zgyx, String djsj, String gdsj, Set zjTjxxhzbs,
			Set zjTjxxbs) {
		this.zjGrqzdjb = zjGrqzdjb;
		this.xh = xh;
		this.gz = gz;
		this.ygxs = ygxs;
		this.zdyx = zdyx;
		this.zgyx = zgyx;
		this.djsj = djsj;
		this.gdsj = gdsj;
		this.zjTjxxhzbs = zjTjxxhzbs;
		
	}

	// Property accessors
	
	public String getQzgzbh() {
		return this.qzgzbh;
	}


	public void setQzgzbh(String qzgzbh) {
		this.qzgzbh = qzgzbh;
	}

	public ZjGrqzdjb getZjGrqzdjb() {
		return this.zjGrqzdjb;
	}

	public void setZjGrqzdjb(ZjGrqzdjb zjGrqzdjb) {
		this.zjGrqzdjb = zjGrqzdjb;
	}

	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getGz() {
		return this.gz;
	}

	public void setGz(String gz) {
		this.gz = gz;
	}

	public String getYgxs() {
		return this.ygxs;
	}

	public void setYgxs(String ygxs) {
		this.ygxs = ygxs;
	}

	public String getZdyx() {
		return this.zdyx;
	}

	public void setZdyx(String zdyx) {
		this.zdyx = zdyx;
	}

	public String getZgyx() {
		return this.zgyx;
	}

	public void setZgyx(String zgyx) {
		this.zgyx = zgyx;
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

	public Set getZjTjxxhzbs() {
		return this.zjTjxxhzbs;
	}

	public void setZjTjxxhzbs(Set zjTjxxhzbs) {
		this.zjTjxxhzbs = zjTjxxhzbs;
	}

	public List<ZjTjxxb> getZjTjxxbs() {
		return zjTjxxbs;
	}

	public void setZjTjxxbs(List<ZjTjxxb> zjTjxxbs) {
		this.zjTjxxbs = zjTjxxbs;
	}

	

}