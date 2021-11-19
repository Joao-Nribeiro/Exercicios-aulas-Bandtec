package heranca.produtora;

public class Teste {
    public static void main(String[] args) {
        Ator ator1 = new Ator("Ciclano", 100, 10.0);
        Protagonista ator2 = new Protagonista(100, 10.0, "Fulano", 100, 10.0);
        Ator ator3 = new Ator("Belclano", 100, 25.0);
        Produtora prod = new Produtora("Bandtec", 2);
        
        System.out.println(ator2);
        System.out.println(ator1);
        System.out.println(ator3);
        
        prod.contratar(ator3);
        prod.contratar(ator2);
        prod.contratar(ator1);
        System.out.println(prod.buscarAtorPorNome("Belclano"));
        System.out.println(prod.buscarAtorPorNome("Ciclano"));
        System.out.println(prod.existePorNome("Fulano"));
        System.out.println(prod.getQuantidadeAtores());
        System.out.println(prod.getQuantidadeProtagonista());
        System.out.println(prod.getTotalSalarios());
    }
}
