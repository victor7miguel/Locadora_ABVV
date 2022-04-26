package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudFabricante;
import com.example.locadora_abvv.negocios.beans.Fabricante;

public class controladorFabricante {
   private ICrudFabricante fabricante;

    public controladorFabricante(ICrudFabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void cadastrar (Fabricante fab){
        this.fabricante.cadastrar(fab);
    }

    public Fabricante buscar(String nome){
        return this.fabricante.buscar(nome);
    }

    public void remover(String nome){
        this.fabricante.remover(nome);
    }

    public Fabricante atualizar(Fabricante fab){
        return this.fabricante.atualizar(fab);
    }
}
