# udemy-mrr-blogapp-service

- This is a service providing post API for the project [udemy-mrr-blogapp](https://github.com/nowaxsky/udemy-mrr-blogapp).
I rebuild these API which are from [here](https://reduxblog.herokuapp.com/).

- You should run [postgres-script.sql](https://github.com/nowaxsky/udemy-mrr-blogapp-service/blob/master/src/main/resources/postgres-script.sql) 
in your pgAdmin(PostgreSQL) first.

- This service is built by Spring Boot, so next you should run this service.

## API

1. Fetch all posts in the database: 
```
GET
http://localhost:10001/umbs/api/posts
``` 

2. Find post by id(ex:5):
```
GET
http://localhost:10001/umbs/api/post/5
```

3. Add post(id, title, categories, content):
```
POST
http://localhost:10001/umbs/api/post/
```

4. Delete post by id(ex:5):
```
DELETE
http://localhost:10001/umbs/api/post/5
```
