public class Product {
    protected String maHang;
    protected String tenHang;

    public Product() {
        maHang = "";
        tenHang = "";
    }

    public Product(String maHang, String tenHang) {
        if (maHang.matches("^HH\\d{3}$")) {
            this.maHang = maHang;
        } else {
            this.maHang = "HH001";
        }
        this.tenHang = tenHang;
    }

    @Override
    public String toString() {
        return "Ma hang: " + maHang + ", Ten hang: " + tenHang;
    }
}

