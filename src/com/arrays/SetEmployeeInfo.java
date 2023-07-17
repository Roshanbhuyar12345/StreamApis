package com.arrays;

public class SetEmployeeInfo {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void demo() {

		System.out.println(this.employee.getName());
	}

	public static void main(String[] args) {
		Employee emp = new Employee("balaji", 23422);
		Employee emp2 = new Employee("rahul", 23422);

		SetEmployeeInfo employeeInfo = new SetEmployeeInfo();
		SetEmployeeInfo employeeInfo1 = new SetEmployeeInfo();
		employeeInfo.setEmployee(emp);
		employeeInfo1.setEmployee(emp2);

		employeeInfo.demo();
		employeeInfo1.demo();
	}
}
