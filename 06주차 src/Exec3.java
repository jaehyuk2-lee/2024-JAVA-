package exec3;
import java.util.Scanner;

class Calculator {
	int a, b;
	public void SetValue(int a, int b ) {
		this.a = a;
		this.b = b;
	} // 멤버변수와 매개변수의 이름이 같기 때문에 this 레퍼런스로 구분한
	
	public int run(String op) {
		if (op.equals("+")) {
			return a+b;
		}
		else if (op.equals("-")) {
			return a-b;
		}
		else if (op.equals("*")) {
			return a*b;
		}
		else if (op.equals("/")) {
			return a/b;
		} // 리턴타입이 int이기 때문에 몫만 리턴한다.
		else {
			System.out.println("잘못된 연산자가 입력되었습니다.");
			return 0; // 사칙연산 부호가 제대로 입력되지 않을 시 0을 리턴한다.
		}
	}
} // 같은 패키지내에서 실해하면 메소드를 default 메소드까지 사용할 수 있다.

public class Exec3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculator c = new Calculator(); // 새로운 Caculator객체 생성
		
		int a, b;
		String op;
		
		System.out.println("수식을 입력하세요 ex) 1 + 2");
		a = scanner.nextInt();
		op = scanner.next();
		b = scanner.nextInt();
		
		c.SetValue(a, b); // 입력받은 값을 계산기 객체에 전달
		
		System.out.print(a+" "+op+" "+b+" = "+c.run(op)); // 입력받은 자료들과 전달받은 자료를 계산한 값을 출력한다
		scanner.close();
	}
}
