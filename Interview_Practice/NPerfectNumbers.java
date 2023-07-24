import java.util.Scanner;

public class NPerfectNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		System.out.print("Total Perfect Numbers From 1 To " + range + " Are : ");
		for(int i=0;i<range;i++) {
			int res = PerfectNumber(i);
			if(res!=0) {
				System.out.print(" " + res);
			}
		}
		sc.close();
	}
	public static int PerfectNumber(int range) {
		int sum = 0;
//		System.out.print("Factors Of "+range+" Are : ");
		for(int i=1;i<range;i++) {
			if(range%i==0) {
//				System.out.print(" "+i);
				sum+=i;
			}
		}
//		System.out.println("\nSum Of Factors of " + range + " Is --> " + sum);
//		System.out.println((sum==range)?range + " Perfect Number":range + " Not Perfect Number");
		if(sum==range)
			return sum;
		else
			return 0;
	}

}

