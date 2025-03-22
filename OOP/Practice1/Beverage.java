public class Beverage extends Product {
    private String donViTinh;
    private int soLuong;
    private double donGia;

    public Beverage(String maHang, String tenHang, String donViTinh, int soLuong, double donGia) {
        super(maHang, tenHang);
        this.donViTinh = validateDonViTinh(donViTinh);
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    private String validateDonViTinh(String donViTinh) {
        String[] validDonViTinh = { "ket", "thung", "chai", "lon" };
        for (String valid : validDonViTinh) {
            if (valid.equals(donViTinh)) {
                return donViTinh;
            }
        }
        return "ket";
    }

    public double tinhTongTien() {
        double thanhTien = 0;
        if (donViTinh.equals("ket") || donViTinh.equals("thung")) {
            thanhTien = soLuong * donGia;
        } else if (donViTinh.equals("chai")) {
            thanhTien = (soLuong * donGia) / 20;
        } else if (donViTinh.equals("lon")) {
            thanhTien = (soLuong * donGia) / 24;
        }
        double tiLeChietKhau = 0.9; // Tỉ lệ chiết khấu, giả sử là 90%
        return thanhTien * tiLeChietKhau;
    }

    @Override
    public String toString() {
        return super.toString() + ", Don vi tinh: " + donViTinh + ", So luong: " + soLuong + ", Don gia: " + donGia;
    }
}

