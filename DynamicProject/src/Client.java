

import java.util.Scanner;

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
		
		System.out.println("USER1 YOUR ACCOUNT HAS BEEN CREATED");
		while(true) {
			System.out.println("1. view balance\n2. Deposit\n3.Withdraw");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("THE CURRENT BALANCE IS " + a1.getAccountBalance());
			break;
			case 2 :System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT "); 
				double amt = sc.nextDouble();
			a1.depositCash(amt);
			System.out.println("THE PREVIOUS BALANCE WAS " + a1.getAccountBalance() + "NOW THE BALANCE IS " + a1.getAccountBalance());
			break;
			case 3 : System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW"); 
			double amt1 = sc.nextDouble();
			a1.withdrawCash(amt1);
			System.out.println("THE PREVIOUS BALANCE WAS " + a1.getAccountBalance() + "NOW THE BALANCE IS " + a1.getAccountBalance());
		break;
			}
		}
		
	}

}
