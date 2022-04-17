por # Locadora ABVV

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
- Atributos: nome, id (cpf), senha, telefone, email, endereço, forma de pagamento, habilitação
- Funções: locar veículos, listar veículos disponíveis;

Funcionário:
- Atributos: nome, id (cpf), senha, telefone, email, endereço, salário, função
- Funções: CRUD de clientes, CRUD de veículos, listar clientes ativos, listar de veículos disponíveis, listar de veículos alugados.

Administrador:
- Atributos: nome, id (cpf), senha, telefone, email, endereço, salário, função, matrícula
- Funções: CRUD de clientes, CRUD de funcionários, CRUD de veículos, listar clientes ativos, listar de veículos disponíveis, listar de veículos alugados, gerar relatório de rendimentos mensal

Veículo:
- Atributos: modelo, cor, ano, fabricante, capacidade, descrição

Locação:
- Atributos: dataInicio, dataFim, dias, valor

Modelo:
- Atributos: nomeModelo, ano

Fabricante:
- Atributos: nomeFabricante


## Requisitos do projeto

* **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo cliente, funcionário e administrador.

* **REQ2** - O sistema deve permitir o aluguel de veículos previamente cadastrados e salvá-los em um histórico de aluguel por cliente. Cada aluguel de veículo deve ser associado a um único cliente.

* **REQ3** - Um cliente pode alugar apenas 1 veículo por locação.

* **REQ4** - O valor total a pagar será calculado pela quilometragem rodada mais o valor fixo dos dias.

* **REQ5** - Caso o cliente não devolva no dia limite da locação, um valor de multa será adicionado no valor total a pagar levando em consideração os dias excedentes.

* **REQ6** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **funcionários**. Este gerenciamento é atribuído ao perfil do **administrador**.

* **REQ7** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **clientes**. Este gerenciamento é atribuído aos perfis do **administrador** e **funcionário**.

* **REQ8** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **veículos**. Este gerenciamento é atribuído aos perfis do **administrador** e **funcionário**.

* **REQ9** - Cada aluguel deve ter os dados do cliente, os dados do veículo, data do aluguel e da devolução do veículo.
