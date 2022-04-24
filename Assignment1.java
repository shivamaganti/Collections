import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		
		ArrayList<String> val = new ArrayList<>();
		val.add("shiva");
		val.add("chandu");
		val.add("vasu");
		val.add("amar");
		val.add("ramesh");
		
		 printAll(val);

	}

	public static void printAll(ArrayList<String> val) {
		//ArrayList<String> list;
        Iterator<String> it = val.iterator();
 		
		while (it.hasNext())
			System.out.println(it.next());
		
	}

}
