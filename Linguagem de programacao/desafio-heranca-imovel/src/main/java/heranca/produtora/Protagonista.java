package heranca.produtora;

public class Protagonista extends Ator{
    private Integer qtdHorasTrabalhadasProtagonita;
    private Double valorHorasTrabalhasProtagonista;

    public Protagonista(Integer qtdHorasTrabalhadasProtagonita, Double valorHorasTrabalhasProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasProtagonita = qtdHorasTrabalhadasProtagonita;
        this.valorHorasTrabalhasProtagonista = valorHorasTrabalhasProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (this.valorHorasTrabalhasProtagonista * this.qtdHorasTrabalhadasProtagonita); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("%s\nHoras Trabalhas Protagonista: %d\nValor Horas Protagonista: %.2f", 
                super.toString(),
                this.qtdHorasTrabalhadasProtagonita,
                this.valorHorasTrabalhasProtagonista); //To change body of generated methods, choose Tools | Templates.
    }

    
}


