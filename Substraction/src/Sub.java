import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int res;

		if (a < b) {
			res = a - b;
			System.out.println("Result is : "+res);
		}
		else {
			res = b - a;
			System.out.println("Result is : "+res);
		}
	}

}
