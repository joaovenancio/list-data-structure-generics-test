package com.joaovenancio;

public class DadosLista<E> {
    //Atributos:
    private E dado;
    private DadosLista<E> proximoDado;

    //Construtor:
    public DadosLista(E dado, DadosLista<E> proximoDado) {
        this.dado = dado;
        this.proximoDado = proximoDado;
    }

    //Metodos:
    public E getDado() {
        return dado;
    }

    public DadosLista<E> getProximo() {
        return proximoDado;
    }

    public void setProximoDado(DadosLista<E> proximoDado) {
        this.proximoDado = proximoDado;
    }
}
