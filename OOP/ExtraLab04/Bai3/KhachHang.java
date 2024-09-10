class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected NgayThang namRaHoaDon;

    public KhachHang(String maKhachHang, String hoTen, NgayThang namRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.namRaHoaDon = namRaHoaDon;
    }

    public double tinhThanhTien() {
        return 0; // Phương thức này sẽ được ghi đè trong các lớp con
    }

    public String toString() {
        return "Ma khach hang: " + maKhachHang + ", Ho ten: " + hoTen + ", Ngay ra hoa don: " + namRaHoaDon;
    }
}

