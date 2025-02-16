package oop4_6;

public class Test4_6 {
    public static void main(String[] args) {
        Animal a1 = new Animal("ĐVat");
        System.out.println(a1);
        Mammal m1 = new Mammal("mm");
        System.out.println(m1);
        Cat c1 = new Cat("MaineCoon");
        System.out.println(c1);
        c1.greets();
        Dog d1 = new Dog("Husky");
        System.out.println(d1);
        d1.greets();
        Dog d2 = new Dog("Chihuahua");
        System.out.println(d2);
        d2.greets(d2);
    }


}
