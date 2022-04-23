package com.example.locadora_abvv.negocios.beans;

public class Administrador extends Funcionario{

    private int matricula;

    public Administrador(String nome, String cpf, String senha, String telefone, String email, String endereco, double salario, String funcao, int matricula) {
        super(nome, cpf, senha, telefone, email, endereco, salario, funcao);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
