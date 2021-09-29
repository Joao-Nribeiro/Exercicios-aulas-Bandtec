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
        System.out.println(String.format("%s vence a rodada", nomeTime));
    }
    
    public void registrarDerrota() {
        qtdDerrotas++;
        System.out.println(String.format("%s perde a rodada", nomeTime));
    }
    
    public void registrarEmpate() {
        qtdEmpates++;
        pontos++;
        System.out.println(String.format("%s empatada a rodada", nomeTime));
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
    
    public void emitirRelatorio() {
        System.out.println(String.format("Final:\n %s, Vitórias: %d, Derrotas: %d,"
                + "Empates: %d\n Quantidade de pontos: %d", nomeTime, qtdVitorias, qtdDerrotas, qtdEmpates, pontos));
    }
}
