package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui? ");
        int qtdFilhos3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui? ");
        int qtdFilhos16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui? ");
        int qtdFilhos18 = leitor.nextInt();
        
        Double bolsaFamilia = 25.12 * qtdFilhos3 + 15.88 * qtdFilhos16
                + 12.44 * qtdFilhos18;
        
        Integer qtdFilhos = qtdFilhos16 + qtdFilhos18 + qtdFilhos3;
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa família", qtdFilhos, bolsaFamilia));
    }
 
}
