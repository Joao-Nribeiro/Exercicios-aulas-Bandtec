package heranca.professor;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }
    
    public void contratarProfessor(Professor p) {
        if (vagas > 0) {
            professores.add(p);
            this.vagas--;
        }
    }
    
    public void exibirProfessores() {
        for (Professor professor : professores) {
            System.out.println(professor);
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nVagas: %d", 
                this.nome,
                this.vagas); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
