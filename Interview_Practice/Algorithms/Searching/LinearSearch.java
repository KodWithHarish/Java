import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 3, 9, 22, 55, 99, 23, 55 };
        System.out.print("Array Elements Are --> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter A Value To Find Its Position --> ");
        int target = sc.nextInt();
        int loc = Search(arr, target);
        System.out.println(loc == -1 ? "Element Not Found" : "Element Found At Index -- > " + loc);
        sc.close();
    }

    public static int Search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
