package heranca.consultoria;

public class Teste {
    public static void main(String[] args) {
        Desenvolver dev1 = new Desenvolver("Fulano", 100, 10.0);
        
        DesenvolverMobile devMobile = new DesenvolverMobile(100, 10.0, "Ciclano", 100, 10.0);
       
        Desenvolver dev2 = new Desenvolver("Belclano", 100, 10.0);
        
        Consultoria con = new Consultoria("Bandtec", 2);
        
        System.out.println(dev1);
        System.out.println("-------------------");
        System.out.println(devMobile);
        System.out.println("-------------------");      
        System.out.println(dev1.getSalario());
        System.out.println("-------------------");
        System.out.println(devMobile.getSalario());
        System.out.println("-------------------");
        con.contratar(dev2);
        System.out.println("-------------------");
        con.contratar(devMobile);
        System.out.println("-------------------");
        con.contratar(dev1);
        System.out.println("-------------------");
        System.out.println(con.buscarDesenvolvedorPorNome("Belclano"));
        System.out.println("-------------------");
        System.out.println("Existe por nome?");
        System.out.println(con.existePorNome("Ciclano"));
        System.out.println("-------------------");
        System.out.println(con.getQuantidadeDesenvolvedores());
        System.out.println("-------------------");
        System.out.println(con.getQuantidadeDesenvolvedoresMobile());
        System.out.println("-------------------");
        System.out.println(con.getTotalSalarios());
        System.out.println("-------------------");
        System.out.println(con);
    }
}
