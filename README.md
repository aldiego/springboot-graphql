# POC GraphQL using Spring boot

## Start project

* First build the project:

`./gradlew clean build`

* Then execute using podman:

`podman-compose up --build`

### Create

#### Author

```graphql
mutation {
  createAuthor(author:{
   	fullname: "Douglas Adams",
		email: "douglas.adams@hitchhiker.co.uk"
  }) {
    fullname,
  	email
  } 
}
```

#### Book

```graphql
mutation {
  createBook(email:"douglas.adams@hitchhiker.co.uk", book: {
    title: "The hitchhiker's guide to the galaxy",
    subject: "fiction"
  }) {
    title
    subject
  }
}
```

### Find

#### Author

```graphql
query {
  findAuthor(email: "douglas.adams@hitchhiker.co.uk") {
    email
    fullname
    books {
      title
      isbn
    }
  }
}
```

##### Response
```json
{
  "data": {
    "findAuthor": {
      "email": "douglas.adams@hitchhiker.co.uk",
      "fullname": "Douglas Adams",
      "books": [
        {
          "title": "The hitchhiker's guide to the galaxy",
          "isbn": "09346259-348e-4a12-b908-d833d92d07f0"
        },
        {
          "title": "The Restaurant at the End of the Universe",
          "isbn": "4e10a8f9-014f-452a-8d2a-f82f56fd2b9e"
        },
        {
          "title": "So Long, and Thanks for All the Fish",
          "isbn": "5ac92f3b-5a9a-42eb-8f97-f3012708f389"
        }
      ]
    }
  }
}
```

#### Book

```graphql
query {
    findBook(isbn: "e9950030-6ade-4f5a-be6b-ed0e6ce1dc3a") {
        author {
            email
            fullname
        }
        title
    }
}

```

##### Response
```json
{
  "data": {
    "findBook": {
      "author": {
        "email": "douglas.adams@hitchhiker.co.uk",
        "fullname": "Douglas Adams"
      },
      "title": "The hitchhiker's guide to the galaxy"
    }
  }
}
```
