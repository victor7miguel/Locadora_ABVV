package com.example.locadora_abvv.negocios.beans;

public class Veiculo {
    private String cor;
    private int capacidade;
    private String descricao;
    private String placa;
    private boolean veiculoLocado;
    private double valorMulta;

    public Veiculo(String cor, int capacidade, String descricao, String placa, boolean veiculoLocado, double valorMulta) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.placa = placa;
        this.veiculoLocado = veiculoLocado;
        this.valorMulta = valorMulta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isVeiculoLocado() {
        return veiculoLocado;
    }

    public void setVeiculoLocado(boolean veiculoLocado) {
        this.veiculoLocado = veiculoLocado;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }
}
