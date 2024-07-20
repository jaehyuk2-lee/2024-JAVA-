import java.util.Scanner;

public class exec_2021111971_exec1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.print("양의 정수 입력 >>");
		num = scanner.nextInt();
		
		for(int i = num; i >= 0; i--) {
			if(i%3 == 0) {
				System.out.print(i + " ");
			}
		}
		// 50부터 0까지 1씩 줄여가면서 3으로 나눈 나머지가 0 즉 3의 배수일때 출력
		
		scanner.close();
	}

}
