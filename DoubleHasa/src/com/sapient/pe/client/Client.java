package com.sapient.pe.client;

import java.util.Scanner;

import com.sapient.pe.model.AccountDetails;
import com.sapient.pe.model.Address;
import com.sapient.pe.model.Customer;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the street");
		String street = sc.nextLine();
		System.out.println("enter the city");
		String city = sc.nextLine();
		System.out.println("enter the state");
		String state = sc.nextLine();
		
		Address address = new Address(14,street,city,state);
		Customer customer = new Customer("mait",21,address);
		AccountDetails a1 = new AccountDetails(customer,AccountDetails.AccountType.C_A);
		System.out.println("ho");
	}

}
