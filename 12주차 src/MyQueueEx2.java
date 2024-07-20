import java.util.*; // linked list, Iterator 컬렉션을 사용하기 위해 import

class MyDeQueue<T> { // 제네릭 클래스 선언
	LinkedList<T> q;
	public MyDeQueue() {
		q = new LinkedList<T>();
	}
	
	void EnQueueFirst(T element) {
		q.addFirst(element); // LinkedList의 addFirst메소드로 큐의 맨 앞에 자료를 추가한다.
	}
	void EnQueueLast(T element) {
		q.addLast(element); // LinkedList의 addLast메소드로 큐의 맨 마지막에 자료를 추가한다.
	}
	
	T DeQueueFirst() {
		return q.removeFirst(); // LinkedList의 removeFrist메소드로 큐 맨앞의 자료를 꺼내오고 삭제한다.
	}
	T DeQueueLast() {
		return q.removeLast(); // LinkedList의 removeLast메소드로 큐 맨뒤의 자료를 꺼내오고 삭제한다.
	}
	
	void printQueue() {
		Iterator<T> it = q.iterator();
		// T의 타입매개변수를 갖는 List의 iterator 생성
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// 다음이 존재하는 동안 값을 모두 출력한다.
	}
}
public class MyQueueEx2 {
	public static void main(String[] args) {
		MyDeQueue<Integer> deQueue = new MyDeQueue<Integer>();
		// 양방향 큐 생성
		deQueue.EnQueueFirst(1);
		deQueue.EnQueueFirst(2);
		// 앞에서부터 객체 삽입 -> deQueue 내부: 2, 1
		deQueue.printQueue();
		
		deQueue.EnQueueLast(10);
		deQueue.EnQueueLast(20);
		// 뒤에서부터 객체 삽입 -> deQueue 내부: 2, 1, 10, 20
		deQueue.printQueue();
		
		System.out.println(deQueue.DeQueueFirst());
		// 맨 앞의 객체 삭제, 2 출력
		System.out.println(deQueue.DeQueueLast());
		// 맨 뒤의 객체 삭제, 20 출력
		deQueue.printQueue();
		// 10과 20이 남아있다.
		
		MyDeQueue<String> deQueue2 = new MyDeQueue<String>();
		// String 클래스도 동일하게 작동하는지 확인
		deQueue2.EnQueueFirst("A");
		deQueue2.EnQueueFirst("B");
		// 앞에서부터 객체 삽입 -> deQueue 내부: B, A
		deQueue2.printQueue();
		
		deQueue2.EnQueueLast("C");
		deQueue2.EnQueueLast("D");
		// 뒤에서부터 객체 삽입 -> deQueue 내부: B, A, C, D
		deQueue2.printQueue();
		
		System.out.println(deQueue2.DeQueueFirst());
		// 맨 앞의 객체 삭제, B 출력
		System.out.println(deQueue2.DeQueueLast());
		// 맨 뒤의 객체 삭제, D 출력
		deQueue2.printQueue();
		// A와 D가 남아있다.
	}
}
