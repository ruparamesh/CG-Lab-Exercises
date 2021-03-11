package lab3.exercise1;

public class CurrentAccount extends Account{
	final double overdraftLimit = 5000.0d;
	
	void withdraw(double val) {
		double bal = this.getBalance();
		
		if(bal <= overdraftLimit) {
			System.out.println("Over draft Limit");
			new Boolean(false); 
		}
		
	}

}
