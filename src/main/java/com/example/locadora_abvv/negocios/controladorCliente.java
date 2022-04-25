package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudCliente;
import com.example.locadora_abvv.negocios.beans.Cliente;

public class controladorCliente {
   private ICrudCliente cliente;

    public controladorCliente(ICrudCliente cliente) {
        this.cliente = cliente;
    }

    public void cadastrar(Cliente cli){
        this.cliente.cadastrar(cli);
    }

    public Cliente buscar (String cpf){
        return this.cliente.buscar(cpf);
    }

    public void remover (String cpf){
        this.cliente.remover(cpf);
    }

    public Cliente atualizar (Cliente cli){
        return this.cliente.atualizar(cli);
    }
}
