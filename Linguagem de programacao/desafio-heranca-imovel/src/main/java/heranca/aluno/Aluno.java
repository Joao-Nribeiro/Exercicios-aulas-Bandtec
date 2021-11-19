package heranca.aluno;

public class Aluno {
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Double calcularMedia() {
        return notaContinuada * 0.4 + notaSemestral * 0.6;
    } 

    @Override
    public String toString() {
        return String.format("ra: %d\nnome: %s\nnota continuada %.1f\nnota semestral: %.1f",
                ra,
                nome,
                notaContinuada,
                notaSemestral);
    }
    
    
}
