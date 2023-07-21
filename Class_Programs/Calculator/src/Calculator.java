import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	
	void addition() {
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result : "+(a+b));
	}
	
	void subtraction() {
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result : "+(a-b));
	}
	
	void multiplication() {
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result : "+a*b);
	}
	
	void division() {
		System.out.println("Enter two number");
		float a = sc.nextInt();
		float b = sc.nextInt();
		System.out.println("Result : "+a/b);
	}
	
	void modulus() {
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Result : "+a%b);
	}
	
	void findSq() {
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("Result : "+a*a);
	}
}
