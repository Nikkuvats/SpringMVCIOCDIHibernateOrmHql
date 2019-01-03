package bean;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Fruits {

//	private List fruit;

	private Map cc;

	/*
	 * public void setFruit(java.util.List<String> fruit) { this.fruit = fruit; }
	 */

	/*
	 * public void printdata() {
	 * 
	 * for (Object frt : fruit) { System.out.println(frt); } }
	 */

	public void setCc(Map cc) {
		this.cc = cc;
	}

	public void printdata() {
		Set string = cc.keySet();
		for (Object object : string) {
			System.out.println(string);
		}
		Set values = cc.entrySet();
		for (Object value : values) {
			System.out.println(value);
		}
	}
}