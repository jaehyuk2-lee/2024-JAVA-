// 2021111971 컴퓨터공학과 이재혁 실기문제 1번
package Exam;
import Shape.*;

public class ShapeEx {

	public static void main(String[] args) {
		CCircle cc = new CCircle(1, 2, 3, "검은색");
		CRectangle cr = new CRectangle(0, 0, 4, 4, "흰색");
		
		cc.getInfo();
		cr.getInfo();
	}

}
