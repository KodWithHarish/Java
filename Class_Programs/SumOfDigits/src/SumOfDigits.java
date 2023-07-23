import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(Sum(n));
		System.out.println(Reverse(n));
		System.out.println(Armstong(n));
		sc.close();
	}
	public static int Sum(int n) {
		int sum = 0;
		while(n>0) {
			sum = sum + n%10;
			n=n/10;
		}
		return sum;
	}
	public static int Reverse(int n) {
		int rev = 0;
		while(n>0) {
			rev = rev*10 + n%10;
			n=n/10;
		}
		return rev;
	}
	public static int Armstong(int n) {
		int rev = 0;
		int count =0;
		int arm=0;
		while(n>0) {
			rev = rev*10 + n%10;
			n=n/10;
			count++;
		}
		switch (count) {
		case 1: while(n>0) {
					return n*1;
				}
		case 2: 
			while(n>0) {
			int mod = n%10;
			arm=arm+(mod*mod);
			n=n/10;
		}
		return arm;
		case 3: 
			while(n>0) {
			int mod = n%10;
			arm=arm+(mod*mod*mod);
			n=n/10;
		}
		return arm;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + count);
		}
	}

}
