package HashSet;

public class Country {

	public static void main(String[] args) {
		HashSetDemo countries = new HashSetDemo();
		countries.addCountryNames("India");
		countries.addCountryNames("USA");
		countries.addCountryNames("Pakistan");
		countries.addCountryNames("Bangladesh");
		countries.addCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));

	}

}
