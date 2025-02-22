package oop3_4;

public class Test {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(10, 10, 10);
        System.out.println(t1);

        t1.setHour(13);
        t1.setMinute(15);
        t1.setSecond(20);
        System.out.println(t1);

        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        System.out.println("Next second: " + t1.nextSecond());
        System.out.println("Next minute: " + t1.nextMinute());
        System.out.println("Next hour: " + t1.nextHour());

        System.out.println("Previous second: " + t1.previousSecond());
        System.out.println("Previous minute: " + t1.previousMinute());
        System.out.println("Previous hour: " + t1.previousHour());

        // Test boundary conditions
        MyTime t2 = new MyTime(23, 59, 59);
        System.out.println("Next second of 23:59:59: " + t2.nextSecond());

        MyTime t3 = new MyTime(0, 0, 0);
        System.out.println("Previous second of 00:00:00: " + t3.previousSecond());

        // Test invalid input
        try {
            MyTime t4 = new MyTime(25, 60, 60);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}