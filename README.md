# My Spring Boot Application

A simple Spring Boot application with a RESTful API.
## Prerequisites

- Java 17 or later
- Maven
- Spring Data JPA
- H2 Base
- Spring Web
## Build and Run

1. Build the project:

   ```bash
   mvn clean install
   mvn spring-boot:run
   
## API Endpoint

The API endpoint is accessible at:

- `http://localhost:8080/api/messages`

### Example:

- GET `/api/messages`
Returns a list of messages.

## Testing

Use a tool like Postman or cURL to test the API endpoint:

```bash
curl http://localhost:8080/api/messages
