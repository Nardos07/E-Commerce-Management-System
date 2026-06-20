package main;

import models.Customer;
import models.Payment;
import models.Product;

import services.UserService;
import services.ProductService;
import services.PaymentService;

import utils.InputHelper;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        ProductService productService = new ProductService();
        PaymentService paymentService = new PaymentService();

        int choice;

        do {

            System.out.println("\n===== E-Commerce Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Register Customer");
            System.out.println("6. View Customers");
            System.out.println("7. Add Payment");
            System.out.println("8. View Payments");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = InputHelper.getInt();

            switch (choice) {

                case 1:

                    System.out.print("Product ID: ");
                    int productId = InputHelper.getInt();

                    System.out.print("Name: ");
                    String productName = InputHelper.getString();

                    System.out.print("Category: ");
                    String category = InputHelper.getString();

                    System.out.print("Price: ");
                    double price = InputHelper.getDouble();

                    System.out.print("Quantity: ");
                    int quantity = InputHelper.getInt();

                    Product product =
                            new Product(
                                    productId,
                                    productName,
                                    category,
                                    price,
                                    quantity
                            );

                    productService.addProduct(product);

                    System.out.println("Product Added Successfully.");
                    break;

                case 2:

                    productService.viewProducts();
                    break;
                case 3:

                    System.out.print("Enter Product ID: ");
                    int searchId = InputHelper.getInt();

                    Product foundProduct =
                            productService.searchProduct(searchId);

                    if (foundProduct != null) {
                        foundProduct.displayProduct();
                    } else {
                        System.out.println("Product Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = InputHelper.getInt();

                    if (productService.deleteProduct(deleteId)) {
                        System.out.println("Product Deleted Successfully.");
                    } else {
                        System.out.println("Product Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Customer ID: ");
                    int customerId = InputHelper.getInt();

                    System.out.print("Name: ");
                    String customerName = InputHelper.getString();

                    System.out.print("Email: ");
                    String email = InputHelper.getString();

                    System.out.print("Password: ");
                    String password = InputHelper.getString();

                    System.out.print("Address: ");
                    String address = InputHelper.getString();

                    System.out.print("Phone Number: ");
                    String phone = InputHelper.getString();

                    Customer customer =
                            new Customer(
                                    customerId,
                                    customerName,
                                    email,
                                    password,
                                    address,
                                    phone
                            );

                    userService.registerCustomer(customer);

                    System.out.println("Customer Registered Successfully.");
                    break;

                case 6:

                    userService.viewCustomers();
                    break;

                case 7:

                    System.out.print("Payment ID: ");
                    int paymentId = InputHelper.getInt();

                    System.out.print("Payment Method: ");
                    String method = InputHelper.getString();

                    System.out.print("Amount: ");
                    double amount = InputHelper.getDouble();

                    Payment payment =
                            new Payment(
                                    paymentId,
                                    method,
                                    amount
                            );

                    paymentService.addPayment(payment);

                    System.out.println("Payment Added Successfully.");
                    break;

                case 8:

                    paymentService.viewPayments();
                    break;

                case 0:

                    System.out.println("Thank You.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 0);
    }
}