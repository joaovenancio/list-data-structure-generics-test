package com.joaovenancio;

public class Main {

    public static void main(String[] args) {
        ListaOrdenada listaOrd = new ListaOrdenada<Pessoa>();

        listaOrd.inserirOrdenado(new Pessoa("Trevor"));
        listaOrd.inserirOrdenado(new Pessoa("Juquinha"));
        listaOrd.inserirOrdenado(new Pessoa("Legolas"));
        listaOrd.inserirOrdenado(new Pessoa("Gimil"));
        listaOrd.inserirOrdenado(new Pessoa("Gandalf"));
        Pessoa pessoa = new Pessoa("Tatiana");
        pessoa.setiD(5000);
        Pessoa lepo = new Pessoa("Lepo");
        lepo.setiD(5020);
        Pessoa boris = new Pessoa("Boris");
        boris.setiD(5010);
        listaOrd.inserirOrdenado(pessoa);
        listaOrd.inserirOrdenado(lepo);
        listaOrd.inserirOrdenado(boris);
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());
        Pessoa peeps = (Pessoa) listaOrd.buscar(2);
        peeps.dizerOi();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        listaOrd.excluir(3);
        listaOrd.excluir(5020);
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        listaOrd.excluir(0);
        listaOrd.excluir(2);
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();



        /*Pessoa pessoa = new Pessoa("Tatiana");
        pessoa.setiD(5000);
        Pessoa lepo = new Pessoa("Lepo");
        lepo.setiD(5020);
        Pessoa boris = new Pessoa("Boris");
        boris.setiD(5010);
        Pessoa vader = new Pessoa("Vader");
        pessoa.setiD(0);
        Pessoa luke = new Pessoa("Luke");
        lepo.setiD(5001);
        Pessoa leia = new Pessoa("Leia");
        boris.setiD(5);
        listaOrd.inserirOrdenado(pessoa);
        listaOrd.inserirOrdenado(lepo);
        listaOrd.inserirOrdenado(boris);
        listaOrd.inserirOrdenado(vader);
        listaOrd.inserirOrdenado(luke);
        listaOrd.inserirOrdenado(leia);
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());
        listaOrd.excluir(3);
        listaOrd.excluir(0);
        listaOrd.excluir(5001);
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        Pessoa p = new Pessoa("Tatiana");
        pessoa.setiD(5000);
        Pessoa bo = new Pessoa("Boris");
        boris.setiD(5010);
        Pessoa lu = new Pessoa("Luke");
        lepo.setiD(5001);
        Pessoa le = new Pessoa("Leia");
        boris.setiD(5001);
        listaOrd.inserirOrdenado(lu);
        listaOrd.inserirOrdenado(bo);
        listaOrd.inserirOrdenado(le);
        listaOrd.inserirOrdenado(p);
        listaOrd.printarLista();
        System.out.println();
        System.out.println(listaOrd.getQtdElementos());

        Pessoa peps = (Pessoa) listaOrd.buscar(5001);
        peps.dizerOi();*/






    }
}
