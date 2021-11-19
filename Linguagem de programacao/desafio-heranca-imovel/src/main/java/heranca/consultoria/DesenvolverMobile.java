package heranca.consultoria;

public class DesenvolverMobile extends Desenvolver{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    public DesenvolverMobile(Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhadasMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhadasMobile;
    }

    @Override
    public Double getSalario() {
        return super.getSalario() + (this.qtdHorasTrabalhadasMobile * this.valorHorasTrabalhadasMobile); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("\nHoras trabalhadas mobile: %d\nValor hora mobile: R$%.2f"
                + "\n%s + horas mobile x valor horas mobile", 
                this.qtdHorasTrabalhadasMobile,
                this.valorHorasTrabalhadasMobile,
                super.toString()
        );//To change body of generated methods, choose Tools | Templates.
    }

    
    
}
