package mylib;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		Point a = (Point)o;
		if(this.x == a.x && this.y == a.y) return true;
		else return false;
	}
	
	public String toString() {
		return "("+x+", "+y+")";
	}
}