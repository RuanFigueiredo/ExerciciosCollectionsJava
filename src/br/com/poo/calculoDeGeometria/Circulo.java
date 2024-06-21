package br.com.poo.calculoDeGeometria;

public class Circulo implements Forma{

    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }



    @Override
    public double calcularArea() {
        return 3.14 * raio* raio;
    }
}
