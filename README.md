# 🚚 Delivery Tracker Backend

A backend application for a Delivery Tracker system built using **Java**, **Spring Boot**, and **MySQL**. The application provides secure REST APIs for managing users, orders, delivery agents, and order tracking with JWT-based authentication and role-based access control.

---

## 🚀 Features

### Customer

* User Registration & Login
* Secure JWT Authentication
* Place Orders
* Track Delivery Status
* View Order History

### Delivery Agent

* Login Authentication
* View Assigned Orders
* Update Delivery Status

### Admin

* Secure Admin Login
* Manage Customers
* Manage Delivery Agents
* Manage Orders
* Monitor Delivery Status

---

## 🛠 Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* Hibernate ORM (JPA)
* REST APIs
* JWT Authentication

### Database

* MySQL

### Tools

* Maven
* Git
* GitHub
* Postman

---

## 🔐 Security

* JWT-Based Authentication
* Role-Based Authorization (Admin, Customer, Delivery Agent)
* Protected REST API Endpoints
* Password Encryption

---

## 📌 REST API Modules

* Authentication API
* User Management API
* Order Management API
* Delivery Agent API
* Order Tracking API

---

## 📁 Project Structure

```text
delivery-tracker-backend/
│
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── security/
├── config/
├── exception/
└── resources/
```

---

## ▶️ Getting Started

### Prerequisites

* Java 21 (or your project JDK version)
* Maven
* MySQL

### Steps

1. Clone the repository.
2. Configure the MySQL database.
3. Update the database configuration in `application.properties`.
4. Build and run the Spring Boot application.

The backend server runs at:

```text
http://localhost:8080
```

---

## 🧪 API Testing

Use **Postman** or any REST client to test the available API endpoints after starting the application.

---

## 📈 Future Enhancements

* Real-time delivery tracking
* Email notifications
* SMS notifications
* Payment integration
* Docker deployment
* Microservices architecture

---

## 👨‍💻 Author

**Rajesh Vankam**

* Java Full Stack Developer
* GitHub: https://github.com/Rajesh97Raj

