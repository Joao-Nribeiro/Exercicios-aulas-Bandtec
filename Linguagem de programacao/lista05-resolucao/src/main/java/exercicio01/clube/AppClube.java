package exercicio01.clube;

public class AppClube {
    public static void main(String[] args) {
        
    Clube clube1 = new Clube("Palmeiras");
    Clube clube2 = new Clube("São Paulo");
    
    clube1.registrarVitoria();
    clube2.registrarVitoria();
    
    clube1.registrarVitoria();
    clube2.registrarDerrota();
    
    clube1.registrarVitoria();
    clube2.registrarEmpate();
    
    clube1.emitirRelatorio();
    clube2.emitirRelatorio();
    }
}
