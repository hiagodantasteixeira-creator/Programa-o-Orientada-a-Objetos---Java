# Projeto: Sistema de Cadastro Acadêmico com Classes Abstratas

## 📖 Descrição

Este projeto em Java demonstra a modelagem de um sistema de cadastro simples para uma instituição de ensino. O código utiliza conceitos de Programação Orientada a Objetos (POO) para criar uma hierarquia de classes que representam diferentes tipos de pessoas, como Alunos, Alunos de Mestrado e Funcionários.

O objetivo principal é aplicar conceitos como classes abstratas, herança e encapsulamento para criar um código organizado, reutilizável e coeso.

## ✨ Estrutura das Classes

O projeto é organizado da seguinte forma:

* **`PessoaAbs.java`**: É uma **classe abstrata** que serve como base para todas as outras, definindo atributos e métodos comuns a qualquer pessoa no sistema (código, nome, telefone, endereço).
* **`Funcionario.java`**: Herda de `PessoaAbs` e adiciona o atributo `salario`.
* **`Aluno.java`**: Herda de `PessoaAbs` e adiciona atributos específicos de alunos (`numMatricula`, `media`, `faltas`).
* **`AlunoMestrado.java`**: Herda de `Aluno`, especializando-a com atributos de mestrado (`notaDissertacao`). Também implementa métodos específicos como `Aprovado()` e `imprimeDados()`.
* **`testando.java`**: Classe principal que contém o método `main` para instanciar objetos e testar as funcionalidades do sistema.

## 🧠 Conceitos de POO Aplicados

Neste projeto, foram aplicados os seguintes conceitos-chave de POO:

* **Classe Abstrata:** A classe `PessoaAbs` foi definida como `abstract` para garantir que não possa ser instanciada diretamente, servindo apenas como um modelo para suas subclasses.
* **Herança:** As classes `Aluno`, `Funcionario` e `AlunoMestrado` utilizam a palavra-chave `extends` para herdar atributos e métodos da classe `PessoaAbs` ou `Aluno`, promovendo a reutilização de código.
* **Encapsulamento:** Os atributos das classes são declarados como `private` ou `protected`. O acesso a eles é controlado por meio de métodos públicos `get` e `set`, protegendo a integridade dos dados.
* **Polimorfismo (Sobrescrita):** O método `imprimeDados()` da classe `AlunoMestrado` estende o comportamento do método `imprimirDados()` da classe `PessoaAbs` (chamado via `super.imprimirDados()`), adaptando a impressão para as necessidades específicas do aluno de mestrado.

## 🚀 Como Executar o Projeto

Para compilar e executar este projeto, siga os passos abaixo.

1.  **Pré-requisitos:**
    * É necessário ter o **JDK (Java Development Kit)** instalado em sua máquina.

2.  **Compilação:**
    * Abra um terminal ou prompt de comando na pasta onde os arquivos `.java` estão salvos.
    * Compile todos os arquivos `.java` de uma vez com o seguinte comando:
        ```bash
        javac PessoaAbs.java Funcionario.java Aluno.java AlunoMestrado.java testando.java
        ```

3.  **Execução:**
    * Após a compilação bem-sucedida, execute a classe principal que contém o método `main`:
        ```bash
        java pessoaabs.testando
        ```
    * O programa irá criar uma instância de `AlunoMestrado`, imprimir seus dados no console e verificar se o aluno foi aprovado, conforme definido na classe `testando.java`.
