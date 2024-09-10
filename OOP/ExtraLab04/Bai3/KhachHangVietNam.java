class KhachHangVietNam extends KhachHang {
    private String doiTuong;
    private int soLuong;
    private double donGia;
    private int dinhMuc;

    public KhachHangVietNam(String maKhachHang, String hoTen, NgayThang namRaHoaDon, String doiTuong, int soLuong, double donGia, int dinhMuc) {
        super(maKhachHang, hoTen, namRaHoaDon);
        this.doiTuong = doiTuong;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public double tinhThanhTien() {
        if (soLuong <= dinhMuc) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
    }

    public String toString() {
        return super.toString() +
                ", Doi tuong khac hang: " + doiTuong + ", So luong: " + soLuong + ", Don gia: " + donGia + ", Dinh muc: " + dinhMuc + ", Thanh tien: " + tinhThanhTien();
    }
}