public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirInformacoes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor);
    }

    public void mudarAutor(String novoAutor) {
        autor = novoAutor;
        System.out.println("Autor de " + titulo + " mudou para " + novoAutor);
    }
}
