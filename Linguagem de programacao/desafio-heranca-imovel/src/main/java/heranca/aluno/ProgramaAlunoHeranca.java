package heranca.aluno;

public class ProgramaAlunoHeranca {
    public static void main(String[] args) {
        AlunoPos aluno1 = new AlunoPos(9.0, 111, "Fulano", 9.0, 10.0);
        AlunoPos aluno2 = new AlunoPos(7.0, 222, "Ciclano", 8.5, 6.2);
        Aluno aluno3 = new Aluno(333, "Belclano", 6.5, 10.0);
        
        System.out.println(String.format("O aluno de pós graduação %s tem média %.1f",
                aluno1.nome,
                aluno1.calcularMedia()));
        
        System.out.println("-".repeat(30));
        System.out.println("\n");
        
        System.out.println(String.format("O aluno de pós graduação %s tem média %.1f",
                aluno2.nome,
                aluno2.calcularMedia()));
        
        System.out.println("-".repeat(30));
        System.out.println("\n");
        
        System.out.println(String.format("O aluno de pós graduação %s tem média %.1f",
                aluno3.nome,
                aluno3.calcularMedia()));
        
        System.out.println("-".repeat(30));
        System.out.println("\n");
        
        System.out.println(aluno1);
        
        System.out.println("-".repeat(30));
        System.out.println("\n");
        
        System.out.println(aluno2);
        
        System.out.println("-".repeat(30));
        System.out.println("\n");
        
        System.out.println(aluno3);
        
        Faculdade facul1 = new Faculdade("bandtec", 2);
        
        facul1.matricularAluno(aluno3);
        facul1.matricularAluno(aluno1);
        facul1.matricularAluno(aluno2);
        
        System.out.println(facul1.vagas);
        
        System.out.println("ALUNOS");
        facul1.exibirAlunosMatriculados();
        
        System.out.println("ALUNOS PÓS");
        facul1.exibirAlunosPos();
        
    }
}
