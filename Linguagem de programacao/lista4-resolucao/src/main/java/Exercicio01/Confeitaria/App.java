package Exercicio01.Confeitaria;

public class App {
    public static void main(String[] args) {
        Bolo bolo1 = new Bolo();
        
        bolo1.sabor = "Abacaxi";
        bolo1.quantidadeVendida = 10;
        bolo1.valor = 10.50;
        
        bolo1.comprarBolo();
        bolo1.exibirRelatorio();
        
        Bolo bolo2 = new Bolo();
        
        bolo2.sabor = "Morango";
        bolo2.quantidadeVendida = 101;
        bolo2.valor = 24.70;
        
        bolo2.comprarBolo();
        bolo2.exibirRelatorio();
        
        Bolo bolo3 = new Bolo();
        
        bolo3.sabor = "Floresta negra";
        bolo3.quantidadeVendida = 37;
        bolo3.valor = 43.50;
        
        bolo3.comprarBolo();
        bolo3.exibirRelatorio();
    }
}
