package oop4_2;

public class TestStaff {
    public static void main(String[] args) {
        Person p1 = new Person("Vy","Quang Nam");
        System.out.println(p1);
        Student s1 = new Student("Vy","Quang Nam", "4", 2024, 18);
        System.out.println(s1);
        Staff f1 = new Staff("Vy", "Quang Nam", "VKU", 900.05);
        System.out.println(f1);

    }
}
