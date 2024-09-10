public class bai4 {
    public static void main(String[] args) {
        House h = new House();
        System.out.println(h.getHouseCode());
        System.out.println(h.getNumOfBedRooms());
        System.out.println(h.getHasSwimmingPool());
        System.out.println(h.getArea());
        System.out.println(h.getCostPerSquareMeter());
        House b = new House("A101",2,true,100,50000);
        System.out.println(b.getHouseCode());
        System.out.println(b.getNumOfBedRooms());
        System.out.println(b.getHasSwimmingPool());
        System.out.println(b.getArea());
        System.out.println(b.getCostPerSquareMeter());
        h.setHosecode("A102");
        h.setNumOfBedRooms(2);
        h.setHasSwimmingPool(true);
        h.setArea(100);
        h.setCostPerSquareMeter(300000);
        System.out.println("Selling price: " + h.calculateSellingPrice());
        System.out.println(h.toString());
    }
}

