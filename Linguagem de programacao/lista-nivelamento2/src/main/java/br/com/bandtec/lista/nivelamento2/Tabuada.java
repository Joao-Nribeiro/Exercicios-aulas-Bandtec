package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número que deseja ver a tabuada: ");
        Integer numDigitado = leitor.nextInt();
        Integer tabuada = 0;
        
        System.out.println(String.format("A tabuada do %d", numDigitado));
        
        System.out.println("");
        for (int i = 0; i <= 10; i++) {
            tabuada = numDigitado * i;
            System.out.println(String.format("%d x %d = %d",
                    numDigitado, i, tabuada));
            
        }        
    }
}
