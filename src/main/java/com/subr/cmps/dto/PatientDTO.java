package com.subr.cmps.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

public class PatientDTO implements Serializable {

	private long Id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String country;
	private String postalCode;
	private String gender;
	private String disease;
	private String emailId;
	private long contactNumber;
    private String patientRelative; 
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	@Override
	public String toString() {
		return "Patient [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", country=" + country + ", postalCode=" + postalCode + ", gender=" + gender
				+ ", disease=" + disease + ", emailId=" + emailId + ", contactNumber=" + contactNumber
				+ ", patientRelative=" + patientRelative + ", relativeContactNumber=" + relativeContactNumber + "]";
	}
	
}
