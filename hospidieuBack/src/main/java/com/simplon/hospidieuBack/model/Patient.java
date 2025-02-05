package com.simplon.hospidieuBack.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPatient;
	
	private String name;
	private String firstname;
	private Date birthDate;
	private String address;
	private String postcode;
	private String city;
	private String phone;
	private String securityNumber;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Patient that = (Patient) obj;
		return idPatient == that.idPatient && name.equals(that.name) && firstname.equals(that.firstname) && birthDate.equals(that.birthDate) && address.equals(that.address) && postcode.equals(that.postcode) && city.equals(that.city) && phone.equals(that.phone) && securityNumber.equals(that.securityNumber);
	}

	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", name=" + name + ", firstname=" + firstname + ", birthDate="
				+ birthDate + ", address=" + address + ", postcode=" + postcode + ", city=" + city + ", phone=" + phone
				+ ", securityNumber=" + securityNumber + "]";
	}


	// Getters/setters
	public String getName() {
		return name;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}

	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}
}
