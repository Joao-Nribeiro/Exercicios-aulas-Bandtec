package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorIdade = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println(String.format("Olá, %s! Qual o ano do seu nascimento? ", nome));
        Integer nasc = leitorIdade.nextInt();
        
        Integer idadeAtual = 2021 - nasc;
        Integer idadeFutura = idadeAtual + 9;
        
        System.out.println(String.format("em 2030, Você terá %s", idadeFutura));
    }
}
