package exercicio06.pokemon;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }
    
    public void treinarPokemon(Pokemon pokemonRecebido) {
        
        pokemonRecebido.setForca(pokemonRecebido.getForca() * 1.1);
        
        pokemonRecebido.setDoces(pokemonRecebido.getDoces() + 10);
        
        this.nivel += 2;
    }
    
    public void evoluirPokemon(Pokemon pokemonRecebido, String nomeEvolucao) {
        if (pokemonRecebido.getDoces() >= 50) {
            
            String nomeAntigo = pokemonRecebido.getNome();
            
            pokemonRecebido.setNome(nomeEvolucao);
            
            pokemonRecebido.setDoces(pokemonRecebido.getDoces() - 50);
            
            this.nivel += 10;
            
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", 
                    nomeAntigo,
                    pokemonRecebido.getNome()));
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }

    @Override
    public String toString() {
        return String.format("Nome do treinador: %s\nNível do treinador: %d", 
                this.nome,
                this.nivel);
    }
    
    
}
