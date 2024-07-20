import java.util.Scanner;
interface Car2{ //실습 1번에 Car클래스가 선언되어있기 때문에 Car2로 만들었습니다.
	public void acceleration(int s);
	public void slowDown(int s);
} // tank 클래스는 자동차의 메소드와 대포의 메소드를 다중으로 상속받아야하기 때문에 인터페이스로 구현합니다. 
interface Cannon{
	public void action();
	public void fire();
} // tank 클래스는 자동차의 메소드와 대포의 메소드를 다중으로 상속받아야하기 때문에 인터페이스로 구현합니다. 

class Tank implements Car2,Cannon{
	private int speed;
	Tank(int s) {
		speed = s;
	}
	public void acceleration(int s) {
		speed += s;
		System.out.println("탱크의 속도가 "+speed+"로 올라갑니다.");
	}
	public void slowDown(int s) {
		speed -= s;
		System.out.println("탱크의 속도가 "+speed+"로 내려갑니다.");
	}
	// Car에서 상속받은 메소드를 구현합니다.
	// speed는 Tank의 멤버변수이기 때문에 speed에 접근할 메소드를 따로 선언하지 않아도 괜찮습니다.
	public void action() {
		System.out.println("탱크가 앞으로 굴러간다.");
	}
	public void fire() {
		System.out.println("탱크에서 대포를 발사한다.");
	}
	// Cannon에서 상속받은 메소드를 구현합니다.
	
}
public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed;
		System.out.print("탱크의 속도 입력: ");
		speed = sc.nextInt();
		Tank t = new Tank(speed);
		t.acceleration(20);
		t.slowDown(30);
		t.action();
		t.fire();
		
		sc.close();
	}
}
