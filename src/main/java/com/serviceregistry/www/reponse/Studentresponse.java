package com.serviceregistry.www.reponse;

public class Studentresponse {

	
	
	private Long studentId;
	private String firstName;
	private String lastName;
	private String email;
	private Departmentreponse department;
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Departmentreponse getDepartment() {
		return department;
	}
	public void setDepartment(Departmentreponse department) {
		this.department = department;
	}
	public Studentresponse(Long studentId, String firstName, String lastName, String email,
			Departmentreponse department) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
	}
	public Studentresponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Studentresponse [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", department=" + department + "]";
	}

	
	
	
}
