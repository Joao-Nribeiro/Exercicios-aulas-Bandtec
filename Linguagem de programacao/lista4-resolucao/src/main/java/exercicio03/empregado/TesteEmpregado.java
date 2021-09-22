package exercicio03.empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado();
        
        empregado1.nome = "João";
        empregado1.salario = 5400.00;
        empregado1.cargo = "Analista de Sistemas";
        
        empregado1.reajustarSalario();
        
        System.out.println(String.format("Nome: %s\nCargo: %s\nNovo salário: %.2f"
                , empregado1.nome, empregado1.cargo, empregado1.salario));
    }
}
