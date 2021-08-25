package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o limite de peso do elevador: ");
        Double pesoElevador = leitor.nextDouble();
        
        System.out.println("Digite o limite de pessoas do elevador: ");
        Integer pessoasElevador = leitor.nextInt();
        
        System.out.println("Digite o peso da 1° pessoa que entrou no elevador: ");
        Double pessoaPeso1 = leitor.nextDouble();
        
        System.out.println("Digite o peso da 2° pessoa que entrou no elevador: ");
        Double pessoaPeso2 = leitor.nextDouble();
        
        System.out.println("Digite o peso da 3° pessoa que entrou no elevador: ");
        Double pessoaPeso3 = leitor.nextDouble();
        
        Double pesoTotal = pessoaPeso1 + pessoaPeso2 + pessoaPeso3;
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, "
                + "no qual cabem %d pessoas.\nO peso total no elevador é de %.3f,"
                + " sendo que ele suporta %.3f.", pessoasElevador, pesoTotal, pesoElevador));
    }
}
