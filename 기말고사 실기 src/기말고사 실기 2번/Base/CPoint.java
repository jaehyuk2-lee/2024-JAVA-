// 2021111971 컴퓨터공학과 이재혁 실기문제 2번
package Base;

public class CPoint {
	private int x;
	private int y;
	
	public CPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}
}
