class TestRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle("Ruby", "Red", 6, 8);       
        System.out.println(rec.getType());
        System.out.println(rec.toString());
        System.out.println(rec.getName());
        System.out.println(rec.getColor());
        System.out.println(rec.getWidth());
        System.out.println(rec.getLength());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.calDiagonalLine());
        System.out.println(rec.isSquare());
        double rate = 0.5;
        Rectangle resized = rec.resize(rate);
        System.out.println("Thong tin moi cua hinh chu nhat");
        System.out.println(resized.getWidth());
        System.out.println(resized.getLength());
        System.out.println(resized.toString());
        //Test all of methods which you implemented
    }
}
