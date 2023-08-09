#Spring Boot Book Seller

### Endpoints

#### Sign-Up

```
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "name":"user",
    "username":"user",
    "password":"user"
}
```

#### Sign-In

```
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
    "username":"user",
    "password":"user"
}
```

### Make-admin

```
PUT /api/internal/make-admin/admin HTTP/1.1
Host: localhost:8080
Authorization: Bearer InternalApiKey1234!
```

### Save-book

```
POST /api/book HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer ...user or admin
Content-Length: 109

{
    "title":"Test Book2",
    "price" : 110,
    "description":"Test 2",
    "author":"Test author2"
}

```

### Delete-book

```
DELETE /api/book/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin

```

### Get All Books

```
POST /api/book HTTP/1.1
Host: localhost:8080

```

### Save Purchase

```
POST /api/purchase-history HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Authorization: Bearer ...user or admin
Content-Length: 55

{
    "userId":9,
    "bookId":2,
    "price":110
}

```

### Get User Purchases

```
GET /api/purchase-history HTTP/1.1
Host: localhost:8080
Authorization: Bearer ...user or admin

```

