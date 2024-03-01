package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class MainShape {
    Shape s1 = new Circle1(5.5, "red", false); // Upcast Circle to Shape
    System.out.println(s1); // which version?
    System.out.println(s1.getArea()); // which version?
    System.out.println(s1.getPerimeter()); // which version?
    System.out.println(s1.getColor());
    System.out.println(s1.isFilled());
    System.out.println(s1.getRadius());
    Circle1 c1 = (Circle1)s1; // Downcast back to Circle
    System.out.println(c1);
    System.out.println(c1.getPerimeter());
    System.out.println(c1.getColor());
    System.out.println(c1.isFilled());
    System.out.println("radius is: " + c1.getRadius()));
// Test getArea() and getCircumference()
    System.out.println("area is: %.2f%n", c1.getArea());
    System.out.println("circumference is: %.2f%n", c1.getCircumference());

}
