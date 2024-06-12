package br.com.poo.construtor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(new Produto("Abajur",2.5,200));

        listaDeProdutos.add(new Produto("Janela",100.50,500));

        listaDeProdutos.add(new Produto("Porta",200.5,150));

        System.out.println("Tamanho da lista: " +listaDeProdutos.size());
        System.out.println("produto 1: " + listaDeProdutos.get(0).getNome());

        System.out.println(listaDeProdutos.toString());



    }
}
