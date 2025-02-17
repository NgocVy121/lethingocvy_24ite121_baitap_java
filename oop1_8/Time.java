package oop1_8;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
    }
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour!");;
        }
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if (minute >= 0 && minute <= 59) {
            this.minute=minute;
        } else {
            System.out.println("Invalid minute!");;
        }
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid second!");;
        }
    }
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        if (second > 0) {
            second--;
        } else {
            second = 59;
            if (minute > 0) {
                minute--;
            } else {
                minute = 59;
                if (hour > 0) {
                    hour--;
                } else {
                    hour = 23;
                }
            }
        }
        return this;
    }

}

