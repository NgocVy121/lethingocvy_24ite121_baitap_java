package oop7_1;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer("ALice");
        customer1.setMember(true);
        customer1.setMemberType("Gold");

        Visit visit1 = new Visit(customer1, new Date());
        visit1.setServiceExpense(200);
        visit1.setProductExpense(100);

        System.out.println(visit1);

        Customer customer2 = new Customer("Kayle");
        customer2.setMember(true);
        customer2.setMemberType("Premium");

        Visit visit2 = new Visit(customer2, new Date());
        visit2.setServiceExpense(150);
        visit2.setProductExpense(80);

        System.out.println(visit2);

        Customer customer3 = new Customer("Yone");
        customer3.setMember(false);

        Visit visit3 = new Visit(customer3, new Date());
        visit3.setServiceExpense(100);
        visit3.setProductExpense(50);

        System.out.println(visit3);
    }
}
