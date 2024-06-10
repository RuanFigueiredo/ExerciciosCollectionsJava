import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Ruan", 33));
        listaDePessoas.add(new Pessoa("Julio", 66));
        listaDePessoas.add(new Pessoa("Cassio", 88));


        System.out.println(listaDePessoas.size());


    }
}