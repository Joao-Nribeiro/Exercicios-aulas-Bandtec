package br.com.bandtec.conta.bancaria;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria("Adriano");
        
        conta1.depositarSaldo(2000.00);
        conta1.depositarSaldo(100.00);
        conta1.depositarSaldo(80.0);
        conta1.depositarSaldo(30.0);
        conta1.depositarSaldo(10.0);
        conta1.sacarSaldo(10.0);
        conta1.sacarSaldo(1000.0);
        conta1.sacarSaldo(77.50);
        
        conta1.exibirDados();
        conta1.situacaoFinanceira();
    }
}
