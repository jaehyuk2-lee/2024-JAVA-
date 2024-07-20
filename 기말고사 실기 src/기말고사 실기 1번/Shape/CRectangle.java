// 2021111971 컴퓨터공학과 이재혁 실기문제 1번
package Shape;
import Base.*;

public class CRectangle extends CColor implements Info{
	private CPoint cp1, cp2;
	
	public CRectangle(int x1, int y1, int x2, int y2, String color) {
		super(color);
		cp1 = new CPoint(x1, y1);
		cp2 = new CPoint(x2, y2);
	}
	
	
	public double getRound() {
		int delX = cp1.getX() - cp2.getX();
		int delY = cp1.getY() - cp2.getY();
		
		if(delX < 0) delX *= -1;
		if(delY < 0) delY *= -1;
		
		return 2*(delX+delY);
	}
	public double getArea() {
		int delX = cp1.getX() - cp2.getX();
		int delY = cp1.getY() - cp2.getY();
		
		if(delX < 0) delX *= -1;
		if(delY < 0) delY *= -1;
		
		return delX*delY;
	}
	
	public void getInfo() {
		System.out.println("---CCircle 객체정보---");
		System.out.println("점1 : " + cp1.toString());
		System.out.println("점2 : " + cp2.toString());
		System.out.println("색상 : " + this.toString());
		System.out.println("둘레 : " + this.getRound());
		System.out.println("넓이 : " + this.getArea());
		System.out.println("");
	}
}
