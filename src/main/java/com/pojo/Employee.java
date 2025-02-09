package com.pojo;
import java.util.Date;

public class Employee extends Person {
	private double salary;
	private Date joiningDate;
	private int deptNo;
	private String deptName;
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public Date getJoiningDate(){
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate){
		this.joiningDate = joiningDate;
	}
	public int getDeptNo(){
		return deptNo;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setDeptNo(int deptNo){
		this.deptNo = deptNo;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}	
}
