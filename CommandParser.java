import java.util.*;
import java.io.*;

class CommandParser{
	
        private PokemonFarm pokemonFarm;
	private PokemonHunter hunter;
        private Scanner commandScanner;
	private boolean isRunning;
        
	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
                
	}
        //***************************************
	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello!!! We're Pokemon Game"
                        + "       Welcome To The Farm !!! ");
		while(isRunning){
			System.out.print("\nTypes: ");
			command = commandScanner.next();
                    switch (command) {
                        case "quit":
                            isRunning = false;
                            System.out.println("Good bye, See you next time.");
                            break;
                        case "add":
                            this.addPokemon();
                            break;
                        case "list":
                            this.listPokemons();
                            break;
                        case "remove":
                            this.removePokemon();
                            break;
                        case "feed":
                            this.feedPokemons();
                            break;
                        case "walk":
                            this.walkPokemons();
                            break;
                        case "hunt":
                            this.pokeHunter();
                            break;
                        default:
                            break;
                    }
                        
		}

	}
        //***************************************
        private void pokeHunter(){
            hunter = new PokemonHunter( pokemonFarm);
            hunter.run();
        }
        //***************************************
        private void removePokemon(){
            System.out.print("index to remove : ");
            int index = commandScanner.nextInt();
            pokemonFarm.removePokemon(index);
        } 
        //***************************************
	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
                System.out.println("Pokemon: ");
		String pokemonType =commandScanner.nextLine();
		String name =commandScanner.nextLine();
		float weight = (float)Math.random()*100;
		float stepLength = (float)Math.random()*5;

		if(pokemonType.equals("Eevee")){
			Eevee eevee = new Eevee(name, weight, stepLength);
			pokemonFarm.addPokemon(eevee);
                }        
                if(pokemonType.equals("Snorlax")){
			Snorlax snorlax= new Snorlax(name, weight, stepLength);
			pokemonFarm.addPokemon(snorlax);
		}
                if(pokemonType.equals("Charmeleon")){
			Charmeleon charmeleon= new Charmeleon(name, weight, stepLength);
			pokemonFarm.addPokemon(charmeleon);
		}
        }
        //***************************************
	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List******************************");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}
        //***************************************
	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
	}
        //***************************************
        private void walkPokemons(){
            System.out.println("Walk!!!!! commmandParser");
            pokemonFarm.walk();
        }
        //***************************************
}

