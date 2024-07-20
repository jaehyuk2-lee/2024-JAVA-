import java.util.LinkedList; // linked list 컬렉션을 사용하기 위해 import

class MyQueue<T> { // 제네릭 클래스 선언
	LinkedList<T> q;
	public MyQueue() {
		q = new LinkedList<T>();
	}
	
	void enQueue(T element) {
		q.addLast(element); // LinkedList의 addLast메소드로 큐의 맨 마지막에 자료를 추가한다.
	}
	T deQueue() {
		return q.remove(); // LinkedList의 remove메소드로 큐의 앞의 자료를 꺼내오고 삭제한다.
	}
	
}

public class MyQueueEx1 {
	public static void main(String[] args) {
		MyQueue<String> queue = new MyQueue<String>();
		queue.enQueue("Seoul");
		queue.enQueue("Busan");
		queue.enQueue("Korea"); // queue 맨 마지막에 자료를 삽입하므로 아래에서 부터 Seoul, Busan, Korea로 쌓여있다.
		
		for(int i = 0; i < 3; i++) {
			System.out.println(queue.deQueue());
			// 앞의 값을 리턴 하고 삭제하므로 Seoul이 출력되면 다음 반복에는 Busan이 가장 앞의 자료이다.
		}
		
		MyQueue<Integer> queue2 = new MyQueue<Integer>();
		queue2.enQueue(3);
		queue2.enQueue(2);
		queue2.enQueue(1);
		for(int i = 0; i < 3; i++) {
			System.out.println(queue2.deQueue());
		}
		// 제네릭 클래스로 작성되어 Integer클래스에 대해서도 작동하는 것을 확인할 수 있다.
	}
}
