package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.BigDog;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4.Dog;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cat cat1 = new Cat("Loli");
        cat1.greets(); //Meow!
        Dog dog1 = new Dog("Perri");
        dog1.greets(); //Woof!
        BigDog bigDog1 = new BigDog("Dori");
        bigDog1.greets(); //Woow!
        // Using Polymorphism no sale mediante polimorfismo
        //Animal animal1 = new Cat("Loli"); //Meow!
        //animal1.greets();
        //Animal animal2 = new Dog("Perri"); //Woof!
        //animal2.greets();
        //Animal animal3 = new BigDog("Dori"); //Woow!
        //animal3.greets();
        //Animale animal4 = new Animale(); // da error
        // Downcast da error
        //Dog dog2 = (Dog)animal2;
        //BigDog bigDog2 = (BigDog)animal3;
        //Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2;
        //dog2.greeting(dog3);
        //dog3.greeting(dog2);
        //dog2.greeting(bigDog2);
        //bigDog2.greeting(dog2);
        //bigDog2.greeting(bigDog1);
    }
}
