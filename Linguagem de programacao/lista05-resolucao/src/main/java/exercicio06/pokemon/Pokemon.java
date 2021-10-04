package exercicio06.pokemon;

public class Pokemon {
    
    private String nome;
    private String tipo;
    private Double forca;
    private Integer doces;

    public Pokemon(String nome, String tipo, Double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nTipo: %s\nForça: %.1f\nDoces: %d", 
                this.nome,
                this.tipo,
                this.forca,
                this.doces);
    }
    
    
}
