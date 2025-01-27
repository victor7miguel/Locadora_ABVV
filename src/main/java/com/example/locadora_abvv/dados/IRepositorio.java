package com.example.locadora_abvv.dados;

import com.example.locadora_abvv.exceptions.ElementoExisteException;
import com.example.locadora_abvv.exceptions.ElementoNaoExisteExcepcion;

import java.util.List;

public interface IRepositorio<T> {
    void cadastrar(T obj) throws ElementoExisteException;
    List<T> listar();
    void remover(T obj) throws ElementoNaoExisteExcepcion;
    void atualizar(T novoObj) throws ElementoNaoExisteExcepcion;

}
