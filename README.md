# Locadora ABVV

Ideias de projeto podem vir de:
 
 * https://www.localiza.com/brasil/pt-br
 * https://www.movida.com.br/reserva/escolha-seu-veiculo

# Integrantes do grupo 

 * Artur Dantas Guimarães - arturguimaraes82@gmail.com
 * Bruno Santana de Oliveira - brunosantana610@gmail.com
 * Victor Miguel de Souza Soares - victor78miguel@gmail.com
 * Vinicius José Gonçalves do Carmo - vinooo965@gmail.com


## Descrição geral do projeto

O sistema de locação de veículos conta com um catálogo de veículos (modelo, cor, ano), bem como os clientes ativos, os aluguéis realizados pelos clientes, relatórios, entre outros.

Entidades:

Cliente:
- Atributos: nome, id (cpf), senha, telefone, email, forma de pagamento, habilitação
- Funções: locar veículos, listar veículos disponíveis;

Funcionário:
- Atributos: nome, id (cpf), senha, telefone, endereço, salário
- Funções: CRUD de clientes, CRUD de veículos,listar clientes ativos, relatórios de veículos disponíveis, relatórios de veículos alugados.

Administrador:
- Atributos: nome, id (cpf), senha, telefone, endereço, salário
- Funções: funções atribuídas ao funcionário, CRUD de funcionários, gerar relatório de rendimentos mensal

Veículo:
- Atributos: modelo, cor, ano, febricante, capacidade, descrição

Estoque:
- Atributos: veículo, quantidade


## Requisitos do projeto

* **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo cliente, funcionário e administrador.

* **REQ2** - O sistema deve permitir o aluguel de veículos previamente cadastrados e salvá-los como em um histórico de aluguel por cliente. Cada aluguel de veículo deve ser associado a um único cliente.

* **REQ3** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de funcionários, clientes e veículos e essa ação pode ser feita por funcionários.

* **REQ4** - O sistema deve permitir o gerenciamento (CRUD) de funcionários da empresa e essa ação somente poderá ser executada pelo gerente. O gerente também pode executar todas as funcionalidades que um funcionário pode executar.

* **REQ5** - Cada aluguel deve ter os dados do cliente, os dados do veículo, data do aluguel e da devolução do veículo.

* **REQ6** - O sistema deve calcular e aplicar multa caso o cliente não devolva o veículo na data acordada.
