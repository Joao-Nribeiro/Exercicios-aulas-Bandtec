package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
        System.out.println("Digie um número de 1 a 10: ");
        Integer numDigitado = leitor.nextInt();
        
        Integer i = 0;
        Integer numAleatorio = 0;
        
        while (numDigitado != numAleatorio) {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            i++;
        }
        
        if (i < 3) {
            System.out.println("Você é muito sortudo");
        } else if (i < 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    }
}
