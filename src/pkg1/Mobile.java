package pkg1;

public class Mobile {

	String brand;
	String color;
	double price;

	public Mobile(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brand : " + brand + ", Color: " + color + ", Price: " + price;
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Vivo", "Black", 35000);
		System.out.println(m1);
		Mobile m2 = new Mobile("Samsung", "Blue", 30000);
		System.out.println(m2);

		System.out.println(m1.equals(m2));
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Mobile) {
			Mobile m = (Mobile) o;
			return this.price == m.price && this.brand.equals(m.brand) && this.color.equals(m.color);
		}
		return false;
	}
}
