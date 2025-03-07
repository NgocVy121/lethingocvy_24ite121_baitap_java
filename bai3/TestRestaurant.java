package bai3;

public class TestRestaurant {
    public static void main(String[] args) {
        Table table = new Table();

        Thread chef = new Thread(table::cook);
        Thread customer = new Thread(table::eat);

        chef.start();
        customer.start();
    }
}
