Projeto: Cardápio Culinário com Polimorfismo
Descrição
Este projeto em Java demonstra uma modelagem simples de um cardápio de receitas. O código utiliza conceitos avançados de Programação Orientada a Objetos (POO) para criar uma estrutura de classes flexível que representa diferentes tipos de pratos (doces e salgados) e seus métodos de preparo (cozido, assado).

O objetivo principal é aplicar conceitos como classes abstratas, herança, interfaces e, especialmente, polimorfismo para criar um código organizado, coeso e facilmente extensível.

 Estrutura das Classes
O projeto é organizado da seguinte forma:

Receita.java: É uma classe abstrata que serve como base para todas as outras, definindo atributos e métodos comuns a qualquer receita no sistema (como getIngredientes() e getModoDeFazer()).

Cozido.java e Assado.java: São interfaces que definem "contratos" de comportamento, especificando métodos como cozinhar() e assar().

Bolo.java, CarneDePanela.java: São subclasses concretas que herdam de Receita e implementam uma ou ambas as interfaces, fornecendo implementações específicas para cada prato.

Cardapio.java: Classe principal que contém o método main para instanciar as diferentes receitas e testar as funcionalidades do sistema de forma polimórfica.

Conceitos de POO aplicados
Neste projeto, foram aplicados os seguintes conceitos-chave de POO:

Classe Abstrata: A classe Receita foi definida como abstract para garantir que não possa ser instanciada diretamente, fornecendo apenas um modelo para suas subclasses.

Herança: As classes Bolo, Lasanha, etc., utilizam a palavra-chave extends para herdar a estrutura e os métodos da classe Receita, promovendo a reutilização de código.

Interfaces: As interfaces Cozido e Assado são usadas com a palavra-chave implements para adicionar comportamentos específicos às subclasses, permitindo que uma receita seja, por exemplo, cozida e assada, simulando herança múltipla de tipos.

Encapsulamento: Os atributos das classes são declarados como private. O acesso a eles é controlado por meio de métodos públicos (isEhDoce()) e construtores, protegendo a integridade dos dados.

Polimorfismo: Este é o conceito central do projeto. A classe Cardapio trata todos os objetos (Bolo, Lasanha) de forma uniforme através da referência da superclasse Receita. Ao chamar métodos como getIngredientes(), a versão correta (sobreposta) de cada subclasse é executada em tempo de execução.

Como Executar o Projeto
Para compilar e executar este projeto, siga os passos abaixo.

Pré-requisitos:
É necessário ter o JDK (Java Development Kit) instalado em sua máquina.

Compilação:
Abra um terminal ou prompt de comando na pasta src do seu projeto.

Compile todos os arquivos .java do pacote receita com o seguinte comando:

Bash

javac receita/*.java
Execução:
Após a compilação bem-sucedida, ainda na pasta src, execute a classe principal que contém o método main:

Bash

java receita.Cardapio
O programa irá criar instâncias das diferentes receitas, imprimir seus detalhes no console e invocar os métodos de preparo (assar, cozinhar), conforme definido na classe Cardapio.java.
