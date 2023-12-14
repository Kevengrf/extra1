public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void exibirInformacoes() {
        System.out.println("Animal: " + nome + ", Espécie: " + especie);
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo um som!");
    }
}
