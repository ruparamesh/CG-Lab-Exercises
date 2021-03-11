package lab5.exercise3;

public class EmployeeException extends Exception {

	double salary;
	EmployeeException(double salary) {
	    this.salary =salary;
	}

	public String toString() {
	    return "Your salary is: "+salary+". The salary of an employee is below than 3000 ";
	}
	
}
