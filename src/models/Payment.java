package models;

public abstract class Payment {

    protected double amount;


    public Payment() {
    }


    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}
