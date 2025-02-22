package oop2_5;

public class Test {
    public static void main(String[] args) {
        TheCustomer customer= new TheCustomer(121,"Ngoc Vy",'f');
        Account account =  new Account(24,customer,1000.0);

        System.out.println(account);
        account.deposit(100.0).withdraw(1099.0);
        System.out.println(account);

        account.withdraw(1110.0);
        System.out.println(account);


    }
}
