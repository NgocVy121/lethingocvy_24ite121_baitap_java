package oop6_6;

public class Test6_6 {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Cam");
        System.out.println(animal1);
        animal1.greets();
        System.out.println(animal1);

        Animal Dog1 = new Dog("Husky");
        System.out.println(Dog1);
        Dog1.greets();
        System.out.println(Dog1);

        Dog anotherDog = new Dog("Chihuahua");
        Dog.greets(anotherDog);

        BigDog BigDog = new BigDog("Pug");
        BigDog anotherBigDog = new BigDog("Thor");
        BigDog.greets();
        BigDog.greets(anotherDog);
        BigDog.greets(anotherBigDog);
    }
}
