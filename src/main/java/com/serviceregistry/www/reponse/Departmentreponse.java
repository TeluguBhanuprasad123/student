package com.serviceregistry.www.reponse;

public class Departmentreponse {

	
	
	private int departmentid;
	private String departmentname;
	private String departmentaddress;
	private String departmentcode;
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}
	public Departmentreponse(int departmentid, String departmentname, String departmentaddress, String departmentcode) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.departmentcode = departmentcode;
	}
	public Departmentreponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
