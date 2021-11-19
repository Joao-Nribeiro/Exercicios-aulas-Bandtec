package heranca.imovel;

public class App {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel(300000.00, "Hadockk lobo");
        ImovelNovo imovel3 = new ImovelNovo(325000.00, "Rua do Ipe");
         ImovelUsado imovel2 = new ImovelUsado(3500000.00, "Rua das Mangueiras");
        
        Double preco1 = imovel1.getPrecoVenda();
        System.out.println(preco1);
        
        Double preco2 = imovel2.getPrecoVenda();
        System.out.println(preco2);
 
        Double preco3 = imovel3.getPrecoVenda();
        System.out.println(preco3);
    }
}
