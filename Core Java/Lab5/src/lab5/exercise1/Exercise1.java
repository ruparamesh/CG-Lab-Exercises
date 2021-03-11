package lab5.exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args)  {  
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Age: ");
        int age = sc.nextInt();        
        try {
            checkEligibility(age);
        } catch (AgeLimitException e) {            
            System.out.println(e);
        }
        finally {
            System.out.println("done.");
        }
        sc.close();
    }
    
    static void checkEligibility(int age) throws AgeLimitException {
        
        if(age > 15) {
            System.out.println("Age of the person is above 15");
        }
        else {
            throw new AgeLimitException(age);
        }
    }
	
}
