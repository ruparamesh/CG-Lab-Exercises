package lab5.exercise2;

import java.util.Scanner;


public class Exercise2 {
	
		public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name : ");
		String fullName = sc.nextLine();
		sc.close();
		
		try {
			checkName(fullName);
		}
		
		catch (BlankException e){
			System.out.println(e);
		}
		
		
	}

	static void checkName(String s) throws BlankException {
		String[] temp;
		temp = s.split(" ");
		
		if(temp.length < 2) {
			throw new BlankException(s);
		}
		else {
			System.out.println("Your full name => " + s);
		}
		
		
	}

}
	
