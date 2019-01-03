package beans;

import java.util.List;

public class Car {

	private List carname;

	private Engine engine;

	private Light light;

	public void setCarname(List carname) {
		this.carname = carname;
	}

	public void setLight(Light light) {
		this.light = light;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printdata() {

		for (Object object : carname) {
			System.out.println(object);
		}
		System.out.println(engine.getModelyear());
		System.out.println(light.getLightname());
	}
}