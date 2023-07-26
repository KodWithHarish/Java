import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int len = sc.nextInt();
		System.out.println("RightPyramid");
		RightPyramid(len);
		System.out.println("LeftPyramid");
		LeftPyramid(len);
		sc.close();
	}
	public static void RightPyramid(int len) {
		for(int i=0; i<len; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=len; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void LeftPyramid(int len) {
		for (int i=0; i<len; i++)   {  
			 for (int j=i; j<len; j++)  {  
		        System.out.print(" ");
		     }  
		     for (int k=0; k<=i; k++)  {  
		    	 System.out.print("*");  
		     }  
		     System.out.println();
		} 
		for(int i=0; i<=len; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=len; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
