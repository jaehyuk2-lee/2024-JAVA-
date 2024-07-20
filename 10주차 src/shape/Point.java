package shape;

public class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	// 생성자와 x, y를 리턴하는 함수는 public 접근지정자로 선언해 외부 패키지에서 접근할 수 있도록 합니다.
}
// shape 패키지의 Point클래스 정의합니다.
// 외부 패키지에서 shape를 import해서 사용할 수 있습니다.