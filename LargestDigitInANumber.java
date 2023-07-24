import java.util.Scanner;

public class LargestDigitInANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Largest Digit In " + n + " Is --> " + LargestDigit(n));
		sc.close();
	}
	public static int LargestDigit(int n) {
        int largestDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            largestDigit = Math.max(largestDigit, digit);
            n /= 10;
        }
        return largestDigit;
    }
}
