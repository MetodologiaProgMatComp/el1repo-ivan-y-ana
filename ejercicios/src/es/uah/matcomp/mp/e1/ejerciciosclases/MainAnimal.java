package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.BigDog;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Dog;

public class MainAnimal {
    public static void main(String[] args){
        //No se puede hacer mediante polimorfismo porque Animal es una clase abstracta
        //Por tanto lo haremos usando subclases
        Cat c1 = new Cat("Coco");
        System.out.println("Coco hace:");
        c1.greets();

        Dog d1 = new Dog("Luna");
        System.out.println("Luna hace:");
        d1.greets();

        Dog d2 = new Dog("Tego");
        System.out.println("Tego hace:");
        d2.greets(d2); //Metemos d2 para que haga el siguiente sonido

        BigDog b1 = new BigDog("Rufus");
        System.out.println("Rufus hace:");
        b1.greets();

        BigDog b2 = new BigDog("Pancho");
        System.out.println("Pancho hace:");
        b2.greets(d2); //Metemos b2 para que haga el siguiente sonido

        BigDog b3 = new BigDog("Digi");
        System.out.println("Digi hace:");
        b3.greets(b3); //Metemos b3 para que haga el siguiente sonido
    }
}
