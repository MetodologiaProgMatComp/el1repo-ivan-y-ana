package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class MainAnimal {
    public static void main(String[] args){
        Animal a1 = new Cat("Coco");
        a1.greets();

        Cat c1 = (Cat)a1;
        c1.greets();

        Animal a2 = new Dog("Pumba");
        a2.greets();

        Dog d1 = (Dog)a2;
        d1.greets();
        d1.greets(Dog 2);

        Animal a3 = new BigDog("Rufus");
        a3.greets();

        BigDog b1 = (BigDog)a3;
        b1.greets();
        b1.greets(BigDog 2);

    }
}
