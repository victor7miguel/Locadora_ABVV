package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Modelo;

public class controladorModelo {

    private IRepositorio<Modelo> repositorioModelos;

    public controladorModelo(IRepositorio<Modelo> repositorioModelos) {
        this.repositorioModelos = new Repositorio<>("modelos.dat");
    }

    public void cadastrar(Modelo m) throws ElementoExisteException {
        this.repositorioModelos.cadastrar(m);
    }

    public void listar(){
        this.repositorioModelos.listar();
    }

    public void remover(Modelo m) throws ElementoNaoExisteExcepcion {
        this.repositorioModelos.remover(m);
    }

    public void atualizar(Modelo m) throws ElementoNaoExisteExcepcion {
        this.repositorioModelos.atualizar(m);
    }
}
