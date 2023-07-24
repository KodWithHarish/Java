import java.util.Scanner;

public class CountTheDigitsInANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n = sc.nextInt();
		System.out.println("The Number " + n + " Is --> " + CountDigits(n) + " Digit Number");
		sc.close();
	}
	
	public static int CountDigits(int n) {
		int count=0;
		while(n>0) {
			n/=10;
			count++;
		}
		return count;
	}
}
