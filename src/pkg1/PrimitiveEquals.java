package pkg1;

public class PrimitiveEquals {
	
	public static void main(String[] args) {
		
		String s = new String("Core");
		s.concat(" Java");
		System.out.println(s);
		
		StringBuffer sb1 = new StringBuffer("Core");
		sb1.append(" Java");
		System.out.println(sb1);
		
		StringBuilder sb2 = new StringBuilder("Core");
		sb2.append(" Java");
		System.out.println(sb2);
	}
}
