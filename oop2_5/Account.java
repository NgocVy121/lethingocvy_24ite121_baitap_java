package oop2_5;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private TheCustomer customer;
    private double balance = 0.0;

    public Account(int id, TheCustomer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, TheCustomer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return customer.toString() + " balance=$" + df.format(balance);
    }
}
