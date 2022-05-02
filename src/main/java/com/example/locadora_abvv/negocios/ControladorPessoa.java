package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Pessoa;

public class controladorPessoa {

    private IRepositorio<Pessoa> repositorioPessoas;

    public controladorPessoa(IRepositorio<Pessoa> repositorioPessoas) {
        this.repositorioPessoas = new Repositorio<>("pessoas.dat");
    }

    public void cadastrar(Pessoa p) throws ElementoExisteException {
        this.repositorioPessoas.cadastrar(p);
    }

    public void listar(){
        this.repositorioPessoas.listar();
    }

    public void remover(Pessoa p) throws ElementoNaoExisteExcepcion {
        this.repositorioPessoas.remover(p);
    }

    public void atualizar(Pessoa p) throws ElementoNaoExisteExcepcion {
        this.repositorioPessoas.atualizar(p);
    }
}
