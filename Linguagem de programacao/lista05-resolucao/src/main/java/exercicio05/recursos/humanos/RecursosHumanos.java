package exercicio05.recursos.humanos;

public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalReajustes;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustes = 0;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }
    
    public void reajustarSalario(Colaborador colaboradorRecebido, Double salarioRecebido) {
        colaboradorRecebido.setSalario(salarioRecebido);
        this.totalReajustes++;
    }
    
    public void promoverColaborador(Colaborador colaboradorRecebido, String novoCargo, Double novoSalario) {
        if (novoSalario > colaboradorRecebido.getSalario()) {
            colaboradorRecebido.setSalario(novoSalario);
            colaboradorRecebido.setCargo(novoCargo);
            this.totalPromovidos++;
            this.totalReajustes++;
        } else {
            System.out.println("Operação inválida");
        }
    }
}
