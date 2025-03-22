public class NhanVienKinhDoanh extends NhanVien {
    private static final double LUONG_CO_BAN = 1150;
    private static final double PHU_CAP_THAM_NIEN = 0.15;
    private static final double DOANH_SO_TOI_THIEU = 10000;

    private double doanhSoBanHang;

    public NhanVienKinhDoanh(String maNhanVien, String tenNhanVien, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam, double doanhSoBanHang) {
        super(maNhanVien, tenNhanVien, namSinh, gioiTinh, heSoLuong, namVaoLam);
        this.doanhSoBanHang = doanhSoBanHang;
    }

    @Override
    public double tinhLuong() {
        double hoaHong = 0;
        if (doanhSoBanHang >= DOANH_SO_TOI_THIEU) {
            hoaHong = (doanhSoBanHang - DOANH_SO_TOI_THIEU) * 0.15;
        }
        return getHeSoLuong() * LUONG_CO_BAN + hoaHong;
    }

    private double getHeSoLuong() {
        return 0;
    }

    @Override
    public double tinhPhuCap() {
        return (getNamVaoLam() >= 5) ? (getNamVaoLam() * LUONG_CO_BAN / 100) : 0;
    }

    private double getNamVaoLam() {
        return 0;
    }

    @Override
    public String xepLoaiThiDua() {
        if (doanhSoBanHang >= DOANH_SO_TOI_THIEU * 2) {
            return "A";
        } else if (doanhSoBanHang >= DOANH_SO_TOI_THIEU) {
            return "B";
        } else if (doanhSoBanHang >= DOANH_SO_TOI_THIEU * 0.5) {
            return "C";
        } else {
            return "D";
        }
    }

    // ...
}

