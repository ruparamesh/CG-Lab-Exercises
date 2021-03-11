package lab8.exercise2;

public class MyRunnableThread implements Runnable {

	int i = 0;

	@Override
	public void run() {

		while (true) {

			System.out.println(i);
			i += 10;
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
