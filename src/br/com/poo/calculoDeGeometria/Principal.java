package br.com.poo.calculoDeGeometria;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Quadrado(4));

        //calculando e imprimindo a área de cada forma
        for (Forma forma : formas){
            System.out.println("àrea da forma: " + forma.calcularArea());
        }

    }
}
