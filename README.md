# THEORY
1. Create a GraphQL schema defining the possible queries accepted by our Spring Boot endpoints as a `.graphql` file. We can have 1 file for queries and mutations, or have 1 file per business object (e.g. under `books.graphql`)
2. Setup the model for our data objects - in this case, a `Book` under `model/`
3. Setup the ORM layer for our data objects - in this case, a `BookRepository` under `repository/`, allowing us to call on simple CRUD operations exposed by the ORM to persist data into our HSQL DB
4. Setup the GraphQL service layer - in this case, a `BookService` under `service/`, allowing us to call on the GraphQL schema to execute queries against our HSQL DB, using data fetchers `AllBooksDataFetcher` and `BookDataFetcher` as a proxy
