package practice1;

public class Crew extends Member{
	private String depart;
	
	public Crew() {
		this.depart = "";
	}
	
	public Crew(int id, String name, String depart) {
		super(id, name);
		this.depart = depart;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nDepartment: " + depart; 
	}
}
