package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Cliente;

public interface ICrudCliente {

    void cadastrar(Cliente cliente);
    Cliente buscar (String cpf);
    void remover(String cpf);
    Cliente atualizar (Cliente cliente);
}
