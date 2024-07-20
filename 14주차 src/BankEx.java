class Account {
	private int balance; // 남은 잔액을 저장하는 변수
	private String name; // 계좌 이름
	
	public Account(String name, int x) {
		this.name = name;
		balance = x;
		System.out.println(name+"계좌를 만들었습니다. 현재 잔액 : "+balance);
	} // 매개변수의 값을 잔액으로 설정, 현재 잔액 출력
	
	synchronized public void deposit(int x) {
		System.out.println(">>"+name+"계좌가 "+x+"원을 입금 요청하였습니다.");
		balance += x;
		System.out.println("현재 잔액 : "+balance);
	}
	
	synchronized public int withDraw(int x) {
		System.out.println(">>"+name+"계좌가 "+x+"원을 출금 요청하였습니다.");
		if(x > balance) {
			System.out.println(name+"계좌가 "+(x-balance)+" 잔액이 부족하여 출금하지 못합니다.");
			return 0;
		}
		else {
			System.out.println(name+"에서 출금 : "+x);
			balance -= x;
			System.out.println(name+"계좌의 현재 잔액 : "+balance);
			return x;
		}
	}
	// 계좌 이체시 출금 금액이 모자랄 경우 0을 리턴, 출금 가능시 출금 금액을 리턴해 이체 계좌에 추가한다.
	
	public String getName() {return name;}
}
// 여러 Bank 객체가 Account 객체를 수정하기 때문에, 입금, 출금 메소드를 synchronized 시켜충돌되지 않도록 한다 

class Bank extends Thread {
	private Account main; // 주 계좌
	private Account trans; // 금액을 이체할 다른 계좌 (다른 bank 클래스 객체와 공유)
	
	private int seed; // 난수 값을 저장할 변수
	
	public Bank(Account a, Account b) {
		main = a;
		trans = b;
	}
	
	synchronized public void transfer() {
		System.out.println(main.getName()+"에서 이체");
		trans.deposit(main.withDraw(seed));
	} // main 계좌에서 출금한 금액을 trans 계좌에 추가
	
	public void run() {
		while(true) {
			try {
				sleep((seed%10)*1000); // seed를 10으로 나눈 나머지 초 만큼 대기
				if(seed % 2 == 1) {
					main.deposit(seed); // seed값이 홀수면 입금
				}
				else transfer(); // 그렇지 않으면 (짝수) 타 계좌에 이체
				
				seed = (int)(Math.random()*1000)%1000+1; // 실행 후 난수 다시 설정
			} catch (InterruptedException e) {
				break;
			} // 스레드 종료를 위한 try-catch문 
			
		} // thread가 종료되면 다시 실행해야되기 때문에, 무한루프 작성
	}
}
public class BankEx {
	public static void main(String[] args) {
		Account a1 = new Account("계좌 1",10000);
		Account a2 = new Account("계좌 2",10000);
		// 계좌 2개를 생성 
			
		Bank b1 = new Bank(a1, a2);
		Bank b2 = new Bank(a2, a1);
		// 두개의 은행은 서로 메인 계좌와 이체할 계좌가 반대, thread로 작업을 실행하면서 주고 금액을 전달
		// 계좌의 레퍼런스를 공유하기 때문에 서로 다른 객체가 값을 수정할 수 있다.
		
		b1.start();
		b2.start();
	}

}
