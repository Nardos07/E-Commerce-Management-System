package services;

import models.Admin;
import models.Customer;

import java.util.ArrayList;

public class UserService {

    private ArrayList<Customer> customers;

    public UserService() {
        customers = new ArrayList<>();
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer customerLogin(String email, String password) {

        for (Customer customer : customers) {

            if (customer.getEmail().equals(email)
                    && customer.getPassword().equals(password)) {

                return customer;
            }
        }

        return null;
    }

    public boolean adminLogin(Admin admin,
                              String email,
                              String password) {

        return admin.getEmail().equals(email)
                && admin.getPassword().equals(password);
    }

    public void viewCustomers() {

        for (Customer customer : customers) {
            customer.displayInfo();
            System.out.println("------------------");
        }
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
