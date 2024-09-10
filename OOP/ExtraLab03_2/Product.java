public class Product {
    private String name;
    private double price;
    private double discount;

    // Khong giam gia
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0.0;
    }

    // Co giam gia
    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateImportTax() {
        return 0.1 * price;
    }

    public void displayInfo() {
        System.out.println("Ten san pham: " + name);
        System.out.println("Don gia: " + price);
        System.out.println("Giam gia: " + discount);
        System.out.println("Thue nhap khau: " + calculateImportTax());
    }

    public static void main(String[] args) {
        Product product1 = new Product("San pham 1", 1000.0, 100.0);
        Product product2 = new Product("San pham 2", 2000.0);

        product1.displayInfo();
        System.out.println("-----------------------");
        product2.displayInfo();
    }
}

