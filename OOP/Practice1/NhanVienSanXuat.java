public class NhanVienSanXuat extends NhanVien {
    private static final double LUONG_CO_BAN = 1150;
    private static final double HE_SO_PHU_CAP_NANG_NHOC = 0.1;

    private int soNgayNghi;

    public NhanVienSanXuat(String maNhanVien, String tenNhanVien, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam, int soNgayNghi) {
        super(maNhanVien, tenNhanVien, namSinh, gioiTinh, heSoLuong, namVaoLam);
        this.soNgayNghi = soNgayNghi;
    }

    @Override
    public double tinhLuong() {
        double phuCapNangNhoc = LUONG_CO_BAN * HE_SO_PHU_CAP_NANG_NHOC;
        return getHeSoLuong() * LUONG_CO_BAN * (1 + phuCapNangNhoc);
    }

    @Override
    public double tinhPhuCap() {
        if (soNgayNghi <= 1) {
            return LUONG_CO_BAN * getHeSoLuong() * 1;
        } else if (soNgayNghi <= 3) {
            return LUONG_CO_BAN * getHeSoLuong() * 0.75;
        } else if (soNgayNghi <= 5) {
            return LUONG_CO_BAN * getHeSoLuong() * 0.5;
        } else {
            return LUONG_CO_BAN * getHeSoLuong() * 0;
        }
    }

    private double getHeSoLuong() {
        return 0;
    }

    @Override
    public String xepLoaiThiDua() {
        if (soNgayNghi <= 1) {
            return "A";
        } else if (soNgayNghi <= 3) {
            return "B";
        } else if (soNgayNghi <= 5) {
            return "C";
        } else {
            return "D";
        }
    }

    // ...
}

