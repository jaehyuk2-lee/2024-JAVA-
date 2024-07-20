import java.io.*;
public class exec_2021111971_exec0 {

	public static void main(String[] args) {
		File file = new File("/Users/jaehyuk/Desktop/대학활동/객체지향프로그래밍/실습/12주차 실습/test1.txt");
		
		System.out.println("file.isFile() : "+file.isFile());
		System.out.println("file.getParent() : "+file.getParent());
		System.out.println("file.getPath() : "+file.getPath());
		System.out.println("file.getName() : "+file.getName());
		System.out.println("file.exists() : "+file.exists());
	}

}