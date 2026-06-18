package services;

import models.Payment;

import java.util.ArrayList;

public class PaymentService {

    private ArrayList<Payment> payments;

    public PaymentService() {
        payments = new ArrayList<>();
    }


    public void addPayment(Payment payment) {
        payments.add(payment);
    }


    public void viewPayments() {

        if (payments.isEmpty()) {
            System.out.println("No payments available.");
            return;
        }

        for (Payment payment : payments) {
            payment.displayPayment();
            System.out.println("--------------------");
        }
    }


    public Payment searchPayment(int paymentId) {

        for (Payment payment : payments) {

            if (payment.getPaymentId() == paymentId) {
                return payment;
            }
        }

        return null;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }
}