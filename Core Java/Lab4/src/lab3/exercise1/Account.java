package lab3.exercise1;

public class Account {
	private static long accNum = 300000000100L;
	private double balance;
	private Person accHolder;
	
	public Account() {
		accNum++;
	}

	public Account(double balance, Person accHolder) {
		super();
		this.balance = balance;
		this.accHolder = accHolder;
	}

	
	public long getAccNum() {
		return accNum;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	void deposit(double val) {
		this.balance += val;
	}
	
	void withdraw(double val) {
		this.balance -= val;
	}
	

}
