package exercicio06.pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("pikachu", "Elétrico", 66.6);
        Pokemon pokemon2 = new Pokemon("Charizard", "Fogo", 33.3);
        
        TreinadorPokemon tr1 = new TreinadorPokemon("Jão");
        
        tr1.treinarPokemon(pokemon1);
        tr1.treinarPokemon(pokemon1);
        tr1.treinarPokemon(pokemon1);
        tr1.treinarPokemon(pokemon1);
        tr1.treinarPokemon(pokemon1);
        
        System.out.println(pokemon1);
        
        tr1.evoluirPokemon(pokemon1, "Raiochu");
        
        System.out.println(pokemon1);
        
        tr1.treinarPokemon(pokemon2);
        tr1.treinarPokemon(pokemon2);
        
        System.out.println(pokemon2);
        
        tr1.evoluirPokemon(pokemon2, "Charizard");
        
        System.out.println(tr1);
        
        
    }
}
