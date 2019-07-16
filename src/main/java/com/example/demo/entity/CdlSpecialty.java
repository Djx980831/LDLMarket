package com.example.demo.entity;

import java.math.BigDecimal;

/**
 * CdlSpecialty entity. @author MyEclipse Persistence Tools
 */

public class CdlSpecialty implements java.io.Serializable {

	// Fields

	private String cdId;
	private String cdName;
	private String cdAvailability;
	private BigDecimal cdIndex;
	private String cdSpell;

	// Constructors

	/** default constructor */
	public CdlSpecialty() {
	}

	/** full constructor */
	public CdlSpecialty(String cdName, String cdAvailability,
			BigDecimal cdIndex, String cdSpell) {
		this.cdName = cdName;
		this.cdAvailability = cdAvailability;
		this.cdIndex = cdIndex;
		this.cdSpell = cdSpell;
	}

	// Property accessors

	public String getCdId() {
		return this.cdId;
	}

	public void setCdId(String cdId) {
		this.cdId = cdId;
	}

	public String getCdName() {
		return this.cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public String getCdAvailability() {
		return this.cdAvailability;
	}

	public void setCdAvailability(String cdAvailability) {
		this.cdAvailability = cdAvailability;
	}

	public BigDecimal getCdIndex() {
		return this.cdIndex;
	}

	public void setCdIndex(BigDecimal cdIndex) {
		this.cdIndex = cdIndex;
	}

	public String getCdSpell() {
		return this.cdSpell;
	}

	public void setCdSpell(String cdSpell) {
		this.cdSpell = cdSpell;
	}

}