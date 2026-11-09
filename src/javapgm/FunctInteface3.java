//Functional Interface
package javapgm;

@FunctionalInterface
interface C{
	 int add(int i, int j);
}

public class FunctInteface3 {
	public static void main(String[] args) {
		
		/*
		C obj = new C() {
			public int add(int i, int j) {
				return i+j;
			}
		};
		*/

//		Lamda Expression
//		C obj = (int i, int j) -> i+j;
		C obj = (i,j) -> i + j;
		
		int result = obj.add(5,2);
		System.out.println(result);
	}		
}
