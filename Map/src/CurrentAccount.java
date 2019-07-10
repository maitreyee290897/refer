
public class CurrentAccount extends BankAccount {
	private final double withdrawLimit = Double.MAX_VALUE;
	private final double minAccountBalance = 25000;
	private double balance = 0;

	public CurrentAccount(Person p) {
		super(p);
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("Updated account balance: " + balance);
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
		if (amount > withdrawLimit)
			System.out.println("Exceeding your withdraw limit of 25000,\n please try again! ");
		else
			balance -= amount;
	}

	@Override
	public int compareTo(BankAccount o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
