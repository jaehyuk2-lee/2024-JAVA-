import java.util.Scanner;
public class exec_2021111971_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arr[][] = new String[3][];
		// 3일치의 상품정보가 기록 돼야 하기 때문에 2차원 배열을 선언
		// arr[0]은 1일차 arr[1]은 2일차 arr[2]는 3일차의 정보를 저장한다
		
		int item = 0; // 상품의 개수를 저장할 변수
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째날 상품의 개수 : ");
			item = scanner.nextInt(); // i일차의 상품개수 입력
			arr[i] = new String[item]; // i일에 item개수 만큼 정보저장
			for(int j = 0; j < item; j++) {
				System.out.print("상품의 이름 : ");
				arr[i][j] = scanner.next(); // 상품의 이름을 입력
			}
		} // 3일치의 정보 저장
		
		for(int i = 0; i < 3; i++) {
			System.out.print((i+1)+"번째날 상품 목록 : ");
			for(int j = 0; j < arr[i].length; j++) {
				// i번째 날에 존재하는 상품의 수만큼 반복해서 출력
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			// i번째 날의 상품 출력 후 줄바꿈
		}
		
		
		scanner.close();
	}

}
