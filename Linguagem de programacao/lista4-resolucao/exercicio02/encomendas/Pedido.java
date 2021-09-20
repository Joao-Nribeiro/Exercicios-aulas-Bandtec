package exercicio02.encomendas;

public class Pedido {
    public static void main(String[] args) {
        
        Encomenda encomenda1 = new Encomenda();
        
        encomenda1.largura = 20.00;
        encomenda1.altura = 5.00;
        encomenda1.distancia = 57.84;
        encomenda1.valorEncomenda = 300.00;
        encomenda1.enderecoDestinatario = "Rua josé de Abreu, 786";
        encomenda1.enderecoRemetente = "Rua Haddock Lobo, 595";
        
        encomenda1.calcularFrete();
        encomenda1.emitirEtiqueta();
    }
    
}
