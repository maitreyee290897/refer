
public class BankAccount {

	private int accountId;
	private Customer customer;
	protected double accountBalance;
	private BankAccount accType;
	//private static  MIN_ACCOUNT_BALANCE = 25000;
	static int counter=100;
	
	
	public BankAccount(Customer customer)
	{
		counter=counter+1;
		this.accountId=counter;
		this.customer=customer;
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
		BankAccount.counter = counter;
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


class SalariedAccount extends BankAccount{
	public SalariedAccount(Customer customer, BankAccount acc) {
		super(customer);
		// TODO Auto-generated constructor stub
	}
	private static final int MIN_ACCOUNT_BALANCE = 0;
	public void depositCash(double amt) {
		if(amt<=50000) {
		this.accountBalance+=amt;
		}
		else {
			System.out.println("you are depositing a lot of amount");
		}
	}
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(Customer customer, BankAccount acc) {
		super(customer);
		// TODO Auto-generated constructor stub
	}
	private static final int MIN_ACCOUNT_BALANCE = 10000;
	
	public void depositCash(double amt) {
		if(amt<=50000) {
		this.accountBalance+=amt;
		}
		else {
			System.out.println("you are depositing a lot of amount");
		}
	}
	public void withdrawCash(double amt) {
		if(amt<=this.accountBalance && amt<=25000) {
			this.accountBalance-=amt;
			System.out.println("fund debited");
		}
		else {
			System.out.println("no sufficient fund or the amount exeeds the daily limit ");
		}
	}
}

class CurrentAccount extends BankAccount{
	private static final int MIN_ACCOUNT_BALANCE = 25000;
	public CurrentAccount(Customer customer, BankAccount acc) {
		super(customer);
		// TODO Auto-generated constructor stub
	}
	public void withdrawCash(double amt) {
		if(amt<=this.accountBalance && (this.accountBalance-amt)> MIN_ACCOUNT_BALANCE) {
			this.accountBalance-=amt;
			System.out.println("fund debited");
		}
		else {
			System.out.println("no sufficient fund");
		}
	}
	
}
















