package HashSet;
import java.util.*;
public class Treeset {

	public static void main(String args[]) {
		
		TreeSet<String> val = new TreeSet<>();
		val.add("Shiva");
		val.add("chandu");
		val.add("vasu");
		val.add("amar");
		
		Iterator<String> val1 = val.iterator();
		while(val1.hasNext()) {
			System.out.println(val1.next());
		}
		
		Iterator<String> it = val.iterator();
		String query = "John";
		
			if (it.next().equals(query)) {
				System.out.println("yepp there!");
			}
			else
				System.out.println("Not there!");
				 
		
	}
	
}
