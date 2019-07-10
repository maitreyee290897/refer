
public class Client {

	public static void main(String[] args){
		Employee e1= new Employee(12,"vinay",45,8000.00);
		System.out.println("the initial vacation days" + e1.getVacation());
		e1.applyForLeave(10);
		System.out.println("after applying for leave" + e1.getVacation());
		
	}
}
