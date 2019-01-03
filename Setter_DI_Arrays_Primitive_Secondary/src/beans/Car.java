package beans;

public class Car {

	private String[] carname;
	
	private Engine[] engine;
	
	public Car() {
		
	}	

	public String[] getCarname() {
		return carname;
	}

	public void setCarname(String[] carname) {
		this.carname = carname;
	}


	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void cardata() {
		
		for (String car : carname) {
			System.out.println("CarName = " +car);	
		}
		
		for (Engine eng : engine) {
			System.out.println("ModelYear = "+eng.getModelyear());
		}
	}
}
