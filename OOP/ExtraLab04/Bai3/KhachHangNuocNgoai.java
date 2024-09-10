class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;
    private int soLuong;
    private double donGia;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, NgayThang namRaHoaDon, String quocTich, int soLuong, double donGia) {
        super(maKhachHang, hoTen, namRaHoaDon);
        this.quocTich = quocTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    public String toString() {
        return super.toString() + ", Quoc tich: " + quocTich + ", So luong: " + soLuong + ", Don gia: " + donGia + ", Thanh tien: " + tinhThanhTien();
    }
}