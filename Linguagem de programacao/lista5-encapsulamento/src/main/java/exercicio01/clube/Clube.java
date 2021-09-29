package exercicio01.clube;

public class Clube {
    
    private Integer qtdVitorias;
    private Integer qtdEmpates;
    private Integer qtdDerrotas;
    private Integer pontos;
    private String nomeTime;
    
    
    public Clube(String nomeTime) {
        this.qtdDerrotas = 0;
        this.qtdVitorias = 0;
        this.qtdEmpates = 0;
        this.pontos = 0;
        this.nomeTime = nomeTime;
    }
    
    public void registrarVitoria() {
        qtdVitorias++;
        pontos += 3;
    }
    
    public void registrarDerrota() {
        qtdDerrotas++;
    }
    
    public void registrarEmpate() {
        qtdEmpates++;
        pontos++;
    }

    public Integer getQtdVitorias() {
        return qtdVitorias;
    }

    public Integer getQtdEmpates() {
        return qtdEmpates;
    }

    public Integer getQtdDerrotas() {
        return qtdDerrotas;
    }

    public Integer getPontos() {
        return pontos;
    }
    
    public String getNomeTime() {
        return nomeTime;
    }
    
    
}
