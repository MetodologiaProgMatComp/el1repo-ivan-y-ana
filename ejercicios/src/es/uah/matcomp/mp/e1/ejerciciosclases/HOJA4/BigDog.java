package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class BigDog extends Dog {
    //El override solo se pone en los métodos que tienen (super) y en los metodos heredados de la superclase
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Wooow");
    }
    @Override
    public void greets(Dog another){
        System.out.println("Wooooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
