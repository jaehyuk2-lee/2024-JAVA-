import java.util.Scanner;

public class exec_2021111971_exec3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String p1, p2;
		System.out.println("가위바위보게임입니다. 가위, 바위, 보를 입력하세요.");
		System.out.print("철수>>");
		p1 = scanner.next();
		System.out.print("영희>>");
		p2 = scanner.next();
		
		switch(p1) {
		case "가위": // 철수가 가위를 냈을 때
			if(p2.equals("가위")) { // p2에 저장되어 있는 값이 "가위"인지 확인하는 함수 equals사용
				System.out.println("비겼습니다.");
			}
			else if(p2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(p2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			else System.out.println("잘못된 입력입니다.");
			break;
			
		case "바위":
			if(p2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(p2.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if(p2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			else System.out.println("잘못된 입력입니다.");
			break;
		case "보":
			if(p2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(p2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if(p2.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else System.out.println("잘못된 입력입니다.");
			break;
		default: // 철수의 입 값이 잘못됐을 때
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		scanner.close();
	}

}
