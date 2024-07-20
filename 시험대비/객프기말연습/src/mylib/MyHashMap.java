package mylib;
import java.util.Vector;

public class MyHashMap<T> {
	public Vector<T> value;
	public Vector<Integer> count;
	
	public MyHashMap() {
		value = new Vector<T>();
		count = new Vector<Integer>();
	}
	
	public void put(T a, Integer x) {
		for(int i = 0; i < value.size(); i++) {
			if(value.get(i).equals(a)) {
				int tmp = count.get(i)+x;
				System.out.println("tmp: "+tmp);
				count.remove(i);
				count.add(i, tmp);
				return;
			}
		}
		value.add(a);
		count.add(x);
	}
	
	public int getCount(T a) {
		for(int i = 0; i < value.size(); i++) {
			if(value.get(i).equals(a)) return count.get(i);
		}
		return 0;
	}
	
	public void remove(T a) {
		for(int i = 0; i < value.size(); i++) {
			if(value.get(i).equals(a)) {
				value.remove(i);
				count.remove(i);
			}
		}
	}
	
	public void setCount(T a, int x) {
		for(int i = 0; i < value.size(); i++) {
			if(value.get(i).equals(a)) {
				count.remove(i);
				count.add(i, x);
			}
		}
	}
	
	public Vector<T> getVector() {
		Vector<T> ret = value;
		return ret;
	}
}