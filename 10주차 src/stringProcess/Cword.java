package stringProcess;
import java.util.Scanner;
import java.util.StringTokenizer;
//StringTokenizer를 사용하기 위해 import

public class Cword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input; // 사용자의 입력을 저장합니다.
		
		while(true) {
			System.out.print(">> ");
			input = sc.nextLine();
			// 변수를 공백으로 나누어야 되기 때문에 줄바꿈에서 버퍼를 입력하는 nextLine()을 사용합니다.
			if(input.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			} // 그만이 입력되면 반복 종료
			
			StringTokenizer st = new StringTokenizer(input, " ");
			// 공백으로 단어를 구분하는 st 생성
			
			System.out.println("어절개수는 " + st.countTokens());
			// 공백으로 구분한 어절의 개수 즉 토큰의 개수 출력합니다
		}
		
		sc.close();
	}

}
