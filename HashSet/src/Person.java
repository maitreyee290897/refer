 package com.sapient.pe.model;

public class Person {
	
	private String name;
	private Address address;
	private int age;
	
	
	public Person(String name, int age , Address address)
	{
		this.name =name;
		this.age= age;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Name :" +name + "\n" + "Age:" +age+  "\nAddress: "+ address;
	}
	

}
