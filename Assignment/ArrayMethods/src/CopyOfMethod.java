import java.util.Arrays;

public class CopyOfMethod {
	public static void main(String[] args) {
	      short[] arr = { 10, 20, 30, 40, 50, 60, 70};
	      System.out.print("Orinial Array: ");
	      for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " ");
	      }
	      System.out.println();

//	      short[] copyArr = Arrays.copyOf(arr, arr.length); 
	      short[] copyArr = Arrays.copyOf(arr, 5);
	      System.out.print("Copy Array: ");
	      for (int i = 0; i < copyArr.length; i++) {
	         System.out.print(copyArr[i] + " ");
	      }

	   }
}
