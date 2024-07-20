import java.util.Scanner;
public class exec_2021111971_exec4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.print("나이를 입력하세요 >> ");
		age = scanner.nextInt();
		
		switch((age%100)/10) { // 0~99까지의 나이 중 10의 자리만 확인하여 나이대를 판별
		case 0:
			System.out.println("0~9세");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
		case 3:
			System.out.println("30대");
			break;
		case 4:
			System.out.println("40대");
			break;
		case 5:
			System.out.println("50대");
			break;
		case 6:
			System.out.println("60대");
			break;
		case 7:
			System.out.println("70대");
			break;
		case 8:
			System.out.println("80대");
			break;
		case 9:
			System.out.println("90대");
			break;
		default:
			break;
			
		}
		
		scanner.close();
	}
}
