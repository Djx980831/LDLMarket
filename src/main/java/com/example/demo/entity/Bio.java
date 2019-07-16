package com.example.demo.entity;

import java.util.List;

/**
 * Bio entity. @author MyEclipse Persistence Tools
 */

public class Bio implements java.io.Serializable {

	// Fields

	private String bioId;
	private String bioNo;
	private String bioName;
	private String bioShortname;
	private String bioOrgtype;
	private String cdgRegtype;
	private String bioIndustry;
	private String bioRgaRegioncode;
	private String bioBuaPostcode;
	private String bioConFax;
	private String bioConMail;
	private String bioBuaAddress;
	private List<ZjDwzpdjb> zjDwzpdjbs ;

	// Constructors

	/** default constructor */
	public Bio() {
	}
	// Property accessors

	public String getBioId() {
		return this.bioId;
	}

	public void setBioId(String bioId) {
		this.bioId = bioId;
	}

	public String getBioNo() {
		return this.bioNo;
	}

	public void setBioNo(String bioNo) {
		this.bioNo = bioNo;
	}

	public String getBioName() {
		return this.bioName;
	}

	public void setBioName(String bioName) {
		this.bioName = bioName;
	}

	public String getBioShortname() {
		return this.bioShortname;
	}

	public void setBioShortname(String bioShortname) {
		this.bioShortname = bioShortname;
	}

	public String getBioOrgtype() {
		return this.bioOrgtype;
	}

	public void setBioOrgtype(String bioOrgtype) {
		this.bioOrgtype = bioOrgtype;
	}

	public String getCdgRegtype() {
		return this.cdgRegtype;
	}

	public void setCdgRegtype(String cdgRegtype) {
		this.cdgRegtype = cdgRegtype;
	}

	public String getBioIndustry() {
		return this.bioIndustry;
	}

	public void setBioIndustry(String bioIndustry) {
		this.bioIndustry = bioIndustry;
	}

	public String getBioRgaRegioncode() {
		return this.bioRgaRegioncode;
	}

	public void setBioRgaRegioncode(String bioRgaRegioncode) {
		this.bioRgaRegioncode = bioRgaRegioncode;
	}

	public String getBioBuaPostcode() {
		return this.bioBuaPostcode;
	}

	public void setBioBuaPostcode(String bioBuaPostcode) {
		this.bioBuaPostcode = bioBuaPostcode;
	}

	public String getBioConFax() {
		return this.bioConFax;
	}

	public void setBioConFax(String bioConFax) {
		this.bioConFax = bioConFax;
	}

	public String getBioConMail() {
		return this.bioConMail;
	}

	public void setBioConMail(String bioConMail) {
		this.bioConMail = bioConMail;
	}

	public String getBioBuaAddress() {
		return this.bioBuaAddress;
	}

	public void setBioBuaAddress(String bioBuaAddress) {
		this.bioBuaAddress = bioBuaAddress;
	}

	public List<ZjDwzpdjb> getZjDwzpdjbs() {
		return zjDwzpdjbs;
	}

	public void setZjDwzpdjbs(List<ZjDwzpdjb> zjDwzpdjbs) {
		this.zjDwzpdjbs = zjDwzpdjbs;
	}



}