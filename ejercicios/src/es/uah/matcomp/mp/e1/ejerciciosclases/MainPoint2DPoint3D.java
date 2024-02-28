package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Point2D;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Point3D;
public class MainPoint2DPoint3D {
    public static void main(String[] args){
        Point2D p2= new Point2D(2,7);
        Point3D p3= new Point3D(7,9,12);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("la coordenada x del punto en 2D es:"+p2.getX());
        System.out.println("la coordenada y del punto en 2D es:"+p2.getY());
        System.out.println("la coordenada x del punto en 3D es:"+p3.getX());
        System.out.println("la coordenada y del punto en 3D es:"+p3.getY());
        System.out.println("la coordenada z del punto en 3D es:"+p3.getZ());
    }
}
