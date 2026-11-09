package pkg1;


public class LaptopObj {

	double price;

	public LaptopObj(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
		LaptopObj l1 = new LaptopObj(45000);
		LaptopObj l2 = new LaptopObj(45000);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println(l1.equals(l2));
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		
	}

	@Override
	public String toString(){
		return "Price : "+ this.price;
	}

	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof LaptopObj) {
			LaptopObj l = (LaptopObj) o;
			return this.price == l.price;
		}
		return false;
	}
	
}
