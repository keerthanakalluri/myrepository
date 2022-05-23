import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.LinkedList;
import java.util.Vector;

class SortByName implements Comparator<Employee2>{
	
	
}
public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<Employee2> lstemp=new ArrayList<Employee2>();
		lstemp.add(new Employee2(24, "sham", "softwareengineer", 22));
		lstemp.add(new Employee2(25, "roy", "associate consultant", 22));
		lstemp.add(new Employee2(13, "abhi", "junior associate", 21));
		
		lstemp.stream().forEach(t -> System.out.println(t));
		
		
		}

}
