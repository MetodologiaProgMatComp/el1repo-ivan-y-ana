package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Circle3;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.GeometricObject2;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Resizable;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.ResizableCircle;

public class MainGeometricObject2 {
    public static void main(String [] args){
        GeometricObject2 g1 = new Circle3(2);
        System.out.println(g1);
        System.out.println(g1.getPerimeter());
        System.out.println(g1.getArea());

        Circle3 c1 = (Circle3)g1;
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());

        Resizable r1 = new ResizableCircle(2);
        System.out.println(r1);

        Circle3 c2 = (ResizableCircle)r1;
        System.out.println(c2);
    }
}
