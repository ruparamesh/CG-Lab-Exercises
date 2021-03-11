package lab5.exercise2;

public class BlankException extends Exception {

private static final long serialVersionUID = 1L;
	
	String str;
	public BlankException(String s) {
		this.str = s;
	}
	
	public String toString() {
		return "Full name should be entered";
	}
	
}

