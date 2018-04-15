package com.joaovenancio;

public class Main {

    public static void main(String[] args) {
        ListaOrdenada lista1 = new ListaOrdenada<Pessoa>();

        lista1.inserirOrdenado(new Pessoa("Trevor"));
        lista1.inserirOrdenado(new Pessoa("Juquinha"));
        lista1.inserirOrdenado(new Pessoa("Legolas"));
        lista1.inserirOrdenado(new Pessoa("Gimil"));
        lista1.inserirOrdenado(new Pessoa("Gandalf"));
        Pessoa pessoa = new Pessoa("Tatiana");
        pessoa.setiD(5000);
        Pessoa lepo = new Pessoa("Lepo");
        lepo.setiD(5020);
        Pessoa boris = new Pessoa("Boris");
        boris.setiD(5010);
        lista1.inserirOrdenado(pessoa);
        lista1.inserirOrdenado(lepo);
        lista1.inserirOrdenado(boris);
        lista1.printarLista();
        System.out.println();
        System.out.println(lista1.getQtdElementos());
        Pessoa peeps = (Pessoa) lista1.buscar(2);
        peeps.dizerOi();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        lista1.excluir(3);
        lista1.excluir(5020);
        lista1.printarLista();
        System.out.println();
        System.out.println(lista1.getQtdElementos());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        lista1.excluir(0);
        lista1.excluir(2);
        lista1.printarLista();
        System.out.println();
        System.out.println(lista1.getQtdElementos());

        System.out.println();
        System.out.println("-----------NOVA LISTA---------");
        System.out.println();

        ListaOrdenada<Pessoa> falcon = new ListaOrdenada<Pessoa>();

        Pessoa han = new Pessoa("Han Solo");
        han.setiD(10);
        Pessoa chew = new Pessoa("Chewabacca");
        chew.setiD(11);
        Pessoa ben = new Pessoa ("Obi Wan") ;
        ben.setiD(3);
        Pessoa luke = new Pessoa ("Luke");
        luke.setiD(0);

        falcon.inserirOrdenado(han);
        falcon.inserirOrdenado(chew);
        falcon.inserirOrdenado(ben);
        falcon.inserirOrdenado(luke);

        System.out.println(han.getID());
        System.out.println(chew.getID());
        System.out.println(ben.getID());
        System.out.println(luke.getID());

        System.out.println();

        falcon.printarLista();
        System.out.println();
        System.out.println(falcon.getQtdElementos());
        falcon.buscar(10).dizerOi();

        falcon.excluir(0);
        falcon.excluir(3);
        falcon.printarLista();
        System.out.println();
        System.out.println(falcon.getQtdElementos());

        System.out.println();


        Pessoa storm = new Pessoa("Stormtrooper");
        storm.setiD(5);
        falcon.inserirOrdenado(storm);
        Pessoa vad = new Pessoa("Darth Vader");
        vad.setiD(20);
        falcon.inserirOrdenado(vad);
        falcon.printarLista();
        System.out.println();
        System.out.println(falcon.getQtdElementos());
    }
}
