package practice2;

abstract class Shape {
	public Shape() {}
	abstract public void draw();
}

class Line extends Shape {
	public void draw() {
		System.out.println(toString());
	}
	public String toString() {return "Line";}
}

public class abs {

	public static void main(String[] args) {
		Line l = new Line();
		l.draw();

	}

}
