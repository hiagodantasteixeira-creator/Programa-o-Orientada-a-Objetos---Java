# 🚗 Projeto: Sistema de Gerenciamento de Concessionária
## 📖 Descrição
Este projeto é um sistema de gerenciamento para uma concessionária de veículos, desenvolvido em Java e executado via console. O software foi criado como um exercício prático para aplicar os conceitos fundamentais da Programação Orientada a Objetos (POO), resultando em uma aplicação robusta e bem estruturada.

O sistema permite gerenciar as principais entidades de uma concessionária: Clientes, Funcionários, Veículos e Vendas.

## ⚙️ Funcionalidades
* Menu Interativo de Dois Níveis: Uma interface de texto amigável que guia o usuário primeiro pela escolha da entidade (Cliente, Funcionário, etc.) e depois pela operação desejada.

* Gerenciamento Completo (CRUD): Suporte completo para as quatro operações essenciais em todas as entidades:

* Create (Cadastrar)

* Read (Consultar)

* Update (Alterar)

* Delete (Remover)

* Armazenamento de Dados em Memória: Todas as informações são salvas em ArrayLists durante a execução do programa.

## 🧠 Conceitos de POO Aplicados
O projeto foi cuidadosamente estruturado para aplicar os pilares da Programação Orientada a Objetos:

* Herança: A reutilização de código é promovida através da superclasse Pessoa, que define atributos e comportamentos comuns para Cliente e Funcionario.

* Encapsulamento: Todos os atributos das classes de modelo são declarados como private, e o acesso é controlado de forma segura por meio de métodos públicos (getters e setters).

* Interface: A interface OperacoesConcessionaria define um contrato claro para a classe principal, garantindo que todas as funcionalidades de CRUD sejam implementadas e padronizadas.

* Polimorfismo: A classe Concessionaria implementa a interface, fornecendo "formas" (polimorfos) concretas para os métodos definidos no contrato. A lógica de menu que chama diferentes métodos com base na entrada do usuário também é uma aplicação deste conceito.

## 📂 Estrutura do Projeto
Pessoa.java: Classe base que contém atributos comuns a clientes e funcionários (nome, cpf, etc.).

Cliente.java e Funcionario.java: Subclasses que herdam de Pessoa e adicionam seus próprios atributos específicos.

Veiculo.java e Venda.java: Classes de modelo que representam os veículos e as transações de venda, incluindo seus relacionamentos.

OperacoesConcessionaria.java: Interface que define o contrato com todas as operações que a concessionária deve ser capaz de realizar.

Concessionaria.java: Classe principal que atua como "controladora" da aplicação. Ela contém o método main, gerencia os menus, a interação com o usuário e as listas de dados.

## 🚀 Como Executar o Projeto
Para compilar e executar este projeto localmente, siga os passos abaixo.

* Pré-requisitos:
É necessário ter o JDK (Java Development Kit) instalado e configurado em sua máquina.

* Compilação:
Abra um terminal ou prompt de comando na pasta src do seu projeto.

Compile todos os arquivos .java do pacote concessionaria com o seguinte comando:


javac concessionaria/*.java
Execução:
Após a compilação bem-sucedida, ainda na pasta src, execute a classe principal Concessionaria, especificando o nome completo (pacote + classe):


java concessionaria.Concessionaria
O programa iniciará e exibirá o menu principal no console.

👤 Autor
Hiago
