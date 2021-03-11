package lab8.exercise2;

public class Exercise2 {

	public static void main(String[] args) {
		MyRunnableThread mt = new MyRunnableThread();
		
		Thread t1 = new Thread(mt, "T1");
		
		t1.start();

	}
	
}
