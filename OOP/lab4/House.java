public class House {
    private String houseCode = "A01";
    private int numOfBedRooms = 2;
    private boolean hasSwimmingPool = false;
    private double area = 0;
    private double costPerSquareMeter = 0;

    public House() {
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String getHouseCode() {
        return this.houseCode;
    }

    public int getNumOfBedRooms() {
        return this.numOfBedRooms;
    }

    public boolean getHasSwimmingPool() {
        return this.hasSwimmingPool;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }

    public void setHosecode(String houseCode) {
        this.houseCode = houseCode;
    }

    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double calculateSellingPrice() {
        double sum = this.area * this.costPerSquareMeter;
        if (this.hasSwimmingPool)
            sum += 250000;
        return sum;
    }

    public String toString() {
        return "House[" + houseCode + ", " + numOfBedRooms + ", " + hasSwimmingPool + ", " + calculateSellingPrice() + "]";
    }
}
