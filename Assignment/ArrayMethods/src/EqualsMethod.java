import java.util.Arrays;

public class EqualsMethod {
	public static void main(String[] args) {
	      int arr1[] = { 10, 20, 30 };
	      int arr2[] = { 30, 20, 10 };
	      int arr3[] = { 10, 20, 30 };

	      // comparing arr1 and arr2
	      boolean retval = Arrays.equals(arr1, arr2);
	      System.out.println("arr1 and arr2 equal: " + retval);

	      // comparing arr1 and arr3
	      boolean retval2 = Arrays.equals(arr1, arr3);
	      System.out.println("arr1 and arr3 equal: " + retval2);
	   }
}
