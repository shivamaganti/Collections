import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Assignment3 {

	public static void main(String args[]) {
		Enumeration num;
		Vector<Integer> val = new Vector<>();
		val.add(11);
		val.add(43);
		val.add(54);
		val.add(23);
		val.add(72);
		val.add(81);
		val.add(34);
		
		/*while(num.hasMoreElements()) {
			System.out.println("Values are :"+(num.nextElement());
		}*/
		Iterator<Integer> it = val.iterator();
		
		
		while(it.hasNext()) {
			System.out.println("Values are :"+it.next());
		}
		
		ListIterator<Integer> val1 = val.listIterator();
		
		while(val1.hasNext()) {
			System.out.println("Values are :"+val1.next());
		}
	}
}
