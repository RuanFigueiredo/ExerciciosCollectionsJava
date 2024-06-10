public class Pessoa {
   String nome;
   int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome:" + nome + " , idade: "+ idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(" Ruan", 33);
        System.out.println(pessoa1);

    }
}
