package practice1;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numc, numm;
		
		System.out.print("일반 동아리원의 수를 입력하십시오: ");
		numm = sc.nextInt();
		
		System.out.print("집행부원의 수를 입력하십시오: ");
		numc = sc.nextInt();
		
		Member[] marr = new Member[numm];
		Crew[] carr = new Crew[numc];
		
		System.out.println("\n---Input Member Information ---");
		for(int i = 0; i < numm; i++) {
			System.out.print("Student ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			marr[i] = new Member(id, name);
			System.out.println();
		}
		
		System.out.println("\n---Input Crew Information ---");
		for(int i = 0; i < numc; i++) {
			System.out.print("Student ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Department: ");
			String depart = sc.next();
			carr[i] = new Crew(id, name, depart);
			System.out.println();
		}
		
		System.out.println("\n---Crew Information ---");
		Object o;
		for(int i = 0; i < numc; i++) {
			o = carr[i];
			System.out.println(o.toString());
			System.out.println();
		}
		
		System.out.println("\n---Member Information ---");
		for(int i = 0; i < numm; i++) {
			o = marr[i];
			System.out.println(o.toString());
			System.out.println();
		}
		
		for(int i = 0; i < numm; i++) {
			for(int j = 0; j < numc; j++) {
				if(marr[i].equals(carr[j])) {
					System.out.println("중복 ID: " + marr[i].getID());
				}
			}
		}
		
		sc.close();
	}

}
