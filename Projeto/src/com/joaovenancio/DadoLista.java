package com.joaovenancio;

public class DadoLista<E extends IOrdenavel> {
    //Atributos:
    private E dado;
    private DadoLista<E> proximoDado;
    private int dadoID;

    //Construtor:
    public DadoLista(E dado, DadoLista<E> proximoDado) {
        this.dado = dado;
        this.proximoDado = proximoDado;
        if (dado == null) {
            this.dadoID = 0;
        } else {
            this.dadoID = this.dado.getID();
        }
    }

    //Metodos:
    public E getDado() {
        return dado;
    }

    public DadoLista<E> getProximo() {
        return proximoDado;
    }

    public void setProximoDado(DadoLista<E> proximoDado) {
        this.proximoDado = proximoDado;
    }

    /**
     * Ele ve se existe algum dado de Objeto, se tiver, retorna o ID desse objeto, caso contrario,
     * retorna 0 ou um ID setado pelo metodo setDadoID().
     *
     * @return the ID from the Generic Object extended from the IOrdenavel Interface..
     * @return 0 or any setable int (by setDadoID() method) if this DadoLista doesn't have any Generic Object.
     */
    public int getDadoID () {
        if (this.dado == null) {
            return this.dadoID;
        } else {
            this.dadoID = this.dado.getID();
            return this.dadoID;
        }
    }

    public void setDadoID (int novoDadoID) {
        this.dadoID = novoDadoID;
    }
}
