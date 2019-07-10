
public class AccountDetails {

	private int accountId;
	private String name;
	private double accountBalance;
	private static final int MIN_ACCOUNT_BALANCE = 25000;
	static int counter=100;
	private Address address;
	
	public AccountDetails(String name,double d, Address address)
	{
		counter=counter+1;
		this.accountId=counter;
		this.name=name;
		this.accountBalance=d;
		this.address = address;
		
	}
	
	public AccountDetails(String name,double d)
	{
		counter=counter+1;
		this.accountId=counter;
		this.name=name;
		this.accountBalance=d;
		
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
