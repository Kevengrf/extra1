public class Empresa {
    private String nome;
    private String setor;

    public Empresa(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public void exibirInformacoes() {
        System.out.println("Empresa: " + nome + ", Setor: " + setor);
    }

    public void mudarSetor(String novoSetor) {
        setor = novoSetor;
        System.out.println(nome + " agora está no setor de " + novoSetor);
    }
}
