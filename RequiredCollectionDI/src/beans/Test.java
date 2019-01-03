package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

	private Vector fruits;
	private TreeSet crickters;
	private Hashtable cc;
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	
	public void setCrickters(TreeSet crickters) {
		this.crickters = crickters;
	}
	
	public void setCc(Hashtable cc) {
		this.cc = cc;
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
