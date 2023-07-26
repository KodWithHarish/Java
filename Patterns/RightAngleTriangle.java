import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length : ");
		int len = sc.nextInt();
		System.out.println("RightAngle");
		RightAngle(len);
		System.out.println("SpaceRightAngle");
		SpaceRightAngle(len);
		System.out.println("RightAngleReverse");
		RightAngleReverse(len);
		System.out.println("SpaceRightAngleReverse");
		SpaceRightAngleReverse(len);
		sc.close();
	}
//	public static void RightAngle(int len) {
//		for(int i=0; i<=len; i++) {
//			for(int j=0; j<=len; j++) {
//				if(j<=i) {
//					System.out.print("*");
////					System.out.print(i);
////					System.out.print(j);
////					System.out.print(i+" "+j);
////					System.out.print(j+" "+i);
//				}
//			}
//			System.out.println();
//		}
//	}
	
//	OR  
	public static void RightAngle(int len) {
		for(int i=0; i<=len; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void SpaceRightAngle(int len) {
		 for (int i=1; i<=len; i++)   {  
			 for (int j=i; j<len; j++)  {  
		        System.out.print(" ");
		     }  
		     for (int k=1; k<=i; k++)  {  
		    	 System.out.print("*");  
		     }  
		     System.out.println();
		 } 
	}
	
	public static void RightAngleReverse(int len) {
		for(int i=len; i>=0; i--) {
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void SpaceRightAngleReverse(int len) {
		for(int i=0; i<=len; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=len; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
