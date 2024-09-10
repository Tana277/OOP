public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product);

        Beverage beverage = new Beverage("HH002", "Nuoc ngot", "chai", 10, 5000);
        System.out.println(beverage);
        System.out.println("Tong tien: " + beverage.tinhTongTien());
    }
}
