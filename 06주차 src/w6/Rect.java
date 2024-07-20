package w6;

public class Rect {
	int x1, y1;
	int x2, y2;
	
	Rect() {
		x1 = y1 = 0;
		x2 = y2 = 1;
		System.out.println("("+x1+","+y1+"), ("+x2+","+y2+")점을 이용한 사각형을 만들었습니다.");
	} // 점이 없을 때, 즉 매개변수가 없을 때는 (0,0)과 (1,1)을 대각선으로 갖는 사각형이 기본적으로 생성된다
	
	Rect(int x, int y) {
		x1 = y1 = 0;
		x2 = x;
		y2 = y;
		System.out.println("("+x1+","+y1+"), ("+x2+","+y2+")점을 이용한 사각형을 만들었습니다.");
	} // 1개의 점을 입력받았을 때 없을 때, (0,0 (x,y)을 대각선으로 갖는 사각형을 생성한다
	
	Rect(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		System.out.println("("+x1+","+y1+"), ("+x2+","+y2+")점을 이용한 사각형을 만들었습니다.");
	} // 2개의 점을 입력받았을 때는 각각의 좌표를 대각선으로 갖는 사각형으로 설정한다. 전달받는 매개변수와 멤버변수의 이름이 같기 때문에 this 레퍼런스를 사용해 구분한다.
	
	private int getWidth() {
		if(x2 > x1) {
			return x2 - x1;
		}
		else return x1- x2;
	} // 길이는 양수로 큰쪽에서 작은 쪽을 빼 리턴해준다.
	
	private int getHeight() {
		if(y2 > y1) {
			return y2 - y1;
		}
		else return y1- y2;
	} // 길이는 양수로 큰쪽에서 작은 쪽을 빼 리턴해준다.
	
	
	public int getArea() {
		return getWidth() * getHeight();
	} // 사각형의 넓이는 폭 * 높이 이기 때문에 그 값을 리턴해주는 메소드를 활용한다. 접근지정자가 private 이지만 같은 클래스 내부이므로 호출할 수 있다.
	
	public int getRound() {
		return 2*getWidth() +  2*getHeight();
	} // 사각형의 둘레는 2*폭 + 2*높이 이기 때문에 그 값을 리턴해주는 메소드를 활용한다.
	
}