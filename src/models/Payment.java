package models;

public class Payment {

    private int paymentId;
    private String paymentMethod;
    private double amount;

    public Payment() {
    }

    public Payment(int paymentId, String paymentMethod, double amount) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amount: " + amount);
    }
}
