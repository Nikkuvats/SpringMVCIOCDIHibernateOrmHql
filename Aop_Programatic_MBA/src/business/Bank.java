package business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {

	private int amount = 5000;
	private String acno = "sbi123";
	
	public int deposit(String acno, int amount) throws AcnoNotFoundException {
	
		if(acno.equals(this.acno)) {
			
			Log l = LogFactory.getLog(Bank.class);
			l.info("deposite method....");
			
			this.amount = this.amount + amount;
			return this.amount;
		}
		else 
		{
			throw new AcnoNotFoundException();
		}
	}
}
