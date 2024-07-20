import java.util.Scanner;
public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.print("양의 정수 입력 >>");
		n = scanner.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			} // i는 현재 줄에 출력돼야 하는 *의 개수이기 때문에 i번 반복하며 *을 출력 
			System.out.println(); // *출력 후 줄 바꿈
		} // 입력받은 수 부터 1까지 1씩 감소하면서 반복
		
		scanner.close();
	}
}
