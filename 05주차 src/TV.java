// exec_2021111971_2

public class TV {
	int channel; // 채널정보를 저장할 변수
	int volume; // 음량크기를 저장할 변수
	boolean power; //TV가 꺼져있으면 false 켜져있으면 true이 값을 가지고 있을 변 
		
	TV() { // 생성자
		power = false;
		channel = 255;
		volume = 0;
	} // TV클래스의 객체가 생성될 때 전원은 꺼져있고, 채널은 255 음량는 0으로 초기화한다.
		
	void ChangePower() { // power변경 메소드
		if(power == false) {
			System.out.println("- TV가 켜졌습니다.");
			power = true;
		} // TV가 꺼져있으면 전원을 킨다.
		else {
			System.out.println("- TV가 꺼졌습니다.");
			power = false;
		} // TV가 꺼져있지 않으면 전원을 킨다.
	}
		
	void ChangeChannel(int c) { // channel 변경 메소드
		if(power == false) {
			System.out.println("TV의 전원이 꺼져있어 채널을 변경할 수 없습니다.");
		} // TV의 전원이 꺼져있으면 채널변경을 시행하지 않는다.
		else {
			channel = c;
			System.out.println("채널을 "+c+"로 변경했습니다.");
		} // TV의 전원이 꺼져있지 않으면 채널을 변경한다.
			
	}
		
	void ChangeVolume(int v) { // volume 변경 메소드
		if(power == false) {
			System.out.println("TV의 전원이 꺼져있어 음량을 변경할 수 없습니다.");
		} // TV의 전원이 꺼져있으면 음량변경을 시행하지 않는다.
		else {
			volume = v;
			System.out.println("음량을 "+v+"로 변경했습니다.");
		} // TV의 전원이 꺼져있지 않으면 음을 변경한다.
			
	}


public static void main(String[] args) {
	TV mytv = new TV();
		
	System.out.println("새 TV를 구매했습니다.");
	mytv.ChangeChannel(1); // 채널을 1로 변경
	mytv.ChangeVolume(2);  // 음량을 2로 변경
	mytv.ChangePower();    // TV켜기
	mytv.ChangeChannel(3); // 채널을 3으로 변경
	mytv.ChangeVolume(4);  // 음량을 4로 변경
	mytv.ChangePower();    // TV끄기
	}

}
