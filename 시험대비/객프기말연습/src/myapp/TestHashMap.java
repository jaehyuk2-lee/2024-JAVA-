package myapp;
import java.util.Vector;
import java.util.Iterator;
import mylib.*;

public class TestHashMap {
	public static<T> void printkey(MyHashMap<T> H) {
		Vector<T> v = H.getVector();
		Iterator<T> it = v.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next().toString() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MyHashMap<Point> H = new MyHashMap<Point>();
		
		H.put(new Point(3, 5), 5);
		H.put(new Point(2, 1), 3);
		
		
		printkey(H);
		System.out.println(H.getCount(new Point(3, 5)));
		System.out.println(H.getCount(new Point(2, 1)));
		System.out.println(H.getCount(new Point(3, 4)));
		
		H.remove(new Point(3, 5));
		printkey(H);
		System.out.println(H.getCount(new Point(3, 5)));
		System.out.println(H.getCount(new Point(2, 1)));
		
	}

}
