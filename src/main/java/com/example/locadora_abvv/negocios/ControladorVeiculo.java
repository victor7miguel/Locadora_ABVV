package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudVeiculo;
import com.example.locadora_abvv.negocios.beans.Veiculo;

public class controladorVeiculo {

    private ICrudVeiculo veiculo;

    public controladorVeiculo(ICrudVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void cadastrar(Veiculo vei){
        this.veiculo.cadastrar(vei);
    }

    public Veiculo buscar (String placa){
        return this.veiculo.buscar(placa);
    }

    public void remover (String placa){
        this.veiculo.remover(placa);
    }

    public Veiculo atualizar (Veiculo vei){
        return this.veiculo.atualizar(vei);
    }
}
