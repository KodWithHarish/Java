import java.util.Arrays;

public class CampareMathod {
	public static void main(String[] args) {
		int arr1[] = { 10, 20, 30 };
	    int arr2[] = { 30, 20, 10 };
		int result = Arrays.compare(arr1, arr2);
		
	    if(result > 0) {
	       System.out.println("arr1 is greater");
	    } else if (result == 0) {
	       System.out.println("both are same");
	    } else {
	       System.out.println("arr2 is greater");
	    }
	}
}
