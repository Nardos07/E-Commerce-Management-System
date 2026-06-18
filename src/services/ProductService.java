package services;

import models.Product;

import java.util.ArrayList;

public class ProductService {

    private ArrayList<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }

  
    public void viewProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product product : products) {
            product.displayProduct();
            System.out.println("--------------------");
        }
    }

  
    public Product searchProduct(int productId) {

        for (Product product : products) {

            if (product.getProductId() == productId) {
                return product;
            }
        }

        return null;
    }


    public boolean deleteProduct(int productId) {

        Product product = searchProduct(productId);

        if (product != null) {
            products.remove(product);
            return true;
        }

        return false;
    }


    public boolean updateQuantity(int productId, int quantity) {

        Product product = searchProduct(productId);

        if (product != null) {
            product.setQuantity(quantity);
            return true;
        }

        return false;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
