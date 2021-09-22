package Exercicio01.Confeitaria;

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    
    void comprarBolo(){
        if (quantidadeVendida > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            quantidadeVendida = 0;
        }
    }
    
    void exibirRelatorio(){
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f\n" , sabor, quantidadeVendida, valor*=quantidadeVendida));
    }
}
