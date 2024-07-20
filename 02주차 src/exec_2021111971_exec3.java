import java.util.Scanner;

public class exec_2021111971_exec3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double length, width, height;
		//가로,세로, 높이를 저장할 변수생성
		
		System.out.println("상자의 가로 세로 높이를 입력하세요:");
		length = scanner.nextDouble();
		width = scanner.nextDouble();
		height = scanner.nextDouble();
		// 모두 실수로 입력받기 때문에 double을 반환하는 nextDouble()를 사용
		
		System.out.println("상자의 부피는 "+length*width*height+"입니다.");
		scanner.close();
	}

}
