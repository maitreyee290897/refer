
public class Employee {

	private int id;
	private String name;
	private int age;
	private double salary;
	private int vacation;
	
	public Employee(int id,String name,int age,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.vacation=30;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

	public int getId() {
		return id;
	}
	
	public void applyForLeave(int noOfDays)
	{
		if(this.vacation >= noOfDays)
		{
			this.vacation-=noOfDays;
			System.out.println("you have enough days");
		}
		else {
			System.out.println("you dont have enough days");
			
		}
	}

	
}
