package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyPoint;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA2.MyTriangle;
public class MainMyTriangle {
    public static void main(String[] args){
        // Creamos puntos del triángulo
        MyPoint point1= new MyPoint(0,0);
        MyPoint point2= new MyPoint(2,3);
        MyPoint point3= new MyPoint(0,2);
        // Creamos el triángulo
        MyTriangle triangle= new MyTriangle(point1,point2,point3);
        // Imprimimos el triángulo
        System.out.println("El triángulo es:"+triangle.toString());
        // Calculamos y mostramos el perímetro del triangulo
        System.out.println("El perímetro es:"+triangle.getPerimeter());
        // Mostraremos el tipo de triangulo que es
        System.out.println("El tipo es:"+triangle.getType());
    }
}
