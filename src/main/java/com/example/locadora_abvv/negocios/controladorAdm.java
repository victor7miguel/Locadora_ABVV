package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.ICrudAdministrador;
import com.example.locadora_abvv.negocios.beans.Administrador;

public class controladorAdm {
    private ICrudAdministrador adm;

    public controladorAdm(ICrudAdministrador adm) {
        this.adm = adm;
    }

    public void cadastrar (Administrador admin){
        this.adm.cadastrar(admin);
    }

    public Administrador buscar(String cpf){
        return this.adm.buscar(cpf);
    }

    public void remover(String cpf){
        this.adm.remover(cpf);
    }

    public Administrador atualizar (Administrador admin) {
        return this.adm.atualizar(admin);
    }


}
