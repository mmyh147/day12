//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Circle c1 = new Circle("Blue", true, 3);
       Circle c2 = new Circle(5);
       Circle c3 = new Circle();

        System.out.println("===============================================");
        System.out.println("The radius of the circle: " + c1.getRadius());
        System.out.println("The color of the circle: " + c1.getColor());
        System.out.println("Filled: " + c1.isFilled());
        System.out.println("The perimeter: " + c1.getPerimeter());
        System.out.println(c1.toString());
        System.out.println("===============================================");
        System.out.println("The radius of the circle: " + c2.getRadius());
        System.out.println("The color of the circle: " + c2.getColor());
        System.out.println("Filled: " + c2.isFilled());
        System.out.println("The perimeter: " + c2.getPerimeter());
        System.out.println(c2.toString());
        System.out.println("===============================================");
        c3.setRadius(4);
        System.out.println("The radius of the circle: " + c3.getRadius());
        System.out.println("The color of the circle: " + c3.getColor());
        System.out.println("Filled: " + c3.isFilled());
        System.out.println("The perimeter: " + c3.getPerimeter());
        System.out.println(c3.toString());
        System.out.println("===============================================");



        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(7, 8);
        Rectangle R3 = new Rectangle("Red",false, 5, 7);

        R1.setLength(10);
        R1.setWidth(15);
        R1.setColor("Yellow");
     System.out.println("===============================================");
     System.out.println("The length of the Rectangle: " + R1.getLength());
     System.out.println("The width of the Rectangle: " + R1.getWidth());
     System.out.println("The area of the Rectangle: " + R1.getArea());
     System.out.println("The perimeter of the Rectangle: " + R1.getPerimeter());
     System.out.println("the color: " + R1.getColor());
     System.out.println("Filled: " + R1.isFilled());
     System.out.println(R1.toString());
     System.out.println("===============================================");
     System.out.println("The length of the Rectangle: " + R2.getLength());
     System.out.println("The width of the Rectangle: " + R2.getWidth());
     System.out.println("The area of the Rectangle: " + R2.getArea());
     System.out.println("The perimeter of the Rectangle: " + R2.getPerimeter());
     System.out.println("the color: " + R2.getColor());
     System.out.println("Filled: " + R2.isFilled());
     System.out.println(R2.toString());
     System.out.println("===============================================");
     System.out.println("The length of the Rectangle: " + R3.getLength());
     System.out.println("The width of the Rectangle: " + R3.getWidth());
     System.out.println("The area of the Rectangle: " + R3.getArea());
     System.out.println("The perimeter of the Rectangle: " + R3.getPerimeter());
     System.out.println("the color: " + R3.getColor());
     System.out.println("Filled: " + R3.isFilled());
     System.out.println(R3.toString());
     System.out.println("===============================================");


     Square s1 = new Square();
     Square s2 = new Square(5);
     Square s3 = new Square("Black", true, 3);
     s1.setSide(10);
     s1.setColor("White");
     System.out.println("===============================================");
     System.out.println("The side of the Square: " + s1.getSide());
     System.out.println("The area of the Rectangle: " + s1.getArea());
     System.out.println("The perimeter of the Rectangle: " + s1.getPerimeter());
     System.out.println("the color: " + s1.getColor());
     System.out.println("Filled: " + s1.isFilled());
     System.out.println(s1.toString());
     System.out.println("===============================================");
     System.out.println("The side of the Square: " + s2.getSide());
     System.out.println("The area of the Rectangle: " + s2.getArea());
     System.out.println("The perimeter of the Rectangle: " + s2.getPerimeter());
     System.out.println("the color: " + s2.getColor());
     System.out.println("Filled: " + s2.isFilled());
     System.out.println(s2.toString());
     System.out.println("===============================================");
     System.out.println("The side of the Square: " + s3.getSide());
     System.out.println("The area of the Rectangle: " + s3.getArea());
     System.out.println("The perimeter of the Rectangle: " + s3.getPerimeter());
     System.out.println("the color: " + s3.getColor());
     System.out.println("Filled: " + s3.isFilled());
     System.out.println(s3.toString());
     System.out.println("===============================================");

    }
}