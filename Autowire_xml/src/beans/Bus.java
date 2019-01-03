package beans;

public class Bus {

	private Engine engine;
	
	public Bus() {
		System.out.println("Default constructor");
	}
	
	public Bus(Engine engine) {
	
		this.engine = engine;
	}
	
	public void setEngine(Engine engine) {
		System.out.println("Setter method");
		this.engine = engine;
	}
	
	public void printdata() {
		System.out.println("Bus Engine ModelYear : "+engine.getModelyear());
	}
}
