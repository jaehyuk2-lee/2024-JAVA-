import java.util.*;

class Location {
	public int x, y; // 도시의 좌표
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	} // 매개변수로 전달받은 값들을 좌표로 설정한다.
	
	public void show() {
		System.out.println(x+"\t"+y);
	}
} // 도시의 위치정보를 기록할 클래스

public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> h = new HashMap<String, Location>();
		String Info; // , 로 입력받은 문장을 저장할 객체
		String name; // 이름을 저장할 객체
		Location pos; // 좌표를 저장할 객체
		int N; // 입력횟수
		int x, y; // 좌표에 전달할 매개변수
		
		System.out.print(">> 몇개의 도시정보를 입력할까요? ");
		N = sc.nextInt();
		System.out.println(">> 다음과 같이 도시정보를 입력하세요 > 도시, 위도 ,경도 ");
		sc.nextLine();
		// enter 버퍼 삭제
		
		for(int i = 0; i < N; i++) {
			Info = sc.nextLine(); // 도시정보 입력
			StringTokenizer st = new StringTokenizer(Info, ", ");
			// 입력받은 정보를 ", " 로 구분해서 분리
			
			name = st.nextToken();
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			// 문자열로 저장된 숫자를 int 형태로 바꾸어 좌표에 대입
			
			pos = new Location(x, y); // 입력받은 좌표로 새로운 Location 객체 생성
			
			h.put(name, pos); // HasMap에 키, 값 전달
		}
		
		System.out.println("------- 입력한 도시 -------");
		
		Set<String> keys = h.keySet();
		// HashMap의 key가 String 객체 이므로 String의 키 집합 사용
		Iterator<String> it = keys.iterator();
		// key가 저장된 iterator 사용
		while(it.hasNext()) {
			String city = it.next();
			Location point = h.get(city);
			System.out.print(city+'\t');
			point.show();
		} // key와 value 출력
		
		System.out.println("------- 도시 검색 --------");
		while(true) {
			name = sc.next(); // name 변수 재사용
			if(name.equals("exit")) break; // exit을 입력받으면 검색종료
			if(h.get(name) == null) { // 찾고자하는 key가 없으면 출력 X
				System.out.println(name+"은(는) 없습니다.");
			}
			else {
				Location point = h.get(name);
				System.out.print(name+'\t');
				point.show();
			} // key가 존재하면 value를 저장하는 객체를 출력
		}
		
		
		sc.close();

	}

}
