package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Circle2;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.GeometricObject1;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Rectangle2;

public class MainGeometricObject1 {
    public static void main(String[] args){
        GeometricObject1 g1 = new Circle2(5.5);
        System.out.println(g1); // which version?
        System.out.println(g1.getArea()); // which version?
        System.out.println(g1.getPerimeter());

        Circle2 c1 = (Circle2)g1; // Downcast back to Circle2
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        GeometricObject1 g2 = new Rectangle2(1.0, 2.0);
        System.out.println(g2); // which version?
        System.out.println(g2.getArea()); // which version?
        System.out.println(g2.getPerimeter());

        Rectangle2 r1 = (Rectangle2)g2; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
