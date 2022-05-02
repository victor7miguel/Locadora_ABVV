package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Veiculo;

public class controladorVeiculo {

    private IRepositorio<Veiculo> repositorioVeiculos;

    public controladorVeiculo(IRepositorio<Veiculo> repositorioVeiculos) {
        this.repositorioVeiculos = new Repositorio<>("veiculos.dat");
    }

    public void cadastrar(Veiculo v) throws ElementoExisteException {
        this.repositorioVeiculos.cadastrar(v);
    }

    public void listar(){
        this.repositorioVeiculos.listar();
    }

    public void remover(Veiculo v) throws ElementoNaoExisteExcepcion {
        this.repositorioVeiculos.remover(v);
    }

    public void atualizar(Veiculo v) throws ElementoNaoExisteExcepcion {
        this.repositorioVeiculos.atualizar(v);
    }
}
