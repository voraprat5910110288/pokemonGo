
public class Charizard extends Pokemon {
    private float gainingWeightStep;
    public Charizard(String name, float weight, float stepLength) {
                  super(name, weight, stepLength, 2f, new String[] {"fire"});
    }
    
    @Override
    public void eat(){
		weight += gainingWeightStep/2;
	}
    
}
