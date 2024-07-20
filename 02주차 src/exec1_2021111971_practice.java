import java.util.Scanner;

public class exec1_2021111971_practice {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int radius;
	double area, length;
	final double PI = 3.14;
	
	System.out.println("반지름을 입력하세요: ");
	radius = scanner.nextInt();
	
	area = radius*radius*PI;
	System.out.println("원의 넓이는 "+area+"입니다.");
	
	length = 2*radius*PI;
	System.out.println("원의 둘레는 "+length+"입니다.");
	scanner.close();
	}
}
