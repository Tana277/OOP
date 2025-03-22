public class CanBoQuanLy extends NhanVien {
    protected static final double LUONG_CO_BAN = 1150;
    protected static final double HE_SO_PHU_CAP_CHUC_VU = 1100;

    protected String chucVu;

    public CanBoQuanLy(String maNhanVien, String tenNhanVien, int namSinh, String gioiTinh, double heSoLuong, int namVaoLam, String chucVu) {
        super(maNhanVien, tenNhanVien, namSinh, gioiTinh, heSoLuong, namVaoLam);
        this.chucVu = chucVu;
    }

    @Override
    public double tinhLuong() {
        double phuCapChucVu = getHeSoLuong() * HE_SO_PHU_CAP_CHUC_VU;
        return getHeSoLuong() * LUONG_CO_BAN + phuCapChucVu;
    }

    private double getHeSoLuong() {
        return 0;
    }

    @Override
    public double tinhPhuCap() {
        return 0;
    }

    @Override
    public String xepLoaiThiDua() {
        return "A";
    }

    // ...
}
