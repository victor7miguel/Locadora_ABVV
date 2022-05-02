package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Funcionario;

public class controladorFuncionario {

    private IRepositorio<Funcionario> repositorioFuncionarios;

    public controladorFuncionario(IRepositorio<Funcionario> repositorioFuncionarios) {
        this.repositorioFuncionarios = new Repositorio<>("funcionarios.dat");
    }

    public void cadastrar(Funcionario f) throws ElementoExisteException {
        if (f.calcularIdade > 18) {
            this.repositorioFuncionarios.cadastrar(f);
        }
    }

    public void listar(){
        this.repositorioFuncionarios.listar();
    }

    public void remover(Funcionario f) throws ElementoNaoExisteExcepcion {
        this.repositorioFuncionarios.remover(f);
    }

    public void atualizar(Funcionario f) throws ElementoNaoExisteExcepcion {
        this.repositorioFuncionarios.atualizar(f);
    }
}
