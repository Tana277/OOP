class CaSyChuaNoiTieng extends CaSy {
    public CaSyChuaNoiTieng(String hoTen, int soNamLamViec, int soDiaBanDuoc, int soBuoiTrinhDien) {
        super(hoTen, soNamLamViec, soDiaBanDuoc, soBuoiTrinhDien);
    }

    public double tinhLuong() {
        double luong = 3000 + 500 * soNamLamViec + soDiaBanDuoc + 150 * soBuoiTrinhDien;
        if (soDiaBanDuoc > 3000) {
            luong += 1000;
        }
        return luong;
    }
}