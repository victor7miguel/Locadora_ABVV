package com.example.locadora_abvv.exceptions;

public class ElementoExisteException extends Exception {
    private static final long serialVersionUID = 4868332235826988515L;

    private Object elemento;

    public ElementoExisteException(Object obj) {
        super("Objeto já está cadastrado no repositório e não pode ser adicionado novamente");
        this.elemento = obj;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
