package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Pessoa;

public interface IRepositorioPessoa {

    void cadastrar (Pessoa pessoa);
    Pessoa buscar (String cpf);
    void remover (String cpf);
    Pessoa atualizar(Pessoa pessoa);
}
