package com.example.locadora_abvv.negocios;

import com.example.locadora_abvv.dados.IRepositorio;
import com.example.locadora_abvv.dados.Repositorio;
import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;
import com.example.locadora_abvv.negocios.beans.Funcionario;

public class ControladorFuncionario {

    private IRepositorio<Funcionario> repositorioFuncionarios;
    private static ControladorFuncionario instance;

    public ControladorFuncionario() {
        this.repositorioFuncionarios = new Repositorio<>("funcionarios.dat");
    }

    public static ControladorFuncionario getInstance(){
        if (instance == null)
            instance = new ControladorFuncionario();
        return instance;
    }

    public void cadastrar(Funcionario f) throws ElementoExisteException {
        if (f.calcularIdade() >= 18) {
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
