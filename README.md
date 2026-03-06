# 📦 Smart Stock — Sistema Inteligente de Gestão de Estoque

Sistema de gestão de estoque desenvolvido com **Spring Boot**, focado em **controle eficiente de inventário**, **previsão de ruptura de estoque** e **automação de reposição**.

O objetivo do projeto é fornecer uma solução moderna para controle de produtos, fornecedores, movimentações e análise inteligente de estoque.

---

# 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Lombok
* MapStruct
* PlantUML
* Swagger / OpenAPI

---

# 🧠 Funcionalidades

## 📦 Funcionalidades Básicas (MVP)

* Cadastro de produtos
* Controle de estoque (entrada e saída)
* Categorias de produtos
* Cadastro de fornecedores
* Usuários e permissões
* Histórico de movimentações
* Alerta de estoque mínimo

---

## ⚙️ Funcionalidades Intermediárias

* Controle por lote e validade
* Inventário (ajuste manual de estoque)
* Relatórios:

  * Produtos mais vendidos
  * Produtos parados
  * Estoque crítico
* Importação e exportação CSV
* Soft delete (produto inativo)

---

## 🤖 Funcionalidades Inteligentes

* 📉 Previsão de ruptura de estoque
* 📊 Sugestão automática de reposição
* 🔔 Alertas automáticos (Email / WhatsApp)
* 🧠 Classificação ABC de produtos
* ⏳ Previsão de demanda baseada em histórico
* 💰 Cálculo automático de custo médio

---

# 🏗 Arquitetura do Sistema

O sistema segue o padrão **Layered Architecture (Arquitetura em Camadas)**.

Fluxo da aplicação:

```
Client
  ↓
Controller (API REST)
  ↓
Service (Regras de Negócio)
  ↓
Repository (Acesso a dados)
  ↓
Database
```

Estrutura de pacotes:

```
com.example.stock
│
├── controller
├── service
├── repository
├── entity
├── dto
├── mapper
├── enums
├── exception
└── config
```

---

# 📊 Diagramas UML

Todos os diagramas foram criados com **PlantUML** para documentar o sistema antes da implementação.

A pasta sugerida para os diagramas é:

```
docs/uml/
```

---

# 📌 Diagrama de Casos de Uso

Representa as interações entre usuários e o sistema.

Exemplos de casos de uso:

* Cadastrar produto
* Registrar entrada de estoque
* Registrar saída de estoque
* Gerar relatórios
* Realizar inventário
* Receber alertas de estoque

Imagem do diagrama:

```
<img width="393" height="1449" alt="TP51pjCm48NtFeMNPD4xj8I0kgiImNuKJyC8nnF6uug2E0nYmOeLuWIv64vQf2H_kqhizxqPlUTzL11DlJSUpsgLhL3tKQqZmLQ9Wp7GAeizk9x2_R_g1yzNnFknkKR5tfZ90Q7pQ1lbzjFjsdupPlRQtSw-Ai51L06n9s6Nb8k5M3dInyenWD9beJsUMO9Ynq9GF9JViWHiqR6i_EzGC" src="https://github.com/user-attachments/assets/383918f9-fb92-414e-945b-4c292b2bf3e3" />


```

---

# 📌 Diagrama de Classes

Representa o **modelo de domínio da aplicação**.

Principais classes:

* Product
* Category
* Supplier
* Stock
* StockMovement
* InventoryAdjustment
* ReorderSuggestion
* StockAlert
* PurchaseOrder
* User
* Role

Imagem do diagrama:

```
<img width="1634" height="545" alt="bLDDRnCn4BtxLrWv8lN0DQTk2OSWIajsW-0uigTRKtyizZWeGlntxA2DMST4wicQUM_cUJxcDX1uYaOp9ZI4m1-zar4G_yMuacl-qTcHSGi6rxmdhx8LNc8n9gz4mkxKk46X36Z6ZRBAHDEJ4ozhlhM48th6GP0wPAfp6i6otxFaEqWCvu_ND2K6uTL4ojdPMHBqSPgqGdyj0HfGkfZJi" src="https://github.com/user-attachments/assets/a3bda1c6-f760-4f8a-bb2c-563ad60aee77" />

```

