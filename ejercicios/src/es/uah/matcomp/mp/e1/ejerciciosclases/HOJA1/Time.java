package es.uah.matcomp.mp.e1.ejerciciosclases.HOJA1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        if (this.hour < 10){
            if (this.minute < 10) {
                if (this.second < 10) {
                    return "0" + hour + ":0" + minute + ":0" + second;
                }else{
                    return "0" + hour + ":0" + minute + ":" + second;
                }
            }else{
                if (this.second < 10) {
                    return "0" + hour + ":" + minute + ":0" + second;
                }else{
                    return "0" + hour + ":" + minute + ":" + second;
                }
            }
        }else {
            if (this.minute < 10) {
                if (this.second < 10) {
                    return hour + ":0" + minute + ":0" + second;
                }else{
                    return hour + ":0" + minute + ":" + second;
                }
            }else {
                if (this.second < 10) {
                    return hour + ":" + minute + ":0" + second;
                }else{
                    return hour + ":" + minute + ":" + second;
                }
            }
        }
    }
    public Time nextSecond(){
        second++;
        if (second >= 60){
            second = 0;
            minute++;
            if (minute >= 60){
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond(){
        second--;
        if (second < 0){
            second = 59;
            minute--;
            if (minute < 0){
                minute = 59;
                hour--;
                if (hour < 0){
                    hour = 23;
                }
            }
        }
        return this;
    }
}
