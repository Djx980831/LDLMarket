package com.example.demo.entity;

/**
 * BipSkill entity. @author MyEclipse Persistence Tools
 */

public class BipSkill implements java.io.Serializable {

	// Fields

	private String bipSId;
	private Bip bip;
	private String bipSYears;
	private String bipSZyjn;
	private String bipSJsdj;

	// Constructors

	/** default constructor */
	public BipSkill() {
	}

	/** full constructor */
	public BipSkill(Bip bip, String bipSYears, String bipSZyjn, String bipSJsdj) {
		this.bip = bip;
		this.bipSYears = bipSYears;
		this.bipSZyjn = bipSZyjn;
		this.bipSJsdj = bipSJsdj;
	}

	// Property accessors

	public String getBipSId() {
		return this.bipSId;
	}

	public void setBipSId(String bipSId) {
		this.bipSId = bipSId;
	}

	public Bip getBip() {
		return this.bip;
	}

	public void setBip(Bip bip) {
		this.bip = bip;
	}

	public String getBipSYears() {
		return this.bipSYears;
	}

	public void setBipSYears(String bipSYears) {
		this.bipSYears = bipSYears;
	}

	public String getBipSZyjn() {
		return this.bipSZyjn;
	}

	public void setBipSZyjn(String bipSZyjn) {
		this.bipSZyjn = bipSZyjn;
	}

	public String getBipSJsdj() {
		return this.bipSJsdj;
	}

	public void setBipSJsdj(String bipSJsdj) {
		this.bipSJsdj = bipSJsdj;
	}

}