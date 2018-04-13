package com.joaovenancio;

public class DadosLista<E extends IOrdenavel> {
    //Atributos:
    private E dado;
    private DadosLista<E> proximoDado;
    private int dadoID;

    //Construtor:
    public DadosLista(E dado, DadosLista<E> proximoDado) {
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

    public DadosLista<E> getProximo() {
        return proximoDado;
    }

    public void setProximoDado(DadosLista<E> proximoDado) {
        this.proximoDado = proximoDado;
    }

    /**
     * Ele ve se existe algum dado de Objeto, se tiver, retorna o ID desse objeto, caso contrario,
     * retorna 0 ou um ID setado pelo metodo setDadoID().
     *
     * @return the ID from the Generic Object extended from the IOrdenavel Interface..
     * @return 0 or any setable int (by setDadoID() method) if this DadosLista doesn't have any Generic Object.
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
