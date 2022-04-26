package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Fabricante;

public interface IRepositorioFabricante {
    void cadastrar(Fabricante fabricante);
    Fabricante buscar (String nome);
    void remover(String nome);
    Fabricante atualizar (Fabricante fabricante);
}
