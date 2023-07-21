
public class Person {
	int id;
	String name;
	String gender;
	String email;
	long phNo;
	
	public Person(int id, String name, String gender, String email, long phNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phNo = phNo;
	}
	
	void eating() {
		System.out.println(this.name+" is eating");
	}
	
	void sleeping() {
		System.out.println(this.gender+" "+this.name+" is sleeping");
	}
}
