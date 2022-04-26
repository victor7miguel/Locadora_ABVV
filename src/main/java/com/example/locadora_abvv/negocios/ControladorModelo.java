package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudModelo;
import com.example.locadora_abvv.negocios.beans.Modelo;

public class controladorModelo {

    private ICrudModelo modelo;

    public controladorModelo(ICrudModelo modelo) {
        this.modelo = modelo;
    }

    public void cadastrar(Modelo model){
        this.modelo.cadastrar(model);
    }

    public Modelo buscar (String nome){
        return this.modelo.buscar(nome);
    }

    public void remover(String nome){
        this.modelo.remover(nome);
    }

    public Modelo atualizar(Modelo model){
        return this.modelo.atualizar(model);
    }
}
