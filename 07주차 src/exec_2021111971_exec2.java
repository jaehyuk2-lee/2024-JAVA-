import java.util.Scanner;

class Vehicle {
	private String name;
	public void setName(String name) {
		this.name = name;
	} // name을 설정하는 메소드
	
	public String getName() {
		return name;
	} // name을 얻는 메소드
}

class Car extends Vehicle {
	private String color;
	private int seat;
	
	public void set(String name, String color, int seat) {
		setName(name);
		this.color = color;
		this.seat = seat;
	} // name은 부모클래스의 멤버이기 때문에, 부모클래스의 이름설정 메소드를 호출한다.
	
	void getCar() {
		System.out.println("당신의 자동차는 의자가 " + seat+"개인 "+color+"의 멋진 "+getName()+"입니다.");
	} // 현재 자동차의 정보 출력, 이름은 private의 부모클래스 멤버이므로 public메소드로 접근
}

class Bike extends Vehicle {
	private String color;
	private int CC;
	
	public void set(String name, String color, int CC) {
		setName(name);
		this.color = color;
		this.CC = CC;
	} // name은 부모클래스의 멤버이기 때문에, 부모클래스의 이름설정 메소드를 호출한다.
	
	void getBike() {
		System.out.println("당신의 바이크는 " + CC+"cc "+color+"의 멋진 "+getName()+"입니다.");
	} // 현재 바이크의 정보 출력 이름은 private의 부모클래스 멤버이므로 public메소드로 접근
}

public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vehicleType; // 생성할 탈것의 종류를 입력받을 변수
		while(true) {
			System.out.print("탈것의 종류를 고르세요 (1.자동차, 2.바이크) : ");
			vehicleType = scanner.nextInt();
			if(vehicleType == 0) {
				System.out.println("종료합니다.");
				break;
			}
			else if(vehicleType == 1) { // 입력받은 값이 1이면 자동차 생성
				Car car = new Car(); // 기본생성자로 생성 후 입력받은 값으로 설정
				String name;
				String color;
				int seat;
				
				System.out.print("자동차 이름 : ");
				name = scanner.next();
				System.out.print("자동차 색상 : ");
				color= scanner.next();
				System.out.print("자동차 의자 개수 : ");
				seat= scanner.nextInt();
				
				car.set(name, color, seat);
				car.getCar();
			}
			else if(vehicleType == 2) { // 입력받은 값이 2이면 바이크 생성
				Bike bike = new Bike(); // 기본생성자로 생성 후 입력받은 값으로 설정
				String name;
				String color;
				int CC;
				
				System.out.print("바이크 이름 : ");
				name = scanner.next();
				System.out.print("바이크 색상 : ");
				color= scanner.next();
				System.out.print("배기량 : ");
				CC= scanner.nextInt();
				
				bike.set(name, color, CC);
				bike.getBike();
			}
			else {
				System.out.println("잘못된 숫자 입력");
			}
		}
		scanner.close();
	}

}
