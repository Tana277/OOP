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
        System.out.println(rec.getType());
        System.out.println(rec.calDiagonalLine());
        double rate = 0.5;
        Rectangle resizeRectangle = rec.resize(rate);
        System.out.println("Thong tin hinh chu nhat mới: ");
        System.out.println(resizeRectangle.getWidth());
        System.out.println(resizeRectangle.getLength());
        System.out.println(resizeRectangle.toString());
        //Test all of methods which you implemented
    }
}
