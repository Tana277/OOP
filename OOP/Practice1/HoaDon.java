public class HoaDon {
    protected String maHoaDon;
    protected String ngayLapHoaDon;
    protected String nguoiBan;
    protected String nguoiMua;
    protected String tenSanPham;
    protected int soLuong;
    protected double donGia;

    public String getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(String ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public HoaDon() {
        this.maHoaDon = "HD001";
        this.nguoiBan = "Nguyen Hoang";
        this.nguoiMua = "Ho Ten Sinh Vien";
        this.tenSanPham = "But bi Thien Long";
        this.soLuong = 20;
        this.donGia = 2500;

        
    }

    public double tinhThanhTien() {
        double giamGia = 0;
        if (soLuong > 1000) {
            giamGia = donGia * soLuong * 0.04;
        }
        return soLuong * donGia - giamGia;
    }

    public double tinhThueVAT() {
        double thanhTien = tinhThanhTien();
        return thanhTien * 0.1;
    }

    public double tinhTongTien() {
        double thanhTien = tinhThanhTien();
        double thueVAT = tinhThueVAT();
        return thanhTien - thueVAT;
    }

    public void xuatThongTin() {
        double thanhTien = tinhThanhTien();
        double thueVAT = tinhThueVAT();
        double tongTien = tinhTongTien();

        System.out.println("Ma hoa don: " + maHoaDon);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Nguoi mua: " + nguoiMua);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Thue VAT: " + thueVAT);
        System.out.println("Tong tien: " + tongTien);
    }
}

