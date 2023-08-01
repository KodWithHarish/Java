import java.util.Scanner;

public class PositiveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Length of Array --> ");
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Element "+i+" --> ");
			arr[i]=sc.nextInt();
		}
		PostiveElements(arr);
		sc.close();
	}
	public static void PostiveElements(int arr[]) {
		System.out.print("\nPostive Elements From Array Are --> ");
		for (int i : arr) {
			if(arr[i]>0) {
				System.out.print(" "+arr[i]);
			}
		}
	}

}
