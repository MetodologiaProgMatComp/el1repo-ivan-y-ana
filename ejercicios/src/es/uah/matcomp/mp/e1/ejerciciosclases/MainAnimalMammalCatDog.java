package es.uah.matcomp.mp.e1.ejerciciosclases;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Animal;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Mammal;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Cat;
import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Dog;
public class MainAnimalMammalCatDog {
    public static void main(String[] args){
        Animal a= new Animal("perro");
        Mammal m= new Mammal("mamut");
        Cat c= new Cat("Coco");
        Dog d1= new Dog("Luna");
        Dog d2= new Dog("Tego");
        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        System.out.println(d1);
        System.out.println("Coco hace:");
        c.greets();
        System.out.println("Luna hace:");
        d1.greets();
        System.out.println("Tego hace:");
        d2.greets(d2);
    }
}

