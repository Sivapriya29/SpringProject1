package com.HwSwSupportSystem.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer empId;
	private String empName;
	private String empEmail;
	private String empPassword;
	private String empMobNo;
	private String empDes;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpMobNo() {
		return empMobNo;
	}
	public void setEmpMobNo(String empMobNo) {
		this.empMobNo = empMobNo;
	}
	public String getEmpDes() {
		return empDes;
	}
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
	
	
	public Employee(Integer empId, String empName, String empEmail, String empPassword, String empMobNo,
			String empDes) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPassword = empPassword;
		this.empMobNo = empMobNo;
		this.empDes = empDes;
	}
	
	
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPassword="
				+ empPassword + ", empMobNo=" + empMobNo + ", empDes=" + empDes + "]";
	}
	
	
}
