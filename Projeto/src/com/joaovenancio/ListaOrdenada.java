package com.joaovenancio;

public class ListaOrdenada<E extends IOrdenavel> {
    //Atributos:
    private Lista<E> lista;

    //Construtor:
    public ListaOrdenada() {
        this.lista = new Lista<E>();
    }

    //Metodos:
    public void inserirOrdenado (E objetoParaInserir) {
        if (objetoParaInserir.getID() < 0) {
            throw new RuntimeException("Só é aceito IDs positivos.");
        } else if (objetoParaInserir.getID() == 0) {
            this.lista.inserirDepoisDe(0,objetoParaInserir);
        } else {
            this.lista.inserirDepoisDe(objetoParaInserir.getID(), objetoParaInserir);
        }
    }

    public void excluir (int ID) {
        this.lista.excluir(ID);
    }

    public E buscar (int ID) {
        return this.lista.buscarDadoPelaID(ID).getDado();
    }

    public void printarLista () {
        this.lista.printarLista();
    }

    public int getQtdElementos () {
        return this.lista.getQtdElementos();
    }
}
