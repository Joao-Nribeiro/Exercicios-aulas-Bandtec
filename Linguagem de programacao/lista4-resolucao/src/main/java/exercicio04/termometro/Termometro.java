package exercicio04.termometro;

import java.util.concurrent.ThreadLocalRandom;

public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    void aumentaTemperatura() {
        temperaturaAtual = ThreadLocalRandom.current().nextDouble(0.0, 101.0);
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
        }
    }
    void diminuiTemperatura() {
        temperaturaAtual = ThreadLocalRandom.current().nextDouble(0.0, 101.0);
        if (temperaturaAtual < temperaturaMin) {
            temperaturaMin = temperaturaAtual;
        }
    }
    void exibirFahreinheit(){
        temperaturaAtual = ThreadLocalRandom.current().nextDouble(0.0, 101.0);
        temperaturaAtual = (temperaturaAtual * 1.8) + 32;
        System.out.println("Temperatura atual (F°): " + temperaturaAtual);
        System.out.println("Temperatura Minima (C°): " + temperaturaMin);
        System.out.println("Temperatura Máxima (C°): " + temperaturaMax);
    }
}
