// 2021111971 컴퓨터공학과 이재혁 실기문제 2번
package Exam;
import Shape.*;

public class ShapeGenericEx {
	public static void main(String[] args) {
		ShapeList<CCircle> CircleList = new ShapeList<CCircle>();
		for(int i = 1; i <= 5; i++) {
			CircleList.add(new CCircle(i, i, i, "색"+i));
		}
		System.out.println("---CircleList---");
		System.out.println("리스트의 크기 : " + CircleList.length());
		System.out.println("--- List 내용 반환 ---");
		for(int i = 0; i < 5; i++) {
			CircleList.get().getInfo();
		}
		System.out.println("반환 후 리스트의 크기 : " + CircleList.length());
		System.out.println();
		
		ShapeList<CRectangle> RectangleList = new ShapeList<CRectangle>();
		for(int i = 1; i <= 5; i++) {
			RectangleList.add(new CRectangle(i, i, i*2, i*2, "색"+i));
		}
		System.out.println("---RectangleList---");
		System.out.println("리스트의 크기 : " + RectangleList.length());
		System.out.println("--- List 내용 반환 ---");
		for(int i = 0; i < 5; i++) {
			RectangleList.get().getInfo();
		}
		System.out.println("반환 후 리스트의 크기 : " + RectangleList.length());
	}
}
