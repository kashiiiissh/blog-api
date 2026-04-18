📝 Blog Management REST API

🚀 Project Overview

This project is a RESTful API built using Spring Boot that allows users to manage blog posts, categories, and comments. It supports CRUD operations, pagination, and database integration using JPA and Hibernate.

---

🎯 Objectives

- Build REST APIs using Spring Boot
- Implement CRUD operations for blog system
- Use JPA & Hibernate for database handling
- Learn API testing using Postman
- Understand pagination and API structure

---

🛠️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Hibernate ORM
- H2 Database (Development)
- Maven
- Postman

---

✨ Features

- ✅ CRUD operations for Posts, Categories, Comments
- ✅ RESTful API design
- ✅ Entity relationships (Post → Category, Comment → Post)
- ✅ Pagination support for posts
- ✅ Clean JSON responses
- ✅ API tested using Postman

---

📂 Project Structure

src/main/java/com/blogapi/
│── controller/
│── service/
│── repository/
│── model/
│   ├── entity/
│   └── dto/
│── exception/
│── BlogApiApplication.java

---

📡 API Endpoints

🔹 Posts

- GET "/api/posts" → Get all posts (with pagination)
- GET "/api/posts/{id}" → Get post by ID
- POST "/api/posts" → Create post
- PUT "/api/posts/{id}" → Update post
- DELETE "/api/posts/{id}" → Delete post

🔹 Categories

- GET "/api/categories"
- POST "/api/categories"
- PUT "/api/categories/{id}"
- DELETE "/api/categories/{id}"

🔹 Comments

- GET "/api/posts/{postId}/comments"
- POST "/api/posts/{postId}/comments"
- DELETE "/api/comments/{id}"

---

▶️ How to Run

# Clone repository
git clone https://github.com/yourusername/your-repo

# Navigate to project
cd blog-api

# Run application
mvn spring-boot:run

Open in browser:
http://localhost:8080

---

🧪 Testing

Use Postman to test APIs.

Example:

GET http://localhost:8080/api/posts?page=0&size=5

---



---

⚠️ Challenges Faced

- Understanding Spring Boot architecture
- Handling relationships between entities
- Debugging API errors
- Implementing pagination

---

✅ Conclusion

This project demonstrates how to build a complete backend REST API using Spring Boot with CRUD operations, pagination, and database integration.

---


