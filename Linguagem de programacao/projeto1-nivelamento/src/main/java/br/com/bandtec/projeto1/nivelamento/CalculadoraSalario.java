package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu salário: ");
        Double salario = leitor.nextDouble();
        
        System.out.println("Digite a quantidadede impostos (%): ");
        Double imposto = leitor.nextDouble();
        
        Double descontoSalario = salario * (imposto / 100);
        Double salarioLiquido = salario - descontoSalario;
        
        System.out.println(String.format("Seu salário liquído é: R$%.2f", salarioLiquido));
    }
}
