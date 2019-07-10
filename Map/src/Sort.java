import java.util.Comparator;

public class Sort {
	

}
class EmployeeIdDESCComparator implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		return (o2.person.getName()).compareTo(o1.person.getName());
	}
}
class EmployeeIdAESCComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Integer.valueOf(o1.getId()).compareTo(o1.getId());
	}
}
