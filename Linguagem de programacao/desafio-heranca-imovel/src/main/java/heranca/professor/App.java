package heranca.professor;

public class App {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Fulano", 111, 100, 100.00);
        
        Coordenador coord1 = new Coordenador(100, 100.0, "Alemão", "Ciclano", 222, 100, 100.00);
    
        Faculdade facul1 = new Faculdade("Bandtec", 2);
        
        System.out.println(coord1.calculaSalario());
        System.out.println("------------------------");
        System.out.println(prof1.calculaSalario());
        System.out.println("------------------------");
        
        facul1.contratarProfessor(prof1);
        
        facul1.contratarProfessor(coord1);
        
        facul1.exibirProfessores();
        System.out.println("------------------------");
        System.out.println(facul1);
    }
}
