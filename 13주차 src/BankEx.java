class Account {
	private int balance; // 남은 잔액을 저장하는 변수
	
	public Account(int x) {
		balance = x;
		System.out.println("계좌를 만들었습니다. 현재 잔액 : "+balance);
	} // 매개변수의 값을 잔액으로 설정, 현재 잔액 출력
	
	public void deposit(int x) {
		System.out.println(">>"+x+"원을 입금 요청하였습니다.");
		balance += x;
		System.out.println("현재 잔액 : "+balance);
	}
	public void withDraw(int x) {
		System.out.println(">>"+x+"원을 출금 요청하였습니다.");
		if(x > balance) {
			System.out.println(x-balance+" 잔액이 부족하여 출급하지 못합니다.");
		}
		else {
			System.out.println("출금 : "+x);
			balance -= x;
			System.out.println("현재 잔액 : "+balance);
		}
	}
}

class Bank extends Thread {
	private Account a;
	private int seed; // 난수 값을 저장할 변수
	
	public Bank(int x) {
		a = new Account(x); // 전달받은 매개변수로 새로운 계좌 생성
		seed = (int)(Math.random()*1000)%1000+1;
		// 0~1 사이의 값생성 * 1000
		// ~> 0부터 1000사이의 값 생성 % 1000
		// ~> 0~999의 값으로 나머지 계산 + 1
		// ~> 1~1000중 임의의 값 생성
	}
	public void run() {
		while(true) {
			try {
				sleep(seed); //seed 만큼 대기
				if(seed % 2 == 0) {
					a.deposit(seed); // seed값이 짝수면 입금
				}
				else a.withDraw(seed); // 그렇지 않으면 (홀수) 출금
				
				seed = (int)(Math.random()*1000)%1000+1; // 실행 후 난수 다시 설정
			} catch (InterruptedException e) {
				break;
			} // 스레드 종료를 위한 try-catch문 
			
		} // thread가 종료되면 다시 실행해야되기 때문에, 무한루프 작성
	}
}

public class BankEx {
	public static void main(String[] args) {
		Bank b = new Bank(0);
		b.start();
	}

}
