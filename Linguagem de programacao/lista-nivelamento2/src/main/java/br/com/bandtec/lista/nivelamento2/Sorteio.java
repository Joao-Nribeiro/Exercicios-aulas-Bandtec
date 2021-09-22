package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 100: ");
        Integer numLido = leitor.nextInt();
        
        Integer numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer numCerto = 0;
        Integer numPar = 0;
        Integer numImpar = 0;
        
        for (int i = 0; i <= 200; i++) {
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
            if (numAleatorio == numLido) {
                numCerto = i;
            } else if (numAleatorio % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }
        }
        System.out.println(String.format("Seu número foi sorteado na %d° vez"
                + "\nTiveram %d pares e %d impares", numCerto, numPar, numImpar));
    }
}
