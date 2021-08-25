package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNota = new Scanner(System.in);
        
        System.out.println("Nome do aluno: ");
        String nomeAluno = leitorTexto.nextLine();
        
        System.out.println("Primeira nota: ");
        Double nota1 = leitorNota.nextDouble();
        
        System.out.println("Segunda nota: ");
        Double nota2 = leitorNota.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        
        System.out.println(String.format("\"Olá, %s. Sua média foi de %.1f"
                , nomeAluno, media));
    }
}
