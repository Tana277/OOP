public class bai2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3,5);
        System.out.println(rec.getWidth());
        System.out.println(rec.getLength());
        System.out.println(rec.getArea());
        rec.setWidth(4.5f);
        rec.setLength(5.6f);
        System.out.println(rec.toString());
    }
}

