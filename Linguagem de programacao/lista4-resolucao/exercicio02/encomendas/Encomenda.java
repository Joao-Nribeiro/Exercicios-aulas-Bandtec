package exercicio02.encomendas;

public class Encomenda {
    Double altura;
    Double largura;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    Double frete;
    
    void calcularFrete() {
        if (altura <= 6.0 || largura <= 16.0) {
             frete = valorEncomenda / 100;
             if (distancia <= 50.0) {
                 frete += 3;
             } else if (distancia >= 51.0 && distancia <= 200.0) {
                 frete += 5;
             } else {
                 frete += 7;
             }
        }
        if (altura >= 7.0 && altura <= 15.0 || largura >= 16.0 && largura <= 50.0) {
             frete = valorEncomenda / 100;
             if (distancia <= 50.0) {
                 frete += 3;
             } else if (distancia >= 51.0 && distancia <= 200.0) {
                 frete += 5;
             } else {
                 frete += 7;
             }
        }
        else {
             frete = valorEncomenda / 100;
             if (distancia <= 50.0) {
                 frete += 3;
             } else if (distancia >= 51.0 && distancia <= 200.0) {
                 frete += 5;
             } else {
                 frete += 7;
             }
        }
    }
    
    void emitirEtiqueta() {
        System.out.println(String.format("****** ETIQUETA PARA ENVIO ******\n"
                + "Endereço do remetente: %s\n"
                + "Endereço do destinatário: %s\n"
                + "Altura da encomenda: %.1f cm\n"
                + "Largura da encomenda: %.1f cm\n"
                + "-".repeat(33)
                + "\nValor da encomenda: R$%.2f\n"
                + "Valor do frete: R$%.2f\n"
                + "-".repeat(33)
                + "\nvalor total: R$%.2f", 
                enderecoRemetente, enderecoDestinatario, altura, largura, 
                valorEncomenda, frete, frete + valorEncomenda));
    }
}
