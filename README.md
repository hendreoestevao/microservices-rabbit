Projeto: Comunicação Assíncrona com RabbitMQ e Spring Boot

Descrição

Este projeto demonstra a implementação de comunicação assíncrona entre microservices utilizando RabbitMQ e Spring Boot. O objetivo é garantir a troca eficiente de mensagens entre microservices de maneira desacoplada, possibilitando maior escalabilidade e resiliência do sistema.

Durante o desenvolvimento, foram abordadas as principais etapas de configuração e implementação, incluindo:

Configuração do ambiente com RabbitMQ

Criação dos microservices User e Email

Envio e consumo de mensagens assíncronas

Integração com SMTP (Gmail) para envio de e-mails

Funcionalidades Implementadas

1. Configuração e Integração com RabbitMQ

Definição das filas, exchanges e bindings para comunicação entre os microservices.

Configuração da conexão do RabbitMQ utilizando CloudAMQP como provedor.

Uso de Spring AMQP para facilitar a interação com o RabbitMQ.

2. Desenvolvimento dos Microservices

User Service: Responsável por cadastrar novos usuários e enviar eventos para o RabbitMQ.

Email Service: Escuta os eventos de novos usuários e envia e-mails de confirmação.

3. Implementação de Comunicação Assíncrona

Producer (User Service):

Envia mensagens para a fila RabbitMQ ao criar um novo usuário.

Consumer (Email Service):

Processa as mensagens recebidas e envia um e-mail de confirmação para o usuário.

4. Envio de Emails com SMTP (Gmail)

Configuração do SMTP do Gmail para envio de e-mails automáticos.

Uso de Spring Mail para envio de mensagens.

Validação do fluxo completo de comunicação entre os microservices.

Preparação do Ambiente

Antes de iniciar o projeto, certifique-se de ter os seguintes requisitos instalados:

Requisitos:

JDK 17 (ou superior)

Maven (para gerenciamento de dependências)

RabbitMQ (localmente ou via CloudAMQP)

PostgreSQL (para persistência de dados)

PgAdmin (opcional, para gerenciamento do banco de dados)

Postman (para testar os endpoints)

IDE (IntelliJ IDEA, Spring Tool Suite - STS, Eclipse, ou outra de sua preferênci
