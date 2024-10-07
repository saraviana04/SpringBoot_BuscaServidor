
# SpringBoot_BuscaServidor

Servidor Público - Busca de Servidores Públicos
Este projeto é uma aplicação web desenvolvida em Java utilizando o framework Spring Boot. Ele permite buscar e listar servidores públicos a partir de um arquivo JSON que contém informações detalhadas como matrícula, nome, foto, órgão, cargo, lotação, entre outros.

# Funcionalidades
Listar todos os servidores públicos.
Buscar um servidor público específico pela matrícula.
Exibir detalhes completos do servidor público encontrado.
# Tecnologias Utilizadas
Java 21: Linguagem principal do projeto.
Spring Boot 3.3.4: Framework para facilitar a criação de aplicações web e RESTful.
JSON: Usado para armazenar os dados dos servidores.
Maven: Gerenciamento de dependências e build da aplicação.
Swing (JOptionPane): Utilizado para interações gráficas no terminal, como solicitar a matrícula e exibir os dados de um servidor.
# Arquitetura
A aplicação segue uma arquitetura baseada em serviços, com classes para modelo, serviço e implementação do serviço. O fluxo principal envolve:

ServidorPublico (modelo): Representa os dados de um servidor público.
ServidorPublicoService (interface): Define os métodos para listar e buscar servidores.
ServidorPublicoServiceImpl (implementação): Implementa a lógica de leitura do arquivo JSON e manipulação dos dados.
ServidorpublicoApplicationRunner (configuração): Configura e executa os métodos de listagem e busca de servidores na inicialização da aplicação.
Como Executar o Projeto

# Pré-requisitos
Java 21+
Maven
Spring Boot 3.3.4
Passo a Passo
Clone o repositório do projeto:

bash
Copiar código
git clone https://github.com/usuario/servidor-publico.git
Navegue até o diretório do projeto:


Busca por Matrícula
A aplicação solicita a matrícula de um servidor via uma janela gráfica (JOptionPane). Após digitar a matrícula, os dados completos do servidor serão exibidos em outra janela gráfica.

Exemplo de Saída
plaintext
Copiar código
Matrícula: 3
Nome: Maria Fontenele
Foto: https://abctreinamentos.com.br/imgs/maria.png
Órgão: ENAP
Vínculo: Estatutario
Cargo: Analista
Lotação: Brasília
Exercício: Departamento de Treinamento
Email: mariafontenele@enap.br
Telefone: (61) 3255-6010
Celular: (61) 99910-5722
CPF: 123.4567.789-01
Naturalidade: Recife
Estrutura do Projeto
plaintext
Copiar código
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.ServidorPublico
│   │   │       ├── model
│   │   │       │   └── ServidorPublico.java
│   │   │       ├── service
│   │   │       │   ├── ServidorPublicoService.java
│   │   │       │   └── ServidorPublicoServiceImpl.java
│   │   │       └── ServidorpublicoApplicationRunner.java
│   │   └── resources
│   │       └── data
│   │           └── servidorpublico.json
├── pom.xml
└── README.md
Dependências Maven
xml
Copiar código
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
Autor
Sara Viana
