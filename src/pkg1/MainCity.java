package pkg1;

public class MainCity {
public static void main(String[] args) {
	CityObj c1 = new CityObj("Mysore", 0.7, "Mysure Pak");
	CityObj c2 = new CityObj("Davengere", 0.5, "Benne Dose");
	
	System.out.println(c1);
	System.out.println(c1.hashCode());

	System.out.println(c2);
	System.out.println(c2.hashCode());
	
	System.out.println(c1.equals(c2));
}
}
