import java.util.Scanner;

public class exec_2021111971_exec4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, tmp;
		// 2개의 정수를 입력받기 위해 x, y를 변수교환에 필요한 tmp를 생
		System.out.print("첫 번째 정수를 입력하세요 : ");
		x = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		y = scanner.nextInt();
		
		System.out.println("교환 전 : x = "+x+", y = "+y);
		tmp = x; // tmp에 처음 x의 값을 저장
		x = y; // x에 y값을 대입
		y = tmp; // y에 처음 저장했던 x의 값 즉 tmp의 값을 대입
		System.out.println("교환 후 : x = "+x+", y = "+y);
		
		scanner.close();
	}
}
