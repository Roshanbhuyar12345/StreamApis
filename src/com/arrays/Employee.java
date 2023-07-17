package com.arrays;

public class Employee {

	private String name;

	private Integer empNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

}
