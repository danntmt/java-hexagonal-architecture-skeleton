# Java Hexagonal Architecture Skeleton

This project is a base implementation of a Java application following the principles of Hexagonal Architecture (Ports and Adapters), CQRS (Command Query Responsibility Segregation), Domain Events, and Domain-Driven Design (DDD).

## Project Structure

The project is organized as a multi-module Maven application with the following modules:

- **core**: Contains the domain logic (domain entities, aggregates, domain events, and repository interfaces)
- **application**: Contains the application layer (use cases, command handlers, and query handlers)
- **infrastructure**: Contains infrastructure details (repository implementations, adapters, configurations)
- **api**: Contains REST controllers and API endpoints to expose the application

## Architecture

The application follows several architectural patterns:

### Hexagonal Architecture

- **Domain Layer** (core module): Contains business logic, domain entities, value objects, and repository interfaces.
- **Application Layer** (application module): Contains application services, use cases, and orchestrates domain logic.
- **Infrastructure Layer** (infrastructure module): Contains implementations of repository interfaces and other infrastructure concerns.
- **API Layer** (api module): Contains REST controllers and external API.

### CQRS (Command Query Responsibility Segregation)

- **Commands**: Represent intentions to change the system state. Located in `application/commands`.
- **Command Handlers**: Process commands and modify the domain model. Located in `application/handlers/commands`.
- **Queries**: Represent requests for information. Located in `application/queries`.
- **Query Handlers**: Process queries and return results without modifying state. Located in `application/handlers/queries`.

### Domain Events

- **Domain Events**: Represent facts that have occurred in the domain. Located in `core/domain/events`.
- **Event Publisher**: The application uses Spring's `ApplicationEventPublisher` to publish domain events, allowing loose coupling and extensibility.
- **Event Listeners**: Located in `infrastructure/listeners` to react to domain events asynchronously.

This approach provides a clean and decoupled implementation of event notification without persisting events for event sourcing purposes.

### Domain-Driven Design

- **Aggregates**: Consistency boundaries for a group of domain objects. Located in `core/domain/aggregates`.
- **Value Objects**: Immutable objects without identity. Located in `core/domain/valueobjects`.
- **Domain Services**: Services containing domain logic that doesn't fit in entities or value objects. Located in `core/domain/services`.
- **Repositories**: Abstractions for data access. Located in `core/domain/repositories`.

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- PostgreSQL (for production) or H2 (for development/testing)

### Technical Stack

- Spring Boot 3.4.0
- Spring Data JPA
- H2 Database (dev/test)
- PostgreSQL (production)
- Swagger/OpenAPI for API documentation

### Building the Project

```shell
mvn clean install
```

### Running the Application

##### On Linux/Mac:
```shell
./run.sh [profile]
```

The profile parameter is optional and defaults to 'dev'. Available profiles: dev, test, prod.

#### Running specific module commands

##### Development Mode

```shell
cd api
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

##### Production Mode

```shell
cd api
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

### API Documentation

When the application is running, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

## Testing

```shell
mvn test
```

## Deployment

### Docker

Build the Docker image:

```shell
docker build -t hexagonal-architecture .
```

Run the Docker container:

```shell
docker run -p 8080:8080 hexagonal-architecture
```

### Docker Compose

Run the application with PostgreSQL using Docker Compose:

```shell
docker-compose up
```

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details. 
## Project Structure

This project has been restructured with all modules now inside a 'code' directory:

```
java-hexagonal-architecture-skeleton/
├── code/
│   ├── api/
│   ├── application/
│   ├── core/
│   ├── infrastructure/
│   ├── pom.xml
│   ├── Dockerfile
│   └── docker-compose.yml
├── pom.xml
└── README.md
```

The root pom.xml now includes the 'code' module, which contains all the application code.
