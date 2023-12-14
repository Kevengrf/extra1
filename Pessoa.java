public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibirInformacoes() {
        System.out.println("Pessoa: " + nome + ", Idade: " + idade);
    }
    
    public void celebrarAniversario() {
        System.out.println(nome + " está comemorando seu aniversário! Agora " + nome + " tem " + idade + " anos.");
        idade++;
    }
}
