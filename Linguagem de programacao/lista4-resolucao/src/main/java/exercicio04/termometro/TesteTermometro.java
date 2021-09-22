package exercicio04.termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro termometro1 = new Termometro();
        
        termometro1.temperaturaAtual = 10.9;
        termometro1.temperaturaMax = 12.0;
        termometro1.temperaturaMin = 9.11;
        
        termometro1.aumentaTemperatura();
        termometro1.diminuiTemperatura();
        termometro1.exibirFahreinheit();
    }
}
