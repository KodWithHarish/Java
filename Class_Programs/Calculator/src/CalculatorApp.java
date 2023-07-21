import java.util.Scanner;

public class ProblemApp1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);
		char ch;
		while (true) {
			System.out.println("Select an operator from below to perform specific operation: ");
			System.out.println("+ -> addition");
			System.out.println("- -> subtraction");
			System.out.println("* -> multiplication");
			System.out.println("/ -> division");
			System.out.println("% -> modulus");
			System.out.println("^ -> power");
			System.out.println("! -> stop");
			System.out.println("Enter Your Choice : ");
			ch = sc.next().charAt(0);

			switch (ch) {
				case '+':
					c.addition();
					break;
				case '-':
					c.subtraction();
					break;
				case '*':
					c.multiplication();
					break;
				case '/':
					c.division();
					break;
				case '%':
					c.modulus();
					break;
				case '^':
					c.findSq();
					break;
				case '!':
					System.out.println("tata bye bye");
					return;
				default:
					System.out.println("enter valid operator");
					break;
			}
			sc.close();
		}
	}
}
