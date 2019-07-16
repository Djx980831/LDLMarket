package com.example.demo.entity;

import java.util.List;

/**
 * Bip entity. @author MyEclipse Persistence Tools
 */

public class Bip implements java.io.Serializable {

	// Fields

	private String bipId;
	private String bipCitizenid;
	private String bipSex;
	private String bipAge;
	private String bipName;
	private String bipBirthday;
	private String bipMinzu;
	private String bipZzmm;
	private String bipHyzk;
	private String bipHjxz;
	private String bipRylb;
	private String bipJkzk;
	private String bipCjqk;
	private String bipEyesightleft;
	private String bipEyesightright;
	private String bipLong;
	private String bipWeight;
	private String bipHkszd;
	private String bipWhcd;
	private String bipSubject;
	private String bipGraduateschool;
	private String bipBysj;
	private String bipEducationallevel2;
	private String bipConTelephone;
	private String bipConMobile;
	private String bipConEmail;
	private String bipConPostcode;
	private String bipConContact;
	private String bipConContacttel;
	private String bipResAddress;
	private String bipTLowersecurity;
	private String bipTCriminal;
	private String bipTDestitute;
	private String bipTPeasant;
	private String bipTVeteran;
	private String bipTOthercities;
	private String bipTCzjyyhz;
	private String bipTRhfl;
	private String bipTNewgraduate;
	private String bipPcDj;
	private String bipPcSlcd;
	private String bipResume;
	private String bipQtsm;
	private List<BipSkill> bipSkills ;
	private List<ZjGrqzdjb> zjGrqzdjbs ;
	private List<BipForeignlanguage> bipForeignlanguages ;

	// Constructors

	/** default constructor */
	public Bip() {
	}

	/** full constructor */
	public Bip(String bipCitizenid, String bipSex, String bipAge,String bipID,
			String bipName, String bipBirthday, String bipMinzu,
			String bipZzmm, String bipHyzk, String bipHjxz, String bipRylb,
			String bipJkzk, String bipCjqk, String bipEyesightleft,
			String bipEyesightright, String bipLong, String bipWeight,
			String bipHkszd, String bipWhcd, String bipSubject,
			String bipGraduateschool, String bipBysj,
			String bipEducationallevel2, String bipConTelephone,
			String bipConMobile, String bipConEmail, String bipConPostcode,
			String bipConContact, String bipConContacttel,
			String bipResAddress, String bipTLowersecurity,
			String bipTCriminal, String bipTDestitute, String bipTPeasant,
			String bipTVeteran, String bipTOthercities, String bipTCzjyyhz,
			String bipTRhfl, String bipTNewgraduate, String bipPcDj,
			String bipPcSlcd, String bipResume, String bipQtsm, List bipSkills,
			List zjGrqzdjbs, List bipForeignlanguages) {
		this.bipId = bipId;
		this.bipCitizenid = bipCitizenid;
		this.bipSex = bipSex;
		this.bipAge = bipAge;
		this.bipName = bipName;
		this.bipBirthday = bipBirthday;
		this.bipMinzu = bipMinzu;
		this.bipZzmm = bipZzmm;
		this.bipHyzk = bipHyzk;
		this.bipHjxz = bipHjxz;
		this.bipRylb = bipRylb;
		this.bipJkzk = bipJkzk;
		this.bipCjqk = bipCjqk;
		this.bipEyesightleft = bipEyesightleft;
		this.bipEyesightright = bipEyesightright;
		this.bipLong = bipLong;
		this.bipWeight = bipWeight;
		this.bipHkszd = bipHkszd;
		this.bipWhcd = bipWhcd;
		this.bipSubject = bipSubject;
		this.bipGraduateschool = bipGraduateschool;
		this.bipBysj = bipBysj;
		this.bipEducationallevel2 = bipEducationallevel2;
		this.bipConTelephone = bipConTelephone;
		this.bipConMobile = bipConMobile;
		this.bipConEmail = bipConEmail;
		this.bipConPostcode = bipConPostcode;
		this.bipConContact = bipConContact;
		this.bipConContacttel = bipConContacttel;
		this.bipResAddress = bipResAddress;
		this.bipTLowersecurity = bipTLowersecurity;
		this.bipTCriminal = bipTCriminal;
		this.bipTDestitute = bipTDestitute;
		this.bipTPeasant = bipTPeasant;
		this.bipTVeteran = bipTVeteran;
		this.bipTOthercities = bipTOthercities;
		this.bipTCzjyyhz = bipTCzjyyhz;
		this.bipTRhfl = bipTRhfl;
		this.bipTNewgraduate = bipTNewgraduate;
		this.bipPcDj = bipPcDj;
		this.bipPcSlcd = bipPcSlcd;
		this.bipResume = bipResume;
		this.bipQtsm = bipQtsm;
		this.bipSkills = bipSkills;
		this.zjGrqzdjbs = zjGrqzdjbs;
		this.bipForeignlanguages = bipForeignlanguages;
	}

