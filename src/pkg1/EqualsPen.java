package pkg1;

public class EqualsPen {
	double price;

	EqualsPen(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.price + " ";
	}

	public static void main(String[] args) {
		EqualsPen p1 = new EqualsPen(10);
		EqualsPen p2 = new EqualsPen(10);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof EqualsPen) {
			EqualsPen p = (EqualsPen) o;
			return this.price == p.price;
		}
		return false;
	}
}
