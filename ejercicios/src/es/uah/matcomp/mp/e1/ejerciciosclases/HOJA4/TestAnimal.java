package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the subclasses
        Cate cat1 = new Cate();
        cat1.greeting();
        Doge dog1 = new Doge();
        dog1.greeting();
        BigDoge bigDog1 = new BigDoge();
        bigDog1.greeting();


        // Using Polymorphism
        Animale animal1 = new Cate();
        animal1.greeting();
        Animale animal2 = new Doge();
        animal2.greeting();
        Animale animal3 = new BigDoge();
        animal3.greeting();
        //Animale animal4 = new Animale(); //Solo hay 3 animales


        // Downcast
        Doge dog2 = (Doge)animal2;
        BigDoge bigDog2 = (BigDoge)animal3;
        //Doge dog3 = (Doge)animal3;
        Cate cat2 = (Cate)animal1; // Cambiado por animal1
        dog2.greeting();
        //dog3.greeting(); // Ya teníamos 1 Dog
        cat2.greeting(); //Cambiado por el gato
        bigDog2.greeting();
        //bigDog2.greeting(); //Me sobra 1
        // Por qué mete palabras dentro?
    }
}
