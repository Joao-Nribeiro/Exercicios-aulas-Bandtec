package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
       
        Integer soma = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número para a soma: ");
        Integer num = leitor.nextInt();
        
        while (num != 0) {
            soma += num; 
            System.out.println("Digite outro número para a soma: ");
            num = leitor.nextInt();
        }
        
        System.out.println("A soma dos números lidos é: " + soma);
    }
}
