import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 3, 9, 22, 55, 99, 23, 55 };
        System.out.print("Array Elements Before Sorting --> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nArray Elements After Sorting --> ");
        Sort(arr);
    }

    public static void Sort(int arr[]) {
        int len = arr.length - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}