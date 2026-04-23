# Blogging Application (Java Full Stack Project)

##  Project Description

This is a **full-stack Blogging Application** developed using **Java and Spring Boot**.
It allows users to perform complete **CRUD operations** on blog posts with secure authentication and authorization.

The project demonstrates real-world backend development concepts like REST APIs, layered architecture, and security handling.

---

## Key Highlights

*  Secure Login & Authentication
*  Create, Update, Delete Blog Posts
*  Fetch All Posts & Individual Post
*  Unauthorized Access Handling
*  RESTful API Design
*  Database Integration

---

##  Tech Stack

* **Backend:** Java, Spring Boot
* **Database:** MySQL
* **Tools:** Postman, Maven
* **Architecture:** REST API, MVC Pattern

---

##  Screenshots

###  Login

![Login](BloggingApplication_Screenshots/login.png)

###  Create Post

![Create Post](BloggingApplication_Screenshots/create-post.png)

###  Get All Posts

![Get Posts](BloggingApplication_Screenshots/get-posts.png)

###  Get Post by ID

![Get Post](BloggingApplication_Screenshots/get.post2.png)

###  Update Post

![Update](BloggingApplication_Screenshots/update.png)

###  Update (Detailed)

![Update Posts](BloggingApplication_Screenshots/Screenshot-update_posts.png)

###  Delete Post

![Delete](BloggingApplication_Screenshots/screenshots-delete-post.png)

###  Get Posts (Alt View)

![Get Posts Alt](BloggingApplication_Screenshots/screenshots-get-posts.png)

###  Get Users

![Users](BloggingApplication_Screenshots/screenshots-get-users.png)

###  Unauthorized Access

![Unauthorized](BloggingApplication_Screenshots/unauthorized.png)

---
## ⚙️ How to Run

### 1️. Clone Repository

```bash
git clone https://github.com/Ramireddyvigneswari/blogging-application.git
```

### 2️. Navigate to Project

```bash
cd blogging-application
```

### 3️. Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:5432/blog_app
spring.datasource.username=root
spring.datasource.password=postgresql123
```

### 4️. Run Application

```bash
mvn spring-boot:run
```
------

##  API Endpoints

| Method | Endpoint    | Description     |
| ------ | ----------- | --------------- |
| POST   | /login      | User login      |
| POST   | /posts      | Create post     |
| GET    | /posts      | Get all posts   |
| GET    | /posts/{id} | Get single post |
| PUT    | /posts/{id} | Update post     |
| DELETE | /posts/{id} | Delete post     |

---

##  What I Learned

* Building REST APIs using Spring Boot
* Handling authentication & authorization
* Structuring scalable backend applications
* Database integration using JPA/Hibernate
* API testing using Postman

---

##  Author

** Vigneswari Ramireddy **

---

##  Future Improvements

* Add frontend (React/Angular)
* Implement JWT Authentication
* Deploy on cloud (AWS/Render)

---

⭐ If you like this project, consider giving it a star!
