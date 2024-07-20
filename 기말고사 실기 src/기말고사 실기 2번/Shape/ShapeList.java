// 2021111971 컴퓨터공학과 이재혁 실기문제 2번
package Shape;
import java.util.ArrayList;

public class ShapeList<T> {
	public ArrayList<T> sl;
	
	public ShapeList() {
		sl = new ArrayList<T>();
	}
	
	public void add(T a) {
		sl.add(a);
	}
	
	public T get() {
		int size = sl.size();
		
		T tmp = sl.get(size-1);
		sl.remove(size-1);
		
		return tmp;
	}
	
	public int length() {
		return sl.size();
	}
}
