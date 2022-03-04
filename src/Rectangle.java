public class Rectangle {
    private double length;
    private double width;
    //constructor
    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }
    //getLength
    public double getLength()
    {
        return length;
    }
    //getWidth
    public double getWidth() {
        return width;
    }
    //getArea
    public double getArea() {
        return length * width;
    }
    public void  printInfo(){
        System.out.println("Length: "+ length);
        System.out.println("Width: "+ width);
    }
}
