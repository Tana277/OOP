public class HoaDonGiaoHang extends HoaDon {
    private String diaChiGiaoHang;
    private int khoangCachGiaoHang;
    private int thoiGianGiaoHang;

    public HoaDonGiaoHang() {
        super();
        this.diaChiGiaoHang = "Q.Tan Phu";
        this.khoangCachGiaoHang = 20;
        this.thoiGianGiaoHang = 24;
    }

    @Override
    public double tinhThanhTien() {
        double thanhTien = super.tinhThanhTien();
        double phiGiaoHang;

        if (thoiGianGiaoHang < 24) {
            if (khoangCachGiaoHang < 10) {
                phiGiaoHang = 20.0 * khoangCachGiaoHang * getSoLuong();
            } else {
                phiGiaoHang = 18.0 * khoangCachGiaoHang * getSoLuong();
            }
        } else {
            phiGiaoHang = 150000;
        }

        return thanhTien + phiGiaoHang;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        double thanhTien = tinhThanhTien();
        System.out.println("Dia chi giao hang: " + diaChiGiaoHang);
        System.out.println("Khoang cach giao hang: " + khoangCachGiaoHang);
        System.out.println("Thoi gian giao hang: " + thoiGianGiaoHang);
        System.out.println("Phi giao hang: " + (thanhTien - super.tinhThanhTien()));
    }
}