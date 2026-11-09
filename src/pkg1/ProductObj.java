package pkg1;

public class ProductObj {
	String pname;
	int quantity;
	double price;

	public ProductObj(String pname, int quantity, double price) {
		this.pname = pname;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product Name= " + this.pname + ", Quantity=" + this.quantity + ", Price=" + this.price;
	}

	@Override
	public int hashCode() {
		return 100;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof ProductObj) {
			ProductObj p = (ProductObj) o;
			return this.pname.equals(p.pname) && this.quantity == p.quantity && this.price == p.price;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ProductObj p1 = new ProductObj("Shoe", 12, 12000);
		ProductObj p2 = new ProductObj("Doll", 12, 12000);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
