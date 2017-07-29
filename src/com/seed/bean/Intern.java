package com.seed.bean;

public class Intern {
	private String name;
	private String contactNo;
	private String emailId;
	private int asn;
	private String batch;
	private String track;
	private String gender;
	
	
	
	public Intern() {
		
	}
	public Intern(String name, String contactNo, String emailId, int asn, String batch, String track, String gender) {
		this.name = name;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.asn = asn;
		this.batch = batch;
		this.track = track;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAsn() {
		return asn;
	}
	public void setAsn(int asn) {
		this.asn = asn;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getTrack() {
		return track;
	}
	public void setTrack(String track) {
		this.track = track;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Intern [name=" + name + ", contactNo=" + contactNo + ", emailId=" + emailId + ", asn=" + asn
				+ ", batch=" + batch + ", track=" + track + ", gender=" + gender + "]";
	}
	
	

}
