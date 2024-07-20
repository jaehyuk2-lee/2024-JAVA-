import java.util.Scanner;

public class exec_2021111971_exec4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[2][10]; // 10크기의 배열 2개를 생성

		for (int i = 0; i < 10; i++) {
			arr[0][i] = i + 1;
		} // 1번째 줄에 좌석번호 설정
		for (int i = 0; i < 10; i++) {
			arr[1][i] = 0;
		} // 2번째 줄에 좌석의 예매유무를 저장

		int seat; // 예매할 좌석을 저장할 변수
		while (true) {
			System.out.println("영화 예매를 시작합니다.");
			for (int i = 0; i < 2; i++) {
				System.out.println("-----------------------------");
				for (int j = 0; j < 10; j++) {
					System.out.print(arr[i][j] + "  ");
				}
				System.out.println();
			} // 현재 극장의 예매상태 출력
			System.out.print("어떤 좌석을 예매하시겠습니까?");
			seat = scanner.nextInt();
			if (seat == 0) {
				System.out.println("예매를 종료합니다.");
				break;
			} // 만약 0을 입력받았다면 예매 시스템(반복)종료
			if (arr[1][seat - 1] == 0) {
				System.out.println(seat + "번 좌석을 예매했습니다.");
				System.out.println();
				arr[1][seat - 1] = 1;
			} // 2번째 줄에 입력받은 좌석이 비어있다면(0) 그 자리를 예약하고 1번으로 변경
			else if (arr[1][seat - 1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println();
			} // 2번째 줄에 입력받은 좌석이 예매되어있다면(1) 이미 예약된 좌석임을 출력
		}

		scanner.close();
	}

}
