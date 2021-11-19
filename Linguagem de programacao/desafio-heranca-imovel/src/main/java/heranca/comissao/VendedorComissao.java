package heranca.comissao;

public class VendedorComissao {
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public VendedorComissao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    public Double calcularSalario() {
        Double salario;
        salario = this.vendas * 0.1;
        return salario;
    }

    @Override
    public String toString() {
        return String.format("código: %d\n nome: %s\n vendas: %.2f\ntaxa: %.2f",
                this.codigo,
                this.nome,
                this.vendas,
                this.taxa,
                calcularSalario());
    }
    
}
