package exercicio06.pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        
            Pokemon pokemon1 = new Pokemon("Pikachu", "Elétrico", 66.6);
            
            Pokemon pokemon2 = new Pokemon("Bulbassauro", "Folha", 33.6);
            
            Pokemon pokemon3 = new Pokemon("Charmander", "Fogo", 22.9);
            
            TreinadorPokemon treinador1 = new TreinadorPokemon("Fulano");
            
            treinador1.evoluirPokemon(pokemon3, "Charizard");
            
            treinador1.treinarPokemon(pokemon3);
            treinador1.treinarPokemon(pokemon3);
            treinador1.treinarPokemon(pokemon3);
            treinador1.treinarPokemon(pokemon3);
            treinador1.treinarPokemon(pokemon3);
            treinador1.treinarPokemon(pokemon3);
            
            treinador1.evoluirPokemon(pokemon3, "Charizard");
    }
}
