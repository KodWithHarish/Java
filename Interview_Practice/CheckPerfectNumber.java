import java.util.Scanner;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		PerfectNumber(range);
		sc.close();
	}
	public static void PerfectNumber(int range) {
		int sum = 0;
//		System.out.print("Factors Of "+range+" Are : ");
		for(int i=1;i<range;i++) {
			if(range%i==0) {
//				System.out.print(" "+i);
				sum+=i;
			}
		}
//		System.out.println("\nSum Of Factors of " + range + " Is --> " + sum);
		System.out.println((sum==range)?range + " Is --> Perfect Number":range + " Is --> Not Perfect Number");
		
	}

}

