class CaSy {
    protected String hoTen;
    protected int soNamLamViec;
    protected int soDiaBanDuoc;
    protected int soBuoiTrinhDien;

    public CaSy(String hoTen, int soNamLamViec, int soDiaBanDuoc, int soBuoiTrinhDien) {
        this.hoTen = hoTen;
        this.soNamLamViec = soNamLamViec;
        this.soDiaBanDuoc = soDiaBanDuoc;
        this.soBuoiTrinhDien = soBuoiTrinhDien;
    }

    public double tinhLuong() {
        return 0;
    }

    public String toString() {
        return "Ho ten: " + hoTen +
                ", So nam lam viec: " + soNamLamViec +
                ", So dia ban duoc: " + soDiaBanDuoc +
                ", So buoi trinh dien: " + soBuoiTrinhDien +
                ", Luong: " + tinhLuong();
    }
}







