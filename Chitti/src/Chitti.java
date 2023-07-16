
public class Chitti {
	String name;
	double model;
	String color;
	int speed;
	int memory;
	String gf;
	String emotion;

	public Chitti(String name, double model, String color, int speed, int memory, String gf, String emotion) {
		super();
		this.name = name;
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.memory = memory;
		this.gf = gf;
		this.emotion = emotion;
	}

	void Fight() {
		System.out.println("---------------------------------------------");
		System.out.println(name+" "+model+" robot is trained to fight");
	}

	void Love() {
		System.out.println(name+" fall in "+emotion+" with "+gf+" and wants to marry her.");
	}

	void ReadBook() {
		System.out.println(name+" can read a book in 1 sec");
	}

	void AnswerQuestion() {
		System.out.println(name+" can answer any question because it has "+memory+" Zettabytes of memory and speed capacity of "+speed+" Terahertz.");
	}
}
