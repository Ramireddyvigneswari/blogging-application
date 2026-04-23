#  Blogging Application

## Overview
-> A RESTful Blogging Application built using Spring Boot, JPA, and PostgreSQL.
-> Implements full CRUD operations
-> Tested using Postman
-> Follows REST API architecture

------------------------------------------------------------

##  Tech Stack
- Java
- Spring Boot
- PostgreSQL

------------------------------------------------------------

##  API Endpoints

**Base URL:** http://localhost:8081

###  User APIs

- POST /api/users/
- GET /api/users/
- GET /api/users/{id}
- PUT /api/users/{id}
- DELETE /api/users/{id}

###  Category APIs

- POST /api/categories/
- GET /api/categories/

###  Post APIs

- POST /api/posts/
- GET /api/posts/
- GET /api/posts/{id}
- PUT /api/posts/{id}
- DELETE /api/posts/{id}

--------------------------------------------------------
## Sample Request JSON
### Create Post

```json
{
  "title": "Spring Boot Basics",
  "content": "Spring Boot simplifies backend development",
  "user": { "id": 1 },
  "category": { "id": 1 }
}
```

### Update Post

```json
{
  "title": "Advanced Java",
  "content": "Java includes collections and streams",
  "user": { "id": 1 },
  "category": { "id": 1 }
}
```

-----------------------------------------------------------
##  Features

* Create Users
* Create Categories
* Create Blog Posts
* REST API Architecture
* Database Integration

---------------------------------------------------------

##  API Endpoints

###  User

* POST `/api/users/`
* GET `/api/users/`

###  Category

* POST `/api/categories/`

###  Post

* POST `/api/posts/`

----------------------------------------------
##  Screenshots

![User](screenshots/user.png)
![Post](screenshots/post.png)
![Get](screenshots/get-posts.png)
![Update](screenshots/update-post.png)
![Delete](screenshots/delete-post.png)

##  Future Enhancements

* JWT Authentication
* Role-based access

----------------------------------------------------

##  Author

Vigneswari Ramireddy
