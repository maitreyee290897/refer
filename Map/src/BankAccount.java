
public abstract class BankAccount implements Comparable<BankAccount> {
	public static int COUNT = 0;
	private final int accountNumber;
	protected final Person person;

	public BankAccount(Person person) {
		this.person = person;
		COUNT++;
		accountNumber = COUNT;
	}

	public Person getPerson() {
		return person;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public abstract void deposit(int amount);

	public abstract void withdraw(int amount);

	public double getWithdrawLimit() {
		return 0;
	}

	public double getMinAccountBalance() {
		return 0;
	}

	public abstract double getBalance() ;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
	@Override
	public int compareTo(BankAccount employee) {
		return this.person.getName().compareTo(employee.person.getName());
	}

}
