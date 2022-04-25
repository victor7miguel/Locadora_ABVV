package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.negocios.beans.Locacao;

public interface ICrudLocacao {

    void cadastrar(Locacao locacao);
    Locacao buscar (String cpf);
    void remover(String cpf);
    Locacao atualizar (Locacao locacao);
}
