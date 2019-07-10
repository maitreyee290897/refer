package com.sapient.pe.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	private String name;
	private int age;
	private Address address;
	public Customer(String name,int age,Address address)
	{
		this.name=name;
		this.age=age;
		this.address = address;
	}
	
}
