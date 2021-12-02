package com.HwSwSupportSystem.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Complaint {

	private Integer empId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer compId;

	
	@NotEmpty(message = "Complaint type is mandatory")
	private String compType;

	@NotEmpty(message = "Complaint description is mandatory")
	@Size(min = 10, message = "Minimum size should be 3 characters long")
	private String compDesc;

	private String compSts;
	@ManyToOne(cascade = CascadeType.ALL)
	private Engineer engineer;

	

	
	public Engineer getEngineer() {
		return engineer;
	}



	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}



	public Complaint(Integer empId, Integer compId, @NotEmpty(message = "Complaint type is mandatory") String compType,
			@NotEmpty(message = "Complaint description is mandatory") @Size(min = 10, message = "Minimum size should be 3 characters long") String compDesc,
			String compSts) {
		super();
		this.empId = empId;
		this.compId = compId;
		this.compType = compType;
		this.compDesc = compDesc;
		this.compSts = compSts;
	}

	

	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	@Override
	public String toString() {
		return "Complaint [empId=" + empId + ", compId=" + compId + ", compType=" + compType + ", compDesc=" + compDesc
				+ ", compSts=" + compSts + "]";
	}



	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public String getCompType() {
		return compType;
	}

	public void setCompType(String compType) {
		this.compType = compType;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public String getCompSts() {
		return compSts;
	}

	public void setCompSts(String compSts) {
		this.compSts = compSts;
	}

	public Complaint() {
		super();
	}

}
