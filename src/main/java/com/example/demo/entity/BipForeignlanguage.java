package com.example.demo.entity;

/**
 * BipForeignlanguage entity. @author MyEclipse Persistence Tools
 */

public class BipForeignlanguage implements java.io.Serializable {

	// Fields

	private String bipFlId;
	private Bip bip;
	private String bipFlYears;
	private String bipFlJywy;
	private String bipFlWysm;

	// Constructors

	/** default constructor */
	public BipForeignlanguage() {
	}

	/** full constructor */
	public BipForeignlanguage(Bip bip, String bipFlYears, String bipFlJywy,
			String bipFlWysm) {
		this.bip = bip;
		this.bipFlYears = bipFlYears;
		this.bipFlJywy = bipFlJywy;
		this.bipFlWysm = bipFlWysm;
	}

	// Property accessors

	public String getBipFlId() {
		return this.bipFlId;
	}

	public void setBipFlId(String bipFlId) {
		this.bipFlId = bipFlId;
	}

	public Bip getBip() {
		return this.bip;
	}

	public void setBip(Bip bip) {
		this.bip = bip;
	}

	public String getBipFlYears() {
		return this.bipFlYears;
	}

	public void setBipFlYears(String bipFlYears) {
		this.bipFlYears = bipFlYears;
	}

	public String getBipFlJywy() {
		return this.bipFlJywy;
	}

	public void setBipFlJywy(String bipFlJywy) {
		this.bipFlJywy = bipFlJywy;
	}

	public String getBipFlWysm() {
		return this.bipFlWysm;
	}

	public void setBipFlWysm(String bipFlWysm) {
		this.bipFlWysm = bipFlWysm;
	}

}