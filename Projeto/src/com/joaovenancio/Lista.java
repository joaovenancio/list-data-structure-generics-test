package com.joaovenancio;

public class Lista<E> {
    //Atributos:
    private DadosLista<E> primeiroLista;
    private DadosLista<E> ultimoLista;
    private int qtdElementos;

    //Construtor:
    public Lista() {
        this.primeiroLista = null;
        this.qtdElementos = 0;
    }

    //Metodos:
    public void inserirNoInicio(E novoObjeto) {
        if (this.qtdElementos == 0) { //Se nao tiver nenhum valor na lista:
            this.primeiroLista = new DadosLista<E>(novoObjeto, null); //Adicionar um novo objeto no inicio, nao existe nenhum
            this.ultimoLista = this.primeiroLista;
            this.qtdElementos++;
        } else { //Ir para o inicio e fazer o novo dado apontar para o dado do inicio, e o inicio apontar para o novo dado
            DadosLista<E> auxiliar = new DadosLista<E>(novoObjeto, this.primeiroLista);
            this.primeiroLista = auxiliar;
            this.qtdElementos++;
        }
    }

    public void inserirNoFinal (E novoObjeto){
        if (this.qtdElementos == 0) {  //Se nao tiver nenhum valor na lista:
            this.primeiroLista = new DadosLista<E>(novoObjeto, null);
            this.qtdElementos++;
        } else { //Caso jah tenha:
            this.ultimoLista.setProximoDado(new DadosLista<E>(novoObjeto, null));
            this.ultimoLista = this.ultimoLista.getProximo();
        }
    }

    //Teste:
    public void printarLista () {
        DadosLista<E> auxilair = this.primeiroLista;
        while (auxilair != null) {
            System.out.println(auxilair.getDado());
            auxilair = auxilair.getProximo();
        }
    }
}
