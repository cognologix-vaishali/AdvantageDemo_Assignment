package demo;

abstract public class Vehicle {
	
	abstract public void accelerate();
	abstract public void brake();
	
	public void Engine() {
		System.out.println("Car Engine");
	}
	
	public Vehicle() {
		System.out.println("Constructor calling");
	}

}
