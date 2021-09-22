package exercicio03.empregado;

public class Empregado {
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario() {
        salario = salario + (salario * 0.15);
    }
    
}
