package beans;

public class Car {
	
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printdata() {
		
		System.out.println("ModelYear : " + engine.getModelyear());
	}
}