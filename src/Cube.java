public class Cube extends Rectangle{
    private  double height;
    public Cube(double l , double w, double h){
        super(l,w);
        height =h;
    }

    public double getHeight(){
        return height;
    }
    public double getSurfaceArea(){
        return getArea() *6;
    }
    public double getVolume(){
        return getArea() * height;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Height: "+height);
    }
}
