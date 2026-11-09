package pkg1;

public class Amazon {

    String productName;
    double price;
    int quantity;

    public Amazon(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product Name= " + productName + ", Price= " + price + ", Quantity= " + quantity;
    }

    public static void main(String[] args) {

        Amazon a1 = new Amazon("Laptop", 55000, 2);
        Amazon a2 = new Amazon("Mobile", 25000, 3);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.equals(a2));
    }
    
    @Override
    public boolean equals(Object o) {

        if (o instanceof Amazon) {

            Amazon a = (Amazon) o;

            return this.productName.equals(a.productName) && this.price == a.price && this.quantity == a.quantity;
        }

        return false;
    }

}