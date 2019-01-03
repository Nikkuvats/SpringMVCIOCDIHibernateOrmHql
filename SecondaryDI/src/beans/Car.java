package beans;

public class Car {
	
	private java.util.Vector carname;
	
	public void setCarname(java.util.Vector carname) {
		this.carname = carname;
	}
	
	public java.util.Vector getCarname() {
		return carname;
	}
	
	public void printdata() {
		
		for (Object object : carname) {
			System.out.println(object);
		}
	}
}