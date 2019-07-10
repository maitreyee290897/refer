package com.sapient.pe.model;

public class Employee {
	private int id;
	private int vacationDays = 30;
	private final Person person;

	public Employee(int id, Person p) {
		this.person = p;
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public int getId() {
		return id;
	}

	public int getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	public void applyForLeaves(int numOfDays) {
		if (vacationDays >= numOfDays)
			vacationDays -= numOfDays;
		else
			System.out.println("Not enough Leave Balance");

	}

}
