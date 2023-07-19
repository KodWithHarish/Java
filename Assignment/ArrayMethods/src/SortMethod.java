import java.util.Arrays;

public class SortMethod {
	public static void main(String[] args) {
	      
	      int arr[] = { 10, 50, 30, 20, 150, 200, 10, 70 };
	      System.out.print("Original Array: ");
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      
	      System.out.println();
	     
	      Arrays.sort(arr);
	      System.out.print("Sorted Array: ");
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
}
