package br.com.poo.CastingOrInstanceOf;

public class PrincipalBichos {

    public static void main(String[] args) {

        Cachorro bicho1 = new Cachorro();

        if(bicho1 instanceof Animal){
            Animal animal = (Animal)bicho1;
            System.out.println("Casting feito!");
        }else{
            System.out.println("O objeto não é do tipo animal!");
        }


    }


}
