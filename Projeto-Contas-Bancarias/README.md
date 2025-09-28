# Projeto: Simulação de Contas Bancárias em Java

## 📖 Descrição

Este projeto é uma implementação em Java que simula operações básicas de contas bancárias. O objetivo principal foi aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) para modelar um sistema financeiro simples.

O sistema inclui a criação de diferentes tipos de contas e a realização de operações como saques e depósitos.

## ✨ Funcionalidades

* Criação de Contas Correntes.
* Criação de Contas Poupança.
* Realização de depósitos.
* Realização de saques, com validação de saldo.
* Cálculo de rendimento para Contas Poupança.

## 🧠 Conceitos de POO Aplicados

Neste projeto, foram aplicados os seguintes conceitos-chave de POO:

* **Classes e Objetos:** Foram criadas as classes `Conta` e `ContaPoupanca` para representar os diferentes tipos de contas no sistema. A classe `teste` (ou `main`) instancia objetos dessas classes para simular as operações.
* **Encapsulamento:** Os atributos das classes, como `saldo`, são privados (`private`) e só podem ser acessados ou modificados através de métodos públicos (`getSaldo()`, `depositar()`, `sacar()`), protegendo a integridade dos dados.
* **Herança:** A classe `ContaPoupanca` herda (`extends`) da classe `Conta`. Isso permite que `ContaPoupanca` reutilize todos os atributos e métodos de `Conta`, adicionando apenas o comportamento específico de rendimento.
* **Polimorfismo (se aplicável, com Sobrescrita):** *Se você sobrescreveu algum método, mencione aqui. Exemplo: O método `sacar()` poderia ter uma taxa na Conta Corrente, sendo diferente do `sacar()` da classe mãe.*

## 🚀 Como Executar

1.  **Pré-requisitos:**
    * É necessário ter o **JDK (Java Development Kit)** instalado em sua máquina.

2.  **Compilação:**
    * Abra o terminal ou prompt de comando na pasta do projeto.
    * Compile os arquivos `.java` com o seguinte comando:
        ```bash
        javac Conta.java ContaPoupanca.java teste.java
        ```

3.  **Execução:**
    * Após a compilação, execute a classe principal:
        ```bash
        java teste
        ```
    * O resultado das operações de simulação será exibido no console.
