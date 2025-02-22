package oop2_5;

public class TheCustomer {
    private int id;
    private String name;
    private char gender; // 'm' hoặc 'f'

    public TheCustomer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
