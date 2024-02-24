package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyPoint;

public class MainMyLine {
    public static void main(String[] args){
        // Creamos dos puntos
        MyPoint punto1=new MyPoint(2,3);
        MyPoint punto2=new MyPoint(5,6);
        // Mostramos los dos puntos
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        // Calculamos y mostramos la distancia entre los puntos
        System.out.println("La distancia entre los dos puntos es:"+punto1.distance(punto2));
        // Creamos una linea con los dos puntos
        MyLine line=new MyLine(punto1,punto2);
        // Mostramos la linea
        System.out.println(line.toString());
        // Obtenemos la longitud de la linea
        System.out.println("La longitud es:"+line.getLength());
        // Obtenemos el ángulo de la linea
        System.out.println("El ángulo es:"+line.getGradient());
    }
}
