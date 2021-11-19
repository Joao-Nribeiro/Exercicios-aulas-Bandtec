package heranca.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade{
    protected String nome;
    protected Integer vagas;
    protected List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }
    
    public void matricularAluno(Aluno nome) {
         if (this.vagas > 0) {
            this.listaAlunos.add(nome);
            this.vagas--;
        }
    }
    
    public void exibirAlunosMatriculados() {
        if (this.listaAlunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui alunos cadastrados",
                    this.nome));
        } else {
            for (Aluno listaAluno : listaAlunos) {
            System.out.println(listaAluno);
        
            }
        }
    }
    
    public void exibirAlunosPos() {
        if(this.listaAlunos.isEmpty()) {
             System.out.println(String.format("A faculdade %s não possui alunos cadastrados",
                    this.nome));
        } else {
            for (Aluno listaAluno : listaAlunos) {
                if(listaAluno instanceof AlunoPos) {
                    System.out.println(listaAluno);
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("nome faculdade: %s\nvagas: %d\nalunos: %s", 
                this.nome,
                this.vagas,
                this.listaAlunos);
    }
    
    
}
