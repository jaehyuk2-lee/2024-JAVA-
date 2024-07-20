import java.util.Scanner; // scanner를 통한 입력을 위해 포함

public class exec_2021111971_exec1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		String name;
		int age;
		int number;
		// 이름, 나이, 학번을 입력받을 변수 생성
		
		System.out.print("이름 : "); // 어떤 값을 입력해야 할지 먼저 알려주기 위해 scanner 사용 이전에 출력할 문구
		name = scanner.next(); // name은 문자열 이므로 String을 반환하는 next()를 사용
		
		System.out.print("나이 : ");
		age = scanner.nextInt(); // age는 정수형 이므로 int를 반환하는 nextInt()를 사용
		
		System.out.print("학번 : ");
		number = scanner.nextInt(); // number는 정수형 이므로 int를 반환하는 nextInt()를 사용
		
		System.out.println("당신의 이름은 "+name+"입니다.");
		System.out.println("당신의 나이는 "+age+"입니다.");
		System.out.println("당신의 학번은 "+number+"입니다.");
		// 입력받은 값들 출력
		scanner.close(); // scanner 닫기
	}

}
