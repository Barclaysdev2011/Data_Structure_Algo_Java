import java.util.Scanner;

public class CudeMain {
    public static void main(String[]args){
        double length, width, height;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter length");
        length = scan.nextDouble();

        System.out.println("Enter width");
        width = scan.nextDouble();

        System.out.println("Enter height");
        height = scan.nextDouble();

        Cube cube = new Cube(length,width,height);

        System.out.println("Cube Properties :");

        cube.printInfo();
        System.out.println("Base Area: "+cube.getArea());
        System.out.println("Surface area: "+cube.getSurfaceArea());
        System.out.println("Volume: "+cube.getVolume());
    }
}
