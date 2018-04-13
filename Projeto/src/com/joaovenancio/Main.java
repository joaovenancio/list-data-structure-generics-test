package com.joaovenancio;

public class Main {

    public class Teste implements IOrdenavel{



        @Override
        public int getID() {
            return 0;
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista<Integer>();
        lista.inserirNoInicio(1);
        lista.inserirNoInicio(3);
        lista.inserirNoFinal(8);
        lista.printarLista();
        System.out.println();
        lista.inserirNoFinal(9);
        lista.inserirNoFinal(10);
        lista.inserirNoInicio(0);
        lista.printarLista();
    }
}
