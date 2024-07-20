import java.util.*;

public class exec_2021111971_exec1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>(); // 정수 값을 저장하는 ArrayList컬랙션 생성
		Iterator<Integer> it; // 반복하면서 컬랙션의 자료에 접근하기위해 Iterator 컬렉션 사용
		int x; // 사용자의 입력을 저장할 변수
		
		while(true) {
			System.out.print("강수량 입력 (0 입력 시 종료)>> ");
			x = sc.nextInt();
			if(x == 0) break; // 사용자로부터 0이 입력이 되지 않은 동안 ArrayList에 값 추가
			
			a.add(x);
			it = a.iterator();
			int avg = 0; // 평균값을 정수로 출력하기위해 정수형으로 선언
			while(it.hasNext()) { // 다음에 확인할 값이 있으면 반복한다.
				int n = it.next();
				avg += n;
				System.out.print(n+" "); // 현재 확인한 값을 출력한다.
			}
			System.out.println();
			
			System.out.println("현재 평균: "+avg/a.size());
			// 컬렉션의 모든 합과 저장하고있는 개수로 나누어 평균을 출력한다.
		}
		
		sc.close();
	}

}
