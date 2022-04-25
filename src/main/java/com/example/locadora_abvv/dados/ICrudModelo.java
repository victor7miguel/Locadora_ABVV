package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Modelo;

public interface ICrudModelo {

    void cadastrar(Modelo modelo);
    Modelo buscar (String nome);
    void remover(String nome);
    Modelo atualizar (Modelo modelo);
}
