package pkg1;

public class countOfWords {
	public static void main(String[] args) {
		String s ="  It  is  a  ball ";
		s=s.trim();
		int count = 1;
		
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