---

# 📌 Diagrama Entidade-Relacionamento (ER)

Representa a **estrutura do banco de dados**.

Principais relacionamentos:

* Product → Category
* Product → Supplier
* Product → Stock
* Stock → StockMovement
* User → Role

Imagem do diagrama:

```
<img width="1435" height="578" alt="fLJDRjim3BxxANmlyW8xrSk2BK3J56csgy5PRAfLiZoHoX0iUVT9iQTKLhCbwCMmFlxmqoUIjyHWsMbL5DYov5tvO8rm3PU_YxAyaQByK7wSVvxVh_rnCl6V5ZHwy5krcdwfLXwW5vUSEokRuF5fDfqlgZkFQDbAxNHDR9eNR-cpGSDoYo7_Sdatg-uzr03ZnjXTdTObrtLAeatWGsGy7" src="https://github.com/user-attachments/assets/e95f9953-21a8-4f6f-b320-ee7e05ba757e" />

```

# 📌 Diagrama de Arquitetura

Representa a organização do sistema em camadas.

```
Frontend
   ↓
Controllers
   ↓
Services
   ↓
Repositories
   ↓
Database
```

Imagem do diagrama:

```
<img width="3105" height="496" alt="arqui" src="https://github.com/user-attachments/assets/f2840fba-df17-461d-a69c-a77bde30ee0c" />

```

---

# 📌 Diagrama de Implantação (Deployment)

Mostra onde o sistema será executado.

Infraestrutura prevista:

```
Client (Browser)
      ↓
Application Server (Spring Boot API)
      ↓
Database Server (MySQL)
      ↓
External Services (Email / WhatsApp API)
```

Imagem do diagrama:

```
<img width="1193" height="501" alt="VP1DJiCm48NtFiN8-ueReBQqYqg0W0XrFKs6Oidn1C-47w4U1h7eGN8n72KiWYDscNmlxxsyfIX6RMjlZ3hr11k7nuWrGaMmgnkFGR4xTzyC2oYSA0reAyelBHaJE5tsKThkApgsy6a0IguR3XGKx3hocr242zZJ0LPDOytfzwE2ugkhE2Q_HBmhXw3UOsfIDD658woP5LPtkr4maLnnq" src="https://github.com/user-attachments/assets/96671b4b-5e37-4c23-9bd8-0105441cc69e" />
```

---

# 📂 Modelo de Domínio

Entidades principais do sistema:

* Product
* Category
* Supplier
* Stock
* StockMovement
* InventoryAdjustment
* ReorderSuggestion
* StockAlert
* PurchaseOrder
* User
* Role

Essas entidades representam o **núcleo do sistema de estoque**.

---

# ⚙️ Regras de Negócio

Algumas regras importantes do sistema:

* O sistema **não permite estoque negativo**
* Toda movimentação gera **registro no histórico**
* Ajustes de estoque exigem **motivo**
* Produtos **inativos não podem movimentar estoque**
* Alertas são gerados quando:

```
quantity <= minimumStock
```

---

# 📈 Evoluções Futuras

Possíveis melhorias para o sistema:

* Autenticação com **JWT + Spring Security**
* **Docker Compose** (API + MySQL + Redis)
* Cache com Redis
* Dashboard com gráficos analíticos
* Integração com sistemas ERP
* API pública para integrações externas

---

# ▶️ Como Rodar o Projeto

## 1. Clonar o repositório

```
git clone https://github.com/seu-usuario/smart-stock.git
```

---

## 2. Criar banco de dados

Criar banco no MySQL:

```
smart_stock
```

---

## 3. Configurar application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/smart_stock
spring.datasource.username=root
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
```

---

## 4. Rodar a aplicação

```
mvn spring-boot:run
```

A API estará disponível em:

```
http://localhost:8080
```

---

# 📄 Licença

Projeto desenvolvido para **fins educacionais e de aprendizado em arquitetura de software e desenvolvimento backend com Spring Boot**.