	// Property accessors

	public String getBipId() {
		return this.bipId;
	}

	public void setBipId(String bipId) {
		this.bipId = bipId;
	}

	public String getBipCitizenid() {
		return this.bipCitizenid;
	}

	public void setBipCitizenid(String bipCitizenid) {
		this.bipCitizenid = bipCitizenid;
	}

	public String getBipSex() {
		return this.bipSex;
	}

	public void setBipSex(String bipSex) {
		this.bipSex = bipSex;
	}

	public String getBipAge() {
		return this.bipAge;
	}

	public void setBipAge(String bipAge) {
		this.bipAge = bipAge;
	}

	public String getBipName() {
		return this.bipName;
	}

	public void setBipName(String bipName) {
		this.bipName = bipName;
	}

	public String getBipBirthday() {
		return this.bipBirthday;
	}

	public void setBipBirthday(String bipBirthday) {
		this.bipBirthday = bipBirthday;
	}

	public String getBipMinzu() {
		return this.bipMinzu;
	}

	public void setBipMinzu(String bipMinzu) {
		this.bipMinzu = bipMinzu;
	}

	public String getBipZzmm() {
		return this.bipZzmm;
	}

	public void setBipZzmm(String bipZzmm) {
		this.bipZzmm = bipZzmm;
	}

	public String getBipHyzk() {
		return this.bipHyzk;
	}

	public void setBipHyzk(String bipHyzk) {
		this.bipHyzk = bipHyzk;
	}

	public String getBipHjxz() {
		return this.bipHjxz;
	}

	public void setBipHjxz(String bipHjxz) {
		this.bipHjxz = bipHjxz;
	}

	public String getBipRylb() {
		return this.bipRylb;
	}

	public void setBipRylb(String bipRylb) {
		this.bipRylb = bipRylb;
	}

	public String getBipJkzk() {
		return this.bipJkzk;
	}

	public void setBipJkzk(String bipJkzk) {
		this.bipJkzk = bipJkzk;
	}

	public String getBipCjqk() {
		return this.bipCjqk;
	}

	public void setBipCjqk(String bipCjqk) {
		this.bipCjqk = bipCjqk;
	}

	public String getBipEyesightleft() {
		return this.bipEyesightleft;
	}

	public void setBipEyesightleft(String bipEyesightleft) {
		this.bipEyesightleft = bipEyesightleft;
	}

	public String getBipEyesightright() {
		return this.bipEyesightright;
	}

	public void setBipEyesightright(String bipEyesightright) {
		this.bipEyesightright = bipEyesightright;
	}

	public String getBipLong() {
		return this.bipLong;
	}

	public void setBipLong(String bipLong) {
		this.bipLong = bipLong;
	}

	public String getBipWeight() {
		return this.bipWeight;
	}

	public void setBipWeight(String bipWeight) {
		this.bipWeight = bipWeight;
	}

	public String getBipHkszd() {
		return this.bipHkszd;
	}

	public void setBipHkszd(String bipHkszd) {
		this.bipHkszd = bipHkszd;
	}

	public String getBipWhcd() {
		return this.bipWhcd;
	}

	public void setBipWhcd(String bipWhcd) {
		this.bipWhcd = bipWhcd;
	}

	public String getBipSubject() {
		return this.bipSubject;
	}

	public void setBipSubject(String bipSubject) {
		this.bipSubject = bipSubject;
	}

	public String getBipGraduateschool() {
		return this.bipGraduateschool;
	}

	public void setBipGraduateschool(String bipGraduateschool) {
		this.bipGraduateschool = bipGraduateschool;
	}

	public String getBipBysj() {
		return this.bipBysj;
	}

	public void setBipBysj(String bipBysj) {
		this.bipBysj = bipBysj;
	}

	public String getBipEducationallevel2() {
		return this.bipEducationallevel2;
	}

	public void setBipEducationallevel2(String bipEducationallevel2) {
		this.bipEducationallevel2 = bipEducationallevel2;
	}

