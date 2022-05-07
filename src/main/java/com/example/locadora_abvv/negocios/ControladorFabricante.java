package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Fabricante;

public class ControladorFabricante {

    private IRepositorio<Fabricante> repositorioFabricantes;

    private static ControladorFabricante instance;

    public ControladorFabricante() {
        this.repositorioFabricantes = new Repositorio<>("fabricantes.dat");
    }

    public static ControladorFabricante getInstance(){
        if (instance == null)
            instance = new ControladorFabricante();
        return instance;
    }

    public void cadastrar(Fabricante f) throws ElementoExisteException {
        this.repositorioFabricantes.cadastrar(f);
    }
    public void listar(){
        this.repositorioFabricantes.listar();
    }

    public void remover(Fabricante f) throws ElementoNaoExisteExcepcion {
        this.repositorioFabricantes.remover(f);
    }
    public void atualizar(Fabricante f) throws ElementoNaoExisteExcepcion {
        this.repositorioFabricantes.atualizar(f);
    }
}
