[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/mineda/exemplo-jdbc) 

# Projeto Maven, JDBC e JavaFX
Projeto exemplo usando Maven, JDBC e JavaFX para inserir e listar registros em uma tabela.

## Pré-requisitos
- Apache Maven: Gerenciador de build que, além de outras funcionalidades, baixa automaticamente as dependências necessárias ao projeto. Instalação em: https://maven.apache.org/download.cgi
- MYSQL: Sistema Gerenciador de Banco de Dados que contém o Banco de Dados utilizado pela aplicação. Execute o script contido no arquivo DDL.sql para criar o Banco de Dados e as tabelas.

## Compilação
Para compilar use: mvn compile

## Gerar JAR
Para gerar o JAR do projeto use: mvn package

## Execução
Para executar use: mvn clean javafx:run
