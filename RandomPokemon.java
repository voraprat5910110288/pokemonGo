
public class RandomPokemon  {
    private int choose;
    private String name;
    private float weight;
    private float stepLength;
    public float mood;
    //***************************************
    public RandomPokemon(String name){
            choose = (int)(Math.random()*5);
            this.name = name;
            weight = (float)(Math.random()*100);
            stepLength  = (float)(Math.random()*10);
            mood = (float)(Math.random()*1);
    }
    //***************************************
    public int randomGetChoose(){
        return choose;
    }
    public float randomGetMood(){
        return mood;
    }
    
    public float randomGetWeight(){
        return weight;
    }
    public float randomGetStepLength(){
        return stepLength;
    }
    //***************************************
}   
