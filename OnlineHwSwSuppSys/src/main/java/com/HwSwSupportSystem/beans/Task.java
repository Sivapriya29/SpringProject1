package com.HwSwSupportSystem.beans;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity

public class Task {
	private Integer engId;
	private String engName;
	@Id
	private Integer compId;
	private String engSts;
	private String compSts;
	private String soln;
	public Task()
	{
	}
	
	

	public Task(Integer engId, String engName, Integer compId, String engSts, String compSts, String soln) {
		super();
		this.engId = engId;
		this.engName = engName;
		this.compId = compId;
		this.engSts = engSts;
		this.compSts = compSts;
		this.soln = soln;
	}



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

	public String getSoln() {
		return soln;
	}



	public void setSoln(String soln) {
		this.soln = soln;
	}



	public Integer getCompId() {
		return compId;
	}
	public void setCompId(Integer compId) {
		this.compId = compId;
	}
	public String getEngSts() {
		return engSts;
	}
	public void setEngSts(String engSts) {
		this.engSts = engSts;
	}
	public String getCompSts() {
		return compSts;
	}
	public void setCompSts(String compSts) {
		this.compSts = compSts;
	}



	@Override
	public String toString() {
		return "Task [engId=" + engId + ", engName=" + engName + ", compId=" + compId + ", engSts=" + engSts
				+ ", compSts=" + compSts + ", soln=" + soln + "]";
	}

		
	

	

}
