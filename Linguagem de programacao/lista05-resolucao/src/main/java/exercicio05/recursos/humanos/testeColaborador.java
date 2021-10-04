package exercicio05.recursos.humanos;

public class testeColaborador {
    public static void main(String[] args) {
        Colaborador cl1 = new Colaborador("Jão", "Estagiario", 1800.0);
        Colaborador cl2 = new Colaborador("Pedro", "Analista", 2400.0);
        
        RecursosHumanos rh = new RecursosHumanos();
            
        System.out.println(cl1);
        System.out.println(cl2);
        
        rh.promoverColaborador(cl1, "Junior", 2200.0);
        System.out.println("passou do cl1");
        rh.promoverColaborador(cl2, "Estagiario", 1800.00);
        
        rh.reajustarSalario(cl2, 2250.0);
        
        System.out.println(cl1);
        System.out.println(cl2);
        
        System.out.println("Total promovidos: " + rh.getTotalPromovidos());
        System.out.println("Total Reajustes salariais: " + rh.getTotalReajustes());
    }
}
