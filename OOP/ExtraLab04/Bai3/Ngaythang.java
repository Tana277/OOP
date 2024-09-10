class NgayThang {
    private int ngay;
    int thang;
    int nam;

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
