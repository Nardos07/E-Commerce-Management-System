package models;

import java.util.ArrayList;

public class Cart {

    private int cartId;
    private ArrayList<CartItem> items;


    public Cart() {
        items = new ArrayList<>();
    }

    public Cart(int cartId) {
        this.cartId = cartId;
        this.items = new ArrayList<>();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(int productId) {

        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).getProduct().getProductId() == productId) {
                items.remove(i);
                break;
            }
        }
    }

    public void viewCart() {

        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (CartItem item : items) {

            System.out.println(
                    item.getProduct().getName()
                            + " x "
                            + item.getQuantity()
            );
        }
    }

    public double calculateTotal() {

        double total = 0;

        for (CartItem item : items) {
            total += item.calculateSubtotal();
        }

        return total;
    }
}
