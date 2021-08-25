package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Double numero1 = leitor.nextDouble();
        
        System.out.println("Digite outro número: ");
        Double numero2 = leitor.nextDouble();
        
        Double soma = numero1 + numero2;
        Double subtracao = numero1 - numero2;
        Double multiplicacao = numero1 * numero2;
        Double divisao = numero1 / numero2;
        
        System.out.println(String.format("A soma entre %.1f e %.1f é: %.1f", numero1, numero2, soma));
        System.out.println(String.format("A subtracao entre %.1f e %.1f é: %.1f", numero1, numero2, subtracao));
        System.out.println(String.format("A multiplicação entre %.1f e %.1f é: %.1f", numero1, numero2, multiplicacao));
        System.out.println(String.format("A divisão entre %.1f e %.1f é: %.1f", numero1, numero2, divisao));
        
    }
}
