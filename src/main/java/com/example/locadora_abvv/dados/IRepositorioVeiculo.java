package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Veiculo;

public interface IRepositorioVeiculo {

    void cadastrar(Veiculo veiculo);
    Veiculo buscar (String placa);
    void remover(String placa);
    Veiculo atualizar (Veiculo veiculo);



}
