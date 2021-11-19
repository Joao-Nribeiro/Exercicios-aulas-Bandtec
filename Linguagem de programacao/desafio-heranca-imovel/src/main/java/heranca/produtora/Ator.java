package heranca.produtora;

public class Ator {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Ator(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario() {
       return this.qtdHorasTrabalhadas * this.valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nHoras trabalhadas: %d\nValor Horas: R$%.2f\nSalário: R$%.2f", 
                this.nome,
                this.qtdHorasTrabalhadas,
                this.valorHoraTrabalhada,
                getSalario()
        );
    }
    
    
}
