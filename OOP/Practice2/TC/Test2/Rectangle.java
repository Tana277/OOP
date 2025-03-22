public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        //code here
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        //code here and correct the return value
        return name;
    }

    public String getColor(){
        //code here and correct the return value
        return color;
    }

    public double getWidth(){
        //code here and correct the return value
        return width;
    }
    public double getLength(){
        //code here and correct the return value
        return length;
    }

    public void setName(String name){
        //code here
        this.name = name;
    }

    public void setColor(String color){
        //code here
        this.color = color;
    }

    public void setWidth(double width){
        //code here
        this.width = width;
    }

    public void setLength(double length){
        //code here
        this.length = length;
    }

    public double getPerimeter(){
        //code here and correct the return value
        return 2 * (width + length);
    }

    public String getType(){
        //code here and correct the return value
        double area = width * length;
        if(area >= 10){
            return "A";
        } else if (area >= 5){
            return "B";
        } else {
            return "C";
        }
    }
	
	public boolean isSquare(){
        //code here and correct the return value
        return width == length;
    }

    public double calDiagonalLine(){
        //code here and correct the return value
        return Math.sqrt(width * width + length * length);
    }

    public Rectangle resize(double rate){
        //code here and correct the return value
        double newWidth = width * rate;
        double newLength = length * rate;
        return new Rectangle(name, color, newWidth, newLength);
    }

    public String toString(){
        //code here and correct the return value
        double area = width * length;
        String type = getType();
        return "Rectangle[" + name + ", " + length + ", " + width + ", " + area + ", " + type + "]"; 
    }
}