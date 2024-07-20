package 객프중간연습;
import java.util.Scanner;
public class 예외처리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while(true) {
			System.out.print("나뉫수를 입력하세요: ");
			dividend = sc.nextInt();
			System.out.print("나눗수를 입려하세요: ");
			divisor = sc.nextInt();
			
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 " + dividend/divisor+"입니다,");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다");
			}
			finally {
				System.out.println("그냥 실행");
			}
		}
		
		sc.close();
	}

}
