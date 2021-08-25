package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor unitário do produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Quantidade vendida: ");
        Integer vendas = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente: ");
        Double pagamento = leitor.nextDouble();
        
        Double troco = pagamento - (valorProduto * vendas);
        
        System.out.println(String.format("Seu troco será de:\nR$%.2f", troco));
    }
}
