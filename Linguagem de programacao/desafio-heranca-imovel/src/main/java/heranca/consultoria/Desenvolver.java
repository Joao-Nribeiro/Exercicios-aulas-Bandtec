package heranca.consultoria;

public class Desenvolver {
    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolver(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public Double getSalario() {
        return this.qtdHorasTrabalhadas * this.valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nHoras trabalhadas: %d\nValor por hora: %.2f"
                + "\nsalario: R$%.2f\ncalculo do salário: Horas trabalhadas x valor por hora", 
                this.nome,
                this.qtdHorasTrabalhadas,
                this.valorHoraTrabalhada,
                this.getSalario()
        );
    }
    
    
}
