package oop6_6;

public class BigDog extends Dog{
    BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    public static void greets(Dog another) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooow");
    }
}