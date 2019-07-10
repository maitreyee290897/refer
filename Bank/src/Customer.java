import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	public static void main(String[] args) {
		/*Address a1 = new Address(14,"besa","nagpur","mah");
		AccountDetails c1=new AccountDetails("JACK",10000, a1);
		System.out.println("the account number " + c1.getAccountId());
		System.out.println("the current balance is" + c1.getAccountBalance());
		c1.depositCash(1000);
		System.out.println("the current balance is" + c1.getAccountBalance());
		c1.withdrawCash(200);
		System.out.println("the current balance is" + c1.getAccountBalance());
		AccountDetails c2=new AccountDetails("JK",100);
		System.out.println("the account number " + c2.getAccountId());*/
		
		Address a1 = new Address(14,"besa","nagpur","mah");
		AccountDetails c1=new AccountDetails("JACK",10000, a1);
		
		AccountDetails c2 = new AccountDetails("TIM",1000);
		Address address = new Address(14,"hhh","nagpur","mah");
		c2.setAddress(address);
		
		
	}
	
}
