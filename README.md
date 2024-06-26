# Web Application Project

Este é um projeto de aplicação web desenvolvido com o objetivo de proporcionar um sistema de gerenciamento de cursos. O projeto inclui funcionalidades para criar, atualizar, deletar e visualizar cursos, categorias, produtos e usuários.

## Funcionalidades

- **Gerenciamento de Usuários**: Criação, visualização, atualização e exclusão de usuários.
- **Gerenciamento de Produtos**: Criação, visualização, atualização e exclusão de produtos.
- **Gerenciamento de Categorias**: Criação, visualização, atualização e exclusão de categorias.
- **Gerenciamento de Pedidos**: Criação, visualização, atualização e exclusão de pedidos.
- **Tratamento de Exceções**: Mecanismo de tratamento de exceções personalizadas.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/main/java**: Contém os arquivos de código-fonte Java.
  - **com/educandoweb/course/entities**: Entidades do sistema.
  - **com/educandoweb/course/repositories**: Interfaces de repositório para acesso aos dados.
  - **com/educandoweb/course/resources**: Recursos REST para exposição das APIs.
  - **com/educandoweb/course/service**: Lógica de negócio e serviços.
  - **com/educandoweb/course/resources/exceptions**: Manipuladores de exceções.
  - **com/educandoweb/course/service/exceptions**: Exceções personalizadas.

- **src/main/resources**: Contém recursos do projeto, como arquivos de configuração.
  - **application.properties**: Configurações da aplicação.

- **src/test/java**: Contém os testes unitários e de integração.
  - **com/educandoweb/course**: Testes da aplicação.

## Tecnologias Utilizadas

- **Java 11**
- **Spring Boot**
- **JPA / Hibernate**
- **Maven**
- **H2 Database** (para testes e desenvolvimento)

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
