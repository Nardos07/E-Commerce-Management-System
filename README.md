# E-Commerce Management System

## Project Description

The E-Commerce Management System is a console-based Java application developed using Object-Oriented Programming (OOP) principles. The system allows administrators and users to manage products, customers, carts, orders, and payments through a menu-driven interface.

This project was developed as an academic project to demonstrate practical implementation of Java programming concepts including OOP, Collections Framework, File Handling, Serialization, JDBC, MySQL integration, Exception Handling, and collaborative software development using GitHub.

The system initially used in-memory storage using Java Collections (`ArrayList`) and was later enhanced by integrating MySQL through JDBC to demonstrate database connectivity and persistent storage concepts.

---

# Objectives

- Apply Object-Oriented Programming concepts in a real-world application.
- Develop a modular and maintainable software system.
- Manage products, customers, carts, orders, and payments.
- Practice Java Collections Framework.
- Implement File Handling and Object Serialization.
- Integrate Java applications with MySQL using JDBC.
- Practice collaborative software development using GitHub.

---

# Features

## Product Management

- Add new products.
- View all products.
- Search products by ID.
- Delete products.
- Update product quantity.

## Customer Management

- Register customers.
- View customer information.
- Customer login functionality.

## User Management

- Admin login functionality.
- Display user information.

## Cart Management

- Add products to cart.
- Remove products from cart.
- View cart contents.
- Calculate cart total.

## Order Management

- Create orders.
- Add items to orders.
- View orders.
- Search orders.
- Calculate total order amount.

## Payment Management

- Add payment records.
- View payment information.
- Search payments.

## File Handling Features

- Save product data using serialization.
- Load product data from serialized files.
- Store objects permanently using `.ser` files.

## Database Features

- Connect Java application to MySQL database.
- Establish JDBC connection using a reusable connection class.
- Demonstrate persistent product storage concepts using MySQL.

## Additional Features

- Menu-driven console interface.
- Exception handling using custom exceptions.
- GitHub collaborative workflow.

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- Java File Handling
- Object Serialization
- JDBC (Java Database Connectivity)
- MySQL
- MySQL Workbench
- IntelliJ IDEA
- Git
- GitHub

---

# OOP Concepts Implemented

## Encapsulation

Encapsulation is implemented by declaring class attributes as private and providing public getter and setter methods.

Example:

```java
private int productId;

public int getProductId() {
    return productId;
}

public void setProductId(int productId) {
    this.productId = productId;
}
```

---

## Inheritance

Inheritance is implemented through the `User` superclass.

```text
User
├── Admin
└── Customer
```

Classes:

- `Admin extends User`
- `Customer extends User`

---

## Polymorphism

Polymorphism is implemented using method overriding.

Example:

- `displayInfo()` method is overridden in both `Admin` and `Customer` classes.

---

## Abstraction

Abstraction is achieved through separation of responsibilities into different packages:

- Models package
- Services package
- Database package
- File Handling package
- Utility package

---

## Interfaces

No custom interfaces were implemented in the final version of the project.

---

## Exception Handling

Exception handling is implemented using:

- `try-catch` blocks
- Custom exceptions

Custom exceptions:

- `ProductNotFoundException`
- `InvalidQuantityException`

Built-in exceptions handled:

- `IOException`
- `SQLException`
- `ClassNotFoundException`

---

# System Architecture / Design

The project follows a layered architecture.

## Models Layer

### User.java

Base class containing:

- id
- name
- email
- password

### Admin.java

Represents administrator users.

### Customer.java

Represents customers with additional information:

- address
- phoneNumber

### Product.java

Represents products available in the system.

Attributes:

- productId
- name
- category
- price
- quantity

### Cart.java

Stores cart information and manages cart items.

### CartItem.java

Represents individual items inside a cart.

### Order.java

Represents customer orders.

### OrderItem.java

Represents individual products inside an order.

### Payment.java

Represents payment details.

---

## Service Layer

### UserService.java

Responsible for:

- Customer registration
- Customer login
- Admin login
- Viewing customers

### ProductService.java

Responsible for:

- Adding products
- Viewing products
- Searching products
- Deleting products
- Updating quantities

### CartService.java

Responsible for:

- Adding products to cart
- Removing products from cart
- Viewing cart
- Calculating totals

### OrderService.java

Responsible for:

- Creating orders
- Viewing orders
- Searching orders

### PaymentService.java

Responsible for:

- Adding payments
- Viewing payments
- Searching payments

---

## Database Layer

### DBConnection.java

Responsible for establishing MySQL database connections using JDBC.

---

## File Handling Layer

### FileManager.java

Responsible for:

- Saving serialized objects.
- Loading serialized objects.

---

## Utility Layer

### InputHelper.java

Responsible for handling console input operations.

---

# Project Structure

```text
src/
│
├── main
│   └── Main.java
│
├── models
│   ├── User.java
│   ├── Admin.java
│   ├── Customer.java
│   ├── Product.java
│   ├── Cart.java
│   ├── CartItem.java
│   ├── Order.java
│   ├── OrderItem.java
│   └── Payment.java
│
├── services
│   ├── UserService.java
│   ├── ProductService.java
│   ├── CartService.java
│   ├── OrderService.java
│   └── PaymentService.java
│
├── database
│   └── DBConnection.java
│
├── exceptions
│   ├── ProductNotFoundException.java
│   └── InvalidQuantityException.java
│
├── filehandling
│   └── FileManager.java
│
└── utils
    └── InputHelper.java

data/
└── products.ser

README.md
```

---

# File Handling Implementation

The project implements Java File Handling using Object Serialization.

## Serialization

Objects are converted into a byte stream and stored permanently in files.

Implemented using:

```java
ObjectOutputStream
```

