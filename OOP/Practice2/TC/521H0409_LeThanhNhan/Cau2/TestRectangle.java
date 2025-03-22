class TestRectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);
        System.out.println("Loai hinh chu nhat: " + rec.getType());
        System.out.println("Thong tin hinh chu nhat: " + rec.toString());
        System.out.println("Ten hinh chu nhat: " + rec.getName());
        System.out.println("Mau sac: " + rec.getColor());
        System.out.println("Chieu rong: " + rec.getWidth());
        System.out.println("Chieu dai: " + rec.getLength());
        System.out.println("Chu vi: " + rec.getPerimeter());
        System.out.println("Hinh vuong? " + rec.isSquare());
        System.out.println("Duong cheo: " + rec.calDiagonalLine());
        double rate = 0.5;
        Rectangle resizedRec = rec.resize(rate);

        // double rate = 0.6;
        // Rectangle newRec = rec.resize(rate);

        System.out.println("Thong tin hinh chu nhat moi sau khi thay doi ti le:");
        System.out.println("Thong tin: " + resizedRec.toString());
        System.out.println("Chieu rong moi: " + resizedRec.getWidth());
        System.out.println("Chieu dai moi: " + resizedRec.getLength());
    }
}

