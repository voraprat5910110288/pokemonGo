public class Charmeleon extends Pokemon{

        private float step;
	public Charmeleon (String name, float weight, float stepLength){
		super(name, weight, stepLength, 2f, new String[] {"fire"});
	}

    Charmeleon(String name, float weight, float stepLength) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        @Override
        public void walk(){
		step += 1.8;
	}
        
        

}
