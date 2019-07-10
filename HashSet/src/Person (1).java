package com.sapient.pe.model;

public class Person {
	private String name;
	private int age;
	private long salary;
	private Address address;

	public Person(String name, int age, long salary, Address address) {
		super();
		this.address = address;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
