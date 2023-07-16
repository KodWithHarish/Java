import java.util.Scanner;

public class ChittiApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter robot name : ");
		String name = sc.nextLine();

		System.out.println("Enter robot model : ");
		double model = sc.nextDouble();

		System.out.println("Enter robot color : ");
		sc.nextLine();
		String color = sc.nextLine();

		System.out.println("Enter robot speed : ");
		int speed = sc.nextInt();

		System.out.println("Enter robot memory : ");
		int memory = sc.nextInt();

		System.out.println("Enter robot gf : ");
		sc.nextLine();
		String gf = sc.nextLine();

		System.out.println("Enter robot emotion : ");
		String emotion = sc.nextLine();

		// Chitti c1 = new Chitti("Chitti", 2.0, "Silver", 1, 2, "Sahana", "Love");
		
		Chitti c1 = new Chitti(name, model, color, speed, memory, gf, emotion);


		c1.Fight();
		c1.ReadBook();
		c1.AnswerQuestion();
		c1.Love();
	}
}