Example:

```java
out.writeObject(object);
```

---

## Deserialization

Serialized objects are restored from files.

Implemented using:

```java
ObjectInputStream
```

Example:

```java
return in.readObject();
```

---

## File Types Used

### Object Files

```text
products.ser
```

Used to store serialized product data.

---

## Backup and Restore

### Backup

Product collections are saved into:

```text
data/products.ser
```

### Restore

Serialized product collections are loaded back into the application when required.

---

## Text Files

Text file storage was discussed during project planning, but the final implementation uses object serialization (`.ser`) as the primary persistence mechanism.

---

## Binary Files

Object serialization internally stores data in binary format.

---

# Database Implementation

## Database Name

```sql
CREATE DATABASE ecommerce_db;
```

---

## Table Used

### products

```sql
CREATE TABLE products (
    product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);
```

---

## JDBC Connectivity

JDBC is used to establish communication between Java and MySQL.

Flow:

```text
Java Application
        ↓
JDBC Driver
        ↓
MySQL Server
        ↓
ecommerce_db
```

---

## DBConnection Class

The `DBConnection` class centralizes database connection logic.

Implemented using:

```java
DriverManager.getConnection()
```

---

## CRUD Operations

Implemented in memory through `ProductService`:

- Create Product
- Read Product
- Update Product Quantity
- Delete Product

The project currently demonstrates JDBC connectivity and MySQL integration using the `products` table.

---

# Collections Used

The project uses Java `ArrayList` collections.

Examples:

```java
ArrayList<Product>
ArrayList<Customer>
ArrayList<Order>
ArrayList<Payment>
ArrayList<CartItem>
ArrayList<OrderItem>
```

Reasons for choosing `ArrayList`:

- Dynamic size.
- Easy iteration.
- Efficient insertion and retrieval.
- Suitable for academic projects.

---

# Installation and Setup

## Prerequisites

- Java JDK
- IntelliJ IDEA
- MySQL Server
- MySQL Workbench
- MySQL Connector/J

---

## Steps

### 1. Clone the Repository

```bash
git clone <repository-url>
```

### 2. Open the Project

Open the project using IntelliJ IDEA.

### 3. Create Database

```sql
CREATE DATABASE ecommerce_db;

USE ecommerce_db;

CREATE TABLE products (
    product_id INT PRIMARY KEY,
    name VARCHAR(100),
    price DOUBLE,
    quantity INT
);
```

### 4. Configure Database Credentials

Open:

```text
DBConnection.java
```

Modify:

```java
private static final String USERNAME = "root";
private static final String PASSWORD = "";
```

according to your MySQL configuration.

### 5. Add JDBC Driver

Add MySQL Connector/J JAR file to IntelliJ project libraries.

### 6. Run Application

Run:

```text
Main.java
```

---

# Usage

The application uses a console-based menu.

Example operations:

```text
1. Add Product
2. View Products
3. Search Product
4. Delete Product
5. Register Customer
6. View Customers
7. Add Payment
8. View Payments
9. Save Products
10. Load Products
0. Exit
```

Users interact with the system by selecting menu options and entering the required information.

---

# Sample Data

Included sample data:

```text
data/products.ser
```

Database:

```text
ecommerce_db
└── products table
```

---

# Team Members

The project was developed collaboratively by a team of five members using GitHub branches.


## Contributors

### Contributor 1 :- Michael 


**Branch:** `user-module`

Responsibilities:

- User.java
- Admin.java
- Customer.java
- UserService.java
- Project architecture and design
- Main.java development and integration
- Payment module implementation

### Contributor 2  :- Kalkidan

**Branch:** `product-module`

Responsibilities:

- Product.java
- ProductService.java

### Contributor 3   :- Kidus

**Branch:** `cart-module`

Responsibilities:

- Cart.java
- CartItem.java
- CartService.java

### Contributor 4   :- Rediet

**Branch:** `order-module`

Responsibilities:

- Order.java
- OrderItem.java
- OrderService.java

### contributor 5  :- Nardos 

**Branch:** `payment-module`

Responsibilities:

- Payment.java
- PaymentService.java
- DBConnection.java
- FileManager.java
- InputHelper.java
- ProductNotFoundException.java
- InvalidQuantityException.java
- Main.java
- System integration
-  Database integration (JDBC + MySQL)
- File handling implementation
- Exception handling implementation
- Project testing and debugging
- - GitHub management and branch merging
- Final documentation and README preparation

---

# GitHub Workflow

The project was developed using GitHub collaborative workflow.

## Branches Used

- `main`
- `user-module`
- `product-module`
- `cart-module`
- `order-module`
- `payment-module`

Each module was developed independently in its own branch. After development and testing, all branches were merged into the `main` branch to produce the final integrated system.

---

# Future Improvements

Possible future enhancements include:

- Full JDBC CRUD implementation for all modules.
- Database tables for customers, orders, carts, and payments.
- Graphical User Interface (GUI) using JavaFX or Swing.
- DAO pattern implementation.
- Authentication and authorization system.
- Inventory management and stock alerts.
- Advanced search and filtering.
- Sales reporting module.
- Online payment gateway integration.
- Web-based or mobile application version.

---

# Recommendations

The following recommendations can improve future versions of the system:

- Expand database integration beyond products.
- Apply software design patterns such as DAO.
- Improve security by encrypting passwords.
- Add validation for user inputs.
- Enhance the user interface.
- Implement automatic backup mechanisms.

---

# Conclusion

The E-Commerce Management System successfully demonstrates the practical application of Java programming concepts including OOP, Collections Framework, File Handling, Serialization, JDBC, MySQL integration, Exception Handling, and collaborative software development using GitHub. The project provides a strong foundation for future enhancements and enterprise-level development.
