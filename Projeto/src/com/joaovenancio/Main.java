package com.joaovenancio;

public class Main {

    public class Teste implements IOrdenavel{

        private int dado;
        private int ID;

        public Teste (int valor, int ID) {
            this.dado = valor;
            this.ID = ID;
        }

        @Override
        public int getID() {
            return 0;
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista<Teste>();
        
    }
}
