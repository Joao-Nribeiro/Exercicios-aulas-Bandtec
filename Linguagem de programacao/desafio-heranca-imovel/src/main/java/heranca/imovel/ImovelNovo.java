package heranca.imovel;

public class ImovelNovo extends Imovel{

    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }

    @Override
    public Double getPrecoVenda() {
        Double precoAcrescimo = super.getPrecoVenda() + (super.getPrecoVenda() * 0.10);
        return precoAcrescimo; //To change body of generated methods, choose Tools | Templates.
    }
    
}
