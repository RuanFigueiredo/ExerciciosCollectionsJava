package br.com.poo.CastingOrInstanceOf;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> listaDeFruta = new ArrayList<>();

        listaDeFruta.add("Maçã");
        listaDeFruta.add("Manga");
        listaDeFruta.add("Banana");

        for(String qualquerCoisa : listaDeFruta){
            System.out.println(qualquerCoisa);
        }
    }
}
