package Thread;

import java.util.ArrayList;

class JavaLibrary {
	public ArrayList<String> arrayList = new ArrayList<String>();
	
	public JavaLibrary() {
		arrayList.add("1번 자리");
		arrayList.add("2번 자리");
		arrayList.add("3번 자리");
	}
	
	public synchronized String study() throws InterruptedException {
		Thread t = Thread.currentThread();
		if(arrayList.size() == 0) {
			System.out.println(t.getName()+" : 대기시작");
			wait();
			System.out.println(t.getName() + " : 대기 끝");
		}
		
		if(arrayList.size() > 0) {
			String seat = arrayList.remove(0);
			System.out.println(t.getName() + " : " + seat + " 착석함");
			return seat;
		} else return null;
	}
	
	public synchronized void returnSeat(String seat) {
		Thread t = Thread.currentThread();
		
		arrayList.add(seat);
		notify();
		System.out.println(t.getName() + " : " + seat + "가 반환됨");
	}
}

class Student extends Thread {
	public void run() {
		try {
			String seatNum = Library.library.study();
			if(seatNum == null) {
				return;
			}
			sleep(5000);
			Library.library.returnSeat(seatNum);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class Library {
	public static JavaLibrary library = new JavaLibrary();
	public static void main(String[] args) {
		Student[] std = new Student[5];
		
		for(int i = 0; i < 5; i++) {
			std[i] = new Student();
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
			std[i].start();
		}
	}
}
