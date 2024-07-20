// 2021111971 컴퓨터공학과 이재혁 실기문제 3번
class CAccount {
	public int balance;
	
	public CAccount(int money) {
		balance = money;
	}
}

class CMember extends Thread {
	private CAccount c;
	private int time;
	private int delay;
	
	public CMember(int time, int delay, CAccount c) {
		this.time = time;
		this.delay = delay;
		this.c = c;
	}
	
	private synchronized void Input() {
		System.out.println("입금");
		c.balance += (int)(Math.random()*10000%5000);
	    System.out.println("잔액 : " + c.balance);
	    System.out.println();
	}
	
	private synchronized void Output() {
		 System.out.println("출금 : " + c.balance);
		int withDraw = (int)(Math.random()*10000%2000);
		if (c.balance < withDraw) {
			System.out.println("잔액이 모자랍니다.");
		}
		else c.balance -= withDraw;
		System.out.println("잔액 : " + c.balance);
		 
		System.out.println();
		 
	}
	
	public void run() {
		int seed;
		try {
			for(int i = 0; i < time; i++ ) {
				seed = (int)Math.random()*10%2;
				System.out.println("Thread : " + getName());
				
				if(seed == 0) {
					Input();
					sleep(delay);
				}
				else {
					Output();
					sleep(delay);
				}
			}
		}
		catch(InterruptedException e){}
	}
}


public class CFamilyEx {
	public static void main(String[] args) {
		CAccount c = new CAccount(10000);
		
		CMember cm1, cm2, cm3;
		cm1 = new CMember(20, 1000, c);
		cm2 = new CMember(15, 1200, c);
		cm3 = new CMember(10, 2000, c);
		
		cm1.start();
		cm2.start();
		cm3.start();
	}

}
