package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Animal ch = new Chicken();
		Animal co = new Cow();
		Animal ho = new Horse();
		Animal pi = new Pig();
		animals.add(ch);
		animals.add(co);
		animals.add(ho);
		animals.add(pi);
		for(int i = 0; i<4; i++) {
			animals.get(i).makeNoise();
			animals.get(i).eat();
		}
	}
}
