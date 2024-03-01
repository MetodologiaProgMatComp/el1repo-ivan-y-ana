package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA4;

public MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x,int y,int,int xSpeed,int ySpeed,int radius){
        super(x,y,xSpeed,ySpeed);
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }
    @Override
    public String toString(){
        return super.toString() ",radius=" + radius;
    }
    public void moveUp(){
        this.y -= ySpeed;
    }
    public void moveDown(){
        this.y += ySpeed;
    }
    public void moveLeft(){
        this.x -= xSpeed;
    }
    public void moveRight(){
        this.x += xSpeed;
    }
}
