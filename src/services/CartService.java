package services;

import models.Cart;
import models.CartItem;
import models.Product;

public class CartService {

    public void addProductToCart(
            Cart cart,
            Product product,
            int quantity) {

        CartItem item =
                new CartItem(product, quantity);

        cart.addItem(item);
    }

    public void removeProductFromCart(
            Cart cart,
            int productId) {

        cart.removeItem(productId);
    }

    public void viewCart(Cart cart) {
        cart.viewCart();
    }

    public double getCartTotal(Cart cart) {
        return cart.calculateTotal();
    }
}
