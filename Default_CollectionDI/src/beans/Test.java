package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set crickters;
	private Map cc;
	
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void setCrickters(Set crickters) {
		this.crickters = crickters;
	}
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	
	public void printData() {
		
		System.out.println("Fruits ........");
		
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Crickters..........");
		for (Object crickter : crickters) {
			System.out.println(crickter);
		}
		
		System.out.println("country and capital");
		Set keys = cc.keySet();
		
		for (Object key : keys) {
			System.out.println("Country ....=" + key + " : Capital.... = " + cc.values());
		}
	}
}
