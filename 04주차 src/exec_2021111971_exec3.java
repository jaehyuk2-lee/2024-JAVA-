import java.lang.Math;
public class exec_2021111971_exec3 {

	public static void main(String[] args) {
		int num;
		
		System.out.println("생성된 6개의 번호는 다음과 같습니다.");
		
		for(int i = 0; i < 6; i++) {
			num = (int)(Math.random()*100)%101;
			// 0~1사이의 실수에 100을 곱해 3리수 까지 표현 후 101을 나눈 나머지 값을 저장
			// 0~100는 그대로 출력, 101부터 나머지 연산에 의해 0부터 100까지 다시 증가
			System.out.print(num+" ");
		}
	}
}
