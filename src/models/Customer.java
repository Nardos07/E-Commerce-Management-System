package models;

public class Customer extends User {

    private String address;
    private String phoneNumber;


    public Customer() {
    }


    public Customer(int id,
                    String name,
                    String email,
                    String password,
                    String address,
                    String phoneNumber) {

        super(id, name, email, password);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Customer Information =====");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
