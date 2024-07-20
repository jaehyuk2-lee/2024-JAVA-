import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static String kor2Eng(String word) {
		for(int i = 0; i < kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return word;
	} // 문자열 배열 내에 찾는 단어가 존재하면 그 위치에 있는 영어단어를 리턴, 
	  // 반복문이 끝날동안 리턴이 없었다면 문자열 배열 내에 단어가 존재하지 않는다.
	  // 존재하지 않으면 입력받은 문자 그대로를 다시 리턴
	// 한글, 영어 배열은 private 접근지정이기 때문에, public인 kor2Eng 메소드에서 다루어야 한다.
}

public class DicApp { // kor2Eng는 public 메소드이기 때문에 DicApp에서 접근할 수 있다.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input; // 사용자의 입력을 저장할 변수
		while(true) { // 무한반복 중 "그만"이 입력되면 반복문 내부에서 종료
			System.out.println("한글 단어 검색 프로그램입니다.");
			System.out.print("한글 단어?");
			input = scanner.next();
			
			if(input.equals("그만")) { // "그만"이 입력되면 반복종료
				break;
			}
			else {
				if((Dictionary.kor2Eng(input)).equals(input)) {
					System.out.println(input+"은 저의 사전에는 없습니다.");
				}
				else System.out.println(input+"은 "+Dictionary.kor2Eng(input));
				// Dictionary클래스의 kor2Eng메소드 호출
			}
		}
		scanner.close();
	}

}
