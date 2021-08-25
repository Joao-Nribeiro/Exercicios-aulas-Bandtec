package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class SalarioDescontoLiquidez {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o salário bruto: ");
        Double salarioBruto = leitor.nextDouble();
        
        System.out.println("Custo de condução de ida: ");
        Double custoConducao = leitor.nextDouble();
        
        Double inss = salarioBruto * (10 / 100);
        Double ir = salarioBruto * (20 / 100);
        Double vt = custoConducao * 2 * 22;
        
        Double descontos = inss + ir + vt;
        
        Double salarioLiquido = salarioBruto - descontos;
        
        System.out.println(String.format("Seu salário bruto é R$%.2f,"
                + " tem um total de R$%.2f em descontos e"
                + " receberá um líquido de R$%.2f"
                , salarioBruto, descontos, salarioLiquido));
    }
}
