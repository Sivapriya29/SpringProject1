package com.HwSwSupportSystem.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Engineer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer engId;
	@NotEmpty(message="Name is mandatory")
	private String engName;
	@NotEmpty(message="Email is mandatory")
	private String engEmail;
	@NotEmpty(message="Password is mandatory")
	private String engPassword;
	@NotEmpty(message="Mobile number is mandatory")
	private String engMobNo;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "engineer")
	private List<Complaint> complaints=new ArrayList<>();
	@NotEmpty(message="Designation is mandatory")
	private String engDes;
	
	
	public Integer getEngId() {
		return engId;
	}
	public void setEngId(Integer engId) {
		this.engId = engId;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getEngEmail() {
		return engEmail;
	}
	public void setEngEmail(String engEmail) {
		this.engEmail = engEmail;
	}
	public String getEngPassword() {
		return engPassword;
	}
	public void setEngPassword(String engPassword) {
		this.engPassword = engPassword;
	}
	public String getEngMobNo() {
		return engMobNo;
	}
	public void setEngMobNo(String engMobNo) {
		this.engMobNo = engMobNo;
	}
	public List<Complaint> getComplaints() {
		return complaints;
	}
	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	public String getEngDes() {
		return engDes;
	}
	public void setEngDes(String engDes) {
		this.engDes = engDes;
	}
	
	
	public Engineer(Integer engId, @NotEmpty(message = "Name is mandatory") String engName,
			@NotEmpty(message = "Email is mandatory") String engEmail,
			@NotEmpty(message = "Password is mandatory") String engPassword,
			@NotEmpty(message = "Mobile number is mandatory") String engMobNo, List<Complaint> complaints,
			@NotEmpty(message = "Designation is mandatory") String engDes) {
		super();
		this.engId = engId;
		this.engName = engName;
		this.engEmail = engEmail;
		this.engPassword = engPassword;
		this.engMobNo = engMobNo;
		this.complaints = complaints;
		this.engDes = engDes;
	}
	
	public Engineer() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Engineer [engId=" + engId + ", engName=" + engName + ", engEmail=" + engEmail + ", engPassword="
				+ engPassword + ", engMobNo=" + engMobNo + ", complaints=" + complaints + ", engDes=" + engDes + "]";
	}
	

}
