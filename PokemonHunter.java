import java.util.ArrayList;
import java.util.Scanner;

public class PokemonHunter {
    private ArrayList<Pokemon> bugs;
    private Scanner commandScanner;
    //***************************************
    private RandomPokemon pokemon;
    private PokemonFarm farm; 
    private Pokemon pokemonT;
    //***************************************
    private String command,namePokemon,balls;
    private boolean isRun;
    private float pokeBall,greatBall,ultraBall;
    private int step;
    //***************************************
    
    public PokemonHunter(PokemonFarm farm) {
        this.farm = farm;
        bugs = new ArrayList<Pokemon>();
        commandScanner = new Scanner(System.in);
        
        pokeBall = 0.8f;
        greatBall = 0.9f;
        ultraBall = 1.0f;   
        step=0;
        isRun = false;
        namePokemon = "?????";
        
        System.out.println("       Welcome To The Jungle !!! ");
    }
    //***************************************
    public void run(){
        isRun= true;
        while(isRun){
            System.out.print("? : ");
            command = commandScanner.next();
            if(command.equals("back")){
		isRun = false;
                this.goBackFarm();
	    }
            else if(command.equals("walk"))
                this.walkToWood();
        }
    }
      //***************************************
    public void walkToWood(){
        step+=1;
        if(step %3 ==0)
                this.map();
    }
    private void map(){
        if(step %3 ==0)// กันเหนี่ยว
            this.findPokemon();
    }
    //***************************************
    private void findPokemon(){
        pokemon = new RandomPokemon(namePokemon);
        System.out.print("WTF!!!! This a Pokemon \n");
        isRun = true;
        while(isRun){
            System.out.printf("Pokemon Mood : %.2f \n",pokemon.randomGetMood());
            System.out.print("Select a balls : ");
            balls = commandScanner.next();
            switch (balls) {
                case "pokeball":
                    System.out.print("A You Ready!!!!");
                    this.huntPokemons(pokeBall);
                    break;
                case "greatball":
                    System.out.print("A You Ready!!!!");
                    this.huntPokemons(greatBall);
                    break;
                case "utraball":
                    System.out.print("A You Ready!!!!");
                    this.huntPokemons(ultraBall);
                    break;
                case "run":
                    isRun=false;
                    System.out.print("Hi PokemonFarm !!!");
                    this.goBackFarm();
                    break;
                default:
                    System.out.println("Again");
                    break;
            }
        }
    }
    //***************************************
    private void huntPokemons(float ball){
            System.out.print("1......2......3 ");
            if (ball * pokemon.randomGetMood() > 0.5){
                System.out.println("Complete!!!");
                this.addToBugs(pokemon);
                this.run();
            }
            else
                System.out.println("Try Again!!!");
    }
    //***************************************
    private void addToBugs(RandomPokemon poke ){
        Snorlax snorlax;
        Eevee evee;
        System.out.print("Pokemon name:"); namePokemon = commandScanner.next();
        if (pokemon.randomGetChoose()<5){
                evee = new Eevee(namePokemon,pokemon.randomGetWeight(),
                        pokemon.randomGetStepLength());
                bugs.add(evee);
        }
                
        else if (pokemon.randomGetChoose() >5){
                snorlax = new Snorlax(namePokemon,pokemon.randomGetWeight(),
                        pokemon.randomGetStepLength());
                bugs.add(snorlax);
        }
         else if (pokemon.randomGetChoose() ==5){
                Charmeleon charmeleon = new Charmeleon (namePokemon,pokemon.randomGetWeight(),
                        pokemon.randomGetStepLength());
                bugs.add(charmeleon);
        }
    }
    //***************************************
    public void listBugs(){
        for(Pokemon pokemon: bugs){
			pokemon.print();
        }
    } 
    
    //***************************************
    public void  goBackFarm(){
              for(Pokemon p :bugs)
                  farm.addPokemon(p);
                  farm.list();
              System.out.println("Good bye, See you next time.");
    }    
    //***************************************
}