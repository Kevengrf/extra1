public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Alice", 30);

        System.out.println("Informações Iniciais:");
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();

        System.out.println("\nCelebrando Aniversários:");
        pessoa1.celebrarAniversario();
        pessoa2.celebrarAniversario();

        System.out.println("\nInformações Atualizadas:");
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();

        Livro livro1 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald");
        Livro livro2 = new Livro("Para Matar um Rouxinol", "Harper Lee");

        System.out.println("\nInformações Iniciais:");
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        System.out.println("\nMudando Autores:");
        livro1.mudarAutor("John Doe");
        livro2.mudarAutor("Jane Doe");

        System.out.println("\nInformações Atualizadas:");
        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        Carro carro1 = new Carro("Civic", "Honda");
        Carro carro2 = new Carro("Camry", "Toyota");

        System.out.println("\nInformações Iniciais:");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        System.out.println("\nPintando Carros:");
        carro1.pintarCarro("Vermelho");
        carro2.pintarCarro("Azul");

        System.out.println("\nInformações Atualizadas:");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        
        Empresa empresa1 = new Empresa("ABC Corp", "Tecnologia");
        Empresa empresa2 = new Empresa("XYZ Inc", "Finanças");

        System.out.println("\nInformações Iniciais:");
        empresa1.exibirInformacoes();
        empresa2.exibirInformacoes();

        System.out.println("\nMudando Setor:");
        empresa1.mudarSetor("Saúde");
        empresa2.mudarSetor("Varejo");

        System.out.println("\nInformações Atualizadas:");
        empresa1.exibirInformacoes();
        empresa2.exibirInformacoes();

        Animal animal1 = new Animal("Leão", "Mamífero");
        Animal animal2 = new Animal("Papagaio", "Ave");

        System.out.println("\nInformações Iniciais:");
        animal1.exibirInformacoes();
        animal2.exibirInformacoes();

        System.out.println("\nEmitindo Sons:");
        animal1.emitirSom();
        animal2.emitirSom();

        System.out.println("\nSem Alterações nas Informações do Animal:");

    }
}
