package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        if (this.day < 10){
            if (this.month < 10) {
                return "0" + day + "/0" + month + "/" + year;
            }else{
                return "0" + day + "/" + month + "/" + year;
            }
        }else {
            if (this.month < 10) {
                return day + "/0" + month + "/" + year;
            }else {
                return day + "/" + month + "/" + year;
            }
        }

    }
}
