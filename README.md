# Cinema2
# 🎬 Cinema API - Checkpoint 2

API RESTful para gerenciamento de filmes e salas de cinema,
desenvolvida com Spring Boot e MySQL.

## Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL 8
- Docker
- Swagger/OpenAPI

## ▶️ Como rodar

### 1. Suba o banco com Docker
```bash
docker-compose up -d
```

### 2. Rode a aplicação
```bash
./mvnw spring-boot:run
```

Acesse em: `http://localhost:8080`

## 📋 Endpoints

### Filmes
| Método | Rota         | Descrição       |
|--------|--------------|-----------------|
| GET    | /filmes      | Lista todos     |
| GET    | /filmes/{id} | Busca por ID    |
| POST   | /filmes      | Cria filme      |
| PUT    | /filmes/{id} | Atualiza filme  |
| DELETE | /filmes/{id} | Remove filme    |

### Salas
| Método | Rota        | Descrição      |
|--------|-------------|----------------|
| GET    | /salas      | Lista todas    |
| GET    | /salas/{id} | Busca por ID   |
| POST   | /salas      | Cria sala      |
| PUT    | /salas/{id} | Atualiza sala  |
| DELETE | /salas/{id} | Remove sala    |

## 📖 Swagger
Acesse: `http://localhost:8080/swagger-ui.html`
