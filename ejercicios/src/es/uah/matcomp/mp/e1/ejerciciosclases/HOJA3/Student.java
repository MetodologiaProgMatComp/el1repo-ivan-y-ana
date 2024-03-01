package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA3;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name,String address,String program,int year,double fee){
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }
    public String getProgram(){
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString(){
        return "Student["+super.toString()+", program="+program+", year="+year+", fee="+fee+"]";
    }

}