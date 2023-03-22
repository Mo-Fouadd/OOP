import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner objScnr = new Scanner(System.in);

        System.out.println("Enter the triangle 3-sides: ");
        double side1 = objScnr.nextDouble();
        double side2 = objScnr.nextDouble();
        double side3 = objScnr.nextDouble();

        System.out.println("Enter the triangle color: ");
        String color = objScnr.next();

        System.out.println("Enter the triangle `true` or `false` to indi4cate if triangle is filled: ");
        boolean filled = objScnr.nextBoolean();

        Triangle t = new Triangle(side1, side2, side3);

        t.setColor(color);
        t.setFilled(filled);

        System.out.println(t.toString());

        System.out.println("Area of the triangle: " + t.getArea());
        System.out.println("Perimeter of the triangle: " + t.getPerimeter());
        System.out.println("Color of the triangle: " + t.getColor());
        System.out.println("Is triangle filled?" + t.isFilled());


        System.out.println(t.getDateCreated());
    }
}