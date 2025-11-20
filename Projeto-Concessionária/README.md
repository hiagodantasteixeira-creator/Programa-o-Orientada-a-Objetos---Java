# 🚗 Concessionária Dantas - Sistema de Gerenciamento

## 📖 Descrição
Este projeto consiste em um sistema de gerenciamento para uma concessionária de veículos, desenvolvido em **Java**. Inicialmente criado como uma aplicação de console para estudo de **Programação Orientada a Objetos (POO)**, o projeto evoluiu para uma arquitetura profissional baseada no padrão **MVC (Model-View-Controller)** e agora conta com uma **Interface Gráfica (GUI)** utilizando **Swing**.

O sistema permite gerenciar o fluxo completo da **Concessionária Dantas**, controlando Clientes, Funcionários, Veículos e Vendas através de um menu visual intuitivo.

## ⚙️ Funcionalidades e Atualizações
O projeto passou por uma refatoração completa para melhorar a organização e a usabilidade:

* **Arquitetura MVC:** O código foi reestruturado para separar as responsabilidades em camadas (Visão, Controle e Modelo).
* **Interface Gráfica (GUI):** Substituição da interação via terminal por janelas interativas (`JFrame`), facilitando o uso por usuários finais.
* **Menu Principal Visual:** Um painel central que permite navegação fácil entre os módulos do sistema.
* **CRUD Completo via Formulários:** Cadastros, consultas, atualizações e remoções agora são feitos através de campos de texto e botões interativos.
* **Relatórios em Tela:** Visualização de listagens de dados diretamente na interface gráfica, sem necessidade de ler o console.

## 🚧 Status do Projeto
O sistema está em constante evolução. Abaixo, o status de desenvolvimento de cada módulo da interface gráfica:

* ✅ **Gerenciamento de Clientes:** **Completo**. Interface gráfica implementada para cadastro, busca, edição, remoção e relatórios.
* 🔄 **Gerenciamento de Funcionários:** Em desenvolvimento (Lógica no Controller pronta, GUI em construção).
* 🔄 **Gerenciamento de Veículos:** Em desenvolvimento (Lógica no Controller pronta, GUI em construção).
* 🔄 **Gerenciamento de Vendas:** Em desenvolvimento (Lógica no Controller pronta, GUI em construção).

## 📂 Nova Estrutura de Pastas (MVC)
A organização de pacotes foi atualizada para refletir o padrão de arquitetura:

* `src/view`: Contém as telas do sistema (ex: `MenuPrincipal`, `FormularioCliente`, `RelatorioCliente`). É a camada responsável pela interação com o usuário.
* `src/controller`: Contém a classe `Concessionaria`, que atua como o orquestrador. Ela processa as requisições da View e gerencia as listas de dados.
* `src/model`: Contém as classes que representam as entidades do negócio (`Cliente`, `Veiculo`, `Venda`, `Funcionario`).
* `Interfaces`: O arquivo `OperacoesConcessionaria.java` garante que o Controller implemente todas as regras de negócio necessárias.

## 🧠 Conceitos de POO Aplicados
Além dos conceitos iniciais, a nova versão reforça:

* **Herança e Polimorfismo:** Uso contínuo na estrutura de classes e na implementação de interfaces.
* **Encapsulamento:** Proteção dos dados nas classes de modelo e uso de métodos de acesso.
* **Eventos (Listeners):** Tratamento de ações do usuário (cliques de botões) nas classes de interface gráfica (`ActionListeners` no Swing).
* **Acoplamento Fraco:** A camada de visualização (`view`) não manipula os dados diretamente, mas solicita ações ao controlador (`controller`).

## 🚀 Como Executar o Projeto
Como o projeto agora possui múltiplos pacotes e dependências de interface gráfica Swing, recomenda-se o uso de uma IDE (NetBeans, IntelliJ ou Eclipse).

1.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/hiagodearaujodantasteixeira/Programa-o-Orientada-a-Objetos---Java.git](https://github.com/hiagodearaujodantasteixeira/Programa-o-Orientada-a-Objetos---Java.git)
    ```
2.  **Abrir na IDE:**
    Importe o projeto na sua IDE de preferência.
3.  **Executar:**
    Localize a classe `view.MenuPrincipal` e execute o arquivo. A janela principal da aplicação será aberta.

## 👤 Autor
**Hiago de Araujo Dantas Teixeira**
