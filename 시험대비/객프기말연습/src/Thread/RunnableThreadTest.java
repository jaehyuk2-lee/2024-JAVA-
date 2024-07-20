package Thread;

class RunnableThread implements Runnable {
	int n;
	
	public void run() {
		while(true) {
			n++;
			try {
				System.out.println(n);
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {return;}
		}
	}
}

public class RunnableThreadTest {

	public static void main(String[] args) {
		Thread t = new Thread(new RunnableThread());
		System.out.println("Start");
		t.start();
		System.out.println("Stopped");
		}
}
