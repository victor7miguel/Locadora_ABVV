package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudLocacao;
import com.example.locadora_abvv.negocios.beans.Locacao;

public class controladorLocacao {

    private ICrudLocacao locacao;

    public controladorLocacao(ICrudLocacao locacao) {
        this.locacao = locacao;
    }

    public void cadastrar(Locacao loca){
        this.locacao.cadastrar(loca);
    }

    public Locacao buscar(String cpf){
        return this.locacao.buscar(cpf);
    }

    public void remover(String cpf){
        this.locacao.remover(cpf);
    }

    public Locacao atualizar(Locacao loca){
        return this.locacao.atualizar(loca);
    }
}
