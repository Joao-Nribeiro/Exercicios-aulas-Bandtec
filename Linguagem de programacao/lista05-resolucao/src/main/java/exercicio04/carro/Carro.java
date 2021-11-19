package exercicio04.carro;

public class Carro {
    private Boolean ligado;
    private String modelo;
    private Integer marcha;
    private Double velocidade;

    public Carro(Boolean ligado, String modelo, Integer marcha, Double velocidade) {
        this.ligado = ligado;
        this.modelo = modelo;
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
