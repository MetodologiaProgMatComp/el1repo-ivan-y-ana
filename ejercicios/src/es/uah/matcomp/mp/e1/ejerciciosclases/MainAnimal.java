package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.BigDog;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Dog;

public class MainAnimal {
    public static void main(String[] args){
        //Animal a1 = new Animal("perro");
        Cat c1 = new Cat("Coco");
        Dog d1 = new Dog("Luna");
        Dog d2 = new Dog("Tego");
        BigDog b1 = new BigDog("Rufus");
        BigDog b2 = new BigDog("Pancho");
        BigDog b3 = new BigDog("Digi");

        System.out.println("Coco hace:");
        c1.greets();
        System.out.println("Luna hace:");
        d1.greets();
        System.out.println("Tego hace:");
        d2.greets(d2);
        System.out.println("Rufus hace:");
        b1.greets();
        System.out.println("Pancho hace:");
        b2.greets(d2);
        System.out.println("Digi hace:");
        b3.greets(b3);
    }
}
