# E-Commerce Backend

This project is a simple backend for an e-commerce platform built using **Spring Boot** and **JPA** (Java Persistence API). It allows users to interact with categories and products, including functionalities like adding products, getting products by category, and managing categories.

## Features

- **Product Management**:
  - Add new products
  - Retrieve products by category
  - Get details of individual products
  - Delete products

- **Category Management**:
  - Add new categories
  - Retrieve all categories
  - Get details of specific categories by ID
  - Delete categories

## Technologies Used

- **Spring Boot** for building the REST API
- **JPA** (Java Persistence API) for database interactions
- **H2 Database** for development and testing (can be changed to MySQL, PostgreSQL, etc.)
- **Postman** for testing the API endpoints
- **Maven** for dependency management

## Project Setup

### Prerequisites

- **JDK 17** or above installed
- **Maven** installed for dependency management and building the project
- **IDE** like IntelliJ IDEA, Eclipse, or VS Code
- **Postman** (or any API testing tool)

### Running the Application


markdown
Copy code
# E-Commerce Backend

This project is a simple backend for an e-commerce platform built using **Spring Boot** and **JPA** (Java Persistence API). It allows users to interact with categories and products, including functionalities like adding products, getting products by category, and managing categories.

## Features

- **Product Management**:
  - Add new products
  - Retrieve products by category
  - Get details of individual products
  - Delete products

- **Category Management**:
  - Add new categories
  - Retrieve all categories
  - Get details of specific categories by ID
  - Delete categories

## Technologies Used

- **Spring Boot** for building the REST API
- **JPA** (Java Persistence API) for database interactions
- **H2 Database** for development and testing (can be changed to MySQL, PostgreSQL, etc.)
- **Postman** for testing the API endpoints
- **Maven** for dependency management

## Project Setup

### Prerequisites

- **JDK 17** or above installed
- **Maven** installed for dependency management and building the project
- **IDE** like IntelliJ IDEA, Eclipse, or VS Code
- **Postman** (or any API testing tool)

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/backend-ecommerce.git
Navigate to the project directory:

bash

cd backend-ecommerce
Build and run the application using Maven:

mvn clean install
mvn spring-boot:run
The application will start on localhost:8080 by default.

You can test the API using Postman or any API client by sending HTTP requests to the following endpoints:

**API Endpoints**
Category Endpoints:
GET /api/category/getAll
Retrieve all categories.

GET /api/category/get/{id}
Retrieve a category by its ID.

POST /api/category/save
Save a new category.
Example request body:

{
  "name": "Electronics"
}
DELETE /api/category/delete/{id}
Delete a category by ID.

Product Endpoints:
GET /api/product/getAll
Retrieve all products.

GET /api/product/get/{id}
Retrieve a product by its ID.

GET /api/product/getwithCId/{id}
Retrieve all products under a specific category by category ID.

POST /api/product/save
Save a new product.
Example request body:

json
Copy code
{
  "productName": "Samsung Galaxy S21",
  "description": "Latest model with great features",
  "price": 799.99,
  "category": {
    "categoryId": 1
  }
}
DELETE /api/product/delete/{id}
Delete a product by ID.

Database Configuration
By default, this project uses H2 database for quick development and testing. You can change the database configuration in src/main/resources/application.properties if you want to use a different database (like MySQL or PostgreSQL).

Example for MySQL configuration:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
Testing the API
Use Postman or similar tools to interact with the API. Make sure your application is running and use the following endpoints:

GET: /api/category/getAll to get all categories.
POST: /api/category/save to add a new category.
GET: /api/product/getAll to retrieve all products.
POST: /api/product/save to add a new product to a category.

Contribution
**Fork the repository**.
Create a new branch (git checkout -b feature-branch).
Make your changes.
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a new pull request.
License
This project is licensed under the MIT License - see the LICENSE file for details.

