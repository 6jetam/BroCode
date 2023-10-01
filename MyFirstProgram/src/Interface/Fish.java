package Interface;

public class Fish implements Prey,Predator {

	@Override
	public void flee() {
		System.out.println("this fish is hunting smaller");
		
	}

	@Override
	public void hunt() {
		System.out.println("this fihs is huntig lareger");
		
	}

	
}
