package practice1;

public class Member {
	private int ID;
	private String name;
	
	public Member() {
		this.ID = 0;
		this.name = "";
	}
	
	public Member(int id, String name) {
		this.ID = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student ID: " + ID + "\nName: " + name;
	}
	
	@Override
	public boolean equals(Object o) {
		Member m = (Member)o;
		if(this.ID == m.ID) return true;
		else return false;
	}
	
	public int getID() {
		return this.ID;
	}
}