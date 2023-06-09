package com.javaStream;

import java.util.ArrayList;
import java.util.OptionalLong;

public class Patient {

	private String name;
	private String desease;
	private int age;
	private long amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesease() {
		return desease;
	}

	public void setDesease(String desease) {
		this.desease = desease;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String name, String desease, int age, long amount) {
		super();
		this.name = name;
		this.desease = desease;
		this.age = age;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", desease=" + desease + ", age=" + age + ", amount=" + amount + "]";
	}

	public static void main(String[] args) {

		Patient p1 = new Patient("suresh", "corona", 10, 23000);
		Patient p2 = new Patient("ramesh", "dengu", 10, 33000);
		Patient p3 = new Patient("kalpesh", "corona", 40, 43000);
		Patient p4 = new Patient("ravi", "H1V1", 30, 25000);
		Patient p5 = new Patient("kishan", "corona", 50, 26000);

		ArrayList<Patient> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);

		list.stream().filter(x -> x.getDesease().equals("corona") && x.getAge() >= 20).forEach(f -> {
			System.out.println(f.getName());
		});
//		forEach(System.out::println);

		OptionalLong reduce = list.stream().mapToLong(Patient::getAmount).reduce(Long::sum);
		System.out.println(reduce);
	}

}
