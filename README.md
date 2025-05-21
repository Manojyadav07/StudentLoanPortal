# Student Loan Portal

A Spring Boot + React reference implementation for managing student loans.

## Quick Start (Local)

```bash
docker-compose up --build
```

- API docs: <http://localhost:8080/swagger-ui.html>
- Front‑end: <http://localhost:3000>

## Architecture

* **Spring Boot** REST API (controller/service/repository layers)
* **React** SPA front‑end (axios → `/api/v1/**`)
* **MySQL** via JPA/Hibernate
* **CI**: GitHub Actions → Maven Verify → Docker build & push
* **CD**: `kubectl apply -f k8s/`

## Contributing

PRs welcome. Run `mvn test` before pushing.
