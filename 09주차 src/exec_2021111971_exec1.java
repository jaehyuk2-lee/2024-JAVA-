import java.util.Scanner;

abstract class Car{
	private String color;
	private int speed;
	public Car() {
		color = "";
		speed = 0;
	} // 매개변수가 없을 시 색상설정을 하지 않고 속도를 0으로 설정합니다.
 	public Car(String c, int s) {
		color = c;
		speed = s;
	}
 
 	public void setSpeed(int s) {
 		speed = s;
 	}
 	public int getSpeed() {
 		return speed;
 	}
 	// 속도의 값을 변경시키기 위한 메소드 
	
	public void accelerate(int s) {
		speed += s;
		System.out.println("자동차의 속도가 "+speed+"로 올라갑니다.");
	}
	public void slowDown(int s) {
		speed -= s;
		System.out.println("자동차의 속도가 "+speed+"로 내려갑니다.");
	}
	// 매개변수만큼 속도의 값을 조절하는 메소드
}
// 후에 상속받을 승용차와 트럭모두 색상과 속도의 값과 속도를 조절하는 메소드 가지고 있습니다.
// 승용차와 트럭으로 다르게 출력하기 때문에 메소드 오버라이딩을 사용해 추상 메소드로 상속하는 것이 가장 좋습니다.

class Passenger extends Car{
	private int seat;
	public Passenger() {
		seat = 0; // 매개변수가 존재하지 않을 시 적재량을 0으로 설정하고 부모클래스도 기본생성자를 실행시킵니다.
	}
	public Passenger(String c, int s, int st) {
		super(c, s); // 매개변수가 존재할 시 슈퍼클래스의 매개변수 생성자를 실행시키면서 값을 전달합니다.
		seat = st;
	}
	int getSeat() {
		return seat;
	} // 좌석의 개수를 리턴합니다.
	
	public void accelerate(int s) {
		setSpeed(getSpeed() + s);
		System.out.println("승용차의 속도가 "+getSpeed()+"로 올라갑니다.");
	}
	public void slowDown(int s) {
		setSpeed(getSpeed() - s);
		System.out.println("승용차의 속도가 "+getSpeed()+"로 내려갑니다.");
	}
}

class Truck extends Car{
	int loadSize;
	public Truck() {
		loadSize = 0;
	} // 매개변수가 없으면 적재량을 0으로 설정하고 부모클래스는 기본생성자를 실행시킵니다.
	public Truck(String c, int s, int ls) {
		super(c, s);
		loadSize= ls;
	}
	int getLoadSize() {
		return loadSize;
	} // 좌석의 개수를 전달받습니다.
	
	public void accelerate(int s) {
		setSpeed(getSpeed() + s);
		System.out.println("트럭의 속도가 "+getSpeed()+"로 올라갑니다.");
	}
	public void slowDown(int s) {
		setSpeed(getSpeed() - s);
		System.out.println("트럭의 속도가 "+getSpeed()+"로 내려갑니다.");
	}
}

public class exec_2021111971_exec1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color; // 생성할 차량의 색상을 저장할 변수
		int speed; // 생성할 차량의 속도를 저장할 변수
		int extend; // 생성할 차량의 종류에 따라 추가적인 정보를 저장할 변수
		
		System.out.print("승용차의 색상을 입력하세요: ");
		color = sc.next();
		System.out.print("승용차의 속도를 입력하세요: ");
		speed = sc.nextInt();
		System.out.print("승용차의 좌석을 입력하세요: ");
		extend = sc.nextInt();
		
	    Passenger p = new Passenger(color, speed, extend);
	    System.out.println("승용차의 좌석: "+p.getSeat());
	    p.accelerate(30);
	    // 속도변경이 승용차로 출력되는지 확인
	    
	    System.out.print("트럭의 색상을 입력하세요: ");
		color = sc.next();
		System.out.print("트럭의 속도를 입력하세요: ");
		speed = sc.nextInt();
		System.out.print("트럭의 적재량을 입력하세요: ");
		extend = sc.nextInt();
	    Truck t = new Truck(color, speed, extend);
	    System.out.println("트럭의 적재량: "+t.getLoadSize());
	    t.slowDown(30);
	    // 속도변경이 트럭으로 출력되는지 확인
		
		sc.close();
	}

}
