import java.util.Scanner;

public class SumOfTwoD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter len --> ");
		int len = sc.nextInt();
		int[][] arr1 = new int[len][len];
		System.out.print("Enter "+(len*len)+" Elements Of 1st Array --> ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int[][] arr2 = new int[len][len];
		System.out.print("Enter "+(len*len)+" Elements Of 2nd Array --> ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		Sum(arr1, arr2);
		sc.close();
	}
	public static void Sum(int arr1[][],int arr2[][]) {
		int len = arr1.length;
		int[][] res = new int[len][len]; 
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Sum Of Arr1 and Arr2 is --> ");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
