# Java Fundamentals Library

Um projeto modular em Java (JPMS) que simula um **Library Management System** em memória, com persistência em arquivos e exemplos de concorrência.

## 📦 Estrutura de Módulos

* **core**: Lógica de domínio e entidades (`Book`, `Member`, `Loan`, repositório em memória).
* **exceptions**: Exceções customizadas de domínio (`BookNotFoundException`, `MemberNotFoundException`).
* **io**: Persistência simples em disco (`BookFileRepository` para CSV/TXT).
* **db**: Conexão JDBC com H2 e operações SQL básicas.
* **concurrent**: Demonstrações de concorrência com `ExecutorService` e `Callable`.
* **app**: Ponto de entrada (`Main`) que orquestra todos os módulos e demonstra as funcionalidades.

## 🚀 Pré-requisitos

* Java 17+
* Maven 3.6+
* Git

## ⚙️ Como Compilar e Executar

1. Faça clone do repositório:

   ```bash
   git clone https://github.com/Igor-Vinis/java-fundamentals.git
   cd java-fundamentals
   ```
2. Compilar todos os módulos:

   ```bash
   mvn clean install
   ```
3. Executar a aplicação principal:

   ```bash
   mvn -pl app spring-boot:run
   ```
4. Seguir as instruções no console para testar operações de CRUD, persistência e concorrência.

## 📋 Blocos do Módulo 0

1. **Collections & Generics** (repositório em memória)
2. **Tratamento de Exceções & Logging**
3. **Arquivos & Persistência Simples**
4. **Modularização (JPMS)**
5. **Streams & Lambdas**
6. **Concorrência Básica**
7. **I/O & NIO Avançado**
8. **JDBC com H2**
9. **Revisão e Testes Modulares**

## 📖 Referências

* *Effective Java* (Joshua Bloch)
* [Oracle JPMS Tutorial](https://docs.oracle.com/javase/tutorial/java/module/)
* [Baeldung – Java Modules](https://www.baeldung.com/java-9-modularity)
* [Java Collections (Oracle)](https://docs.oracle.com/javase/tutorial/collections/)
* [Baeldung – Custom Exceptions](https://www.baeldung.com/java-new-custom-exception)
* [Baeldung – Read and Write Files](https://www.baeldung.com/java-write-to-file)
* [Oracle Concurrency Tutorial](https://docs.oracle.com/javase/tutorial/essential/concurrency/)

---

**Irei atualizar este README conforme avanço nos blocos!**
