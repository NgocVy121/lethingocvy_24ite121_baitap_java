package oop2_4;

public class Invoice {
    private int id;
    private TheCustomer customer;
    private double amount;

    public Invoice(int id, TheCustomer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public TheCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(TheCustomer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount * (1 - customer.getDiscount() / 100.0);
    }

    @Override
    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }
}
