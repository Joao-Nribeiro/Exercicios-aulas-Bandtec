package br.com.bandtec.conta.bancaria;

public class ContaBancaria {
    private String nomeTitular;
    private Double saldo;
    
    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void sacarSaldo(Double valorSaque) {
        if (saldo - valorSaque >= 0) {
           saldo -= valorSaque; 
            System.out.println(String.format("\nSaque realizado. -R$%.2f\nSaldo da conta: R$%.2f",valorSaque, saldo));
        } else {
            System.out.println("\nSaldo insuficiente. Saque negado. Impossivel sacar R$"+valorSaque);
        }
    }
    
    public void depositarSaldo(Double valorDeposito) {
        if (saldo + valorDeposito <= 200) {
            saldo += valorDeposito;
            System.out.println(String.format("\nSaque realizado. +R$%.2f\nSaldo da conta: R$%.2f", valorDeposito,saldo));
        } else {
            System.out.println("\nValor da conta atingido. Deposito negado. Impossivel depositar R$"+valorDeposito);
        }
    }
    
    void exibirDados() {
        System.out.println(String.format("\nSaldo atual: R$%.2f\nNome do titular: %s\n", this.saldo, this.nomeTitular));
    }
    
    void situacaoFinanceira() {
        if (saldo > 100.0) {
            System.out.println("Situação financeira: Boa");
        } else if (saldo >= 50 && saldo <= 100) {
            System.out.println("Situação financeira: Regular");
        } else {
            System.out.println("Situação financeira: Ruim");
        }
    }
}
