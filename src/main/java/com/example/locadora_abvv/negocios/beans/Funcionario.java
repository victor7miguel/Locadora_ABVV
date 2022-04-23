package com.example.locadora_abvv.negocios.beans;

public class Funcionario extends Pessoa{

    private double salario;
    private String funcao;

    public Funcionario(String nome, String cpf, String senha, String telefone, String email, String endereco, double salario, String funcao) {
        super(nome, cpf, senha, telefone, email, endereco);
        this.salario = salario;
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
