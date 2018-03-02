
import java.util.*;

class Pokemon{
	private String name;
	float weight;
	private float stepLength;
	private int step;
	private float gainingWeightStep;
	private String[] types;
        public float mood;

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       float gainingWeightStep,
                       
		       String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
		step = 0;
               
		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}
        public String getName(){
            return name;
        }

	public void walk(){
                System.out.print("pokemon");
		step += 1;
	}

	public void eat(){
		weight += gainingWeightStep;
	}
        
        /* float getMood(){
            return mood;
            
        }*/
	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types)
			System.out.print(type+",");
		
                if(step%5==0){
                    weight-=2;
                }
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
        }        
         
     }

