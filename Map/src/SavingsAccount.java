
public class SavingsAccount extends BankAccount{
	private final double withdrawLimit=25000;
	private final double depositLimit=25000;
	private final double minAccountBalance=10000;
	private double balance=0;
	public SavingsAccount(Person p){
		super(p);
	}
	
	public void deposit(int amount) {
		if(amount>depositLimit)
			System.out.println("Exceeding your deposit limit of 50000,\n please try again! ");
		else
		balance+=amount;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public double getMinAccountBalance() {
		return minAccountBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if(amount>withdrawLimit)
			System.out.println("Exceeding your withdraw limit of 25000,\n please try again! ");
		else
			balance-=amount;
	}
}
