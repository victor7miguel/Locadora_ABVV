package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Cliente;

public class controladorCliente {
    private IRepositorio<Cliente> repositorioClientes;

    public controladorCliente(IRepositorio<Cliente> repositorioClientes) {
        this.repositorioClientes = new Repositorio<>("clientes.dat");
    }

    public void cadastrar(Cliente c) throws ElementoExisteException {
        this.repositorioClientes.cadastrar(c);
    }

    public void listar(){
        this.repositorioClientes.listar();
    }

    public void remover (Cliente c) throws ElementoNaoExisteExcepcion {
        this.repositorioClientes.remover(c);
    }

    public void atualizar (Cliente c) throws ElementoNaoExisteExcepcion {
        this.repositorioClientes.atualizar(c);
    }
}


