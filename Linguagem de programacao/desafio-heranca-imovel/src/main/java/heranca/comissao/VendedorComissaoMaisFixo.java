package heranca.comissao;

public class VendedorComissaoMaisFixo extends VendedorComissao{
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + this.salarioFixo; //To change body of generated methods, choose Tools | Templates.
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalario fixo: " + this.salarioFixo;//To change body of generated methods, choose Tools | Templates.
    }
       
}
