package com.andyiot.employeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private LocalDate dateOfbirth;
	
	public Employee() {	}
	
	public Employee(String firstName, String lastName, String emailId, String dateOfbirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		setDateOfbirth(dateOfbirth);
	}
	
	private static final DateTimeFormatter sTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Column(name = "date_ofbirth", nullable = false)
	public String getDateOfbirth() {
		return dateOfbirth.format(sTimeFormatter);
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = LocalDate.parse(dateOfbirth, sTimeFormatter);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", dateOfbirth= " + dateOfbirth +"]";
	}
	
}

