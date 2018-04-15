package com.joaovenancio;

public class Lista<E extends IOrdenavel> {
    //Atributos:
    private DadoLista<E> primeiroLista;
    private DadoLista<E> ultimoLista;
    private int qtdElementos;

    //Construtor:
    public Lista() {
        this.primeiroLista = null;
        this.qtdElementos = 0;
    }

    //Metodos:
    public void inserirNoInicio(E novoObjeto) {
        if (this.qtdElementos == 0) { //Se nao tiver nenhum valor na lista:
            this.primeiroLista = new DadoLista<E>(novoObjeto, null); //Adicionar um novo objeto no inicio, nao existe nenhum
            this.ultimoLista = this.primeiroLista;
            this.qtdElementos++;
        } else { //Ir para o inicio e fazer o novo dado apontar para o dado do inicio, e o inicio apontar para o novo dado
            DadoLista<E> auxiliar = new DadoLista<E>(novoObjeto, this.primeiroLista);
            this.primeiroLista = auxiliar;
            this.qtdElementos++;
        }
    }

    public void inserirNoFinal (E novoObjeto){
        if (this.qtdElementos == 0) {  //Se nao tiver nenhum valor na lista:
            this.primeiroLista = new DadoLista<E>(novoObjeto, null);
            this.qtdElementos++;
        } else { //Caso jah tenha:
            this.ultimoLista.setProximoDado(new DadoLista<E>(novoObjeto, null));
            this.ultimoLista = this.ultimoLista.getProximo();
            this.qtdElementos++;
        }
    }

    public void inserirDepoisDe (int ID, E novoObjeto) {

        if (this.qtdElementos == 0) { //Se nao tiver nenhum valor na lista:
            this.primeiroLista = new DadoLista<E>(novoObjeto, null); //Adicionar um novo objeto no inicio, nao existe nenhum
            this.ultimoLista = this.primeiroLista;
            this.qtdElementos++;
        } else if (this.qtdElementos == 1) {
            if (this.primeiroLista.getDadoID() <= ID) {
                this.primeiroLista.setProximoDado(new DadoLista<E>(novoObjeto, null));
                this.ultimoLista = this.primeiroLista.getProximo();
                this.qtdElementos++;
            } else {
                this.primeiroLista = new DadoLista<E>(novoObjeto, this.primeiroLista);
                this.qtdElementos++;
            }
        } else {
            DadoLista<E> auxilairPesquisa = new DadoLista<E>(null, null);
            auxilairPesquisa.setDadoID(ID);
            this.ultimoLista.setProximoDado(auxilairPesquisa);

            DadoLista<E> auxilairInclusao = this.primeiroLista;

            while (auxilairInclusao.getProximo().getDadoID() < ID) { //Prourar pela menor ID antes do que eu quero achar
                auxilairInclusao = auxilairInclusao.getProximo();
            }
            if (auxilairInclusao.getProximo().equals(this.ultimoLista.getProximo())) { //Caso ele for o ultimo a ser inserido:
                this.ultimoLista.setProximoDado(null);
                this.inserirNoFinal(novoObjeto); //Ja faz qtdElementos++
            } else { //Inserir depois da menor aparicao do ID selecionado ou no ID selecionado:
                this.ultimoLista.setProximoDado(null);
                auxilairInclusao.setProximoDado(new DadoLista<E>(novoObjeto, auxilairInclusao.getProximo()));
                this.qtdElementos++;
            }
        }
    }

    /**
     * Exclui um DadoLista da Lista através de uma ID exigida pela IOrdenavel.
     *
     * @throws RuntimeException caso não encontrar o dado ou não haver nenhum dado na Lista, ele joga uma exeção.
     */
    public void excluir (int ID) throws RuntimeException {
        if (this.qtdElementos == 0) {
            throw new RuntimeException("Não há dados para serem excluidos.");
        } else if (this.qtdElementos == 1) {
            if (this.primeiroLista.getDadoID() == ID) {
                this.primeiroLista = null;
                this.ultimoLista = null;
                this.qtdElementos--;
                return;
            } else {
                throw new RuntimeException("Não foi encontrado o dado para ser exlcuido.");
            }
        } else {
            if (this.primeiroLista.getDadoID() == ID) {
                this.primeiroLista = this.primeiroLista.getProximo();
                this.qtdElementos--;
            } else {
                DadoLista<E> auxilairPesquisa = new DadoLista<E>(null, null);
                auxilairPesquisa.setDadoID(ID);
                this.ultimoLista.setProximoDado(auxilairPesquisa);

                DadoLista<E> auxilairExclusao = this.primeiroLista;

                while (auxilairExclusao.getProximo().getDadoID() != ID) {
                    auxilairExclusao = auxilairExclusao.getProximo();
                }
                if (auxilairExclusao.getProximo().equals(this.ultimoLista.getProximo())) {
                    this.ultimoLista.setProximoDado(null);
                    throw new RuntimeException("Não foi encontrado o dado para ser exlcuido.");
                } else {
                    this.ultimoLista.setProximoDado(null);

                    if (auxilairExclusao.getProximo().equals(this.ultimoLista)) { //Problema aqui
                        auxilairExclusao.setProximoDado(null);
                        this.ultimoLista = auxilairExclusao;
                        this.qtdElementos--;
                    } else {
                        auxilairExclusao.setProximoDado(auxilairExclusao.getProximo().getProximo());
                        this.qtdElementos--;
                    }
                }
            }
        }
    }

    public DadoLista<E> buscarDadoPelaID (int ID) throws RuntimeException {
        if (this.qtdElementos == 0) {
            throw new RuntimeException("Não há elementos para serem pesquisados.");
        } else {
            DadoLista<E> auxiliarPesquisa = new DadoLista<E>(null, null); //Criar um novo objeto para servir de stop par o loop
            auxiliarPesquisa.setDadoID(ID);
            this.ultimoLista.setProximoDado(auxiliarPesquisa);//Setar o ultimo dado da lista para ser o dado de pesquisa: se ele encontrar o valor antes e nao for o objeto que inserimos, entao encontramos o objeto desejado

            DadoLista<E> auxiliarIterador = this.primeiroLista;

            while (auxiliarIterador.getDadoID() != ID) { //Procurar pelo ID
                auxiliarIterador = auxiliarIterador.getProximo();
            }
            if (auxiliarIterador.equals(this.ultimoLista.getProximo())) { //Se parou no dado que inserimos no fim da lista:
                this.ultimoLista.setProximoDado(null);
                throw new RuntimeException("Não foi encontrado o dado desejado na Lista.");
            } else { //Caso encontrar o dado antes:
                this.ultimoLista.setProximoDado(null);
                return auxiliarIterador;
            }
        }
    }

    public int getQtdElementos () {
        return this.qtdElementos;
    }

    //Teste:
    public void printarLista () {
        DadoLista<E> auxilair = this.primeiroLista;
        while (auxilair != null) {
            System.out.println(auxilair.getDadoID());
            auxilair = auxilair.getProximo();
        }
    }
}
