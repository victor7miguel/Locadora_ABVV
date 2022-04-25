package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Funcionario;

public interface ICrudFuncionario {

    void cadastrar (Funcionario funcionario);
    Funcionario buscar (String cpf);
    void remover (String cpf);
    Funcionario atualizar (Funcionario funcionario);
}
