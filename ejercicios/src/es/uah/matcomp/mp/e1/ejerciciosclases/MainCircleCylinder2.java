package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Circle;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Cylinder2;
public class MainCircleCylinder2 {
    public static void main(String[] args){
        Circle c= new Circle(20);
        Cylinder2 cy= new Cylinder2(30,10);
        System.out.println(c);
        System.out.println(cy);
        System.out.println("el radio del círculo es:"+c.getRadius());
        System.out.println("el área del círculo es:"+c.getArea());
        System.out.println("el perímetro del círculo es:"+c.getPerimeter());
        System.out.println("la altura del cilindro es:"+cy.getHeight());
        System.out.println("el radio de la base del cilindro es:"+cy.getBaseRadius());
        System.out.println("el área de la base del cilindro es:"+cy.getBaseArea());
        System.out.println("el volumen del cilindro es:"+cy.getVolume());

    }
}
