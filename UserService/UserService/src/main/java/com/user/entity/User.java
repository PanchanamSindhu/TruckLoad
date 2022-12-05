package com.user.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.UniqueConstraint;

@Component
@Entity
@Table(name = "user_data", uniqueConstraints = { @UniqueConstraint(columnNames = "name"),
		@UniqueConstraint(columnNames = "emailId") })
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@NotNull(message = "shouldnt not be null")
	private String name;

	@NotNull(message = "email cannot be blank#######")
	@Column(unique = true)
	private String emailId;

	@NotNull(message = "password cannot be blank#######")
	private String password;

	@NotNull(message = "shouldnt not be null")
	private String address;

	@NotNull
	private String state;

	@NotNull
	private String country;

	@NotNull
	private String pan;

	@NotNull
	private String contactNo;

	@NotNull(message = "publishedDate cannot be blank#######")
	@DateTimeFormat(style = "yyyy-MM-dd")
	//@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	

	@NotNull
	private String role;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotNull(message = "shouldnt not be null") String name,
			@NotNull(message = "email cannot be blank#######") String emailId,
			@NotNull(message = "password cannot be blank#######") String password,
			@NotNull(message = "shouldnt not be null") String address, @NotNull String state, @NotNull String country,
			@NotNull String pan, @NotNull String contactNo, LocalDate dateOfBirth, @NotNull String role) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.address = address;
		this.state = state;
		this.country = country;
		this.pan = pan;
		this.contactNo = contactNo;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", emailId=" + emailId + ", password=" + password
				+ ", address=" + address + ", state=" + state + ", country=" + country + ", pan=" + pan + ", contactNo="
				+ contactNo + ", dateOfBirth=" + dateOfBirth + ", role=" + role + "]";
	}

}
