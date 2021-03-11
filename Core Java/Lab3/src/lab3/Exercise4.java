package lab3;

public class Exercise4 {
	public static int modifyNumber(int n) {
		String[] str = String.valueOf(n).split("");
		
		return Integer.parseInt(str.toString());		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		System.out.println(modifyNumber(n));
		sc.close();
	}
}
