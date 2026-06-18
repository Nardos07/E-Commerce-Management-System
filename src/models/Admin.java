package models;

public class Admin extends User {

    // Default Constructor
    public Admin() {
    }

    // Parameterized Constructor
    public Admin(int id, String name, String email, String password) {
        super(id, name, email, password);
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Admin Information =====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Role: Admin");
    }
}
