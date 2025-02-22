package oop7_1;
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date) { // Nhận trực tiếp Customer
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense() {
        double serviceDiscount = customer.isMember() ? DiscountRate.getServiceDiscountRate(customer.getMemberType()) : 0;
        double productDiscount = customer.isMember() ? DiscountRate.getProductDiscountRate() : 0;

        double totalServiceCost = serviceExpense * (1 - serviceDiscount);
        double totalProductCost = productExpense * (1 - productDiscount);

        return totalServiceCost + totalProductCost;
    }

    public String toString() {
        return "Visit[customer=" + customer + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + ", totalExpense=" + getTotalExpense() + "]";
    }
}
