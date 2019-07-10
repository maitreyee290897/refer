package com.sapient.pe.model;

public class AccountDetails {
	
	public enum AccountType{
		S_A,
		C_A,
		SAL_A;
	}

	private int accountId;
	private Customer customer;
	private double accountBalance;
	private AccountType accType;
	private static final int MIN_ACCOUNT_BALANCE = 25000;
	static int counter=100;
	
	
	public AccountDetails(Customer customer, AccountType acc )
	{
		counter=counter+1;
		this.accountId=counter;
		this.customer=customer;
		this.accType=acc;
	}
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		AccountDetails.counter = counter;
	}
	public void depositCash(double amt) {
		this.accountBalance+=amt;
	}
	public void withdrawCash(double amt) {
		if(amt<=this.accountBalance) {
			this.accountBalance-=amt;
			System.out.println("fund debited");
		}
		else {
			System.out.println("no sufficient fund");
		}
	}
}
