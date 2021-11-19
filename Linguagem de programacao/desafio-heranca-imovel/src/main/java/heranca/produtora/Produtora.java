package heranca.produtora;

import java.util.ArrayList;
import java.util.List;

public class Produtora{
    private String nome;
    private Integer vagas;
    private List<Ator> listaAtores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        listaAtores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome) {
        for (Ator listaAtor : listaAtores) {
            if (listaAtor.nome.equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Ator ator) {
        if (this.vagas > 0) {
            listaAtores.add(ator);
            this.vagas--;
        } else {
            System.out.println("Não há vagas");
        }
    }
    
    public Integer getQuantidadeAtores() {
        Integer qtd =0;
        for (Ator listaAtore : listaAtores) {
            qtd++;
        }
        return qtd;
    }
    
    public Integer getQuantidadeProtagonista() {
        Integer qtd = 0;
        for (Ator x : listaAtores) {
            if (x instanceof Protagonista) {
                qtd++;
            }
        }
        return qtd;
    } 
    
    public Double getTotalSalarios() {
        Double salarios = 0.0;
        for (Ator listaAtore : listaAtores) {
            salarios += listaAtore.getSalario();
        }
        return salarios;
    }
    
    public String buscarAtorPorNome(String nome) {
        for (Ator listaAtore : listaAtores) {
            if (listaAtore.nome.equalsIgnoreCase(nome)) {
                return listaAtore.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nVagas: %d", 
                this.nome,
                this.vagas
        ); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
