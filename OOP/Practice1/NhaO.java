public class NhaO extends BatDongSan {
    private int soLau;

    public NhaO(String maSo, double chieuDai, double chieuRong, int soLau) {
        super(maSo, chieuDai, chieuRong);
        this.soLau = soLau;
    }

    @Override
    public double tinhGiaTri() {
        double dienTich = getChieuDai() * getChieuRong();
        return dienTich * 10000 + soLau * 100000;
    }

    private int getChieuRong() {
        return 0;
    }

    private int getChieuDai() {
        return 0;
    }

}
