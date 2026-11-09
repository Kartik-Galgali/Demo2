//Functional Interface
package javapgm;

@FunctionalInterface
interface A {
	void show();
}

public class FunctInteface {
	public static void main(String[] args) {

		/*
		A obj = new A() {
			public void show() {
				System.out.println("In Show");
			}
		};
		*/

		A obj = () -> System.out.println("In Show"); // Lamda Expression
		obj.show();
	}
}
