package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        Integer base = leitor.nextInt();
        
        System.out.println("Digite o expoente: ");
        Integer expoente = leitor.nextInt();
        
        Integer potencia = 1;
        
        for (int i = 0; i < expoente; i++) {
            potencia *= base;
        }
        System.out.println(potencia);
    }
}