	public String getBipConTelephone() {
		return this.bipConTelephone;
	}

	public void setBipConTelephone(String bipConTelephone) {
		this.bipConTelephone = bipConTelephone;
	}

	public String getBipConMobile() {
		return this.bipConMobile;
	}

	public void setBipConMobile(String bipConMobile) {
		this.bipConMobile = bipConMobile;
	}

	public String getBipConEmail() {
		return this.bipConEmail;
	}

	public void setBipConEmail(String bipConEmail) {
		this.bipConEmail = bipConEmail;
	}

	public String getBipConPostcode() {
		return this.bipConPostcode;
	}

	public void setBipConPostcode(String bipConPostcode) {
		this.bipConPostcode = bipConPostcode;
	}

	public String getBipConContact() {
		return this.bipConContact;
	}

	public void setBipConContact(String bipConContact) {
		this.bipConContact = bipConContact;
	}

	public String getBipConContacttel() {
		return this.bipConContacttel;
	}

	public void setBipConContacttel(String bipConContacttel) {
		this.bipConContacttel = bipConContacttel;
	}

	public String getBipResAddress() {
		return this.bipResAddress;
	}

	public void setBipResAddress(String bipResAddress) {
		this.bipResAddress = bipResAddress;
	}

	public String getBipTLowersecurity() {
		return this.bipTLowersecurity;
	}

	public void setBipTLowersecurity(String bipTLowersecurity) {
		this.bipTLowersecurity = bipTLowersecurity;
	}

	public String getBipTCriminal() {
		return this.bipTCriminal;
	}

	public void setBipTCriminal(String bipTCriminal) {
		this.bipTCriminal = bipTCriminal;
	}

	public String getBipTDestitute() {
		return this.bipTDestitute;
	}

	public void setBipTDestitute(String bipTDestitute) {
		this.bipTDestitute = bipTDestitute;
	}

	public String getBipTPeasant() {
		return this.bipTPeasant;
	}

	public void setBipTPeasant(String bipTPeasant) {
		this.bipTPeasant = bipTPeasant;
	}

	public String getBipTVeteran() {
		return this.bipTVeteran;
	}

	public void setBipTVeteran(String bipTVeteran) {
		this.bipTVeteran = bipTVeteran;
	}

	public String getBipTOthercities() {
		return this.bipTOthercities;
	}

	public void setBipTOthercities(String bipTOthercities) {
		this.bipTOthercities = bipTOthercities;
	}

	public String getBipTCzjyyhz() {
		return this.bipTCzjyyhz;
	}

	public void setBipTCzjyyhz(String bipTCzjyyhz) {
		this.bipTCzjyyhz = bipTCzjyyhz;
	}

	public String getBipTRhfl() {
		return this.bipTRhfl;
	}

	public void setBipTRhfl(String bipTRhfl) {
		this.bipTRhfl = bipTRhfl;
	}

	public String getBipTNewgraduate() {
		return this.bipTNewgraduate;
	}

	public void setBipTNewgraduate(String bipTNewgraduate) {
		this.bipTNewgraduate = bipTNewgraduate;
	}

	public String getBipPcDj() {
		return this.bipPcDj;
	}

	public void setBipPcDj(String bipPcDj) {
		this.bipPcDj = bipPcDj;
	}

	public String getBipPcSlcd() {
		return this.bipPcSlcd;
	}

	public void setBipPcSlcd(String bipPcSlcd) {
		this.bipPcSlcd = bipPcSlcd;
	}

	public String getBipResume() {
		return this.bipResume;
	}

	public void setBipResume(String bipResume) {
		this.bipResume = bipResume;
	}

	public String getBipQtsm() {
		return this.bipQtsm;
	}

	public void setBipQtsm(String bipQtsm) {
		this.bipQtsm = bipQtsm;
	}

	public List getBipSkills() {
		return this.bipSkills;
	}

	public void setBipSkills(List bipSkills) {
		this.bipSkills = bipSkills;
	}

	public List getZjGrqzdjbs() {
		return this.zjGrqzdjbs;
	}

	public void setZjGrqzdjbs(List zjGrqzdjbs) {
		this.zjGrqzdjbs = zjGrqzdjbs;
	}

	public List getBipForeignlanguages() {
		return this.bipForeignlanguages;
	}

	public void setBipForeignlanguages(List bipForeignlanguages) {
		this.bipForeignlanguages = bipForeignlanguages;
	}

}