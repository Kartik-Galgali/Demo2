package javapgm;

public class GetSet {
	public static void main(String[] args) {
		Human obj = new Human(10,"Navin");
//		obj.setAge(10);
//		obj.setName("Navin");
		System.out.println(obj.getName() + " : " + obj.getAge());
	}
}

class Human {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	public Human() {
		
	}

}
