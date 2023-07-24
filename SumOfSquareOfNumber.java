import java.util.Scanner;

public class SumOfSquareOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number (Logic n=5 => 5*5=25 => 2+5=7 : ");
		int n = sc.nextInt();
		System.out.println("Sum Of Square Of Number " + n + " Is --> " + Sum(n));
		sc.close();
	}
	
	public static int Sum(int n) {
		int sum=0;
		int sq = n*n;
		while(sq>0) {
			sum+=(sq%10);
			sq/=10;
		}
		return sum;
	}

}
