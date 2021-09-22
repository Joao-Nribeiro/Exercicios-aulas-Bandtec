package br.com.bandtec.lista.nivelamento2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer voto, mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite qual pizza deseja votar.\n5 para mussarela;"
                    + "\n25 para calabresa;\n50 para quatro queijos:");
            voto = leitor.nextInt();
            
            if (voto == 5) {
                mussarela++;
            } else if (voto == 25) {
                calabresa++;
            } else if (voto == 50) {
                quatroQueijos++;
            }
        }
        System.out.println(String.format("Mussarela: %d votos\nCalabresa: %d votos\nQuatro queijos: %d votos", mussarela, calabresa, quatroQueijos));
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("A pizza mais votada foi mussarela.");
        } else if (calabresa > quatroQueijos && calabresa > mussarela ) {
            System.out.println("A pizza mais votada foi calabresa.");
        } else {
            System.out.println("A pizza mais votada foi quatroQueijos");
        }
    }
}
