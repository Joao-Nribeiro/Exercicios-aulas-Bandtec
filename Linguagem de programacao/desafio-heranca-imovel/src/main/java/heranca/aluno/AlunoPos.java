package heranca.aluno;

public class AlunoPos extends Aluno{
    
    protected Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String nome, Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {
        return (notaContinuada + notaMonografia + notaSemestral) / 3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "\nnota monográfica: " + notaMonografia; //To change body of generated methods, choose Tools | Templates.
    }
    
}

