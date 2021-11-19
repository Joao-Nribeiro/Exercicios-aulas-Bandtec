package heranca.professor;

public class Professor {
    protected String nome;
    protected Integer codigo;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Professor(String nome, Integer codigo, Integer qtdHoras, Double valorHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Double calculaSalario() {
        return this.valorHora*this.qtdHoras*4.5;
    }

    @Override
    public String toString() {
        return String.format("nome: %s\ncódigo: %d\nquantidade horas: %d\nvalor hora: %.2f", 
                this.nome,
                this.codigo,
                this.qtdHoras,
                this.valorHora);
    }
    
    
}