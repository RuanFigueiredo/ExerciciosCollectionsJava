package br.com.poo.CastingOrInstanceOf;

import java.util.ArrayList;

public class PrincipalProdutos {
    public static void main(String[] args) {
        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(new Produto("Macarrão", 3.58));
        listaProduto.add(new Produto("Feijão preto", 8.80));
        listaProduto.add(new Produto("Feijão macassar", 7.50));
        listaProduto.add(new Produto("Arroz", 4.80));

        double somaDosPrecos = 0.0;

        for(Produto produto: listaProduto){
            somaDosPrecos += produto.getPreco();
        }

        double precoMedio= somaDosPrecos / listaProduto.size();

        System.out.println("O preço médio desses produtos é de: R$ "+ precoMedio);





    }
}
