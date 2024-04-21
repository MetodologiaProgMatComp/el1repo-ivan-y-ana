package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

import es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3.Dog;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    abstract void greets();
}
