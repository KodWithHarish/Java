import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Row Length --> ");
		int row = sc.nextInt();
		int[][] arr = new int[row][];
//		create ragged array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter The Length Of Row "+(i+1)+" : ");
			arr[i]=new int[sc.nextInt()];
		}
//		insert into it
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter "+(i+1)+" Row Elements --> ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Jagged(arr);
		sc.close();
	}
	public static void Jagged(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+" Row Elements --> ");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
