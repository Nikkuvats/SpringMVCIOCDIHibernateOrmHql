package beans;

public class Car {

	private String carname;
	
	private Engine engine;
	
	public Car() {
		System.out.println("Car");
	}	

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
 
	public void cardata() {
		
		System.out.println("CarName = " +carname);
		System.out.println("ModelYear = "+engine.getModelyear());
	}
}
