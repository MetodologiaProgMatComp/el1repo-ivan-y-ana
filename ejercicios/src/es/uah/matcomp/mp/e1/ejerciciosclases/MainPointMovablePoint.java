package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Point;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.MovablePoint;
public class MainPointMovablePoint {
    public static void main(String[] args){
        Point p= new Point(2,5);
        MovablePoint mp= new MovablePoint(4,5,9,12);
        System.out.println(p);
        System.out.println(mp);
        System.out.println("la coordenada x del punto es:"+p.getX());
        System.out.println("la coordenada y del punto es:"+p.getY());
        System.out.println("la nueva coordenada x del punto es:"+mp.getX());
        System.out.println("la nueva coordenada y del punto es:"+mp.getY());
        System.out.println("la velocidad con la que se desplaza en x es:"+mp.getXSpeed());
        System.out.println("la velocidad con la que se desplaza en y es:"+mp.getYSpeed());
    }
}
