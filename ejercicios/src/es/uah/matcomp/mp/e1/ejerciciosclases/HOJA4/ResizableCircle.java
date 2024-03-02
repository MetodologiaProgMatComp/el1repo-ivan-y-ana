package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public class ResizableCircle extends Circle3 implements Resizable {

    //Constructor
    public ResizableCircle(double radius){
        super(radius);
    }
    // Implement methods defined in the interface Resizable
    @Override
    public String toString(){
        return "ResizableCircle[" + super.toString();
    }
    @Override
    public void resize(int percent){
        radius *= percent/100.0;
    }
}
