package javapgm;

enum Laptop {
	Macbook(2500), XPS(2000), Thinkpad(1500), Surface(2100);
	
	private int price;

	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class enumConstruct {
	public static void main(String[] args) {
		
		for (Laptop lap : Laptop.values()) {
			System.out.println(lap+" : "+lap.getPrice());
		}
	}
}
