import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Len --> ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		System.out.print("Enter "+len+" Elements --> ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}
	public static void Sort(int arr[]) {
		int min,pos,temp;
		for (int i = 0; i < arr.length-2; i++) {
			min=arr[i]; 
			pos=i; 
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
//			swap
			temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}
}
