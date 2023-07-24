import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n = sc.nextInt();
		System.out.println("Product Of Digits In " + n + " Is --> " + MulOfDigits(n));
	}
	public static int MulOfDigits(int n) {
		int mul=1, rem=0;
		for(int i=0;i<n;i++) {
			rem = n%10;
			mul*=rem;
			n/=10;
		}
		return mul;
	}

}
