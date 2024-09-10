class CaSyNoiTieng extends CaSy {
    private int soGameShowThamGia;

    public CaSyNoiTieng(String hoTen, int soNamLamViec, int soDiaBanDuoc, int soBuoiTrinhDien, int soGameShowThamGia) {
        super(hoTen, soNamLamViec, soDiaBanDuoc, soBuoiTrinhDien);
        this.soGameShowThamGia = soGameShowThamGia;
    }

    public double tinhLuong() {
        return 5000 + 500 * soNamLamViec + 1.2 * soDiaBanDuoc + 300 * soBuoiTrinhDien + 500 * soGameShowThamGia;
    }
}