# Santander Bootcamp 2023 - Backend Java #
## Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway ##

Projeto com base no conteudo da [DIO](https://web.dio.me) de uma simples aplicação baseada em uma aplicação bancaria.

Diagrama de dominios
```mermaid
classDiagram
  class Cliente {
    - cliente: String
  }

  class Account {
    - number: String
    - digit: String
    - agency: String
    - balance: Double
    - limit: Double
    - creditLimit: Double
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - type: String
  }

  class InfoPromo {
    - icon: String
    - content: String
  }

  Cliente --> "1" Account
  Cliente --> "0..*" Feature
  Cliente --> "0..*" Card
  Cliente --> "0..*" InfoPromo
```