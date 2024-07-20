import java.awt.*;
import java.io.*;
public class exec_2021111971_exec3 {

	public static void main(String[] args) {
		File f1;
		File f2;
		
		FileReader fr1;
		FileReader fr2;
		
		Frame frame = new Frame("parent");
		FileDialog fd = new FileDialog(frame, "파일열기", FileDialog.LOAD);
		fd.setVisible(true);
		// Dialog로 파일선택
		
		String path1 = fd.getDirectory(); // 상위 디렉토리 정보 저장
		String name1 = fd.getFile(); // 파일의 이름 정보 저장
		
		fd = new FileDialog(frame, "파일열기", FileDialog.LOAD);
		fd.setVisible(true);
		String path2 = fd.getDirectory(); // 상위 디렉토리 정보 저장
		String name2 = fd.getFile(); // 파일의 이름 정보 저장
		
		try {
			f1 = new File(path1+name1); // GUI로 불러온 파일 1
			fr1 = new FileReader(f1); // 파일 1 Reader
			f2 = new File(path2+name2); // GUI로 불러온 파일 2
			fr2 = new FileReader(f2); // 파일 2 Reader

			int c1 = 0;
			int c2 = 0;
			// 읽은 값을 저장할 변수
			
			boolean is_same = true; // 두 파일의 내용이 같은지 여부를 저장하는 변수
			while(((c1 = fr1.read()) != -1) && ((c2 = fr2.read()) != -1)) {
				// c1과 c2가 읽어온 값이 모두 있는동안 비교 진행
				if(c1 != c2) {
					is_same = false;
					break;
					// 만약 파일의 내용이 다른 곳이 있다면 false값으로 설정하고 반복종료
				}
			}
			
			// c1, c2가 길이가 다른 경우 생각
			if(c1 == -1) { // c1의 입력이 끝났을 때, c2의 다음 입력여부를 확인
				c2 = fr2.read();
				if(c1 != c2) { // c2가 -1이 아니라면, c2가 더 많은 자료를 포함
					is_same = false;
				}
			}
			else is_same = false; // c1은 입력을 받았는데, c2에서 입력이 종료되었으 c1이 더 많은 자료포함
			
			fr1.close();
			fr2.close();
			// 파일의 내용들을 다시 처음 부터 꺼내기 위해 일단 종료
			
			System.out.println("첫번째 파일명 : "+f1.getName());
			System.out.println("두번째 파일명 : "+f2.getName());
			
			if(is_same) {
				System.out.println("-> 두 파일의 내용이 같습니다.");
			}
			else {
				System.out.println("-> 두 파일의 내용이 다릅니다.");
			}
			
			fr1 = new FileReader(f1);
			System.out.println("<< 파일 내용 >>");
			System.out.println("파일 1");
			while(((c1 = fr1.read()) != -1)) {
				System.out.print((char)c1);
			}
			
			fr2 = new FileReader(f2);
			System.out.println("파일 2");
			while(((c2 = fr2.read()) != -1)) {
				System.out.print((char)c2);
			}
			// 파일의 내용을 처음부터 다시 꺼내오기
			
			fr1.close();
			fr2.close();
			// 출력 후 FileReader종료
		}
		catch(IOException e) {
			System.out.println("입출력오류");
		}
		
	}

}
