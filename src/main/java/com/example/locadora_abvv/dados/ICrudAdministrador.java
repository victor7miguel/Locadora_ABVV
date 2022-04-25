package com.example.locadora_abvv.dados;


import com.example.locadora_abvv.negocios.beans.Administrador;

public interface ICrudAdministrador {

    void cadastrar (Administrador adm);
    Administrador buscar (String cpf);
    void remover (String cpf);
    Administrador atualizar(Administrador adm);
}
