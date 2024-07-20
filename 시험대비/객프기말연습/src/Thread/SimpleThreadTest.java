package Thread;

class TimerThread extends Thread {
	int n = 0;
	public void run() {
		while (true) {
			n++;
			System.out.println(n);
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {return;}
		}
	}
}

public class SimpleThreadTest {

	public static void main(String[] args) {
		TimerThread t = new TimerThread();
		
		System.out.println("Start");
		t.start();
		System.out.println("Stopped");
	}

}
