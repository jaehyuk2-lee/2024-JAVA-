import java.util.Scanner;

public class exec_2021111971_exec1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("정수 2개 입력>>");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		if(num1 > num2) {
			System.out.printf("두 값의 차이는 %d입니다.\n", num1-num2);
		}
		else System.out.printf("두 값의 차이는 %d입니다.\n", num2-num1);
		// 입력받은 두 수를 비교해서 큰값에서 작은 값을 빼 절댓값으로 계산
		
		System.out.printf("두 값의 Bit AND 결과는 %08x입니다.\n", num1&num2);
		System.out.printf("두 값의 Bit XOR 결과는 %08x입니다.\n", num1^num2);
		// AND XOR연산 결과를 16진수 8칸으로 출력
		scanner.close();
	}
}
