package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudFuncionario;
import com.example.locadora_abvv.negocios.beans.Funcionario;

public class controladorFuncionario {

    private ICrudFuncionario funcionario;

    public controladorFuncionario(ICrudFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrar(Funcionario func){
        this.funcionario.cadastrar(func);
    }

    public Funcionario buscar(String cpf){
        return this.funcionario.buscar(cpf);
    }

    public void remover(String cpf){
        this.funcionario.remover(cpf);
    }

    public Funcionario atualizar (Funcionario func){
        return this.funcionario.atualizar(func);
    }
}
