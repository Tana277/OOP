public class BietThu extends BatDongSan {
    public BietThu(String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
    }

    @Override
    public double tinhGiaTri() {
        double dienTich = getChieuDai() * getChieuRong();
        return dienTich * 400000;
    }

    private int getChieuRong() {
        return 0;
    }

    private int getChieuDai() {
        return 0;
    }

}
