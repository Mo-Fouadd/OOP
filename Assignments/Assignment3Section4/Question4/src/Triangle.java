public class Triangle extends GeometricObject{
    //Design a new Triangle class that extends the abstract GeometricObject class. Draw the UML
    //diagram for the classes Triangle and GeometricObject and then implement the Triangle class. Write
    //a test program that prompts the user to enter three sides of the triangle, a color, and a
    //Boolean value to indicate whether the triangle is filled. The program should create a Triangle object
    //with these sides and set the color and filled properties using the input. The program should display
    //the area, perimeter, color, and true or false to indicate whether it is filled or not
    private double side1, side2, side3 =1;

    public Triangle() {}

    public Triangle (String color, boolean filled, double side1, double side2, double side3){
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        return side1 * side2 * side3;
    }

    public double getPerimeter() {
        return side1 + side2 +side3;
    }

    @Override
    public String toString(){
        return  "Area = " + getArea() + " Perimeter = " + getPerimeter()
                + " Color = " + getColor() + " Is Filled? =  " + isFilled();

    }

}
