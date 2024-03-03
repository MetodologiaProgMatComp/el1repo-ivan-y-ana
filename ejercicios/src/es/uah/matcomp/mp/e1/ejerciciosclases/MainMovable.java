package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Movable;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.MovableCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.MovablePoint;

public class MainMovable {
    public static void main(String [] args){
        Movable m1 = new MovablePoint(2,3,4,5);
        System.out.println(m1);

        MovablePoint p1 = (MovablePoint)m1;
        System.out.println(p1);

        Movable m2 = new MovableCircle(2,3,4,5,6);
        System.out.println(m2);

        MovableCircle c1 = (MovableCircle)m2;
        System.out.println(c1);

    }
}
