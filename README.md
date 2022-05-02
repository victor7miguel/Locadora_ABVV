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

Pessoa: //(cliente, funcionario e administrador herdam de pessoa)
- Atributos: nome, cpf (id), senha, telefone, email, endereço

Cliente:
- Atributos: forma de pagamento, habilitação (cnh)

Funcionário:
- Atributos: salário, matricula, função

Veículo:
- Atributos: cor, capacidade, descricao, placa, veiculoLocado, valorMulta

Locação:
- Atributos: dataInicio, dataFim, dataEntrega, valorDiaria
- Funções: calcularValorTotal, calcularMulta

Modelo:
- Atributos: nomeModelo, ano

Fabricante:
- Atributos: nomeFabricante


## Requisitos do projeto

* **REQ1** - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo cliente, funcionário e administrador.

* **REQ2** - O sistema deve permitir o aluguel de veículos previamente cadastrados e salvá-los em um histórico de aluguel por cliente. Cada aluguel de veículo deve ser associado a um único cliente.

* **REQ3** - Um cliente pode ter apenas 1 locação ativa

* **REQ4** - O valor total a pagar será calculado baseado na quantidade de dias.

* **REQ5** - Caso o cliente não devolva no dia limite da locação, um valor de multa será adicionado no valor total a pagar levando em consideração os dias excedentes.

* **REQ6** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **funcionários**. Este gerenciamento é atribuído ao perfil do **administrador**.

* **REQ7** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **clientes**. Este gerenciamento é atribuído aos perfis do **administrador** e **funcionário**.

* **REQ8** - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de **veículos**. Este gerenciamento é atribuído aos perfis do **administrador** e **funcionário**.

* **REQ9** - Cada aluguel deve ter os dados do cliente, os dados do veículo, data do aluguel e da devolução do veículo.
