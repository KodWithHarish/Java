import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n = sc.nextInt();
		System.out.println("Sum Of Digits Of " + n + " Is --> " + Sum(n));
		sc.close();
	}
	
	public static int Sum(int n) {
		int sum=0;
		while(n>0) {
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}

}
