package product;
import shape.Point; // shape패키지의 Point클래스를 import해 사용합니다.

public class Rect {
	public Point p1, p2; // public으로 지정해 외부에서 x, y값을 리턴하는 메소드를 사용할 수 있게합니다.
	
	public Rect(Point p1, Point p2) {
		this.p1 = new Point(p1.getX(), p1.getY());
		this.p2 = new Point(p2.getX(), p2.getY());
		// 전달받은 좌표로 사각형의 새로운 좌표를 설정합니다.
	} // Rect객체를 생성하는 곳은 외부 패키지이기 때문에 public접근지정자로 선언합니다.
	
	public int getArea() {
		int disX = (p1.getX()>p2.getX())?p1.getX()-p2.getX():p2.getX()-p1.getX();
		// 가로의 길이는 큰쪽의 x좌표 - 작은쪽의 x좌표
		int disY = (p1.getY()>p2.getY())?p1.getY()-p2.getY():p2.getY()-p1.getY();
		
		return disX*disY;
		// 가로*세로를 리턴
	}
	
	 public boolean equals(Rect a) {
		if((p1.getX() == a.p1.getX()) && (p1.getY() == a.p1.getY()) && (p2.getX() == a.p2.getX()) && (p2.getY() == a.p2.getY())) {
			return true;
		}
		else return false;
		// Object클래스의 equals 함수를 좌표값을 비교하는 메소드로 오버라이딩
		// 4개의 좌표가 모두 같으면 같은 사각형
	}
	
}
