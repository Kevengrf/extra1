public class Carro {
    private String modelo;
    private String fabricante;

    public Carro(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public void exibirInformacoes() {
        System.out.println("Carro: " + fabricante + " " + modelo);
    }

    public void pintarCarro(String novaCor) {
        System.out.println("Pintando o carro de " + novaCor);
    }
}
