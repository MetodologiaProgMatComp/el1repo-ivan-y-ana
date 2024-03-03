package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Animale;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.BigDoge;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Cate;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Doge;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cate cat1 = new Cate();
        cat1.greeting(); //Meow!
        Doge dog1 = new Doge();
        dog1.greeting(); //Woof!
        BigDoge bigDog1 = new BigDoge();
        bigDog1.greeting(); //Woow!
        // Using Polymorphism
        Animale animal1 = new Cate(); //Meow!
        animal1.greeting();
        Animale animal2 = new Doge(); //Woof!
        animal2.greeting();
        Animale animal3 = new BigDoge(); //Woow!
        animal3.greeting();
        //Animale animal4 = new Animale(); // da error
        // Downcast da error
        Doge dog2 = (Doge)animal2;
        BigDoge bigDog2 = (BigDoge)animal3;
        Doge dog3 = (Doge)animal3;
        Cate cat2 = (Cate)animal2;
        //dog2.greeting(dog3);
        //dog3.greeting(dog2);
        //dog2.greeting(bigDog2);
        //bigDog2.greeting(dog2);
        //bigDog2.greeting(bigDog1);
    }
}
