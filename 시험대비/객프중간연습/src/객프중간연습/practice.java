package 객프중간연습;
import java.util.Scanner;
import java.lang.Math;
class Point {
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
};

class MyCircle {
	private Point o;
	private int radius;
	
	public MyCircle() {
		o = new Point();
		radius = 0;
	}
	public MyCircle(int x, int y, int radius) {
		o = new Point(x, y);
		this.radius = radius;
	}
	
	public int getR() {
		return radius;
	}
	
	public int getX() {
		return o.getX();
	}
	
	public int getY() {
		return o.getY();
	}
}


public class practice {
	public static boolean isOverlap(MyCircle a, MyCircle b) {
		double diag = 0;
		diag = Math.sqrt(((double)a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
		
		if(a.getR() + b.getR() > diag) {
			return true;
		}
		else return false;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, radius;
		System.out.print("원점의 x좌표 y좌표 반지름 길이를 입력하세요 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		radius = sc.nextInt();
		MyCircle a = new MyCircle(x, y, radius);
		System.out.print("원점의 x좌표 y좌표 반지름 길이를 입력하세요 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		radius = sc.nextInt();
		MyCircle b = new MyCircle(x, y, radius);
		if(isOverlap(a, b)) {
			System.out.println("("+a.getX()+", "+a.getY()+") 좌표의 반지름 "+a.getR()+"인 원과 ("+b.getX()+", "+b.getY()+") 좌표의 반지름 "+b.getR()+"인 원은 겹침");
		}
		else {
			System.out.println("("+a.getX()+", "+a.getY()+") 좌표의 반지름 "+a.getR()+"인 원과 ("+b.getX()+", "+b.getY()+") 좌표의 반지름 "+b.getR()+"인 원은 겹치지 않음");
		}
	}
}
