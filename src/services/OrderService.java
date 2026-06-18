package services;

import models.Order;

import java.util.ArrayList;

public class OrderService {

    private ArrayList<Order> orders;

    public OrderService() {
        orders = new ArrayList<>();
    }


    public void createOrder(Order order) {
        orders.add(order);
    }


    public void viewOrders() {

        if (orders.isEmpty()) {
            System.out.println("No orders available.");
            return;
        }

        for (Order order : orders) {
            order.displayOrder();
            System.out.println("--------------------");
        }
    }


    public Order searchOrder(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {
                return order;
            }
        }

        return null;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
