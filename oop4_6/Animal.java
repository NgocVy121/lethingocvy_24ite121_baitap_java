package oop4_6;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}