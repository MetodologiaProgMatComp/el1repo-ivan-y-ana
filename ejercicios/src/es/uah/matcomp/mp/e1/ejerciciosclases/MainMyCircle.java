package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyPoint;

public class MainMyCircle {
    public static void main(String[] args){
        // Centro y radio del círculo
        MyPoint center=new MyPoint(0,0);
        int radius=1;
        // Creamos MyCircle
        MyCircle circle1=new MyCircle(center,radius);
        MyCircle circle2=new MyCircle(center,radius);
        // Mostramos info sobre los círculos
        System.out.println("El círculo 1 es:"+circle1);
        System.out.println("El círculo 2 es:"+circle2);
        //Calculamos y mostramos la distancia entre los centros
        double distanceBetweenCenters = circle1.distance(circle2);
        System.out.println("La distancia entre los centros es:"+distanceBetweenCenters);
    }
}
