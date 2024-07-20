import java.util.Scanner; // scanner를 통한 입력을 위해 포함

public class exec_2021111971_exec2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		int exchange, won, dollar, cent; // 환율, 환전할 원, 환전한 달러, 환한 센트를 저장할 값 선언
		
		System.out.print("1달러에 해당하는 원화를 입력하세요 (단위 원): "); // 어떤 값을 입력해야 할 지 먼저 알려주기 위해 scanner 사용 이전에 출력
		exchange = scanner.nextInt(); // 환율 입력
		System.out.print("환전할 원화를 입력하세요 (단위 원): ");
		won = scanner.nextInt(); // 환전할 원 입력
		
		dollar = won/exchange; // 환전할 돈은 환율에 몇번 해당되는 지에 대한 몫
		cent = won%exchange; // 나머지 돈은 센트로 지급
		
		System.out.print(won+"원은 "+dollar+"달러 "+cent+"센트 입니다."); // 입력 된 환전 할 원과, 환전 된 달러, 센트 출력
		
		scanner.close(); // scanner 닫기
	}
}