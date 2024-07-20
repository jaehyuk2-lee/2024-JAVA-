// 2021111971 컴퓨터공학과 이재혁 실기문제 2번
package Shape;
import Base.*;

public class CCircle extends CColor implements Info{
	private CPoint center;
	private int radius;
	public CCircle(int x, int y, int radius, String color) {
		super(color);
		center = new CPoint(x, y);
		this.radius = radius;
	}
	
	public double getRound() {
		return 2*3.14*radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public void getInfo() {
		System.out.println("---CCircle 객체정보---");
		System.out.println("중심 : " + center.toString());
		System.out.println("반지름 : " + this.radius);
		System.out.println("색상 : " + this.toString());
		System.out.println("둘레 : " + this.getRound());
		System.out.println("넓이 : " + this.getArea());
		System.out.println("");
	}
}
