package lab3.exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		Person person = new Person("Smith", 20);
		Account ac = new Account(2000.0, person);
		
		System.out.println(ac.getAccNum());
		

	}

}
