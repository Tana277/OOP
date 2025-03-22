public abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected int namSinh;
    protected String gioiTinh;
    protected double heSoLuong;
    protected int namVaoLam;

    public NhanVien(String maNhanVien, String tenNhanVien, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.heSoLuong = heSoLuong;
        this.namVaoLam = namVaoLam;
    }

    public abstract double tinhLuong();

    public abstract double tinhPhuCap();

    public abstract String xepLoaiThiDua();

}


