package com.subr.cmps.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Patient {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column

	private String firstName;
	@Column

	private String lastName;
	@Column
	private String city;
	@Column
	private String country;
	@Column
	private String postalCode;
	
	@Column
	private String address;
	@Column
	private String gender;
	@Column
	private String disease;
	@Column
	private String emailId;
	@Column
	private long contactNumber;
	@Column
    private String patientRelative; 
	@Column
	private long relativeContactNumber;
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPatientRelative() {
		return patientRelative;
	}
	public void setPatientRelative(String patientRelative) {
		this.patientRelative = patientRelative;
	}
	public long getRelativeContactNumber() {
		return relativeContactNumber;
	}
	public void setRelativeContactNumber(long relativeContactNumber) {
		this.relativeContactNumber = relativeContactNumber;
	}

}
