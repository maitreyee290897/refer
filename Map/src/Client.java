

import java.util.*;

public class Client {
	public static BankAccount account;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String street, city, state,name;
		int pin, accountType;
		// defaultAccount();
		// System.out.println("Default account created with account number"
		// account.getAccountNumber());
		int choice = 1;
		//Map<Integer, BankAccount> map = new HashMap<Integer, BankAccount>();
		TreeSet<BankAccount> map1 = new TreeSet<BankAccount>(new EmployeeIdDESCComparator()); 
		int selection = 1;
		while (selection != 0) {
			System.out.println("type 1 to create a new account and 2 for existing account! press 0 to quit! ");
			selection = sc.nextInt();
			if (selection == 1) {
				System.out.println("lets create an account!");
				System.out.println("Which type of account do you want to create?!");
				System.out.println("type 1 for savings");
				System.out.println("type 2 for current");
				System.out.println("type 3 for salary");
				accountType = sc.nextInt();
				System.out.println("Address details please..!");
				System.out.println("Please Enter your street name");
				street = sc.next();
				System.out.println("Please Enter your city name");
				city = sc.next();
				System.out.println("Please Enter your state name");
				state = sc.next();
				System.out.println("Please Enter your pin code");
				pin = sc.nextInt();
				Address ad1 = new Address(street, city, state, pin);
				// Address ad2= new Address("cross3","blore","karnataka",400026);
				System.out.println("Please Enter your name");
				name = sc.next();
				Person p1 = new Person(name, 19, 50000, ad1);
				// Person p2 =new Person("bhola",29,250000,ad2);
				/*
				 * Employee s = new Employee(1, p1); System.out.println("Initial vacation days"
				 * + s.getVacationDays()); s.applyForLeaves(10);
				 * System.out.println("After applying for leave" + s.getVacationDays());
				 * s.applyForLeaves(40);
				 */
				if (accountType == 1)
					account = new SavingsAccount(p1);
				else if (accountType == 2)
					account = new CurrentAccount(p1);
				else if (accountType == 3)
					account = new SalaryAccount(p1);
				else {
					System.out.println("Invalid Query! Abort!");
					return;
				}
				//map.put(account.getAccountNumber(), account);
				map1.add(account);
				System.out.println("Your Account Number is: " + account.getAccountNumber());
			} 
			
			System.out.println("=========== THE LIST OF SORTED ACCOUNTS PER NAME IS ===========");
			for(BankAccount e:map1){
	            System.out.println(e.person.getName());
	        }
			
			/*else if (selection != 0) {
				System.out.println("Enter your Existing account number ");
				int existingAcNo = sc.nextInt();
				if (!map.containsKey(existingAcNo)) {
					System.out.println("No such account ! bye ");
					break;
				} else {
					account = map.get(existingAcNo);
				}
				do {
					System.out.println("Hello, select an option from below ");
					System.out.println("1 to check your account limits");
					System.out.println("2 to deposit to your account");
					System.out.println("3 to withdraw from your account");
					System.out.println("4 to view your account balance");
					System.out.println("press 0 to quit");
					choice = sc.nextInt();
					switch (choice) {

					case 0:
						System.out.println("Thank YOU!!!");
						break;
					case 1:
						System.out.println("Withdrawal limit: " + account.getWithdrawLimit() + "\n "
								+ "min Balance limit: " + account.getMinAccountBalance() + "\n ");

						break;
					case 2:
						System.out.println("Enter amount to deposit ");
						account.deposit(sc.nextInt());
						break;
					case 3:
						System.out.println("Enter amount to withdraw ");
						account.withdraw(sc.nextInt());
						break;
					case 4:
						System.out.println("Your account balance is " + account.getBalance());
						break;
					default:
						choice = 0;
						System.out.println("Invalid query! ");
					}
				} while (choice != 0);
			} */
		}
		// BankAccount ac2=new BankAccount(BankAccount.AccountType.SALARY_ACCOUNT,p2);
		sc.close();
	}

	public static long defaultAccount() {

		Address ad2 = new Address("cross3", "blore", "karnataka", 400026);
		Person p1 = new Person("bhola", 29, 250000, ad2);
		account = new SavingsAccount(p1);
		return account.getAccountNumber();
	}
}
