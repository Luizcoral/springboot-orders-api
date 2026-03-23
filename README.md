🧾 Spring Boot Web Services - Orders API

API REST desenvolvida em Java com Spring Boot, implementando um sistema de usuários, pedidos e produtos, utilizando JPA / Hibernate para persistência de dados.

O projeto foi desenvolvido com foco em aprendizado de arquitetura em camadas, modelagem de domínio e boas práticas de desenvolvimento backend.

🚀 Tecnologias utilizadas

☕ Java

🌱 Spring Boot

🌐 Spring Web

🗄️ Spring Data JPA

🔁 Hibernate

🧪 H2 Database

📦 Maven

🧱 Arquitetura da aplicação

O projeto segue o padrão de arquitetura em camadas, comum em aplicações Spring.

Controller / Resource
        ↓
      Service
        ↓
     Repository
        ↓
       Entity

📂 Descrição das camadas

Entity

Representa as entidades do domínio e as tabelas do banco de dados.

Exemplo:

User
Order
Product
Category
OrderItem
Payment


Repository

Responsável pela comunicação com o banco de dados.

Utiliza Spring Data JPA, que fornece métodos prontos para operações como:

salvar

buscar

atualizar

deletar

Exemplo:

UserRepository
ProductRepository
OrderRepository


Service

Contém a lógica de negócio da aplicação, intermediando o controller e o acesso ao banco.

Exemplos de responsabilidades:

buscar usuário

validar existência de dados

tratar exceções

executar regras da aplicação

Resource (Controller)

Responsável por expor os endpoints da API REST.

Exemplo de endpoints:

GET    /users
GET    /users/{id}
POST   /users
PUT    /users/{id}
DELETE /users/{id}

🗄️ Modelo de domínio

O sistema implementa um pequeno sistema de pedidos.

Entidades
User
Order
Product
Category
OrderItem
Payment

Relacionamentos
User 1 --- N Order

Order 1 --- N OrderItem

Product 1 --- N OrderItem

Product N --- N Category

Order 1 --- 1 Payment

⚙️ Funcionalidades implementadas
👤 Usuários

Criar usuário

Buscar todos usuários

Buscar usuário por ID

Atualizar usuário

Deletar usuário

🛑 Tratamento de exceções

Implementação de tratamento global de erros:

ResourceNotFoundException
DatabaseException


Com resposta padrão da API:

{
  "timestamp": "2026-03-15T02:45:35Z",
  "status": 400,
  "error": "Database error",
  "message": "...",
  "path": "/users/1"
}

🧪 Banco de dados

Para testes foi utilizado H2 Database (em memória).

Console disponível em:

http://localhost:8080/h2-console


Configuração no application-test.properties.

📊 Exemplo de requisição
Criar usuário

POST /users

{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}

Buscar usuário

GET /users/1

📂 Estrutura do projeto
src
 └── main
     └── java
         └── com.seuprojeto
             ├── entities
             ├── repositories
             ├── services
             │    └── exceptions
             └── resources
                  └── exceptions

🎯 Objetivos de aprendizado

Este projeto teve como objetivo praticar:

construção de APIs REST

arquitetura em camadas

persistência com JPA / Hibernate

relacionamentos entre entidades

tratamento de exceções

uso de banco em memória para testes

📚 Referência

Projeto baseado no workshop do professor Nelio Alves, disponível na plataforma DevSuperior.
