import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}
        public void  removePokemon(int index){
                pokemons.remove(index);
        }


	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
                        System.out.println("a");
			for(Pokemon pokemon: pokemons)
				pokemon.eat();
		}
                else{
                    for(Pokemon pokemon : pokemons){
                        if(pokemon.getName().equals(pokemonName)){
                            pokemon.eat();
                            break;
                        }
                    }
                }
                }
        public void walk(){
            for (Pokemon pokemon: pokemons)
                
                   pokemon.walk();
	}
}
