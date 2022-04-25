package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudPessoa;
import com.example.locadora_abvv.negocios.beans.Pessoa;

public class controladorPessoa {

    private ICrudPessoa pessoa;

    public controladorPessoa(ICrudPessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void cadastrar(Pessoa person){
        this.pessoa.cadastrar(person);
    }

    public Pessoa buscar (String cpf){
        return this.pessoa.buscar(cpf);
    }

    public void remover (String cpf){
        this.pessoa.remover(cpf);
    }

    public Pessoa atualizar(Pessoa person){
        return this.pessoa.atualizar(person);
    }
}
