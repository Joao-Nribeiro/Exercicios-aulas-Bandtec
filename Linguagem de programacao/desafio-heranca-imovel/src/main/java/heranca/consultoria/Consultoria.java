package heranca.consultoria;

import java.util.ArrayList;
import java.util.List;

public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolver> Desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.Desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome) {
        for (Desenvolver x : Desenvolvedores) {
            if(x.getNome().equalsIgnoreCase(nome)) {
               return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolver desenvolver) {
        if(this.vagas > 0) {
            Desenvolvedores.add(desenvolver);
            this.vagas--;
        } else {
            System.out.println("Não há vagas");
        }
    }
    
    public Integer getQuantidadeDesenvolvedores() {
        Integer qtd = 0;
        for (Desenvolver Desenvolvedore : Desenvolvedores) {
            qtd++;
        }
        return qtd;
    }
    
    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer qtd = 0;
        for (Desenvolver Desenvolvedore : Desenvolvedores) {
            if (Desenvolvedore instanceof DesenvolverMobile) {
                qtd++;
            }
        }
        return qtd;
    }
    
    public Double getTotalSalarios() {
        Double salarios = 0.0;
        
        for (Desenvolver Desenvolvedore : Desenvolvedores) {
            salarios += Desenvolvedore.getSalario();
        }
        
        return salarios;
    }
    
    public String buscarDesenvolvedorPorNome(String nome) {
        for (Desenvolver Desenvolvedore : Desenvolvedores) {
            if (Desenvolvedore.getNome().equalsIgnoreCase(nome)) {
                return Desenvolvedore.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nVagas: %d", 
                this.nome,
                this.vagas
        );
    }
    
    
}
