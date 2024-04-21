package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Dog;

public class Cat extends Animal {

    //Constructor, no se pone override
    public Cat(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
