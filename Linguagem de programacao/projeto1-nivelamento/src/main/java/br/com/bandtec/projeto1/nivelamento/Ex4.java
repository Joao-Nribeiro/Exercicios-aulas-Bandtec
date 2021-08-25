package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu nome? ");
        String nome = leitor.nextLine();
        
        System.out.println("Quanto tempo você aqueceu (em minutos): ");
        Integer aquecimento = leitor.nextInt();
        
        System.out.println("Quanto tempo você praticou aeróbico (em minutos): ");
        Integer aerobico = leitor.nextInt();
        
        System.out.println("Quanto tempo você praticou musculação (em minutos): ");
        Integer musculacao = leitor.nextInt();
        
        Integer caloriasPerdidas = (12 * aquecimento) + (20 * aerobico) + (25 * musculacao);
        
        Integer minutosExercicios = aquecimento + aerobico + musculacao;
        
        System.out.println(String.format("Olá, %s. Você fez um total de %s minutos de exercícios e perdeu cerca de %s calorias", nome, minutosExercicios, caloriasPerdidas));
    }
}
