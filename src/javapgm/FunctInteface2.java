//Functional Interface
package javapgm;

@FunctionalInterface
interface B{
	void show(int i);
}

public class FunctInteface2 {
	public static void main(String[] args) {
		
		/*
		B obj = new B() {
			public void show(int i) {
				System.out.println("In Show " + i);
			}
		};
		*/

//		Lamda Expression
//		B obj = (int i) -> System.out.println("In Show " + i);
//		B obj = (i) -> System.out.println("In Show " + i);
		B obj = i -> System.out.println("In Show " + i);
		
		obj.show(5);
	}		
}
