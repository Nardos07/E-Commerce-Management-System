package models;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private Customer customer;
    private ArrayList<OrderItem> items;
    private double totalAmount;


    public Order() {
        items = new ArrayList<>();
    }


    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {

        totalAmount = 0;

        for (OrderItem item : items) {
            totalAmount += item.calculateSubtotal();
        }

        return totalAmount;
    }

    public void displayOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());

        for (OrderItem item : items) {

            System.out.println(
                    item.getProduct().getName()
                            + " x "
                            + item.getQuantity()
            );
        }

        System.out.println("Total Amount: " + calculateTotal());
    }
}

