import java.util.Scanner;
public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;
		System.out.print("정수 3개 입력 >> ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) { // num1이 최댓값인 경우
				if(num2 > num3) { // num2가 num3보다 크면 중간 값 
					System.out.printf("중간값은 %d입니다.", num2);
				}
				else System.out.printf("중간값은 %d입니다.", num3);
				// 아니면 num3가 중간 값
			}
			else if(num1 < num3) { // num3가 최댓값인 경우
				System.out.printf("중간값은 %d입니다.", num1);
			} //무조건 num1이 중간값
		}
		
		else if(num1 < num2) {
			if(num2 > num3) { // num2가 최댓값일 경우
				if(num3 > num1) { // num3과 num1 중 큰쪽이 중간값
					System.out.printf("중간값은 %d입니다.", num3);
				}
				else System.out.printf("중간값은 %d입니다.", num1);
			}
			else if(num3 > num2) { // num3이 최댓값이면 num2가 중간값
				System.out.printf("중간값은 %d입니다.", num2);
			}
		}
		
		
		scanner.close();
		}
}
