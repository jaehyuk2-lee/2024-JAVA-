package practice;
import shape.Point;
// shape패키지의 Point클래스를 import해 사용합니다.
import product.Rect;
// product패키지의 Rect클래스를 import해 사용합니다.
import java.util.Scanner;

public class TestRect {
	private static Point setPoint(int x, int y) {
		Point p;
		p = new Point(x, y);
		
		return p; //새롭게 생성한 p를 리턴합니다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rect MyRect, MyRect2;
		Point p1, p2;
		int x, y;
		
		System.out.println("첫 번째 사각형 입력");
		System.out.print("x좌표: ");
		x = sc.nextInt();
		System.out.print("y좌표: ");
		y = sc.nextInt();
		p1 = setPoint(x, y);
		
		System.out.print("x좌표: ");
		x = sc.nextInt();
		System.out.print("y좌표: ");
		y = sc.nextInt();
		p2 = setPoint(x, y);
		
		MyRect = new Rect(p1, p2);
		System.out.println("입력한 두 점은 사각형의 형태 입니다.");
		System.out.print("첫번째 점 : ("+MyRect.p1.getX()+", " + MyRect.p1.getY()+")");
		System.out.println(", 두번째 점 : ("+MyRect.p2.getX()+", " + MyRect.p2.getY()+")");
		System.out.println("면적은 "+MyRect.getArea());
		
		System.out.println("두 번째 사각형 입력");
		System.out.print("x좌표: ");
		x = sc.nextInt();
		System.out.print("y좌표: ");
		y = sc.nextInt();
		p1 = setPoint(x, y);
		
		System.out.print("x좌표: ");
		x = sc.nextInt();
		System.out.print("y좌표: ");
		y = sc.nextInt();
		p2 = setPoint(x, y);
		MyRect2 = new Rect(p1, p2);
		System.out.print("첫번째 점 : ("+MyRect2.p1.getX()+", " + MyRect2.p1.getY()+")");
		System.out.println(", 두번째 점 : ("+MyRect2.p2.getX()+", " + MyRect2.p2.getY()+")");
		System.out.println("면적은 "+MyRect.getArea());
		
		
		if(MyRect.equals(MyRect2)) {
			System.out.println("두 사각형은 동일합니다.");
		}
		else {
			System.out.println("두 사각형은 다릅니다.");
		}

		sc.close();
	}

}
