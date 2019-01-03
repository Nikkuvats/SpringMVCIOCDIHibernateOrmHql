package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier(value="e1")
	private Engine engine;

	// no need to have setter and constructor
	
	public void printdata() {
		System.out.println("Engine Model year:"+engine.getModelyear());
	}
}