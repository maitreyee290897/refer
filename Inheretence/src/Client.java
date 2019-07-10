

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the kind of account you want\n1.current account\n2.saving account\n3.salaried account");
		int accountType = sc.nextInt();
		if(accountType==1) {
			System.out.println("enter the street !");
			String street = sc.next();
			System.out.println("enter the city !");
			String city = sc.next();
			System.out.println("enter the state");
			String state = sc.next();
			
			Address address = new Address(14,street,city,state);
			Customer customer = new Customer("mait",21,address);
			BankAccount a1 = new BankAccount(customer);
			SavingsAccount s1=new SavingsAccount(customer,a1);


			System.out.println("USER1 YOUR ACCOUNT HAS BEEN CREATED");
			while(true) {
				System.out.println("1. view balance\n2. Deposit\n3.Withdraw");
				int choice = sc.nextInt();
				switch(choice) {
				case 1 : System.out.println("THE CURRENT BALANCE IS " + s1.getAccountBalance());
				break;
				case 2 :System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT "); 
					double amt = sc.nextDouble();
				s1.depositCash(amt);
				System.out.println("THE PREVIOUS BALANCE WAS " + s1.getAccountBalance() + "NOW THE BALANCE IS " + s1.getAccountBalance());
				break;
				case 3 : System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW"); 
				double amt1 = sc.nextDouble();
				s1.withdrawCash(amt1);
				System.out.println("THE PREVIOUS BALANCE WAS " + s1.getAccountBalance() + "NOW THE BALANCE IS " + s1.getAccountBalance());
			break;
				}
			}
			
		}
		else if(accountType==2) {
			
		}
		else {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
