package br.com.poo.ContaBanco;

public class ContaBancaria {
    int numConta;
    double saldo;

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
