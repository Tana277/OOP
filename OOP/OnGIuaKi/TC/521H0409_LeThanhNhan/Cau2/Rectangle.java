public class Rectangle {
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len) {
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String getType() {
        double area = width * length;
        if (area >= 10) {
            return "A";
        } else if (area >= 5) {
            return "B";
        } else {
            return "C";
        }
    }

    public boolean isSquare() {
        return width == length;
    }

    public double calDiagonalLine() {
        return Math.sqrt(width * width + length * length);
    }

    public Rectangle resize(double rate) {
        double newWidth = width * rate;
        double newLength = length * rate;
        return new Rectangle(name, color, newWidth, newLength);
    }

    @Override
    public String toString() {
        double area = width * length;
        String type = getType();
        return "Rectangle[" + name + ", " + length + ", " + width + ", " + area + ", " + type + "]";
    }
}
