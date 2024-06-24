package br.com.poo.ContaBanco;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contaBancaria = new ArrayList<>();

        contaBancaria.add(new ContaBancaria(5242,250.25));
        contaBancaria.add(new ContaBancaria(5669,300.15));
        contaBancaria.add(new ContaBancaria(5882,259.05));

        System.out.println("numero da conta é: "+ contaBancaria.get(0).numConta);
        System.out.println("Saldo da conta: " + contaBancaria.get(0).saldo);
        System.out.println(" --------------------------------------------");
        System.out.println("numero da conta é: "+ contaBancaria.get(1).numConta);
        System.out.println("Saldo da conta: " + contaBancaria.get(1).saldo);
        System.out.println(" --------------------------------------------");
        System.out.println("numero da conta é: "+ contaBancaria.get(2).numConta);
        System.out.println("Saldo da conta: " + contaBancaria.get(2).saldo);

        //variavel para armazenar o valor maior
        double maiorSaldo = contaBancaria.get(0).getSaldo();

        for ( ContaBancaria numero: contaBancaria){
        if(numero.saldo > maiorSaldo){
            maiorSaldo = numero.saldo;
             }
        }

        //imprimir o saldo maior
        System.out.println(" -------------------------------");
        System.out.println("maior saldo entre as contas é: "+ maiorSaldo);

    }
}
