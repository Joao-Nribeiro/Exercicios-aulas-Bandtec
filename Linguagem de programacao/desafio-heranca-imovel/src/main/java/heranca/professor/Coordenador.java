package heranca.professor;

public class Coordenador extends Professor{
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer qtdHorasCoord, Double valorHoraCoord, String curso, String nome, Integer codigo, Integer qtdHoras, Double valorHora) {
        super(nome, codigo, qtdHoras, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public Double calculaSalario() {
        return super.calculaSalario() + (this.qtdHorasCoord * this.valorHoraCoord * 4.5); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nqtd horas coord: %d\nvalor hora coord: R$%.2f\ncurso: %s",
                this.nome,
                this.qtdHorasCoord,
                this.valorHoraCoord,
                this.curso);
    }
}