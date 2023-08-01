import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Length of Array --> ");
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Element "+i+" --> ");
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter 2 Indices To Swap --> ");
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		System.out.print("Before Swapping --> ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		Swap(arr, index1, index2);
		sc.close();
	}
	public static void Swap(int arr[],int index1, int index2) {
		if(index1>arr.length || index2>arr.length) {
			System.out.print("\nIndex Out Box");
		}
		else {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			System.out.print("\nAfter Swapping --> ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" "+arr[i]);
			}
		}
	}
}
