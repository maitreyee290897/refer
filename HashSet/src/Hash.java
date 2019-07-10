import java.util.HashSet;
import java.util.Set;

public class Hash {
	public static void main(String[] args)
	{
		Set<String> a= new HashSet<>();
		a.add("hi");
		a.add("hi");
		a.add(null);a.add(null);
		System.out.println(a.size());
		
	}   
}
