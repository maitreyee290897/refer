package com.sapient.pe.model;

public class Address {
	private String street;
	private String city;
	private String state;
	private int pin;

	public Address(String street, String city, String state, int pin) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
}
