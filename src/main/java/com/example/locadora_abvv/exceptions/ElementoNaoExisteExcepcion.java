package com.example.locadora_abvv.exceptions;

public class ElementoNaoExisteExcepcion extends Exception{

    private static final long serialVersionUID = -7096022758377417172L;

    private Object elemento;

    public ElementoNaoExisteExcepcion(Object obj) {
        super("Objeto não existe no repositório");
        this.elemento = obj;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
