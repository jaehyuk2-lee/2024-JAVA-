package w6;

public class Exam1 {

	public static void main(String[] args) {
		Rect r1 = new Rect(); // 기본생성자를 호출해 (0,0)~(1,1)을 대각선으로 갖는 사각형을 생성한다.
		System.out.println("사각형의 면적은 : " + r1.getArea() + " 사각형의 둘레는 : " + r1.getRound());
		Rect r2 = new Rect(30,30); //30,30을 전달해 (0,0)~(30,30)을 대각선으로 갖는 사각형을 생성한다.
		System.out.println("사각형의 면적은 : " + r2.getArea() + " 사각형의 둘레는 : " + r2.getRound());
		Rect r3 = new Rect(10,10,50,50); //(10,10), (50,50)을 전달해 (10,10)~(50,50))을 대각선으로 갖는 사각형을 생성한다.
		System.out.println("사각형의 면적은 : " + r3.getArea() + " 사각형의 둘레는 : " + r3.getRound());
	}

}
// 같은 package 내부이므로 Rect 클래스를 활용할 수 있다.