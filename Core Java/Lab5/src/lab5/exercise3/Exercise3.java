package lab5.exercise3;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args)  {  
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();       
        try {
            checkSalary(salary);
        } catch (EmployeeException e) {            
            System.out.println(e);
        }
        finally {
            System.out.println("done.");
        }
sc.close();
	}
    
    static void checkSalary(double salary) throws EmployeeException {
        
        if(salary > 3000) {
            System.out.println("The salary of an employee is above 3000");
        }
        else {
            throw new EmployeeException(salary);
        }
    }
	
}
