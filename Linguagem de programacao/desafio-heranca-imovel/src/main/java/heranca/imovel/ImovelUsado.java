package heranca.imovel;

public class ImovelUsado extends Imovel{

    public ImovelUsado(Double preco, String endereco) {
        super(preco, endereco);
    }
    
    @Override
    public Double getPrecoVenda() {
        Double precoDesconto = super.getPrecoVenda() - (super.getPrecoVenda() * 0.10);
        
        return precoDesconto; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
