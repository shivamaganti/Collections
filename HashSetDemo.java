package HashSet;
import java.util.*;
public class HashSetDemo {

		HashSet<String> H1 = new HashSet<>();
		
		public HashSet<String> addCountryNames(String CountryName) {
			H1.add(CountryName);
			return H1;
		}
		
		public String getCountry(String CountryName) {
			Iterator<String> it = H1.iterator();
			
			while (it.hasNext()) {
				if (it.next().equals(CountryName))
					return CountryName;
			}
			
			return null;
		}
	
}
