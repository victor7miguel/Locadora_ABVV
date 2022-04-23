package com.example.locadora_abvv.negocios.beans;

public class Cliente extends Pessoa{
    private String formaPagamento;
    private String cnh;

    public Cliente(String nome, String cpf, String senha, String telefone, String email, String endereco, String formaPagamento, String cnh) {
        super(nome, cpf, senha, telefone, email, endereco);
        this.formaPagamento = formaPagamento;
        this.cnh = cnh;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
