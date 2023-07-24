import java.util.Scanner;

public class NPalindomeNumbers {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		System.out.print("Total Palindrome Numbers From 1 To " + range + " Are : " );
		for(int i=0;i<range;i++) {
			int res = CheckPalindrom(i);
			if(res!=0)
				System.out.print(" "+res);
		}
		sc.close();
	}
	public static int CheckPalindrom(int n) {
		int temp = n,rev=0;
		while(temp>0) {
			rev =rev*10+temp%10;
			temp/=10;
		}
		if(n==rev)
			return rev;
		else
			return 0;
	}	
}
